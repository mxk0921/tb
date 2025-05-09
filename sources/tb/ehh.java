package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ehh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18579a;

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7bd1c", new Object[]{str, objArr});
        } else if (f18579a) {
            String c = c(objArr);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            sb.append(c);
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
            return;
        }
        String c = c(objArr);
        Log.e("TCrash", str + ":" + c);
    }

    public static String c(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bac6f5a2", new Object[]{objArr});
        }
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append("->");
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    public static void d(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21aa2c1b", new Object[]{th});
            return;
        }
        b("exception", th.getClass().getSimpleName(), th.getMessage());
        th.printStackTrace();
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{new Boolean(z)});
        } else {
            f18579a = z;
        }
    }

    public static void f(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5b19e5", new Object[]{th});
            return;
        }
        d(th);
        if (!f18579a) {
            return;
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new RuntimeException(th);
    }
}
