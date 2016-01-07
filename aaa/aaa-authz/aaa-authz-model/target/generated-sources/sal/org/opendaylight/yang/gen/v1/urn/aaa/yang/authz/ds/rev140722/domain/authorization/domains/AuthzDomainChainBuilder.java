package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains;
import com.google.common.collect.Range;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainType;
import java.util.List;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain
 *
 */
public class AuthzDomainChainBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain> {

    private DomainType _domainName;
    private AuthzDomainChainKey _key;
    private java.lang.Long _priority;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> augmentation = Collections.emptyMap();

    public AuthzDomainChainBuilder() {
    }

    public AuthzDomainChainBuilder(AuthzDomainChain base) {
        if (base.getKey() == null) {
            this._key = new AuthzDomainChainKey(
                base.getPriority()
            );
            this._priority = base.getPriority();
        } else {
            this._key = base.getKey();
            this._priority = _key.getPriority();
        }
        this._domainName = base.getDomainName();
        if (base instanceof AuthzDomainChainImpl) {
            AuthzDomainChainImpl impl = (AuthzDomainChainImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DomainType getDomainName() {
        return _domainName;
    }
    
    public AuthzDomainChainKey getKey() {
        return _key;
    }
    
    public java.lang.Long getPriority() {
        return _priority;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public AuthzDomainChainBuilder setDomainName(DomainType value) {
        if (value != null) {
        }
        this._domainName = value;
        return this;
    }
    
    public AuthzDomainChainBuilder setKey(AuthzDomainChainKey value) {
        this._key = value;
        return this;
    }
    
    private static void checkPriorityRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥4294967295]].", value));
    }
    
    public AuthzDomainChainBuilder setPriority(java.lang.Long value) {
        if (value != null) {
            checkPriorityRange(value);
        }
        this._priority = value;
        return this;
    }
    /**
     * @deprecated This method is slated for removal in a future release. See BUG-1485 for details.
     */
    @Deprecated
    public static List<Range<BigInteger>> _priority_range() {
        final List<Range<BigInteger>> ret = new java.util.ArrayList<>(1);
        ret.add(Range.closed(BigInteger.ZERO, BigInteger.valueOf(4294967295L)));
        return ret;
    }
    
    public AuthzDomainChainBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AuthzDomainChainBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AuthzDomainChain build() {
        return new AuthzDomainChainImpl(this);
    }

    private static final class AuthzDomainChainImpl implements AuthzDomainChain {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain.class;
        }

        private final DomainType _domainName;
        private final AuthzDomainChainKey _key;
        private final java.lang.Long _priority;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> augmentation = Collections.emptyMap();

        private AuthzDomainChainImpl(AuthzDomainChainBuilder base) {
            if (base.getKey() == null) {
                this._key = new AuthzDomainChainKey(
                    base.getPriority()
                );
                this._priority = base.getPriority();
            } else {
                this._key = base.getKey();
                this._priority = _key.getPriority();
            }
            this._domainName = base.getDomainName();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public DomainType getDomainName() {
            return _domainName;
        }
        
        @Override
        public AuthzDomainChainKey getKey() {
            return _key;
        }
        
        @Override
        public java.lang.Long getPriority() {
            return _priority;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_domainName == null) ? 0 : _domainName.hashCode());
            result = prime * result + ((_key == null) ? 0 : _key.hashCode());
            result = prime * result + ((_priority == null) ? 0 : _priority.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain other = (org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain)obj;
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
            if (_priority == null) {
                if (other.getPriority() != null) {
                    return false;
                }
            } else if(!_priority.equals(other.getPriority())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AuthzDomainChainImpl otherImpl = (AuthzDomainChainImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChain>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AuthzDomainChain [");
            boolean first = true;
        
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
            if (_priority != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_priority=");
                builder.append(_priority);
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
