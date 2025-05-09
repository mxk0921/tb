package com.taobao.android.fluid.framework.hostcontainer.pageinterface.page;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.android.fluid.framework.quickopen.IQuickOpenService;
import com.taobao.android.layoutmanager.container.MultiPageContainerActivity;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import com.taobao.android.nav.Nav;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.akt;
import tb.anl;
import tb.bod;
import tb.c2v;
import tb.c3a;
import tb.d3a;
import tb.f2k;
import tb.g0a;
import tb.h57;
import tb.hpj;
import tb.i0v;
import tb.ir9;
import tb.nwv;
import tb.pcw;
import tb.reu;
import tb.sj4;
import tb.sll;
import tb.t2o;
import tb.xau;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullPage extends anl implements bod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALPHA = 255;
    private static final String BACK_TAB = "back2Tab2";
    private static final String BACK_URL = "backUrl";
    public static final String DEFAULT_URL = "https://h5.m.taobao.com/guangguang/index.htm?tabid=video&extParams=%7B%22sceneSource%22%3A%22taobao-growthcollection%22%7D";
    public static final String IS_DYNAMIC_MODE = "isDynamicMode";
    private static final String PAGE_VIDEO_INTERACT = "Page_videointeract";
    public static final String PARAM_BACK2Tab2URL = "backUrl";
    public static final String PRE_PLAYER_MAP_KEY = "prePlayerMapKey";
    public static final String SHORT_VIDEO_ENABLE_BACK_TO_URL = "ShortVideo.enableBackToUrl";
    public static final String SOURCE = "source";
    public static final int STATUS_BAR_COLOR = -16777216;
    private final boolean isFromSecPage;
    private IBackEventService mBackEventService;
    private IContainerService mContainerService;
    private View mContentView;
    private final Context mContext;
    private GestureLayout mDecorView;
    private FluidInstance mFluidInstance;
    private boolean mHasSelfTransitionExecuted;
    private final boolean mHasShareElement;
    private boolean mIsFinishing;
    private final boolean mIsNeedTransferAnimation;
    private final boolean mIsTransparent;
    private IMediaService mMediaService;
    private final sll mPageContainer;
    private final Activity mUTActivity;
    private final Uri mUri;
    private int mLastOption = -1;
    private int mLastStatusBarColor = -1;
    private boolean mIsFromSlidingFinish = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7820a;

        public a(String str) {
            this.f7820a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Nav.from(FullPage.access$000(FullPage.this)).toUri(this.f7820a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7821a;

        public b(String str) {
            this.f7821a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Nav.from(FullPage.access$000(FullPage.this)).toUri(this.f7821a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements i0v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.i0v
        public void a(Map map, Map map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61821f90", new Object[]{this, map, map2});
            } else if (map != null) {
                if (map2 != null) {
                    UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(FullPage.this.getUTObject(), map2);
                }
                FullPage.this.setFirstPageName("Page_videointeract");
                FullPage.this.setFirstPageProperty(map);
            }
        }
    }

    static {
        t2o.a(468714393);
        t2o.a(503316975);
    }

    public FullPage(Context context, sll sllVar, String str, boolean z, boolean z2) {
        boolean z3 = false;
        this.mContext = context;
        this.url = str;
        Uri parse = Uri.parse(str);
        this.mUri = parse;
        this.mPageContainer = sllVar;
        this.mIsTransparent = z;
        this.mHasShareElement = z2;
        this.isFromSecPage = nwv.o(parse.getQueryParameter(IS_DYNAMIC_MODE), false);
        if (g0a.d() && z) {
            z3 = true;
        }
        this.mIsNeedTransferAnimation = z3;
        this.mUTActivity = new Activity();
        initAdapter(context);
        mixOnCreate();
    }

    public static /* synthetic */ Context access$000(FullPage fullPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bb34b604", new Object[]{fullPage});
        }
        return fullPage.mContext;
    }

    private void back2OrangeUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dc731fd", new Object[]{this});
            return;
        }
        Uri uri = this.mUri;
        if (uri != null && nwv.o(uri.getQueryParameter(BACK_TAB), false) && (this.mContext instanceof MultiPageContainerActivity)) {
            String H2 = akt.H2("ShortVideo.videoBackUrl", DEFAULT_URL);
            if (!TextUtils.isEmpty(H2)) {
                ((MultiPageContainerActivity) this.mContext).setPageFinishTask(new a(H2));
            }
        }
    }

    private boolean back2SpecificUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2632b13d", new Object[]{this})).booleanValue();
        }
        Uri uri = this.mUri;
        if (uri != null) {
            String queryParameter = uri.getQueryParameter("backUrl");
            if (enableBackToUrl() && !TextUtils.isEmpty(queryParameter)) {
                Context context = this.mContext;
                if (context instanceof MultiPageContainerActivity) {
                    ((MultiPageContainerActivity) context).setPageFinishTask(new b(queryParameter));
                }
                return true;
            }
        }
        return false;
    }

    private void createFluidInstance(String str, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be99b2c0", new Object[]{this, str, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        FluidInstanceConfig.a v = FluidInstanceConfig.a.p().e(this.mContext).m(this).G(new c()).c("default").b(FluidInstanceConfig.appendBizName("default")).r(sj4.PLAY_SCENES).h(this.url, this.mUri).v(sj4.f28084a);
        Boolean bool = Boolean.TRUE;
        FluidInstance createFluidInstance = FluidSDK.createFluidInstance(v.q(bool).s(str).o(Boolean.valueOf(this.mIsNeedTransferAnimation)).F(Integer.valueOf(i)).E(Integer.valueOf(i2)).i(bool).f(Boolean.valueOf(this.isFromSecPage)).j(Boolean.valueOf(z)).g(new h57()).d());
        this.mFluidInstance = createFluidInstance;
        createFluidInstance.onCreate();
        this.mMediaService = (IMediaService) this.mFluidInstance.getService(IMediaService.class);
        this.mContainerService = (IContainerService) this.mFluidInstance.getService(IContainerService.class);
        this.mBackEventService = (IBackEventService) this.mFluidInstance.getService(IBackEventService.class);
        this.mContainerService.renderContainerOnCreate(this.mContext);
        ((IQuickOpenService) this.mFluidInstance.getService(IQuickOpenService.class)).setUsePreSize(pcw.t(this.mUri));
    }

    private boolean enableBackToUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab805995", new Object[]{this})).booleanValue();
        }
        return akt.p2(SHORT_VIDEO_ENABLE_BACK_TO_URL, true);
    }

    private String findSource() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee119c45", new Object[]{this});
        }
        Uri uri = this.mUri;
        if (uri == null) {
            return null;
        }
        return uri.getQueryParameter("source");
    }

    private void handleBackUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9eedc47", new Object[]{this});
        } else if (!back2SpecificUrl()) {
            back2OrangeUrl();
        }
    }

    private void initAdapter(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740ca162", new Object[]{this, context});
        }
    }

    public static /* synthetic */ Object ipc$super(FullPage fullPage, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/pageinterface/page/FullPage");
        }
    }

    private boolean isInSecondPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c72dfd", new Object[]{this})).booleanValue();
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper == null || !findSecPageWrapper.g()) {
            return false;
        }
        return true;
    }

    private boolean isSecondPageEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf6065b", new Object[]{this})).booleanValue();
        }
        if (!g0a.b() || !g0a.a(findSource())) {
            return false;
        }
        return true;
    }

    private void mixOnDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c02df26", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            fluidInstance.onDestroy();
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            findSecPageWrapper.m();
        }
        c2v.getInstance().pageDestroyed(this.mUTActivity);
        handleBackUrl();
    }

    private void mixOnPause() {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d63ac62", new Object[]{this});
            return;
        }
        boolean isInSecondPage = isInSecondPage();
        if (!isInSecondPage && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onPause();
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getUTObject());
        if (isInSecondPage) {
            findSecPageWrapper().l();
        }
    }

    private void mixOnResume() {
        FluidInstance fluidInstance;
        Map<String, String> pageUTProperties;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63711def", new Object[]{this});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(getUTObject());
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(getUTObject(), "Page_videointeract");
        FluidInstance fluidInstance2 = this.mFluidInstance;
        if (!(fluidInstance2 == null || (pageUTProperties = ((ITrackService) fluidInstance2.getService(ITrackService.class)).getPageUTProperties()) == null)) {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getUTObject(), pageUTProperties);
        }
        boolean isInSecondPage = isInSecondPage();
        if (!isInSecondPage && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onResume();
        }
        if (isInSecondPage) {
            findSecPageWrapper().n();
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().updatePageUrl(getUTObject(), this.mUri);
        requestPopLayer();
    }

    private void mixOnStart() {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0934ce", new Object[]{this});
        } else if (!isInSecondPage() && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onRealStart();
            this.mFluidInstance.onStart();
        }
    }

    private void mixOnStop() {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea1e04", new Object[]{this});
        } else if (!isInSecondPage() && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onStop();
            this.mFluidInstance.onRealStop();
        }
    }

    private void processContainer(GestureLayout gestureLayout, reu reuVar) {
        int i;
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8367c679", new Object[]{this, gestureLayout, reuVar});
            return;
        }
        boolean i3 = reuVar.i();
        if (!i3 && this.mIsTransparent) {
            i3 = true;
        }
        boolean g = reuVar.g();
        if (reuVar.h(getActivity())) {
            if (isSecondPageEnable()) {
                i = 12;
            } else {
                i = 4;
            }
            gestureLayout.setGestureSupportType(this, i);
        } else if (i3) {
            if (isSecondPageEnable()) {
                i2 = 9;
            }
            gestureLayout.setGestureSupportType(this, i2);
        } else if (g) {
            gestureLayout.setGestureSupportType(this, 2);
        }
    }

    private void processTransition(reu reuVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("811548f8", new Object[]{this, reuVar, new Boolean(z)});
        } else if (!z) {
            startNormalTransition(reuVar);
        }
    }

    private void requestPopLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9daa36", new Object[]{this});
            return;
        }
        Intent intent = new Intent(PopLayer.ACTION_FRAGMENT_SWITCH);
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_NAME, "FullPage");
        intent.putExtra(PopLayer.EXTRA_KEY_FRAGMENT_PARAM, this.url);
        LocalBroadcastManager.getInstance(this.mContext).sendBroadcast(intent);
    }

    private void resetStatusBar(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a2f44b", new Object[]{this, activity});
            return;
        }
        try {
            if (this.mLastOption >= 0 && this.mLastStatusBarColor >= 0) {
                activity.getWindow().getDecorView().setSystemUiVisibility(this.mLastOption);
                activity.getWindow().setStatusBarColor(this.mLastStatusBarColor);
            }
        } catch (Exception e) {
            ir9.c("FullPage", "setTransparentStatusBar", e);
        }
    }

    private boolean tryToInterceptBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("404f5de", new Object[]{this})).booleanValue();
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            return ((IBackEventService) fluidInstance.getService(IBackEventService.class)).tryToInterceptBack();
        }
        return false;
    }

    @Override // tb.bod
    public ye<?> findSecPageWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ye) ipChange.ipc$dispatch("5175a518", new Object[]{this});
        }
        return this.mDecorView.mSecPageWrapper;
    }

    public <T extends View> T findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)}));
        }
        View view = this.mContentView;
        if (view == null) {
            return (T) ((Activity) this.mContext).findViewById(i);
        }
        return (T) view.findViewById(i);
    }

    @Override // tb.anl
    public void finish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d82167a", new Object[]{this, new Boolean(z)});
        } else {
            getPageContainer().x(this, z);
        }
    }

    @Override // tb.anl
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return (Activity) this.mContext;
    }

    @Override // tb.anl
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.mContainerService.getContentView();
    }

    @Override // tb.anl
    public View getDecorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6d69b8fd", new Object[]{this});
        }
        return this.mDecorView;
    }

    public String getFirstPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("232786a5", new Object[]{this});
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return ((d3a) findSecPageWrapper).A();
        }
        return null;
    }

    @Override // tb.w4e
    public Map getFirstPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8efdfe9a", new Object[]{this});
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return ((d3a) findSecPageWrapper).getFirstPageProperty();
        }
        return null;
    }

    @Override // tb.anl
    public sll getPageContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sll) ipChange.ipc$dispatch("16ff9556", new Object[]{this});
        }
        return this.mPageContainer;
    }

    public String getSecondPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19bb6e35", new Object[]{this});
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return ((d3a) findSecPageWrapper).B();
        }
        return null;
    }

    public Map getSecondPageProperty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ae7090a", new Object[]{this});
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return ((d3a) findSecPageWrapper).C();
        }
        return null;
    }

    public Object getSecondPageUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e1f89714", new Object[]{this});
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            return ((d3a) findSecPageWrapper).D();
        }
        return null;
    }

    @Override // tb.anl
    public Object getUTObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbe25f7", new Object[]{this});
        }
        return this.mUTActivity;
    }

    @Override // tb.anl
    public boolean isFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd16a70", new Object[]{this})).booleanValue();
        }
        return this.mIsFinishing;
    }

    @Override // tb.anl
    public boolean isFullPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2c98193", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.hpj.b
    public void onBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc8977", new Object[]{this, str});
        } else if (hpj.b(str)) {
            hpj.c(getActivity(), 200L, 0.32f, 1.0f).start();
        }
    }

    @Override // tb.anl
    public void onBackButtonClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767cf6b7", new Object[]{this});
        } else if (!tryToInterceptBack() && !this.mDecorView.performCloseAnimation()) {
            finish(true);
        }
    }

    @Override // tb.anl
    public boolean onBackPressed(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d542d5", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z || ye.h(this)) {
            return ye.b(null, this);
        }
        if (tryToInterceptBack()) {
            return true;
        }
        return this.mDecorView.performCloseAnimation();
    }

    @Override // tb.anl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        mixOnDestroy();
        if (!this.isFromSecPage && !this.transition.h(getActivity()) && !this.mIsFromSlidingFinish && this.mIsTransparent) {
            hpj.c(getActivity(), 200L, 1.0f, 0.0f).start();
        }
        resetStatusBar(getActivity());
    }

    @Override // tb.hpj.b
    public void onFinish(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968e7fbd", new Object[]{this, str, new Float(f)});
            return;
        }
        this.mIsFromSlidingFinish = true;
        if (this.isFromSecPage) {
            return;
        }
        if (hpj.b(str)) {
            hpj.d(getActivity(), (int) (f * 82.0f));
        } else {
            hpj.c(getActivity(), 200L, 1.0f, 0.0f).start();
        }
    }

    @Override // tb.hpj.b
    public void onMove(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2feb54e1", new Object[]{this, str});
        } else if (hpj.b(str)) {
            hpj.d(getActivity(), 82);
        }
    }

    @Override // tb.bod
    public void onPageSelected(int i) {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            FluidInstance fluidInstance2 = this.mFluidInstance;
            if (fluidInstance2 != null) {
                fluidInstance2.onPause();
                this.mFluidInstance.onStop();
                this.mFluidInstance.onRealStop();
                xau.o(this.mFluidInstance);
            }
        } else if (i == 0 && (fluidInstance = this.mFluidInstance) != null) {
            fluidInstance.onCreate();
            this.mFluidInstance.onRealStart();
            this.mFluidInstance.onResume();
        }
    }

    @Override // tb.anl
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        mixOnPause();
    }

    @Override // tb.anl
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        mixOnResume();
    }

    @Override // tb.anl
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        mixOnStart();
    }

    @Override // tb.anl
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        mixOnStop();
    }

    @Override // tb.anl
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mMediaService.resumeCurrentVideo();
        } else {
            ((IMediaService) this.mFluidInstance.getService(IMediaService.class)).pauseCurrentVideo();
        }
    }

    @Override // tb.anl
    public void postponedEnterTransition() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef076e6", new Object[]{this});
        }
    }

    @Override // tb.w4e
    public void setFirstPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76692fd9", new Object[]{this, str});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setFirstPageName(str);
        }
    }

    @Override // tb.w4e
    public void setFirstPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48f12cc", new Object[]{this, map});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setFirstPageProperty(map);
        }
    }

    @Override // tb.anl
    public void setIsFinishing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b09d5aa", new Object[]{this});
        } else {
            this.mIsFinishing = true;
        }
    }

    @Override // tb.anl
    public void setNavigationBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e885d6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.w4e
    public void setSecondPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e7e79e1", new Object[]{this, str});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setSecondPageName(str);
        }
    }

    @Override // tb.w4e
    public void setSecondPageProperty(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff2309c4", new Object[]{this, map});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).setSecondPageProperty(map);
        }
    }

    public void setSecondPageUTObject(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9039d46", new Object[]{this, obj});
            return;
        }
        ye<?> findSecPageWrapper = findSecPageWrapper();
        if (findSecPageWrapper != null) {
            ((d3a) findSecPageWrapper).F(obj);
        }
    }

    public void setSelfTransitionExecuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("585e0efb", new Object[]{this, new Boolean(z)});
        } else {
            this.mHasSelfTransitionExecuted = z;
        }
    }

    @Override // tb.anl
    public void setStatusBarColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e14207b8", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.anl
    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        }
    }

    @Override // tb.bod
    public void slideSecondPage(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f686d561", new Object[]{this, obj, str});
        }
    }

    @Override // tb.anl
    public void startPostponedEnterTransition(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8977076a", new Object[]{this, view});
        }
    }

    @Override // tb.bod
    public Pair<Boolean, Pair<Boolean, n>> supportSecondPage(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e6be4178", new Object[]{this, motionEvent});
        }
        if (c3a.a(this).z() == null) {
            z = false;
        }
        return new Pair<>(Boolean.valueOf(z), null);
    }

    private void mixOnCreate() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d641f73e", new Object[]{this});
        } else if (this.mUri == null) {
            finish(false);
        } else {
            GestureLayout gestureLayout = new GestureLayout(this.mContext);
            this.mDecorView = gestureLayout;
            String queryParameter = this.mUri.getQueryParameter(PRE_PLAYER_MAP_KEY);
            Pair<Integer, Integer> r = pcw.r(this.mUri);
            int intValue = ((Integer) r.first).intValue();
            int intValue2 = ((Integer) r.second).intValue();
            boolean transparentStatusBar = this.mIsTransparent ? setTransparentStatusBar(getActivity()) : false;
            Activity activity = getActivity();
            Uri uri = this.mUri;
            this.transition = reu.m(activity, uri, uri, null, this.mHasShareElement);
            createFluidInstance(queryParameter, intValue, intValue2, transparentStatusBar);
            this.mContentView = findViewById(16908290);
            int c2 = f2k.c(this.mFluidInstance);
            if (this.mIsTransparent) {
                this.mContainerService.getContentView().setPadding(0, c2, 0, 0);
            } else {
                gestureLayout.setPadding(0, c2, 0, 0);
            }
            boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("tnode.enableFixTransition", true);
            reu reuVar = this.transition;
            if (this.mHasShareElement || (orangeBooleanConfig && this.mHasSelfTransitionExecuted)) {
                z = true;
            }
            processTransition(reuVar, z);
            processContainer(gestureLayout, this.transition);
            gestureLayout.setContentView(this.mContainerService.getContentView());
            this.mBackEventService.setBackInterceptListener(gestureLayout);
            if (!transparentStatusBar) {
                getActivity().getWindow().setStatusBarColor(-16777216);
            }
            if (this.isFromSecPage || !this.mIsNeedTransferAnimation) {
                hpj.d(getActivity(), 255);
            }
        }
    }

    private boolean setTransparentStatusBar(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf3c0a6e", new Object[]{this, activity})).booleanValue();
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            this.mLastOption = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(1024);
            this.mLastStatusBarColor = activity.getWindow().getStatusBarColor();
            activity.getWindow().setStatusBarColor(0);
            return true;
        } catch (Exception e) {
            ir9.c("FullPage", "setTransparentStatusBar", e);
            return false;
        }
    }
}
