package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;


/**
 * The enumeration built-in type represents values from a set of assigned names.
 *
 */
public enum AuthorizationResponseType {
    NotAuthorized(0),
    
    Authorized(1)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, AuthorizationResponseType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, AuthorizationResponseType> b = com.google.common.collect.ImmutableMap.builder();
        for (AuthorizationResponseType enumItem : AuthorizationResponseType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private AuthorizationResponseType(int value) {
        this.value = value;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding AuthorizationResponseType item
     */
    public static AuthorizationResponseType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
