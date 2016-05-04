package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class DomainKey
 implements Identifier<Domain> {
    private static final long serialVersionUID = -8358058056726650212L;
    private final java.lang.String _domainid;


    public DomainKey(java.lang.String _domainid) {
    
    
        this._domainid = _domainid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DomainKey(DomainKey source) {
        this._domainid = source._domainid;
    }


    public java.lang.String getDomainid() {
        return _domainid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_domainid);
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
        DomainKey other = (DomainKey) obj;
        if (!Objects.equals(_domainid, other._domainid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.DomainKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_domainid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_domainid=");
            builder.append(_domainid);
         }
        return builder.append(']').toString();
    }
}

