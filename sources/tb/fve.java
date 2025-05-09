package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static jfc f19553a;
    public static boolean b;
    public static final int c = 2;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final String c = "performance";

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String[] f19554a;
        public final /* synthetic */ String b;

        public a(String[] strArr, String str) {
            this.f19554a = strArr;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String a2 = fve.a(this.f19554a);
            StringBuilder sb = new StringBuilder(this.b.length() + a2.length() + 3);
            sb.append('[');
            sb.append(this.b);
            sb.append("]:");
            sb.append(a2);
            Log.e(c, sb.toString());
        }
    }

    static {
        t2o.a(486539286);
    }

    public static /* synthetic */ String a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5fe98958", new Object[]{strArr});
        }
        return g(strArr);
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
        } else if (c <= 3) {
            h(3, str, null, strArr);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else if (c <= 6) {
            h(6, str, th, str2);
        }
    }

    public static void d(String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee75e40", new Object[]{str, th, strArr});
        } else if (c <= 6) {
            h(6, str, th, strArr);
        }
    }

    public static void e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else if (c <= 6) {
            h(6, str, null, strArr);
        }
    }

    public static void f(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7300a5", new Object[]{str, strArr});
        } else if (c <= 4) {
            h(4, str, null, strArr);
        }
    }

    public static String g(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str == null) {
                return "";
            }
            return str;
        }
        StringBuilder sb = new StringBuilder(strArr.length * 16);
        for (String str2 : strArr) {
            if (str2 != null) {
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static void h(int i, String str, Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e00b6c", new Object[]{new Integer(i), str, th, strArr});
            return;
        }
        String g = g(strArr);
        if (b) {
            i(i, str, g, th);
        }
        if (f19553a != null) {
            try {
                j(i, str, g, th);
            } catch (Throwable unused) {
                i(i, str, g, th);
            }
        } else {
            i(i, str, g, th);
        }
    }

    public static void i(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312917cc", new Object[]{new Integer(i), str, str2, th});
        } else if (i == 6) {
            Log.e(str, str2, th);
        }
    }

    public static void j(int i, String str, String str2, Throwable th) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516dfaaf", new Object[]{new Integer(i), str, str2, th});
            return;
        }
        if (th != null) {
            str3 = str;
        } else {
            str3 = "INFO_FLOW";
        }
        if (i == 2) {
            f19553a.e(str3, str, str2);
        } else if (i == 3) {
            f19553a.c(str3, str, str2);
        } else if (i == 4) {
            f19553a.d(str3, str, str2);
        } else if (i != 5) {
            if (i == 6) {
                if (th != null) {
                    f19553a.e(str, str2, th);
                } else {
                    f19553a.b(str3, str, str2);
                }
            }
        } else if (th != null) {
            f19553a.w(str, str2, th);
        } else {
            f19553a.a(str3, str, str2);
        }
    }

    public static void k(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f37747e", new Object[]{str, strArr});
        } else if (b) {
            get.a().e(new a(strArr, str));
        }
    }

    public static void l(jfc jfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ccc98d", new Object[]{jfcVar});
            return;
        }
        f19553a = jfcVar;
        b = eue.b();
    }

    public static void m(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fbe857", new Object[]{str, strArr});
        } else if (c <= 5) {
            h(5, str, null, strArr);
        }
    }
}
