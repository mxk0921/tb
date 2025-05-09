package tb;

import sun.misc.Unsafe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class opf {
    public static final int ANDROID_SDK_INT;
    public static final long ARRAY_BYTE_BASE_OFFSET;
    public static final long ARRAY_CHAR_BASE_OFFSET;
    public static final boolean BIG_ENDIAN;
    public static final Unsafe UNSAFE;

    /* JADX WARN: Can't wrap try/catch for region: R(15:2|(1:4)(1:5)|6|29|7|(1:(2:9|(1:14)(1:33))(2:34|16))|(8:18|20|(1:22)(1:23)|24|31|25|26|27)|19|20|(0)(0)|24|31|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    static {
        /*
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            tb.opf.BIG_ENDIAN = r0
            r0 = 0
            java.lang.Class<sun.misc.Unsafe> r1 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()     // Catch: all -> 0x0033
            int r4 = r1.length     // Catch: all -> 0x0033
        L_0x0017:
            if (r2 >= r4) goto L_0x0035
            r5 = r1[r2]     // Catch: all -> 0x0033
            java.lang.String r6 = r5.getName()     // Catch: all -> 0x0033
            java.lang.String r7 = "theUnsafe"
            boolean r7 = r6.equals(r7)     // Catch: all -> 0x0033
            if (r7 != 0) goto L_0x0036
            java.lang.String r7 = "THE_ONE"
            boolean r6 = r6.equals(r7)     // Catch: all -> 0x0033
            if (r6 == 0) goto L_0x0031
            goto L_0x0036
        L_0x0031:
            int r2 = r2 + r3
            goto L_0x0017
        L_0x0033:
            goto L_0x0042
        L_0x0035:
            r5 = r0
        L_0x0036:
            if (r5 == 0) goto L_0x0042
            r5.setAccessible(r3)     // Catch: all -> 0x0033
            java.lang.Object r1 = r5.get(r0)     // Catch: all -> 0x0033
            sun.misc.Unsafe r1 = (sun.misc.Unsafe) r1     // Catch: all -> 0x0033
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            tb.opf.UNSAFE = r1
            r2 = -1
            if (r1 == 0) goto L_0x0055
            java.lang.Class<byte[]> r3 = byte[].class
            int r3 = r1.arrayBaseOffset(r3)
            java.lang.Class<char[]> r4 = char[].class
            int r1 = r1.arrayBaseOffset(r4)
            goto L_0x0057
        L_0x0055:
            r1 = -1
            r3 = -1
        L_0x0057:
            long r3 = (long) r3
            tb.opf.ARRAY_BYTE_BASE_OFFSET = r3
            long r3 = (long) r1
            tb.opf.ARRAY_CHAR_BASE_OFFSET = r3
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: all -> 0x006d
            java.lang.String r3 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r3)     // Catch: all -> 0x006d
            int r2 = r1.getInt(r0)     // Catch: all -> 0x006d
        L_0x006d:
            tb.opf.ANDROID_SDK_INT = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.opf.<clinit>():void");
    }
}
