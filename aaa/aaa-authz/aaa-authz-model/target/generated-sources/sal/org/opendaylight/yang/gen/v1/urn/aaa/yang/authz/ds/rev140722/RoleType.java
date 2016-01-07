package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.beans.ConstructorProperties;


public class RoleType
 implements Serializable {
    private static final long serialVersionUID = -1311731106353290143L;
    private final java.lang.String _value;


    @ConstructorProperties("value")
    public RoleType(java.lang.String _value) {
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RoleType(RoleType source) {
        this._value = source._value;
    }

    public static RoleType getDefaultInstance(String defaultValue) {
        return new RoleType(defaultValue);
    }

    public java.lang.String getValue() {
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
        RoleType other = (RoleType) obj;
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
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722.RoleType.class.getSimpleName()).append(" [");
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

