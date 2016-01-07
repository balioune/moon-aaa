package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class UserTokensKey
 implements Identifier<UserTokens> {
    private static final long serialVersionUID = 2031648354721822466L;
    private final java.lang.String _tokenid;


    public UserTokensKey(java.lang.String _tokenid) {
    
    
        this._tokenid = _tokenid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UserTokensKey(UserTokensKey source) {
        this._tokenid = source._tokenid;
    }


    public java.lang.String getTokenid() {
        return _tokenid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_tokenid == null) ? 0 : _tokenid.hashCode());
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
        UserTokensKey other = (UserTokensKey) obj;
        if (_tokenid == null) {
            if (other._tokenid != null) {
                return false;
            }
        } else if(!_tokenid.equals(other._tokenid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.token_list.UserTokensKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_tokenid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_tokenid=");
            builder.append(_tokenid);
         }
        return builder.append(']').toString();
    }



}

