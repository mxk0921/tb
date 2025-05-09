package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class eve {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static efc f18839a;

    static {
        t2o.a(486539285);
    }

    public static void a(efc efcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fd14b5", new Object[]{efcVar});
        } else {
            f18839a = efcVar;
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f12b9171", new Object[]{str, str2});
            return;
        }
        efc efcVar = f18839a;
        if (efcVar == null) {
            fve.f("InfoFlowLauncherTracker", "traceEnd sInfoFlowLauncherTracker == null");
            return;
        }
        try {
            efcVar.a(str, str2);
        } catch (InfoFlowRuntimeException e) {
            fve.c("InfoFlowLauncherTracker", "traceStart error", e);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38b0738", new Object[]{str, str2});
            return;
        }
        efc efcVar = f18839a;
        if (efcVar == null) {
            fve.f("InfoFlowLauncherTracker", "traceStart sInfoFlowLauncherTracker == null");
            return;
        }
        try {
            efcVar.b(str, str2);
        } catch (InfoFlowRuntimeException e) {
            fve.c("InfoFlowLauncherTracker", "traceStart error", e);
        }
    }
}
