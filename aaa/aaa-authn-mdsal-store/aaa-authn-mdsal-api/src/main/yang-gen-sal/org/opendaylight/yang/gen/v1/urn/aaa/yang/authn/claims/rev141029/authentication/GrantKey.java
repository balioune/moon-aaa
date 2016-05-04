package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class GrantKey
 implements Identifier<Grant> {
    private static final long serialVersionUID = -4826781342643014451L;
    private final java.lang.String _grantid;


    public GrantKey(java.lang.String _grantid) {
    
    
        this._grantid = _grantid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public GrantKey(GrantKey source) {
        this._grantid = source._grantid;
    }


    public java.lang.String getGrantid() {
        return _grantid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_grantid);
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
        GrantKey other = (GrantKey) obj;
        if (!Objects.equals(_grantid, other._grantid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.GrantKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_grantid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_grantid=");
            builder.append(_grantid);
         }
        return builder.append(']').toString();
    }
}

