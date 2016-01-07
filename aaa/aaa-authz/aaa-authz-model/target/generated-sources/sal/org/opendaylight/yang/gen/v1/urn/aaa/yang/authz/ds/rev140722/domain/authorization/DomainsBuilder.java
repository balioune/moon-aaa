package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.authorization.grp.Policies;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainType;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains
 *
 */
public class DomainsBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains> {

    private List<AuthzDomainChain> _authzDomainChain;
    private DomainType _domainName;
    private DomainsKey _key;
    private List<Policies> _policies;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> augmentation = Collections.emptyMap();

    public DomainsBuilder() {
    }
    public DomainsBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp arg) {
        this._policies = arg.getPolicies();
    }

    public DomainsBuilder(Domains base) {
        if (base.getKey() == null) {
            this._key = new DomainsKey(
                base.getDomainName()
            );
            this._domainName = base.getDomainName();
        } else {
            this._key = base.getKey();
            this._domainName = _key.getDomainName();
        }
        this._authzDomainChain = base.getAuthzDomainChain();
        this._policies = base.getPolicies();
        if (base instanceof DomainsImpl) {
            DomainsImpl impl = (DomainsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     *Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp) {
            this._policies = ((org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp)arg).getPolicies();
            isValidArg = true;
        }
        if (!isValidArg) {
            throw new IllegalArgumentException(
              "expected one of: [org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AuthorizationGrp] \n" +
              "but was: " + arg
            );
        }
    }

    public List<AuthzDomainChain> getAuthzDomainChain() {
        return _authzDomainChain;
    }
    
    public DomainType getDomainName() {
        return _domainName;
    }
    
    public DomainsKey getKey() {
        return _key;
    }
    
    public List<Policies> getPolicies() {
        return _policies;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public DomainsBuilder setAuthzDomainChain(List<AuthzDomainChain> value) {
        this._authzDomainChain = value;
        return this;
    }
    
    public DomainsBuilder setDomainName(DomainType value) {
        if (value != null) {
        }
        this._domainName = value;
        return this;
    }
    
    public DomainsBuilder setKey(DomainsKey value) {
        this._key = value;
        return this;
    }
    
    public DomainsBuilder setPolicies(List<Policies> value) {
        this._policies = value;
        return this;
    }
    
    public DomainsBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public DomainsBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public Domains build() {
        return new DomainsImpl(this);
    }

    private static final class DomainsImpl implements Domains {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains.class;
        }

        private final List<AuthzDomainChain> _authzDomainChain;
        private final DomainType _domainName;
        private final DomainsKey _key;
        private final List<Policies> _policies;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> augmentation = Collections.emptyMap();

        private DomainsImpl(DomainsBuilder base) {
            if (base.getKey() == null) {
                this._key = new DomainsKey(
                    base.getDomainName()
                );
                this._domainName = base.getDomainName();
            } else {
                this._key = base.getKey();
                this._domainName = _key.getDomainName();
            }
            this._authzDomainChain = base.getAuthzDomainChain();
            this._policies = base.getPolicies();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<AuthzDomainChain> getAuthzDomainChain() {
            return _authzDomainChain;
        }
        
        @Override
        public DomainType getDomainName() {
            return _domainName;
        }
        
        @Override
        public DomainsKey getKey() {
            return _key;
        }
        
        @Override
        public List<Policies> getPolicies() {
            return _policies;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_authzDomainChain == null) ? 0 : _authzDomainChain.hashCode());
            result = prime * result + ((_domainName == null) ? 0 : _domainName.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_policies == null) ? 0 : _policies.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains other = (org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains)obj;
            if (_authzDomainChain == null) {
                if (other.getAuthzDomainChain() != null) {
                    return false;
                }
            } else if(!_authzDomainChain.equals(other.getAuthzDomainChain())) {
                return false;
            }
            if (_domainName == null) {
                if (other.getDomainName() != null) {
                    return false;
                }
            } else if(!_domainName.equals(other.getDomainName())) {
                return false;
            }
            if (_key == null) {
                if (other.getKey() != null) {
                    return false;
                }
            } else if(!_key.equals(other.getKey())) {
                return false;
            }
            if (_policies == null) {
                if (other.getPolicies() != null) {
                    return false;
                }
            } else if(!_policies.equals(other.getPolicies())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                DomainsImpl otherImpl = (DomainsImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.Domains>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("Domains [");
            boolean first = true;
        
            if (_authzDomainChain != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_authzDomainChain=");
                builder.append(_authzDomainChain);
             }
            if (_domainName != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domainName=");
                builder.append(_domainName);
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
            if (_policies != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_policies=");
                builder.append(_policies);
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