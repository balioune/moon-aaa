package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication;
import java.util.Collections;
import java.util.Objects;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User
 *
 */
public class UserBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User> {

    private java.lang.String _description;
    private java.lang.String _domainid;
    private java.lang.String _email;
    private UserKey _key;
    private java.lang.String _name;
    private java.lang.String _password;
    private java.lang.String _salt;
    private java.lang.String _userid;
    private java.lang.Boolean _enabled;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> augmentation = Collections.emptyMap();

    public UserBuilder() {
    }

    public UserBuilder(User base) {
        if (base.getKey() == null) {
            this._key = new UserKey(
                base.getUserid()
            );
            this._userid = base.getUserid();
        } else {
            this._key = base.getKey();
            this._userid = _key.getUserid();
        }
        this._description = base.getDescription();
        this._domainid = base.getDomainid();
        this._email = base.getEmail();
        this._name = base.getName();
        this._password = base.getPassword();
        this._salt = base.getSalt();
        this._enabled = base.isEnabled();
        if (base instanceof UserImpl) {
            UserImpl impl = (UserImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getDescription() {
        return _description;
    }
    
    public java.lang.String getDomainid() {
        return _domainid;
    }
    
    public java.lang.String getEmail() {
        return _email;
    }
    
    public UserKey getKey() {
        return _key;
    }
    
    public java.lang.String getName() {
        return _name;
    }
    
    public java.lang.String getPassword() {
        return _password;
    }
    
    public java.lang.String getSalt() {
        return _salt;
    }
    
    public java.lang.String getUserid() {
        return _userid;
    }
    
    public java.lang.Boolean isEnabled() {
        return _enabled;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public UserBuilder setDescription(final java.lang.String value) {
        this._description = value;
        return this;
    }
    
     
    public UserBuilder setDomainid(final java.lang.String value) {
        this._domainid = value;
        return this;
    }
    
     
    public UserBuilder setEmail(final java.lang.String value) {
        this._email = value;
        return this;
    }
    
     
    public UserBuilder setKey(final UserKey value) {
        this._key = value;
        return this;
    }
    
     
    public UserBuilder setName(final java.lang.String value) {
        this._name = value;
        return this;
    }
    
     
    public UserBuilder setPassword(final java.lang.String value) {
        this._password = value;
        return this;
    }
    
     
    public UserBuilder setSalt(final java.lang.String value) {
        this._salt = value;
        return this;
    }
    
     
    public UserBuilder setUserid(final java.lang.String value) {
        this._userid = value;
        return this;
    }
    
     
    public UserBuilder setEnabled(final java.lang.Boolean value) {
        this._enabled = value;
        return this;
    }
    
    public UserBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public UserBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public User build() {
        return new UserImpl(this);
    }

    private static final class UserImpl implements User {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User.class;
        }

        private final java.lang.String _description;
        private final java.lang.String _domainid;
        private final java.lang.String _email;
        private final UserKey _key;
        private final java.lang.String _name;
        private final java.lang.String _password;
        private final java.lang.String _salt;
        private final java.lang.String _userid;
        private final java.lang.Boolean _enabled;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> augmentation = Collections.emptyMap();

        private UserImpl(UserBuilder base) {
            if (base.getKey() == null) {
                this._key = new UserKey(
                    base.getUserid()
                );
                this._userid = base.getUserid();
            } else {
                this._key = base.getKey();
                this._userid = _key.getUserid();
            }
            this._description = base.getDescription();
            this._domainid = base.getDomainid();
            this._email = base.getEmail();
            this._name = base.getName();
            this._password = base.getPassword();
            this._salt = base.getSalt();
            this._enabled = base.isEnabled();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.String getDescription() {
            return _description;
        }
        
        @Override
        public java.lang.String getDomainid() {
            return _domainid;
        }
        
        @Override
        public java.lang.String getEmail() {
            return _email;
        }
        
        @Override
        public UserKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.String getName() {
            return _name;
        }
        
        @Override
        public java.lang.String getPassword() {
            return _password;
        }
        
        @Override
        public java.lang.String getSalt() {
            return _salt;
        }
        
        @Override
        public java.lang.String getUserid() {
            return _userid;
        }
        
        @Override
        public java.lang.Boolean isEnabled() {
            return _enabled;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_description);
            result = prime * result + Objects.hashCode(_domainid);
            result = prime * result + Objects.hashCode(_email);
            result = prime * result + Objects.hashCode(_key);
            result = prime * result + Objects.hashCode(_name);
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_salt);
            result = prime * result + Objects.hashCode(_userid);
            result = prime * result + Objects.hashCode(_enabled);
            result = prime * result + Objects.hashCode(augmentation);
        
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
            if (!org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User other = (org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User)obj;
            if (!Objects.equals(_description, other.getDescription())) {
                return false;
            }
            if (!Objects.equals(_domainid, other.getDomainid())) {
                return false;
            }
            if (!Objects.equals(_email, other.getEmail())) {
                return false;
            }
            if (!Objects.equals(_key, other.getKey())) {
                return false;
            }
            if (!Objects.equals(_name, other.getName())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_salt, other.getSalt())) {
                return false;
            }
            if (!Objects.equals(_userid, other.getUserid())) {
                return false;
            }
            if (!Objects.equals(_enabled, other.isEnabled())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UserImpl otherImpl = (UserImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.User>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("User [");
            boolean first = true;
        
            if (_description != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_description=");
                builder.append(_description);
             }
            if (_domainid != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domainid=");
                builder.append(_domainid);
             }
            if (_email != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_email=");
                builder.append(_email);
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
            if (_name != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_name=");
                builder.append(_name);
             }
            if (_password != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_password=");
                builder.append(_password);
             }
            if (_salt != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_salt=");
                builder.append(_salt);
             }
            if (_userid != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_userid=");
                builder.append(_userid);
             }
            if (_enabled != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_enabled=");
                builder.append(_enabled);
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
