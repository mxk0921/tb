package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gyf {
    public static final <T> Class<T> a(T t) {
        ckf.g(t, "<this>");
        return (Class<T>) t.getClass();
    }

    public static final <T> Class<T> b(wyf<T> wyfVar) {
        ckf.g(wyfVar, "<this>");
        Class<T> cls = (Class<T>) ((ls3) wyfVar).b();
        ckf.e(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    public static final <T> Class<T> c(wyf<T> wyfVar) {
        ckf.g(wyfVar, "<this>");
        Class<T> cls = (Class<T>) ((ls3) wyfVar).b();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                    return cls;
                }
                return Double.class;
            case 104431:
                if (!name.equals("int")) {
                    return cls;
                }
                return Integer.class;
            case 3039496:
                if (!name.equals("byte")) {
                    return cls;
                }
                return Byte.class;
            case 3052374:
                if (!name.equals("char")) {
                    return cls;
                }
                return Character.class;
            case 3327612:
                if (!name.equals("long")) {
                    return cls;
                }
                return Long.class;
            case 3625364:
                if (!name.equals(pg1.ATOM_void)) {
                    return cls;
                }
                return Void.class;
            case 64711720:
                if (!name.equals("boolean")) {
                    return cls;
                }
                return Boolean.class;
            case 97526364:
                if (!name.equals("float")) {
                    return cls;
                }
                return Float.class;
            case 109413500:
                if (!name.equals("short")) {
                    return cls;
                }
                return Short.class;
            default:
                return cls;
        }
    }

    public static final <T> wyf<T> d(Class<T> cls) {
        ckf.g(cls, "<this>");
        return dun.b(cls);
    }
}
