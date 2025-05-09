package com.taobao.themis.canvas.solution;

import android.app.Activity;
import android.net.Uri;
import android.taobao.windvane.extra.core.WVCore;
import android.view.ViewGroup;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.canvas.extension.instance.TMSGameForceUpdateExtension;
import com.taobao.themis.container.splash.TinyAppSplashView;
import com.taobao.themis.container.utils.TMSSwitchUtils;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.open.packages.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.a9s;
import tb.bbs;
import tb.c7o;
import tb.ckf;
import tb.ekd;
import tb.h33;
import tb.jes;
import tb.mm4;
import tb.njg;
import tb.oxr;
import tb.pas;
import tb.pcs;
import tb.q8o;
import tb.q9s;
import tb.qas;
import tb.r8s;
import tb.rwd;
import tb.t2o;
import tb.t4c;
import tb.t8c;
import tb.t9s;
import tb.twd;
import tb.v8c;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/taobao/themis/canvas/solution/TMSGameSolution;", "Lcom/taobao/themis/kernel/solution/TMSBaseSolution;", "Ltb/bbs;", "instance", "<init>", "(Ltb/bbs;)V", "", "enableHighPerformanceMode", "()Z", "Ltb/twd;", "createRenderFactory", "()Ltb/twd;", "Ltb/a9s;", "createLauncher", "()Ltb/a9s;", "", "Ltb/t4c;", "getInstanceExtension", "()Ljava/util/List;", "Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "getSolutionType", "()Lcom/taobao/themis/kernel/solution/TMSSolutionType;", "Ltb/bbs$c;", "createLaunchListener", "()Ltb/bbs$c;", "Ltb/mm4;", "generateContainerModel", "()Ltb/mm4;", "Landroid/view/ViewGroup;", "splashViewContainer", "Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "generateSplashView", "(Landroid/view/ViewGroup;)Lcom/taobao/themis/kernel/container/ui/splash/ISplashView;", "Ltb/rwd;", "createPageFactory", "(Ltb/bbs;)Ltb/rwd;", "Ltb/pcs;", "renderOptions", "reload", "(Ltb/pcs;)Z", "Ltb/v8c;", "mSolutionProxy$delegate", "Ltb/njg;", "getMSolutionProxy", "()Ltb/v8c;", "mSolutionProxy", "Ltb/pas;", "mLauncher", "Ltb/pas;", "Companion", "a", "themis_canvas_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSGameSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "TMSGameSolution";
    private final njg mSolutionProxy$delegate = kotlin.a.b(new TMSGameSolution$mSolutionProxy$2(this));
    private final pas mLauncher = new pas(this.mInstance);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(834666589);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.bbs.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a16c1d38", new Object[]{this});
            }
        }

        @Override // tb.bbs.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4667d5a", new Object[]{this});
                return;
            }
            t8c t8cVar = (t8c) TMSGameSolution.access$getMInstance$p(TMSGameSolution.this).getExtension(t8c.class);
            if (t8cVar != null) {
                t8cVar.showLoading();
            }
            TMSGameSolution.access$getMSolutionProxy(TMSGameSolution.this).c(TMSGameSolution.access$getMLauncher$p(TMSGameSolution.this));
            CommonExtKt.n(new a(TMSGameSolution.this));
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TMSGameSolution f13478a;

            public a(TMSGameSolution tMSGameSolution) {
                this.f13478a = tMSGameSolution;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (ckf.b("landscape", r8s.m(TMSGameSolution.access$getMInstance$p(this.f13478a)))) {
                    TMSGameSolution.access$getMInstance$p(this.f13478a).I().setRequestedOrientation(0);
                } else {
                    TMSGameSolution.access$getMInstance$p(this.f13478a).I().setRequestedOrientation(1);
                }
            }
        }

        @Override // tb.bbs.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f93d9f99", new Object[]{this});
                return;
            }
            if (q9s.A0()) {
                Activity I = TMSGameSolution.access$getMInstance$p(TMSGameSolution.this).I();
                ckf.f(I, "mInstance.activity");
                oxr.b(I, false);
            }
            jes.e(TMSGameSolution.access$getMInstance$p(TMSGameSolution.this));
        }
    }

    static {
        t2o.a(834666588);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSGameSolution(bbs bbsVar) {
        super(bbsVar);
        ckf.g(bbsVar, "instance");
    }

    public static final /* synthetic */ boolean access$enableHighPerformanceMode(TMSGameSolution tMSGameSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae0abba0", new Object[]{tMSGameSolution})).booleanValue();
        }
        return tMSGameSolution.enableHighPerformanceMode();
    }

    public static final /* synthetic */ bbs access$getMInstance$p(TMSGameSolution tMSGameSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("40c88120", new Object[]{tMSGameSolution});
        }
        return tMSGameSolution.mInstance;
    }

    public static final /* synthetic */ pas access$getMLauncher$p(TMSGameSolution tMSGameSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pas) ipChange.ipc$dispatch("1fbe7f33", new Object[]{tMSGameSolution});
        }
        return tMSGameSolution.mLauncher;
    }

    public static final /* synthetic */ v8c access$getMSolutionProxy(TMSGameSolution tMSGameSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8c) ipChange.ipc$dispatch("2152744a", new Object[]{tMSGameSolution});
        }
        return tMSGameSolution.getMSolutionProxy();
    }

    private final v8c getMSolutionProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8c) ipChange.ipc$dispatch("e3770371", new Object[]{this});
        }
        return (v8c) this.mSolutionProxy$delegate.getValue();
    }

    public static /* synthetic */ Object ipc$super(TMSGameSolution tMSGameSolution, String str, Object... objArr) {
        if (str.hashCode() == 1316793324) {
            return super.getInstanceExtension();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/canvas/solution/TMSGameSolution");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public bbs.c createLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("2cf7e97c", new Object[]{this});
        }
        return new b();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public a9s createLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("9b33273c", new Object[]{this});
        }
        return this.mLauncher;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public rwd createPageFactory(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rwd) ipChange.ipc$dispatch("3a3b758d", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        return getMSolutionProxy().b();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return getMSolutionProxy().a();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public mm4 generateContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("30ce17a3", new Object[]{this});
        }
        ekd ekdVar = (ekd) this.mInstance.getExtension(ekd.class);
        if (ekdVar == null) {
            TMSLogger.b(TAG, "can't get resourceManagerExtension");
            return null;
        }
        c7o Y = ekdVar.Y(RVConstants.FILE_APP_CONFIG);
        if (Y == null) {
            TMSLogger.b(TAG, "can't get game.json resource");
            return null;
        }
        byte[] bytes = Y.getBytes();
        if (bytes == null) {
            TMSLogger.b(TAG, "game.json content is null");
            return null;
        }
        try {
            AppConfigModel parseFromJSON = AppConfigModel.parseFromJSON(bytes);
            if (parseFromJSON == null) {
                return null;
            }
            TMSMetaInfoWrapper U = this.mInstance.U();
            ckf.d(U);
            JSONObject e = U.e();
            ckf.d(e);
            String string = e.getString("deviceOrientation");
            JSONObject appLaunchParams = parseFromJSON.getAppLaunchParams();
            if (appLaunchParams == null) {
                appLaunchParams = new JSONObject();
            }
            appLaunchParams.put((JSONObject) "deviceOrientation", string);
            if (!appLaunchParams.containsKey("aspectFitOrientation")) {
                appLaunchParams.put((JSONObject) "aspectFitOrientation", "all");
            }
            if (!appLaunchParams.containsKey("statusBarHide")) {
                appLaunchParams.put((JSONObject) "statusBarHide", (String) Boolean.TRUE);
            }
            if (!appLaunchParams.containsKey("hideHomeIndicator")) {
                appLaunchParams.put((JSONObject) "hideHomeIndicator", (String) Boolean.TRUE);
            }
            mm4 mm4Var = new mm4(null, null, new Window.a().b(appLaunchParams, TMSMetaInfoWrapper.Type.AppInfo), null);
            mm4Var.b().put((JSONObject) "enableMixPlayer", (String) Boolean.valueOf(ckf.b("true", appLaunchParams.getString("enableMixPlayer"))));
            return mm4Var;
        } catch (Exception unused) {
            TMSLogger.b(TAG, "game.json parse error");
            return null;
        }
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup});
        }
        ckf.g(viewGroup, "splashViewContainer");
        return new TinyAppSplashView(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public List<t4c> getInstanceExtension() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4e7cabec", new Object[]{this});
        }
        List<t4c> instanceExtension = super.getInstanceExtension();
        if (instanceExtension == null) {
            instanceExtension = new ArrayList<>();
        }
        instanceExtension.add(new TMSGameForceUpdateExtension(this.mInstance));
        instanceExtension.add(new q8o(this.mInstance));
        instanceExtension.add(new PackageManager(this.mInstance));
        instanceExtension.add(new h33(this.mInstance));
        instanceExtension.add(new qas(this.mInstance));
        return instanceExtension;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.MINIGAME;
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public boolean reload(pcs pcsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("961bd7e4", new Object[]{this, pcsVar})).booleanValue();
        }
        String str = pcsVar == null ? null : pcsVar.f26018a;
        if (str == null) {
            str = this.mInstance.e0();
        }
        t9s t9sVar = (t9s) this.mInstance.g(t9s.class);
        if (t9sVar != null) {
            ckf.f(str, "url");
            t9sVar.l(str, new JSONObject());
        }
        return true;
    }

    private final boolean enableHighPerformanceMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c671af9", new Object[]{this})).booleanValue();
        }
        if (!q9s.INSTANCE.G0()) {
            return false;
        }
        if (!WVCore.getInstance().isUCSupport()) {
            TMSLogger.b(TAG, "downgrade because uc not ready");
            return false;
        } else if (Uri.parse(this.mInstance.e0()).getBooleanQueryParameter("highPerformanceMode", false) || Uri.parse(this.mInstance.e0()).getBooleanQueryParameter("high_performance_mode", false)) {
            return true;
        } else {
            TMSSwitchUtils tMSSwitchUtils = TMSSwitchUtils.INSTANCE;
            String L = this.mInstance.L();
            ckf.f(L, "mInstance.appId");
            if (tMSSwitchUtils.isHighPerformanceGame(L)) {
                return true;
            }
            TMSMetaInfoWrapper U = this.mInstance.U();
            if (U != null) {
                JSONObject e = U.e();
                if (e == null ? false : ckf.b(e.get("highPerformanceMode"), Boolean.TRUE)) {
                    return true;
                }
            }
            return false;
        }
    }
}
