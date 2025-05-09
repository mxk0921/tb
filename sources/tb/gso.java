package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20197a = "TB-Scan";

    static {
        t2o.a(760217735);
    }

    public static void a(Throwable th, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf5c21c", new Object[]{th, str, objArr});
            return;
        }
        try {
            b("%s exceptionWith{\n%s}", str, Log.getStackTraceString(th));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a05cf23b", new Object[]{str, objArr});
            return;
        }
        try {
            Log.e(f20197a, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf1c6b7", new Object[]{str, objArr});
        }
    }
}
