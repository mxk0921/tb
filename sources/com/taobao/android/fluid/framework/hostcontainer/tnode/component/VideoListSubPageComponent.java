package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.android.ultron.trade.event.OpenSimplePopupSubscriber;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.TrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.android.fluid.framework.data.ITimeOutRefreshService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.hostcontainer.tnode.IHostTNodeService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.monitor.procedure.IPage;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.a07;
import tb.akt;
import tb.ckf;
import tb.fhb;
import tb.g3e;
import tb.h1u;
import tb.h3e;
import tb.h57;
import tb.hn4;
import tb.i0v;
import tb.ir9;
import tb.jpu;
import tb.krg;
import tb.kxd;
import tb.mfj;
import tb.ntm;
import tb.nwv;
import tb.od0;
import tb.pr9;
import tb.pto;
import tb.q8u;
import tb.rjb;
import tb.s0j;
import tb.s6o;
import tb.sj4;
import tb.t2o;
import tb.te8;
import tb.uq9;
import tb.usm;
import tb.v3i;
import tb.vng;
import tb.vod;
import tb.vrl;
import tb.vrp;
import tb.vyr;
import tb.wyr;
import tb.xyr;
import tb.xyw;
import tb.yq9;
import tb.yre;
import tb.z0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class VideoListSubPageComponent extends BaseSubPageComponent<TabModel, View> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONFIG_EXTPARAMS = "extParams";
    private static final String CONFIG_LAUNCH = "sLaunch";
    private static final String CONFIG_TABID = "tabid";
    public static final a Companion = new a(null);
    private static final String TAB2_SPM = "a2141.1.tabbar.guangguang";
    private static final String TAG = "VideoListSubPageComponent";
    private static final String URL_SOURCE_COMMUNITY = "&source=guangguang_community";
    private static final String URL_SOURCE_PICK = "&source=guangguang_pick";
    private boolean delayToUpdateLifeCycle;
    private MultiTabLayout fluidContentView;
    private boolean hasInitSchedulerMessage;
    private boolean hasRefresh;
    private z0d interactNotifyListener;
    private boolean isNewUI;
    private IContainerService mContainerService;
    private Context mContext;
    private int mDisappearNum;
    private FluidInstance mFluidInstance;
    private boolean mHadAppEnterBackground;
    private boolean mIsCurrentAppear;
    private boolean mQuickRender;
    private ISceneConfigService mSceneConfigService;
    private Uri mTab2PageUri;
    private kxd mTab2ServiceDelegate;
    private FrameLayout rootView;
    private int topGap;
    private h3e turboContainerDelegate = new g();
    private final b changedCallback = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(468714429);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements te8.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.te8.a
        public void B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e78b620", new Object[]{this});
            } else {
                VideoListSubPageComponent.access$log(VideoListSubPageComponent.this, "PickPreloadController,引擎前后台切换方法调用--前台");
            }
        }

        @Override // tb.te8.a
        public void x() {
            IUsePreloadService iUsePreloadService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5cab48b", new Object[]{this});
                return;
            }
            VideoListSubPageComponent.access$setMHadAppEnterBackground$p(VideoListSubPageComponent.this, true);
            VideoListSubPageComponent.access$log(VideoListSubPageComponent.this, "PickPreloadController,引擎前后台切换方法调用--后台");
            s0j.a(s0j.GG_VIDEOTAB_VIDEO_APP_ENTER_BACKGROUND);
            FluidInstance access$getMFluidInstance$p = VideoListSubPageComponent.access$getMFluidInstance$p(VideoListSubPageComponent.this);
            if (!(access$getMFluidInstance$p == null || (iUsePreloadService = (IUsePreloadService) access$getMFluidInstance$p.getService(IUsePreloadService.class)) == null)) {
                iUsePreloadService.preloadDetailDataInBackground();
            }
            s0j.d(s0j.GG_VIDEOTAB_VIDEO_APP_ENTER_BACKGROUND);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements i0v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.i0v
        public final void a(Map<String, String> map, Map<String, String> map2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61821f90", new Object[]{this, map, map2});
            } else if (!VideoListSubPageComponent.access$isAppear(VideoListSubPageComponent.this)) {
                VideoListSubPageComponent.access$log(VideoListSubPageComponent.this, "UTCallback，页面不在前台, return");
            } else if (map != null) {
                VideoListSubPageComponent videoListSubPageComponent = VideoListSubPageComponent.this;
                StringBuilder sb = new StringBuilder("UTCallback，更新页面参数，updateProperties=");
                sb.append(map2);
                sb.append((char) 65307);
                sb.append(map2 != null ? map2.get("spm-url") : null);
                VideoListSubPageComponent.access$log(videoListSubPageComponent, sb.toString());
                if (map2 != null) {
                    Map<String, String> t = kotlin.collections.a.t(map2);
                    t.remove("spm-url");
                    t.remove("spm-cnt");
                    kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
                    if (access$getMTab2ServiceDelegate$p != null) {
                        TabModel tabModel = (TabModel) VideoListSubPageComponent.this.getData();
                        if (tabModel == null || (str = tabModel.getId()) == null) {
                            str = "";
                        }
                        access$getMTab2ServiceDelegate$p.J(str, t);
                    }
                }
                com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().y(VideoListSubPageComponent.access$getTabType(VideoListSubPageComponent.this), map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VideoListSubPageComponent.access$getServiceDelegate$p(VideoListSubPageComponent.this).b0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;
        public final /* synthetic */ Ref$ObjectRef c;

        public e(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
            this.b = ref$ObjectRef;
            this.c = ref$ObjectRef2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IUsePreloadService iUsePreloadService;
            ISceneConfigService iSceneConfigService;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            q8u.a aVar = q8u.Companion;
            aVar.a("firstFrameCallback");
            VideoListSubPageComponent.access$log(VideoListSubPageComponent.this, "firstFrameCallback..");
            VideoListSubPageComponent.access$doOncreateFluid(VideoListSubPageComponent.this);
            FluidInstance access$getMFluidInstance$p = VideoListSubPageComponent.access$getMFluidInstance$p(VideoListSubPageComponent.this);
            if (!(access$getMFluidInstance$p == null || (iSceneConfigService = (ISceneConfigService) access$getMFluidInstance$p.getService(ISceneConfigService.class)) == null)) {
                iSceneConfigService.mergeTab3ExtParams((Map) this.b.element);
            }
            if (VideoListSubPageComponent.access$getMIsCurrentAppear$p(VideoListSubPageComponent.this)) {
                VideoListSubPageComponent.access$onAppear(VideoListSubPageComponent.this, IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE);
            }
            ViewGroup viewGroup = (ViewGroup) this.c.element;
            ViewParent viewParent = null;
            if (viewGroup != null) {
                viewGroup.setTag(R.id.fluid_sdk_tag_subpage_first_frame_cb, null);
            }
            if (VideoListSubPageComponent.access$getHasRefresh$p(VideoListSubPageComponent.this)) {
                VideoListSubPageComponent.access$log(VideoListSubPageComponent.this, "有新的刷新，本次预加载不必上屏...");
                ViewGroup viewGroup2 = (ViewGroup) this.c.element;
                if (viewGroup2 != null) {
                    viewParent = viewGroup2.getParent();
                }
                if (viewParent instanceof ViewGroup) {
                    ViewParent parent = ((ViewGroup) this.c.element).getParent();
                    if (parent != null) {
                        ((ViewGroup) parent).removeView((ViewGroup) this.c.element);
                        ((ViewGroup) this.c.element).removeAllViews();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                }
                aVar.c();
                return;
            }
            VideoListSubPageComponent.access$tryRenderFluidContainer(VideoListSubPageComponent.this, false);
            VideoListSubPageComponent.access$moveVideoToList(VideoListSubPageComponent.this);
            VideoListSubPageComponent videoListSubPageComponent = VideoListSubPageComponent.this;
            VideoListSubPageComponent.access$log(videoListSubPageComponent, "刷新接口，extParams=" + ((Map) this.b.element));
            FluidInstance access$getMFluidInstance$p2 = VideoListSubPageComponent.access$getMFluidInstance$p(VideoListSubPageComponent.this);
            if (!(access$getMFluidInstance$p2 == null || (iUsePreloadService = (IUsePreloadService) access$getMFluidInstance$p2.getService(IUsePreloadService.class)) == null)) {
                iUsePreloadService.quickRenderFetchContentDetail((Map) this.b.element);
            }
            VideoListSubPageComponent.access$getServiceDelegate$p(VideoListSubPageComponent.this).b0();
            aVar.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class f implements z0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map b;

        public f(Map map) {
            this.b = map;
        }

        @Override // tb.z0d
        public void c(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8f33023", new Object[]{this, str, jSONObject});
                return;
            }
            ckf.g(str, "name");
            ckf.g(jSONObject, "params");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.v("ggInteractSchedulerNotify", this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class g implements h3e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public rjb f7840a;
        public WeakReference<g3e> b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class a extends rjb.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/VideoListSubPageComponent$turboContainerDelegate$1$addBottomBarChangeListener$1");
            }

            @Override // tb.ujb
            public void r(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8cacfd02", new Object[]{this, new Boolean(z)});
                    return;
                }
                WeakReference u = g.u(g.this);
                g3e g3eVar = u != null ? (g3e) u.get() : null;
                VideoListSubPageComponent videoListSubPageComponent = VideoListSubPageComponent.this;
                VideoListSubPageComponent.access$log(videoListSubPageComponent, "onBottomBarVisibleChanged, isVisible = " + z + "; 弱引用 barChangeListener=" + g3eVar);
                if (g3eVar != null) {
                    g3eVar.r(z);
                }
            }
        }

        public g() {
        }

        public static final /* synthetic */ WeakReference u(g gVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WeakReference) ipChange.ipc$dispatch("495a69bc", new Object[]{gVar});
            }
            return gVar.b;
        }

        @Override // tb.h3e
        public void A(boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35d69233", new Object[]{this, new Boolean(z), new Boolean(z2)});
                return;
            }
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.A(z, z2);
            }
        }

        @Override // tb.h3e
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84a431c2", new Object[]{this});
            } else if (VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this) != null) {
                kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
                ckf.d(access$getMTab2ServiceDelegate$p);
                access$getMTab2ServiceDelegate$p.a();
            }
        }

        @Override // tb.h3e
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1bb83ae6", new Object[]{this})).booleanValue();
            }
            if (VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this) == null) {
                return false;
            }
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            ckf.d(access$getMTab2ServiceDelegate$p);
            return access$getMTab2ServiceDelegate$p.b();
        }

        @Override // tb.h3e
        public String c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4f4d1846", new Object[]{this, str, str2});
            }
            ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                return access$getMTab2ServiceDelegate$p.c(str, str2);
            }
            return null;
        }

        @Override // tb.h3e
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c2ea2ad1", new Object[]{this})).booleanValue();
            }
            return VideoListSubPageComponent.access$getHasInitSchedulerMessage$p(VideoListSubPageComponent.this);
        }

        @Override // tb.h3e
        public void e(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("64ea9d3c", new Object[]{this, str, obj});
                return;
            }
            ckf.g(str, "key");
            ckf.g(obj, "value");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.n(str, obj, null);
            }
        }

        @Override // tb.h3e
        public void f(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e906539a", new Object[]{this, jSONObject});
                return;
            }
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.f(jSONObject);
            }
        }

        @Override // tb.h3e
        public void g(String str, long j, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a033a99", new Object[]{this, str, new Long(j), str2});
                return;
            }
            ckf.g(str, "stageName");
            ckf.g(str2, "mtsName");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.g(str, j, str2);
            }
        }

        @Override // tb.h3e
        public void h(String str, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("829d2b00", new Object[]{this, str, new Boolean(z), str2});
                return;
            }
            ckf.g(str, BaseMnnRunUnit.KEY_TASK_NAME);
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.h(str, z, str2);
            }
        }

        @Override // tb.h3e
        public void i(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec6f1451", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "stageName");
            ckf.g(str2, BaseMnnRunUnit.KEY_TASK_NAME);
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.i(str, str2);
            }
        }

        @Override // tb.h3e
        public void j(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63875880", new Object[]{this, new Boolean(z), str, str2});
                return;
            }
            ckf.g(str, "code");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.j(z, str, str2);
            }
        }

        @Override // tb.h3e
        public void k(String str, String str2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc97da31", new Object[]{this, str, str2, new Boolean(z)});
                return;
            }
            ckf.g(str, "stageName");
            ckf.g(str2, BaseMnnRunUnit.KEY_TASK_NAME);
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.k(str, str2, z);
            }
        }

        @Override // tb.h3e
        public void l(String str, boolean z, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("548e3db7", new Object[]{this, str, new Boolean(z), str2});
                return;
            }
            ckf.g(str, "stageName");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                vod.a.c(access$getMTab2ServiceDelegate$p, str, z, null, 4, null);
            }
        }

        @Override // tb.h3e
        public void m(boolean z, String str, long j, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9ca9f98", new Object[]{this, new Boolean(z), str, new Long(j), str2});
                return;
            }
            ckf.g(str, "code");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.m(z, str, j, str2);
            }
        }

        @Override // tb.h3e
        public void n(String str, Object obj, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3117006", new Object[]{this, str, obj, str2});
                return;
            }
            ckf.g(str, "key");
            ckf.g(obj, "value");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.n(str, obj, str2);
            }
        }

        @Override // tb.h3e
        public IPage o(String str) {
            TabModel tabModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IPage) ipChange.ipc$dispatch("c71f6329", new Object[]{this, str});
            }
            if (str == null && ((tabModel = (TabModel) VideoListSubPageComponent.this.getData()) == null || (str = tabModel.getId()) == null)) {
                str = "video";
            }
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                return access$getMTab2ServiceDelegate$p.o(str);
            }
            return null;
        }

        @Override // tb.h3e
        public boolean p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("48138e9a", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            if (z) {
                kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
                if (access$getMTab2ServiceDelegate$p != null && access$getMTab2ServiceDelegate$p.showBackButton()) {
                    return true;
                }
            } else {
                kxd access$getMTab2ServiceDelegate$p2 = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
                if (access$getMTab2ServiceDelegate$p2 != null && access$getMTab2ServiceDelegate$p2.hideBackButton()) {
                    return true;
                }
            }
            return false;
        }

        @Override // tb.h3e
        public void q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e123b719", new Object[]{this, str});
                return;
            }
            ckf.g(str, "eventName");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                access$getMTab2ServiceDelegate$p.q(str);
            }
        }

        @Override // tb.h3e
        public void r(g3e g3eVar) {
            kxd access$getMTab2ServiceDelegate$p;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c998569", new Object[]{this, g3eVar});
                return;
            }
            ckf.g(g3eVar, DataReceiveMonitor.CB_LISTENER);
            if (!(this.f7840a == null || (access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this)) == null)) {
                rjb rjbVar = this.f7840a;
                ckf.d(rjbVar);
                access$getMTab2ServiceDelegate$p.L(rjbVar);
            }
            this.b = new WeakReference<>(g3eVar);
            this.f7840a = new a();
            kxd access$getMTab2ServiceDelegate$p2 = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p2 != null) {
                rjb rjbVar2 = this.f7840a;
                ckf.d(rjbVar2);
                access$getMTab2ServiceDelegate$p2.B(rjbVar2);
            }
        }

        @Override // tb.h3e
        public String s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7cc6fd71", new Object[]{this});
            }
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                return access$getMTab2ServiceDelegate$p.s();
            }
            return null;
        }

        @Override // tb.h3e
        public void t(g3e g3eVar) {
            kxd access$getMTab2ServiceDelegate$p;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dab7ada6", new Object[]{this, g3eVar});
                return;
            }
            ckf.g(g3eVar, DataReceiveMonitor.CB_LISTENER);
            if (!(this.f7840a == null || (access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this)) == null)) {
                rjb rjbVar = this.f7840a;
                ckf.d(rjbVar);
                access$getMTab2ServiceDelegate$p.L(rjbVar);
            }
            this.f7840a = null;
            this.b = null;
        }

        @Override // tb.h3e
        public boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88fceaeb", new Object[]{this})).booleanValue();
            }
            if (VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this) == null) {
                return false;
            }
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            ckf.d(access$getMTab2ServiceDelegate$p);
            return access$getMTab2ServiceDelegate$p.z();
        }

        @Override // tb.h3e
        public void a(String str, boolean z, long j, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9a06141", new Object[]{this, str, new Boolean(z), new Long(j), str2});
                return;
            }
            ckf.g(str, "stageName");
            kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
            if (access$getMTab2ServiceDelegate$p != null) {
                vod.a.b(access$getMTab2ServiceDelegate$p, str, z, j, null, 8, null);
            }
        }

        @Override // tb.h3e
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3cd697d2", new Object[]{this, str});
                return;
            }
            ckf.g(str, "iconUrl");
            if (VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this) != null) {
                kxd access$getMTab2ServiceDelegate$p = VideoListSubPageComponent.access$getMTab2ServiceDelegate$p(VideoListSubPageComponent.this);
                ckf.d(access$getMTab2ServiceDelegate$p);
                access$getMTab2ServiceDelegate$p.b(str);
            }
        }
    }

    static {
        t2o.a(468714428);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoListSubPageComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        ckf.g(outerComponentType, OpenSimplePopupSubscriber.KEY_COMPONENT_TYPE);
        ckf.g(str, "componentId");
        ckf.g(context, "context");
        ckf.g(str2, "pageURL");
        ckf.g(str3, "engineId");
        ckf.g(baseServiceDelegate, "serviceDelegate");
    }

    public static final /* synthetic */ void access$doOncreateFluid(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6366ac1d", new Object[]{videoListSubPageComponent});
        } else {
            videoListSubPageComponent.doOncreateFluid();
        }
    }

    public static final /* synthetic */ boolean access$getHasInitSchedulerMessage$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("898788c9", new Object[]{videoListSubPageComponent})).booleanValue();
        }
        return videoListSubPageComponent.hasInitSchedulerMessage;
    }

    public static final /* synthetic */ boolean access$getHasRefresh$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b144de0", new Object[]{videoListSubPageComponent})).booleanValue();
        }
        return videoListSubPageComponent.hasRefresh;
    }

    public static final /* synthetic */ FluidInstance access$getMFluidInstance$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("8132ed37", new Object[]{videoListSubPageComponent});
        }
        return videoListSubPageComponent.mFluidInstance;
    }

    public static final /* synthetic */ boolean access$getMHadAppEnterBackground$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("feff76c2", new Object[]{videoListSubPageComponent})).booleanValue();
        }
        return videoListSubPageComponent.mHadAppEnterBackground;
    }

    public static final /* synthetic */ boolean access$getMIsCurrentAppear$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c4a3036", new Object[]{videoListSubPageComponent})).booleanValue();
        }
        return videoListSubPageComponent.mIsCurrentAppear;
    }

    public static final /* synthetic */ kxd access$getMTab2ServiceDelegate$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxd) ipChange.ipc$dispatch("bec2a0c", new Object[]{videoListSubPageComponent});
        }
        return videoListSubPageComponent.mTab2ServiceDelegate;
    }

    public static final /* synthetic */ BaseServiceDelegate access$getServiceDelegate$p(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseServiceDelegate) ipChange.ipc$dispatch("4783f577", new Object[]{videoListSubPageComponent});
        }
        return videoListSubPageComponent.getServiceDelegate();
    }

    public static final /* synthetic */ String access$getTabType(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a5f702e", new Object[]{videoListSubPageComponent});
        }
        return videoListSubPageComponent.getTabType();
    }

    public static final /* synthetic */ boolean access$isAppear(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97299dc", new Object[]{videoListSubPageComponent})).booleanValue();
        }
        return videoListSubPageComponent.isAppear();
    }

    public static final /* synthetic */ void access$log(VideoListSubPageComponent videoListSubPageComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2bfc7", new Object[]{videoListSubPageComponent, str});
        } else {
            videoListSubPageComponent.log(str);
        }
    }

    public static final /* synthetic */ void access$moveVideoToList(VideoListSubPageComponent videoListSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f44997c", new Object[]{videoListSubPageComponent});
        } else {
            videoListSubPageComponent.moveVideoToList();
        }
    }

    public static final /* synthetic */ void access$onAppear(VideoListSubPageComponent videoListSubPageComponent, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1e308e", new Object[]{videoListSubPageComponent, iComponentLifecycle$TriggerType});
        } else {
            videoListSubPageComponent.onAppear(iComponentLifecycle$TriggerType);
        }
    }

    public static final /* synthetic */ void access$setHasInitSchedulerMessage$p(VideoListSubPageComponent videoListSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab768bb", new Object[]{videoListSubPageComponent, new Boolean(z)});
        } else {
            videoListSubPageComponent.hasInitSchedulerMessage = z;
        }
    }

    public static final /* synthetic */ void access$setHasRefresh$p(VideoListSubPageComponent videoListSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e00816ec", new Object[]{videoListSubPageComponent, new Boolean(z)});
        } else {
            videoListSubPageComponent.hasRefresh = z;
        }
    }

    public static final /* synthetic */ void access$setMFluidInstance$p(VideoListSubPageComponent videoListSubPageComponent, FluidInstance fluidInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e35b81", new Object[]{videoListSubPageComponent, fluidInstance});
        } else {
            videoListSubPageComponent.mFluidInstance = fluidInstance;
        }
    }

    public static final /* synthetic */ void access$setMHadAppEnterBackground$p(VideoListSubPageComponent videoListSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339ffc4a", new Object[]{videoListSubPageComponent, new Boolean(z)});
        } else {
            videoListSubPageComponent.mHadAppEnterBackground = z;
        }
    }

    public static final /* synthetic */ void access$setMIsCurrentAppear$p(VideoListSubPageComponent videoListSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a10d856", new Object[]{videoListSubPageComponent, new Boolean(z)});
        } else {
            videoListSubPageComponent.mIsCurrentAppear = z;
        }
    }

    public static final /* synthetic */ void access$setMTab2ServiceDelegate$p(VideoListSubPageComponent videoListSubPageComponent, kxd kxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32784778", new Object[]{videoListSubPageComponent, kxdVar});
        } else {
            videoListSubPageComponent.mTab2ServiceDelegate = kxdVar;
        }
    }

    public static final /* synthetic */ void access$tryRenderFluidContainer(VideoListSubPageComponent videoListSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f253d793", new Object[]{videoListSubPageComponent, new Boolean(z)});
        } else {
            videoListSubPageComponent.tryRenderFluidContainer(z);
        }
    }

    private final void doOncreateFluid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d3b6ab", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            fluidInstance.onCreate();
        }
    }

    private final String getPageLifecycleChangedType(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c7c1a35", new Object[]{this, iComponentLifecycle$TriggerType});
        }
        if (iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.TAB_SELECT) {
            return "tab";
        }
        if (iComponentLifecycle$TriggerType == IComponentLifecycle$TriggerType.PAGE_LIFECYCLE_CHANGE) {
            return "page";
        }
        return "";
    }

    private final String getPageUrl() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        TabModel tabModel = (TabModel) getData();
        if (tabModel != null) {
            str = tabModel.getUrl();
        } else {
            str = null;
        }
        TabModel tabModel2 = (TabModel) getData();
        if (tabModel2 != null) {
            str2 = tabModel2.getId();
        } else {
            str2 = null;
        }
        if (xyr.c(str, nwv.I(str2, null))) {
            return str;
        }
        return null;
    }

    private final String getTabType() {
        String type;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93d21060", new Object[]{this});
        }
        TabModel tabModel = (TabModel) getData();
        if (!(tabModel == null || (type = tabModel.getType()) == null)) {
            if (type.length() <= 0) {
                type = null;
            }
            if (type != null) {
                return type;
            }
        }
        return "video";
    }

    public static /* synthetic */ Object ipc$super(VideoListSubPageComponent videoListSubPageComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -1098451737:
                super.handleOuterMessage((BaseOuterComponent.b) objArr[0]);
                return null;
            case -563680354:
                super.handleShare();
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate((VideoListSubPageComponent) objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 916714806:
                super.updateDataImpl((VideoListSubPageComponent) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 2141276188:
                return new Boolean(super.handleBack((IPageBackLifecycle.TriggerType) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/VideoListSubPageComponent");
        }
    }

    private final boolean isAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec6a7c6a", new Object[]{this})).booleanValue();
        }
        return this.mIsCurrentAppear;
    }

    private final boolean isVideoColdLaunchParams(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("109c83cd", new Object[]{this, str, str2})).booleanValue();
        }
        if (!ckf.b("1", str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return true;
    }

    private final boolean isVideoTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d2cf6ef", new Object[]{this})).booleanValue();
        }
        TabModel tabModel = (TabModel) getData();
        return TextUtils.equals(tabModel != null ? tabModel.getType() : null, "video");
    }

    private final void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        TabModel tabModel = (TabModel) getData();
        sb.append(tabModel != null ? tabModel.getId() : null);
        sb.append("|");
        sb.append(str);
        ir9.b(TAG, sb.toString());
    }

    private final void moveVideoToList() {
        ntm preloadedVideo;
        usm config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5683908a", new Object[]{this});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        IPreloadService iPreloadService = fluidInstance != null ? (IPreloadService) fluidInstance.getService(IPreloadService.class) : null;
        StringBuilder sb = new StringBuilder("createViewImpl, moveVideoToList.. preloadVideo=");
        sb.append(iPreloadService != null ? iPreloadService.getPreloadedVideo() : null);
        log(sb.toString());
        if (iPreloadService != null && (preloadedVideo = iPreloadService.getPreloadedVideo()) != null) {
            FluidInstance fluidInstance2 = this.mFluidInstance;
            IUsePreloadService iUsePreloadService = fluidInstance2 != null ? (IUsePreloadService) fluidInstance2.getService(IUsePreloadService.class) : null;
            if (!(iUsePreloadService == null || (config = iUsePreloadService.getConfig()) == null)) {
                config.q(preloadedVideo);
            }
            iPreloadService.clearMemoryData();
            Context context = this.mContext;
            if (context == null) {
                ckf.y("mContext");
                throw null;
            } else if (preloadedVideo.f(context) && preloadedVideo.c() == 0) {
                log("moveVideoToList...(videoView has attached) ");
                if (iUsePreloadService != null) {
                    iUsePreloadService.moveVideoToList(preloadedVideo);
                }
            }
        }
    }

    private final void notifyInteractContainerUrlRefreshed(boolean z, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44cd770", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        if (z) {
            str = "MSG_INIT_URL";
        } else {
            str = "MSG_URL_REFRESH";
        }
        BaseOuterComponent.b bVar = new BaseOuterComponent.b(str, jSONObject, BaseOuterComponent.OuterComponentType.TAB, "video", BaseOuterComponent.OuterComponentType.INTERACT_CONTAINER, BaseOuterComponent.COMPONENT_ID_INTERACT_CONTAINER);
        BaseServiceDelegate serviceDelegate = getServiceDelegate();
        if (serviceDelegate != null) {
            ((kxd) serviceDelegate).u(bVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.turbo.base.ITab2ServiceDelegate");
    }

    private final void onDisAppear(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        vng config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc4e01f0", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            FluidService service = fluidInstance.getService(ILifecycleService.class);
            ckf.d(service);
            vng config2 = ((ILifecycleService) service).getConfig();
            ckf.f(config2, "fluidInstance.getService…ice::class.java)!!.config");
            config2.d(getPageLifecycleChangedType(iComponentLifecycle$TriggerType));
            this.mDisappearNum++;
            TrackService.sTab3ColdDisAppearTimes++;
            ITrackService iTrackService = (ITrackService) fluidInstance.getService(ITrackService.class);
            if (iTrackService != null) {
                iTrackService.setTab3ComponentDisappearTimes(this.mDisappearNum);
            }
            Map<String, String> updateSubPageProperties = updateSubPageProperties();
            fluidInstance.onPause();
            fluidInstance.onStop();
            if (updateSubPageProperties != null) {
                String tabType = getTabType();
                com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().y(tabType, updateSubPageProperties);
                com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().m(tabType);
            }
            ILifecycleService iLifecycleService = (ILifecycleService) fluidInstance.getService(ILifecycleService.class);
            if (iLifecycleService != null && (config = iLifecycleService.getConfig()) != null) {
                config.c(false);
            }
        }
    }

    private final void registerGGInteractNotifyListener(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d9ec8", new Object[]{this, map});
        } else if (this.interactNotifyListener == null) {
            f fVar = new f(map);
            this.interactNotifyListener = fVar;
            kxd kxdVar = this.mTab2ServiceDelegate;
            if (kxdVar != null) {
                kxdVar.F("ggInteractSchedulerNotify", fVar);
            }
        }
    }

    private final String replaceSourceForLauncher(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1d8deb7", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str) || !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("source"))) {
            return str;
        }
        if (z) {
            return str + URL_SOURCE_PICK;
        }
        return str + URL_SOURCE_COMMUNITY;
    }

    private final void setAppForegroundChangedCallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e601dfd6", new Object[]{this, new Boolean(z)});
        } else if (vyr.c()) {
            od0 D = od0.D();
            ckf.f(D, "AdapterFactory.instance()");
            te8 j = D.j();
            if (j == null) {
                return;
            }
            if (z) {
                s0j.a(s0j.GG_VIDEOTAB_VIDEO_APP_FOREGROUND_CHANGED);
                log("PickPreloadController,注册前后台切换回调");
                j.g(this.changedCallback);
                return;
            }
            log("PickPreloadController,解注册前后台切换回调");
            j.d(this.changedCallback);
            s0j.d(s0j.GG_VIDEOTAB_VIDEO_APP_FOREGROUND_CHANGED);
        }
    }

    private final void tryRenderFluidContainer(boolean z) {
        FluidInstanceConfig instanceConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5630c5", new Object[]{this, new Boolean(z)});
            return;
        }
        IContainerService iContainerService = this.mContainerService;
        if (iContainerService != null && iContainerService.getContentView() == null) {
            FluidInstance fluidInstance = this.mFluidInstance;
            if (!(fluidInstance == null || (instanceConfig = fluidInstance.getInstanceConfig()) == null)) {
                instanceConfig.setOnCreateToRequest(z);
            }
            Context context = this.mContext;
            if (context != null) {
                iContainerService.renderContainer(context, this.fluidContentView);
            } else {
                ckf.y("mContext");
                throw null;
            }
        }
    }

    private final void unregisterGGInteractNotifyListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf536", new Object[]{this});
            return;
        }
        z0d z0dVar = this.interactNotifyListener;
        if (z0dVar != null) {
            kxd kxdVar = this.mTab2ServiceDelegate;
            if (kxdVar != null) {
                kxdVar.H("ggInteractSchedulerNotify", z0dVar);
            }
            this.interactNotifyListener = null;
        }
    }

    private final void wrapTab2Spm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a054590", new Object[]{this});
            return;
        }
        try {
            String o = getServiceDelegate().G().o("spm");
            if (o == null) {
                o = TAB2_SPM;
            }
            TabModel tabModel = (TabModel) getData();
            if (tabModel != null) {
                TabModel tabModel2 = (TabModel) getData();
                tabModel.setUrl(ckf.p(tabModel2 != null ? tabModel2.getUrl() : null, "&spm=".concat(o)));
            }
        } catch (Exception e2) {
            log("wrapTab2Spm error:" + e2.getMessage());
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public View createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("af9921ca", new Object[]{this});
        }
        log("createViewImpl...");
        FrameLayout frameLayout = this.rootView;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    @Override // com.taobao.android.turbo.core.component.BaseOuterComponent
    public void handleOuterMessage(BaseOuterComponent.b bVar) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "message");
        super.handleOuterMessage(bVar);
        if (ckf.b(bVar.b(), "messageChannelForBaseGG") && this.mFluidInstance != null && (a2 = bVar.a()) != null) {
            String string = a2.getString("name");
            ckf.f(string, "params.getString(ShortVideoMessage.KEY_NAME)");
            JSONObject jSONObject = a2.getJSONObject("args");
            ckf.f(jSONObject, "params.getJSONObject(ShortVideoMessage.KEY_ARGS)");
            yq9.a(this.mFluidInstance, null, vrp.BIZ_TNODE_HOME, vrp.FROM_GG_HOME, string, jSONObject);
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void handleShare() {
        IMessageService iMessageService;
        ICardService iCardService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de66eb9e", new Object[]{this});
            return;
        }
        super.handleShare();
        FluidInstance fluidInstance = this.mFluidInstance;
        uq9 activeCard = (fluidInstance == null || (iCardService = (ICardService) fluidInstance.getService(ICardService.class)) == null) ? null : iCardService.getActiveCard();
        if (activeCard != null) {
            FluidInstance fluidInstance2 = this.mFluidInstance;
            if (!(fluidInstance2 == null || (iMessageService = (IMessageService) fluidInstance2.getService(IMessageService.class)) == null)) {
                iMessageService.sendMessage(new vrp("VSMSG_clickNewShare", activeCard.Y().c, null));
            }
        } else {
            Context context = this.mContext;
            if (context != null) {
                h1u.d(context, "暂无分享内容");
            } else {
                ckf.y("mContext");
                throw null;
            }
        }
        ir9.b(TAG, "handleShare...card=" + activeCard);
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public boolean isCustomShareIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("757b8c08", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStart(iComponentLifecycle$TriggerType);
        StringBuilder sb = new StringBuilder("onStart...id=");
        TabModel tabModel = (TabModel) getData();
        sb.append(tabModel != null ? tabModel.getId() : null);
        sb.append(", triggerType=");
        sb.append(iComponentLifecycle$TriggerType);
        log(sb.toString());
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            fluidInstance.onRealStart();
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onStop(iComponentLifecycle$TriggerType);
        StringBuilder sb = new StringBuilder("onStop...id=");
        TabModel tabModel = (TabModel) getData();
        sb.append(tabModel != null ? tabModel.getId() : null);
        sb.append(", triggerType=");
        sb.append(iComponentLifecycle$TriggerType);
        log(sb.toString());
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            fluidInstance.onRealStop();
        }
    }

    private final boolean fromLauncherByParseNodeUrlAndSetConfig() {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6391be33", new Object[]{this})).booleanValue();
        }
        try {
            String pageUrl = getPageUrl();
            if (!TextUtils.isEmpty(pageUrl) && (parse = Uri.parse(pageUrl)) != null) {
                return isVideoColdLaunchParams(parse.getQueryParameter("sLaunch"), parse.getQueryParameter(CONFIG_TABID));
            }
            return false;
        } catch (Throwable th) {
            log("" + th.getMessage());
            FluidException.throwException((FluidContext) null, FluidInstance.INSTANCE_PARSE_INSTANCE_CONFIG_ERROR, th);
            return false;
        }
    }

    private final void setPreRequestOnPageCreate(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1108c67f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        TabModel tabModel = (TabModel) getData();
        if (!TextUtils.equals(tabModel != null ? tabModel.getType() : null, "video")) {
            return;
        }
        if (z || z2) {
            this.mQuickRender = true;
            IContainerService iContainerService = this.mContainerService;
            if (iContainerService != null) {
                hn4 config = iContainerService.getConfig();
                ckf.f(config, "mContainerService!!.config");
                config.t(true);
            }
        }
    }

    private final Map<String, String> updateSubPageProperties() {
        String id;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("865953f5", new Object[]{this});
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        Map<String, String> map = null;
        if (fluidInstance != null) {
            ITrackService iTrackService = (ITrackService) fluidInstance.getService(ITrackService.class);
            Map<String, String> pageUTProperties = iTrackService != null ? iTrackService.getPageUTProperties() : null;
            if (pageUTProperties != null && !pageUTProperties.isEmpty()) {
                map = kotlin.collections.a.t(pageUTProperties);
                JSONArray r = com.taobao.tao.flexbox.layoutmanager.usertracker.a.p().r(getTabType());
                if (r != null && (!r.isEmpty())) {
                    try {
                        String jSONString = r.toJSONString();
                        ckf.f(jSONString, "subtasks.toJSONString()");
                        map.put("subtasks", jSONString);
                    } catch (Throwable unused) {
                    }
                }
                kxd kxdVar = this.mTab2ServiceDelegate;
                String str2 = "";
                if (kxdVar != null) {
                    TabModel tabModel = (TabModel) getData();
                    if (tabModel == null || (str = tabModel.getId()) == null) {
                        str = str2;
                    }
                    kxdVar.D(str, "Page_videointeract");
                }
                log("UTCallback，更新页面参数，pageUTParams=" + map);
                map.remove("spm-url");
                map.remove("spm-cnt");
                kxd kxdVar2 = this.mTab2ServiceDelegate;
                if (kxdVar2 != null) {
                    TabModel tabModel2 = (TabModel) getData();
                    if (!(tabModel2 == null || (id = tabModel2.getId()) == null)) {
                        str2 = id;
                    }
                    kxdVar2.J(str2, map);
                }
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, android.widget.FrameLayout, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(com.taobao.android.turbo.model.TabModel r22, com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType r23) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.hostcontainer.tnode.component.VideoListSubPageComponent.onCreate(com.taobao.android.turbo.model.TabModel, com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType):void");
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onDestroy(iComponentLifecycle$TriggerType);
        StringBuilder sb = new StringBuilder("onDestroy...id=");
        TabModel tabModel = (TabModel) getData();
        sb.append(tabModel != null ? tabModel.getId() : null);
        sb.append(", triggerType=");
        sb.append(iComponentLifecycle$TriggerType);
        log(sb.toString());
        triggerDisAppearIfNeeded(iComponentLifecycle$TriggerType);
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            try {
                fluidInstance.onDestroy();
                setAppForegroundChangedCallback(false);
            } catch (Throwable th) {
                log("mMultiTabVideoController destroy:" + th.getMessage());
                FluidException.throwException((FluidContext) null, FluidInstance.INSTANCE_DESTROY_INSTANCE_ERROR, th);
            }
            this.mFluidInstance = null;
        }
        unregisterGGInteractNotifyListener();
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        ckf.g(iComponentLifecycle$TriggerType, "triggerType");
        super.onPause(iComponentLifecycle$TriggerType);
        StringBuilder sb = new StringBuilder("onPause...id=");
        TabModel tabModel = (TabModel) getData();
        sb.append(tabModel != null ? tabModel.getId() : null);
        sb.append(", triggerType=");
        sb.append(iComponentLifecycle$TriggerType);
        log(sb.toString());
        this.mIsCurrentAppear = false;
        onDisAppear(iComponentLifecycle$TriggerType);
        getServiceDelegate().q("onPause");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // com.taobao.android.turbo.core.component.BaseComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume(com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType r6) {
        /*
            r5 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.fluid.framework.hostcontainer.tnode.component.VideoListSubPageComponent.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "f09370a8"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            java.lang.String r1 = "triggerType"
            tb.ckf.g(r6, r1)
            tb.q8u$a r1 = tb.q8u.Companion
            java.lang.String r2 = "video onresume"
            r1.a(r2)
            super.onResume(r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onResume...id="
            r2.<init>(r3)
            java.lang.Object r3 = r5.getData()
            com.taobao.android.turbo.model.TabModel r3 = (com.taobao.android.turbo.model.TabModel) r3
            r4 = 0
            if (r3 == 0) goto L_0x003c
            java.lang.String r3 = r3.getId()
            goto L_0x003d
        L_0x003c:
            r3 = r4
        L_0x003d:
            r2.append(r3)
            java.lang.String r3 = ", triggerType="
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.log(r2)
            r5.mIsCurrentAppear = r0
            android.view.View r2 = r5.getView()
            if (r2 == 0) goto L_0x005c
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            goto L_0x005d
        L_0x005c:
            r2 = r4
        L_0x005d:
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x007b
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r5.topGap
            r2.topMargin = r3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onResume container topMargin = "
            r2.<init>(r3)
            int r3 = r5.topGap
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r5.log(r2)
        L_0x007b:
            android.view.View r2 = r5.getView()
            if (r2 == 0) goto L_0x0085
            android.view.ViewParent r4 = r2.getParent()
        L_0x0085:
            boolean r2 = r4 instanceof android.view.View
            if (r2 == 0) goto L_0x00a3
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2.setBackgroundColor(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onResume container parent setBackgroundColor BLACK. parent="
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r5.log(r2)
        L_0x00a3:
            r5.onAppear(r6)
            com.taobao.android.fluid.framework.adapter.IRemoteConfigAdapter r6 = com.taobao.android.fluid.FluidSDK.getRemoteConfigAdapter()
            java.lang.String r2 = "enableResumeKeepBottomBarState"
            boolean r6 = r6.getOrangeBooleanConfig(r2, r0)
            if (r6 == 0) goto L_0x00cd
            tb.kxd r6 = r5.mTab2ServiceDelegate
            if (r6 == 0) goto L_0x00cd
            com.taobao.android.fluid.core.FluidInstance r6 = r5.mFluidInstance
            boolean r6 = tb.pto.i(r6)
            if (r6 == 0) goto L_0x00cd
            tb.kxd r6 = r5.mTab2ServiceDelegate
            if (r6 == 0) goto L_0x00c8
            boolean r6 = r6.Y()
            if (r6 == r0) goto L_0x00cd
        L_0x00c8:
            com.taobao.android.fluid.core.FluidInstance r6 = r5.mFluidInstance
            tb.yre.d(r6, r0)
        L_0x00cd:
            r1.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.hostcontainer.tnode.component.VideoListSubPageComponent.onResume(com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType):void");
    }

    public void updateDataImpl(TabModel tabModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1695729", new Object[]{this, tabModel});
            return;
        }
        ckf.g(tabModel, "data");
        super.updateDataImpl((VideoListSubPageComponent) tabModel);
        log("updateDataImpl...id=" + tabModel);
        wrapTab2Spm();
    }

    private final void onAppear(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        vng config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417db440", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (fluidInstance != null) {
            FluidService service = fluidInstance.getService(ILifecycleService.class);
            ckf.d(service);
            vng config2 = ((ILifecycleService) service).getConfig();
            ckf.f(config2, "fluidInstance.getService…ice::class.java)!!.config");
            config2.d(getPageLifecycleChangedType(iComponentLifecycle$TriggerType));
            log("onAppear start，" + ((TabModel) getData()));
            fluidInstance.onStart();
            setAppForegroundChangedCallback(true);
            fluidInstance.onResume();
            ILifecycleService iLifecycleService = (ILifecycleService) fluidInstance.getService(ILifecycleService.class);
            if (!(iLifecycleService == null || (config = iLifecycleService.getConfig()) == null)) {
                config.c(true);
            }
            if (this.mHadAppEnterBackground) {
                this.mHadAppEnterBackground = false;
                log("PickPreloadController,onAppear推后台再进来");
                mfj.C(fluidInstance);
            }
            updateSubPageProperties();
            log("onAppear end");
        }
    }

    private final void triggerDisAppearIfNeeded(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0bcdf7", new Object[]{this, iComponentLifecycle$TriggerType});
        } else if (this.mIsCurrentAppear && akt.p2("ShortVideo.fixDisappearLifeCycle", true)) {
            log("triggerDisAppearIfNeeded");
            this.mIsCurrentAppear = false;
            onDisAppear(iComponentLifecycle$TriggerType);
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public boolean handleBack(IPageBackLifecycle.TriggerType triggerType) {
        hn4 config;
        IBackEventService iBackEventService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ckf.g(triggerType, "triggerType");
        StringBuilder sb = new StringBuilder("handleBack...id=");
        TabModel tabModel = (TabModel) getData();
        sb.append(tabModel != null ? tabModel.getId() : null);
        sb.append(", triggerType=");
        sb.append(triggerType);
        log(sb.toString());
        if (xyw.Z0()) {
            FluidInstance fluidInstance = this.mFluidInstance;
            if (!(fluidInstance == null || (iBackEventService = (IBackEventService) fluidInstance.getService(IBackEventService.class)) == null)) {
                iBackEventService.onBackClick();
            }
            return true;
        }
        FluidInstance fluidInstance2 = this.mFluidInstance;
        if (fluidInstance2 != null && pto.i(fluidInstance2)) {
            od0 D = od0.D();
            ckf.f(D, "AdapterFactory.instance()");
            fhb f2 = D.f();
            ckf.f(f2, "AdapterFactory.instance().applicationExtra");
            boolean C = f2.C();
            od0 D2 = od0.D();
            ckf.f(D2, "AdapterFactory.instance()");
            fhb f3 = D2.f();
            ckf.f(f3, "AdapterFactory.instance().applicationExtra");
            Activity a2 = f3.a();
            log("退出沉浸式...isVisible=" + C + ", mainActivity=" + a2 + ", currentContext=" + getContext());
            if (!C && a2 == getContext()) {
                yre.c(this.mFluidInstance, "2", null, null, null, null);
                IContainerService iContainerService = this.mContainerService;
                if (!(iContainerService == null || (config = iContainerService.getConfig()) == null)) {
                    config.r("back");
                }
                HashMap hashMap = new HashMap();
                hashMap.put("isRefresh", "true");
                IContainerService iContainerService2 = this.mContainerService;
                if (iContainerService2 != null) {
                    iContainerService2.refresh(hashMap, false);
                }
                return true;
            }
        }
        return super.handleBack(triggerType);
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void onRefresh(Map<String, ? extends Object> map) {
        hn4 config;
        ITimeOutRefreshService iTimeOutRefreshService;
        Object obj;
        ISceneConfigService iSceneConfigService;
        ISceneConfigService iSceneConfigService2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff6aa2", new Object[]{this, map});
            return;
        }
        StringBuilder sb = new StringBuilder("onRefresh... args=");
        sb.append(map);
        sb.append(", id=");
        TabModel tabModel = (TabModel) getData();
        Object obj2 = null;
        sb.append(tabModel != null ? tabModel.getId() : null);
        log(sb.toString());
        if (ckf.b(map != null ? map.get("target") : null, "web")) {
            registerGGInteractNotifyListener(map);
            return;
        }
        this.hasRefresh = true;
        Map m = vrl.m(map);
        if (this.mFluidInstance == null) {
            createFluidInstance();
            doOncreateFluid();
        }
        FluidInstance fluidInstance = this.mFluidInstance;
        if (!(fluidInstance == null || (iSceneConfigService2 = (ISceneConfigService) fluidInstance.getService(ISceneConfigService.class)) == null)) {
            iSceneConfigService2.mergeTab3ExtParams(m);
        }
        if (!(m == null || (obj = m.get("sceneSource")) == null)) {
            Map f2 = v3i.f(jpu.a("globalParams", v3i.f(jpu.a("sceneSource", obj))));
            FluidInstance fluidInstance2 = this.mFluidInstance;
            if (!(fluidInstance2 == null || (iSceneConfigService = (ISceneConfigService) fluidInstance2.getService(ISceneConfigService.class)) == null)) {
                iSceneConfigService.updateGlobalParams(f2);
            }
        }
        FluidInstance fluidInstance3 = this.mFluidInstance;
        if (!(fluidInstance3 == null || (iTimeOutRefreshService = (ITimeOutRefreshService) fluidInstance3.getService(ITimeOutRefreshService.class)) == null)) {
            iTimeOutRefreshService.setNotPendingRefresh();
        }
        if (this.mFluidInstance != null) {
            if (m != null) {
                obj2 = m.get("type");
            }
            String I = nwv.I(obj2, "clickicon");
            IContainerService iContainerService = this.mContainerService;
            if (!(iContainerService == null || (config = iContainerService.getConfig()) == null)) {
                config.r(I);
            }
            tryRenderFluidContainer(false);
            if (m == null || m.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put("isRefresh", "true");
                IContainerService iContainerService2 = this.mContainerService;
                if (iContainerService2 != null) {
                    iContainerService2.refresh(hashMap, false);
                    return;
                }
                return;
            }
            IContainerService iContainerService3 = this.mContainerService;
            if (iContainerService3 != null) {
                iContainerService3.refresh(m, true);
            }
            try {
                notifyInteractContainerUrlRefreshed(false, new JSONObject(kotlin.collections.a.r(m)));
            } catch (Exception e2) {
                log("error:" + e2.getMessage());
            }
        }
    }

    private final void createFluidInstance() {
        String str;
        Throwable th;
        String url;
        String id;
        int i;
        int i2;
        String str2;
        String queryParameter;
        int i3;
        boolean fromLauncherByParseNodeUrlAndSetConfig;
        boolean c2;
        c cVar;
        FluidInstanceConfig.a p;
        Context context;
        IHostTNodeService iHostTNodeService;
        ITimeOutRefreshService iTimeOutRefreshService;
        IUsePreloadService iUsePreloadService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a542bea", new Object[]{this});
        } else if (this.mFluidInstance == null) {
            q8u.a aVar = q8u.Companion;
            aVar.a("video createFluidInstance");
            log("createFluidInstance...");
            s0j.a(s0j.TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW);
            try {
                TabModel tabModel = (TabModel) getData();
                url = tabModel != null ? tabModel.getUrl() : null;
                TabModel tabModel2 = (TabModel) getData();
                id = tabModel2 != null ? tabModel2.getId() : null;
            } catch (Throwable th2) {
                th = th2;
                str = s0j.TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW;
            }
            try {
                if (this.isNewUI) {
                    kxd kxdVar = this.mTab2ServiceDelegate;
                    i2 = pr9.o(kxdVar != null ? kxdVar.y() : 0);
                    kxd kxdVar2 = this.mTab2ServiceDelegate;
                    i = pr9.o(kxdVar2 != null ? kxdVar2.W() : 0);
                } else {
                    Context context2 = this.mContext;
                    if (context2 != null) {
                        kxd kxdVar3 = this.mTab2ServiceDelegate;
                        i2 = s6o.J(context2, (kxdVar3 != null ? kxdVar3.y() : 0) * 1.0f);
                        Context context3 = this.mContext;
                        if (context3 != null) {
                            kxd kxdVar4 = this.mTab2ServiceDelegate;
                            i = s6o.J(context3, (kxdVar4 != null ? kxdVar4.W() : 0) * 1.0f);
                        } else {
                            ckf.y("mContext");
                            throw null;
                        }
                    } else {
                        ckf.y("mContext");
                        throw null;
                    }
                }
                if (ckf.b(id, "video")) {
                    str2 = FluidInstanceConfig.GG_TYPE_NAME_VIDEO;
                } else {
                    str2 = FluidInstanceConfig.GG_TYPE_NAME_COMMUNITY;
                }
                Uri uri = this.mTab2PageUri;
                queryParameter = uri != null ? uri.getQueryParameter("source") : null;
                i3 = ckf.b(queryParameter, sj4.TAB2_SOURCE_OUTSIDE) ? 0 : krg.LOG_LEVEL_DEBUG;
                fromLauncherByParseNodeUrlAndSetConfig = fromLauncherByParseNodeUrlAndSetConfig();
                c2 = wyr.c(url);
                log("createFluidInstance, topbarHeight=" + i2 + ", topbarMarginTop=" + i + ", ggType=" + str2 + ",tab2Source=" + queryParameter + ",tabType=" + id + ", isDefaultTab3=" + c2 + ", tab3FromLauncher=" + fromLauncherByParseNodeUrlAndSetConfig + ", engineId=" + getEngineId());
                cVar = new c();
                p = FluidInstanceConfig.a.p();
                str = s0j.TRACE_VIDEOTAB_TABLIST_INITVIDEOCONTROLLERNEW;
                context = this.mContext;
            } catch (Throwable th3) {
                th = th3;
                log("createFluidInstance 创建FluidInstance失败: " + th.getMessage());
                FluidException.throwException(null, FluidInstance.INSTANCE_CREATE_INSTANCE_ERROR, th.getMessage(), th);
                s0j.d(str);
                log("createFluidInstance end");
                return;
            }
            if (context != null) {
                FluidInstanceConfig.a e2 = p.e(context);
                Boolean bool = Boolean.FALSE;
                FluidInstanceConfig.a t = e2.t(bool);
                Boolean bool2 = Boolean.TRUE;
                this.mFluidInstance = FluidSDK.createFluidInstance(t.B(bool2).q(bool2).G(cVar).a(sj4.BIZ_GROUP_NAME).r(sj4.PLAY_SCENES).l(bool2).z(bool2).c(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3).b(FluidInstanceConfig.appendBizName(FluidInstanceConfig.CONTAINER_NAME_GG_TAG3, id, getEngineId())).v(sj4.f28084a).u(getPageURL()).k(str2).x(bool).w(queryParameter).n(Integer.valueOf(i3)).A(id != null ? id : "video").C(Integer.valueOf(i2)).D(Integer.valueOf(i)).y(Boolean.valueOf(fromLauncherByParseNodeUrlAndSetConfig)).h(url, Uri.parse(replaceSourceForLauncher(url, fromLauncherByParseNodeUrlAndSetConfig))).g(new h57()).d());
                aVar.c();
                aVar.a("video fluid onCreate");
                FluidInstance fluidInstance = this.mFluidInstance;
                this.mContainerService = fluidInstance != null ? (IContainerService) fluidInstance.getService(IContainerService.class) : null;
                FluidInstance fluidInstance2 = this.mFluidInstance;
                this.mSceneConfigService = fluidInstance2 != null ? (ISceneConfigService) fluidInstance2.getService(ISceneConfigService.class) : null;
                setPreRequestOnPageCreate(c2, fromLauncherByParseNodeUrlAndSetConfig);
                FluidInstance fluidInstance3 = this.mFluidInstance;
                if (!(fluidInstance3 == null || (iUsePreloadService = (IUsePreloadService) fluidInstance3.getService(IUsePreloadService.class)) == null)) {
                    iUsePreloadService.setTab3QuickRender();
                }
                FluidInstance fluidInstance4 = this.mFluidInstance;
                if (!(fluidInstance4 == null || (iTimeOutRefreshService = (ITimeOutRefreshService) fluidInstance4.getService(ITimeOutRefreshService.class)) == null)) {
                    iTimeOutRefreshService.initEnable(true);
                }
                FluidInstance fluidInstance5 = this.mFluidInstance;
                if (!(fluidInstance5 == null || (iHostTNodeService = (IHostTNodeService) fluidInstance5.getService(IHostTNodeService.class)) == null)) {
                    iHostTNodeService.setTab2ServiceDelegate(this.turboContainerDelegate);
                }
                aVar.c();
                s0j.d(str);
                log("createFluidInstance end");
                return;
            }
            ckf.y("mContext");
            throw null;
        }
    }
}
