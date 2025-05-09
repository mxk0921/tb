package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xhh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final c f31400a = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

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
                Log.e("RProxy", b(str, objArr));
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
                xhh.a("exception", th.getClass().getSimpleName(), th.getMessage());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    xhh.a("exception", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber()));
                }
                xhh.a("exception", "-----------");
            }
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
            return;
        }
        TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.JAVA_ONLY).addHeaderInfo(str, b(objArr));
        ((b) f31400a).a(str, objArr);
    }

    public static String b(Object... objArr) {
        Object[] objArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bac6f5a2", new Object[]{objArr});
        }
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    sb.append("->");
                    sb.append(obj2);
                }
            } else {
                sb.append("->");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void c(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21aa2c1b", new Object[]{th});
        } else {
            ((b) f31400a).c(th);
        }
    }
}
