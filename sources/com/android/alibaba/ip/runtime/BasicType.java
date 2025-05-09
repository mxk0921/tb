package com.android.alibaba.ip.runtime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum BasicType {
    I(Integer.TYPE),
    J(Long.TYPE),
    C(Character.TYPE),
    Z(Boolean.TYPE),
    F(Float.TYPE),
    D(Double.TYPE),
    V(Void.TYPE);
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Class<?> primitiveJavaType;

    BasicType(Class cls) {
        this.primitiveJavaType = cls;
    }

    public static /* synthetic */ Object ipc$super(BasicType basicType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/alibaba/ip/runtime/BasicType");
    }

    public static BasicType parse(String str) {
        BasicType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicType) ipChange.ipc$dispatch("fb909577", new Object[]{str});
        }
        for (BasicType basicType : values()) {
            if (basicType.getJavaType().getName().equals(str)) {
                return basicType;
            }
        }
        return null;
    }

    public static BasicType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasicType) ipChange.ipc$dispatch("87547262", new Object[]{str});
        }
        return (BasicType) Enum.valueOf(BasicType.class, str);
    }

    public Class getJavaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("d6f6c426", new Object[]{this});
        }
        return this.primitiveJavaType;
    }
}
