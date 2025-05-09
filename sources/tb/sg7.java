package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.analysis.analysis.FluidInstanceAnalysis;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.data.DataVersionManager;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.preload.PreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.fluid.framework.shareplayer.ISharePlayerService;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.c4o;
import tb.rg7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FAKE_CONTENT_ID = "88888888";

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f28032a;
    public final rg7 b;
    public final IContainerService c;
    public final ISceneConfigService e;
    public final IUsePreloadService f;
    public sv2<yao<List<com.taobao.android.fluid.framework.data.datamodel.a>>> h;
    public Map j;
    public boolean m;
    public int n;
    public boolean o;
    public String p;
    public boolean q;
    public boolean r;
    public long t;
    public long u;
    public long v;
    public final List<com.taobao.android.fluid.framework.data.datamodel.a> d = new ArrayList(2);
    public Map<String, Object> g = new HashMap();
    public boolean i = false;
    public boolean k = false;
    public boolean l = false;
    public String s = "normal";
    public String w = null;
    public int x = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements PreloadService.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f28034a;

        public b(sg7 sg7Var, d dVar) {
            this.f28034a = dVar;
        }

        @Override // com.taobao.android.fluid.framework.preload.PreloadService.e
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55283ddd", new Object[]{this, new Integer(i)});
                return;
            }
            ir9.b("IRecommendRequestManager", "onVideoStateChanged: " + i);
            this.f28034a.run();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements sv2<yao<List<com.taobao.android.fluid.framework.data.datamodel.a>>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ yao f28036a;

            public a(yao yaoVar) {
                this.f28036a = yaoVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                DefaultPageType defaultPageType;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ir9.b("IRecommendRequestManager", "IdleTaskHelper detailback run --");
                sg7.l(sg7.this).setRotateAnimation(null);
                yao yaoVar = this.f28036a;
                if (yaoVar == null || !yaoVar.g()) {
                    ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail callback FAIL。上次size=" + sg7.d(sg7.this).size());
                    if (!hn4.d()) {
                        ((IUsePreloadService) sg7.b(sg7.this).getService(IUsePreloadService.class)).removePreAttachedDWInstance(true);
                    }
                    sg7.l(sg7.this).toggleCacheLoading(false);
                    if (!sz3.a(sg7.d(sg7.this))) {
                        ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail callback FAIL。有数据，不刷新");
                        return;
                    }
                    ((ISharePlayerService) sg7.b(sg7.this).getService(ISharePlayerService.class)).setDWInstance(null);
                    ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail callback FAIL。无数据，显示错误态。message=" + this.f28036a.e() + ";ext=" + this.f28036a.d());
                    sg7.l(sg7.this).hideLoading();
                    sg7.l(sg7.this).toggleCacheLoading(false);
                    ((ISharePlayerService) sg7.b(sg7.this).getService(ISharePlayerService.class)).clearSharePlayer(sg7.b(sg7.this).getInstanceConfig().getPreCoverKey());
                    if (rg7.ERROR_CODE_I_007.equalsIgnoreCase(this.f28036a.b())) {
                        sg7.l(sg7.this).initErrorAndRefresh(DefaultPageType.NO_PERMISSION, this.f28036a.e(), this.f28036a.d());
                    } else {
                        boolean isFollowTab = sg7.b(sg7.this).getInstanceConfig().isFollowTab();
                        IContainerService l = sg7.l(sg7.this);
                        if (isFollowTab) {
                            defaultPageType = DefaultPageType.EMPTY_FOLLOW;
                        } else {
                            defaultPageType = DefaultPageType.NORMAL_ERROR;
                        }
                        l.initErrorAndRefresh(defaultPageType, this.f28036a.e(), this.f28036a.d());
                    }
                    if (ws6.c()) {
                        sg7.e(sg7.this, true);
                        kr9.a(sg7.b(sg7.this));
                        return;
                    }
                    return;
                }
                sg7.d(sg7.this).clear();
                sg7.d(sg7.this).addAll((Collection) this.f28036a.c());
                ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail callback SUCCESS，成功回调。size=" + sg7.d(sg7.this).size() + ";target.ext：" + this.f28036a.d());
                IDataService iDataService = (IDataService) sg7.b(sg7.this).getService(IDataService.class);
                if (iDataService != null) {
                    iDataService.onDetailRequestSuccess();
                }
                sg7.l(sg7.this).updateView(true, (List) this.f28036a.c());
                sg7.l(sg7.this).hideErrorView();
                if (ws6.c()) {
                    sg7.e(sg7.this, false);
                }
            }
        }

        public c() {
        }

        /* renamed from: b */
        public void a(yao<List<com.taobao.android.fluid.framework.data.datamodel.a>> yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("850591d8", new Object[]{this, yaoVar});
                return;
            }
            a aVar = new a(yaoVar);
            if (!pto.o(sg7.b(sg7.this)) || ((ILifecycleService) sg7.b(sg7.this).getService(ILifecycleService.class)).getPageState() >= 2 || sg7.l(sg7.this).isHasPreRender()) {
                sg7.f(sg7.this, aVar);
            } else {
                sg7.l(sg7.this).setPendingRunnable(aVar);
            }
            sg7.g(sg7.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f28037a;
        private boolean b = false;

        static {
            t2o.a(468714263);
        }

        public d(Runnable runnable) {
            this.f28037a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.b) {
                this.b = true;
                this.f28037a.run();
            }
        }
    }

    static {
        t2o.a(468714258);
        t2o.a(468714264);
    }

    public sg7(FluidContext fluidContext) {
        this.f28032a = fluidContext;
        this.b = new rg7(fluidContext);
        this.c = (IContainerService) fluidContext.getService(IContainerService.class);
        this.f = (IUsePreloadService) fluidContext.getService(IUsePreloadService.class);
        this.e = (ISceneConfigService) fluidContext.getService(ISceneConfigService.class);
        L();
    }

    public static /* synthetic */ boolean a(sg7 sg7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c99d3552", new Object[]{sg7Var, new Boolean(z)})).booleanValue();
        }
        sg7Var.k = z;
        return z;
    }

    public static /* synthetic */ FluidContext b(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("eda2023", new Object[]{sg7Var});
        }
        return sg7Var.f28032a;
    }

    public static /* synthetic */ IUsePreloadService c(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUsePreloadService) ipChange.ipc$dispatch("21f7f04b", new Object[]{sg7Var});
        }
        return sg7Var.f;
    }

    public static /* synthetic */ List d(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("70a08713", new Object[]{sg7Var});
        }
        return sg7Var.d;
    }

    public static /* synthetic */ boolean e(sg7 sg7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269ec241", new Object[]{sg7Var, new Boolean(z)})).booleanValue();
        }
        sg7Var.o = z;
        return z;
    }

    public static /* synthetic */ void f(sg7 sg7Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d091b4", new Object[]{sg7Var, runnable});
        } else {
            sg7Var.q(runnable);
        }
    }

    public static /* synthetic */ boolean g(sg7 sg7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24ebe0ff", new Object[]{sg7Var, new Boolean(z)})).booleanValue();
        }
        sg7Var.getClass();
        return z;
    }

    public static /* synthetic */ boolean h(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e31cdca", new Object[]{sg7Var})).booleanValue();
        }
        return sg7Var.s();
    }

    public static /* synthetic */ int i(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("345c567a", new Object[]{sg7Var})).intValue();
        }
        return sg7Var.n;
    }

    public static /* synthetic */ sv2 j(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("8e6e7340", new Object[]{sg7Var});
        }
        return sg7Var.h;
    }

    public static /* synthetic */ boolean k(sg7 sg7Var, yao yaoVar, ntm ntmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41012c28", new Object[]{sg7Var, yaoVar, ntmVar, str})).booleanValue();
        }
        return sg7Var.p(yaoVar, ntmVar, str);
    }

    public static /* synthetic */ IContainerService l(sg7 sg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerService) ipChange.ipc$dispatch("10646ab5", new Object[]{sg7Var});
        }
        return sg7Var.c;
    }

    public static /* synthetic */ boolean m(sg7 sg7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3ab20eb", new Object[]{sg7Var, new Boolean(z)})).booleanValue();
        }
        sg7Var.i = z;
        return z;
    }

    public static /* synthetic */ Map n(sg7 sg7Var, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("745e1f6c", new Object[]{sg7Var, map});
        }
        sg7Var.j = map;
        return map;
    }

    public static /* synthetic */ boolean o(sg7 sg7Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1f83fa9", new Object[]{sg7Var, new Boolean(z)})).booleanValue();
        }
        sg7Var.r = z;
        return z;
    }

    public List<com.taobao.android.fluid.framework.data.datamodel.a> A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("61b878f3", new Object[]{this});
        }
        return this.d;
    }

    public long B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b127cc97", new Object[]{this})).longValue();
        }
        return this.v;
    }

    public long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86ff741c", new Object[]{this})).longValue();
        }
        return this.u;
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27c8b6cc", new Object[]{this});
        }
        return this.s;
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a668ef3", new Object[]{this});
        }
        return this.w;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5064ed4", new Object[]{this})).intValue();
        }
        if (this.k) {
            return 1;
        }
        return this.x;
    }

    public miv G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (miv) ipChange.ipc$dispatch("a712e92e", new Object[]{this});
        }
        return this.b.f();
    }

    public iaw H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iaw) ipChange.ipc$dispatch("e135e4c2", new Object[]{this});
        }
        return this.b.g();
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f21ddf6", new Object[]{this});
        }
        return this.p;
    }

    public void J(sv2<yao<List<com.taobao.android.fluid.framework.data.datamodel.a>>> sv2Var, yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e049b50a", new Object[]{this, sv2Var, yaoVar});
            return;
        }
        tq9 fluidInstanceAnalysis = ((IAnalysisService) this.f28032a.getService(IAnalysisService.class)).getFluidInstanceAnalysis();
        fluidInstanceAnalysis.d(FluidInstanceAnalysis.Stage.DETAIL_REQUEST.name(), IDataService.ERROR_CODE_REQUEST_DATA);
        fluidInstanceAnalysis.b("failed");
        if (sv2Var == null) {
            return;
        }
        if (yaoVar == null) {
            sv2Var.a(yao.a("", "", null));
        } else {
            sv2Var.a(yao.a(yaoVar.b(), yaoVar.e(), yaoVar.d()));
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cb9b7c", new Object[]{this});
        } else {
            this.h = new c();
        }
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8c036ac", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a218ab", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d79f1b1", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public final boolean P(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9f44127", new Object[]{this, map})).booleanValue();
        }
        if (!akt.p2("ShortVideo.fixSameDetailArgs", true)) {
            return this.k;
        }
        if (!this.k || !nwv.i(map, this.j)) {
            return false;
        }
        return true;
    }

    public final boolean Q(ntm ntmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ffcfe4d", new Object[]{this, ntmVar, str})).booleanValue();
        }
        if (ntmVar == null || ntmVar.o || ntmVar.p || !TextUtils.equals(str, ntmVar.b)) {
            return false;
        }
        return true;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931ef808", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d4a7235", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public final Map T(pep pepVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1e156388", new Object[]{this, pepVar, map});
        }
        if (!(pepVar == null || pepVar.c() == null)) {
            if (map == null) {
                map = new HashMap();
            }
            map.putAll(pepVar.c());
        }
        return map;
    }

    public void U(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dbf1676", new Object[]{this, new Long(j)});
        } else {
            this.t = j;
        }
    }

    public void V(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c216fdf5", new Object[]{this, new Long(j)});
        } else {
            this.v = j;
        }
    }

    public void W(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ae3da8", new Object[]{this, new Long(j)});
        } else {
            this.u = j;
        }
    }

    public void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49638940", new Object[]{this, str});
        } else {
            this.p = str;
        }
    }

    public void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28bb55fb", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb6e45e0", new Object[]{this});
            return;
        }
        HashMap<String, String> tab3CacheTrackParams = this.f.getTab3CacheTrackParams();
        com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.D(this.f28032a, sz3.b(tab3CacheTrackParams) ? null : tab3CacheTrackParams.get("tab3_use_cache_from"));
        if (!sz3.b(tab3CacheTrackParams)) {
            String str = tab3CacheTrackParams.get("tab3_use_cache_from");
            String str2 = tab3CacheTrackParams.get("tab3_use_cache_data");
            String str3 = tab3CacheTrackParams.get("tab3_use_cache_icon_backflow");
            IPreloadService iPreloadService = (IPreloadService) this.f28032a.getService(IPreloadService.class);
            if (iPreloadService != null && iPreloadService.getPreloadVideoTrackerManager() != null) {
                ptm preloadVideoTrackerManager = iPreloadService.getPreloadVideoTrackerManager();
                preloadVideoTrackerManager.f("ggpick_cache_hit3", str2, str3, str, preloadVideoTrackerManager.a(this.f28032a));
            }
        }
    }

    public void b0(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("257b3937", new Object[]{this, yaoVar});
        } else if (yaoVar != null) {
            this.w = yaoVar.b();
            if (yaoVar.c() == null || yaoVar.c().second == null) {
                this.x = 4;
            } else if (!sz3.a(((MediaMixContentDetail) yaoVar.c().second).list) || !sz3.a(((MediaMixContentDetail) yaoVar.c().second).pitList)) {
                this.x = 0;
            } else {
                this.x = 3;
            }
        } else {
            this.x = 4;
        }
    }

    public final boolean p(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar, ntm ntmVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("855a5dd2", new Object[]{this, yaoVar, ntmVar, str})).booleanValue();
        }
        if (!akt.p2("ShortVideo.autoRefresh", true) || ((yaoVar != null && a6o.b(yaoVar.b())) || !Q(ntmVar, str))) {
            return false;
        }
        return true;
    }

    public final void q(Runnable runnable) {
        atb atbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9190107c", new Object[]{this, runnable});
        } else if (akt.p2("ShortVideo.awaitVideoPlayToRun", true)) {
            ntm findPreAttachedPreloadedVideo = this.f.findPreAttachedPreloadedVideo();
            if (findPreAttachedPreloadedVideo == null || ((!findPreAttachedPreloadedVideo.j && !findPreAttachedPreloadedVideo.r) || (atbVar = findPreAttachedPreloadedVideo.f24942a) == null || atbVar.getView() == null || !(findPreAttachedPreloadedVideo.f24942a.getVideoState() == 8 || findPreAttachedPreloadedVideo.f24942a.getVideoState() == 5 || findPreAttachedPreloadedVideo.f24942a.getVideoState() == 0))) {
                runnable.run();
                return;
            }
            ir9.b("IRecommendRequestManager", "awaitVideoPlayToRun");
            ViewGroup view = findPreAttachedPreloadedVideo.f24942a.getView();
            d dVar = new d(runnable);
            view.setTag(R.id.fluid_sdk_tag_video_state_callback, new b(this, dVar));
            nwv.A0(dVar, 1000L);
        } else {
            runnable.run();
        }
    }

    public final void r(ntm ntmVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b101f93a", new Object[]{this, ntmVar, new Boolean(z)});
            return;
        }
        String str2 = "1";
        if (ntmVar == null) {
            str = "-1";
        } else if (!ntmVar.r) {
            str = str2;
        } else if (ntmVar.o) {
            str = "4";
        } else {
            str = "3";
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tab3_use_cache_from", TextUtils.isEmpty(str) ? null : str);
        hashMap.put("tab3_use_cache_data", TextUtils.equals("-1", str) ? "0" : str2);
        if (!z) {
            str2 = "0";
        }
        hashMap.put("tab3_use_cache_icon_backflow", str2);
        this.f.setTab3CacheTrackParams(hashMap);
    }

    public final boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61dc283", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.enableCancelResponseWithDetailMtopId", true);
    }

    public final boolean t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8313b89", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!z || akt.p2("ShortVideo.enableIconStreamRefreshClearPreload", false)) {
            return true;
        }
        return false;
    }

    public void u(Map map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b69b8e", new Object[]{this, map, new Boolean(z), new Boolean(z2)});
        } else {
            v(map, z, false, z2, null);
        }
    }

    public void w(tg7 tg7Var, rg7.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f709bb2", new Object[]{this, tg7Var, cVar});
        } else {
            this.b.b(tg7Var, cVar);
        }
    }

    public long x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f128d8f6", new Object[]{this})).longValue();
        }
        return this.t;
    }

    public sv2<yao<List<com.taobao.android.fluid.framework.data.datamodel.a>>> y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("6b88b8f5", new Object[]{this});
        }
        return this.h;
    }

    public yif z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yif) ipChange.ipc$dispatch("7a4765d3", new Object[]{this});
        }
        return this.b.e();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements rg7.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d5n f28033a;
        public final /* synthetic */ int b;
        public final /* synthetic */ long c;
        public final /* synthetic */ pep d;
        public final /* synthetic */ String e;
        public final /* synthetic */ ntm f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ Map h;
        public final /* synthetic */ boolean i;

        public a(d5n d5nVar, int i, long j, pep pepVar, String str, ntm ntmVar, boolean z, Map map, boolean z2) {
            this.f28033a = d5nVar;
            this.b = i;
            this.c = j;
            this.d = pepVar;
            this.e = str;
            this.f = ntmVar;
            this.g = z;
            this.h = map;
            this.i = z2;
        }

        @Override // tb.rg7.d
        public void onStartRequest(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a52f90", new Object[]{this, new Integer(i)});
                return;
            }
            sg7.m(sg7.this, true);
            sg7.a(sg7.this, true);
            sg7.n(sg7.this, this.h);
            if (sz3.e(this.h) && this.i) {
                sg7.o(sg7.this, true);
                if (sg7.c(sg7.this).enableTab3UseCacheData() && !qtm.f()) {
                    com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.F(sg7.b(sg7.this), "1");
                }
            } else if (this.g) {
                sg7.o(sg7.this, false);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(vaj.KEY_TAB_ID, sg7.b(sg7.this).getInstanceConfig().getTabId());
            hashMap.put("isDefaultTab", Boolean.valueOf(((ISceneConfigService) sg7.b(sg7.this).getService(ISceneConfigService.class)).getSessionParams().b().f()));
            ryr.d(sg7.b(sg7.this).getContext(), pto.b(sg7.b(sg7.this)), s0j.GG_VIDEOTAB_PAGE_INIT, hashMap);
        }

        @Override // tb.rg7.d
        public void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar, yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar2) {
            int i;
            boolean z;
            boolean z2;
            String str;
            String str2;
            String str3;
            String str4;
            List<MediaContentDetailData> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc2f754b", new Object[]{this, yaoVar, yaoVar2});
                return;
            }
            igs.a("detailcallback");
            sg7.a(sg7.this, false);
            sg7.this.b0(yaoVar2);
            if (this.f28033a != null) {
                yre.a(sg7.b(sg7.this), this.f28033a);
            }
            if (!sg7.h(sg7.this) || sg7.i(sg7.this) == this.b) {
                boolean z3 = yaoVar != null && yaoVar.g();
                boolean z4 = yaoVar2 != null && yaoVar2.g();
                ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail back, normalDetailSuccess=" + z4 + ";cacheDetailSuccess=" + z3);
                if (yaoVar2 == null || yaoVar2.c() == null) {
                    z2 = false;
                    z = false;
                    i = 0;
                } else {
                    z2 = (yaoVar2.c().first == null || ((com.taobao.android.fluid.framework.data.datamodel.a) yaoVar2.c().first).e() == null) ? false : ((com.taobao.android.fluid.framework.data.datamodel.a) yaoVar2.c().first).e().j;
                    if (yaoVar2.c().second != null) {
                        list = ((MediaMixContentDetail) yaoVar2.c().second).list;
                        z = ((MediaMixContentDetail) yaoVar2.c().second).isBackUp;
                        if (list != null) {
                            i = list.size();
                            ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail back, fromCDN:" + z2 + "; data=" + list);
                        }
                    } else {
                        list = null;
                        z = false;
                    }
                    i = 0;
                    ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail back, fromCDN:" + z2 + "; data=" + list);
                }
                if (yaoVar2 == null || yaoVar2.f() == null || yaoVar2.f().getMtopStat() == null) {
                    str2 = "";
                    str3 = null;
                    str = null;
                } else {
                    str2 = yaoVar2.f().getMtopStat().eagleEyeTraceId;
                    str = String.valueOf(yaoVar2.f().getMtopStat().statusCode);
                    str3 = yaoVar2.f().getMtopStat().retCode;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
                boolean z5 = elapsedRealtime < 1000;
                StringBuilder sb = new StringBuilder("[dataRequest]fetchDetail_back_info;status_");
                sb.append(z4 || z3);
                sb.append(";fast_");
                sb.append(z5);
                sb.append(";traceId_");
                sb.append(str2);
                sb.append(";cost_");
                sb.append(elapsedRealtime);
                sb.append(";statusCode_");
                sb.append(str);
                sb.append(";retCode_");
                sb.append(str3);
                sb.append(";source_");
                pep pepVar = this.d;
                if (pepVar != null) {
                    str4 = pepVar.c;
                } else {
                    str4 = "";
                }
                sb.append(str4);
                sb.append(";isFromCDN_");
                sb.append(z2);
                sb.append(";isCache_");
                sb.append(yaoVar != null);
                sb.append(";isBackup_");
                sb.append(z);
                sb.append(";contentId_");
                sb.append(this.e);
                sb.append(";dataSize_");
                sb.append(i);
                ir9.b("IRecommendRequestManager", sb.toString());
                ((IDataService) sg7.b(sg7.this).getService(IDataService.class)).setTab3CacheEnable(false);
                try {
                    if (yaoVar == null) {
                        ir9.b("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail，只响应真实请求的回调");
                        if (z4) {
                            sg7 sg7Var = sg7.this;
                            sg7Var.K(sg7.j(sg7Var), null, yaoVar2, this.d);
                        } else if (sg7.k(sg7.this, yaoVar2, this.f, this.e)) {
                            ir9.b("IRecommendRequestManager", "autoRefresh，contentId:" + this.e);
                            sg7.l(sg7.this).refreshWithCallback(null);
                        } else {
                            sg7 sg7Var2 = sg7.this;
                            sg7Var2.J(sg7.j(sg7Var2), yaoVar2);
                        }
                    } else if (z3 && z4) {
                        ir9.b("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail成功，上翻");
                        ((IDataService) sg7.b(sg7.this).getService(IDataService.class)).setTab3CacheEnable(true);
                        sg7 sg7Var3 = sg7.this;
                        sg7Var3.K(sg7.j(sg7Var3), yaoVar, yaoVar2, this.d);
                    } else if (z4) {
                        ir9.b("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail成功，使用真实detail重新创建播放器");
                        sg7 sg7Var4 = sg7.this;
                        sg7Var4.K(sg7.j(sg7Var4), null, yaoVar2, this.d);
                    } else if (z3) {
                        ir9.b("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail成功，cache请求recommend 接口 不上翻");
                        sg7 sg7Var5 = sg7.this;
                        sg7Var5.K(sg7.j(sg7Var5), yaoVar, null, this.d);
                    } else {
                        ir9.b("IRecommendRequestManager", "PickPreloadControllerNew,fetchContentDetail失败，显示错误页");
                        sg7 sg7Var6 = sg7.this;
                        sg7Var6.J(sg7.j(sg7Var6), yaoVar2);
                    }
                    if (this.g) {
                        ((IMessageService) sg7.b(sg7.this).getService(IMessageService.class)).sendMessage(new vrp("VSMSG_listRefresh", "-1", null));
                    }
                } catch (Throwable th) {
                    ir9.c("IRecommendRequestManager", "", th);
                    sg7 sg7Var7 = sg7.this;
                    sg7Var7.J(sg7.j(sg7Var7), null);
                }
                igs.c();
                return;
            }
            ir9.b("IRecommendRequestManager", "[dataRequest]discard fetchContentDetail onSuccess detailMtopId" + this.b + "mCurrentDetailMtopId" + sg7.i(sg7.this) + "，请求的Mtop对应不上，响应后面的请求，前面请求的返回未返回的情况下return掉不处理");
        }
    }

    public void K(sv2<yao<List<com.taobao.android.fluid.framework.data.datamodel.a>>> sv2Var, yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar, yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar2, pep pepVar) {
        String str;
        MediaMixContentDetail mediaMixContentDetail;
        com.taobao.android.fluid.framework.data.datamodel.a aVar;
        a.d e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fe6b4e", new Object[]{this, sv2Var, yaoVar, yaoVar2, pepVar});
            return;
        }
        igs.a("detailhandlerSuccess");
        ArrayList arrayList = new ArrayList();
        if (yaoVar != null) {
            mediaMixContentDetail = (MediaMixContentDetail) yaoVar.c().second;
            str = yaoVar.e();
            com.taobao.android.fluid.framework.data.datamodel.a aVar2 = (com.taobao.android.fluid.framework.data.datamodel.a) yaoVar.c().first;
            if (aVar2 != null) {
                aVar2.e().G();
                arrayList.add(aVar2);
            }
        } else {
            mediaMixContentDetail = null;
            str = null;
        }
        if (yaoVar2 != null) {
            aVar = (com.taobao.android.fluid.framework.data.datamodel.a) yaoVar2.c().first;
            mediaMixContentDetail = (MediaMixContentDetail) yaoVar2.c().second;
            str = yaoVar2.e();
            if (aVar != null) {
                arrayList.add(aVar);
            }
        } else {
            aVar = null;
        }
        this.m = true;
        this.g = mediaMixContentDetail.config;
        ((IDataService) this.f28032a.getService(IDataService.class)).getConfig().j().o(this.g);
        if (!mediaMixContentDetail.isBackUp) {
            DataVersionManager.m(pepVar != null ? pepVar.b : null, mediaMixContentDetail.nextDataVersion);
        }
        if (sv2Var != null) {
            sv2Var.a(yao.h(str, arrayList));
        }
        if (!(!this.f.enableTab3UseCacheData() || aVar == null || (e = aVar.e()) == null || !e.C() || e.K() == null || this.f28032a.getInstanceConfig().getFluidUrl() == null)) {
            ir9.b("IRecommendRequestManager", "首坑请求来自网络请求，存入首坑detail数据 new flage");
            ryr.b(this.f28032a.getContext(), pto.b(this.f28032a), s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_SAVE_DETAIL);
            igs.a("saveMediaDataAndDownloadVideo");
            ejf.g(this.f28032a, aVar);
            igs.c();
            ryr.d(this.f28032a.getContext(), pto.b(this.f28032a), s0j.TRACE_VIDEOTAB_TABLIST_MULTITABVIDEOCONTROLLER_SAVE_DETAIL, null);
        }
        ((IInteractionService) this.f28032a.getService(IInteractionService.class)).initGlobalInteractHandler();
        ((IAnalysisService) this.f28032a.getService(IAnalysisService.class)).getFluidInstanceAnalysis().e(FluidInstanceAnalysis.Stage.DETAIL_REQUEST.name());
        igs.c();
    }

    public final String a0(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3b6243f", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            str = gl4.CONFIG_PULL_DOWN;
        } else {
            String h = ((IContainerService) this.f28032a.getService(IContainerService.class)).getConfig().h();
            str = "back";
            if (!str.equalsIgnoreCase(h)) {
                str = "clickicon";
                if (!str.equalsIgnoreCase(h)) {
                    str = "normal";
                    ((IContainerService) this.f28032a.getService(IContainerService.class)).getConfig().r(null);
                }
            }
            ((IContainerService) this.f28032a.getService(IContainerService.class)).getConfig().r(null);
        }
        ((IContainerService) this.f28032a.getService(IContainerService.class)).setFirstCardFromRefresh(true ^ TextUtils.equals(str, "normal"));
        this.s = str;
        xau.U(this.f28032a, str);
        IPreCacheService iPreCacheService = (IPreCacheService) this.f28032a.getService(IPreCacheService.class);
        if (iPreCacheService != null && iPreCacheService.enablePreCache()) {
            iPreCacheService.downloadCacheVideo(str);
        }
        zpm.g().a();
        return str;
    }

    public void v(Map map, boolean z, boolean z2, boolean z3, d5n d5nVar) {
        String str;
        ntm ntmVar;
        String str2;
        boolean z4 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d582ff4", new Object[]{this, map, new Boolean(z), new Boolean(z2), new Boolean(z3), d5nVar});
            return;
        }
        ((IAnalysisService) this.f28032a.getService(IAnalysisService.class)).getFluidInstanceAnalysis().f(FluidInstanceAnalysis.Stage.DETAIL_REQUEST.name());
        pep sessionParams = ((ISceneConfigService) this.f28032a.getService(ISceneConfigService.class)).getSessionParams();
        Map T = T(sessionParams, map);
        boolean isLaunchCodeRequest = this.f.isLaunchCodeRequest();
        this.f.setIsLaunchCodeRequest(false);
        if (P(T)) {
            ir9.b("IRecommendRequestManager", "isLoadingWithSameArgs, return, args:" + T);
            return;
        }
        int i = this.n + 1;
        this.n = i;
        if (TextUtils.isEmpty(this.c.getRawId())) {
            str = sessionParams.d;
        } else {
            str = this.c.getRawId();
        }
        if (!this.l) {
            str = vrl.d(this.f28032a);
        }
        this.l = true;
        if (!z3 || !t(z)) {
            ntmVar = this.f.getConfig().k();
        } else {
            this.f.getConfig().q(null);
            ntmVar = null;
        }
        if (d5nVar == null) {
            z4 = false;
        }
        String a0 = a0(z4);
        String tab3ComponentSource = this.f28032a.getInstanceConfig().getTab3ComponentSource();
        boolean l = pto.l(this.f28032a);
        if (ntmVar != null) {
            boolean z5 = ntmVar.o;
            if (sz3.b(T) && ntmVar.r && !z5 && !TextUtils.isEmpty(ntmVar.b)) {
                str = ntmVar.b;
            }
        }
        String c2 = nql.c(sessionParams, T);
        c4o.a f = nql.f(sessionParams, tab3ComponentSource, l, false, a0, this.f28032a);
        f.h(z2);
        tg7 b2 = nql.b(sessionParams, str, T);
        b2.j(JSON.toJSONString(f.a())).h(c2);
        if (isLaunchCodeRequest) {
            b2.f("detail_launch");
        } else if (z) {
            b2.f("detail_iconstream");
        } else {
            if (TextUtils.equals("normal", a0)) {
                str2 = "detail_normal";
            } else {
                str2 = "detail_refresh";
            }
            b2.f(str2);
        }
        r(ntmVar, z);
        ir9.b("IRecommendRequestManager", "[dataRequest]fetchContentDetail方法调用，cacheContentId=null,contentId=" + str + ";args=" + T + ";refreshType=" + a0 + ";preloadedVideo=" + ntmVar);
        this.b.c(null, b2, new a(d5nVar, i, SystemClock.elapsedRealtime(), sessionParams, str, ntmVar, z3, T, z));
        Z();
    }
}
