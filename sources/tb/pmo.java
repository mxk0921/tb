package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(343933204);
    }

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        ALog.d("Sync." + str, str2, objArr);
    }

    public static void b(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
            return;
        }
        ALog.e("Sync." + str, str2, th, objArr);
    }

    public static void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
            return;
        }
        ALog.e("Sync." + str, str2, objArr);
    }
}
