package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import java.util.Collections;
import java.util.Map;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput
 *
 */
public class ReqAuthorizationInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput> {

    private ActionType _action;
    private DomainType _domainName;
    private ResourceType _resource;
    private RoleType _role;
    private ServiceType _service;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> augmentation = Collections.emptyMap();

    public ReqAuthorizationInputBuilder() {
    }

    public ReqAuthorizationInputBuilder(ReqAuthorizationInput base) {
        this._action = base.getAction();
        this._domainName = base.getDomainName();
        this._resource = base.getResource();
        this._role = base.getRole();
        this._service = base.getService();
        if (base instanceof ReqAuthorizationInputImpl) {
            ReqAuthorizationInputImpl impl = (ReqAuthorizationInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public ActionType getAction() {
        return _action;
    }
    
    public DomainType getDomainName() {
        return _domainName;
    }
    
    public ResourceType getResource() {
        return _resource;
    }
    
    public RoleType getRole() {
        return _role;
    }
    
    public ServiceType getService() {
        return _service;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

    public ReqAuthorizationInputBuilder setAction(ActionType value) {
        this._action = value;
        return this;
    }
    
    public ReqAuthorizationInputBuilder setDomainName(DomainType value) {
        if (value != null) {
        }
        this._domainName = value;
        return this;
    }
    
    public ReqAuthorizationInputBuilder setResource(ResourceType value) {
        if (value != null) {
        }
        this._resource = value;
        return this;
    }
    
    public ReqAuthorizationInputBuilder setRole(RoleType value) {
        if (value != null) {
        }
        this._role = value;
        return this;
    }
    
    public ReqAuthorizationInputBuilder setService(ServiceType value) {
        if (value != null) {
        }
        this._service = value;
        return this;
    }
    
    public ReqAuthorizationInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ReqAuthorizationInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public ReqAuthorizationInput build() {
        return new ReqAuthorizationInputImpl(this);
    }

    private static final class ReqAuthorizationInputImpl implements ReqAuthorizationInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput.class;
        }

        private final ActionType _action;
        private final DomainType _domainName;
        private final ResourceType _resource;
        private final RoleType _role;
        private final ServiceType _service;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> augmentation = Collections.emptyMap();

        private ReqAuthorizationInputImpl(ReqAuthorizationInputBuilder base) {
            this._action = base.getAction();
            this._domainName = base.getDomainName();
            this._resource = base.getResource();
            this._role = base.getRole();
            this._service = base.getService();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public ActionType getAction() {
            return _action;
        }
        
        @Override
        public DomainType getDomainName() {
            return _domainName;
        }
        
        @Override
        public ResourceType getResource() {
            return _resource;
        }
        
        @Override
        public RoleType getRole() {
            return _role;
        }
        
        @Override
        public ServiceType getService() {
            return _service;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + ((_action == null) ? 0 : _action.hashCode());
            result = prime * result + ((_domainName == null) ? 0 : _domainName.hashCode());
            result = prime * result + ((_resource == null) ? 0 : _resource.hashCode());
            result = prime * result + ((_role == null) ? 0 : _role.hashCode());
            result = prime * result + ((_service == null) ? 0 : _service.hashCode());
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
            if (!org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput other = (org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput)obj;
            if (_action == null) {
                if (other.getAction() != null) {
                    return false;
                }
            } else if(!_action.equals(other.getAction())) {
                return false;
            }
            if (_domainName == null) {
                if (other.getDomainName() != null) {
                    return false;
                }
            } else if(!_domainName.equals(other.getDomainName())) {
                return false;
            }
            if (_resource == null) {
                if (other.getResource() != null) {
                    return false;
                }
            } else if(!_resource.equals(other.getResource())) {
                return false;
            }
            if (_role == null) {
                if (other.getRole() != null) {
                    return false;
                }
            } else if(!_role.equals(other.getRole())) {
                return false;
            }
            if (_service == null) {
                if (other.getService() != null) {
                    return false;
                }
            } else if(!_service.equals(other.getService())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ReqAuthorizationInputImpl otherImpl = (ReqAuthorizationInputImpl) obj;
                if (augmentation == null) {
                    if (otherImpl.augmentation != null) {
                        return false;
                    }
                } else if(!augmentation.equals(otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ReqAuthorizationInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ReqAuthorizationInput [");
            boolean first = true;
        
            if (_action != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_action=");
                builder.append(_action);
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
            if (_resource != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_resource=");
                builder.append(_resource);
             }
            if (_role != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_role=");
                builder.append(_role);
             }
            if (_service != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_service=");
                builder.append(_service);
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
