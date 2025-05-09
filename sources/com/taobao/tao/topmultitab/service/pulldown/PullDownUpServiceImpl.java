package com.taobao.tao.topmultitab.service.pulldown;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.LocalizationManager;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.tbmainfragment.SupportFragment;
import com.taobao.tao.tbmainfragment.TBFragmentLifecycleCallbacks;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.controller.IHomeControllerService;
import com.taobao.tao.topmultitab.service.data.IHomeDataService;
import com.taobao.tao.topmultitab.service.lifecycle.IHomePageLifecycleService;
import com.taobao.tao.topmultitab.service.pageprovider.IHomePageProviderService;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.pulldown.request.SecondFloorConfigResult;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.bqa;
import tb.cfc;
import tb.edc;
import tb.f4b;
import tb.h7p;
import tb.h8x;
import tb.i7p;
import tb.imn;
import tb.ioq;
import tb.kbq;
import tb.m5a;
import tb.q4d;
import tb.r5a;
import tb.rtk;
import tb.rue;
import tb.rvk;
import tb.t2o;
import tb.tzq;
import tb.wcc;
import tb.xcc;
import tb.yyj;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PullDownUpServiceImpl implements IPullDownService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PullDownUpManager";
    private TBFragmentLifecycleCallbacks mCallbacks;
    private wcc mHomePageContext;
    private boolean mIsCreateView;
    private boolean mIsEnableSecondFloor;
    private boolean mIsInitSecondFloor;
    private boolean mIsRequestBack;
    private IHomePageLifecycleService mLifecycleService;
    private Localization.a mListener;
    private rtk mOnRequestListener;
    private q4d mOutLinker;
    private final List<TBSwipeRefreshLayout.OnPullRefreshListener> mPullRefreshListenerList = new CopyOnWriteArrayList();
    private com.taobao.tao.topmultitab.service.pulldown.a mSecondFloorDispatch;
    private com.taobao.tao.topmultitab.service.pulldown.request.a mSecondFloorRequest;
    private ioq mStraightController;
    private tzq mSwipeRefreshLayoutController;
    private rvk mUiRefreshListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            bqa.d(PullDownUpServiceImpl.TAG, "localeChange 更新多语言配置");
            PullDownUpServiceImpl pullDownUpServiceImpl = PullDownUpServiceImpl.this;
            Activity access$100 = PullDownUpServiceImpl.access$100(pullDownUpServiceImpl, PullDownUpServiceImpl.access$000(pullDownUpServiceImpl));
            if (access$100 == null) {
                bqa.d(PullDownUpServiceImpl.TAG, "localeChange mActivity为空");
                return;
            }
            LocalizationManager.h(access$100);
            PullDownUpServiceImpl.access$200(PullDownUpServiceImpl.this).v();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements q4d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.q4d
        public void onOutLink(String str, Intent intent, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dd04721", new Object[]{this, str, intent, str2});
            } else {
                PullDownUpServiceImpl.access$300(PullDownUpServiceImpl.this, str, intent, str2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements rvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.rvk
        public void a(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a163b5e6", new Object[]{this, imnVar, jSONObject, str});
            }
        }

        @Override // tb.rvk
        public void b(imn imnVar, JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0e63fb7", new Object[]{this, imnVar, jSONObject, str});
                return;
            }
            if (TextUtils.equals("coldStart", jSONObject.getString("requestType"))) {
                PullDownUpServiceImpl.access$400(PullDownUpServiceImpl.this, "coldStart");
                bqa.d(PullDownUpServiceImpl.TAG, "OnDataProcessListener,冷启刷新完成，开始初始化下拉刷新组件");
            }
            PullDownUpServiceImpl.access$200(PullDownUpServiceImpl.this).B(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements rtk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f12832a;

            public a(JSONObject jSONObject) {
                this.f12832a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    PullDownUpServiceImpl.access$500(PullDownUpServiceImpl.this, this.f12832a.getString("requestType"));
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
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
                    PullDownUpServiceImpl.access$200(PullDownUpServiceImpl.this).B(false);
                }
            }
        }

        public d() {
        }

        @Override // tb.rtk
        public void a(JSONObject jSONObject, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9ff1d92", new Object[]{this, jSONObject, str, str2});
            } else if (jSONObject != null) {
                m5a.a().i(new b());
            }
        }

        @Override // tb.rtk
        public void b(JSONObject jSONObject, AwesomeGetContainerData awesomeGetContainerData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a4537e1", new Object[]{this, jSONObject, awesomeGetContainerData});
            } else if (jSONObject != null) {
                m5a.a().i(new a(jSONObject));
            }
        }

        @Override // tb.rtk
        public void c(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e551f766", new Object[]{this, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements TBSwipeRefreshLayout.OnPullRefreshListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onPullDistance(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
                return;
            }
            PullDownUpServiceImpl.access$200(PullDownUpServiceImpl.this).s(i);
            PullDownUpServiceImpl.access$700(PullDownUpServiceImpl.this, i);
            if (PullDownUpServiceImpl.access$800(PullDownUpServiceImpl.this)) {
                PullDownUpServiceImpl.access$900(PullDownUpServiceImpl.this).e(i);
            }
            IHomeSubTabController access$1000 = PullDownUpServiceImpl.access$1000(PullDownUpServiceImpl.this);
            if (access$1000 != null) {
                access$1000.onPullDistance(i);
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            r5a.i("Page_Home", 2201, "Page_Home_Show-refresh", "expo=a2141.1.refresh.1:1007.refresh.1.1");
            PullDownUpServiceImpl.access$400(PullDownUpServiceImpl.this, "pullRefresh");
            PullDownUpServiceImpl.access$600(PullDownUpServiceImpl.this);
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
        public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                return;
            }
            PullDownUpServiceImpl.access$1100(PullDownUpServiceImpl.this, refreshState, refreshState2);
            if (refreshState == TBRefreshHeader.RefreshState.NONE && PullDownUpServiceImpl.access$1200(PullDownUpServiceImpl.this)) {
                PullDownUpServiceImpl pullDownUpServiceImpl = PullDownUpServiceImpl.this;
                if (!PullDownUpServiceImpl.access$1300(pullDownUpServiceImpl) || !PullDownUpServiceImpl.access$1400(PullDownUpServiceImpl.this)) {
                    z = false;
                }
                PullDownUpServiceImpl.access$802(pullDownUpServiceImpl, z);
                PullDownUpServiceImpl.access$200(PullDownUpServiceImpl.this).x(PullDownUpServiceImpl.access$800(PullDownUpServiceImpl.this));
            }
            if (PullDownUpServiceImpl.access$800(PullDownUpServiceImpl.this)) {
                PullDownUpServiceImpl.access$900(PullDownUpServiceImpl.this).f(refreshState, refreshState2);
            }
            IHomeSubTabController access$1000 = PullDownUpServiceImpl.access$1000(PullDownUpServiceImpl.this);
            if (access$1000 != null) {
                access$1000.onRefreshStateChanged(edc.a(refreshState), edc.a(refreshState2));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements TBSwipeRefreshLayout.RefreshAnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
        public void onRefreshBefore() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7bc491a2", new Object[]{this});
                return;
            }
            IHomeSubTabController access$1000 = PullDownUpServiceImpl.access$1000(PullDownUpServiceImpl.this);
            if (access$1000 != null) {
                access$1000.onPullRefresh();
            }
            bqa.d(PullDownUpServiceImpl.TAG, "发送下拉刷新请求");
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
        public void onRefreshCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd6e8b1d", new Object[]{this});
            }
        }

        @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.RefreshAnimationListener
        public void onRefreshEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e6df846", new Object[]{this});
            }
        }
    }

    static {
        t2o.a(729810276);
        t2o.a(729810274);
    }

    public static /* synthetic */ wcc access$000(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wcc) ipChange.ipc$dispatch("bb775fa0", new Object[]{pullDownUpServiceImpl});
        }
        return pullDownUpServiceImpl.mHomePageContext;
    }

    public static /* synthetic */ Activity access$100(PullDownUpServiceImpl pullDownUpServiceImpl, wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("1a3c18f1", new Object[]{pullDownUpServiceImpl, wccVar});
        }
        return pullDownUpServiceImpl.getActivity(wccVar);
    }

    public static /* synthetic */ IHomeSubTabController access$1000(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("f75730a9", new Object[]{pullDownUpServiceImpl});
        }
        return pullDownUpServiceImpl.getCurrentController();
    }

    public static /* synthetic */ void access$1100(PullDownUpServiceImpl pullDownUpServiceImpl, TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d071055f", new Object[]{pullDownUpServiceImpl, refreshState, refreshState2});
        } else {
            pullDownUpServiceImpl.notifyRefreshStateChanged(refreshState, refreshState2);
        }
    }

    public static /* synthetic */ boolean access$1200(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e972c6da", new Object[]{pullDownUpServiceImpl})).booleanValue();
        }
        return pullDownUpServiceImpl.mIsRequestBack;
    }

    public static /* synthetic */ boolean access$1300(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3bff9", new Object[]{pullDownUpServiceImpl})).booleanValue();
        }
        return pullDownUpServiceImpl.mIsEnableSecondFloor;
    }

    public static /* synthetic */ boolean access$1400(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e54b918", new Object[]{pullDownUpServiceImpl})).booleanValue();
        }
        return pullDownUpServiceImpl.isEnableSecondFloor();
    }

    public static /* synthetic */ tzq access$200(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzq) ipChange.ipc$dispatch("19324a94", new Object[]{pullDownUpServiceImpl});
        }
        return pullDownUpServiceImpl.mSwipeRefreshLayoutController;
    }

    public static /* synthetic */ void access$300(PullDownUpServiceImpl pullDownUpServiceImpl, String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d79f2315", new Object[]{pullDownUpServiceImpl, str, intent, str2});
        } else {
            pullDownUpServiceImpl.onOutLinkParams(str, intent, str2);
        }
    }

    public static /* synthetic */ void access$400(PullDownUpServiceImpl pullDownUpServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758d7ad", new Object[]{pullDownUpServiceImpl, str});
        } else {
            pullDownUpServiceImpl.requestSecondFloorConfig(str);
        }
    }

    public static /* synthetic */ void access$500(PullDownUpServiceImpl pullDownUpServiceImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67f670c", new Object[]{pullDownUpServiceImpl, str});
        } else {
            pullDownUpServiceImpl.onDataProcessFinishOnMainThread(str);
        }
    }

    public static /* synthetic */ void access$600(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f562e1", new Object[]{pullDownUpServiceImpl});
        } else {
            pullDownUpServiceImpl.notifyPullRefresh();
        }
    }

    public static /* synthetic */ void access$700(PullDownUpServiceImpl pullDownUpServiceImpl, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38659703", new Object[]{pullDownUpServiceImpl, new Integer(i)});
        } else {
            pullDownUpServiceImpl.notifyPullDistance(i);
        }
    }

    public static /* synthetic */ boolean access$800(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ed75523", new Object[]{pullDownUpServiceImpl})).booleanValue();
        }
        return pullDownUpServiceImpl.mIsInitSecondFloor;
    }

    public static /* synthetic */ boolean access$802(PullDownUpServiceImpl pullDownUpServiceImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa2bcf9b", new Object[]{pullDownUpServiceImpl, new Boolean(z)})).booleanValue();
        }
        pullDownUpServiceImpl.mIsInitSecondFloor = z;
        return z;
    }

    public static /* synthetic */ ioq access$900(PullDownUpServiceImpl pullDownUpServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ioq) ipChange.ipc$dispatch("ec6f229c", new Object[]{pullDownUpServiceImpl});
        }
        return pullDownUpServiceImpl.mStraightController;
    }

    private void addOutLinkListener(IHomePageLifecycleService iHomePageLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9772a6ac", new Object[]{this, iHomePageLifecycleService});
        } else if (iHomePageLifecycleService != null) {
            this.mOutLinker = createOutLinker();
            iHomePageLifecycleService.getOutLinkRegister().b(this.mOutLinker);
        }
    }

    private Localization.a createLocaleChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Localization.a) ipChange.ipc$dispatch("a6b7cd4b", new Object[]{this});
        }
        return new a();
    }

    private rtk createOnRequestListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rtk) ipChange.ipc$dispatch("4e972d29", new Object[]{this});
        }
        return new d();
    }

    private q4d createOutLinker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q4d) ipChange.ipc$dispatch("d0d2bb", new Object[]{this});
        }
        return new b();
    }

    private TBSwipeRefreshLayout.OnPullRefreshListener createPullRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.OnPullRefreshListener) ipChange.ipc$dispatch("2a4ec515", new Object[]{this});
        }
        return new e();
    }

    private TBSwipeRefreshLayout.RefreshAnimationListener createRefreshAnimationListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout.RefreshAnimationListener) ipChange.ipc$dispatch("b81e2084", new Object[]{this});
        }
        return new f();
    }

    private TBFragmentLifecycleCallbacks createTBFragmentLifecycleCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBFragmentLifecycleCallbacks) ipChange.ipc$dispatch("9b5e2106", new Object[]{this});
        }
        return new TBFragmentLifecycleCallbacks() { // from class: com.taobao.tao.topmultitab.service.pulldown.PullDownUpServiceImpl.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                if (str.hashCode() == -1791925260) {
                    super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/topmultitab/service/pulldown/PullDownUpServiceImpl$7");
            }

            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                    return;
                }
                super.onFragmentResumed(fragmentManager, fragment);
                if (fragment != null && TextUtils.equals("MyTaobaoFragment", fragment.getClass().getSimpleName()) && h8x.a()) {
                    bqa.d(PullDownUpServiceImpl.TAG, "去我淘了");
                    PullDownUpServiceImpl.access$200(PullDownUpServiceImpl.this).B(false);
                    PullDownUpServiceImpl.this.secondBackHome();
                }
            }
        };
    }

    private rvk createUiRefreshListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rvk) ipChange.ipc$dispatch("8d198fc8", new Object[]{this});
        }
        return new c();
    }

    private Activity getActivity(wcc wccVar) {
        IHomePageProviderService iHomePageProviderService;
        z6d pageProvider;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("5d25eeeb", new Object[]{this, wccVar});
        }
        if (wccVar == null || (iHomePageProviderService = (IHomePageProviderService) wccVar.a(IHomePageProviderService.class)) == null || (pageProvider = iHomePageProviderService.getPageProvider()) == null) {
            return null;
        }
        return pageProvider.k1();
    }

    private IHomeSubTabController getCurrentController() {
        IHomeControllerService iHomeControllerService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("2b13d4d7", new Object[]{this});
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar == null || (iHomeControllerService = (IHomeControllerService) wccVar.a(IHomeControllerService.class)) == null) {
            return null;
        }
        return iHomeControllerService.getCurrentSubTabController();
    }

    private boolean isEnableSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4666dd76", new Object[]{this})).booleanValue();
        }
        IHomeSubTabController currentController = getCurrentController();
        if (currentController != null) {
            return currentController.isEnableToSecondFloor();
        }
        bqa.d(TAG, "homeSubTabController == null");
        return false;
    }

    private void notifyPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fc1f9", new Object[]{this, new Integer(i)});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.mPullRefreshListenerList) {
            onPullRefreshListener.onPullDistance(i);
        }
    }

    private void notifyPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a95d83d4", new Object[]{this});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.mPullRefreshListenerList) {
            onPullRefreshListener.onRefresh();
        }
    }

    private void notifyRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19765904", new Object[]{this, refreshState, refreshState2});
            return;
        }
        for (TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener : this.mPullRefreshListenerList) {
            onPullRefreshListener.onRefreshStateChanged(refreshState, refreshState2);
        }
    }

    private void onDataProcessFinishOnMainThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62909b8c", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals("coldStart", str)) {
            requestSecondFloorConfig("coldStart");
            bqa.d(TAG, "OnDataProcessListener,冷启刷新完成，开始初始化下拉刷新组件");
        }
        this.mSwipeRefreshLayoutController.B(false);
    }

    private void onOutLinkParams(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af9f207", new Object[]{this, str, intent, str2});
            return;
        }
        HomeInfoFlowDataService a2 = rue.a(yyj.e().k());
        if (a2 != null && a2.isAnimeConfigValidate(str2)) {
            this.mSwipeRefreshLayoutController.u();
        }
    }

    private void registerTBFragmentLifecycleCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f23722c", new Object[]{this});
            return;
        }
        TBFragmentLifecycleCallbacks createTBFragmentLifecycleCallbacks = createTBFragmentLifecycleCallbacks();
        this.mCallbacks = createTBFragmentLifecycleCallbacks;
        SupportFragment.registerTBLifecycleCallbacks(createTBFragmentLifecycleCallbacks);
    }

    private void removeOutLinkListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822e9c9f", new Object[]{this});
            return;
        }
        IHomePageLifecycleService iHomePageLifecycleService = this.mLifecycleService;
        if (iHomePageLifecycleService != null && this.mOutLinker != null) {
            iHomePageLifecycleService.getOutLinkRegister().a(this.mOutLinker);
        }
    }

    private void requestSecondFloorConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c9fadc", new Object[]{this, str});
            return;
        }
        bqa.d(TAG, "请求二楼配置： " + str);
        this.mSecondFloorRequest.i(str);
    }

    private void unRegisterTBFragmentLifecycleCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("797917e5", new Object[]{this});
            return;
        }
        TBFragmentLifecycleCallbacks tBFragmentLifecycleCallbacks = this.mCallbacks;
        if (tBFragmentLifecycleCallbacks != null) {
            SupportFragment.unRegisterTBLifecycleCallbacks(tBFragmentLifecycleCallbacks);
        }
    }

    private void unRegisterUiRefreshListener() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4b9786", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null) {
            rvk rvkVar = this.mUiRefreshListener;
            if (rvkVar != null) {
                iHomeDataService.removeOnUiRefreshListener(rvkVar);
            }
            rtk rtkVar = this.mOnRequestListener;
            if (rtkVar != null) {
                iHomeDataService.removeOnRequestListener(rtkVar);
            }
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void addPullRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("237f8a04", new Object[]{this, onPullRefreshListener});
        } else {
            this.mPullRefreshListenerList.add(onPullRefreshListener);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void addPullSecondFloorListener(IPullDownService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a128c847", new Object[]{this, aVar});
        } else {
            this.mSecondFloorDispatch.a(aVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public float getDistanceToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6efe49", new Object[]{this})).floatValue();
        }
        if (!this.mIsCreateView) {
            return 2.14748365E9f;
        }
        return this.mSwipeRefreshLayoutController.l();
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public int getRefreshOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fae1c812", new Object[]{this})).intValue();
        }
        if (!this.mIsCreateView) {
            return 0;
        }
        return this.mSwipeRefreshLayoutController.n();
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public boolean isRefreshing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56d673fc", new Object[]{this})).booleanValue();
        }
        if (!this.mIsCreateView) {
            return false;
        }
        return this.mSwipeRefreshLayoutController.q();
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService, com.taobao.infoflow.protocol.subservice.ISubService
    public /* synthetic */ void onCreateService(cfc cfcVar) {
        xcc.a(this, cfcVar);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else if (this.mIsCreateView) {
            Localization.s(this.mListener);
            removeOutLinkListener();
            unRegisterUiRefreshListener();
            unRegisterTBFragmentLifecycleCallbacks();
            this.mSwipeRefreshLayoutController.k();
            this.mStraightController.c();
            bqa.d(TAG, "destroy");
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void removePullRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b49701", new Object[]{this, onPullRefreshListener});
        } else if (!this.mPullRefreshListenerList.isEmpty()) {
            this.mPullRefreshListenerList.remove(onPullRefreshListener);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void removePullSecondFloorListener(IPullDownService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f5516a", new Object[]{this, aVar});
        } else {
            this.mSecondFloorDispatch.d(aVar);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void secondBackHome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48d70e81", new Object[]{this});
        } else if (this.mIsCreateView) {
            this.mStraightController.h();
            this.mSwipeRefreshLayoutController.B(false);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void setEnablePullRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d49396bc", new Object[]{this, new Boolean(z)});
        } else if (this.mIsCreateView) {
            this.mSwipeRefreshLayoutController.w(z);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void setEnableToSecondFloor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ae6035", new Object[]{this, new Boolean(z)});
            return;
        }
        bqa.d(TAG, "setEnableToSecondFloor： " + z);
        this.mIsEnableSecondFloor = z;
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void setRefreshHeaderAlpha(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3eae21", new Object[]{this, new Float(f2)});
        } else if (this.mIsCreateView) {
            this.mSwipeRefreshLayoutController.A(f2);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void setRefreshing(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("706bb7a4", new Object[]{this, new Boolean(z)});
        } else if (this.mIsCreateView) {
            this.mSwipeRefreshLayoutController.B(z);
        }
    }

    private void registerUiRefreshListener() {
        IHomeDataService iHomeDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb2e39f", new Object[]{this});
            return;
        }
        wcc wccVar = this.mHomePageContext;
        if (wccVar != null && (iHomeDataService = (IHomeDataService) wccVar.a(IHomeDataService.class)) != null) {
            if (f4b.b("refreshAfterDataProcess", true)) {
                rtk createOnRequestListener = createOnRequestListener();
                this.mOnRequestListener = createOnRequestListener;
                iHomeDataService.addOnRequestListener(createOnRequestListener);
                return;
            }
            rvk createUiRefreshListener = createUiRefreshListener();
            this.mUiRefreshListener = createUiRefreshListener;
            iHomeDataService.addOnUiRefreshListener(createUiRefreshListener);
        }
    }

    @Override // com.taobao.tao.topmultitab.service.base.IHomePageService
    public void onCreateService(wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("312ad712", new Object[]{this, wccVar});
            return;
        }
        this.mHomePageContext = wccVar;
        this.mLifecycleService = (IHomePageLifecycleService) wccVar.a(IHomePageLifecycleService.class);
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void createView(TBSwipeRefreshLayout tBSwipeRefreshLayout, View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ea964f", new Object[]{this, tBSwipeRefreshLayout, view});
            return;
        }
        Activity activity = getActivity(this.mHomePageContext);
        this.mSecondFloorDispatch = new com.taobao.tao.topmultitab.service.pulldown.a(this.mHomePageContext);
        this.mStraightController = new ioq(view, this.mHomePageContext, activity, this.mSecondFloorDispatch);
        this.mSwipeRefreshLayoutController = new tzq(this.mHomePageContext, tBSwipeRefreshLayout, activity);
        this.mSecondFloorRequest = new com.taobao.tao.topmultitab.service.pulldown.request.a(this);
        this.mSwipeRefreshLayoutController.y(createPullRefreshListener());
        this.mSwipeRefreshLayoutController.z(createRefreshAnimationListener());
        Localization.a createLocaleChangeListener = createLocaleChangeListener();
        this.mListener = createLocaleChangeListener;
        Localization.a(createLocaleChangeListener);
        addOutLinkListener(this.mLifecycleService);
        registerUiRefreshListener();
        registerTBFragmentLifecycleCallbacks();
        IHomeSubTabController currentController = getCurrentController();
        if (currentController != null) {
            z = currentController.isEnableToSecondFloor();
        } else if (!kbq.e(activity)) {
            z = true;
        }
        this.mIsEnableSecondFloor = z;
        this.mIsCreateView = true;
        bqa.d(TAG, "创建视图");
    }

    @Override // com.taobao.tao.topmultitab.service.pulldown.IPullDownService
    public void updateSecondFloorConfig(SecondFloorConfigResult secondFloorConfigResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0b6da2", new Object[]{this, secondFloorConfigResult});
        } else if (this.mIsCreateView) {
            this.mSwipeRefreshLayoutController.D(i7p.d(secondFloorConfigResult), secondFloorConfigResult.refreshConfig);
            h7p a2 = i7p.a(secondFloorConfigResult);
            if (!a2.f()) {
                this.mIsEnableSecondFloor = false;
                bqa.d(TAG, "二楼配置不符合预期 不允许下拉二楼");
                return;
            }
            this.mStraightController.j(a2);
            this.mIsRequestBack = true;
            bqa.d(TAG, "更新二楼配置");
        }
    }
}
