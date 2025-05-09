package androidx.core.content.res;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class GrowingArrayUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private GrowingArrayUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T[] append(T[] r4, int r5, T r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = androidx.core.content.res.GrowingArrayUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0020
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r4
            r5[r0] = r3
            r4 = 2
            r5[r4] = r6
            java.lang.String r4 = "69bf43d0"
            java.lang.Object r4 = r2.ipc$dispatch(r4, r5)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            return r4
        L_0x0020:
            int r0 = r0 + r5
            int r2 = r4.length
            if (r0 <= r2) goto L_0x003a
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r2 = growSize(r5)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r2)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.System.arraycopy(r4, r1, r0, r1, r5)
            r4 = r0
        L_0x003a:
            r4[r5] = r6
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.GrowingArrayUtils.append(java.lang.Object[], int, java.lang.Object):java.lang.Object[]");
    }

    public static int growSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1358f11b", new Object[]{new Integer(i)})).intValue();
        }
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static <T> T[] insert(T[] tArr, int i, int i2, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("2e4d4b4e", new Object[]{tArr, new Integer(i), new Integer(i2), t}));
        }
        if (i + 1 <= tArr.length) {
            System.arraycopy(tArr, i2, tArr, 1 + i2, i - i2);
            tArr[i2] = t;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i)));
        System.arraycopy(tArr, 0, tArr2, 0, i2);
        tArr2[i2] = t;
        System.arraycopy(tArr, i2, tArr2, 1 + i2, tArr.length - i2);
        return tArr2;
    }

    public static int[] append(int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("d493e0b5", new Object[]{iArr, new Integer(i), new Integer(i2)});
        }
        if (1 + i > iArr.length) {
            int[] iArr2 = new int[growSize(i)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static int[] insert(int[] iArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("2979416f", new Object[]{iArr, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (i + 1 <= iArr.length) {
            System.arraycopy(iArr, i2, iArr, 1 + i2, i - i2);
            iArr[i2] = i3;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i)];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        iArr2[i2] = i3;
        System.arraycopy(iArr, i2, iArr2, 1 + i2, iArr.length - i2);
        return iArr2;
    }

    public static long[] append(long[] jArr, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("d6492db4", new Object[]{jArr, new Integer(i), new Long(j)});
        }
        if (1 + i > jArr.length) {
            long[] jArr2 = new long[growSize(i)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            jArr = jArr2;
        }
        jArr[i] = j;
        return jArr;
    }

    public static boolean[] append(boolean[] zArr, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("f19dfda4", new Object[]{zArr, new Integer(i), new Boolean(z)});
        }
        if (1 + i > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            zArr = zArr2;
        }
        zArr[i] = z;
        return zArr;
    }

    public static long[] insert(long[] jArr, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (long[]) ipChange.ipc$dispatch("5e5ff110", new Object[]{jArr, new Integer(i), new Integer(i2), new Long(j)});
        }
        if (i + 1 <= jArr.length) {
            System.arraycopy(jArr, i2, jArr, 1 + i2, i - i2);
            jArr[i2] = j;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i)];
        System.arraycopy(jArr, 0, jArr2, 0, i2);
        jArr2[i2] = j;
        System.arraycopy(jArr, i2, jArr2, 1 + i2, jArr.length - i2);
        return jArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("accaeb20", new Object[]{zArr, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        if (i + 1 <= zArr.length) {
            System.arraycopy(zArr, i2, zArr, 1 + i2, i - i2);
            zArr[i2] = z;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i)];
        System.arraycopy(zArr, 0, zArr2, 0, i2);
        zArr2[i2] = z;
        System.arraycopy(zArr, i2, zArr2, 1 + i2, zArr.length - i2);
        return zArr2;
    }
}
