package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n71 implements ul7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliMonitorInterface f24547a = nq0.c();

    @Override // tb.ul7
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db371a1c", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f24547a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.a(str, str2, str3, str4, str5);
        }
    }

    @Override // tb.ul7
    public void b(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9adc9f", new Object[]{this, str, str2, str3, new Double(d)});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f24547a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.b(str, str2, str3, d);
        }
    }

    @Override // tb.ul7
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250c703", new Object[]{this, str, str2, str3});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f24547a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.c(str, str2, str3);
        }
    }

    @Override // tb.ul7
    public void d(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d21c1e9", new Object[]{this, str, str2, new Double(d)});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f24547a;
        if (aliMonitorInterface != null) {
            aliMonitorInterface.d(str, str2, d);
        }
    }
}
