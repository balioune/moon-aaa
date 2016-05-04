package org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration;
import java.util.Collections;
import java.util.Objects;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store} instances.
 *
 * @see org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store
 *
 */
public class AaaH2StoreBuilder implements Builder <org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store> {


    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> augmentation = Collections.emptyMap();

    public AaaH2StoreBuilder() {
    }

    public AaaH2StoreBuilder(AaaH2Store base) {
        if (base instanceof AaaH2StoreImpl) {
            AaaH2StoreImpl impl = (AaaH2StoreImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    
    public AaaH2StoreBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AaaH2StoreBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AaaH2Store build() {
        return new AaaH2StoreImpl(this);
    }

    private static final class AaaH2StoreImpl implements AaaH2Store {

        public java.lang.Class<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store.class;
        }


        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> augmentation = Collections.emptyMap();

        private AaaH2StoreImpl(AaaH2StoreBuilder base) {
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            if (!org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store other = (org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AaaH2StoreImpl otherImpl = (AaaH2StoreImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.h2.store.rev151128.modules.module.configuration.AaaH2Store>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AaaH2Store [");
            boolean first = true;
        
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
