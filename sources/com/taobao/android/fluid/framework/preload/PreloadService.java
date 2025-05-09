package com.taobao.android.fluid.framework.preload;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.DefaultFluidInstance;
import com.taobao.android.fluid.framework.preload.PreloadService;
import com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance;
import com.taobao.android.fluid.framework.preload.task.IPreloadTask;
import com.taobao.android.fluid.framework.preload.task.IconStreamPreloadTask;
import com.taobao.android.fluid.framework.preload.weex.IPreloadWeexService;
import java.util.HashMap;
import tb.a7m;
import tb.aps;
import tb.ar9;
import tb.atb;
import tb.bps;
import tb.e9b;
import tb.f21;
import tb.grm;
import tb.hrm;
import tb.i23;
import tb.igs;
import tb.ir9;
import tb.ntm;
import tb.nwv;
import tb.ono;
import tb.p7k;
import tb.ptm;
import tb.r8e;
import tb.ryr;
import tb.s0j;
import tb.sv2;
import tb.t2o;
import tb.t7b;
import tb.usm;
import tb.vaj;
import tb.xse;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PreloadService implements IPreloadService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INACTIVE_CROWD = "inactive_crowd";
    private static final String TAG = "PreloadInstanceService";
    private boolean cancelPreload;
    private IPreloadTask mCurrentInactivePreloadTask;
    private IPreloadTask mCurrentPreloadTask;
    private final FluidContext mFluidContext;
    private PreRenderDWInstance mPreRenderDWInstance;
    private ntm mPreloadVideoData;
    private grm mPreloadABConfig = new grm(null);
    public long preloadPlayerCacheElapsedTime = -1;
    public boolean isPlayerCacheValid = false;
    private String preloadTaskHistroy = "";
    private sv2<ntm> cancelCallback = new d();
    private ptm mPreloadVideoTracker = new ptm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements sv2<ntm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: b */
        public void a(ntm ntmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d92f2e01", new Object[]{this, ntmVar});
            } else {
                PreloadService.access$002(PreloadService.this, ntmVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements sv2<ntm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: b */
        public void a(ntm ntmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d92f2e01", new Object[]{this, ntmVar});
            } else {
                PreloadService.access$002(PreloadService.this, ntmVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f7889a;

        public c(Context context) {
            this.f7889a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            ir9.b(PreloadService.TAG, "[preloadvideo]startRender  preloadPlayerCache startPreloadCacherTime=" + uptimeMillis);
            t7b d = a7m.d(this.f7889a);
            if (d != null) {
                PreloadService.this.isPlayerCacheValid = d.D();
            }
            PreloadService.this.preloadPlayerCacheElapsedTime = SystemClock.uptimeMillis() - uptimeMillis;
            ir9.b(PreloadService.TAG, "[preloadvideo][stagecost]proxyCacheServer cost=" + PreloadService.this.preloadPlayerCacheElapsedTime + "; isPlayerCacheValid=" + PreloadService.this.isPlayerCacheValid);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements sv2<ntm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: b */
        public void a(ntm ntmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d92f2e01", new Object[]{this, ntmVar});
            } else {
                PreloadService.access$002(PreloadService.this, ntmVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        void a(int i);
    }

    static {
        t2o.a(468714624);
        t2o.a(468714620);
    }

    public PreloadService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    public static /* synthetic */ ntm access$002(PreloadService preloadService, ntm ntmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("84e27049", new Object[]{preloadService, ntmVar});
        }
        preloadService.mPreloadVideoData = ntmVar;
        return ntmVar;
    }

    private void cancelCurrentPreloadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92aac516", new Object[]{this});
            return;
        }
        IPreloadTask iPreloadTask = this.mCurrentPreloadTask;
        if (iPreloadTask != null && !(iPreloadTask instanceof i23) && iPreloadTask.getPreloadVideoData() == null) {
            this.mCurrentPreloadTask.a(this.mPreloadVideoData, this.cancelCallback);
        }
        this.cancelPreload = true;
    }

    private ntm doPreRender(FluidInstance fluidInstance, Context context, ViewGroup viewGroup, Uri uri, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("df3a0a84", new Object[]{this, fluidInstance, context, viewGroup, uri, new Boolean(z)});
        }
        if (!(context instanceof Activity) || uri == null) {
            StringBuilder sb = new StringBuilder("createDWInstance执行完executePreRender后preloadVideoData:");
            ntm ntmVar = this.mPreloadVideoData;
            if (ntmVar != null) {
                str = ntmVar.toString();
            } else {
                str = null;
            }
            sb.append(str);
            ir9.b(TAG, sb.toString());
            return null;
        }
        cancelCurrentPreloadTask();
        PreRenderDWInstance h = new PreRenderDWInstance.f().j(context).l(z).i(viewGroup).o(uri).m(getPreloadABConfig()).n(this.mPreloadVideoData).k(fluidInstance).h();
        this.mPreRenderDWInstance = h;
        return h.executePreRender();
    }

    private boolean isVideoTab(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20a119a1", new Object[]{this, fluidContext})).booleanValue();
        }
        String tabId = fluidContext.getInstanceConfig().getTabId();
        ir9.b(TAG, "attachGlobalVCH5 tab3CardType=" + tabId + ",hashcode=" + hashCode());
        return "video".equalsIgnoreCase(tabId);
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void clearMemoryData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01a16ff", new Object[]{this});
            return;
        }
        ir9.b(TAG, "clearMemoryData");
        if (!usm.d()) {
            this.mPreloadVideoData = null;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void clearPreloadTaskForContext(FluidInstance fluidInstance, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c580fc", new Object[]{this, fluidInstance, context});
            return;
        }
        IPreloadTask iPreloadTask = this.mCurrentPreloadTask;
        if (iPreloadTask != null && iPreloadTask.getContext() == context) {
            ir9.b(TAG, "clearPreloadTaskForContext: " + this.mCurrentPreloadTask);
            this.mCurrentPreloadTask.a(this.mPreloadVideoData, this.cancelCallback);
            this.mCurrentPreloadTask = null;
            this.mPreloadVideoData = null;
        }
        IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) fluidInstance.getService(IPreloadWeexService.class);
        if (iPreloadWeexService != null) {
            iPreloadWeexService.onDestroyService();
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public IPreloadTask getCurrentPreloadTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadTask) ipChange.ipc$dispatch("f76ee773", new Object[]{this});
        }
        return this.mCurrentPreloadTask;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public r8e getPreLoadVideoCommentSizeObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("7b1426ad", new Object[]{this});
        }
        PreRenderDWInstance preRenderDWInstance = this.mPreRenderDWInstance;
        if (preRenderDWInstance != null) {
            return preRenderDWInstance.getVideoCommentSizeObject();
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public PreRenderDWInstance getPreRenderDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreRenderDWInstance) ipChange.ipc$dispatch("77063b7a", new Object[]{this});
        }
        return this.mPreRenderDWInstance;
    }

    public grm getPreloadABConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (grm) ipChange.ipc$dispatch("a340840", new Object[]{this});
        }
        return this.mPreloadABConfig;
    }

    public atb getPreloadDWInstance(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("d8d1d667", new Object[]{this, fluidContext});
        }
        ntm preloadedVideo = getPreloadedVideo();
        if (preloadedVideo != null) {
            return preloadedVideo.f24942a;
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public ntm getPreloadVideoData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("d066531a", new Object[]{this});
        }
        return this.mPreloadVideoData;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public ptm getPreloadVideoTrackerManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ptm) ipChange.ipc$dispatch("c796642", new Object[]{this});
        }
        return this.mPreloadVideoTracker;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public ntm getPreloadedVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("ced805c3", new Object[]{this});
        }
        if (isVideoTab(this.mFluidContext)) {
            return this.mPreloadVideoData;
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public boolean isInactiveUnexposedCacheVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b3012f6", new Object[]{this})).booleanValue();
        }
        return this.mCurrentInactivePreloadTask instanceof xse;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isPreloadedVideoAdded(com.taobao.android.fluid.core.FluidContext r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.fluid.framework.preload.PreloadService.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "9e3fc980"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            tb.atb r6 = r5.getPreloadDWInstance(r6)
            if (r6 == 0) goto L_0x0048
            android.view.ViewGroup r6 = r6.getView()
            if (r6 == 0) goto L_0x0048
            com.taobao.android.fluid.framework.preload.dwinstance.PreRenderDWInstance r2 = r5.mPreRenderDWInstance
            if (r2 == 0) goto L_0x0031
            android.view.ViewGroup r2 = r2.getPreloadVideoviewContainer()
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            android.view.ViewParent r6 = r6.getParent()
        L_0x0036:
            boolean r3 = r6 instanceof com.taobao.tao.flexbox.layoutmanager.core.TNodeView
            if (r3 != 0) goto L_0x0043
            if (r6 == r2) goto L_0x0043
            if (r6 == 0) goto L_0x0043
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0036
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.preload.PreloadService.isPreloadedVideoAdded(com.taobao.android.fluid.core.FluidContext):boolean");
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    public void resetPreloadTaskHistroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1e70f22", new Object[]{this});
        } else {
            this.preloadTaskHistroy = "";
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void setPreloadABConfig(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc67f", new Object[]{this, jSONObject});
            return;
        }
        this.mPreloadABConfig = new grm(jSONObject);
        hrm.a().c(jSONObject);
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void startWarmUp(FluidInstance fluidInstance, final Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86c48210", new Object[]{this, fluidInstance, context, uri});
            return;
        }
        ir9.b(TAG, "start warm up in preloadService");
        ryr.b(context, null, "warmup_in_preloadService");
        if (!aps.b() && (fluidInstance instanceof DefaultFluidInstance)) {
            ir9.b(TAG, "预创建fluid实例、服务");
            ((DefaultFluidInstance) fluidInstance).tryCreateRemoteService();
        }
        if (!aps.f() && (aps.x() || aps.w())) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: tb.psm
                @Override // java.lang.Runnable
                public final void run() {
                    PreloadService.lambda$startWarmUp$0(context);
                }
            });
        }
        ryr.d(context, null, "warmup_in_preloadService", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startWarmUp$0(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a012dd0", new Object[]{context});
            return;
        }
        if (aps.x()) {
            ir9.b(TAG, "warm up player so in preloadService");
            try {
                z = TaobaoMediaPlayer.IsLoadLibrariesOnce();
            } catch (Exception unused) {
            }
            boolean isLibLoaded = TaobaoMediaPlayer.isLibLoaded();
            HashMap hashMap = new HashMap();
            hashMap.put("hasLoadSoRuned", Boolean.valueOf(z));
            hashMap.put("hasSoLoaded", Boolean.valueOf(isLibLoaded));
            ryr.b(context, null, "loadLibrariesOnce");
            TaobaoMediaPlayer.loadLibrariesOnce(null);
            ryr.d(context, null, "loadLibrariesOnce", hashMap);
            ir9.b(TAG, "end warm up player so in preloadService,hasLoadSoRuned:" + z + ",hasSoLoaded:" + isLibLoaded);
        }
        if (aps.w()) {
            a7m.d(context);
            ir9.b(TAG, "warm up player cache server in preloadService");
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void doPreload(FluidInstance fluidInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("760d483d", new Object[]{this, fluidInstance, context, jSONObject});
            return;
        }
        ir9.b(TAG, "[preloadvideo]execute preload task " + this.mCurrentPreloadTask);
        this.mPreloadVideoTracker.c(this.mFluidContext);
        if (context != null && jSONObject != null) {
            int t = nwv.t(jSONObject.get("type"), 1);
            if ((getPreloadABConfig().f20182a || t == 10) && !this.cancelPreload) {
                IPreloadTask iPreloadTask = this.mCurrentPreloadTask;
                if (iPreloadTask != null) {
                    if (iPreloadTask.b(jSONObject)) {
                        ir9.b(TAG, "same preloadArgs return");
                        return;
                    }
                    this.mCurrentPreloadTask.a(this.mPreloadVideoData, this.cancelCallback);
                }
                IPreloadTask createPreloadTask = createPreloadTask(fluidInstance, context, jSONObject);
                this.mCurrentPreloadTask = createPreloadTask;
                if (createPreloadTask != null) {
                    ryr.b(context, null, "gg_pickpreload_type");
                    this.preloadTaskHistroy += this.mCurrentPreloadTask.getType() + "_" + System.currentTimeMillis() + "-";
                    this.mCurrentPreloadTask.c(new a());
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("type", Integer.valueOf(this.mCurrentPreloadTask.getType()));
                    hashMap.put("redpointExpired", Boolean.valueOf(nwv.o(jSONObject.get("isRedPointExpired"), false)));
                    hashMap.put("preloadTaskHistory", this.preloadTaskHistroy);
                    ryr.d(context, null, "gg_pickpreload_type", hashMap);
                } else {
                    FluidException.throwException(this.mFluidContext, ar9.PRELOAD_SERVICE_CREATE_PRELOAD_TASK_IS_NULL);
                }
                ir9.b(TAG, "[preloadvideo]execute preload task " + this.mCurrentPreloadTask);
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public void doPreloadForInactive(FluidInstance fluidInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8abac9c5", new Object[]{this, fluidInstance, context, jSONObject});
            return;
        }
        ono.g(context, "inactive_crowd", true);
        if (context != null && jSONObject != null && usm.a(context)) {
            jSONObject.put("type", (Object) 4);
            IPreloadTask createPreloadTask = createPreloadTask(fluidInstance, context, jSONObject);
            this.mCurrentInactivePreloadTask = createPreloadTask;
            if (createPreloadTask != null) {
                ryr.b(context, null, "gg_pickpreload_type");
                this.mCurrentInactivePreloadTask.c(new b());
                HashMap hashMap = new HashMap(1);
                hashMap.put("type", Integer.valueOf(this.mCurrentPreloadTask.getType()));
                ryr.d(context, null, "gg_pickpreload_type", hashMap);
            }
            ir9.b(TAG, "PickPreloadControllerNew，track inactive preload task " + this.mCurrentInactivePreloadTask);
        }
    }

    private IPreloadTask createPreloadTask(FluidInstance fluidInstance, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadTask) ipChange.ipc$dispatch("30a70d9c", new Object[]{this, fluidInstance, context, jSONObject});
        }
        int t = nwv.t(jSONObject.get("type"), 1);
        if (t == 0) {
            return new i23(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (t == 1) {
            return new p7k(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (t == 3) {
            return new IconStreamPreloadTask(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (t == 4) {
            return new xse(fluidInstance, context, jSONObject, this.mPreloadABConfig);
        }
        if (t != 10) {
            return null;
        }
        return new e9b(fluidInstance, context, jSONObject, this.mPreloadABConfig);
    }

    @Override // com.taobao.android.fluid.framework.preload.IPreloadService
    public JSONObject startRender(FluidInstance fluidInstance, Context context, ViewGroup viewGroup, Uri uri, String str, boolean z) {
        boolean z2;
        ntm ntmVar;
        ntm ntmVar2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83bb022f", new Object[]{this, fluidInstance, context, viewGroup, uri, str, new Boolean(z)});
        }
        ir9.b(TAG, "[preloadvideo][stagecost]PreloadService startRender. beforeStartRenderCost=" + (System.currentTimeMillis() - f21.f18953a) + " tabId=" + str + " isColdLaunch=" + z + " uri=" + uri + ", container=" + viewGroup);
        ryr.b(context, null, "gg_videoMutiTab_startRender");
        long currentTimeMillis = System.currentTimeMillis();
        igs.a(s0j.MTS_TASK_START_RENDER);
        this.mPreloadVideoTracker.c(this.mFluidContext);
        if (TextUtils.equals("video", str)) {
            if (usm.j(usm.AB_KEY_OPT_VIDEO_PRELOADCACHE)) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(new c(context));
                z2 = true;
            } else {
                z2 = false;
            }
            ntmVar = doPreRender(fluidInstance, context, viewGroup, uri, z);
            this.mPreloadVideoData = ntmVar;
            IPreloadWeexService iPreloadWeexService = (IPreloadWeexService) fluidInstance.getService(IPreloadWeexService.class);
            if (iPreloadWeexService != null && (ntmVar2 = this.mPreloadVideoData) != null && ntmVar2.r && !TextUtils.isEmpty(ntmVar2.b)) {
                ntm ntmVar3 = this.mPreloadVideoData;
                if (ntmVar3.t != null) {
                    iPreloadWeexService.startRender(context, viewGroup, ntmVar3);
                }
            }
        } else {
            ntmVar = null;
            z2 = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(vaj.KEY_TAB_ID, str);
        if (ntmVar == null) {
            z3 = false;
        }
        hashMap.put("hasPreloadVideoView", Boolean.valueOf(z3));
        hashMap.put("enablePreloadPlayerCache", Boolean.valueOf(z2));
        hashMap.put("preloadPlayerCacheElapsedTime", Long.valueOf(this.preloadPlayerCacheElapsedTime));
        hashMap.put("isPlayerCacheValid", Boolean.valueOf(this.isPlayerCacheValid));
        ryr.d(context, null, "gg_videoMutiTab_startRender", hashMap);
        ir9.b(TAG, "[preloadvideo][stagecost]startRender cost=" + (System.currentTimeMillis() - currentTimeMillis));
        resetPreloadTaskHistroy();
        if (ntmVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bps.RENDER_RESULT_HAS_DW_INSTANCE, (Object) Boolean.valueOf(ntmVar.d()));
            igs.c();
            return jSONObject;
        }
        igs.c();
        return null;
    }
}
