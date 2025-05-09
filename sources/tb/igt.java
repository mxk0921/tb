package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class igt implements gfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliMonitorInterface f21306a = nq0.c();

    static {
        t2o.a(491782155);
        t2o.a(486539306);
    }

    @Override // tb.gfc
    public void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15e9bb86", new Object[]{this, str, str2, str3, new Double(d)});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f21306a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.b(str, str2, str3, d);
        }
    }

    @Override // tb.gfc
    public void commitFail(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c1ffee", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f21306a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.a(str, str2, str3, str4, str5);
        }
    }

    @Override // tb.gfc
    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f21306a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.c(str, str2, str3);
        }
    }
}
