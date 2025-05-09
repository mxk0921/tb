package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class y54 implements fo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final okn f31860a;

    static {
        t2o.a(815792272);
        t2o.a(1034944535);
    }

    public y54(okn oknVar) {
        this.f31860a = oknVar;
    }

    @Override // tb.fo6
    public void errorReport(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            return;
        }
        b4p.a("CommonDynamicCard", "jarvis run failed: " + str3);
        okn oknVar = this.f31860a;
        if (oknVar != null && oknVar.l()) {
            AppMonitor.Alarm.commitFail("tppJarvis", r4p.VALUE_MODULE_DYNAMIC_CARD, str2, str3);
            oknVar.x(r4p.VALUE_JARVIS_STATUS_FAIL, "");
        }
    }

    @Override // tb.fo6
    public void notify(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            return;
        }
        okn oknVar = this.f31860a;
        if (oknVar != null) {
            AppMonitor.Alarm.commitSuccess("tppJarvis", r4p.VALUE_MODULE_DYNAMIC_CARD);
            oknVar.x("ok", str2);
        }
    }
}
