package com.taobao.infoflow.core.subservice.framework.container.stickyservice;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.base.IItemRenderService;
import com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.h6c;
import tb.hnq;
import tb.iqb;
import tb.t2o;
import tb.vgc;
import tb.w1e;
import tb.xm4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class StickyContainerServiceImpl implements IStickyContainerService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "StickyContainerServiceImpl";
    private BaseSectionModel<?> cacheSectionModel;
    private IContainerDataService.a dataProcessListener;
    private h6c.c feedsScrollListener;
    private cfc infoFlowContext;
    private vgc itemRenderPresenter;
    private IDxItemRenderService mDxService;
    private IMainFeedsViewService<?> mMainFeedsViewService;
    private View stickyItemView;
    private FrameLayout stickyRootLayout;
    private final xm4 containerLifecycleRegister = new xm4();
    private final hnq stickyDataParse = new hnq();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements IContainerDataService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void j(w1e w1eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0b6e76", new Object[]{this, w1eVar});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void l(w1e w1eVar, IContainerDataModel iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec3ff412", new Object[]{this, w1eVar, iContainerDataModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
        public void m(w1e w1eVar, IContainerDataModel iContainerDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e9a5c54", new Object[]{this, w1eVar, iContainerDataModel});
            } else {
                StickyContainerServiceImpl.access$000(StickyContainerServiceImpl.this, iContainerDataModel);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hnq.a f10689a;

        public b(hnq.a aVar) {
            this.f10689a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                StickyContainerServiceImpl.access$100(StickyContainerServiceImpl.this, this.f10689a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements IDxItemRenderService.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                    StickyContainerServiceImpl.access$200(StickyContainerServiceImpl.this);
                }
            }
        }

        public c() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            get.a().h(new a());
            fve.e(StickyContainerServiceImpl.TAG, "sticky template download success");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.h6c.c
        public void n(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb26e08c", new Object[]{this, new Boolean(z), new Boolean(z2)});
            }
        }

        @Override // tb.h6c.c
        public void onScrollStateChanged(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e409bdce", new Object[]{this, viewGroup, new Integer(i)});
            } else if (i == 0) {
                StickyContainerServiceImpl.access$200(StickyContainerServiceImpl.this);
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else {
                StickyContainerServiceImpl.access$200(StickyContainerServiceImpl.this);
            }
        }
    }

    static {
        t2o.a(486539707);
        t2o.a(488636609);
    }

    public static /* synthetic */ void access$000(StickyContainerServiceImpl stickyContainerServiceImpl, IContainerDataModel iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fccf9b9e", new Object[]{stickyContainerServiceImpl, iContainerDataModel});
        } else {
            stickyContainerServiceImpl.dataRefresh(iContainerDataModel);
        }
    }

    public static /* synthetic */ void access$100(StickyContainerServiceImpl stickyContainerServiceImpl, hnq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2048e3b", new Object[]{stickyContainerServiceImpl, aVar});
        } else {
            stickyContainerServiceImpl.refresh(aVar);
        }
    }

    public static /* synthetic */ void access$200(StickyContainerServiceImpl stickyContainerServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85105f7f", new Object[]{stickyContainerServiceImpl});
        } else {
            stickyContainerServiceImpl.updateStickyItemView();
        }
    }

    private void clearStickyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7109592", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.stickyRootLayout;
        if (frameLayout != null && this.stickyItemView != null) {
            frameLayout.removeAllViews();
            this.stickyRootLayout.setVisibility(8);
            this.stickyItemView = null;
            fve.e(TAG, "clear StickyContainer");
        }
    }

    private IContainerDataService.a createDataProcessListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService.a) ipChange.ipc$dispatch("a5b738e0", new Object[]{this});
        }
        return new a();
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new d();
    }

    private FrameLayout createStickyContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c5f82b14", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    private View createStickyItemView(ViewGroup viewGroup, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2bc970d", new Object[]{this, viewGroup, baseSectionModel});
        }
        vgc itemRenderPresenter = getItemRenderPresenter();
        if (itemRenderPresenter == null) {
            return null;
        }
        BaseSectionModel<?> createBaseSectionModel = baseSectionModel.createBaseSectionModel(baseSectionModel.toJsonObject());
        View createView = itemRenderPresenter.createView(viewGroup, itemRenderPresenter.getViewType(createBaseSectionModel));
        itemRenderPresenter.bindData(createView, createBaseSectionModel);
        return createView;
    }

    private void dataRefresh(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33cc3a63", new Object[]{this, iContainerDataModel});
        } else if (iContainerDataModel != null && this.stickyRootLayout != null) {
            this.stickyDataParse.f(iContainerDataModel);
            get.a().h(new b(this.stickyDataParse.c()));
        }
    }

    private int getFirstItemPosition() {
        int[] visiblePositionRange;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("426eb4f0", new Object[]{this})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService == null || (visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange()) == null || visiblePositionRange.length < 2) {
            return -1;
        }
        return visiblePositionRange[0];
    }

    private vgc getItemRenderPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vgc) ipChange.ipc$dispatch("441a8602", new Object[]{this});
        }
        IItemRenderService iItemRenderService = (IItemRenderService) this.infoFlowContext.a(IItemRenderService.class);
        if (iItemRenderService == null) {
            return null;
        }
        if (this.itemRenderPresenter == null) {
            this.itemRenderPresenter = iItemRenderService.getItemRenderPresenter(this.infoFlowContext);
        }
        return this.itemRenderPresenter;
    }

    private void hideStickyItemView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978a7e4a", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.stickyRootLayout;
        if (frameLayout != null && frameLayout.getChildCount() != 0 && this.stickyRootLayout.getVisibility() != 8) {
            this.stickyRootLayout.setVisibility(8);
            fve.e(TAG, "hide stickyItemView");
        }
    }

    private void initRegisterDataListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e5909f8", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.infoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            IContainerDataService.a createDataProcessListener = createDataProcessListener();
            this.dataProcessListener = createDataProcessListener;
            iContainerDataService.addDataProcessListener(createDataProcessListener);
        }
    }

    private boolean isNeedCreateStickyView(BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("742cec9d", new Object[]{this, baseSectionModel, view})).booleanValue();
        }
        if (view == null) {
            this.cacheSectionModel = baseSectionModel;
            return true;
        } else if (baseSectionModel == this.cacheSectionModel) {
            return false;
        } else {
            this.cacheSectionModel = baseSectionModel;
            return true;
        }
    }

    private void refresh(hnq.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b99957", new Object[]{this, aVar});
        } else if (aVar == null || aVar.g == null) {
            clearStickyContainer();
            unRegisterScrollListener();
        } else {
            if (this.mDxService != null && aVar.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar.g);
                this.mDxService.downloadTemplateWithoutPrefetch(arrayList, new c());
            }
            registerScrollListener();
            updateStickyItemView();
        }
    }

    private void registerScrollListener() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener == null && (iMainFeedsViewService = this.mMainFeedsViewService) != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
            this.feedsScrollListener = createFeedsScrollListener;
            lifeCycleRegister.h(createFeedsScrollListener);
        }
    }

    private void unRegisterDataListener() {
        IContainerDataService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d5e881", new Object[]{this});
            return;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.infoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null && (aVar = this.dataProcessListener) != null) {
            iContainerDataService.removeDataProcessListener(aVar);
        }
    }

    private void unRegisterScrollListener() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener != null && (iMainFeedsViewService = this.mMainFeedsViewService) != null) {
            iMainFeedsViewService.getLifeCycleRegister().v(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
    }

    private void updateStickyItemView() {
        BaseSectionModel<?> baseSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3532a611", new Object[]{this});
            return;
        }
        hnq.a c2 = this.stickyDataParse.c();
        if (c2 != null && (baseSectionModel = c2.g) != null) {
            int firstItemPosition = getFirstItemPosition();
            int i = c2.f;
            if (!"disappear".equals(c2.d) ? firstItemPosition >= i : firstItemPosition > i) {
                fve.e(TAG, "触发吸顶");
                showStickyItemView(baseSectionModel);
            }
            if ("disappear".equals(c2.d)) {
                if (firstItemPosition > i) {
                    return;
                }
            } else if (firstItemPosition >= i) {
                return;
            }
            fve.e(TAG, "隐藏吸顶");
            hideStickyItemView();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.stickyRootLayout;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.stickyRootLayout = null;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.infoFlowContext = cfcVar;
        this.mDxService = (IDxItemRenderService) cfcVar.a(IDxItemRenderService.class);
        this.mMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        initRegisterDataListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterDataListener();
        unRegisterScrollListener();
        this.containerLifecycleRegister.b();
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.f(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStickyContainerService, tb.iqb
    public FrameLayout createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        this.containerLifecycleRegister.c(context);
        this.stickyRootLayout = createStickyContainer(context);
        this.containerLifecycleRegister.d();
        return this.stickyRootLayout;
    }

    private void showStickyItemView(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f9c60d", new Object[]{this, baseSectionModel});
        } else if (this.stickyRootLayout != null) {
            if (isNeedCreateStickyView(baseSectionModel, this.stickyItemView)) {
                View createStickyItemView = createStickyItemView(this.stickyRootLayout, baseSectionModel);
                this.stickyItemView = createStickyItemView;
                if (createStickyItemView == null) {
                    fve.e(TAG, "createStickyItemView stickyItemView is null");
                    return;
                }
                if (this.stickyRootLayout.getChildCount() != 0) {
                    this.stickyRootLayout.removeAllViews();
                }
                this.stickyRootLayout.addView(this.stickyItemView);
                fve.e(TAG, "create stickyItemView");
            }
            if (this.stickyRootLayout.getVisibility() != 0) {
                this.stickyRootLayout.setVisibility(0);
                Animation animation = this.stickyItemView.getAnimation();
                if (animation != null) {
                    animation.cancel();
                }
                fve.e(TAG, "show stickyItemView");
                hnq.a c2 = this.stickyDataParse.c();
                if (c2 != null && "slide".equals(c2.e)) {
                    TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
                    translateAnimation.setDuration(300L);
                    translateAnimation.setFillAfter(true);
                    this.stickyItemView.startAnimation(translateAnimation);
                    fve.e(TAG, "start sticky animation");
                }
            }
        }
    }
}
