package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class AuthzDomainChainKey
 implements Identifier<AuthzDomainChain> {
    private static final long serialVersionUID = -6032038824293019665L;
    private final java.lang.Long _priority;


    public AuthzDomainChainKey(java.lang.Long _priority) {
    
    
        this._priority = _priority;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public AuthzDomainChainKey(AuthzDomainChainKey source) {
        this._priority = source._priority;
    }


    public java.lang.Long getPriority() {
        return _priority;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_priority == null) ? 0 : _priority.hashCode());
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
        AuthzDomainChainKey other = (AuthzDomainChainKey) obj;
        if (_priority == null) {
            if (other._priority != null) {
                return false;
            }
        } else if(!_priority.equals(other._priority)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.domain.authorization.domains.AuthzDomainChainKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_priority != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_priority=");
            builder.append(_priority);
         }
        return builder.append(']').toString();
    }



}

