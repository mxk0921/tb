package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ub1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <T> int a(T[] tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2f57d8e", new Object[]{tArr})).intValue();
        }
        if (tArr == null) {
            return 0;
        }
        return tArr.length;
    }

    public static <T> void b(T[] tArr, T[] tArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fc8be9", new Object[]{tArr, tArr2, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i2 < 0 || i > tArr2.length || i > tArr.length || i2 > tArr2.length || i2 > tArr.length) {
            ndh.a("ArrayUtil", "safeCopy: copy failed, out of boundary, exit");
        } else {
            System.arraycopy(tArr2, 0, tArr, i, i2);
        }
    }

    public static void c(int[] iArr, int[] iArr2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64592af0", new Object[]{iArr, iArr2, new Integer(i), new Integer(i2)});
        } else if (i < 0 || i2 < 0 || i > iArr2.length || i > iArr.length || i2 > iArr2.length || i2 > iArr.length) {
            ndh.a("ArrayUtil", "safeCopy: copy failed, out of boundary, exit");
        } else {
            System.arraycopy(iArr2, 0, iArr, i, i2);
        }
    }

    public static <T> void d(T[] tArr, T[] tArr2, T[] tArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d70df5f", new Object[]{tArr, tArr2, tArr3});
        } else if (tArr.length < a(tArr2) + a(tArr3)) {
            ndh.a("ArrayUtil", "safeMerge: merge failed, out of boundary, exit");
        } else {
            b(tArr, tArr2, 0, a(tArr2));
            b(tArr, tArr3, a(tArr2), a(tArr3));
        }
    }

    public static void e(int[] iArr, int[] iArr2, int[] iArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7bf2035", new Object[]{iArr, iArr2, iArr3});
            return;
        }
        try {
            if (iArr.length < iArr2.length + iArr3.length) {
                ndh.a("ArrayUtil", "safeMerge: merge failed, out of boundary, exit");
                return;
            }
            c(iArr, iArr2, 0, iArr2.length);
            c(iArr, iArr3, iArr2.length, iArr3.length);
        } catch (NullPointerException e) {
            ndh.a("ArrayUtil", "safeMergeInt: copy with null pointer " + e);
        }
    }
}
