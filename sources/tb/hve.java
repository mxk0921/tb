package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static gfc f20913a;

    static {
        t2o.a(486539289);
    }

    public static void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{str, str2, str3, str4, str5});
            return;
        }
        gfc gfcVar = f20913a;
        if (gfcVar == null) {
            fve.f("InfoFlowMonitor", "commitFail gInfoFlowMonitor == null");
            return;
        }
        try {
            gfcVar.commitFail(str, str2, str3, str4, str5);
        } catch (Throwable th) {
            fve.c("InfoFlowMonitor", "commitFail error", th);
        }
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{str, str2, str3});
            return;
        }
        gfc gfcVar = f20913a;
        if (gfcVar == null) {
            fve.f("InfoFlowMonitor", "commitSuccess gInfoFlowMonitor == null");
            return;
        }
        try {
            gfcVar.commitSuccess(str, str2, str3);
        } catch (Throwable th) {
            fve.c("InfoFlowMonitor", "commitSuccess error", th);
        }
    }

    public static void c(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e9bb86", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        gfc gfcVar = f20913a;
        if (gfcVar == null) {
            fve.f("InfoFlowMonitor", "counterCommit2 gInfoFlowMonitor == null");
            return;
        }
        try {
            gfcVar.a(str, str2, str3, d);
        } catch (Throwable th) {
            fve.c("InfoFlowMonitor", "counterCommit2 error", th);
        }
    }

    public static void d(gfc gfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a072d71", new Object[]{gfcVar});
        } else {
            f20913a = gfcVar;
        }
    }
}
