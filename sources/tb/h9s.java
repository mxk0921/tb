package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.TMSGameCanvasRenderFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class h9s implements v8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f20488a;

    static {
        t2o.a(834666587);
        t2o.a(834666586);
    }

    public h9s(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f20488a = bbsVar;
        d().k0(new csf(d()));
    }

    @Override // tb.v8c
    public twd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return new TMSGameCanvasRenderFactory(d());
    }

    @Override // tb.v8c
    public rwd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("27585cf1", new Object[]{this});
        }
        return new k9s(d());
    }

    @Override // tb.v8c
    public void c(pas pasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef477cba", new Object[]{this, pasVar});
            return;
        }
        ckf.g(pasVar, wzi.LAUNCHER);
        pasVar.p(new scs(d(), pasVar));
        pasVar.p(new acs(d(), pasVar));
        pasVar.p(new w9s(d(), pasVar));
        pasVar.p(new tas(d(), pasVar));
        pasVar.p(new sas(d(), pasVar));
        pasVar.p(new eds(d(), pasVar));
        pasVar.p(new j9s(d(), pasVar));
        pasVar.p(new dcs(d(), pasVar));
    }

    public bbs d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f20488a;
    }
}
