package tb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ic1 extends hc1 {
    public static boolean A(char[] cArr, char c) {
        ckf.g(cArr, "<this>");
        if (M(cArr, c) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean B(T[] tArr, T t) {
        ckf.g(tArr, "<this>");
        if (N(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    public static <T> List<T> C(T[] tArr, int i) {
        ckf.g(tArr, "<this>");
        if (i >= 0) {
            return e0(tArr, hfn.c(tArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static <T> List<T> D(T[] tArr) {
        ckf.g(tArr, "<this>");
        ArrayList arrayList = new ArrayList();
        E(tArr, arrayList);
        return arrayList;
    }

    public static final <C extends Collection<? super T>, T> C E(T[] tArr, C c) {
        ckf.g(tArr, "<this>");
        ckf.g(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    public static <T> T F(T[] tArr) {
        ckf.g(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T G(T[] tArr) {
        ckf.g(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static <T> aef H(T[] tArr) {
        ckf.g(tArr, "<this>");
        return new aef(0, K(tArr));
    }

    public static int I(int[] iArr) {
        ckf.g(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int J(long[] jArr) {
        ckf.g(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int K(T[] tArr) {
        ckf.g(tArr, "<this>");
        return tArr.length - 1;
    }

    public static <T> T L(T[] tArr, int i) {
        ckf.g(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static final int M(char[] cArr, char c) {
        ckf.g(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int N(T[] tArr, T t) {
        ckf.g(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (ckf.b(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T, A extends Appendable> A O(T[] tArr, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super T, ? extends CharSequence> g1aVar) {
        ckf.g(tArr, "<this>");
        ckf.g(a2, pg1.ATOM_EXT_buffer);
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        a2.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a2.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            jsq.a(a2, t, g1aVar);
        }
        if (i >= 0 && i2 > i) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    public static final <T> String P(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a<? super T, ? extends CharSequence> g1aVar) {
        ckf.g(tArr, "<this>");
        ckf.g(charSequence, "separator");
        ckf.g(charSequence2, "prefix");
        ckf.g(charSequence3, "postfix");
        ckf.g(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        O(tArr, sb, charSequence, charSequence2, charSequence3, i, charSequence4, g1aVar);
        return sb.toString();
    }

    public static /* synthetic */ String Q(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, g1a g1aVar, int i2, Object obj) {
        CharSequence charSequence5;
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            g1aVar = null;
        }
        return P(objArr, charSequence, charSequence5, charSequence6, i3, charSequence4, g1aVar);
    }

    public static <T> T R(T[] tArr) {
        ckf.g(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[K(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void S(float[] fArr, int i, int i2) {
        ckf.g(fArr, "<this>");
        c20.Companion.d(i, i2, fArr.length);
        int i3 = (i + i2) / 2;
        if (i != i3) {
            int i4 = i2 - 1;
            while (i < i3) {
                float f = fArr[i];
                fArr[i] = fArr[i4];
                fArr[i4] = f;
                i4--;
                i++;
            }
        }
    }

    public static final void T(int[] iArr) {
        ckf.g(iArr, "<this>");
        int length = (iArr.length / 2) - 1;
        if (length >= 0) {
            int I = I(iArr);
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = iArr[i];
                    iArr[i] = iArr[I];
                    iArr[I] = i2;
                    I--;
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void U(int[] iArr, int i, int i2) {
        ckf.g(iArr, "<this>");
        c20.Companion.d(i, i2, iArr.length);
        int i3 = (i + i2) / 2;
        if (i != i3) {
            int i4 = i2 - 1;
            while (i < i3) {
                int i5 = iArr[i];
                iArr[i] = iArr[i4];
                iArr[i4] = i5;
                i4--;
                i++;
            }
        }
    }

    public static final void V(long[] jArr, int i, int i2) {
        ckf.g(jArr, "<this>");
        c20.Companion.d(i, i2, jArr.length);
        int i3 = (i + i2) / 2;
        if (i != i3) {
            int i4 = i2 - 1;
            while (i < i3) {
                long j = jArr[i];
                jArr[i] = jArr[i4];
                jArr[i4] = j;
                i4--;
                i++;
            }
        }
    }

    public static <T> void W(T[] tArr) {
        ckf.g(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length >= 0) {
            int K = K(tArr);
            if (length >= 0) {
                int i = 0;
                while (true) {
                    T t = tArr[i];
                    tArr[i] = tArr[K];
                    tArr[K] = t;
                    K--;
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static char X(char[] cArr) {
        ckf.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static <T> T Y(T[] tArr) {
        ckf.g(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static void Z(float[] fArr, int i, int i2) {
        ckf.g(fArr, "<this>");
        hc1.v(fArr, i, i2);
        S(fArr, i, i2);
    }

    public static final void a0(int[] iArr) {
        ckf.g(iArr, "<this>");
        if (iArr.length > 1) {
            hc1.w(iArr);
            T(iArr);
        }
    }

    public static void b0(int[] iArr, int i, int i2) {
        ckf.g(iArr, "<this>");
        hc1.x(iArr, i, i2);
        U(iArr, i, i2);
    }

    public static void c0(long[] jArr, int i, int i2) {
        ckf.g(jArr, "<this>");
        hc1.y(jArr, i, i2);
        V(jArr, i, i2);
    }

    public static int[] d0(int[] iArr) {
        ckf.g(iArr, "<this>");
        if (iArr.length == 0) {
            return iArr;
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        ckf.f(copyOf, "copyOf(...)");
        a0(copyOf);
        return copyOf;
    }

    public static final <T> List<T> e0(T[] tArr, int i) {
        ckf.g(tArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return yz3.i();
        } else {
            if (i >= tArr.length) {
                return i0(tArr);
            }
            if (i == 1) {
                return xz3.e(tArr[0]);
            }
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            for (T t : tArr) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return arrayList;
        }
    }

    public static final <T, C extends Collection<? super T>> C f0(T[] tArr, C c) {
        ckf.g(tArr, "<this>");
        ckf.g(c, "destination");
        for (T t : tArr) {
            c.add(t);
        }
        return c;
    }

    public static float[] g0(Float[] fArr) {
        ckf.g(fArr, "<this>");
        int length = fArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    public static int[] h0(Integer[] numArr) {
        ckf.g(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static <T> List<T> i0(T[] tArr) {
        ckf.g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return yz3.i();
        }
        if (length != 1) {
            return j0(tArr);
        }
        return xz3.e(tArr[0]);
    }

    public static final <T> List<T> j0(T[] tArr) {
        ckf.g(tArr, "<this>");
        return new ArrayList(yz3.h(tArr));
    }

    public static final <T> Set<T> k0(T[] tArr) {
        ckf.g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            return kfp.d();
        }
        if (length == 1) {
            return jfp.c(tArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(v3i.e(tArr.length));
        f0(tArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final <T> T[] l0(T[] tArr, Comparator<? super T> comparator) {
        ckf.g(tArr, "<this>");
        ckf.g(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        ckf.f(tArr2, "copyOf(...)");
        hc1.z(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> m0(T[] tArr, Comparator<? super T> comparator) {
        ckf.g(tArr, "<this>");
        ckf.g(comparator, "comparator");
        return hc1.c(l0(tArr, comparator));
    }

    public static <T> T[] n0(T[] tArr) {
        ckf.g(tArr, "<this>");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) fc1.a(tArr, tArr.length);
        int K = K(tArr);
        if (K >= 0) {
            int i = 0;
            while (true) {
                tArr2[K - i] = tArr[i];
                if (i == K) {
                    break;
                }
                i++;
            }
        }
        return tArr2;
    }

    public static List<Byte> o0(byte[] bArr, int i) {
        ckf.g(bArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return yz3.i();
        } else {
            int length = bArr.length;
            if (i >= length) {
                return p0(bArr);
            }
            if (i == 1) {
                return xz3.e(Byte.valueOf(bArr[length - 1]));
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(Byte.valueOf(bArr[i2]));
            }
            return arrayList;
        }
    }

    public static final List<Byte> p0(byte[] bArr) {
        ckf.g(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            return yz3.i();
        }
        if (length != 1) {
            return q0(bArr);
        }
        return xz3.e(Byte.valueOf(bArr[0]));
    }

    public static final List<Byte> q0(byte[] bArr) {
        ckf.g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }
}
