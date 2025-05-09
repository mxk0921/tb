package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class c4p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c4p d = new c4p();
    public static final c e;

    /* renamed from: a  reason: collision with root package name */
    public String f16859a = "LibSF.";
    public boolean b;
    public volatile Handler c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
                return;
            }
            try {
                TLog.loge(QueryParamsManager.CartFeedFlowType.search, str, str2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void b(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29cf83f6", new Object[]{this, str, str2, th});
                return;
            }
            try {
                TLog.loge(QueryParamsManager.CartFeedFlowType.search, str, str2, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16860a;

        public b(String str) {
            this.f16860a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(j3p.f(), this.f16860a, 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    public static void B(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119b5e1d", new Object[]{str, str2, json});
        } else if (d.b) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("\n");
                sb.append(json);
            } catch (Exception e2) {
                c4p c4pVar = d;
                c4pVar.u(str, "Format err: " + str2, e2);
            }
        }
    }

    public static void C(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb9309a", new Object[]{str, str2, objArr});
            return;
        }
        c4p c4pVar = d;
        if (c4pVar.b) {
            try {
                String format = String.format(str2, objArr);
                c4pVar.u(str, format, null);
                c cVar = e;
                if (cVar != null) {
                    ((a) cVar).a(str, format);
                }
            } catch (Exception e2) {
                c4p c4pVar2 = d;
                c4pVar2.u(str, "Format err: " + str2, e2);
            }
        }
    }

    public static void D(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c85e16", new Object[]{str, str2, objArr});
            return;
        }
        c4p c4pVar = d;
        if (c4pVar.b) {
            if (objArr != null) {
                try {
                    if (objArr.length != 0) {
                        c4pVar.v(str, String.format(str2, objArr), null);
                    }
                } catch (Exception e2) {
                    c4p c4pVar2 = d;
                    c4pVar2.u(str, "Format err: " + str2, e2);
                    return;
                }
            }
            c4pVar.v(str, str2, null);
        }
    }

    public static void E(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bfd7d48", new Object[]{str, str2, objArr});
            return;
        }
        c4p c4pVar = d;
        if (c4pVar.b) {
            try {
                c4pVar.w(str, String.format(str2, objArr), null);
            } catch (Exception e2) {
                c4p c4pVar2 = d;
                c4pVar2.u(str, "Format err: " + str2, e2);
            }
        }
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4698cfe", new Object[]{str, str2, objArr});
        } else if (d.b) {
            try {
                String.format(str2, objArr);
            } catch (Exception e2) {
                c4p c4pVar = d;
                c4pVar.u(str, "Format err: " + str2, e2);
            }
        }
    }

    public static String h(Throwable th, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82a27aff", new Object[]{th, str});
        }
        if (th == null) {
            return str;
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        if (str != null) {
            printWriter.append((CharSequence) str);
        }
        printWriter.append(":");
        th.printStackTrace(printWriter);
        return stringWriter.toString();
    }

    public static c4p i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c4p) ipChange.ipc$dispatch("1c6ac1e6", new Object[0]);
        }
        return d;
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[0])).booleanValue();
        }
        return d.b;
    }

    public static void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e6879b", new Object[]{str, str2});
        } else {
            d.b(str, str2);
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1486b29c", new Object[]{str, str2});
        } else {
            d.d(str, str2);
        }
    }

    public static void o(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f23ad9", new Object[]{str, str2, th});
        } else {
            d.e(str, str2, th);
        }
    }

    public static void p(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c9b8ae", new Object[]{str, str2});
        } else {
            d.A(str, str2);
        }
    }

    public static void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7825b08", new Object[]{new Boolean(z)});
        } else {
            d.r(z);
        }
    }

    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
        } else if (this.b) {
            w(this.f16859a + str, "[warning] " + str2, null);
        }
    }

    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
        } else if (this.b) {
            t(this.f16859a + str, "[debug] " + str2, null);
        }
    }

    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d2df74", new Object[]{this, str, str2, objArr});
        } else if (this.b) {
            String format = String.format(str2, objArr);
            t(this.f16859a + str, "[debug] ".concat(format), null);
        }
    }

    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
        } else {
            f(str, str2, null, false);
        }
    }

    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
        } else {
            f(str, str2, th, true);
        }
    }

    public void f(String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902b56ff", new Object[]{this, str, str2, th, new Boolean(z)});
            return;
        }
        String str3 = this.f16859a + str;
        String str4 = "[error] " + str2;
        u(str3, str4, th);
        x(str3, str4, th);
        if (z) {
            y(str3, str4);
        }
    }

    public void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4487ff5", new Object[]{this, str, str2, objArr});
        } else {
            f(str, String.format(str2, objArr), null, false);
        }
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2039022b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final Handler k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        if (this.c == null) {
            synchronized (c4p.class) {
                try {
                    if (this.c == null) {
                        this.c = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cc148a", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca6549", new Object[]{this, str});
            return;
        }
        this.f16859a = str;
        if (TextUtils.isEmpty(str)) {
            this.f16859a = "SET_YOUR_TAG_IN_CONFIG.";
        }
    }

    public final void t(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a86ea3", new Object[]{this, str, str2, th});
        }
    }

    public final void u(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e6de42", new Object[]{this, str, str2, th});
        } else {
            Log.e(str, str2, th);
        }
    }

    public final void v(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e09cbe", new Object[]{this, str, str2, th});
        }
    }

    public final void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254ab770", new Object[]{this, str, str2, th});
        }
    }

    public final void x(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd4d76", new Object[]{this, str, str2, th});
            return;
        }
        c cVar = e;
        if (cVar != null) {
            try {
                if (th == null) {
                    ((a) cVar).a(str, str2);
                } else {
                    ((a) cVar).b(str, str2, th);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void y(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cdd287", new Object[]{this, str, str2});
        } else if (this.b) {
            z(str + "  " + str2);
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            k().post(new b(str));
        }
    }

    static {
        t2o.a(993001975);
        try {
            e = new a();
        } catch (Throwable unused) {
            Log.e("[XS.base]", "no tlog");
        }
    }
}
