package tb;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class agh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile Handler e;

    /* renamed from: a  reason: collision with root package name */
    public static final String f15724a = "FEIS.";
    public static final boolean b = jld.a();
    public static final boolean c = true;
    public static final c d = new b();
    public static Boolean f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15725a;

        public a(String str) {
            this.f15725a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(caa.c(), this.f15725a, 0).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1175515f", new Object[]{this, str, str2});
            } else {
                c4p.D(str, "%s", str2);
            }
        }

        public void b(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29cf83f6", new Object[]{this, str, str2, th});
            } else {
                c4p.C(str, "%s", c4p.h(th, str2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface c {
    }

    static {
        t2o.a(481296428);
        c4p.i().r(caa.q());
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else if (b) {
            StringBuilder sb = new StringBuilder();
            sb.append(f15724a);
            sb.append(str);
            new StringBuilder("[debug] ").append(str2);
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9d2df74", new Object[]{str, str2, objArr});
        } else if (b) {
            String str3 = f15724a + str;
            String concat = "[debug] ".concat(String.format(str2, objArr));
            k(str3, concat, null);
            i(str3, concat);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            e(str, str2, null, true);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
        } else {
            e(str, str2, th, true);
        }
    }

    public static void e(String str, String str2, Throwable th, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902b56ff", new Object[]{str, str2, th, new Boolean(z)});
            return;
        }
        String str3 = f15724a + str;
        String str4 = "[error] " + str2;
        if (b) {
            j(str, str4);
            if (z) {
                n(str3, str4);
            }
        }
        if (c) {
            o(str3, str3, str4, th);
        }
    }

    public static String f(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92534e93", new Object[]{str, th});
        }
        if (th != null) {
            if (f == null) {
                f = Boolean.valueOf(lg4.p());
            }
            if (f.booleanValue()) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                if (str != null) {
                    printWriter.append((CharSequence) str);
                }
                printWriter.append(":");
                th.printStackTrace(printWriter);
                return stringWriter.toString();
            } else if (str == null) {
                return th.getMessage();
            } else {
                return str + ":" + th.getMessage();
            }
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }

    public static Handler g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[0]);
        }
        if (e == null) {
            synchronized (agh.class) {
                try {
                    if (e == null) {
                        e = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else if (b) {
            String str3 = f15724a + str;
            String str4 = "[info] " + str2;
            k(str3, str4, null);
            i(str3, str4);
            l(str3, str4, null);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c526135", new Object[]{str, str2});
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f28c36", new Object[]{str, str2});
        }
    }

    public static void k(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e09cbe", new Object[]{str, str2, th});
        }
    }

    public static void l(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd4d76", new Object[]{str, str2, th});
            return;
        }
        c cVar = d;
        if (cVar != null) {
            try {
                if (th == null) {
                    ((b) cVar).a(str, str2);
                } else {
                    ((b) cVar).b(str, str2, th);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eff4dfd", new Object[]{str});
        } else {
            g().post(new a(str));
        }
    }

    public static void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cdd287", new Object[]{str, str2});
        } else if (b) {
            m(str + "  " + str2);
        }
    }

    public static void o(String str, String str2, String str3, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcad526", new Object[]{str, str2, str3, th});
            return;
        }
        try {
            if (th == null) {
                p(str, str2, str3);
            } else {
                q(str + "|" + str2 + "|" + str3, "-1", f("", th));
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void p(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1427d5", new Object[]{str, str2, str3});
        } else {
            TLogTracker.f(str, str2, str3);
        }
    }

    public static void q(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d8f07b", new Object[]{str, str2, str3});
        } else {
            TLogTracker.i(str, str2, str3);
        }
    }

    public static void r(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30511c2a", new Object[]{str, str2, str3});
            return;
        }
        if (b) {
            l(str + "|" + str2, str3, null);
        }
        if (c) {
            p(str, str2, str3);
        }
    }
}
