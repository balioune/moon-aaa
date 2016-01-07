/*
 * Copyright (c) 2014-2015 Hewlett-Packard Development Company, L.P. and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.aaa;

import static org.opendaylight.aaa.EqualUtil.areEqual;
import static org.opendaylight.aaa.HashCodeUtil.hash;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableSet;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import org.json.JSONObject;
import org.opendaylight.aaa.api.Claim;

/**
 * Builder for a {@link Claim}. The userId, user, and roles information is mandatory.
 *
 * @author liemmn
 *
 */
public class ClaimBuilder {
    private String userId = "";
    private String user = "";
    private Set<String> roles = new LinkedHashSet<>();
    private String clientId = "";
    private String domain = "";
    
    
	//test moon proxy
    MoonProxy moon = new MoonProxy();
    
    public ClaimBuilder() {
    }

    public ClaimBuilder(Claim claim) {
        clientId = claim.clientId();
        userId = claim.userId();
        user = claim.user();
        domain = claim.domain();
        roles.addAll(claim.roles());
    }

    public ClaimBuilder setClientId(String clientId) {
        this.clientId = Strings.nullToEmpty(clientId).trim();
        return this;
    }

    public ClaimBuilder setUserId(String userId) {
        this.userId = Strings.nullToEmpty(userId).trim();
        return this;
    }

    public ClaimBuilder setUser(String userName) {
        user = Strings.nullToEmpty(userName).trim();
        return this;
    }

    public ClaimBuilder setDomain(String domain) {
        this.domain = Strings.nullToEmpty(domain).trim();
        return this;
    }

    public ClaimBuilder addRoles(Set<String> roles) {
        for (String role : roles) {
            addRole(role);
        }
        return this;
    }

    public ClaimBuilder addRole(String role) {
        roles.add(Strings.nullToEmpty(role).trim());
        return this;
    }

    
    public Claim build() {
    	
    		return new ImmutableClaim(this);
    
    }
    
    public Claim build(String username, String password, String domain) {
    	
    	MoonClaim claim = null;
    	String token;
    	String userID = null;
    	//role list
    	
    	
    	JSONObject response = this.moon.keystoneAunthenticate(username,password,domain);
    	
    	if (response.getJSONObject("access").getJSONObject("token").getString("id")!=null){
    		
    		token = response.getJSONObject("access").getJSONObject("token").getString("id");
    		userID = response.getJSONObject("access").getJSONObject("user").getString("id");
    		claim = new MoonClaim(this);
    		
    		//set all required attributes 
    		claim.setKeystoneToken(token);
    		claim.setDomain(domain);
    		claim.setUser(username);
    		claim.setUserId(userID);

    		return claim;
    	}

    	System.out.println("ClaimBuilder: Authentication KO in build");
    	
    	return claim;	
    }

    
    protected static class ImmutableClaim implements Claim, Serializable {
        private static final long serialVersionUID = -8115027645190209129L;
        private int hashCode = 0;
        protected String clientId;
        protected String userId;
        protected String user;
        protected String domain;
        protected ImmutableSet<String> roles;

        protected ImmutableClaim(ClaimBuilder base) {
            clientId = base.clientId;
            userId = base.userId;
            user = base.user;
            domain = base.domain;
            roles = ImmutableSet.<String>builder().addAll(base.roles).build();
            
            if (userId.isEmpty() || user.isEmpty() || roles.isEmpty() || roles.contains("")) {
                //throw new IllegalStateException("The Claim is missing one or more of the required fields.");
                System.out.println("The Claim is missing one or more of the required fields.");
            }
            
        }
        @Override
        public String clientId() {
            return clientId;
        }

        @Override
        public String userId() {
            return userId;
        }

        @Override
        public String user() {
            return user;
        }

        @Override
        public String domain() {
            return domain;
        }

        @Override
        public Set<String> roles() {
            return roles;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Claim))
                return false;
            Claim a = (Claim) o;
            return areEqual(roles, a.roles()) && areEqual(domain, a.domain())
                && areEqual(userId, a.userId()) && areEqual(user, a.user())
                && areEqual(clientId, a.clientId());
        }

        @Override
        public int hashCode() {
            if (hashCode == 0) {
                int result = HashCodeUtil.SEED;
                result = hash(result, clientId);
                result = hash(result, userId);
                result = hash(result, user);
                result = hash(result, domain);
                result = hash(result, roles);
                hashCode = result;
            }
            return hashCode;
        }

        @Override
        public String toString() {
            return "clientId:" + clientId + ","
                 + "userId:" + userId + ","
                 + "userName:" + user + ","
                 + "domain:" + domain + ","
                 + "roles:" + roles;
        }
    }
    
    // for moon added by alioune
    
    protected static class MoonClaim implements Claim, Serializable {
        private static final long serialVersionUID = -8115027645190209129L;
        private int hashCode = 0;
        protected String clientId;
        protected String userId;
        protected String user;
        protected String domain;
        protected ImmutableSet<String> roles;
        
        //new attribute
        protected String keystoneToken = "";

        public String getKeystoneToken() {
			return keystoneToken;
		}
		public String getClientId() {
			return clientId;
		}
		public void setClientId(String clientId) {
			this.clientId = clientId;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public String getDomain() {
			return domain;
		}
		public void setDomain(String domain) {
			this.domain = domain;
		}
		public ImmutableSet<String> getRoles() {
			return roles;
		}
		public void setRoles(ImmutableSet<String> roles) {
			this.roles = roles;
		}
		public void setKeystoneToken(String keystoneToken) {
			this.keystoneToken = keystoneToken;
		}
		
		protected MoonClaim() {
			
		}
		
		protected MoonClaim(ClaimBuilder base) {
            clientId = base.clientId;
            userId = base.userId;
            user = base.user;
            domain = base.domain;
            roles = ImmutableSet.<String>builder().addAll(base.roles).build();
            
            if (userId.isEmpty() || user.isEmpty() || roles.isEmpty() || roles.contains("")) {
                //throw new IllegalStateException("The MoonClaim is missing one or more of the required fields.");
            	System.out.println("The MoonClaim is missing one or more of the required fields.");
            }
            
        }
        @Override
        public String clientId() {
            return clientId;
        }

        @Override
        public String userId() {
            return userId;
        }

        @Override
        public String user() {
            return user;
        }

        @Override
        public String domain() {
            return domain;
        }

        @Override
        public Set<String> roles() {
            return roles;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Claim))
                return false;
            Claim a = (Claim) o;
            return areEqual(roles, a.roles()) && areEqual(domain, a.domain())
                && areEqual(userId, a.userId()) && areEqual(user, a.user())
                && areEqual(clientId, a.clientId());
        }

        @Override
        public int hashCode() {
            if (hashCode == 0) {
                int result = HashCodeUtil.SEED;
                result = hash(result, clientId);
                result = hash(result, userId);
                result = hash(result, user);
                result = hash(result, domain);
                result = hash(result, roles);
                hashCode = result;
            }
            return hashCode;
        }

        @Override
        public String toString() {
            return "clientId: " + clientId + ","
                 + "userId: " + userId + ","
                 + "userName: " + user + ","
                 + "domain: " + domain + ","
                 + "roles: " + roles + ","
                 + "KeystoneToken: " + keystoneToken;
        }
    }
}