package tb;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.a;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.data.remote.MediaMixContentDetailResponse;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import com.taobao.android.fluid.framework.list.render.RecyclerFooterViewHolder;
import com.taobao.android.fluid.framework.preload.IPreCacheService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import tb.rg7;
import tb.t19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f22804a;
    public String c;
    public int d;
    public long e;
    public JSONObject f;
    public boolean m;
    public String n;
    public boolean o;
    public boolean p;
    public String q;
    public boolean r;
    public j s;
    public i t;
    public sv2<h> u;
    public sv2<h> v;
    public Map<String, Object> x;
    public Map<String, Object> y;
    public final Handler b = new Handler(Looper.getMainLooper());
    public int g = 0;
    public String h = null;
    public int i = 0;
    public int j = 0;
    public boolean k = false;
    public boolean l = false;
    public int w = -1;
    public final Runnable z = new a();
    public final Runnable A = new b();

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
                return;
            }
            ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData setLoadingState 兜底恢复isLoading=false");
            kon.this.b0(true, false);
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
                return;
            }
            ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData setLoadingState 兜底恢复isLoading=false");
            kon.this.b0(false, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements rg7.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.rg7.c
        public void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
            }
        }

        @Override // tb.rg7.c
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
                return;
            }
            ir9.b("IRecommendRequestManager", "DetailRequestListener callback, onStartRequest");
            kon.a(kon.this, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements IMTopAdapter.a<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(kon konVar) {
        }

        /* renamed from: b */
        public MediaMixContentDetailResponse a(byte[] bArr, Class<MediaMixContentDetailResponse> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaMixContentDetailResponse) ipChange.ipc$dispatch("373d1124", new Object[]{this, bArr, cls});
            }
            ir9.b("IRecommendRequestManager", "PickPreloadControllerNew动态解析，parseResponseListener");
            if (ws6.d()) {
                return null;
            }
            return hrl.b(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements MtopModule.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t19.b f22809a;

        public f(kon konVar, t19.b bVar) {
            this.f22809a = bVar;
        }

        @Override // com.taobao.android.layoutmanager.module.MtopModule.c
        public void a(MtopBuilder mtopBuilder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("870f15ae", new Object[]{this, mtopBuilder});
            } else {
                s19.y(this.f22809a, mtopBuilder);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g extends h {
        static {
            t2o.a(468714302);
        }

        public g(String str) {
            super(null, null, null, null, null);
            this.f = false;
            this.g = false;
            this.h = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final List<MediaContentDetailData> f22810a;
        public final Map<String, Object> b;
        public final JSONArray c;
        public final List<MediaContentDetailData> d;
        public final JSONArray e;
        public boolean f;
        public String h = null;
        public boolean g = true;

        static {
            t2o.a(468714303);
        }

        public h(Map<String, Object> map, List<MediaContentDetailData> list, JSONArray jSONArray, List<MediaContentDetailData> list2, JSONArray jSONArray2) {
            this.b = map;
            this.f22810a = list;
            this.c = jSONArray;
            this.d = list2;
            this.e = jSONArray2;
        }

        public int a() {
            MediaContentDetailData mediaContentDetailData;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3fde062a", new Object[]{this})).intValue();
            }
            List<MediaContentDetailData> list = this.f22810a;
            if (list == null || list.isEmpty() || (mediaContentDetailData = this.f22810a.get(0)) == null) {
                return 0;
            }
            return mediaContentDetailData.relativeIndex;
        }

        public boolean b() {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
            }
            List<MediaContentDetailData> list = this.f22810a;
            if (list == null || list.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            List<MediaContentDetailData> list2 = this.d;
            if (list2 == null || list2.size() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || !z2) {
                return false;
            }
            return true;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("74ee5ecc", new Object[]{this})).booleanValue();
            }
            List<MediaContentDetailData> list = this.f22810a;
            if (list == null || this.c == null) {
                return false;
            }
            if ((!list.isEmpty() || !this.c.isEmpty()) && this.f22810a.size() == this.c.size()) {
                return true;
            }
            return false;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("71a312c5", new Object[]{this})).booleanValue();
            }
            List<MediaContentDetailData> list = this.d;
            if (list == null || this.e == null || list.size() != this.e.size()) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final sv2<h> f22811a;
        private int b = -1;
        private Map c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements sv2<h> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ IPreCacheService f22812a;
            public final /* synthetic */ long b;

            public a(IPreCacheService iPreCacheService, long j) {
                this.f22812a = iPreCacheService;
                this.b = j;
            }

            /* renamed from: b */
            public void a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
                    return;
                }
                ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable onCall end");
                IPreCacheService iPreCacheService = this.f22812a;
                if (iPreCacheService != null) {
                    iPreCacheService.onMtopLoadingEnd(System.currentTimeMillis() - this.b);
                }
                if (((IFeedsListService) kon.b(kon.this).getService(IFeedsListService.class)).getRecyclerView() != null) {
                    kon.a(kon.this, hVar);
                }
                if (hVar == null || !hVar.g) {
                    i.a(i.this);
                    if (kon.g(kon.this) != null) {
                        kon.g(kon.this).a(null);
                        kon.h(kon.this, null);
                    }
                    ir9.b("IRecommendRequestManager", "PickPreloadController,target 为null");
                } else if (hVar.f) {
                    i iVar = i.this;
                    kon.h(kon.this, i.b(iVar));
                } else {
                    boolean isCollectionScene = ((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).isCollectionScene();
                    ir9.b("IRecommendRequestManager", " 是否分页：" + isCollectionScene);
                    if (!isCollectionScene || i.c(i.this) < 0) {
                        ((IDataService) kon.b(kon.this).getService(IDataService.class)).appendDetailListAtLast(hVar);
                        if (((IUsePreloadService) kon.b(kon.this).getService(IUsePreloadService.class)).enableTab3UseCacheData() && usm.e()) {
                            ejf.i(kon.b(kon.this), ((IDataService) kon.b(kon.this).getService(IDataService.class)).getMediaSetList(), ((IFeedsListService) kon.b(kon.this).getService(IFeedsListService.class)).getActivePosition() + 1);
                        }
                        IPreCacheService iPreCacheService2 = this.f22812a;
                        if (iPreCacheService2 != null && iPreCacheService2.enablePreCache()) {
                            this.f22812a.saveUnExposeDetailCache(((IDataService) kon.b(kon.this).getService(IDataService.class)).getMediaSetList(), ((IFeedsListService) kon.b(kon.this).getService(IFeedsListService.class)).getActivePosition());
                        }
                    } else {
                        ((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).insertToCollectionDataCacheAndDetailList(hVar);
                    }
                    nz3.i(kon.b(kon.this), hVar, false);
                    ((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).updateCollectionDialog(hVar);
                    if (i.b(i.this) != null) {
                        i.b(i.this).a(hVar);
                    }
                    if (kon.g(kon.this) != null) {
                        kon.g(kon.this).a(hVar);
                        kon.h(kon.this, null);
                    }
                    ir9.b("IRecommendRequestManager", "PickPreloadController,target 不为null");
                }
            }
        }

        static {
            t2o.a(468714304);
        }

        public i(sv2<h> sv2Var) {
            this.f22811a = sv2Var;
        }

        public static /* synthetic */ void a(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1acb2b48", new Object[]{iVar});
            } else {
                iVar.d();
            }
        }

        public static /* synthetic */ sv2 b(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sv2) ipChange.ipc$dispatch("fe4e8b7e", new Object[]{iVar});
            }
            return iVar.f22811a;
        }

        public static /* synthetic */ int c(i iVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("db4bdf7e", new Object[]{iVar})).intValue();
            }
            return iVar.b;
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90359df3", new Object[]{this});
                return;
            }
            kon.a(kon.this, null);
            sv2<h> sv2Var = this.f22811a;
            if (sv2Var != null) {
                sv2Var.a(null);
            }
        }

        public void e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1064567", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        public void f(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
                return;
            }
            this.c = map;
            ir9.b("IRecommendRequestManager", "PublicCardListController.mLoadMoreRunnable setParams：" + map);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run()");
            if (((ILifecycleService) kon.b(kon.this).getService(ILifecycleService.class)).getPageState() == 5) {
                ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return-- page destroy");
                d();
            } else if (((IDataService) kon.b(kon.this).getService(IDataService.class)).getMediaSetList().isEmpty()) {
                ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return-- getMediaSetList().isEmpty()");
                d();
            } else if (((IDataService) kon.b(kon.this).getService(IDataService.class)).getConfig().j().d) {
                ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return--disableRecommend");
                d();
            } else if (kon.s(kon.this) && !((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).isCollectionScene()) {
                ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable run() return--mNoMoreData");
                d();
            } else if (!((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).isCollectionScene() || this.b < 0 || !((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).tryReuseCollectionDataCacheForDetailList(this.b + 1, this.f22811a, false)) {
                IPreCacheService iPreCacheService = (IPreCacheService) kon.b(kon.this).getService(IPreCacheService.class);
                if (iPreCacheService != null) {
                    iPreCacheService.onMtopLoadingStart();
                }
                long currentTimeMillis = System.currentTimeMillis();
                ir9.b("IRecommendRequestManager", "[dataRequest]mLoadMoreRunnable do requestForCommendData");
                pep sessionParams = ((ISceneConfigService) kon.b(kon.this).getService(ISceneConfigService.class)).getSessionParams();
                kon konVar = kon.this;
                konVar.V(false, true, false, this.b, null, aon.g(sessionParams, ((IDataService) kon.b(konVar).getService(IDataService.class)).getConfig().j()).u(((IDataService) kon.b(kon.this).getService(IDataService.class)).getTransmission()).v(((IDataService) kon.b(kon.this).getService(IDataService.class)).getDetailUnlikeRecorder()).k(e59.a(kon.b(kon.this))).s(false).e(this.c), new a(iPreCacheService, currentTimeMillis));
            } else {
                kon.a(kon.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final sv2<h> f22813a;
        private int b = -1;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements sv2<h> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: b */
            public void a(h hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
                    return;
                }
                ir9.d("IRecommendRequestManager", "requestForCommendData onCall up");
                if (hVar == null) {
                    j.a(j.this);
                    if (kon.i(kon.this) != null) {
                        kon.i(kon.this).a(hVar);
                        kon.j(kon.this, null);
                    }
                } else if (hVar.f) {
                    j jVar = j.this;
                    kon.j(kon.this, j.b(jVar));
                } else {
                    if (((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).isCollectionScene()) {
                        ((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).insertToCollectionDataCacheAndDetailList(hVar);
                    } else {
                        ((IDataService) kon.b(kon.this).getService(IDataService.class)).appendDetailListAtFirst(hVar);
                    }
                    nz3.i(kon.b(kon.this), hVar, true);
                    ((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).updateCollectionDialog(hVar);
                    if (j.b(j.this) != null) {
                        j.b(j.this).a(hVar);
                    }
                    if (kon.i(kon.this) != null) {
                        kon.i(kon.this).a(hVar);
                        kon.j(kon.this, null);
                    }
                }
            }
        }

        static {
            t2o.a(468714306);
        }

        public j(sv2<h> sv2Var) {
            this.f22813a = sv2Var;
        }

        public static /* synthetic */ void a(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("506fe8c6", new Object[]{jVar});
            } else {
                jVar.c();
            }
        }

        public static /* synthetic */ sv2 b(j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (sv2) ipChange.ipc$dispatch("aa7b370b", new Object[]{jVar});
            }
            return jVar.f22813a;
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90359df3", new Object[]{this});
                return;
            }
            sv2<h> sv2Var = this.f22813a;
            if (sv2Var != null) {
                sv2Var.a(null);
            }
        }

        public void d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1064567", new Object[]{this, new Integer(i)});
            } else {
                this.b = i;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ir9.b("IRecommendRequestManager", "VideoProcess LoadUpRunnable run()" + this.b);
            if (!((IDataService) kon.b(kon.this).getService(IDataService.class)).getConfig().j().r) {
                ir9.b("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--enableUpAction" + this.b);
                c();
            } else if (((ILifecycleService) kon.b(kon.this).getService(ILifecycleService.class)).getPageState() == 5) {
                ir9.b("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--enableUpAction" + this.b);
                c();
            } else if (((IDataService) kon.b(kon.this).getService(IDataService.class)).getMediaSetList().isEmpty()) {
                ir9.b("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--isEmpty" + this.b);
                c();
            } else if (kon.p(kon.this) && !((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).isCollectionScene()) {
                ir9.b("IRecommendRequestManager", "VideoProcess LoadUpRunnable run() return--mNoMoreDataUp" + this.b);
                c();
            } else if (!((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).isCollectionScene() || this.b <= 0 || !((ICollectionService) kon.b(kon.this).getService(ICollectionService.class)).tryReuseCollectionDataCacheForDetailList(this.b - 1, this.f22813a, true)) {
                ir9.b("IRecommendRequestManager", "[dataRequest] LoadUpRunnable do requestForCommendData");
                pep sessionParams = ((ISceneConfigService) kon.b(kon.this).getService(ISceneConfigService.class)).getSessionParams();
                kon konVar = kon.this;
                konVar.V(true, true, false, this.b, null, aon.g(sessionParams, ((IDataService) kon.b(konVar).getService(IDataService.class)).getConfig().j()).u(((IDataService) kon.b(kon.this).getService(IDataService.class)).getTransmissionUP()).v(((IDataService) kon.b(kon.this).getService(IDataService.class)).getDetailUnlikeRecorder()).k(e59.a(kon.b(kon.this))).s(true), new a());
            }
        }
    }

    static {
        t2o.a(468714295);
        t2o.a(468714286);
    }

    public kon(FluidContext fluidContext) {
        this.f22804a = fluidContext;
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        if (iDataService != null) {
            ir9.b("IRecommendRequestManager", "RecommendRequestManager addDetailRequestListener add callback");
            iDataService.addDetailRequestListener(new c());
        }
    }

    public static /* synthetic */ void a(kon konVar, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cdd8433", new Object[]{konVar, hVar});
        } else {
            konVar.G(hVar);
        }
    }

    public static /* synthetic */ FluidContext b(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("ca7857ea", new Object[]{konVar});
        }
        return konVar.f22804a;
    }

    public static /* synthetic */ String c(kon konVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("413c48a8", new Object[]{konVar, str});
        }
        konVar.n = str;
        return str;
    }

    public static /* synthetic */ void d(kon konVar, IDataService iDataService, MediaMixContentDetail mediaMixContentDetail, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2703a5d9", new Object[]{konVar, iDataService, mediaMixContentDetail, new Boolean(z)});
        } else {
            konVar.f0(iDataService, mediaMixContentDetail, z);
        }
    }

    public static /* synthetic */ void e(kon konVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd0af82", new Object[]{konVar, jSONObject});
        } else {
            konVar.k0(jSONObject);
        }
    }

    public static /* synthetic */ void f(kon konVar, IDataService iDataService, MtopResponse mtopResponse, MediaMixContentDetail mediaMixContentDetail, boolean z, long j2, sv2 sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba09271a", new Object[]{konVar, iDataService, mtopResponse, mediaMixContentDetail, new Boolean(z), new Long(j2), sv2Var});
        } else {
            konVar.F(iDataService, mtopResponse, mediaMixContentDetail, z, j2, sv2Var);
        }
    }

    public static /* synthetic */ sv2 g(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("877c829d", new Object[]{konVar});
        }
        return konVar.u;
    }

    public static /* synthetic */ sv2 h(kon konVar, sv2 sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("536db0ed", new Object[]{konVar, sv2Var});
        }
        konVar.u = sv2Var;
        return sv2Var;
    }

    public static /* synthetic */ sv2 i(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("167842a1", new Object[]{konVar});
        }
        return konVar.v;
    }

    public static /* synthetic */ sv2 j(kon konVar, sv2 sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sv2) ipChange.ipc$dispatch("5e2a1cf1", new Object[]{konVar, sv2Var});
        }
        konVar.v = sv2Var;
        return sv2Var;
    }

    public static /* synthetic */ void k(kon konVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad727747", new Object[]{konVar, str});
        } else {
            konVar.d0(str);
        }
    }

    public static /* synthetic */ void l(kon konVar, boolean z, int i2, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4eea90", new Object[]{konVar, new Boolean(z), new Integer(i2), mtopResponse});
        } else {
            konVar.c0(z, i2, mtopResponse);
        }
    }

    public static /* synthetic */ void m(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35a958fb", new Object[]{konVar});
        } else {
            konVar.R();
        }
    }

    public static /* synthetic */ void n(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d9a341a", new Object[]{konVar});
        } else {
            konVar.S();
        }
    }

    public static /* synthetic */ int o(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a58b0f2c", new Object[]{konVar})).intValue();
        }
        return konVar.d;
    }

    public static /* synthetic */ boolean p(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd7bea5c", new Object[]{konVar})).booleanValue();
        }
        return konVar.p;
    }

    public static /* synthetic */ boolean q(kon konVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4119d82", new Object[]{konVar, new Boolean(z)})).booleanValue();
        }
        konVar.p = z;
        return z;
    }

    public static /* synthetic */ String r(kon konVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f79f30c1", new Object[]{konVar, str});
        }
        konVar.q = str;
        return str;
    }

    public static /* synthetic */ boolean s(kon konVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d5da09a", new Object[]{konVar})).booleanValue();
        }
        return konVar.m;
    }

    public static /* synthetic */ boolean t(kon konVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3066af04", new Object[]{konVar, new Boolean(z)})).booleanValue();
        }
        konVar.m = z;
        return z;
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("993fa4d5", new Object[]{this});
        }
        return this.c;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee1a0884", new Object[]{this});
        }
        return this.h;
    }

    public long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76844038", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public Map<String, Object> D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3c695056", new Object[]{this});
        }
        return this.x;
    }

    public Map<String, Object> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("803efbb1", new Object[]{this});
        }
        return this.y;
    }

    public final void G(h hVar) {
        MultiRecyclerViewAdapter mediaCardListAdapter;
        RecyclerFooterViewHolder l0;
        int i2;
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7453f0a", new Object[]{this, hVar});
            return;
        }
        ir9.b("IRecommendRequestManager", "hideLoadingMore");
        IFeedsListService iFeedsListService = (IFeedsListService) this.f22804a.getService(IFeedsListService.class);
        if (iFeedsListService != null && (mediaCardListAdapter = iFeedsListService.getMediaCardListAdapter()) != null && (l0 = mediaCardListAdapter.l0()) != null) {
            if (!l0.c0()) {
                ir9.b("IRecommendRequestManager", "hideLoadingMore 返回刷新 且 无loading时，不处理");
                return;
            }
            IpChange ipChange2 = RecyclerFooterViewHolder.$ipChange;
            if (hVar == null) {
                i2 = RecyclerFooterViewHolder.k;
            } else if (!hVar.g) {
                i2 = RecyclerFooterViewHolder.j;
            } else {
                i2 = 0;
            }
            RecyclerFooterViewHolder l02 = iFeedsListService.getMediaCardListAdapter().l0();
            if (hVar == null) {
                str = null;
            } else {
                str = hVar.h;
            }
            l02.f0(i2, str);
            int findLastVisibleItemPosition = iFeedsListService.getLayoutManager().findLastVisibleItemPosition();
            if (hVar == null || !hVar.g) {
                findLastVisibleItemPosition--;
            }
            iFeedsListService.smoothScrollToPosition(findLastVisibleItemPosition);
            StringBuilder sb = new StringBuilder("hideLoadingMore requestForCommendData onCall 收起 loading footer, smoothScrollToPosition:");
            sb.append(findLastVisibleItemPosition);
            sb.append("; has target:");
            if (hVar != null) {
                z = true;
            }
            sb.append(z);
            ir9.b("IRecommendRequestManager", sb.toString());
        }
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de829217", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60df62c9", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2ac832", new Object[]{this})).booleanValue();
        }
        return this.k;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0a514f8", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b47f59d5", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8956490", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3ac3ed0", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fcc931d", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public void P() {
        int f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("642ed0ac", new Object[]{this});
            return;
        }
        ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.mLoadMoreRunnable postLoadDownRunnable");
        i iVar = this.t;
        if (iVar != null) {
            this.b.removeCallbacks(iVar);
        }
        this.t = new i(null);
        if (((ICollectionService) this.f22804a.getService(ICollectionService.class)).isCollectionScene() && (f2 = nz3.f(((IDataService) this.f22804a.getService(IDataService.class)).getMediaSetList())) > 0) {
            this.t.e(f2);
        }
        this.b.post(this.t);
    }

    public void Q() {
        int h2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b46a5", new Object[]{this});
            return;
        }
        j jVar = this.s;
        if (jVar != null) {
            this.b.removeCallbacks(jVar);
        }
        this.s = new j(null);
        if (((ICollectionService) this.f22804a.getService(ICollectionService.class)).isCollectionScene() && (h2 = nz3.h(((IDataService) this.f22804a.getService(IDataService.class)).getMediaSetList())) > 1) {
            this.s.d(h2);
        }
        this.b.post(this.s);
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605c71eb", new Object[]{this});
        } else if (this.t != null) {
            ir9.b("IRecommendRequestManager", "MSG_REQUEST_RECOMMEND removeLoadMoreCallback，移除加载更多callback");
            this.b.removeCallbacks(this.t);
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb986eb1", new Object[]{this});
        } else if (this.s != null) {
            ir9.b("IRecommendRequestManager", "MSG_REQUEST_RECOMMEND removeLoadupCallback，移除向上加载callback");
            this.b.removeCallbacks(this.s);
        }
    }

    public void T(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d973fbf1", new Object[]{this, new Boolean(z)});
        } else if (z) {
            S();
        } else {
            R();
        }
    }

    public void U(d5n d5nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeb1baa5", new Object[]{this, d5nVar});
        } else {
            ((IContainerService) this.f22804a.getService(IContainerService.class)).refreshWithCallback(d5nVar);
        }
    }

    public void W(boolean z, int i2, Map map, sv2<h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78920b5b", new Object[]{this, new Boolean(z), new Integer(i2), map, sv2Var});
            return;
        }
        ir9.b("IRecommendRequestManager", "H5分页合集请求的剧集" + i2 + "istop:" + z);
        if (z) {
            j jVar = new j(sv2Var);
            jVar.d(i2 + 1);
            this.b.post(jVar);
            return;
        }
        i iVar = new i(sv2Var);
        iVar.f(map);
        iVar.e(i2 - 1);
        this.b.post(iVar);
    }

    public void X(boolean z, Map map, sv2<h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65431a54", new Object[]{this, new Boolean(z), map, sv2Var});
            return;
        }
        T(z);
        if (z) {
            this.b.post(new j(sv2Var));
            return;
        }
        i iVar = new i(sv2Var);
        iVar.f(map);
        this.b.post(iVar);
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e36a342", new Object[]{this});
            return;
        }
        this.p = false;
        this.q = "";
        this.m = false;
        this.n = "";
    }

    public void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d802c77", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void a0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75aa741c", new Object[]{this, new Boolean(z)});
        } else {
            this.r = z;
        }
    }

    public void b0(boolean z, boolean z2) {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c388fa3e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData setLoadingState isloading=" + z2 + ", isUp=" + z);
        if (z) {
            this.l = z2;
            this.b.removeCallbacks(this.z);
        } else {
            this.k = z2;
            this.b.removeCallbacks(this.A);
        }
        if (z2) {
            Handler handler = this.b;
            if (z) {
                runnable = this.z;
            } else {
                runnable = this.A;
            }
            handler.postDelayed(runnable, 10000L);
        }
    }

    public final void c0(boolean z, int i2, MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("627c732c", new Object[]{this, new Boolean(z), new Integer(i2), mtopResponse});
        } else if (!z) {
            this.g = i2;
            if (mtopResponse != null) {
                str = mtopResponse.getRetCode();
            } else {
                str = null;
            }
            this.h = str;
        }
    }

    public final void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f286b141", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final void e0(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70342474", new Object[]{this, new Long(j2)});
        } else {
            this.e = j2;
        }
    }

    public final void f0(IDataService iDataService, MediaMixContentDetail mediaMixContentDetail, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("421b68b7", new Object[]{this, iDataService, mediaMixContentDetail, new Boolean(z)});
        } else if (mediaMixContentDetail != null && !sz3.b(mediaMixContentDetail.transmission)) {
            if (z) {
                iDataService.setTransmissionUp(mediaMixContentDetail.transmission);
            } else {
                iDataService.setTransmission(mediaMixContentDetail.transmission);
            }
        }
    }

    public void g0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ff92f8", new Object[]{this, map});
        } else {
            this.x = map;
        }
    }

    public void h0(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69391dd", new Object[]{this, map});
        } else {
            this.y = map;
        }
    }

    public final void i0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e02a2c36", new Object[]{this, jSONObject});
        } else {
            this.f = jSONObject;
        }
    }

    public void j0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb62578", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = this.f;
            if (jSONObject2 == null) {
                i0(jSONObject);
            } else {
                jSONObject2.putAll(jSONObject);
            }
        }
    }

    public final void k0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef830c94", new Object[]{this, jSONObject});
            return;
        }
        Object e2 = vt6.e(jSONObject, "data", "grayParamsSession");
        if (e2 instanceof Map) {
            g2e trackTint = ((ITrackService) this.f22804a.getService(ITrackService.class)).getTrackTint();
            for (Map.Entry entry : ((Map) e2).entrySet()) {
                trackTint.d((String) entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
    }

    public int v() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55cb555a", new Object[]{this})).intValue();
        }
        a.d currentMediaDetail = ((IDataService) this.f22804a.getService(IDataService.class)).getCurrentMediaDetail();
        if (!(currentMediaDetail == null || (jSONObject = currentMediaDetail.d) == null || (jSONObject2 = (JSONObject) jSONObject.get("extraData")) == null || jSONObject2.get("collectionData") == null)) {
            this.w = nwv.t(((JSONObject) jSONObject2.get("collectionData")).get("count"), -1);
        }
        return this.w;
    }

    public boolean w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06616e6", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            return this.l;
        }
        return this.k;
    }

    public String x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f44e9e4", new Object[]{this});
        }
        return this.n;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94bb6349", new Object[]{this});
        }
        return this.q;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15258af7", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public final void F(IDataService iDataService, MtopResponse mtopResponse, MediaMixContentDetail mediaMixContentDetail, boolean z, long j2, sv2<h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31358dfd", new Object[]{this, iDataService, mtopResponse, mediaMixContentDetail, new Boolean(z), new Long(j2), sv2Var});
            return;
        }
        ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData PickPreloadControllerNew,推荐接口，推荐视频为空");
        if (!iDataService.canLoopOnceRequestRecommend() || this.m) {
            h1u.c(this.f22804a.getContext(), "推荐视频为空");
            s0j.t(this.f22804a, mtopResponse, j2, false);
            if (sv2Var != null) {
                sv2Var.a(null);
            }
            c0(z, 3, mtopResponse);
            return;
        }
        iDataService.setLoopOnceRequestRecommend(false);
        ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData needLoopRecommendRequest,推荐接口，轮询一次请求");
        iDataService.requestList(z, null, sv2Var);
    }

    public final IMTOPRequest u(boolean z, boolean z2, String str, aon aonVar, boolean z3) {
        int i2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("2cb4289b", new Object[]{this, new Boolean(z), new Boolean(z2), str, aonVar, new Boolean(z3)});
        }
        pep sessionParams = ((ISceneConfigService) this.f22804a.getService(ISceneConfigService.class)).getSessionParams();
        String str3 = sessionParams.h;
        if (TextUtils.isEmpty(str3)) {
            str3 = "{}";
        }
        if (z) {
            this.j++;
        } else {
            this.i++;
        }
        FluidContext fluidContext = this.f22804a;
        String j2 = aonVar.j();
        if (z) {
            i2 = this.j;
        } else {
            i2 = this.i;
        }
        if (TextUtils.isEmpty(sessionParams.i)) {
            str2 = "0";
        } else {
            str2 = sessionParams.i;
        }
        return jwi.d(fluidContext, sessionParams, str, j2, str3, i2, str2, z2, z3);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends jrf<MediaMixContentDetailResponse> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f22808a;
        public final /* synthetic */ pep b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ IDataService d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ int f;
        public final /* synthetic */ t19.b g;
        public final /* synthetic */ int h;
        public final /* synthetic */ sv2 i;
        public final /* synthetic */ int j;

        public d(long j, pep pepVar, boolean z, IDataService iDataService, boolean z2, int i, t19.b bVar, int i2, sv2 sv2Var, int i3) {
            this.f22808a = j;
            this.b = pepVar;
            this.c = z;
            this.d = iDataService;
            this.e = z2;
            this.f = i;
            this.g = bVar;
            this.h = i2;
            this.i = sv2Var;
            this.j = i3;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/data/request/recommend/RecommendRequestManager$4");
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            String str;
            String str2;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f22808a;
            ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData onError推荐接口失败; getMtopStat:" + mtopResponse.getMtopStat());
            String str4 = "";
            if (mtopResponse.getMtopStat() != null) {
                str3 = mtopResponse.getMtopStat().eagleEyeTraceId;
                str2 = String.valueOf(mtopResponse.getMtopStat().statusCode);
                str = mtopResponse.getMtopStat().retCode;
            } else {
                str3 = str4;
                str2 = null;
                str = null;
            }
            boolean z = currentTimeMillis < 1000;
            StringBuilder sb = new StringBuilder("[dataRequest]fetchRecommend_back_info;status_false;fast_");
            sb.append(z);
            sb.append(";traceId_");
            sb.append(str3);
            sb.append(";cost_");
            sb.append(currentTimeMillis);
            sb.append(";statusCode_");
            sb.append(str2);
            sb.append(";retCode_");
            sb.append(str);
            sb.append(";source_");
            pep pepVar = this.b;
            if (pepVar != null) {
                str4 = pepVar.c;
            }
            sb.append(str4);
            sb.append(";isDynamic_");
            sb.append(this.c);
            sb.append(";dataSize_0");
            ir9.b("IRecommendRequestManager", sb.toString());
            this.d.setLoopOnceRequestRecommend(false);
            kon.this.b0(this.e, false);
            s0j.t(kon.b(kon.this), mtopResponse, this.f22808a, false);
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.N(kon.b(kon.this), "rec_mtop_error", mtopResponse, System.currentTimeMillis() - this.f22808a, this.f, this.d.getRecommendRequestId());
            kon.k(kon.this, null);
            s19.j(true, this.g, mtopResponse);
            if (this.d.getCurrentDetailSuccessMtopId() != this.h) {
                ir9.b("IRecommendRequestManager", "PickPreloadControllerNew discard requestForCommendData onError detailMtopId" + this.h + "mCurrentDetailSuccessMtopId" + this.d.getCurrentDetailSuccessMtopId());
                this.i.a(new g(mtopResponse.getRetCode()));
                kon.l(kon.this, this.e, 1, mtopResponse);
                return;
            }
            this.i.a(new g(mtopResponse.getRetCode()));
            kon.l(kon.this, this.e, 2, mtopResponse);
        }

        /* renamed from: c */
        public void b(MtopResponse mtopResponse, JSONObject jSONObject, MediaMixContentDetailResponse mediaMixContentDetailResponse) {
            String str;
            String str2;
            String str3;
            int i;
            boolean z;
            T t;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4c54449", new Object[]{this, mtopResponse, jSONObject, mediaMixContentDetailResponse});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.f22808a;
            ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back，onSuccess推荐接口成功 cost=" + currentTimeMillis + "; getMtopStat:" + mtopResponse.getMtopStat());
            MediaMixContentDetailResponse a2 = (jSONObject == null || mediaMixContentDetailResponse != null) ? mediaMixContentDetailResponse : hrl.a(jSONObject);
            String str4 = "";
            if (mtopResponse.getMtopStat() != null) {
                str3 = mtopResponse.getMtopStat().eagleEyeTraceId;
                str2 = String.valueOf(mtopResponse.getMtopStat().statusCode);
                str = mtopResponse.getMtopStat().retCode;
            } else {
                str3 = str4;
                str2 = null;
                str = null;
            }
            boolean z2 = currentTimeMillis < 1000;
            if (a2 == null || (t = a2.data) == 0) {
                z = false;
                i = 0;
            } else {
                List<MediaContentDetailData> list = ((MediaMixContentDetail) t).list;
                i = list != null ? list.size() : 0;
                z = ((MediaMixContentDetail) a2.data).isBackUp;
            }
            StringBuilder sb = new StringBuilder("[dataRequest]fetchRecommend_back_info;status_true;fast_");
            sb.append(z2);
            sb.append(";traceId_");
            sb.append(str3);
            sb.append(";cost_");
            sb.append(currentTimeMillis);
            sb.append(";statusCode_");
            sb.append(str2);
            sb.append(";retCode_");
            sb.append(str);
            sb.append(";source_");
            pep pepVar = this.b;
            if (pepVar != null) {
                str4 = pepVar.c;
            }
            sb.append(str4);
            sb.append(";isBackup_");
            sb.append(z);
            sb.append(";isDynamic_");
            sb.append(this.c);
            sb.append(";dataSize_");
            sb.append(i);
            ir9.b("IRecommendRequestManager", sb.toString());
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.T(kon.b(kon.this), "rec_mtop_end", mtopResponse, System.currentTimeMillis() - this.f22808a, this.f, this.d.getRecommendRequestId());
            kon.k(kon.this, null);
            kon.this.b0(this.e, false);
            kon.m(kon.this);
            kon.n(kon.this);
            boolean canLoopOnceRequestRecommend = this.d.canLoopOnceRequestRecommend();
            if (ws6.a() && canLoopOnceRequestRecommend && kon.o(kon.this) != this.j) {
                ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back，请求前和请求后的MtopId不一致，响应后续的请求，当前请求结果被舍弃，" + this.j + "，mCurrentRecommendMtopId:" + kon.o(kon.this));
                kon.l(kon.this, this.e, 1, mtopResponse);
            } else if (this.d.getCurrentDetailSuccessMtopId() != this.h) {
                ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back，detailMtopId不一致，舍弃当前请求。 detailMtopId=" + this.h + "mCurrentDetailSuccessMtopId=" + this.d.getCurrentDetailSuccessMtopId());
                this.i.a(null);
                kon.l(kon.this, this.e, 1, mtopResponse);
            } else if (a2 == null || a2.data == 0) {
                ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back，接口返回空null");
                h1u.c(kon.b(kon.this).getContext(), "推荐失败");
                s0j.t(kon.b(kon.this), mtopResponse, this.f22808a, false);
                s19.j(true, this.g, mtopResponse);
                this.i.a(null);
                kon.l(kon.this, this.e, 2, mtopResponse);
            } else {
                s19.j(false, this.g, mtopResponse);
                MediaMixContentDetail mediaMixContentDetail = (MediaMixContentDetail) a2.data;
                if (this.e) {
                    kon.q(kon.this, Boolean.parseBoolean(mediaMixContentDetail.noMoreData));
                    kon.r(kon.this, mediaMixContentDetail.noMoreMsg);
                } else {
                    kon.t(kon.this, Boolean.parseBoolean(mediaMixContentDetail.noMoreData));
                    kon.c(kon.this, mediaMixContentDetail.noMoreMsg);
                }
                this.d.getConfig().j().p(mediaMixContentDetail.edgeComputeConfig);
                JSONArray d = vt6.d(jSONObject, "data", "sectionList");
                List<MediaContentDetailData> list2 = mediaMixContentDetail.pitList;
                JSONArray d2 = vt6.d(jSONObject, "data", "pitList");
                h hVar = new h(mediaMixContentDetail.config, mediaMixContentDetail.list, d, list2, d2);
                StringBuilder sb2 = new StringBuilder("[dataRequest]requestForCommendData back,isUp=");
                sb2.append(this.e);
                sb2.append(", mixcontent.noMoreData=");
                sb2.append(mediaMixContentDetail.noMoreData);
                sb2.append(", mixcontent.noMoreMsg=");
                sb2.append(mediaMixContentDetail.noMoreMsg);
                sb2.append(", listsize=");
                List<MediaContentDetailData> list3 = mediaMixContentDetail.list;
                Object obj = "null";
                sb2.append(list3 != null ? Integer.valueOf(list3.size()) : obj);
                sb2.append(", arraysize=");
                sb2.append(d != null ? Integer.valueOf(d.size()) : obj);
                sb2.append(", , pitList=");
                sb2.append(list2 != null ? Integer.valueOf(list2.size()) : obj);
                sb2.append(", , pitArray=");
                if (d2 != null) {
                    obj = Integer.valueOf(d2.size());
                }
                sb2.append(obj);
                ir9.b("IRecommendRequestManager", sb2.toString());
                ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back,dataList=" + mediaMixContentDetail.list);
                ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back,pitList=" + list2);
                kon.d(kon.this, this.d, mediaMixContentDetail, this.e);
                kon.e(kon.this, jSONObject);
                if (hVar.c() || hVar.d()) {
                    this.d.setLoopOnceRequestRecommend(false);
                    this.i.a(hVar);
                    if (hVar.b()) {
                        kon.l(kon.this, this.e, 3, mtopResponse);
                    } else {
                        kon.l(kon.this, this.e, 5, mtopResponse);
                    }
                    s0j.t(kon.b(kon.this), mtopResponse, this.f22808a, true);
                    return;
                }
                ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData back，接口返回空数据");
                kon.f(kon.this, this.d, mtopResponse, mediaMixContentDetail, this.e, this.f22808a, this.i);
            }
        }
    }

    public void V(boolean z, boolean z2, boolean z3, int i2, String str, aon aonVar, sv2<h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dcede", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i2), str, aonVar, sv2Var});
        } else if (pto.o(this.f22804a)) {
            ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData return isShopLoft=true");
            sv2Var.a(null);
        } else if (!((IDataService) this.f22804a.getService(IDataService.class)).getLoadingState(z) || ((ICollectionService) this.f22804a.getService(ICollectionService.class)).isCollectionScene()) {
            b0(z, true);
            pep sessionParams = ((ISceneConfigService) this.f22804a.getService(ISceneConfigService.class)).getSessionParams();
            if (aonVar != null) {
                aonVar.q();
                aonVar.i();
                aonVar.t();
                aonVar.n(this.f22804a);
                aonVar.l(this.f22804a);
                if (z2 && cp2.d(this.f22804a)) {
                    aonVar.f();
                }
                if (cp2.e(sessionParams)) {
                    aonVar.m();
                }
                if (ws6.k()) {
                    aonVar.o();
                }
                aonVar.w(this.f22804a);
                aonVar.r(this.f22804a);
                JSONObject jSONObject = this.f;
                if (jSONObject != null) {
                    aonVar.e(jSONObject);
                }
                aonVar.d(this.f22804a);
                if (i2 >= 0) {
                    aonVar.b(i2);
                }
            }
            boolean z4 = ws6.i() && !z3;
            IMTOPRequest u = u(z, z2, str, aonVar, z4);
            int n = ws6.n();
            d0(UUID.randomUUID().toString() + "_" + System.currentTimeMillis());
            e0(System.currentTimeMillis());
            com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.Q(this.f22804a, "rec_mtop_start", u.getApi(), n, ((IDataService) this.f22804a.getService(IDataService.class)).getRecommendRequestId());
            t19.b u2 = s19.u(this.f22804a);
            int i3 = this.d + 1;
            this.d = i3;
            IDataService iDataService = (IDataService) this.f22804a.getService(IDataService.class);
            int currentDetailSuccessMtopId = iDataService.getCurrentDetailSuccessMtopId();
            long currentTimeMillis = System.currentTimeMillis();
            ir9.b("IRecommendRequestManager", "[dataRequest]requestForCommendData.推荐接口开始请求... isDynamicRecommend=" + z3 + "; requestArgs:" + u);
            d dVar = new d(currentTimeMillis, sessionParams, z3, iDataService, z, n, u2, currentDetailSuccessMtopId, sv2Var, i3);
            e eVar = new e(this);
            HashMap hashMap = new HashMap();
            hashMap.put("asac", k1k.ASAC_VALUE);
            a.b s = a.b.m().s(u);
            if (!z4) {
                hashMap = null;
            }
            FluidSDK.getMTopAdapter().send(s.v(hashMap).k(dVar).r(eVar).u("rec").p(n == 2).l(MediaMixContentDetailResponse.class).q(new f(this, u2)).j());
            iDataService.getDetailUnlikeRecorder().a();
        } else {
            ir9.b("IRecommendRequestManager", "VideoProcess PublicCardListController.requestForCommendData return isloading=true, isUp=" + z);
            h hVar = new h(null, null, null, null, null);
            hVar.f = true;
            sv2Var.a(hVar);
        }
    }
}
