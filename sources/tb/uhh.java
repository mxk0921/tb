package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29385a = false;
    public static final c b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(407896094);
            t2o.a(407896095);
        }

        public static String b(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c6cc3ac", new Object[]{str, objArr});
            }
            StringBuilder sb = new StringBuilder(" ");
            sb.append(str);
            if (objArr == null) {
                return "";
            }
            for (Object obj : objArr) {
                if (obj != null) {
                    sb.append("->");
                    sb.append(obj.toString());
                }
            }
            return sb.toString();
        }

        public void a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a05cf23b", new Object[]{this, str, objArr});
            } else {
                Log.e("FastSp", b(str, objArr));
            }
        }

        public void c(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdf1c6b7", new Object[]{this, str, objArr});
            } else {
                b(str, objArr);
            }
        }

        public void d(Throwable th) {
            StackTraceElement[] stackTrace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21aa2c1b", new Object[]{this, th});
                return;
            }
            th.printStackTrace();
            if (th.getMessage() != null) {
                uhh.b("exception", th.getClass().getSimpleName(), th.getMessage());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    uhh.b("exception", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
                }
                uhh.b("exception", "-----------");
            }
        }

        public void e(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad5b19e5", new Object[]{this, th});
            } else if (uhh.a()) {
                throw new RuntimeException(th);
            }
        }

        public void f(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("257aae69", new Object[]{this, str, objArr});
            } else {
                b(str, objArr);
            }
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    static {
        t2o.a(407896092);
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return f29385a;
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else {
            ((b) b).a(str, objArr);
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        } else if (f29385a) {
            ((b) b).c(str, objArr);
        }
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21aa2c1b", new Object[]{th});
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        q19.b().commit("exception", "exception", "e", th.getMessage(), stringWriter.toString(), 0L);
        ((b) b).d(th);
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
        } else {
            f29385a = z;
        }
    }

    public static void f(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5b19e5", new Object[]{th});
        } else if (f29385a) {
            ((b) b).e(th);
        }
    }

    public static void g(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257aae69", new Object[]{str, objArr});
        } else if (f29385a) {
            ((b) b).f(str, objArr);
        }
    }
}
