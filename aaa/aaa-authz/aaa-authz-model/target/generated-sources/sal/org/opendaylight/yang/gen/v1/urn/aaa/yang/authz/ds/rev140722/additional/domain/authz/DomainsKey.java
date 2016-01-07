package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz;
import org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.DomainType;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class DomainsKey
 implements Identifier<Domains> {
    private static final long serialVersionUID = -2603482794738538633L;
    private final DomainType _domainName;


    public DomainsKey(DomainType _domainName) {
    
    
        this._domainName = _domainName;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DomainsKey(DomainsKey source) {
        this._domainName = source._domainName;
    }


    public DomainType getDomainName() {
        return _domainName;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_domainName == null) ? 0 : _domainName.hashCode());
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
        DomainsKey other = (DomainsKey) obj;
        if (_domainName == null) {
            if (other._domainName != null) {
                return false;
            }
        } else if(!_domainName.equals(other._domainName)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.additional.domain.authz.DomainsKey.class.getSimpleName()).append(" [");
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
        return builder.append(']').toString();
    }



}

