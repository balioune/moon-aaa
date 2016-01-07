package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.Domains;
import java.util.List;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz
 *
 */
public class AdditionalDomainAuthzBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz> {

    private List<Domains> _domains;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> augmentation = Collections.emptyMap();

    public AdditionalDomainAuthzBuilder() {
    }

    public AdditionalDomainAuthzBuilder(AdditionalDomainAuthz base) {
        this._domains = base.getDomains();
        if (base instanceof AdditionalDomainAuthzImpl) {
            AdditionalDomainAuthzImpl impl = (AdditionalDomainAuthzImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<Domains> getDomains() {
        return _domains;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public AdditionalDomainAuthzBuilder setDomains(List<Domains> value) {
        this._domains = value;
        return this;
    }
    
    public AdditionalDomainAuthzBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AdditionalDomainAuthzBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AdditionalDomainAuthz build() {
        return new AdditionalDomainAuthzImpl(this);
    }

    private static final class AdditionalDomainAuthzImpl implements AdditionalDomainAuthz {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz.class;
        }

        private final List<Domains> _domains;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> augmentation = Collections.emptyMap();

        private AdditionalDomainAuthzImpl(AdditionalDomainAuthzBuilder base) {
            this._domains = base.getDomains();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<Domains> getDomains() {
            return _domains;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_domains == null) ? 0 : _domains.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz other = (org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz)obj;
            if (_domains == null) {
                if (other.getDomains() != null) {
                    return false;
                }
            } else if(!_domains.equals(other.getDomains())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AdditionalDomainAuthzImpl otherImpl = (AdditionalDomainAuthzImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.AdditionalDomainAuthz>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AdditionalDomainAuthz [");
            boolean first = true;
        
            if (_domains != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domains=");
                builder.append(_domains);
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
