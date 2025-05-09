package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import tb.eyn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dwh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int LEVEL_DEBUG = 0;
    public static final int LEVEL_ERROR = 3;
    public static final int LEVEL_LOG = 1;
    public static final int LEVEL_WARN = 2;
    public static final String TAG = "[Weex]";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18111a = vvh.m();
    public static volatile c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29cf83f6", new Object[]{this, str, str2, th});
                return;
            }
            try {
                if (th != null) {
                    TLog.loge(dwh.TAG, str, str2, th);
                    eyn.c a2 = eyn.a();
                    a2.a(str + ":" + str2, th);
                } else {
                    TLog.loge(dwh.TAG, str, str2);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18112a;

        public b(String str) {
            this.f18112a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(vvh.c(), this.f18112a, 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    public static void A(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4971fce6", new Object[]{str, str2, th});
        } else if (f18111a) {
            new StringBuilder(TAG).append(str);
        }
    }

    public static void B(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f779fd30", new Object[]{str, th});
        } else {
            A(str, "", th);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            b("", str);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (f18111a) {
            new StringBuilder(TAG).append(str);
        }
    }

    public static void c(com.taobao.android.weex_framework.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa2a2fb", new Object[]{aVar, str});
        } else {
            d(aVar, str, null);
        }
    }

    public static void d(com.taobao.android.weex_framework.a aVar, String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34c8bda", new Object[]{aVar, str, th});
        } else {
            j(n(aVar), str, th);
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            f("", str);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            g(str, str2, null);
        }
    }

    public static void g(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            j(str, str2, th);
        }
    }

    public static void h(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
        } else {
            g(str, "", th);
        }
    }

    public static void i(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3002509", new Object[]{th});
        } else {
            h("", th);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49ab31b8", new Object[]{str, str2, th});
        } else {
            k(str, str2, th, "Weex2 Java报错, 请查看adb logcat, 过滤'weex': \n");
        }
    }

    public static void k(String str, String str2, Throwable th, String str3) {
        Throwable targetException;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46dc5d82", new Object[]{str, str2, th, str3});
            return;
        }
        if ((th instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th).getTargetException()) != null) {
            th = targetException;
        }
        c cVar = b;
        if (cVar != null) {
            ((a) cVar).a(str, str2, th);
        }
        if (!r()) {
            l(str, str2, th);
        }
        if (th != null && f18111a) {
            s(str3 + str2);
        }
    }

    public static void l(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9437974", new Object[]{str, str2, th});
            return;
        }
        Log.e(TAG + str, str2, th);
    }

    public static String m(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8de32fc9", new Object[]{th});
        }
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String n(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5406e3a8", new Object[]{aVar});
        }
        return "[InstId " + aVar.getInstanceId() + "]";
    }

    public static void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            p("", str);
        }
    }

    public static void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else if (f18111a) {
            q(str, str2);
        }
    }

    public static void q(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d124b661", new Object[]{str, str2});
        } else if (f18111a) {
            new StringBuilder(TAG).append(str);
        }
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[0])).booleanValue();
        }
        return f18111a;
    }

    public static void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9046aa", new Object[]{str});
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            Toast.makeText(vvh.c(), str, 0).show();
        } else {
            new Handler(Looper.getMainLooper()).post(new b(str));
        }
    }

    public static void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51728e1", new Object[]{new Boolean(z)});
        } else {
            f18111a = z;
        }
    }

    public static void u(com.taobao.android.weex_framework.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f696e29", new Object[]{aVar, str});
        } else if (f18111a) {
            z(n(aVar), str);
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else {
            w("", str);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else if (f18111a) {
            z(str, str2);
        }
    }

    public static void x(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
        } else if (f18111a) {
            A(str, str2, th);
        }
    }

    public static void y(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
        } else if (f18111a) {
            B(str, th);
        }
    }

    public static void z(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caab226f", new Object[]{str, str2});
        } else {
            A(str, str2, null);
        }
    }

    static {
        t2o.a(982516248);
        try {
            b = new a();
        } catch (Throwable unused) {
            Log.e(TAG, "no tlog");
        }
    }
}
