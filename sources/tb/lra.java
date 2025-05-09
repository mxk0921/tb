package tb;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lra {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLOR_RESOURCE = "@color/";
    public static final String DIMEN_RESOURCE = "@dimen/";
    public static final String DRAWABLE_RESOURCE = "@drawable/";
    public static final String LAYOUT_RESOURCE = "@layout/";
    public static final String STRING_RESOURCE = "@String/";

    static {
        t2o.a(1039138859);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2aac931", new Object[]{str, str2, str3});
        }
        StringBuffer stringBuffer = new StringBuffer(str3);
        stringBuffer.append(str2);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6826e071", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (!str.startsWith("#")) {
            return d(str);
        }
        if (ntq.i().c().get(str) == null) {
            ntq.i().c().put(str, Integer.valueOf(Color.parseColor(str)));
        }
        return ntq.i().c().get(str).intValue();
    }

    public static int c(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1cc58359", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, "color", str2);
        int b = kra.c().b(a2);
        if (b != 0) {
            return b;
        }
        int identifier = resources.getIdentifier(str, "color", str2);
        kra.c().g(a2, identifier);
        return identifier;
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abb79f48", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith(COLOR_RESOURCE)) {
            str = str.replace(COLOR_RESOURCE, "");
        }
        try {
            if (kra.c().f() != null && !TextUtils.isEmpty(kra.c().d())) {
                int c = c(kra.c().f(), str, kra.c().d());
                if (c == 0) {
                    return e(str);
                }
                return kra.c().f().getColor(c);
            }
            return e(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("90970dfd", new Object[]{str})).intValue();
        }
        if (ntq.i().d().get(str) != null) {
            return ntq.i().d().get(str).intValue();
        }
        try {
            int c = c(kra.c().e(), str, kra.c().a());
            if (c == 0) {
                return 0;
            }
            return kra.c().e().getColor(c);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d82f49", new Object[]{str})).intValue();
        }
        try {
            int k = k(kra.c().e(), str, kra.c().a());
            if (k == 0) {
                return 0;
            }
            return kra.c().e().getDimensionPixelSize(k);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static float g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f4781897", new Object[]{str})).floatValue();
        }
        try {
            int k = k(kra.c().e(), str, kra.c().a());
            if (k == 0) {
                return 0.0f;
            }
            return kra.c().e().getDimension(k);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public static Drawable h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("3e8dbf61", new Object[]{str});
        }
        try {
            int q = q(kra.c().e(), str, kra.c().a());
            if (q == 0) {
                return null;
            }
            return kra.c().e().getDrawable(q);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49f7e3ba", new Object[]{str});
        }
        try {
            int t = t(kra.c().e(), str, kra.c().a());
            if (t == 0) {
                return str;
            }
            return kra.c().e().getString(t);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static CharSequence j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("4d91030", new Object[]{str});
        }
        try {
            int t = t(kra.c().e(), str, kra.c().a());
            if (t == 0) {
                return str;
            }
            return kra.c().e().getText(t);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static int k(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4757b4b", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, "dimen", str2);
        int b = kra.c().b(a2);
        if (b != 0) {
            return b;
        }
        int identifier = resources.getIdentifier(str, "dimen", str2);
        kra.c().g(a2, identifier);
        return identifier;
    }

    public static float l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c02f531", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            return o(str);
        }
        try {
            return mtq.c(Float.parseFloat(str));
        } catch (Throwable unused) {
            return o(str);
        }
    }

    public static int m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5986aa1b", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            return n(str);
        }
        try {
            return mtq.c(Float.parseFloat(str));
        } catch (Throwable unused) {
            return n(str);
        }
    }

    public static int n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dde54fde", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            str = str.replace(DIMEN_RESOURCE, "");
        }
        try {
            if (kra.c().f() != null && !TextUtils.isEmpty(kra.c().d())) {
                int k = k(kra.c().f(), str, kra.c().d());
                if (k == 0) {
                    return f(str);
                }
                return kra.c().f().getDimensionPixelSize(k);
            }
            return f(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static float o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f090c62", new Object[]{str})).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        if (str.startsWith(DIMEN_RESOURCE)) {
            str = str.replace(DIMEN_RESOURCE, "");
        }
        try {
            if (kra.c().f() != null && !TextUtils.isEmpty(kra.c().d())) {
                int k = k(kra.c().f(), str, kra.c().d());
                if (k == 0) {
                    return g(str);
                }
                return kra.c().f().getDimension(k);
            }
            return g(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return 0.0f;
        }
    }

    public static Drawable p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("dfa06df5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return r(str);
    }

    public static int q(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("deccd6d2", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, str2);
        int b = kra.c().b(a2);
        if (b != 0) {
            return b;
        }
        int identifier = resources.getIdentifier(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS, str2);
        kra.c().g(a2, identifier);
        return identifier;
    }

    public static Drawable r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7102006c", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(DRAWABLE_RESOURCE)) {
            str = str.replace(DRAWABLE_RESOURCE, "");
        }
        try {
            if (kra.c().f() != null && !TextUtils.isEmpty(kra.c().d())) {
                int q = q(kra.c().f(), str, kra.c().d());
                if (q == 0) {
                    return h(str);
                }
                return kra.c().f().getDrawable(q);
            }
            return h(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return u(str);
    }

    public static String u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f60d845", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(STRING_RESOURCE)) {
            str = str.replace(STRING_RESOURCE, "");
        }
        try {
            if (kra.c().f() != null && !TextUtils.isEmpty(kra.c().d())) {
                int t = t(kra.c().f(), str, kra.c().d());
                if (t == 0) {
                    return i(str);
                }
                return kra.c().f().getString(t);
            }
            return i(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static CharSequence v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("412d3946", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return w(str);
    }

    public static CharSequence w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("dc4ec73b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(STRING_RESOURCE)) {
            str = str.replace(STRING_RESOURCE, "");
        }
        try {
            if (kra.c().f() != null && !TextUtils.isEmpty(kra.c().d())) {
                int t = t(kra.c().f(), str, kra.c().d());
                if (t == 0) {
                    return j(str);
                }
                return kra.c().f().getText(t);
            }
            return j(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static int t(Resources resources, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9100b3f", new Object[]{resources, str, str2})).intValue();
        }
        if (resources == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String a2 = a(str, "string", str2);
        int b = kra.c().b(a2);
        if (b != 0) {
            return b;
        }
        int identifier = resources.getIdentifier(str, "string", str2);
        kra.c().g(a2, identifier);
        return identifier;
    }
}
