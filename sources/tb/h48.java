package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h48 implements fo6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final okn f20402a;

    static {
        t2o.a(815792273);
        t2o.a(1034944535);
    }

    public h48(okn oknVar) {
        this.f20402a = oknVar;
    }

    @Override // tb.fo6
    public void errorReport(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            return;
        }
        b4p.a("DynamicCard", "jarvis run failed: " + str3);
        okn oknVar = this.f20402a;
        if (oknVar != null && oknVar.m()) {
            AppMonitor.Alarm.commitFail("tppJarvis", r4p.VALUE_MODULE_DYNAMIC_CARD, str2, str3);
            this.f20402a.y(r4p.VALUE_JARVIS_STATUS_FAIL, "");
        }
    }

    @Override // tb.fo6
    public void notify(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            return;
        }
        okn oknVar = this.f20402a;
        if (oknVar != null && oknVar.m()) {
            AppMonitor.Alarm.commitSuccess("tppJarvis", r4p.VALUE_MODULE_DYNAMIC_CARD);
            this.f20402a.y("ok", str2);
        }
    }
}
