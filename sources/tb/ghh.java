package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ghh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final c f20003a = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(969932826);
            t2o.a(969932827);
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
                Log.e("VThread", b(str, objArr));
            }
        }

        public void c(Throwable th) {
            StackTraceElement[] stackTrace;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("21aa2c1b", new Object[]{this, th});
                return;
            }
            th.printStackTrace();
            if (th.getMessage() != null) {
                ghh.a("exception", th.getClass().getSimpleName(), th.getMessage());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    ghh.a("exception", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
                }
                ghh.a("exception", "-----------");
            }
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    static {
        t2o.a(969932824);
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
        } else {
            ((b) f20003a).a(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        }
    }

    public static void c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21aa2c1b", new Object[]{th});
        } else {
            ((b) f20003a).c(th);
        }
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5b19e5", new Object[]{th});
        }
    }
}
