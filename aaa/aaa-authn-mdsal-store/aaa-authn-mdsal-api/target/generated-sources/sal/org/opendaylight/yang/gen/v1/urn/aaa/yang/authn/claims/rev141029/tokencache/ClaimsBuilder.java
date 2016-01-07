package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims
 *
 */
public class ClaimsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims> {

    private java.lang.String _clientId;
    private java.lang.String _domain;
    private ClaimsKey _key;
    private List<java.lang.String> _roles;
    private java.lang.String _token;
    private java.lang.String _user;
    private java.lang.String _userId;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> augmentation = Collections.emptyMap();

    public ClaimsBuilder() {
    }

    public ClaimsBuilder(Claims base) {
        if (base.getKey() == null) {
            this._key = new ClaimsKey(
                base.getToken()
            );
            this._token = base.getToken();
        } else {
            this._key = base.getKey();
            this._token = _key.getToken();
        }
        this._clientId = base.getClientId();
        this._domain = base.getDomain();
        this._roles = base.getRoles();
        this._user = base.getUser();
        this._userId = base.getUserId();
        if (base instanceof ClaimsImpl) {
            ClaimsImpl impl = (ClaimsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getClientId() {
        return _clientId;
    }
    
    public java.lang.String getDomain() {
        return _domain;
    }
    
    public ClaimsKey getKey() {
        return _key;
    }
    
    public List<java.lang.String> getRoles() {
        return _roles;
    }
    
    public java.lang.String getToken() {
        return _token;
    }
    
    public java.lang.String getUser() {
        return _user;
    }
    
    public java.lang.String getUserId() {
        return _userId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ClaimsBuilder setClientId(java.lang.String value) {
        this._clientId = value;
        return this;
    }
    
    public ClaimsBuilder setDomain(java.lang.String value) {
        this._domain = value;
        return this;
    }
    
    public ClaimsBuilder setKey(ClaimsKey value) {
        this._key = value;
        return this;
    }
    
    public ClaimsBuilder setRoles(List<java.lang.String> value) {
        this._roles = value;
        return this;
    }
    
    public ClaimsBuilder setToken(java.lang.String value) {
        this._token = value;
        return this;
    }
    
    public ClaimsBuilder setUser(java.lang.String value) {
        this._user = value;
        return this;
    }
    
    public ClaimsBuilder setUserId(java.lang.String value) {
        this._userId = value;
        return this;
    }
    
    public ClaimsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ClaimsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Claims build() {
        return new ClaimsImpl(this);
    }

    private static final class ClaimsImpl implements Claims {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims.class;
        }

        private final java.lang.String _clientId;
        private final java.lang.String _domain;
        private final ClaimsKey _key;
        private final List<java.lang.String> _roles;
        private final java.lang.String _token;
        private final java.lang.String _user;
        private final java.lang.String _userId;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> augmentation = Collections.emptyMap();

        private ClaimsImpl(ClaimsBuilder base) {
            if (base.getKey() == null) {
                this._key = new ClaimsKey(
                    base.getToken()
                );
                this._token = base.getToken();
            } else {
                this._key = base.getKey();
                this._token = _key.getToken();
            }
            this._clientId = base.getClientId();
            this._domain = base.getDomain();
            this._roles = base.getRoles();
            this._user = base.getUser();
            this._userId = base.getUserId();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getClientId() {
            return _clientId;
        }
        
        @Override
        public java.lang.String getDomain() {
            return _domain;
        }
        
        @Override
        public ClaimsKey getKey() {
            return _key;
        }
        
        @Override
        public List<java.lang.String> getRoles() {
            return _roles;
        }
        
        @Override
        public java.lang.String getToken() {
            return _token;
        }
        
        @Override
        public java.lang.String getUser() {
            return _user;
        }
        
        @Override
        public java.lang.String getUserId() {
            return _userId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + ((_clientId == null) ? 0 : _clientId.hashCode());
            result = prime * result + ((_domain == null) ? 0 : _domain.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_roles == null) ? 0 : _roles.hashCode());
            result = prime * result + ((_token == null) ? 0 : _token.hashCode());
            result = prime * result + ((_user == null) ? 0 : _user.hashCode());
            result = prime * result + ((_userId == null) ? 0 : _userId.hashCode());
            result = prime * result + ((augmentation == null) ? 0 : augmentation.hashCode());
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims other = (org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims)obj;
            if (_clientId == null) {
                if (other.getClientId() != null) {
                    return false;
                }
            } else if(!_clientId.equals(other.getClientId())) {
                return false;
            }
            if (_domain == null) {
                if (other.getDomain() != null) {
                    return false;
                }
            } else if(!_domain.equals(other.getDomain())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_roles == null) {
                if (other.getRoles() != null) {
                    return false;
                }
            } else if(!_roles.equals(other.getRoles())) {
                return false;
            }
            if (_token == null) {
                if (other.getToken() != null) {
                    return false;
                }
            } else if(!_token.equals(other.getToken())) {
                return false;
            }
            if (_user == null) {
                if (other.getUser() != null) {
                    return false;
                }
            } else if(!_user.equals(other.getUser())) {
                return false;
            }
            if (_userId == null) {
                if (other.getUserId() != null) {
                    return false;
                }
            } else if(!_userId.equals(other.getUserId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ClaimsImpl otherImpl = (ClaimsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.Claims>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Claims [");
            boolean first = true;
        
            if (_clientId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_clientId=");
                builder.append(_clientId);
             }
            if (_domain != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domain=");
                builder.append(_domain);
             }
            if (_key != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_key=");
                builder.append(_key);
             }
            if (_roles != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_roles=");
                builder.append(_roles);
             }
            if (_token != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_token=");
                builder.append(_token);
             }
            if (_user != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_user=");
                builder.append(_user);
             }
            if (_userId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_userId=");
                builder.append(_userId);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
