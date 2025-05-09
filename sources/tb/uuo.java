package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uuo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LOCAL_URI = 32;
    public static final int NETWORK_URI = 1;

    /* renamed from: a  reason: collision with root package name */
    public final int f29621a;
    public String b;
    public String c;
    public String d = "";
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public int l;
    public int m;
    public boolean n;

    static {
        t2o.a(620757142);
    }

    public uuo(int i) {
        this.f29621a = i;
    }

    public static boolean b(String str, int i) {
        char charAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb59f926", new Object[]{str, new Integer(i)})).booleanValue();
        }
        int i2 = i + 1;
        if (i2 >= str.length() || (charAt = str.charAt(i2)) == '.' || charAt == '_') {
            return true;
        }
        return false;
    }

    public static uuo d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("f425bc2", new Object[]{str});
        }
        uuo j = j(str);
        if (j == null && (j = e(str)) == null && (j = l(str)) == null && (j = f(str)) == null && (j = i(str)) == null) {
            return h(str);
        }
        return j;
    }

    public static uuo e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("37e8c39c", new Object[]{str});
        }
        if (!str.startsWith("asset://")) {
            return null;
        }
        uuo uuoVar = new uuo(34);
        uuoVar.b = str;
        uuoVar.i = str.substring(8);
        uuoVar.d = g(str);
        return uuoVar;
    }

    public static uuo f(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("4ed1db33", new Object[]{str});
        }
        if (!str.startsWith(nwl.BASE_64_PREFIX) || (indexOf = str.indexOf(";base64,", 11)) <= 0 || indexOf >= 17) {
            return null;
        }
        uuo uuoVar = new uuo(40);
        int i = indexOf + 8;
        uuoVar.k = str.substring(i);
        uuoVar.b = str.substring(0, i) + "hash=" + Integer.toHexString(uuoVar.k.hashCode());
        StringBuilder sb = new StringBuilder(".");
        sb.append(str.substring(11, indexOf));
        uuoVar.d = sb.toString();
        return uuoVar;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("907bc1e2", new Object[]{str});
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf);
        }
        return "";
    }

    public static uuo h(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("6a154041", new Object[]{str});
        }
        uuo uuoVar = new uuo(1);
        uuoVar.b = str;
        int length = str.length();
        int indexOf2 = str.indexOf(63);
        if (indexOf2 < 0) {
            indexOf2 = length;
        }
        int lastIndexOf = str.lastIndexOf(47, indexOf2 - 1);
        if (lastIndexOf >= 0 && lastIndexOf < length - 1) {
            String substring = str.substring(lastIndexOf + 1, indexOf2);
            uuoVar.d = g(substring);
            if (!m(substring, uuoVar) && !k(str, lastIndexOf, substring, uuoVar) && (indexOf = str.indexOf("//gw.alicdn.com")) >= 0 && indexOf <= 6) {
                if (substring.endsWith("_.webp")) {
                    uuoVar.b = substring.substring(0, substring.length() - 6);
                } else {
                    uuoVar.b = substring;
                }
                uuoVar.f = 10000;
                uuoVar.e = 10000;
                uuoVar.h = true;
            }
            if (!TextUtils.isEmpty(uuoVar.b)) {
                int lastIndexOf2 = uuoVar.b.lastIndexOf(47);
                if (lastIndexOf2 > 0) {
                    uuoVar.c = uuoVar.b.substring(lastIndexOf2 + 1);
                } else {
                    uuoVar.c = uuoVar.b;
                }
            }
        }
        return uuoVar;
    }

    public static uuo i(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("540905e4", new Object[]{str});
        }
        List<l9h> q = s0m.B().q();
        if (q == null) {
            return null;
        }
        for (l9h l9hVar : q) {
            if (l9hVar.isSupported(str)) {
                uuo uuoVar = new uuo(48);
                uuoVar.l = i;
                uuoVar.b = str;
                return uuoVar;
            }
            i++;
        }
        return null;
    }

    public static uuo j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("b49e2bc1", new Object[]{str});
        }
        boolean startsWith = str.startsWith("file:///");
        if (startsWith || (str.length() > 1 && str.charAt(0) == '/' && str.charAt(1) != '/')) {
            uuo uuoVar = new uuo(33);
            uuoVar.d = g(str);
            if (startsWith) {
                uuoVar.i = str.substring(7);
            } else {
                uuoVar.i = str;
            }
            uuoVar.b = uuoVar.i;
            return uuoVar;
        } else if (!str.startsWith("content://")) {
            return null;
        } else {
            uuo uuoVar2 = new uuo(33);
            uuoVar2.i = str;
            uuoVar2.b = str;
            return uuoVar2;
        }
    }

    public static boolean k(String str, int i, String str2, uuo uuoVar) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf7f50d8", new Object[]{str, new Integer(i), str2, uuoVar})).booleanValue();
        }
        int lastIndexOf = str2.lastIndexOf(64);
        if (lastIndexOf >= 0 && str2.indexOf(45, lastIndexOf) <= 0 && str2.indexOf(124, lastIndexOf) <= 0 && str2.indexOf("_2e", lastIndexOf) <= 0) {
            int n = n(str2, lastIndexOf, 'w');
            uuoVar.e = n;
            if (n != 0) {
                int n2 = n(str2, lastIndexOf, 'h');
                uuoVar.f = n2;
                if (n2 != 0 && uuoVar.e == n2) {
                    uuoVar.h = true;
                    int indexOf = str.indexOf(itw.URL_SEPARATOR);
                    if (indexOf > 0 && str.charAt(indexOf - 1) == ':') {
                        i2 = indexOf;
                    }
                    uuoVar.b = str.substring(i2, i + lastIndexOf + 1);
                    return true;
                }
            }
        }
        return false;
    }

    public static uuo l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuo) ipChange.ipc$dispatch("99d038ac", new Object[]{str});
        }
        if (!str.startsWith("res://")) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str.substring(6));
            uuo uuoVar = new uuo(36);
            uuoVar.j = parseInt;
            uuoVar.b = str;
            return uuoVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int n(String str, int i, char c) {
        int o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd857bfc", new Object[]{str, new Integer(i), new Character(c)})).intValue();
        }
        int indexOf = str.indexOf(c, i);
        while (indexOf > i) {
            if (b(str, indexOf) && (o = o(str, indexOf, false, i)) != 0) {
                return o;
            }
            i = indexOf + 1;
            indexOf = str.indexOf(c, i);
        }
        return 0;
    }

    public static int o(String str, int i, boolean z, int i2) {
        int charAt;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5d10c675", new Object[]{str, new Integer(i), new Boolean(z), new Integer(i2)})).intValue();
        }
        if (i < 0) {
            return 0;
        }
        if (z) {
            while (true) {
                i++;
                if (i >= i2 || str.charAt(i) - '0' < 0 || charAt > 9) {
                    return i3;
                }
                i3 = (i3 * 10) + charAt;
            }
        } else {
            int i4 = i - 1;
            int i5 = 0;
            while (i4 > i2) {
                int charAt2 = str.charAt(i4) - '0';
                if (charAt2 < 0 || charAt2 > 9) {
                    break;
                }
                i5 += charAt2 * ((int) Math.pow(10.0d, i3));
                i4--;
                i3++;
            }
            return i5;
        }
    }

    public static String p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e37792a9", new Object[]{str});
        }
        return "asset://" + str;
    }

    public static String q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83c0f289", new Object[]{str});
        }
        return "file://" + str;
    }

    public static String r(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83fbb03a", new Object[]{new Integer(i)});
        }
        return "res://" + i;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72e54056", new Object[]{this})).booleanValue();
        }
        if ((this.f29621a & 32) > 0) {
            return true;
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36be49b3", new Object[]{this})).booleanValue();
        }
        if ((this.f29621a & 32) == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type=" + this.f29621a + ", baseName=" + this.b + ", extension=" + this.d + ", width=" + this.e + ", height=" + this.f + ", cdnSize=" + this.h + ", path=" + this.i + ", resId=" + this.j + ", base64=" + this.k;
    }

    public static boolean m(String str, uuo uuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("124e54ef", new Object[]{str, uuoVar})).booleanValue();
        }
        int indexOf = str.indexOf(95);
        if (indexOf < 0) {
            return false;
        }
        int indexOf2 = str.indexOf(120, indexOf);
        int length = str.length();
        while (indexOf2 > indexOf) {
            uuoVar.e = o(str, indexOf2, false, indexOf);
            int o = o(str, indexOf2, true, length);
            uuoVar.f = o;
            if (uuoVar.e > 0 && o == 0) {
                if (str.contains(uuoVar.e + "x0")) {
                    uuoVar.f = uuoVar.e;
                }
            }
            boolean z = uuoVar.e == 0 && uuoVar.f == 0 && str.contains("0x0q0");
            int i = uuoVar.e;
            if ((i > 0 && i == uuoVar.f) || z) {
                int length2 = String.valueOf(uuoVar.f).length();
                int i2 = indexOf2 + length2;
                int i3 = 2 + i2;
                if (!(i3 < str.length() && str.charAt(i2 + 1) == 'x' && str.charAt(i3) == 'z')) {
                    uuoVar.h = !z;
                    uuoVar.g = o(str, str.indexOf(98, i2 + 1), true, length);
                    int i4 = (indexOf2 - length2) - 1;
                    if (i4 > 0) {
                        uuoVar.b = str.substring(0, i4);
                    }
                }
                return true;
            } else if ((i > 0 && uuoVar.f == 10000) || (uuoVar.f > 0 && i == 10000)) {
                return true;
            } else {
                uuoVar.f = 0;
                uuoVar.e = 0;
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(120, indexOf);
            }
        }
        return false;
    }
}
