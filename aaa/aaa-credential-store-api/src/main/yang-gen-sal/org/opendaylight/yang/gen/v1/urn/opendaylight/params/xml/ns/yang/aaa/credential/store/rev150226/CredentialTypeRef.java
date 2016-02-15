package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226;
import com.google.common.base.Preconditions;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import java.io.Serializable;
import java.beans.ConstructorProperties;


/**
 * reference to an entry in the credential store based on id.
 *
 */
public class CredentialTypeRef
 implements Serializable {
    private static final long serialVersionUID = -4678650651105647583L;
    private final InstanceIdentifier<?> _value;


    @ConstructorProperties("value")
    public CredentialTypeRef(InstanceIdentifier<?> _value) {
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CredentialTypeRef(CredentialTypeRef source) {
        this._value = source._value;
    }


    public InstanceIdentifier<?> getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((_value == null) ? 0 : _value.hashCode());
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
        CredentialTypeRef other = (CredentialTypeRef) obj;
        if (_value == null) {
            if (other._value != null) {
                return false;
            }
        } else if(!_value.equals(other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.aaa.credential.store.rev150226.CredentialTypeRef.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }



}

