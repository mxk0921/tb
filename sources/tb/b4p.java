package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tlog.adapter.AdapterForTLog;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16177a;
    public static volatile Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16178a;

        public a(String str) {
            this.f16178a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(Globals.getApplication(), this.f16178a, 0).show();
            }
        }
    }

    static {
        t2o.a(815792244);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5ebbdb", new Object[]{str, str2});
        } else if (str != null && str2 != null && f16177a) {
            "TBSearch.".concat(str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afee6dc", new Object[]{str, str2});
        } else if (str != null && str2 != null && f16177a) {
            Log.e("TBSearch.".concat(str), str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7f92e0", new Object[]{str, str2});
        } else if (str != null && str2 != null && f16177a) {
            "TBSearch.".concat(str);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e41ecee", new Object[]{str, str2});
        } else if (str != null && str2 != null && f16177a) {
            "TBSearch.".concat(str);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa89899", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[dataError] " + str2;
        r(str3, str4, null);
        t(str3, str4, null);
        u(str3, str4);
    }

    public static void f(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8ae4fc", new Object[]{str, str2, th});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[dataError] " + str2;
        r(str3, str4, th);
        t(str3, str4, th);
        u(str3, str4);
    }

    public static void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("259b5abc", new Object[]{str, str2});
            return;
        }
        s("TBSearch." + str, "[debugInfo] " + str2, null);
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98db8b9", new Object[]{str, str2});
            return;
        }
        s("TBSearch." + str, "[decisionBranch] " + str2, null);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2039022b", new Object[0])).booleanValue();
        }
        return f16177a;
    }

    public static Handler j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[0]);
        }
        if (b == null) {
            synchronized (b4p.class) {
                try {
                    if (b == null) {
                        b = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23162eac", new Object[]{str, str2});
        } else {
            l(str, str2, null);
        }
    }

    public static void l(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4483e8c9", new Object[]{str, str2, th});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[mainFailure] " + str2;
        r(str3, str4, th);
        t(str3, str4, th);
        u(str3, str4);
    }

    public static void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abcf8", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[pageInfo] " + str2;
        s(str3, str4, null);
        t(str3, str4, null);
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb430496", new Object[]{str, str2});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[paramError] " + str2;
        r(str3, str4, null);
        t(str3, str4, null);
        u(str3, str4);
    }

    public static void o(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8494d2b3", new Object[]{str, str2});
        } else {
            p(str, str2, null);
        }
    }

    public static void p(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fbdf22", new Object[]{str, str2, th});
            return;
        }
        String str3 = "TBSearch." + str;
        String str4 = "[resumableFailure] " + str2;
        r(str3, str4, th);
        t(str3, str4, th);
    }

    public static void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cc148a", new Object[]{new Boolean(z)});
        } else {
            f16177a = z;
        }
    }

    public static void r(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e6de42", new Object[]{str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    public static void s(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e09cbe", new Object[]{str, str2, th});
        }
    }

    public static void t(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2745e8c0", new Object[]{str, str2, th});
            return;
        }
        try {
            if (th == null) {
                AdapterForTLog.loge(str, str2);
            } else {
                AdapterForTLog.loge(str, str2, th);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cdd287", new Object[]{str, str2});
        } else if (f16177a) {
            v(str + "  " + str2);
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{str});
        } else {
            j().post(new a(str));
        }
    }
}
