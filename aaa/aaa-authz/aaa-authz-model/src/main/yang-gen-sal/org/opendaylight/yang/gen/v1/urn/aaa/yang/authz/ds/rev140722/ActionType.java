package org.opendaylight.yang.gen.v1.urn.aaa.yang.authz.ds.rev140722;


public enum ActionType {
    Put(0),
    
    Commit(1),
    
    Exists(2),
    
    GetIdentifier(3),
    
    Read(4),
    
    Cancel(5),
    
    Submit(6),
    
    Delete(7),
    
    Merge(8),
    
    Any(9)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, ActionType> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, ActionType> b = com.google.common.collect.ImmutableMap.builder();
        for (ActionType enumItem : ActionType.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private ActionType(int value) {
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
     * @return corresponding ActionType item
     */
    public static ActionType forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
