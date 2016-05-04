package org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.Identifier;


public class UserKey
 implements Identifier<User> {
    private static final long serialVersionUID = 8143633346645272146L;
    private final java.lang.String _userid;


    public UserKey(java.lang.String _userid) {
    
    
        this._userid = _userid;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public UserKey(UserKey source) {
        this._userid = source._userid;
    }


    public java.lang.String getUserid() {
        return _userid;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_userid);
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
        UserKey other = (UserKey) obj;
        if (!Objects.equals(_userid, other._userid)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authn.claims.rev141029.authentication.UserKey.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_userid != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_userid=");
            builder.append(_userid);
         }
        return builder.append(']').toString();
    }
}

