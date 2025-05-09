package com.taobao.themis.mix;

import android.view.ViewGroup;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.container.splash.DefaultSplashView;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.container.ui.splash.ISplashView;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSBaseSolution;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import tb.a9s;
import tb.bbs;
import tb.mm4;
import tb.ods;
import tb.oxr;
import tb.q9s;
import tb.r8s;
import tb.t2o;
import tb.twd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSTinyAppSolution extends TMSBaseSolution {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TMSTinyAppSolution";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements bbs.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.themis.mix.TMSTinyAppSolution$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class RunnableC0775a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0775a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TMSTinyAppSolution.access$500(TMSTinyAppSolution.this) != null) {
                    if ("landscape".equals(r8s.m(TMSTinyAppSolution.access$600(TMSTinyAppSolution.this)))) {
                        TMSTinyAppSolution.access$700(TMSTinyAppSolution.this).I().setRequestedOrientation(0);
                        oxr.b(TMSTinyAppSolution.access$800(TMSTinyAppSolution.this).I(), false);
                    }
                    if (TMSTinyAppSolution.access$900(TMSTinyAppSolution.this) != null) {
                        TMSTinyAppSolution.access$1000(TMSTinyAppSolution.this).showLoading();
                    }
                }
            }
        }

        public a() {
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
            } else if (TMSTinyAppSolution.access$1100(TMSTinyAppSolution.this) != null && TMSTinyAppSolution.access$1200(TMSTinyAppSolution.this).getStatus() != ISplashView.Status.ERROR) {
                TMSTinyAppSolution.access$1300(TMSTinyAppSolution.this).exit();
            }
        }

        @Override // tb.bbs.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4667d5a", new Object[]{this});
            } else {
                CommonExtKt.n(new RunnableC0775a());
            }
        }

        @Override // tb.bbs.c
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f93d9f99", new Object[]{this});
            } else if (TMSTinyAppSolution.access$000(TMSTinyAppSolution.this) != null && q9s.l() && TMSTinyAppSolution.access$100(TMSTinyAppSolution.this).O() != TMSContainerType.EMBEDDED) {
                if (!TMSTinyAppSolution.access$200(TMSTinyAppSolution.this).c0().getFullScreen() || !q9s.d1()) {
                    oxr.c(TMSTinyAppSolution.access$400(TMSTinyAppSolution.this).I(), false);
                } else {
                    oxr.d(TMSTinyAppSolution.access$300(TMSTinyAppSolution.this).I(), false);
                }
            }
        }
    }

    static {
        t2o.a(840957956);
    }

    public TMSTinyAppSolution(bbs bbsVar) {
        super(bbsVar);
    }

    public static /* synthetic */ bbs access$000(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("1a6c1c75", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$100(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("600d5f14", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ ISplashView access$1000(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("22427bfb", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ ISplashView access$1100(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("8faf391a", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ ISplashView access$1200(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("fd1bf639", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ ISplashView access$1300(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6a88b358", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ bbs access$200(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("a5aea1b3", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$300(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("eb4fe452", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$400(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("30f126f1", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$500(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("76926990", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$600(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("bc33ac2f", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$700(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("1d4eece", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ bbs access$800(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("4776316d", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mInstance;
    }

    public static /* synthetic */ ISplashView access$900(TMSTinyAppSolution tMSTinyAppSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("ecb9dda1", new Object[]{tMSTinyAppSolution});
        }
        return tMSTinyAppSolution.mSplashView;
    }

    public static /* synthetic */ Object ipc$super(TMSTinyAppSolution tMSTinyAppSolution, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/mix/TMSTinyAppSolution");
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public bbs.c createLaunchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs.c) ipChange.ipc$dispatch("2cf7e97c", new Object[]{this});
        }
        return new a();
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public a9s createLauncher() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a9s) ipChange.ipc$dispatch("9b33273c", new Object[]{this});
        }
        return new ods(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public twd createRenderFactory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (twd) ipChange.ipc$dispatch("70e7c2ff", new Object[]{this});
        }
        return new TMSTinyAppRenderFactory(this.mInstance);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public mm4 generateContainerModel() {
        JSONObject e;
        JSONObject jSONObject;
        AppConfigModel parseFromJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm4) ipChange.ipc$dispatch("30ce17a3", new Object[]{this});
        }
        TMSMetaInfoWrapper U = this.mInstance.U();
        if (U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("extConfigs")) == null || (parseFromJSONObject = AppConfigModel.parseFromJSONObject(jSONObject.getJSONObject("appConfig"))) == null) {
            return null;
        }
        JSONObject appLaunchParams = parseFromJSONObject.getAppLaunchParams();
        if (appLaunchParams == null) {
            appLaunchParams = new JSONObject();
        }
        if (!appLaunchParams.containsKey("hideHomeIndicator")) {
            appLaunchParams.put("hideHomeIndicator", (Object) Boolean.valueOf(this.mInstance.c0().getHideIndicator()));
        }
        return new mm4(null, null, new Window.a().b(appLaunchParams, TMSMetaInfoWrapper.Type.AppInfo), null);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution
    public ISplashView generateSplashView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISplashView) ipChange.ipc$dispatch("6eefb120", new Object[]{this, viewGroup});
        }
        return new DefaultSplashView(this.mInstance, viewGroup);
    }

    @Override // com.taobao.themis.kernel.solution.TMSBaseSolution, tb.uwd
    public TMSSolutionType getSolutionType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSSolutionType) ipChange.ipc$dispatch("888fb64e", new Object[]{this});
        }
        return TMSSolutionType.MIX;
    }
}
