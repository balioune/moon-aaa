package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class RoleKey
 implements Identifier<Role> {
    private static final long serialVersionUID = -9105048495804441269L;
    private final java.lang.String _roleid;


    public RoleKey(java.lang.String _roleid) {
    
    
        this._roleid = _roleid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RoleKey(RoleKey source) {
        this._roleid = source._roleid;
    }


    public java.lang.String getRoleid() {
        return _roleid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_roleid);
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
        RoleKey other = (RoleKey) obj;
        if (!Objects.equals(_roleid, other._roleid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.RoleKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_roleid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_roleid=");
            builder.append(_roleid);
         }
        return builder.append(']').toString();
    }
}

