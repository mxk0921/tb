package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.windvane.TBACCS;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.mix.h5_render.TMSTinyH5APIBridge;
import com.taobao.themis.mix.h5_render.TMSTinyH5EventBridge;
import com.taobao.themis.mix.weex_render.TMSWeexAPIBridge;
import com.taobao.themis.pub.extension.TinyAppExtension;
import com.taobao.themis.pub_kit.config.PubContainerContext;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class jcs extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements z54<Boolean, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onFailure(String str, String str2, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30ae4fc7", new Object[]{this, str, str2, bool});
            } else {
                jcs.k(jcs.this);
            }
        }

        /* renamed from: b */
        public void onSuccess(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc8f8dc2", new Object[]{this, bool});
            } else {
                jcs.k(jcs.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c3n c3nVar = (c3n) jcs.this.b.g(c3n.class);
            if (c3nVar != null) {
                c3nVar.p();
                boolean f = ner.INSTANCE.f(c3nVar.t());
                y2n y2nVar = (y2n) jcs.this.b.g(y2n.class);
                if (y2nVar != null) {
                    y2nVar.i(true, f);
                }
            }
        }
    }

    static {
        t2o.a(844103718);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcs(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(jcs jcsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/task/TMSPubConfigStep");
    }

    public static final /* synthetic */ void k(jcs jcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae47a4f", new Object[]{jcsVar});
        } else {
            jcsVar.m();
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSPubConfigStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    public final void m() {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c917381f", new Object[]{this});
            return;
        }
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.URGENT)) != null) {
            executor.execute(new b());
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678e8bb8", new Object[]{this});
            return;
        }
        fsw.h("Triver", TMSTinyH5APIBridge.class);
        fsw.h("TriverEvent", TMSTinyH5EventBridge.class);
        MUSEngine.registerModule("openApi", TMSWeexAPIBridge.class);
        try {
            IpChange ipChange2 = TBACCS.$ipChange;
            fsw.i("WVACCS", TBACCS.class, true);
        } catch (ClassNotFoundException e) {
            TMSLogger.b("TMSUniAppPageRenderFactory", ckf.p("Register WVACCS Module Faild: ", e.getMessage()));
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
            return;
        }
        bbs bbsVar = this.b;
        ckf.f(bbsVar, "mInstance");
        if (!TMSInstanceExtKt.r(bbsVar)) {
            i();
            return;
        }
        n4d n4dVar = (n4d) this.b.getExtension(n4d.class);
        if (n4dVar != null && q9s.n()) {
            this.b.C0(n4dVar);
            this.b.k0(new zwt());
        }
        bbs bbsVar2 = this.b;
        bbs bbsVar3 = this.b;
        ckf.f(bbsVar3, "mInstance");
        bbsVar2.k0(new TinyAppExtension(bbsVar3));
        IpChange ipChange2 = rds.$ipChange;
        bbs bbsVar4 = this.b;
        String L = this.b.L();
        ckf.f(L, "mInstance.appId");
        Activity I = this.b.I();
        ckf.f(I, "mInstance.activity");
        String str = this.c;
        ckf.f(str, "mLogTraceId");
        String b2 = x2n.b(this.b);
        if (n4dVar != null) {
            z = true;
        }
        bbsVar4.k(c3n.class, new c3n(L, I, str, b2, Boolean.valueOf(z)));
        bbs bbsVar5 = this.b;
        String L2 = this.b.L();
        ckf.f(L2, "mInstance.appId");
        String b3 = x2n.b(this.b);
        String str2 = this.c;
        ckf.f(str2, "mLogTraceId");
        bbsVar5.k(y2n.class, new y2n(L2, b3, str2));
        this.b.k(PubContainerContext.class, new PubContainerContext());
        if (q9s.INSTANCE.R1()) {
            IAccountAdapter iAccountAdapter = (IAccountAdapter) p8s.b(IAccountAdapter.class);
            if (iAccountAdapter != null && iAccountAdapter.isLogin()) {
                com.taobao.themis.pub_kit.foot.a.b(this.b.L(), new a());
            }
        } else {
            com.taobao.themis.pub_kit.foot.a.a(this.b.L());
            m();
        }
        i();
    }
}
