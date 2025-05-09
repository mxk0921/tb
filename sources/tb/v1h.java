package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v1h implements vvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vvc f29734a;
    public qlc b;

    static {
        t2o.a(779093404);
        t2o.a(806355921);
    }

    @Override // tb.vvc
    public bwd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("34c31396", new Object[]{this});
        }
        vvc vvcVar = this.f29734a;
        if (vvcVar == null) {
            return null;
        }
        bwd a2 = vvcVar.a();
        if (!wd0.a()) {
            return a2;
        }
        p1h p1hVar = new p1h();
        p1hVar.r(a2);
        p1hVar.s(this.b);
        return p1hVar;
    }

    public void b(vvc vvcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecec823", new Object[]{this, vvcVar});
        } else {
            this.f29734a = vvcVar;
        }
    }

    public void c(qlc qlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55050c06", new Object[]{this, qlcVar});
        } else {
            this.b = qlcVar;
        }
    }
}
