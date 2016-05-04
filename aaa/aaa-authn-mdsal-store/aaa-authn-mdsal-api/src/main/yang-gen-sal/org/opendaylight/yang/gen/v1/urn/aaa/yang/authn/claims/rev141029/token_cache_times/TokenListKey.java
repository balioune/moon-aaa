package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class TokenListKey
 implements Identifier<TokenList> {
    private static final long serialVersionUID = 7447594917831756996L;
    private final java.lang.String _userId;


    public TokenListKey(java.lang.String _userId) {
    
    
        this._userId = _userId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public TokenListKey(TokenListKey source) {
        this._userId = source._userId;
    }


    public java.lang.String getUserId() {
        return _userId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_userId);
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
        TokenListKey other = (TokenListKey) obj;
        if (!Objects.equals(_userId, other._userId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.token_cache_times.TokenListKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_userId != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_userId=");
            builder.append(_userId);
         }
        return builder.append(']').toString();
    }
}

