package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bcy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f16327a = "";
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static final Map<String, String> f = new HashMap();

    public static synchronized String a(String str) {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
            }
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            Map<String, String> map = f;
            if (((HashMap) map).containsKey(concat)) {
                String str2 = (String) ((HashMap) map).get(concat);
                if (vux.f(str2)) {
                    return str2;
                }
            }
            return "";
        }
    }

    public static synchronized void b() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            }
        }
    }

    public static synchronized void c(String str, String str2) {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
                return;
            }
            String concat = "apdidTokenCache".concat(String.valueOf(str));
            Map<String, String> map = f;
            if (((HashMap) map).containsKey(concat)) {
                ((HashMap) map).remove(concat);
            }
            ((HashMap) map).put(concat, str2);
        }
    }

    public static synchronized void d(oay oayVar) {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f38c275f", new Object[]{oayVar});
                return;
            }
            if (oayVar != null) {
                f16327a = oayVar.f25271a;
                b = oayVar.b;
                c = oayVar.c;
            }
        }
    }

    public static synchronized void e(zay zayVar) {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f38c9bbe", new Object[]{zayVar});
                return;
            }
            if (zayVar != null) {
                f16327a = zayVar.f32658a;
                b = zayVar.b;
                d = zayVar.d;
                e = zayVar.e;
                c = zayVar.c;
            }
        }
    }

    public static synchronized boolean f(Context context, String str) {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
            }
            long j = 86400000;
            try {
                long a2 = yby.a(context);
                if (a2 >= 0) {
                    j = a2;
                }
            } catch (Throwable unused) {
            }
            if (Math.abs(System.currentTimeMillis() - yby.q(context, str)) < j) {
                return true;
            }
            return false;
        }
    }

    public static synchronized String g() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            return f16327a;
        }
    }

    public static void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            f16327a = str;
        }
    }

    public static synchronized String i() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
            }
            return b;
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
        } else {
            b = str;
        }
    }

    public static synchronized String k() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
            }
            return d;
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            c = str;
        }
    }

    public static synchronized String m() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]);
            }
            return e;
        }
    }

    public static void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            d = str;
        }
    }

    public static synchronized String o() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
            }
            return c;
        }
    }

    public static void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{str});
        } else {
            e = str;
        }
    }

    public static synchronized zay q() {
        synchronized (bcy.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zay) ipChange.ipc$dispatch("6e6d26c4", new Object[0]);
            }
            return new zay(f16327a, b, c, d, e);
        }
    }

    public static void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        ((HashMap) f).clear();
        f16327a = "";
        b = "";
        d = "";
        e = "";
        c = "";
    }
}
