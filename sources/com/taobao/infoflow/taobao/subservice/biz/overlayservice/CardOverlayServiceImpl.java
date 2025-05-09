package com.taobao.infoflow.taobao.subservice.biz.overlayservice;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.HashMap;
import java.util.Map;
import tb.ayd;
import tb.cfc;
import tb.fve;
import tb.gb7;
import tb.h6c;
import tb.h6d;
import tb.l6d;
import tb.m47;
import tb.t2o;
import tb.v83;
import tb.w4d;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CardOverlayServiceImpl implements ICardOverlayService<ViewGroup> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FloatingLayerServiceImpl";
    private final Map<Integer, BaseSectionModel<?>> mCardDataMap = new HashMap(4);
    private v83 mCardOverlayWaiter;
    private gb7 mDeleteHostCardHelper;
    private IMainFeedsViewService mMainFeedsViewService;
    private IMainLifecycleService mMainLifecycleService;
    private h6c.c mOnFeedsScrollListener;
    private w4d.a mOverlayRenderListener;
    private h6d mPageLifecycle;
    private zxd mTabLifecycle;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6c.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
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
            } else {
                CardOverlayServiceImpl.access$000(CardOverlayServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends m47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/overlayservice/CardOverlayServiceImpl$2");
        }

        @Override // tb.m47, tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else {
                CardOverlayServiceImpl.access$000(CardOverlayServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements zxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.zxd
        public void onPageScrolled(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            }
        }

        @Override // tb.zxd
        public void onPageSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            }
        }

        @Override // tb.zxd
        public void onPageUnSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            } else {
                CardOverlayServiceImpl.access$000(CardOverlayServiceImpl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements w4d.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.w4d.a
        public void a(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1db1af9d", new Object[]{this, baseSectionModel, baseSectionModel2});
            } else {
                CardOverlayServiceImpl.access$100(CardOverlayServiceImpl.this).put(Integer.valueOf(System.identityHashCode(baseSectionModel)), baseSectionModel2);
            }
        }
    }

    static {
        t2o.a(491782444);
        t2o.a(488636540);
    }

    public static /* synthetic */ void access$000(CardOverlayServiceImpl cardOverlayServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0890180", new Object[]{cardOverlayServiceImpl});
        } else {
            cardOverlayServiceImpl.pagePause();
        }
    }

    public static /* synthetic */ Map access$100(CardOverlayServiceImpl cardOverlayServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("83f89854", new Object[]{cardOverlayServiceImpl});
        }
        return cardOverlayServiceImpl.mCardDataMap;
    }

    private void addScrollListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86abed29", new Object[]{this});
            return;
        }
        h6c lifeCycleRegister = this.mMainFeedsViewService.getLifeCycleRegister();
        if (lifeCycleRegister != null) {
            a aVar = new a();
            this.mOnFeedsScrollListener = aVar;
            lifeCycleRegister.h(aVar);
        }
    }

    private w4d.a createOverlayRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4d.a) ipChange.ipc$dispatch("16e1c827", new Object[]{this});
        }
        return new d();
    }

    private h6d createPageLifecycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("13c26aa9", new Object[]{this});
        }
        return new b();
    }

    private zxd createTabLifeCycle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxd) ipChange.ipc$dispatch("34d67fe5", new Object[]{this});
        }
        return new c();
    }

    private w4d.a getOverlayRenderListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4d.a) ipChange.ipc$dispatch("cd67ba8d", new Object[]{this});
        }
        if (this.mOverlayRenderListener == null) {
            this.mOverlayRenderListener = createOverlayRenderListener();
        }
        return this.mOverlayRenderListener;
    }

    private void pagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356fedae", new Object[]{this});
            return;
        }
        v83 v83Var = this.mCardOverlayWaiter;
        if (v83Var != null) {
            v83Var.d();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void deleteOverlayHostCard(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92db416c", new Object[]{this, baseSectionModel});
            return;
        }
        BaseSectionModel<?> findHostCard = findHostCard(baseSectionModel);
        if (findHostCard != null) {
            int identityHashCode = System.identityHashCode(baseSectionModel);
            this.mDeleteHostCardHelper.b(findHostCard);
            this.mCardDataMap.remove(Integer.valueOf(identityHashCode));
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public BaseSectionModel<?> findHostCard(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("e6e849de", new Object[]{this, baseSectionModel});
        }
        if (this.mDeleteHostCardHelper == null || this.mCardDataMap.isEmpty()) {
            return null;
        }
        return this.mCardDataMap.get(Integer.valueOf(System.identityHashCode(baseSectionModel)));
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void hideOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4786e35", new Object[]{this});
            return;
        }
        v83 v83Var = this.mCardOverlayWaiter;
        if (v83Var == null) {
            fve.e(TAG, "hide overlay,mOverlayWaiter == null");
        } else {
            v83Var.c();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mCardOverlayWaiter = new v83(cfcVar);
        this.mDeleteHostCardHelper = new gb7(cfcVar);
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.mMainLifecycleService = iMainLifecycleService;
        if (iMainLifecycleService != null) {
            l6d pageLifeCycleRegister = iMainLifecycleService.getPageLifeCycleRegister();
            if (pageLifeCycleRegister != null) {
                h6d createPageLifecycle = createPageLifecycle();
                this.mPageLifecycle = createPageLifecycle;
                pageLifeCycleRegister.a(createPageLifecycle);
            }
            ayd tabLifeCycleRegister = this.mMainLifecycleService.getTabLifeCycleRegister();
            if (tabLifeCycleRegister != null) {
                zxd createTabLifeCycle = createTabLifeCycle();
                this.mTabLifecycle = createTabLifeCycle;
                tabLifeCycleRegister.a(createTabLifeCycle);
            }
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        this.mMainFeedsViewService = iMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            addScrollListener();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        h6c.c cVar;
        zxd zxdVar;
        h6d h6dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.mMainLifecycleService;
        if (iMainLifecycleService != null) {
            l6d pageLifeCycleRegister = iMainLifecycleService.getPageLifeCycleRegister();
            if (!(pageLifeCycleRegister == null || (h6dVar = this.mPageLifecycle) == null)) {
                pageLifeCycleRegister.b(h6dVar);
                this.mPageLifecycle = null;
            }
            ayd tabLifeCycleRegister = this.mMainLifecycleService.getTabLifeCycleRegister();
            if (!(tabLifeCycleRegister == null || (zxdVar = this.mTabLifecycle) == null)) {
                tabLifeCycleRegister.b(zxdVar);
                this.mTabLifecycle = null;
            }
            this.mMainLifecycleService = null;
        }
        IMainFeedsViewService iMainFeedsViewService = this.mMainFeedsViewService;
        if (iMainFeedsViewService != null) {
            h6c lifeCycleRegister = iMainFeedsViewService.getLifeCycleRegister();
            if (!(lifeCycleRegister == null || (cVar = this.mOnFeedsScrollListener) == null)) {
                lifeCycleRegister.v(cVar);
                this.mOnFeedsScrollListener = null;
            }
            this.mMainFeedsViewService = null;
        }
        this.mCardOverlayWaiter = null;
        this.mDeleteHostCardHelper = null;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void removeOverlayView(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0a4dd0", new Object[]{this, str, view});
        } else if (view != null) {
            this.mCardOverlayWaiter.e(str, view);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void showOverlay(String str, View view, BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffe6fb6", new Object[]{this, str, view, baseSectionModel});
            return;
        }
        v83 v83Var = this.mCardOverlayWaiter;
        if (v83Var == null) {
            fve.e(TAG, "show overlay,mOverlayWaiter == null");
        } else {
            v83Var.f(str, view, baseSectionModel, getOverlayRenderListener());
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService
    public void showOverlayWithOverlayData(String str, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96184e2", new Object[]{this, str, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        v83 v83Var = this.mCardOverlayWaiter;
        if (v83Var == null) {
            fve.e(TAG, "show overlay with overlay data,mOverlayWaiter == null");
        } else {
            v83Var.g(str, view, baseSectionModel, baseSectionModel2, getOverlayRenderListener(), view2);
        }
    }
}
