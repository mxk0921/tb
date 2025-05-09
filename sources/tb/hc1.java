package tb;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class hc1 extends gc1 {
    public static <T> List<T> c(T[] tArr) {
        ckf.g(tArr, "<this>");
        List<T> a2 = jc1.a(tArr);
        ckf.f(a2, "asList(...)");
        return a2;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        ckf.g(bArr, "<this>");
        ckf.g(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
        return bArr2;
    }

    public static float[] e(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        ckf.g(fArr, "<this>");
        ckf.g(fArr2, "destination");
        System.arraycopy(fArr, i2, fArr2, i, i3 - i2);
        return fArr2;
    }

    public static int[] f(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        ckf.g(iArr, "<this>");
        ckf.g(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
        return iArr2;
    }

    public static long[] g(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        ckf.g(jArr, "<this>");
        ckf.g(jArr2, "destination");
        System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
        return jArr2;
    }

    public static <T> T[] h(T[] tArr, T[] tArr2, int i, int i2, int i3) {
        ckf.g(tArr, "<this>");
        ckf.g(tArr2, "destination");
        System.arraycopy(tArr, i2, tArr2, i, i3 - i2);
        return tArr2;
    }

    public static /* synthetic */ float[] i(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = fArr.length;
        }
        e(fArr, fArr2, i, i2, i3);
        return fArr2;
    }

    public static /* synthetic */ int[] j(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        f(iArr, iArr2, i, i2, i3);
        return iArr2;
    }

    public static /* synthetic */ long[] k(long[] jArr, long[] jArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = jArr.length;
        }
        g(jArr, jArr2, i, i2, i3);
        return jArr2;
    }

    public static /* synthetic */ Object[] l(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        h(objArr, objArr2, i, i2, i3);
        return objArr2;
    }

    public static <T> T[] m(T[] tArr, int i, int i2) {
        ckf.g(tArr, "<this>");
        fc1.b(i2, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
        ckf.f(tArr2, "copyOfRange(...)");
        return tArr2;
    }

    public static void n(char[] cArr, char c, int i, int i2) {
        ckf.g(cArr, "<this>");
        Arrays.fill(cArr, i, i2, c);
    }

    public static final void o(int[] iArr, int i, int i2, int i3) {
        ckf.g(iArr, "<this>");
        Arrays.fill(iArr, i2, i3, i);
    }

    public static final void p(long[] jArr, long j, int i, int i2) {
        ckf.g(jArr, "<this>");
        Arrays.fill(jArr, i, i2, j);
    }

    public static <T> void q(T[] tArr, T t, int i, int i2) {
        ckf.g(tArr, "<this>");
        Arrays.fill(tArr, i, i2, t);
    }

    public static /* synthetic */ void r(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        o(iArr, i, i2, i3);
    }

    public static /* synthetic */ void s(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        p(jArr, j, i, i2);
    }

    public static /* synthetic */ void t(Object[] objArr, Object obj, int i, int i2, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = objArr.length;
        }
        q(objArr, obj, i, i2);
    }

    public static byte[] u(byte[] bArr, byte[] bArr2) {
        ckf.g(bArr, "<this>");
        ckf.g(bArr2, tep.KEY_UNIFORM_RESULT);
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        ckf.d(copyOf);
        return copyOf;
    }

    public static void v(float[] fArr, int i, int i2) {
        ckf.g(fArr, "<this>");
        Arrays.sort(fArr, i, i2);
    }

    public static final void w(int[] iArr) {
        ckf.g(iArr, "<this>");
        if (iArr.length > 1) {
            Arrays.sort(iArr);
        }
    }

    public static void x(int[] iArr, int i, int i2) {
        ckf.g(iArr, "<this>");
        Arrays.sort(iArr, i, i2);
    }

    public static void y(long[] jArr, int i, int i2) {
        ckf.g(jArr, "<this>");
        Arrays.sort(jArr, i, i2);
    }

    public static final <T> void z(T[] tArr, Comparator<? super T> comparator) {
        ckf.g(tArr, "<this>");
        ckf.g(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }
}
