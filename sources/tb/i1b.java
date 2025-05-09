package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i1b implements txd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i0b f21036a;

    static {
        t2o.a(729809605);
        t2o.a(729810100);
    }

    public i1b(fdc fdcVar, String str, IHomeSubTabController iHomeSubTabController) {
        this.f21036a = new i0b(new e1b(this, new f1b(iHomeSubTabController, fdcVar)), str);
        fve.e("HomeMainLandInfoFlowHelper", "HomeMainLandInfoFlowHelper 构造函数");
    }

    @Override // tb.txd
    public IHomeSubTabController a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("ae0b87e6", new Object[]{this});
        }
        return this.f21036a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        i0b i0bVar = this.f21036a;
        if (i0bVar != null) {
            i0bVar.onDestroy();
            this.f21036a = null;
        }
        fve.e("HomeMainLandInfoFlowHelper", "destroy");
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("53729d5b", new Object[]{this});
        }
        return "recommend";
    }

    public i0b d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0b) ipChange.ipc$dispatch("a153b7aa", new Object[]{this});
        }
        return this.f21036a;
    }
}
