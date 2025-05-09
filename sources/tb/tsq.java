package tb;

import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class tsq extends ssq {
    public static String A(CharSequence charSequence, int i) {
        ckf.g(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i == 0) {
            return "";
        } else {
            int i2 = 1;
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (1 <= i) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                String sb2 = sb.toString();
                ckf.d(sb2);
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = charAt;
            }
            return new String(cArr);
        }
    }

    public static final String B(String str, char c, char c2, boolean z) {
        ckf.g(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            ckf.f(replace, "replace(...)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (rj3.d(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static final String C(String str, String str2, String str3, boolean z) {
        ckf.g(str, "<this>");
        ckf.g(str2, "oldValue");
        ckf.g(str3, "newValue");
        int i = 0;
        int U = wsq.U(str, str2, 0, z);
        if (U < 0) {
            return str;
        }
        int length = str2.length();
        int c = hfn.c(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, U);
                sb.append(str3);
                i = U + length;
                if (U >= str.length()) {
                    break;
                }
                U = wsq.U(str, str2, U + c, z);
            } while (U > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            ckf.f(sb2, "toString(...)");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String D(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return B(str, c, c2, z);
    }

    public static /* synthetic */ String E(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return C(str, str2, str3, z);
    }

    public static final String F(String str, String str2, String str3, boolean z) {
        ckf.g(str, "<this>");
        ckf.g(str2, "oldValue");
        ckf.g(str3, "newValue");
        int Y = wsq.Y(str, str2, 0, z, 2, null);
        if (Y < 0) {
            return str;
        }
        return wsq.t0(str, Y, str2.length() + Y, str3).toString();
    }

    public static /* synthetic */ String G(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return F(str, str2, str3, z);
    }

    public static boolean H(String str, String str2, boolean z) {
        ckf.g(str, "<this>");
        ckf.g(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return z(str, 0, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ boolean I(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return H(str, str2, z);
    }

    public static final String q(char[] cArr) {
        ckf.g(cArr, "<this>");
        return new String(cArr);
    }

    public static final String r(char[] cArr, int i, int i2) {
        ckf.g(cArr, "<this>");
        c20.Companion.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static /* synthetic */ String s(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return r(cArr, i, i2);
    }

    public static String t(byte[] bArr) {
        ckf.g(bArr, "<this>");
        return new String(bArr, uj3.UTF_8);
    }

    public static byte[] u(String str) {
        ckf.g(str, "<this>");
        byte[] bytes = str.getBytes(uj3.UTF_8);
        ckf.f(bytes, "getBytes(...)");
        return bytes;
    }

    public static final boolean v(String str, String str2, boolean z) {
        ckf.g(str, "<this>");
        ckf.g(str2, Constants.Name.SUFFIX);
        if (!z) {
            return str.endsWith(str2);
        }
        return z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return v(str, str2, z);
    }

    public static boolean x(String str, String str2, boolean z) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static /* synthetic */ boolean y(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return x(str, str2, z);
    }

    public static final boolean z(String str, int i, String str2, int i2, int i3, boolean z) {
        ckf.g(str, "<this>");
        ckf.g(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }
}
