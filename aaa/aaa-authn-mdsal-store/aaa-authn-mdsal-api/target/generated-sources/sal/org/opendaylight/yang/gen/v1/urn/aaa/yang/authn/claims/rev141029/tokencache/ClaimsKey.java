package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class ClaimsKey
 implements Identifier<Claims> {
    private static final long serialVersionUID = -1803443019262716655L;
    private final java.lang.String _token;


    public ClaimsKey(java.lang.String _token) {
    
    
        this._token = _token;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ClaimsKey(ClaimsKey source) {
        this._token = source._token;
    }


    public java.lang.String getToken() {
        return _token;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_token == null) ? 0 : _token.hashCode());
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
        ClaimsKey other = (ClaimsKey) obj;
        if (_token == null) {
            if (other._token != null) {
                return false;
            }
        } else if(!_token.equals(other._token)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.tokencache.ClaimsKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_token != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_token=");
            builder.append(_token);
         }
        return builder.append(']').toString();
    }



}

