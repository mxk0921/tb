package com.taobao.android.fluid.framework.container;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import java.util.List;
import java.util.Map;
import tb.ar9;
import tb.c7c;
import tb.cl4;
import tb.cn4;
import tb.d5n;
import tb.hn4;
import tb.hwi;
import tb.ir9;
import tb.j0q;
import tb.km4;
import tb.p5d;
import tb.p8p;
import tb.pto;
import tb.t2o;
import tb.tq9;
import tb.uq9;
import tb.uuq;
import tb.x5b;
import tb.yid;
import tb.ylb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ContainerService implements IContainerService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContainerService";
    private final km4 mContainerListenerManager;
    private cn4 mContainerRenderManager;
    private final hn4 mContainerServiceConfig;
    private final FluidContext mFluidContext;
    private ILifecycleService mLifecycleService;
    private p8p mSeekBarScrollInterceptManager;

    static {
        t2o.a(468714130);
        t2o.a(468714131);
    }

    public ContainerService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mContainerListenerManager = new km4(fluidContext);
        this.mContainerServiceConfig = new hn4(fluidContext);
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void addCardRenderListener(ylb ylbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69f43b0", new Object[]{this, ylbVar});
        } else {
            this.mContainerListenerManager.addCardRenderListener(ylbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void addFirstCardRenderListener(c7c c7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce1648a", new Object[]{this, c7cVar});
        } else {
            this.mContainerListenerManager.addFirstCardRenderListener(c7cVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void addHorizontalSlideListener(x5b x5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615d0abc", new Object[]{this, x5bVar});
        } else {
            this.mContainerListenerManager.addHorizontalSlideListener(x5bVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void addPageBackListener(p5d p5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd1bd50", new Object[]{this, p5dVar});
        } else {
            this.mContainerListenerManager.addPageBackListener(p5dVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void addRenderLifecycleListener(yid yidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42a0069e", new Object[]{this, yidVar});
        } else {
            this.mContainerListenerManager.addRenderLifecycleListener(yidVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void addSizedChangeListener(j0q j0qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbeb3990", new Object[]{this, j0qVar});
        } else {
            this.mContainerListenerManager.addSizedChangeListener(j0qVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void attachSeekBarScrollInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6ee2eb", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.b();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public MultiTabLayout buildSimplyContentView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MultiTabLayout) ipChange.ipc$dispatch("bacaff5a", new Object[]{this, context});
        }
        return cl4.i(context, this.mFluidContext);
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void changeVisibility(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22bcee4b", new Object[]{this, list, list2});
            return;
        }
        cn4 cn4Var = this.mContainerRenderManager;
        if (cn4Var != null) {
            cn4Var.g(list, list2);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void detachSeekBarScrollInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5794fb9", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.c();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public ViewStub getAlbumDetailStub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("d0fd0b33", new Object[]{this});
        }
        return this.mContainerRenderManager.n();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public int getAndSetTopLayoutVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a869bbf", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.mContainerRenderManager.o(i);
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public ViewGroup getAnimLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("ac1ca7d", new Object[]{this});
        }
        return this.mContainerRenderManager.p();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public hn4 getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hn4) ipChange.ipc$dispatch("f738185a", new Object[]{this});
        }
        return this.mContainerServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public cl4 getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cl4) ipChange.ipc$dispatch("62a52904", new Object[]{this});
        }
        return this.mContainerRenderManager.q();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public ViewGroup getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("5180f326", new Object[]{this});
        }
        return this.mContainerRenderManager.r();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public ViewStub getGoodListStub() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStub) ipChange.ipc$dispatch("5c6546fa", new Object[]{this});
        }
        return this.mContainerRenderManager.s();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public View getLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cf789d8f", new Object[]{this});
        }
        return this.mContainerRenderManager.t();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public DefaultGestureCollectorDelegateLayout getMainContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DefaultGestureCollectorDelegateLayout) ipChange.ipc$dispatch("c86db4d0", new Object[]{this});
        }
        return this.mContainerRenderManager.u();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public View getMoreButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4c38e826", new Object[]{this});
        }
        return this.mContainerRenderManager.v();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public int getOldActionBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60f7394d", new Object[]{this})).intValue();
        }
        return this.mContainerRenderManager.w();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public String getRawId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8a86f6c", new Object[]{this});
        }
        return this.mContainerRenderManager.y();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public SeekBarScrollInterceptView getScrollInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SeekBarScrollInterceptView) ipChange.ipc$dispatch("fbca515b", new Object[]{this});
        }
        return this.mSeekBarScrollInterceptManager.e();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public int getWeexActionBarHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3742607", new Object[]{this})).intValue();
        }
        return this.mContainerRenderManager.m();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public int getWindowHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f20b1da7", new Object[]{this})).intValue();
        }
        return this.mContainerRenderManager.A();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public int getWindowWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue();
        }
        return this.mContainerRenderManager.B();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void hideErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1b100b2", new Object[]{this});
        } else {
            this.mContainerRenderManager.G();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
        } else {
            this.mContainerRenderManager.I();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void initErrorAndRefresh(DefaultPageType defaultPageType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a68d1c", new Object[]{this, defaultPageType, str, obj});
        } else {
            this.mContainerRenderManager.L(defaultPageType, str, obj);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void initSeekBarInterceptView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("971e0383", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.g();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isFirstCardFromRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("408dd926", new Object[]{this})).booleanValue();
        }
        return this.mContainerRenderManager.R();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isFirstCardRenderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79973262", new Object[]{this})).booleanValue();
        }
        return this.mContainerListenerManager.isFirstCardRenderSuccess();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isHasPreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4223cef4", new Object[]{this})).booleanValue();
        }
        return this.mContainerRenderManager.S();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isHighActionbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d190ed9c", new Object[]{this})).booleanValue();
        }
        return this.mContainerRenderManager.T();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e10043d", new Object[]{this})).booleanValue();
        }
        return this.mContainerRenderManager.U();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public boolean isTab3GuideShoppingVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d8229e7", new Object[]{this})).booleanValue();
        }
        return this.mContainerRenderManager.W();
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.ylb
    public void onCardRenderFailed(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4eefa3a", new Object[]{this, uq9Var});
        } else {
            this.mContainerListenerManager.onCardRenderFailed(uq9Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.ylb
    public void onCardRenderSuccess(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a83ad6", new Object[]{this, uq9Var});
        } else {
            this.mContainerListenerManager.onCardRenderSuccess(uq9Var);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ILifecycleService iLifecycleService = (ILifecycleService) this.mFluidContext.getService(ILifecycleService.class);
        this.mLifecycleService = iLifecycleService;
        if (iLifecycleService == null) {
            FluidException.throwServiceNotFoundException(this.mFluidContext, ILifecycleService.class);
        }
        this.mLifecycleService.addPageLifecycleListener(this);
        this.mSeekBarScrollInterceptManager = new p8p(this.mFluidContext);
        this.mContainerRenderManager = new cn4(this.mFluidContext, this.mSeekBarScrollInterceptManager, this.mContainerListenerManager);
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            hwi.a(this.mFluidContext, this.mContainerRenderManager.y());
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.c7c
    public void onFirstCardRenderFailed(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb19bec", new Object[]{this, uq9Var});
            return;
        }
        this.mContainerListenerManager.onFirstCardRenderFailed(uq9Var);
        tq9 fluidInstanceAnalysis = ((IAnalysisService) this.mFluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        String name = FluidInstanceAnalysis.Stage.FIST_CARD.name();
        ar9 ar9Var = IContainerService.ERROR_CARD_FIRST_CARD_RENDER_FAILED;
        fluidInstanceAnalysis.d(name, ar9Var);
        fluidInstanceAnalysis.b("failed");
        FluidException.throwException(this.mFluidContext, ar9Var);
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.c7c
    public void onFirstCardRenderSuccess(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2639cf64", new Object[]{this, uq9Var});
            return;
        }
        this.mContainerListenerManager.onFirstCardRenderSuccess(uq9Var);
        tq9 fluidInstanceAnalysis = ((IAnalysisService) this.mFluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.e(FluidInstanceAnalysis.Stage.FIST_CARD.name());
        fluidInstanceAnalysis.b("succeed");
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (!this.mContainerServiceConfig.k() && this.mContainerRenderManager.P()) {
            this.mContainerServiceConfig.q(true);
            uuq.d(this.mFluidContext);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.mContainerRenderManager.k();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.b();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.mSeekBarScrollInterceptManager.c();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void preRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4294ea20", new Object[]{this});
        } else {
            this.mContainerRenderManager.a0();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            this.mContainerRenderManager.b0();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void refreshWithCallback(d5n d5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a5d82d", new Object[]{this, d5nVar});
        } else {
            this.mContainerRenderManager.e0(d5nVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void removeCardRenderListener(ylb ylbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bd6bed", new Object[]{this, ylbVar});
        } else {
            this.mContainerListenerManager.removeCardRenderListener(ylbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void removeFirstCardRenderListener(c7c c7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ec2487", new Object[]{this, c7cVar});
        } else {
            this.mContainerListenerManager.removeFirstCardRenderListener(c7cVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void removeHorizontalSlideListener(x5b x5bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642bd71f", new Object[]{this, x5bVar});
        } else {
            this.mContainerListenerManager.removeHorizontalSlideListener(x5bVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void removePageBackListener(p5d p5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1f8c0d", new Object[]{this, p5dVar});
        } else {
            this.mContainerListenerManager.removePageBackListener(p5dVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void removeRenderLifecycleListener(yid yidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d5139b", new Object[]{this, yidVar});
        } else {
            this.mContainerListenerManager.removeRenderLifecycleListener(yidVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void removeSizedChangeListener(j0q j0qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d19218f3", new Object[]{this, j0qVar});
        } else {
            this.mContainerListenerManager.removeSizedChangeListener(j0qVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void renderContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdd4d976", new Object[]{this, context});
        } else {
            renderContainer(context, null);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void renderContainerOnCreate(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f258a7b", new Object[]{this, context});
            return;
        }
        boolean f = ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f();
        if (!pto.g(this.mFluidContext) || !f) {
            renderContainer(context);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void setContainerSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81dfd207", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mContainerRenderManager.h0(i, i2);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void setFirstCardFromRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ba95dba", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainerRenderManager.i0(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void setLockedTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9e29c6", new Object[]{this, new Boolean(z)});
        } else {
            this.mContainerRenderManager.j0(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void setPendingRunnable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e1f497", new Object[]{this, runnable});
        } else if (runnable != null) {
            this.mContainerRenderManager.k0(runnable);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void setRotateAnimation(RotateAnimation rotateAnimation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32339d69", new Object[]{this, rotateAnimation});
        } else {
            this.mContainerRenderManager.l0(rotateAnimation);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void toggleCacheLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130a2b1f", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mContainerRenderManager.m0();
        } else {
            this.mContainerRenderManager.H();
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void updateView(boolean z, List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84720bd0", new Object[]{this, new Boolean(z), list});
        } else {
            this.mContainerRenderManager.o0(z, list);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void refresh(Map map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e9b75d1", new Object[]{this, map, new Boolean(z)});
        } else {
            this.mContainerRenderManager.c0(map, z);
        }
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void renderContainer(Context context, MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d56149d", new Object[]{this, context, multiTabLayout});
            return;
        }
        ir9.b("ContainerService", "开始渲染容器");
        if (!(context instanceof Activity)) {
            FluidException.throwException(this.mFluidContext, FluidInstance.INSTANCE_ANDROID_CONTEXT_NOT_ACTIVITY);
            return;
        }
        tq9 fluidInstanceAnalysis = ((IAnalysisService) this.mFluidContext.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        FluidInstanceAnalysis.Stage stage = FluidInstanceAnalysis.Stage.CREATE_CONTAINER;
        fluidInstanceAnalysis.f(stage.name());
        this.mContainerListenerManager.a();
        ir9.b("ContainerService", "FluidContext 中的 Context: " + this.mFluidContext.getContext() + "渲染传入的 Context: " + context);
        if (!(this.mFluidContext.getContext() instanceof Activity) && (context instanceof Activity)) {
            ir9.b("ContainerService", "FluidContext 中的 Context 为 Application，更新为 Activity");
            this.mFluidContext.updateInstanceConfig(FluidInstanceConfig.a.p().e(context).d());
        }
        this.mContainerRenderManager.f0(context, multiTabLayout);
        fluidInstanceAnalysis.e(stage.name());
    }

    @Override // com.taobao.android.fluid.framework.container.IContainerService
    public void refresh(Map map, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5aba011", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else {
            this.mContainerRenderManager.d0(map, z, z2, z3);
        }
    }
}
