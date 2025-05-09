package com.taobao.infoflow.taobao.subservice.biz.pop;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IStickyPopService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.pop.TbStickyPopDataParse;
import tb.cfc;
import tb.fve;
import tb.get;
import tb.h6c;
import tb.t2o;
import tb.ucm;
import tb.xm4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbStickyPopServiceImpl implements IStickyPopService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String POP_EVENT_NAME = "scrollPosition";
    private static final String POP_PARAMS_POSITION = "position";
    private static final String POP_POSITION_DOWN = "down";
    private static final String POP_POSITION_UP = "up";
    private static final String TAG = "TbStickyPopServiceImpl ";
    private static final String UCP_ACTION_NAME = "scrollPosition";
    private static final String UCP_ACTION_TYPE = "scroll";
    private static final String UCP_PAGE_NAME = "Page_Home";
    private static final String UCP_PARAMS_POSITION = "scrollPosition";
    private IContainerDataService<?> dataService;
    private h6c.d diffRefreshListener;
    private h6c.b feedsLayoutListener;
    private h6c.c feedsScrollListener;
    private boolean isStickyTopPopShowing;
    private IMainFeedsViewService<?> mainFeedsViewService;
    private Runnable stickyPopDelayTask;
    private final xm4 containerLifecycleRegister = new xm4();
    private final TbStickyPopDataParse stickyDataParse = new TbStickyPopDataParse();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
                return;
            }
            fve.e(TbStickyPopServiceImpl.TAG, "onDataChangeLayoutFinish");
            TbStickyPopServiceImpl.access$000(TbStickyPopServiceImpl.this);
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements h6c.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.h6c.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94ec7ab1", new Object[]{this});
                return;
            }
            fve.e(TbStickyPopServiceImpl.TAG, "onDiffRefreshFinish");
            TbStickyPopServiceImpl.access$000(TbStickyPopServiceImpl.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TbStickyPopServiceImpl.access$100(TbStickyPopServiceImpl.this) == null) {
                fve.e(TbStickyPopServiceImpl.TAG, "onUiRefresh...dataService is null");
            } else {
                IContainerDataModel<BaseSectionModel<?>> containerData = TbStickyPopServiceImpl.access$100(TbStickyPopServiceImpl.this).getContainerData();
                if (containerData == null) {
                    fve.e(TbStickyPopServiceImpl.TAG, "onUiRefresh...IContainerDataModel is null");
                    return;
                }
                TbStickyPopServiceImpl.access$200(TbStickyPopServiceImpl.this).f(containerData);
                TbStickyPopDataParse.a c = TbStickyPopServiceImpl.access$200(TbStickyPopServiceImpl.this).c();
                fve.e(TbStickyPopServiceImpl.TAG, "parse sticky data: " + c);
                TbStickyPopServiceImpl.access$300(TbStickyPopServiceImpl.this, c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TbStickyPopDataParse.a f10788a;

        public d(TbStickyPopDataParse.a aVar) {
            this.f10788a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbStickyPopServiceImpl.access$400(TbStickyPopServiceImpl.this, this.f10788a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements h6c.c<ViewGroup> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
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
                TbStickyPopServiceImpl.access$500(TbStickyPopServiceImpl.this, false);
            }
        }

        @Override // tb.h6c.c
        public void onScrolled(ViewGroup viewGroup, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7f64c91", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
            } else {
                TbStickyPopServiceImpl.access$500(TbStickyPopServiceImpl.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TbStickyPopServiceImpl.access$600(TbStickyPopServiceImpl.this);
            }
        }
    }

    static {
        t2o.a(491782576);
        t2o.a(488636610);
    }

    public static /* synthetic */ void access$000(TbStickyPopServiceImpl tbStickyPopServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3007258", new Object[]{tbStickyPopServiceImpl});
        } else {
            tbStickyPopServiceImpl.onUiRefresh();
        }
    }

    public static /* synthetic */ IContainerDataService access$100(TbStickyPopServiceImpl tbStickyPopServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataService) ipChange.ipc$dispatch("6ea892ab", new Object[]{tbStickyPopServiceImpl});
        }
        return tbStickyPopServiceImpl.dataService;
    }

    public static /* synthetic */ TbStickyPopDataParse access$200(TbStickyPopServiceImpl tbStickyPopServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TbStickyPopDataParse) ipChange.ipc$dispatch("47eb37a9", new Object[]{tbStickyPopServiceImpl});
        }
        return tbStickyPopServiceImpl.stickyDataParse;
    }

    public static /* synthetic */ void access$300(TbStickyPopServiceImpl tbStickyPopServiceImpl, TbStickyPopDataParse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09a86c2", new Object[]{tbStickyPopServiceImpl, aVar});
        } else {
            tbStickyPopServiceImpl.onUiRefresh(aVar);
        }
    }

    public static /* synthetic */ void access$400(TbStickyPopServiceImpl tbStickyPopServiceImpl, TbStickyPopDataParse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7132c3", new Object[]{tbStickyPopServiceImpl, aVar});
        } else {
            tbStickyPopServiceImpl.refresh(aVar);
        }
    }

    public static /* synthetic */ void access$500(TbStickyPopServiceImpl tbStickyPopServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a152397", new Object[]{tbStickyPopServiceImpl, new Boolean(z)});
        } else {
            tbStickyPopServiceImpl.updateStickyPop(z);
        }
    }

    public static /* synthetic */ void access$600(TbStickyPopServiceImpl tbStickyPopServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d7695e", new Object[]{tbStickyPopServiceImpl});
        } else {
            tbStickyPopServiceImpl.updateStickyPopInner();
        }
    }

    private h6c.d createDiffRefreshLister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.d) ipChange.ipc$dispatch("e235fac4", new Object[]{this});
        }
        return new b();
    }

    private h6c.c<ViewGroup> createFeedsScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.c) ipChange.ipc$dispatch("9fa113f9", new Object[]{this});
        }
        return new e();
    }

    private h6c.b createOnFeedsLayoutListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("a8a36fe", new Object[]{this});
        }
        return new a();
    }

    private int getFirstItemPosition() {
        int[] visiblePositionRange;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("426eb4f0", new Object[]{this})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mainFeedsViewService;
        if (iMainFeedsViewService == null || (visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange()) == null || visiblePositionRange.length < 2) {
            return -1;
        }
        return visiblePositionRange[0];
    }

    private View getViewByPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d0abae23", new Object[]{this, new Integer(i)});
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mainFeedsViewService;
        if (iMainFeedsViewService == null) {
            return null;
        }
        return iMainFeedsViewService.findItemViewByPosition(i);
    }

    private void initRegisterUIRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936afc8f", new Object[]{this});
        } else if (this.mainFeedsViewService != null) {
            this.feedsLayoutListener = createOnFeedsLayoutListener();
            this.diffRefreshListener = createDiffRefreshLister();
            this.mainFeedsViewService.getLifeCycleRegister().M(this.feedsLayoutListener);
            this.mainFeedsViewService.getLifeCycleRegister().i(this.diffRefreshListener);
        }
    }

    private void onUiRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d748b0f", new Object[]{this});
        } else {
            get.a().e(new c());
        }
    }

    private void refresh(TbStickyPopDataParse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6278c949", new Object[]{this, aVar});
        } else if (aVar == null || aVar.f10784a == null) {
            hideStickyTopPop();
            unRegisterScrollListener();
        } else {
            registerScrollListener();
            updateStickyPop(false);
        }
    }

    private void registerScrollListener() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d9e6ab", new Object[]{this});
        } else if (this.feedsScrollListener == null && (iMainFeedsViewService = this.mainFeedsViewService) != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            h6c.c<ViewGroup> createFeedsScrollListener = createFeedsScrollListener();
            this.feedsScrollListener = createFeedsScrollListener;
            lifeCycleRegister.h(createFeedsScrollListener);
        }
    }

    private void unRegisterScrollListener() {
        IMainFeedsViewService<?> iMainFeedsViewService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d0d1424", new Object[]{this});
        } else if (this.feedsScrollListener != null && (iMainFeedsViewService = this.mainFeedsViewService) != null) {
            iMainFeedsViewService.getLifeCycleRegister().v(this.feedsScrollListener);
            this.feedsScrollListener = null;
        }
    }

    private void unRegisterUIRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6810cba6", new Object[]{this});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.mainFeedsViewService;
        if (iMainFeedsViewService != null) {
            if (this.feedsLayoutListener != null) {
                iMainFeedsViewService.getLifeCycleRegister().k(this.feedsLayoutListener);
            }
            if (this.diffRefreshListener != null) {
                this.mainFeedsViewService.getLifeCycleRegister().s(this.diffRefreshListener);
            }
        }
    }

    private void updateStickyPop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c10e5ae", new Object[]{this, new Boolean(z)});
            return;
        }
        get.a().k(this.stickyPopDelayTask);
        if (!z) {
            updateStickyPopInner();
            return;
        }
        if (this.stickyPopDelayTask == null) {
            this.stickyPopDelayTask = new f();
        }
        get.a().f(this.stickyPopDelayTask, 100L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r1.bottom < r2.top) goto L_0x0069;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateStickyPopInner() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.infoflow.taobao.subservice.biz.pop.TbStickyPopServiceImpl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "ed73d5be"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            com.taobao.infoflow.taobao.subservice.biz.pop.TbStickyPopDataParse r0 = r4.stickyDataParse
            com.taobao.infoflow.taobao.subservice.biz.pop.TbStickyPopDataParse$a r0 = r0.c()
            if (r0 != 0) goto L_0x001b
            return
        L_0x001b:
            java.lang.String r1 = r0.f10784a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0024
            return
        L_0x0024:
            int r1 = r4.getFirstItemPosition()
            int r0 = r0.b
            if (r1 <= r0) goto L_0x002d
            goto L_0x0069
        L_0x002d:
            android.view.View r0 = r4.getViewByPosition(r0)
            if (r0 == 0) goto L_0x006d
            android.view.ViewParent r1 = r0.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L_0x006d
            android.view.ViewParent r1 = r0.getParent()
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.getGlobalVisibleRect(r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.getGlobalVisibleRect(r1)
            int r3 = r0.getWidth()
            if (r3 <= 0) goto L_0x006d
            int r3 = r0.getHeight()
            if (r3 <= 0) goto L_0x006d
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x006d
            int r0 = r1.bottom
            int r1 = r2.top
            if (r0 >= r1) goto L_0x006d
        L_0x0069:
            r4.showStickyTopPop()
            goto L_0x0070
        L_0x006d:
            r4.hideStickyTopPop()
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.infoflow.taobao.subservice.biz.pop.TbStickyPopServiceImpl.updateStickyPopInner():void");
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IStickyPopService
    public String getScrollPosition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ba2da6d", new Object[]{this});
        }
        if (this.isStickyTopPopShowing) {
            return "down";
        }
        return "up";
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.dataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        initRegisterUIRefreshListener();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        get.a().k(this.stickyPopDelayTask);
        this.isStickyTopPopShowing = false;
        unRegisterUIRefreshListener();
        unRegisterScrollListener();
        this.containerLifecycleRegister.b();
    }

    private void hideStickyTopPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923a1f6e", new Object[]{this});
            return;
        }
        if (this.isStickyTopPopShowing) {
            fve.e(TAG, "隐藏吸顶hideStickyTopPop");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scrollPosition", (Object) "up");
            UCPManager.p("Page_Home", "scroll", "scrollPosition", jSONObject);
            ucm.d("scrollPosition").c("position", "up").e();
        }
        this.isStickyTopPopShowing = false;
    }

    private void onUiRefresh(TbStickyPopDataParse.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd0e1f6", new Object[]{this, aVar});
        } else {
            get.a().h(new d(aVar));
        }
    }

    private void showStickyTopPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ba4729", new Object[]{this});
            return;
        }
        if (!this.isStickyTopPopShowing) {
            fve.e(TAG, "显示吸顶showStickyTopPop");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scrollPosition", (Object) "down");
            UCPManager.p("Page_Home", "scroll", "scrollPosition", jSONObject);
            ucm.d("scrollPosition").c("position", "down").e();
        }
        this.isStickyTopPopShowing = true;
    }
}
