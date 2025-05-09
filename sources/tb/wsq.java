package tb;

import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import tb.dcp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wsq extends tsq {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements sbp<String> {

        /* renamed from: a */
        public final /* synthetic */ CharSequence f30901a;

        public a(CharSequence charSequence) {
            this.f30901a = charSequence;
        }

        @Override // tb.sbp
        public Iterator<String> iterator() {
            return new tpg(this.f30901a);
        }
    }

    public static final boolean A0(CharSequence charSequence, char c, boolean z) {
        ckf.g(charSequence, "<this>");
        if (charSequence.length() <= 0 || !rj3.d(charSequence.charAt(0), c, z)) {
            return false;
        }
        return true;
    }

    public static final boolean B0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(charSequence2, "prefix");
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return q0(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
        }
        return tsq.I((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static /* synthetic */ boolean C0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return A0(charSequence, c, z);
    }

    public static /* synthetic */ boolean D0(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return B0(charSequence, charSequence2, z);
    }

    public static final String E0(CharSequence charSequence, aef aefVar) {
        ckf.g(charSequence, "<this>");
        ckf.g(aefVar, x96.REFRESH_TYPE_RANGE);
        return charSequence.subSequence(aefVar.getStart().intValue(), aefVar.getEndInclusive().intValue() + 1).toString();
    }

    public static final String F0(String str, char c, String str2) {
        ckf.g(str, "<this>");
        ckf.g(str2, "missingDelimiterValue");
        int X = X(str, c, 0, false, 6, null);
        if (X == -1) {
            return str2;
        }
        String substring = str.substring(X + 1, str.length());
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static String G0(String str, String str2, String str3) {
        ckf.g(str, "<this>");
        ckf.g(str2, "delimiter");
        ckf.g(str3, "missingDelimiterValue");
        int Y = Y(str, str2, 0, false, 6, null);
        if (Y == -1) {
            return str3;
        }
        String substring = str.substring(Y + str2.length(), str.length());
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String H0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return F0(str, c, str2);
    }

    public static /* synthetic */ String I0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return G0(str, str2, str3);
    }

    public static String J0(String str, char c, String str2) {
        ckf.g(str, "<this>");
        ckf.g(str2, "missingDelimiterValue");
        int d0 = d0(str, c, 0, false, 6, null);
        if (d0 == -1) {
            return str2;
        }
        String substring = str.substring(d0 + 1, str.length());
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String K0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return J0(str, c, str2);
    }

    public static final boolean L(CharSequence charSequence, char c, boolean z) {
        ckf.g(charSequence, "<this>");
        if (X(charSequence, c, 0, z, 2, null) >= 0) {
            return true;
        }
        return false;
    }

    public static final String L0(String str, char c, String str2) {
        ckf.g(str, "<this>");
        ckf.g(str2, "missingDelimiterValue");
        int X = X(str, c, 0, false, 6, null);
        if (X == -1) {
            return str2;
        }
        String substring = str.substring(0, X);
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static final boolean M(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (Y(charSequence, (String) charSequence2, 0, z, 2, null) < 0) {
                return false;
            }
        } else if (W(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static String M0(String str, String str2, String str3) {
        ckf.g(str, "<this>");
        ckf.g(str2, "delimiter");
        ckf.g(str3, "missingDelimiterValue");
        int Y = Y(str, str2, 0, false, 6, null);
        if (Y == -1) {
            return str3;
        }
        String substring = str.substring(0, Y);
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return L(charSequence, c, z);
    }

    public static /* synthetic */ String N0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return L0(str, c, str2);
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return M(charSequence, charSequence2, z);
    }

    public static /* synthetic */ String O0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return M0(str, str2, str3);
    }

    public static final boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(charSequence2, Constants.Name.SUFFIX);
        if (z || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return q0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
        }
        return tsq.w((String) charSequence, (String) charSequence2, false, 2, null);
    }

    public static Boolean P0(String str) {
        ckf.g(str, "<this>");
        if (ckf.b(str, "true")) {
            return Boolean.TRUE;
        }
        if (ckf.b(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return P(charSequence, charSequence2, z);
    }

    public static CharSequence Q0(CharSequence charSequence) {
        int i;
        ckf.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean c = kotlin.text.a.c(charSequence.charAt(i));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final Pair<Integer, String> R(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        ydf ydfVar;
        Object obj;
        Object obj2;
        int i2;
        if (z || collection.size() != 1) {
            if (!z2) {
                ydfVar = new aef(hfn.c(i, 0), charSequence.length());
            } else {
                ydfVar = hfn.l(hfn.f(i, S(charSequence)), 0);
            }
            if (charSequence instanceof String) {
                int c = ydfVar.c();
                int d = ydfVar.d();
                int e = ydfVar.e();
                if ((e > 0 && c <= d) || (e < 0 && d <= c)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (tsq.z(str, 0, (String) charSequence, c, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (c == d) {
                                break;
                            }
                            c += e;
                        } else {
                            return jpu.a(Integer.valueOf(c), str2);
                        }
                    }
                }
            } else {
                int c2 = ydfVar.c();
                int d2 = ydfVar.d();
                int e2 = ydfVar.e();
                if ((e2 > 0 && c2 <= d2) || (e2 < 0 && d2 <= c2)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (q0(str3, 0, charSequence, c2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (c2 == d2) {
                                break;
                            }
                            c2 += e2;
                        } else {
                            return jpu.a(Integer.valueOf(c2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) i04.r0(collection);
        if (!z2) {
            i2 = Y(charSequence, str5, i, false, 4, null);
        } else {
            i2 = e0(charSequence, str5, i, false, 4, null);
        }
        if (i2 < 0) {
            return null;
        }
        return jpu.a(Integer.valueOf(i2), str5);
    }

    public static String R0(String str, char... cArr) {
        int i;
        ckf.g(str, "<this>");
        ckf.g(cArr, "chars");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean A = ic1.A(cArr, str.charAt(i));
            if (!z) {
                if (!A) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!A) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    public static int S(CharSequence charSequence) {
        ckf.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String S0(String str, char... cArr) {
        CharSequence charSequence;
        ckf.g(str, "<this>");
        ckf.g(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!ic1.A(cArr, str.charAt(length))) {
                    charSequence = str.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
            return charSequence.toString();
        }
        charSequence = "";
        return charSequence.toString();
    }

    public static final int T(CharSequence charSequence, char c, int i, boolean z) {
        ckf.g(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return Z(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static final boolean T0(CharSequence charSequence, char c, boolean z) {
        ckf.g(charSequence, "<this>");
        if (charSequence.length() <= 0 || !rj3.d(charSequence.charAt(S(charSequence)), c, z)) {
            return false;
        }
        return true;
    }

    public static int U(CharSequence charSequence, String str, int i, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(str, "string");
        if (z || !(charSequence instanceof String)) {
            return W(charSequence, str, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ boolean U0(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return T0(charSequence, c, z);
    }

    public static final int V(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        ydf ydfVar;
        if (!z2) {
            ydfVar = new aef(hfn.c(i, 0), hfn.f(i2, charSequence.length()));
        } else {
            ydfVar = hfn.l(hfn.f(i, S(charSequence)), hfn.c(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int c = ydfVar.c();
            int d = ydfVar.d();
            int e = ydfVar.e();
            if ((e <= 0 || c > d) && (e >= 0 || d > c)) {
                return -1;
            }
            while (!q0(charSequence2, 0, charSequence, c, charSequence2.length(), z)) {
                if (c == d) {
                    return -1;
                }
                c += e;
            }
            return c;
        }
        int c2 = ydfVar.c();
        int d2 = ydfVar.d();
        int e2 = ydfVar.e();
        if ((e2 <= 0 || c2 > d2) && (e2 >= 0 || d2 > c2)) {
            return -1;
        }
        while (true) {
            String str = (String) charSequence2;
            if (tsq.z(str, 0, (String) charSequence, c2, str.length(), z)) {
                return c2;
            }
            if (c2 == d2) {
                return -1;
            }
            c2 += e2;
        }
    }

    public static /* synthetic */ int W(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        boolean z3;
        if ((i3 & 16) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        return V(charSequence, charSequence2, i, i2, z, z3);
    }

    public static /* synthetic */ int X(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return T(charSequence, c, i, z);
    }

    public static /* synthetic */ int Y(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return U(charSequence, str, i, z);
    }

    public static final int Z(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int c = hfn.c(i, 0);
            int S = S(charSequence);
            if (c > S) {
                return -1;
            }
            while (true) {
                char charAt = charSequence.charAt(c);
                for (char c2 : cArr) {
                    if (rj3.d(c2, charAt, z)) {
                        return c;
                    }
                }
                if (c == S) {
                    return -1;
                }
                c++;
            }
        } else {
            return ((String) charSequence).indexOf(ic1.X(cArr), i);
        }
    }

    public static boolean a0(CharSequence charSequence) {
        ckf.g(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!kotlin.text.a.c(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final int b0(CharSequence charSequence, char c, int i, boolean z) {
        ckf.g(charSequence, "<this>");
        if (z || !(charSequence instanceof String)) {
            return f0(charSequence, new char[]{c}, i, z);
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int c0(CharSequence charSequence, String str, int i, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(str, "string");
        if (z || !(charSequence instanceof String)) {
            return V(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ int d0(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = S(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return b0(charSequence, c, i, z);
    }

    public static /* synthetic */ int e0(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = S(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return c0(charSequence, str, i, z);
    }

    public static final int f0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int f = hfn.f(i, S(charSequence)); -1 < f; f--) {
                char charAt = charSequence.charAt(f);
                for (char c : cArr) {
                    if (rj3.d(c, charAt, z)) {
                        return f;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(ic1.X(cArr), i);
    }

    public static final sbp<String> g0(CharSequence charSequence) {
        ckf.g(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List<String> h0(CharSequence charSequence) {
        ckf.g(charSequence, "<this>");
        return dcp.y(g0(charSequence));
    }

    public static final CharSequence i0(CharSequence charSequence, int i, char c) {
        ckf.g(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String j0(String str, int i, char c) {
        ckf.g(str, "<this>");
        return i0(str, i, c).toString();
    }

    public static final sbp<aef> k0(CharSequence charSequence, final char[] cArr, int i, final boolean z, int i2) {
        u0(i2);
        return new qb7(charSequence, i, i2, new u1a() { // from class: tb.usq
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                Pair o0;
                int intValue = ((Integer) obj2).intValue();
                o0 = wsq.o0(cArr, z, (CharSequence) obj, intValue);
                return o0;
            }
        });
    }

    public static final sbp<aef> l0(CharSequence charSequence, String[] strArr, int i, final boolean z, int i2) {
        u0(i2);
        final List c = hc1.c(strArr);
        return new qb7(charSequence, i, i2, new u1a() { // from class: tb.vsq
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                Pair p0;
                int intValue = ((Integer) obj2).intValue();
                p0 = wsq.p0(c, z, (CharSequence) obj, intValue);
                return p0;
            }
        });
    }

    public static /* synthetic */ sbp m0(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return k0(charSequence, cArr, i, z, i2);
    }

    public static /* synthetic */ sbp n0(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return l0(charSequence, strArr, i, z, i2);
    }

    public static final Pair o0(char[] cArr, boolean z, CharSequence charSequence, int i) {
        ckf.g(charSequence, "$this$DelimitedRangesSequence");
        int Z = Z(charSequence, cArr, i, z);
        if (Z < 0) {
            return null;
        }
        return jpu.a(Integer.valueOf(Z), 1);
    }

    public static final Pair p0(List list, boolean z, CharSequence charSequence, int i) {
        ckf.g(charSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> R = R(charSequence, list, i, z, false);
        if (R != null) {
            return jpu.a(R.getFirst(), Integer.valueOf(R.getSecond().length()));
        }
        return null;
    }

    public static final boolean q0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        ckf.g(charSequence, "<this>");
        ckf.g(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!rj3.d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String r0(String str, CharSequence charSequence) {
        ckf.g(str, "<this>");
        ckf.g(charSequence, "prefix");
        if (!D0(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static String s0(String str, CharSequence charSequence) {
        ckf.g(str, "<this>");
        ckf.g(charSequence, Constants.Name.SUFFIX);
        if (!Q(str, charSequence, false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        ckf.f(substring, "substring(...)");
        return substring;
    }

    public static final CharSequence t0(CharSequence charSequence, int i, int i2, CharSequence charSequence2) {
        ckf.g(charSequence, "<this>");
        ckf.g(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    public static final void u0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    public static final List<String> v0(CharSequence charSequence, char[] cArr, boolean z, int i) {
        ckf.g(charSequence, "<this>");
        ckf.g(cArr, "delimiters");
        if (cArr.length == 1) {
            return x0(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable k = dcp.k(m0(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(zz3.q(k, 10));
        Iterator it = ((dcp.a) k).iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (aef) it.next()));
        }
        return arrayList;
    }

    public static final List<String> w0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        ckf.g(charSequence, "<this>");
        ckf.g(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return x0(charSequence, str, z, i);
            }
        }
        Iterable k = dcp.k(n0(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(zz3.q(k, 10));
        Iterator it = ((dcp.a) k).iterator();
        while (it.hasNext()) {
            arrayList.add(E0(charSequence, (aef) it.next()));
        }
        return arrayList;
    }

    public static final List<String> x0(CharSequence charSequence, String str, boolean z, int i) {
        boolean z2;
        u0(i);
        int i2 = 0;
        int U = U(charSequence, str, 0, z);
        if (U == -1 || i == 1) {
            return xz3.e(charSequence.toString());
        }
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = 10;
        if (z2) {
            i3 = hfn.f(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, U).toString());
            i2 = str.length() + U;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            U = U(charSequence, str, i2, z);
        } while (U != -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List y0(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return v0(charSequence, cArr, z, i);
    }

    public static /* synthetic */ List z0(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return w0(charSequence, strArr, z, i);
    }
}
