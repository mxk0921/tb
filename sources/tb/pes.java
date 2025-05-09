package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.page.ITMSPage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class pes implements v8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bbs f26049a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements twd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.twd
        public qcs createRender(ITMSPage iTMSPage, ocs ocsVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qcs) ipChange.ipc$dispatch("2e8fbe8e", new Object[]{this, iTMSPage, ocsVar});
            }
            ckf.g(iTMSPage, "page");
            ckf.g(ocsVar, "renderListener");
            if (t8s.g(iTMSPage.c())) {
                return new ak1(iTMSPage, ocsVar);
            }
            return new qes(iTMSPage, ocsVar);
        }

        @Override // tb.twd
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(834666593);
        t2o.a(834666586);
    }

    public pes(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f26049a = bbsVar;
        d().k0(new oas(d()));
        d().S().a("canvasRuntimeType", "h5");
        TMSLogger.a("TMSWebGameSolutionProxy", "init");
    }

    @Override // tb.v8c
    public twd a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.v8c
    public rwd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("27585cf1", new Object[]{this});
        }
        return new nes(d());
    }

    @Override // tb.v8c
    public void c(pas pasVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef477cba", new Object[]{this, pasVar});
            return;
        }
        ckf.g(pasVar, wzi.LAUNCHER);
        pasVar.p(new acs(d(), pasVar));
        pasVar.p(new w9s(d(), pasVar));
        pasVar.p(new eds(d(), pasVar));
        pasVar.p(new oes(d(), pasVar));
    }

    public bbs d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("57ded820", new Object[]{this});
        }
        return this.f26049a;
    }
}
