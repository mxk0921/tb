package com.taobao.android.dressup.common.service.dresslist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IThemeService;
import java.util.Iterator;
import java.util.List;
import tb.cfc;
import tb.eve;
import tb.fve;
import tb.h6c;
import tb.iqb;
import tb.kr8;
import tb.pb6;
import tb.t2o;
import tb.why;
import tb.xm4;
import tb.yhy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DressUpThemeServiceImpl implements IThemeService<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DressUpThemeServiceImpl";
    private c itemDecorationListener;
    private IContainerService<?> mContainerService;
    private h6c.c<ViewGroup> mFeedsScrollListener;
    private IMainFeedsViewService<?> mFeedsViewService;
    public cfc mInfoFlowContext;
    private IContainerService.a mOnUiRefreshListener;
    private why mSeparatorRender;
    private yhy mTrendStyleConfig;
    private Boolean mIsHot = null;
    private float mAlpha = 1.0f;
    private final xm4 containerLifecycleRegister = new xm4();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements IContainerService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void a(IUiRefreshActionModel iUiRefreshActionModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acfd1f16", new Object[]{this, iUiRefreshActionModel});
            }
        }

        @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
        public void b(IUiRefreshActionModel iUiRefreshActionModel) {
            IContainerInnerDataModel base;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("154ae7b7", new Object[]{this, iUiRefreshActionModel});
                return;
            }
            IContainerDataModel containerModel = iUiRefreshActionModel.getContainerModel();
            if (containerModel != null && (base = containerModel.getBase()) != null) {
                DressUpThemeServiceImpl.access$000(DressUpThemeServiceImpl.this, base);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements h6c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(918552708);
            t2o.a(488636468);
        }

        public c() {
        }

        @Override // tb.h6c.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd5e6c3d", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.h6c.a
        public void b(Canvas canvas, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed0a999c", new Object[]{this, canvas, viewGroup});
                return;
            }
            DressUpThemeServiceImpl dressUpThemeServiceImpl = DressUpThemeServiceImpl.this;
            DressUpThemeServiceImpl.access$700(dressUpThemeServiceImpl, canvas, viewGroup, DressUpThemeServiceImpl.access$600(dressUpThemeServiceImpl));
        }

        public /* synthetic */ c(DressUpThemeServiceImpl dressUpThemeServiceImpl, a aVar) {
            this();
        }
    }

    static {
        t2o.a(918552705);
        t2o.a(488636652);
    }

    public static /* synthetic */ void access$000(DressUpThemeServiceImpl dressUpThemeServiceImpl, IContainerInnerDataModel iContainerInnerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33dbae1", new Object[]{dressUpThemeServiceImpl, iContainerInnerDataModel});
        } else {
            dressUpThemeServiceImpl.getTrendStyleConfig(iContainerInnerDataModel);
        }
    }

    public static /* synthetic */ IMainFeedsViewService access$100(DressUpThemeServiceImpl dressUpThemeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("8ba9b5b", new Object[]{dressUpThemeServiceImpl});
        }
        return dressUpThemeServiceImpl.mFeedsViewService;
    }

    public static /* synthetic */ boolean access$200(DressUpThemeServiceImpl dressUpThemeServiceImpl, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539686de", new Object[]{dressUpThemeServiceImpl, baseSectionModel})).booleanValue();
        }
        return dressUpThemeServiceImpl.isHotTrendHeadCard(baseSectionModel);
    }

    public static /* synthetic */ float access$302(DressUpThemeServiceImpl dressUpThemeServiceImpl, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("740c2061", new Object[]{dressUpThemeServiceImpl, new Float(f)})).floatValue();
        }
        dressUpThemeServiceImpl.mAlpha = f;
        return f;
    }

    public static /* synthetic */ float access$400(DressUpThemeServiceImpl dressUpThemeServiceImpl, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb69df72", new Object[]{dressUpThemeServiceImpl, view})).floatValue();
        }
        return dressUpThemeServiceImpl.transformScrollYToAlpha(view);
    }

    public static /* synthetic */ yhy access$600(DressUpThemeServiceImpl dressUpThemeServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yhy) ipChange.ipc$dispatch("5b62c503", new Object[]{dressUpThemeServiceImpl});
        }
        return dressUpThemeServiceImpl.mTrendStyleConfig;
    }

    public static /* synthetic */ void access$700(DressUpThemeServiceImpl dressUpThemeServiceImpl, Canvas canvas, ViewGroup viewGroup, yhy yhyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2537d2", new Object[]{dressUpThemeServiceImpl, canvas, viewGroup, yhyVar});
        } else {
            dressUpThemeServiceImpl.drawSeparator(canvas, viewGroup, yhyVar);
        }
    }

    private void addItemDecorationListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4769387f", new Object[]{this});
        } else if (this.itemDecorationListener == null) {
            this.itemDecorationListener = new c(this, null);
            this.mFeedsViewService.getLifeCycleRegister().m(this.itemDecorationListener);
        }
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new b();
    }

    private IContainerService.a createOnUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService.a) ipChange.ipc$dispatch("17f2bc37", new Object[]{this});
        }
        return new a();
    }

    private void drawSeparator(Canvas canvas, ViewGroup viewGroup, yhy yhyVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79936517", new Object[]{this, canvas, viewGroup, yhyVar});
        } else if (DressUpPresentServiceImpl.isSingleDressUpDetail(this.mInfoFlowContext.getContainerType().getContainerId())) {
            drawSingleDressUpSeparator(canvas, viewGroup, this.mTrendStyleConfig);
        } else {
            View targetSeparatorView = getTargetSeparatorView(1);
            View view2 = new View(viewGroup.getContext());
            if (targetSeparatorView != null) {
                view2.setLeft(targetSeparatorView.getLeft());
                view2.setTop(targetSeparatorView.getTop() - pb6.c(viewGroup.getContext(), 8.0f));
                view2.setBottom(targetSeparatorView.getTop());
                view2.setRight(targetSeparatorView.getRight());
                view = view2;
            } else {
                view = null;
            }
            this.mSeparatorRender.b(canvas, viewGroup, view, 1, this.mFeedsViewService.getVisiblePositionRange(), pb6.c(viewGroup.getContext(), 6.0f), yhyVar);
        }
    }

    private void drawSingleDressUpSeparator(Canvas canvas, ViewGroup viewGroup, yhy yhyVar) {
        View view;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d7a39", new Object[]{this, canvas, viewGroup, yhyVar});
        } else if (yhyVar != null) {
            int separatorPosition = getSeparatorPosition();
            View targetSeparatorView = getTargetSeparatorView(separatorPosition);
            View view2 = new View(viewGroup.getContext());
            if (targetSeparatorView != null) {
                view2.setLeft(targetSeparatorView.getLeft());
                if (this.mIsHot.booleanValue()) {
                    view2.setTop(targetSeparatorView.getTop() + pb6.c(viewGroup.getContext(), yhyVar.c()));
                } else {
                    view2.setTop(targetSeparatorView.getTop() + pb6.c(viewGroup.getContext(), yhyVar.g()));
                }
                view2.setBottom(targetSeparatorView.getTop());
                view2.setRight(targetSeparatorView.getRight());
                view = view2;
            } else {
                view = null;
            }
            int[] visiblePositionRange = this.mFeedsViewService.getVisiblePositionRange();
            Boolean bool = this.mIsHot;
            if (bool == null || !bool.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            this.mSeparatorRender.c(canvas, viewGroup, view, separatorPosition, visiblePositionRange, z, this.mAlpha, yhyVar);
        }
    }

    private float getInfoFlowCardTopDistance(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("863da773", new Object[]{this, view})).floatValue();
        }
        if (view == null) {
            return 0.0f;
        }
        int height = view.getHeight();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.height() / height;
    }

    private int getSeparatorPosition() {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        List sections;
        BaseSectionModel baseSectionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9a73af2", new Object[]{this})).intValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null || (sections = base.getSections()) == null || sections.isEmpty() || (baseSectionModel = (BaseSectionModel) sections.get(0)) == null) {
            return -1;
        }
        if (this.mIsHot == null) {
            Object b2 = kr8.b("item.0.content.type", baseSectionModel);
            if (!(b2 instanceof String)) {
                return -1;
            }
            this.mIsHot = Boolean.valueOf(TextUtils.equals((CharSequence) b2, "hot"));
        }
        return this.mFeedsViewService.getPositionBySectionBizCode(baseSectionModel.getSectionBizCode());
    }

    private View getTargetSeparatorView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7e64835b", new Object[]{this, new Integer(i)});
        }
        if (i == -1) {
            return null;
        }
        return this.mFeedsViewService.findItemViewByPosition(i);
    }

    private void getTrendStyleConfig(IContainerInnerDataModel<?> iContainerInnerDataModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e907380", new Object[]{this, iContainerInnerDataModel});
        } else if (iContainerInnerDataModel != null && this.mTrendStyleConfig != null) {
            JSONObject ext2 = iContainerInnerDataModel.getExt();
            if (ext2 != null) {
                this.mTrendStyleConfig.l(ext2.getString(yhy.INFO_FLOW_BACKGROUND_COLOR));
            }
            List<?> sections = iContainerInnerDataModel.getSections();
            if (sections != null && !sections.isEmpty()) {
                Iterator<?> it = sections.iterator();
                while (it.hasNext()) {
                    BaseSectionModel<?> baseSectionModel = (BaseSectionModel) it.next();
                    if (isHotTrendHeadCard(baseSectionModel) && (ext = baseSectionModel.getExt()) != null) {
                        this.mTrendStyleConfig.k(ext.getIntValue(yhy.HOT_TREND_TOP_MARGIN));
                        this.mTrendStyleConfig.o(ext.getIntValue(yhy.NORMAL_TREND_TOP_MARGIN));
                        this.mTrendStyleConfig.p(ext.getIntValue(yhy.TREND_HEADER_CORNER_RADIUS));
                        this.mTrendStyleConfig.j(ext.getString(yhy.HOT_TREND_BACKGROUND_START_COLOR));
                        this.mTrendStyleConfig.i(ext.getString(yhy.HOT_TREND_BACKGROUND_END_COLOR));
                        this.mTrendStyleConfig.n(ext.getString(yhy.NORMAL_TREND_BACKGROUND_START_COLOR));
                        this.mTrendStyleConfig.m(ext.getString(yhy.NORMAL_TREND_BACKGROUND_END_COLOR));
                        return;
                    }
                }
            }
        }
    }

    private void registerFeedsListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c3b860d", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "registerFeedsListener mMainFeedsViewService is null");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
        this.mFeedsScrollListener = createFeedsScrollListener;
        lifeCycleRegister.h(createFeedsScrollListener);
    }

    private void registerUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
        } else if (this.mContainerService != null) {
            IContainerService.a createOnUiRefreshListener = createOnUiRefreshListener();
            this.mOnUiRefreshListener = createOnUiRefreshListener;
            this.mContainerService.addUiRefreshListener(createOnUiRefreshListener);
        }
    }

    private void removeItemDecorationListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a3d2a2", new Object[]{this});
        } else if (this.itemDecorationListener != null) {
            this.mFeedsViewService.getLifeCycleRegister().F(this.itemDecorationListener);
            this.itemDecorationListener = null;
        }
    }

    private float transformScrollYToAlpha(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("550e1418", new Object[]{this, view})).floatValue();
        }
        float infoFlowCardTopDistance = getInfoFlowCardTopDistance(view);
        if (infoFlowCardTopDistance >= 0.4d) {
            return 1.0f;
        }
        return infoFlowCardTopDistance * 2.5f;
    }

    private void unRegisterOnScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10935563", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mFeedsViewService;
        if (iMainFeedsViewService == null) {
            fve.e(TAG, "unRegisterOnScrollListener mMainFeedsViewService is null");
            return;
        }
        h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
        h6c.c<ViewGroup> cVar = this.mFeedsScrollListener;
        if (cVar != null) {
            lifeCycleRegister.v(cVar);
            this.mFeedsScrollListener = null;
        }
    }

    private void unRegisterUiRefreshListener() {
        IContainerService<?> iContainerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        IContainerService.a aVar = this.mOnUiRefreshListener;
        if (aVar != null && (iContainerService = this.mContainerService) != null) {
            iContainerService.removeUiRefreshListener(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void addOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c63cf3", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.a(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService, tb.iqb
    public void destroyContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a77eae", new Object[]{this});
        } else {
            removeItemDecorationListener();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        this.mFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mContainerService = (IContainerService) this.mInfoFlowContext.a(IContainerService.class);
        this.mTrendStyleConfig = new yhy();
        this.mSeparatorRender = new why();
        registerFeedsListener();
        registerUiRefreshListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        unRegisterOnScrollListener();
        unRegisterUiRefreshListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void onFestivalRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void preCreateTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5839d311", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void removeOnContainerListener(iqb.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb950956", new Object[]{this, aVar});
        } else {
            this.containerLifecycleRegister.f(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setEnableCreateGlobalTheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e32816", new Object[]{this, str});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService
    public void setGlobalThemeVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a748e3f", new Object[]{this, new Boolean(z)});
        }
    }

    private boolean isHotTrendHeadCard(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c32c301d", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null) {
            return false;
        }
        return TextUtils.equals(baseSectionModel.getExt().getString("pageHeadMaterialType"), "outfit_trend_head_material_v1");
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IThemeService, tb.iqb
    public FrameLayout createContainer(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("3756b2fd", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        addItemDecorationListener();
        return frameLayout;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
                return;
            }
            eve.c(DressUpThemeServiceImpl.TAG, "onScroll");
            if (!DressUpPresentServiceImpl.isSingleDressUpDetail(DressUpThemeServiceImpl.this.mInfoFlowContext.getContainerType().getContainerId())) {
                eve.b(DressUpThemeServiceImpl.TAG, "onScroll");
            } else if (!(viewGroup instanceof RecyclerView)) {
                eve.b(DressUpThemeServiceImpl.TAG, "onScroll");
            } else if (((StaggeredGridLayoutManager) ((RecyclerView) viewGroup).getLayoutManager()) == null || DressUpThemeServiceImpl.access$100(DressUpThemeServiceImpl.this) == null) {
                eve.b(DressUpThemeServiceImpl.TAG, "onScroll");
            } else {
                int[] visiblePositionRange = DressUpThemeServiceImpl.access$100(DressUpThemeServiceImpl.this).getVisiblePositionRange();
                if (visiblePositionRange.length < 2) {
                    eve.b(DressUpThemeServiceImpl.TAG, "onScroll");
                    return;
                }
                for (int i3 = visiblePositionRange[0]; i3 < visiblePositionRange[1]; i3++) {
                    if (DressUpThemeServiceImpl.access$200(DressUpThemeServiceImpl.this, DressUpThemeServiceImpl.access$100(DressUpThemeServiceImpl.this).findItemDataByPosition(i3))) {
                        View findItemViewByPosition = DressUpThemeServiceImpl.access$100(DressUpThemeServiceImpl.this).findItemViewByPosition(i3);
                        DressUpThemeServiceImpl dressUpThemeServiceImpl = DressUpThemeServiceImpl.this;
                        DressUpThemeServiceImpl.access$302(dressUpThemeServiceImpl, DressUpThemeServiceImpl.access$400(dressUpThemeServiceImpl, findItemViewByPosition));
                        eve.b(DressUpThemeServiceImpl.TAG, "onScroll");
                        return;
                    }
                }
                eve.b(DressUpThemeServiceImpl.TAG, "onScroll");
            }
        }
    }
}
