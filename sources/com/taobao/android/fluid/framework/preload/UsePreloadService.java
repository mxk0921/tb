package com.taobao.android.fluid.framework.preload;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.fscrmid.nav.ShotVideoNavProcessor;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.aps;
import tb.atb;
import tb.bbw;
import tb.cnm;
import tb.e0o;
import tb.hrm;
import tb.ir9;
import tb.mfj;
import tb.ntm;
import tb.nwv;
import tb.p91;
import tb.ptm;
import tb.pto;
import tb.qtm;
import tb.r8e;
import tb.s6o;
import tb.t2o;
import tb.usm;
import tb.xau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UsePreloadService implements IUsePreloadService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SERVICE_NAME = "IPreloadService";
    private static final String TAG = "PreloadService";
    private final FluidContext mFluidContext;
    private String mPlayerPlayToken;
    private String mPrePlayerVideoId;
    private long mTab3LauncherPrePlayerStartTime;
    private cnm preLoadManager;
    private boolean mEnableTab3UseCacheData = false;
    private boolean mTab3QuickRender = false;
    private boolean mIsLaunchCodeRequest = false;
    private boolean pauseCalled = false;
    private HashMap<String, String> mTab3CacheTrackParams = new HashMap<>();
    private final usm mPreloadServiceConfig = new usm();

    static {
        t2o.a(468714630);
        t2o.a(468714621);
    }

    public UsePreloadService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
    }

    private boolean isDefaultTab3(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56da60d2", new Object[]{this, fluidContext})).booleanValue();
        }
        if (!pto.g(fluidContext) || !((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f()) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean enableTab3UseCacheData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9fb9411", new Object[]{this})).booleanValue();
        }
        return this.mEnableTab3UseCacheData;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public atb findPreAttachedDWInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("3a5d6310", new Object[]{this});
        }
        ntm findPreAttachedPreloadedVideo = findPreAttachedPreloadedVideo();
        if (findPreAttachedPreloadedVideo != null) {
            return findPreAttachedPreloadedVideo.f24942a;
        }
        return null;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public ntm findPreAttachedPreloadedVideo() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("d77f882b", new Object[]{this});
        }
        try {
            ViewGroup animLayout = ((IContainerService) this.mFluidContext.getService(IContainerService.class)).getAnimLayout();
            if (animLayout == null || (findViewById = animLayout.findViewById(R.id.fluid_sdk_preattach_videoview)) == null) {
                return null;
            }
            return (ntm) findViewById.getTag(R.id.fluid_sdk_tag_preloadVideo);
        } catch (Throwable th) {
            ir9.b("PreloadService", "findPreAttachedPreloadedVideo " + th.getMessage());
            return null;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public ntm findPreloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ntm) ipChange.ipc$dispatch("137208a1", new Object[]{this});
        }
        ntm findPreAttachedPreloadedVideo = findPreAttachedPreloadedVideo();
        if (findPreAttachedPreloadedVideo != null) {
            return findPreAttachedPreloadedVideo;
        }
        return ((IFeedsListService) this.mFluidContext.getService(IFeedsListService.class)).getPreloadVideoData();
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public usm getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (usm) ipChange.ipc$dispatch("25f9c59a", new Object[]{this});
        }
        return this.mPreloadServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public String getPlayerPlayToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("985620ab", new Object[]{this});
        }
        return this.mPlayerPlayToken;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public cnm getPreLoadManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cnm) ipChange.ipc$dispatch("1cca41f4", new Object[]{this});
        }
        return this.preLoadManager;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public HashMap<String, String> getTab3CacheTrackParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("67cc178d", new Object[]{this});
        }
        return this.mTab3CacheTrackParams;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public long getTab3LauncherPrePlayerStartTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("372a6da", new Object[]{this})).longValue();
        }
        return this.mTab3LauncherPrePlayerStartTime;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public String getmPrePlayerVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43b2c1b0", new Object[]{this});
        }
        return this.mPrePlayerVideoId;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean isLaunchCodeRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f866e430", new Object[]{this})).booleanValue();
        }
        return this.mIsLaunchCodeRequest;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean isLocalOrCacheVideo(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7a21903", new Object[]{this, atbVar})).booleanValue();
        }
        return qtm.h(atbVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public boolean ismTab3QuickRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7a0c4d", new Object[]{this})).booleanValue();
        }
        return this.mTab3QuickRender;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            this.mEnableTab3UseCacheData = initTab3CacheConfig();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onCreateService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486f8601", new Object[]{this});
            return;
        }
        ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        resetDetailPrefetchFlag();
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onDestroy() {
        ptm ptmVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IPreloadService iPreloadService = (IPreloadService) this.mFluidContext.getService(IPreloadService.class);
        if (iPreloadService != null) {
            ptmVar = iPreloadService.getPreloadVideoTrackerManager();
        } else {
            ptmVar = null;
        }
        if (!(!enableTab3UseCacheData() || ptmVar == null || ptmVar.b() == null)) {
            ptmVar.g(null);
        }
        stopPreloadVideo();
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.pauseCalled) {
            ir9.b("PreloadService", "onResume preCreatedDWInstance");
            atb findPreAttachedDWInstance = findPreAttachedDWInstance();
            if (findPreAttachedDWInstance != null) {
                ir9.b("PreloadService", "resume preCreatedDWInstance");
                findPreAttachedDWInstance.playVideo();
                findPreAttachedDWInstance.mute(mfj.u(this.mFluidContext));
            }
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            removePreAttachedDWInstance(false);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void preloadDetailDataInBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e7c1de", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void removePreAttachedDWInstance(boolean z) {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7dec942", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            ViewGroup animLayout = ((IContainerService) this.mFluidContext.getService(IContainerService.class)).getAnimLayout();
            if (!(animLayout == null || (findViewById = animLayout.findViewById(R.id.fluid_sdk_preattach_videoview)) == null)) {
                animLayout.removeView(findViewById);
                ntm ntmVar = (ntm) findViewById.getTag(R.id.fluid_sdk_tag_preloadVideo);
                if (ntmVar != null) {
                    ntmVar.h(z);
                }
            }
            ntm preloadVideoData = ((IFeedsListService) this.mFluidContext.getService(IFeedsListService.class)).getPreloadVideoData();
            if (preloadVideoData != null) {
                preloadVideoData.h(z);
            }
        } catch (Throwable th) {
            ir9.b("PreloadService", "removePreAttachedDWInstance " + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void resetDetailPrefetchFlag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ac7dbaa", new Object[]{this});
        } else {
            ShotVideoNavProcessor.f10581a = false;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setIsLaunchCodeRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44faeaa", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLaunchCodeRequest = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setPlayerPlayToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95c993", new Object[]{this, str});
        } else {
            this.mPlayerPlayToken = str;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setTab3CacheTrackParams(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ae983d", new Object[]{this, hashMap});
        } else {
            this.mTab3CacheTrackParams.putAll(hashMap);
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setTab3LauncherPrePlayerStartTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac20412", new Object[]{this, new Long(j)});
        } else {
            this.mTab3LauncherPrePlayerStartTime = j;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void setTab3QuickRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c2c60a", new Object[]{this});
        } else {
            this.mTab3QuickRender = true;
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public r8e setVideoCommentSizeObject(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("7e98a274", new Object[]{this, view});
        }
        int v = s6o.v(this.mFluidContext.getContext());
        int b = p91.b(this.mFluidContext.getContext(), pto.g(this.mFluidContext), this.mFluidContext);
        r8e l = bbw.l(this.mFluidContext.getContext(), view, pto.g(this.mFluidContext), hrm.a().b().b(), this.mFluidContext);
        if (l == null) {
            return new r8e(this.mFluidContext, v, b);
        }
        return l;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void startPreloadVideo(a aVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11b0f80d", new Object[]{this, aVar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.preLoadManager == null) {
            this.preLoadManager = new cnm(this.mFluidContext);
        }
        if (!p91.l() || aps.L() > 0) {
            this.preLoadManager.F(aVar, i, i2, i3);
        } else {
            ir9.b("PreloadService", "低端机优化，不预下载视频。return。");
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void stopPreloadVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5bd579b", new Object[]{this});
            return;
        }
        cnm cnmVar = this.preLoadManager;
        if (cnmVar != null) {
            cnmVar.I();
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.pauseCalled = true;
        atb findPreAttachedDWInstance = findPreAttachedDWInstance();
        if (findPreAttachedDWInstance != null) {
            boolean isFinish = ((ILifecycleService) this.mFluidContext.getService(ILifecycleService.class)).isFinish();
            ir9.b("PreloadService", "pause preCreated DWInstance, isFinish " + isFinish);
            findPreAttachedDWInstance.pauseVideo();
            findPreAttachedDWInstance.b();
            if (isFinish) {
                findPreAttachedDWInstance.destroy();
                xau.u();
            }
        }
    }

    private boolean initTab3CacheConfig() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbb1a1", new Object[]{this})).booleanValue();
        }
        if (isDefaultTab3(this.mFluidContext)) {
            z2 = usm.h();
            z = true;
        } else {
            ir9.b("PreloadService", "initTab3CacheConfig PickPreloadController非默认进tab3");
            z2 = false;
            z = false;
        }
        boolean n = usm.n(this.mFluidContext);
        if (z || n) {
            z3 = true;
        }
        ir9.b("PreloadService", "PickPreloadController,initTab3CacheConfig，enable:" + z3 + "，tab3：" + pto.g(this.mFluidContext) + "，默认tab3：" + ((ISceneConfigService) this.mFluidContext.getService(ISceneConfigService.class)).getSessionExtParams().f() + ",mEnableTab3PreloadVideoOpt:" + z2 + ",launcherCanSaveUnexposedDetail:" + n);
        return z3;
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void moveVideoToList(ntm ntmVar) {
        String str;
        atb atbVar;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f43fa27", new Object[]{this, ntmVar});
            return;
        }
        if (ntmVar != null) {
            atbVar = ntmVar.f24942a;
            str = ntmVar.b;
        } else {
            atbVar = null;
            str = null;
        }
        if (atbVar == null) {
            ir9.b("PreloadService", "moveVideoToList,instance null");
            return;
        }
        ViewGroup view = atbVar.getView();
        qtm.n(view);
        ir9.b("PreloadService", "moveVideoToList:" + view);
        if (view == null || !ntmVar.f(this.mFluidContext.getContext())) {
            ir9.b("PreloadService", "moveVideoToList ignore, preloadedVideo is " + ntmVar);
            return;
        }
        this.mPrePlayerVideoId = str;
        this.mTab3LauncherPrePlayerStartTime = nwv.y(view.getTag(R.id.fluid_sdk_tag_play_start_time), System.currentTimeMillis());
        this.mPlayerPlayToken = atbVar.t();
        if (ntmVar.f24942a != null && !TextUtils.isEmpty(ntmVar.b)) {
            boolean z2 = ntmVar.o;
            if (ntmVar.r && z2) {
                z = true;
            }
            if ((ntmVar.j || z) && pto.f(this.mFluidContext) && pto.g(this.mFluidContext)) {
                ((IContainerService) this.mFluidContext.getService(IContainerService.class)).toggleCacheLoading(true);
            }
        }
        ((IFeedsListService) this.mFluidContext.getService(IFeedsListService.class)).renderCacheVideo(ntmVar);
    }

    @Override // com.taobao.android.fluid.framework.preload.IUsePreloadService
    public void quickRenderFetchContentDetail(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621b506b", new Object[]{this, map});
            return;
        }
        ir9.b("PreloadService", "quickRenderFetchContentDetail,extParams=" + map);
        this.mTab3QuickRender = true;
        this.mIsLaunchCodeRequest = e0o.d();
        ((IContainerService) this.mFluidContext.getService(IContainerService.class)).refresh(map, true, false, false);
    }
}
