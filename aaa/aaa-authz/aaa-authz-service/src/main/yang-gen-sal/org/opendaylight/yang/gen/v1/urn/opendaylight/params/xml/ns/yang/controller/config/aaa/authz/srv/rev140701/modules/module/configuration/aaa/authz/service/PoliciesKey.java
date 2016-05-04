package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration.aaa.authz.service;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.ServiceType;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class PoliciesKey
 implements Identifier<Policies> {
    private static final long serialVersionUID = -2326912862905866740L;
    private final ServiceType _service;


    public PoliciesKey(ServiceType _service) {
    
    
        this._service = _service;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PoliciesKey(PoliciesKey source) {
        this._service = source._service;
    }


    public ServiceType getService() {
        return _service;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_service);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PoliciesKey other = (PoliciesKey) obj;
        if (!Objects.equals(_service, other._service)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.aaa.authz.srv.rev140701.modules.module.configuration.aaa.authz.service.PoliciesKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_service != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_service=");
            builder.append(_service);
         }
        return builder.append(']').toString();
    }
}

