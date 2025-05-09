package com.taobao.android.fluid.framework.preload.weex;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.DataVersionManager;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.performance.IPerformanceService;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.b6x;
import tb.b93;
import tb.h3e;
import tb.h4x;
import tb.hde;
import tb.ir9;
import tb.k93;
import tb.mqu;
import tb.ncp;
import tb.ntm;
import tb.nwv;
import tb.oep;
import tb.ono;
import tb.ood;
import tb.p91;
import tb.pep;
import tb.pto;
import tb.pvh;
import tb.q6x;
import tb.s0j;
import tb.s6o;
import tb.t2o;
import tb.t5x;
import tb.uq9;
import tb.vrp;
import tb.wlb;
import tb.wyr;
import tb.zrt;
import tb.zt6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PreloadWeexServiceImpl implements IPreloadWeexService, ood, zt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PreloadWeexServiceImpl";
    private IPreloadWeexService.a callback;
    private ViewGroup containerView;
    private Context mContext;
    private final FluidContext mFluidContext;
    private com.taobao.android.weex_framework.a mMusInstance;
    private b6x mWeexInstanceCreateCallback;
    private TUrlImageView transitionView;
    private String weexUrl;
    private boolean mConsumed = false;
    private boolean preloadWeexInstanceEnabled = false;
    private boolean onResultCalled = false;
    private boolean cancel = false;
    private boolean requestingTransition = false;
    private String sessionId = null;
    private List<vrp> pendingMessages = new ArrayList();
    private boolean weexDisplayed = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends wlb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1249298707) {
                super.onDisActive((uq9) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/weex/PreloadWeexServiceImpl$1");
        }

        @Override // tb.wlb.a, tb.wlb
        public void onDisActive(uq9 uq9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b58936ed", new Object[]{this, uq9Var});
                return;
            }
            super.onDisActive(uq9Var);
            PreloadWeexServiceImpl.this.detachWeexInstance();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                PreloadWeexServiceImpl.this.detachWeexInstance();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements hde {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl$c$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC0423a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0423a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PreloadWeexServiceImpl.access$702(PreloadWeexServiceImpl.this, false);
                    PreloadWeexServiceImpl preloadWeexServiceImpl = PreloadWeexServiceImpl.this;
                    PreloadWeexServiceImpl.access$900(preloadWeexServiceImpl, PreloadWeexServiceImpl.access$300(preloadWeexServiceImpl));
                    ((IPerformanceService) PreloadWeexServiceImpl.access$800(PreloadWeexServiceImpl.this).getService(IPerformanceService.class)).onInteractLayerResultReady();
                }
            }

            public a() {
            }

            @Override // tb.hde
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("93f50aea", new Object[]{this});
                }
            }

            @Override // tb.hde
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b03e814", new Object[]{this});
                    return;
                }
                PreloadWeexServiceImpl.access$502(PreloadWeexServiceImpl.this, true);
                ir9.b(PreloadWeexServiceImpl.TAG, "onWeexUiDisplayed");
                if (PreloadWeexServiceImpl.access$400(PreloadWeexServiceImpl.this) != null && PreloadWeexServiceImpl.access$600(PreloadWeexServiceImpl.this)) {
                    PreloadWeexServiceImpl.access$702(PreloadWeexServiceImpl.this, true);
                    ((IPerformanceService) PreloadWeexServiceImpl.access$800(PreloadWeexServiceImpl.this).getService(IPerformanceService.class)).onInteractLayerFirstFrameReady();
                    zrt.Companion.d(new RunnableC0423a(), 200L);
                }
            }
        }

        public c() {
        }

        @Override // tb.b6x
        public void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            ir9.b(PreloadWeexServiceImpl.TAG, "onInstanceCreatedInMain,获取异步weex实例");
            PreloadWeexServiceImpl.access$000(PreloadWeexServiceImpl.this, s0j.MTS_TASK_START_RENDER, true);
            WeexInstance b = aVar.b(PreloadWeexServiceImpl.access$100(PreloadWeexServiceImpl.this));
            if (!PreloadWeexServiceImpl.access$200(PreloadWeexServiceImpl.this) || PreloadWeexServiceImpl.access$300(PreloadWeexServiceImpl.this) != null) {
                PreloadWeexServiceImpl.access$402(PreloadWeexServiceImpl.this, ((WeexInstanceImpl) b).getAdapterMUSInstance());
                PreloadWeexServiceImpl.access$400(PreloadWeexServiceImpl.this).getRenderRoot().setTag(PreloadWeexServiceImpl.this);
                ((q6x) b.getExtend(q6x.class)).c(new a());
                PreloadWeexServiceImpl preloadWeexServiceImpl = PreloadWeexServiceImpl.this;
                if (!PreloadWeexServiceImpl.access$900(preloadWeexServiceImpl, PreloadWeexServiceImpl.access$300(preloadWeexServiceImpl))) {
                    ir9.b(PreloadWeexServiceImpl.TAG, "add weex instance to containerView");
                    PreloadWeexServiceImpl.access$400(PreloadWeexServiceImpl.this).getRenderRoot().setTag(R.id.fluid_sdk_id_weex_instance, PreloadWeexServiceImpl.access$400(PreloadWeexServiceImpl.this));
                    PreloadWeexServiceImpl.access$1000(PreloadWeexServiceImpl.this).addView(PreloadWeexServiceImpl.access$400(PreloadWeexServiceImpl.this).getRenderRoot(), new FrameLayout.LayoutParams(-1, -1));
                    return;
                }
                return;
            }
            b.destroy();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7909a;
        public final /* synthetic */ IPreloadWeexService.a b;

        public d(View view, IPreloadWeexService.a aVar) {
            this.f7909a = view;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!(PreloadWeexServiceImpl.access$1100(PreloadWeexServiceImpl.this) == null || this.f7909a == null)) {
                ir9.b(PreloadWeexServiceImpl.TAG, "setRendViewAlpha 0");
                this.f7909a.setAlpha(0.0f);
            }
            this.b.a(PreloadWeexServiceImpl.access$400(PreloadWeexServiceImpl.this), PreloadWeexServiceImpl.access$1200(PreloadWeexServiceImpl.this));
            PreloadWeexServiceImpl.access$1300(PreloadWeexServiceImpl.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f7910a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PreloadWeexServiceImpl.access$1400(PreloadWeexServiceImpl.this);
                }
            }
        }

        public e(View view) {
            this.f7910a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f7910a != null) {
                ir9.b(PreloadWeexServiceImpl.TAG, "setRendViewAlpha 1");
                this.f7910a.setAlpha(1.0f);
            }
            nwv.y0(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ncp f7912a;

        public f(ncp ncpVar) {
            this.f7912a = ncpVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            pep sessionParams = ((ISceneConfigService) PreloadWeexServiceImpl.access$800(PreloadWeexServiceImpl.this).getService(ISceneConfigService.class)).getSessionParams();
            int k = DataVersionManager.k(sessionParams.b);
            if (k == DataVersionManager.j(sessionParams.b)) {
                ir9.b(PreloadWeexServiceImpl.TAG, "onServerConfigChanged 更新weex url, dataVersion:" + k);
                ono.j(FluidSDK.getContext(), ono.KEY_WEEX_LOAD_URL, this.f7912a.b);
            }
        }
    }

    static {
        t2o.a(468714729);
        t2o.a(468714727);
        t2o.a(468714225);
        t2o.a(468714172);
    }

    public PreloadWeexServiceImpl(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mContext = fluidContext.getContext();
    }

    public static /* synthetic */ void access$000(PreloadWeexServiceImpl preloadWeexServiceImpl, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ba816e", new Object[]{preloadWeexServiceImpl, str, new Boolean(z)});
        } else {
            preloadWeexServiceImpl.endMetricStage(str, z);
        }
    }

    public static /* synthetic */ Context access$100(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4f46e595", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.mContext;
    }

    public static /* synthetic */ ViewGroup access$1000(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("49bcc2a", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.containerView;
    }

    public static /* synthetic */ TUrlImageView access$1100(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("d75544b0", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.transitionView;
    }

    public static /* synthetic */ List access$1200(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8b16d09a", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.pendingMessages;
    }

    public static /* synthetic */ void access$1300(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe3684e", new Object[]{preloadWeexServiceImpl});
        } else {
            preloadWeexServiceImpl.afterOnResult();
        }
    }

    public static /* synthetic */ void access$1400(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c70c4a8f", new Object[]{preloadWeexServiceImpl});
        } else {
            preloadWeexServiceImpl.detachTransitionView();
        }
    }

    public static /* synthetic */ boolean access$200(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("939b2fe2", new Object[]{preloadWeexServiceImpl})).booleanValue();
        }
        return preloadWeexServiceImpl.cancel;
    }

    public static /* synthetic */ IPreloadWeexService.a access$300(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadWeexService.a) ipChange.ipc$dispatch("181e5ee1", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.callback;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a access$400(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("eef2386d", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.mMusInstance;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.a access$402(PreloadWeexServiceImpl preloadWeexServiceImpl, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("e500d688", new Object[]{preloadWeexServiceImpl, aVar});
        }
        preloadWeexServiceImpl.mMusInstance = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean access$502(PreloadWeexServiceImpl preloadWeexServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba85395", new Object[]{preloadWeexServiceImpl, new Boolean(z)})).booleanValue();
        }
        preloadWeexServiceImpl.weexDisplayed = z;
        return z;
    }

    public static /* synthetic */ boolean access$600(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03eb8e6", new Object[]{preloadWeexServiceImpl})).booleanValue();
        }
        return preloadWeexServiceImpl.checkAttachTransitionView();
    }

    public static /* synthetic */ boolean access$702(PreloadWeexServiceImpl preloadWeexServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("678f1f53", new Object[]{preloadWeexServiceImpl, new Boolean(z)})).booleanValue();
        }
        preloadWeexServiceImpl.requestingTransition = z;
        return z;
    }

    public static /* synthetic */ FluidContext access$800(PreloadWeexServiceImpl preloadWeexServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("a9790264", new Object[]{preloadWeexServiceImpl});
        }
        return preloadWeexServiceImpl.mFluidContext;
    }

    public static /* synthetic */ boolean access$900(PreloadWeexServiceImpl preloadWeexServiceImpl, IPreloadWeexService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc963f73", new Object[]{preloadWeexServiceImpl, aVar})).booleanValue();
        }
        return preloadWeexServiceImpl.onResultWeexInstance(aVar);
    }

    private void afterOnResult() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2981c55f", new Object[]{this});
            return;
        }
        ir9.b(TAG, "afterOnResult, weexDisplayed:" + this.weexDisplayed);
        this.onResultCalled = true;
        this.pendingMessages = null;
        this.callback = null;
        com.taobao.android.weex_framework.a aVar = this.mMusInstance;
        if (aVar != null) {
            view = aVar.getRenderRoot();
        } else {
            view = null;
        }
        this.mMusInstance = null;
        nwv.A0(new e(view), 500L);
    }

    private void beginMetricStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd5ef96", new Object[]{this, str});
            return;
        }
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.c(str, "interact");
        }
    }

    private boolean checkAttachTransitionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e4b8572", new Object[]{this})).booleanValue();
        }
        if (this.transitionView != null || this.onResultCalled || this.cancel) {
            return false;
        }
        return true;
    }

    private JSONObject createPreloadAsyncWeexInitData(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("466e05de", new Object[]{this, fluidContext, aVar});
        }
        a.d e2 = aVar.e();
        Map h = e2.h(this.mFluidContext);
        String valueOf = String.valueOf(oep.a());
        this.sessionId = valueOf;
        e2.c = valueOf;
        return k93.U(fluidContext, new vrp(vrp.MSG_DATA_CHANGE, e2.c, h), null);
    }

    private void detachTransitionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d692c614", new Object[]{this});
        } else if (this.transitionView != null && this.containerView != null) {
            ir9.b(TAG, "detachTransitionView");
            this.containerView.removeView(this.transitionView);
            this.transitionView = null;
        }
    }

    private void endMetricStage(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906739b0", new Object[]{this, str, new Boolean(z)});
            return;
        }
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.h(str, z, "interact");
        }
    }

    private String getWeexLoadUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b09e007", new Object[]{this});
        }
        String e2 = ono.e(FluidSDK.getContext(), ono.KEY_WEEX_LOAD_URL);
        ir9.b(TAG, "getWeexLoadUrl:" + e2);
        return e2;
    }

    private Bitmap getWeexRenderBitmap(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("55cbaecd", new Object[]{this, view});
        }
        if (view instanceof TextureView) {
            return ((TextureView) view).getBitmap();
        }
        return null;
    }

    private void handleMessageInternal(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636f33d6", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        vrp vrpVar = new vrp(jSONObject, pvhVar != null ? new h4x(pvhVar) : null);
        if (vrpVar.c.equals("VSMSG_wrapTnodec")) {
            if ("$monitor.apmTrace".equals(vrpVar.h.get("name"))) {
                ((IPerformanceService) this.mFluidContext.getService(IPerformanceService.class)).onInteractAPMTrace(mqu.Companion.h(vrpVar.h.get("params"), null));
                return;
            }
        } else if (vrpVar.c.equals("VSMSG_apmTrace")) {
            ((IPerformanceService) this.mFluidContext.getService(IPerformanceService.class)).onInteractAPMTrace(vrpVar.h);
            return;
        }
        IMessageService iMessageService = (IMessageService) this.mFluidContext.getService(IMessageService.class);
        if (iMessageService.getGlobalNativeMessageHandler() == null || !iMessageService.getGlobalNativeMessageHandler().j(vrpVar)) {
            this.pendingMessages.add(vrpVar);
        } else {
            iMessageService.getMessageCenter().f(vrpVar);
        }
    }

    private void initWeexInstanceCreateCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85d18cee", new Object[]{this});
        } else if (this.mWeexInstanceCreateCallback == null) {
            this.mWeexInstanceCreateCallback = new c();
        }
    }

    private boolean isWeexInstanceReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ccf3a8e", new Object[]{this})).booleanValue();
        }
        if (this.mMusInstance == null || this.requestingTransition || !this.weexDisplayed) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onResult(com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService.a r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "f2075c2d"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            com.taobao.android.weex_framework.a r2 = r7.mMusInstance
            if (r2 == 0) goto L_0x006a
            android.view.View r2 = r2.getRenderRoot()
            boolean r3 = r7.weexDisplayed
            if (r3 == 0) goto L_0x0068
            com.taobao.android.weex_framework.a r3 = r7.mMusInstance
            android.view.View r3 = r3.getRenderView()
            android.graphics.Bitmap r3 = r7.getWeexRenderBitmap(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getWeexRenderBitmap, isNull:"
            r4.<init>(r5)
            if (r3 != 0) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "PreloadWeexServiceImpl"
            tb.ir9.b(r5, r4)
            if (r3 == 0) goto L_0x0068
            com.taobao.uikit.extend.feature.view.TUrlImageView r4 = new com.taobao.uikit.extend.feature.view.TUrlImageView
            android.view.ViewGroup r6 = r7.containerView
            android.content.Context r6 = r6.getContext()
            r4.<init>(r6)
            r7.transitionView = r4
            r4.setImageBitmap(r3)
            java.lang.String r3 = "attachTransitionView"
            tb.ir9.b(r5, r3)
            android.view.ViewGroup r3 = r7.containerView
            com.taobao.uikit.extend.feature.view.TUrlImageView r4 = r7.transitionView
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r6)
            r3.addView(r4, r1, r5)
            goto L_0x006c
        L_0x0068:
            r0 = 0
            goto L_0x006c
        L_0x006a:
            r2 = 0
            goto L_0x0068
        L_0x006c:
            com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl$d r1 = new com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl$d
            r1.<init>(r2, r8)
            if (r0 != 0) goto L_0x0077
            r1.run()
            goto L_0x007c
        L_0x0077:
            com.taobao.uikit.extend.feature.view.TUrlImageView r8 = r7.transitionView
            tb.axk.a(r8, r1)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.preload.weex.PreloadWeexServiceImpl.onResult(com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService$a):void");
    }

    private void setMetricTag(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a045b5", new Object[]{this, str, obj});
            return;
        }
        h3e tab2ServiceDelegate = ((IHostTNodeService) this.mFluidContext.getService(IHostTNodeService.class)).getTab2ServiceDelegate();
        if (tab2ServiceDelegate != null) {
            tab2ServiceDelegate.n(str, obj, "interact");
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void createWeexInstance(Context context, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f93be6a", new Object[]{this, context, aVar});
            return;
        }
        ir9.b(TAG, "createWeexInstance");
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        weexUnicornConfig.k(true);
        weexInstanceConfig.s(weexUnicornConfig);
        t5x b2 = com.taobao.android.weex.b.b(context, this.weexUrl, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        b2.c(s6o.B(context), p91.b(context, pto.g(this.mFluidContext), this.mFluidContext));
        b2.initWithURL(this.weexUrl);
        b2.render(com.taobao.android.weex.b.e().b(createPreloadAsyncWeexInitData(this.mFluidContext, aVar)));
        initWeexInstanceCreateCallback();
        b2.b(this.mWeexInstanceCreateCallback);
        this.preloadWeexInstanceEnabled = true;
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void detachWeexInstance() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b696f0", new Object[]{this});
            return;
        }
        if (this.mMusInstance != null) {
            ir9.b(TAG, "detachWeexInstance");
            if (!(this.mMusInstance.getRenderRoot() == null || (viewGroup = this.containerView) == null)) {
                viewGroup.removeView(this.mMusInstance.getRenderRoot());
            }
            if (this.callback == null) {
                this.mMusInstance.destroy();
                this.mMusInstance = null;
            }
        }
        ((IPerformanceService) this.mFluidContext.getService(IPerformanceService.class)).onInteractLayerResultReady();
        detachTransitionView();
        this.cancel = true;
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public boolean getWeexInstance(String str, String str2, IPreloadWeexService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22e9a915", new Object[]{this, str, str2, aVar})).booleanValue();
        }
        if (!TextUtils.equals(str, this.sessionId) || this.mConsumed || this.cancel || !TextUtils.equals(this.weexUrl, str2)) {
            ir9.b(TAG, "getWeexInstance return false");
            return false;
        }
        this.mConsumed = true;
        if (onResultWeexInstance(aVar)) {
            return true;
        }
        if (this.preloadWeexInstanceEnabled) {
            this.callback = aVar;
            ir9.b(TAG, "getWeexInstance pending");
        }
        return this.preloadWeexInstanceEnabled;
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void handleMessage(JSONObject jSONObject, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cf49d3", new Object[]{this, jSONObject, pvhVar});
            return;
        }
        try {
            handleMessageInternal(jSONObject, pvhVar);
        } catch (Throwable th) {
            ir9.c(TAG, "handleMessageInternal error", th);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public boolean isPreloadWeexInstanceEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32cabd37", new Object[]{this})).booleanValue();
        }
        return this.preloadWeexInstanceEnabled;
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // tb.zt6
    public void onDataVersionChange(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3a58b0", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else if (i != i2) {
            ir9.b(TAG, "onDataVersionChange 删除weex url, dataVersion:" + i + " nextDataVersion:" + i2);
            ono.j(FluidSDK.getContext(), ono.KEY_WEEX_LOAD_URL, null);
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        detachWeexInstance();
        IDataService iDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        if (iDataService != null) {
            iDataService.removeServerConfigChangeListener(this);
        }
        DataVersionManager.l(this);
    }

    @Override // tb.ood
    public void onServerConfigChanged(ncp ncpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23d4bb4", new Object[]{this, ncpVar});
        } else {
            nwv.y0(new f(ncpVar));
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService
    public void startRender(final Context context, ViewGroup viewGroup, final ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97fe6e5", new Object[]{this, context, viewGroup, ntmVar});
            return;
        }
        if (wyr.c(this.mFluidContext.getInstanceConfig().getFluidOriginUrl())) {
            IDataService iDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
            if (iDataService != null) {
                iDataService.addServerConfigChangeListener(this);
            }
            DataVersionManager.i(this);
        }
        setMetricTag(IPerformanceService.MTS_TAG_PRECREATE_WEEX, Boolean.valueOf(b93.j(this.mFluidContext)));
        setMetricTag(IPerformanceService.MTS_TAG_PREFETCH_MTOP, Boolean.valueOf(b93.c(IPerformanceService.MTS_TAG_PREFETCH_MTOP)));
        setMetricTag(IPerformanceService.MTS_TAG_PENDING_FIRST_FRAME_CALLBACK, Boolean.valueOf(b93.h()));
        if (b93.j(this.mFluidContext)) {
            this.containerView = viewGroup;
            this.mContext = context;
            if (!TextUtils.isEmpty(ntmVar.b) && ntmVar.t != null) {
                beginMetricStage(s0j.MTS_TASK_START_RENDER);
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.rtm
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreloadWeexServiceImpl.this.lambda$startRender$0(ntmVar, context);
                    }
                });
            }
            ((ICardService) this.mFluidContext.getService(ICardService.class)).addCardLifecycleListener((wlb.a) new a());
            nwv.A0(new b(), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRender$0(ntm ntmVar, Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7904b7d", new Object[]{this, ntmVar, context});
            return;
        }
        JSONObject mediaContentDetailData = ntmVar.t.getMediaContentDetailData();
        JSONObject mediaContentDetailJson = ntmVar.t.getMediaContentDetailJson();
        setMetricTag(IPerformanceService.MTS_TAG_INTERACT_DETAIL_CACHE, Boolean.valueOf(mediaContentDetailData != null));
        StringBuilder sb = new StringBuilder("check mediaContentData ");
        sb.append(ntmVar.b);
        sb.append(", valid:");
        if (mediaContentDetailData == null) {
            z = false;
        }
        sb.append(z);
        ir9.b(TAG, sb.toString());
        if (mediaContentDetailData != null) {
            MediaContentDetailData mediaContentDetailData2 = (MediaContentDetailData) JSON.toJavaObject(mediaContentDetailData, MediaContentDetailData.class);
            mediaContentDetailData2.currentDataVersion = ntmVar.t.getCurrentDataVersion();
            pep sessionParams = ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionParams();
            this.weexUrl = getWeexLoadUrl();
            ir9.b(TAG, "checkout dataVersion " + ntmVar.b + "; data.currentDataVersion:" + mediaContentDetailData2.currentDataVersion + " sessionParams.dataVersion:" + DataVersionManager.k(sessionParams.b));
            if (DataVersionManager.k(sessionParams.b) != mediaContentDetailData2.currentDataVersion || TextUtils.isEmpty(this.weexUrl)) {
                setMetricTag(IPerformanceService.MTS_TAG_VERSION_MATCH, Boolean.FALSE);
                endMetricStage(s0j.MTS_TASK_START_RENDER, false);
                return;
            }
            setMetricTag(IPerformanceService.MTS_TAG_VERSION_MATCH, Boolean.TRUE);
            createWeexInstance(context, new com.taobao.android.fluid.framework.data.datamodel.a(mediaContentDetailData2, mediaContentDetailJson));
            return;
        }
        endMetricStage(s0j.MTS_TASK_START_RENDER, false);
    }

    private boolean onResultWeexInstance(IPreloadWeexService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4255c607", new Object[]{this, aVar})).booleanValue();
        }
        if (!isWeexInstanceReady() || aVar == null) {
            return false;
        }
        ir9.b(TAG, "onResult musInstance");
        onResult(aVar);
        return true;
    }
}
