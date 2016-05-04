package org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration;
import org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DomBroker;
import java.util.Collections;
import java.util.Objects;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.aaa.authn.mdsal.store.DataBroker;
import org.opendaylight.yangtools.concepts.Builder;
import java.math.BigInteger;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore} instances.
 *
 * @see org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore
 *
 */
public class AaaAuthnMdsalStoreBuilder implements Builder <org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore> {

    private DataBroker _dataBroker;
    private DomBroker _domBroker;
    private java.lang.String _password;
    private BigInteger _timeToLive;
    private java.lang.Integer _timeToWait;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> augmentation = Collections.emptyMap();

    public AaaAuthnMdsalStoreBuilder() {
    }

    public AaaAuthnMdsalStoreBuilder(AaaAuthnMdsalStore base) {
        this._dataBroker = base.getDataBroker();
        this._domBroker = base.getDomBroker();
        this._password = base.getPassword();
        this._timeToLive = base.getTimeToLive();
        this._timeToWait = base.getTimeToWait();
        if (base instanceof AaaAuthnMdsalStoreImpl) {
            AaaAuthnMdsalStoreImpl impl = (AaaAuthnMdsalStoreImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public DataBroker getDataBroker() {
        return _dataBroker;
    }
    
    public DomBroker getDomBroker() {
        return _domBroker;
    }
    
    public java.lang.String getPassword() {
        return _password;
    }
    
    public BigInteger getTimeToLive() {
        return _timeToLive;
    }
    
    public java.lang.Integer getTimeToWait() {
        return _timeToWait;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AaaAuthnMdsalStoreBuilder setDataBroker(final DataBroker value) {
        this._dataBroker = value;
        return this;
    }
    
     
    public AaaAuthnMdsalStoreBuilder setDomBroker(final DomBroker value) {
        this._domBroker = value;
        return this;
    }
    
     
    public AaaAuthnMdsalStoreBuilder setPassword(final java.lang.String value) {
        this._password = value;
        return this;
    }
    
     
     private static final com.google.common.collect.Range<java.math.BigInteger>[] CHECKTIMETOLIVERANGE_RANGES;
     static {
         @SuppressWarnings("unchecked")
         final com.google.common.collect.Range<java.math.BigInteger>[] a = (com.google.common.collect.Range<java.math.BigInteger>[]) java.lang.reflect.Array.newInstance(com.google.common.collect.Range.class, 1);
         a[0] = com.google.common.collect.Range.closed(java.math.BigInteger.ZERO, new java.math.BigInteger("18446744073709551615"));
         CHECKTIMETOLIVERANGE_RANGES = a;
     }
     private static void checkTimeToLiveRange(final java.math.BigInteger value) {
         for (com.google.common.collect.Range<java.math.BigInteger> r : CHECKTIMETOLIVERANGE_RANGES) {
             if (r.contains(value)) {
                 return;
             }
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: %s.", value, java.util.Arrays.asList(CHECKTIMETOLIVERANGE_RANGES)));
     }
    
    public AaaAuthnMdsalStoreBuilder setTimeToLive(final BigInteger value) {
    if (value != null) {
        checkTimeToLiveRange(value);
    }
        this._timeToLive = value;
        return this;
    }
    
     
     private static void checkTimeToWaitRange(final int value) {
         if (value >= 0 && value <= 65535) {
             return;
         }
         throw new IllegalArgumentException(String.format("Invalid range: %s, expected: [[0‥65535]].", value));
     }
    
    public AaaAuthnMdsalStoreBuilder setTimeToWait(final java.lang.Integer value) {
    if (value != null) {
        checkTimeToWaitRange(value);
    }
        this._timeToWait = value;
        return this;
    }
    
    public AaaAuthnMdsalStoreBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AaaAuthnMdsalStoreBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AaaAuthnMdsalStore build() {
        return new AaaAuthnMdsalStoreImpl(this);
    }

    private static final class AaaAuthnMdsalStoreImpl implements AaaAuthnMdsalStore {

        public java.lang.Class<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore.class;
        }

        private final DataBroker _dataBroker;
        private final DomBroker _domBroker;
        private final java.lang.String _password;
        private final BigInteger _timeToLive;
        private final java.lang.Integer _timeToWait;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> augmentation = Collections.emptyMap();

        private AaaAuthnMdsalStoreImpl(AaaAuthnMdsalStoreBuilder base) {
            this._dataBroker = base.getDataBroker();
            this._domBroker = base.getDomBroker();
            this._password = base.getPassword();
            this._timeToLive = base.getTimeToLive();
            this._timeToWait = base.getTimeToWait();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public DataBroker getDataBroker() {
            return _dataBroker;
        }
        
        @Override
        public DomBroker getDomBroker() {
            return _domBroker;
        }
        
        @Override
        public java.lang.String getPassword() {
            return _password;
        }
        
        @Override
        public BigInteger getTimeToLive() {
            return _timeToLive;
        }
        
        @Override
        public java.lang.Integer getTimeToWait() {
            return _timeToWait;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_dataBroker);
            result = prime * result + Objects.hashCode(_domBroker);
            result = prime * result + Objects.hashCode(_password);
            result = prime * result + Objects.hashCode(_timeToLive);
            result = prime * result + Objects.hashCode(_timeToWait);
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
            if (!org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore other = (org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore)obj;
            if (!Objects.equals(_dataBroker, other.getDataBroker())) {
                return false;
            }
            if (!Objects.equals(_domBroker, other.getDomBroker())) {
                return false;
            }
            if (!Objects.equals(_password, other.getPassword())) {
                return false;
            }
            if (!Objects.equals(_timeToLive, other.getTimeToLive())) {
                return false;
            }
            if (!Objects.equals(_timeToWait, other.getTimeToWait())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AaaAuthnMdsalStoreImpl otherImpl = (AaaAuthnMdsalStoreImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>>, Augmentation<org.opendaylight.yang.gen.v1.config.aaa.authn.mdsal.store.rev141031.modules.module.configuration.AaaAuthnMdsalStore>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AaaAuthnMdsalStore [");
            boolean first = true;
        
            if (_dataBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_dataBroker=");
                builder.append(_dataBroker);
             }
            if (_domBroker != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_domBroker=");
                builder.append(_domBroker);
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
            if (_timeToLive != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_timeToLive=");
                builder.append(_timeToLive);
             }
            if (_timeToWait != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_timeToWait=");
                builder.append(_timeToWait);
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
