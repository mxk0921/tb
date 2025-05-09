package com.taobao.android.fluid.framework.media;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.renderscript.RenderScript;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.containerframe.IContainerFrameService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.container.IContainerService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.android.fluid.framework.media.IMediaService;
import com.taobao.avplayer.DWVideoScreenType;
import java.util.Map;
import tb.ar9;
import tb.atb;
import tb.c5g;
import tb.chi;
import tb.csc;
import tb.cz4;
import tb.e5g;
import tb.f9e;
import tb.ici;
import tb.ir9;
import tb.ncp;
import tb.nwv;
import tb.prp;
import tb.t2o;
import tb.tei;
import tb.trc;
import tb.uei;
import tb.uq9;
import tb.vlc;
import tb.zk1;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MediaService implements IMediaService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_PREFIX_MEDIA_LIFECYCLE = "[Media Lifecycle]卡片：";
    private static final String LOG_PREFIX_MEDIA_LISTENER = "[Media Listener]卡片: ";
    private static final String SERVICE_NAME = "IMediaService";
    private static final String TAG = "MediaService";
    private final cz4 currentPlayVideoMgrComponent;
    private ICardService mCardService;
    private IContainerFrameService mContainerFrameService;
    private IContainerService mContainerService;
    private IDataService mDataService;
    private final FluidContext mFluidContext;
    private e5g mKirinEngineDelegate;
    private final tei mMediaLifecycleManager;
    private final uei mMediaListenersManager;
    private RenderScript mRenderScript;
    private boolean mUseDefaultValueCreateDW;
    private boolean mFirstFrameSuccess = false;
    private final chi mMediaServiceConfig = new chi();

    static {
        t2o.a(468714502);
        t2o.a(468714500);
    }

    public MediaService(FluidContext fluidContext) {
        this.mFluidContext = fluidContext;
        this.mMediaLifecycleManager = new tei(fluidContext);
        this.mMediaListenersManager = new uei(fluidContext);
        this.currentPlayVideoMgrComponent = new cz4(fluidContext);
    }

    private ici getActiveMediaCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ici) ipChange.ipc$dispatch("172b876e", new Object[]{this});
        }
        uq9 activeCard = this.mCardService.getActiveCard();
        if (activeCard instanceof ici) {
            return (ici) activeCard;
        }
        ir9.b("MediaService", "获取当前 Active 的卡片，卡片类型不是 MediaCard: " + activeCard);
        return null;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addLivePlayerListener(vlc vlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce262d05", new Object[]{this, vlcVar});
        } else {
            this.mMediaListenersManager.addLivePlayerListener(vlcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addMediaLifecycleListener(trc trcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77d049fb", new Object[]{this, trcVar});
        } else {
            this.mMediaLifecycleManager.addMediaLifecycleListener(trcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addMediaPlayerListener(csc cscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1124b27", new Object[]{this, cscVar});
        } else {
            this.mMediaListenersManager.addMediaPlayerListener(cscVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addVideoPlayerListener(f9e f9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa02b487", new Object[]{this, f9eVar});
        } else {
            this.mMediaListenersManager.addVideoPlayerListener(f9eVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public chi getConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (chi) ipChange.ipc$dispatch("e4fa55ba", new Object[]{this});
        }
        return this.mMediaServiceConfig;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public atb getCurrentPlayInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (atb) ipChange.ipc$dispatch("6464626", new Object[]{this});
        }
        return this.currentPlayVideoMgrComponent.k();
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public e5g getKirinEngineDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e5g) ipChange.ipc$dispatch("a1f88275", new Object[]{this});
        }
        return this.mKirinEngineDelegate;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public RenderScript getRenderScript() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderScript) ipChange.ipc$dispatch("39c196a0", new Object[]{this});
        }
        return this.mRenderScript;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public int getVideoLength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("72dc8105", new Object[]{this})).intValue();
        }
        ici activeMediaCard = getActiveMediaCard();
        if (activeMediaCard == null) {
            ir9.b("MediaService", "getVideoLength, the current card is null");
            return 0;
        } else if (activeMediaCard instanceof prp) {
            return ((prp) activeMediaCard).n1().getVideoLength();
        } else {
            ir9.b("MediaService", "getVideoLength, the current card is not ShortVideoCard");
            return 0;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public int getVideoProgress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbd9778c", new Object[]{this})).intValue();
        }
        ici activeMediaCard = getActiveMediaCard();
        if (activeMediaCard != null) {
            return ((prp) activeMediaCard).n1().getVideoProgress();
        }
        ir9.b("MediaService", "getVideoProgress, the current card is null");
        return 0;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.mMediaListenersManager.getVideoState();
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.csc
    public boolean hook(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e726267f", new Object[]{this, uq9Var})).booleanValue();
        }
        return this.mMediaListenersManager.hook(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public boolean isFirstFrameSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b53f8b27", new Object[]{this})).booleanValue();
        }
        return this.mFirstFrameSuccess;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public boolean isUseDefaultValueCreateDW() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83694c87", new Object[]{this})).booleanValue();
        }
        return this.mUseDefaultValueCreateDW;
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.vlc
    public void onCompletion(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77df115", new Object[]{this, uq9Var, iMediaPlayer});
        } else {
            this.mMediaListenersManager.onCompletion(uq9Var, iMediaPlayer);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (this.mFluidContext.getContext() instanceof Activity) {
            this.currentPlayVideoMgrComponent.n((Activity) this.mFluidContext.getContext());
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
        this.mDataService = (IDataService) this.mFluidContext.getService(IDataService.class);
        this.mCardService = (ICardService) this.mFluidContext.getService(ICardService.class);
        this.mContainerService = (IContainerService) this.mFluidContext.getService(IContainerService.class);
        this.mContainerFrameService = (IContainerFrameService) this.mFluidContext.getService(IContainerFrameService.class);
        if (c5g.e(this.mFluidContext)) {
            this.mKirinEngineDelegate = new e5g(this.mFluidContext);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onDataUpdate 回调");
        this.mMediaLifecycleManager.onDataUpdate(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.mFluidContext.getContext() instanceof Activity) {
            this.currentPlayVideoMgrComponent.o((Activity) this.mFluidContext.getContext());
        }
        RenderScript renderScript = this.mRenderScript;
        if (renderScript != null) {
            renderScript.destroy();
        }
    }

    @Override // com.taobao.android.fluid.core.FluidService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.vlc
    public boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9aa6fc07", new Object[]{this, uq9Var, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onError 回调");
        FluidContext fluidContext = this.mFluidContext;
        ar9 ar9Var = new ar9(ar9.PREFIX_FLUID_MEDIA_SERVICE_LIVE + i, "直播播放错误");
        FluidException.throwException(fluidContext, ar9Var, "直播播放错误，错误码：" + i + "，错误信息：" + i2);
        this.mContainerService.onFirstCardRenderFailed(uq9Var);
        this.mContainerService.onCardRenderFailed(uq9Var);
        return this.mMediaListenersManager.onError(uq9Var, iMediaPlayer, i, i2);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onLoopCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onLoopCompletion 回调");
        this.mMediaListenersManager.onLoopCompletion(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.p();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onPauseMedia 回调");
        this.mMediaLifecycleManager.onPauseMedia(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onPreCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onPreCompletion 回调");
        this.mMediaListenersManager.onPreCompletion(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.vlc
    public void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78defb6", new Object[]{this, uq9Var, iMediaPlayer});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onPrepared 回调");
        this.mMediaListenersManager.onPrepared(uq9Var, iMediaPlayer);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onRecyclePlayer 回调");
        this.mMediaLifecycleManager.onRecyclePlayer(uq9Var, z);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onRequestMediaPlayer 回调");
        this.mMediaLifecycleManager.onRequestMediaPlayer(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.q();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onShowCover 回调");
        this.mMediaLifecycleManager.onShowCover(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onShowFirstCover 回调");
        this.mMediaLifecycleManager.onShowFirstCover(uq9Var, i, i2, drawable, str);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.r();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onStartMedia 回调");
        this.mMediaLifecycleManager.onStartMedia(uq9Var, z, z2);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.s();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onStopMedia 回调");
        this.mMediaLifecycleManager.onStopMedia(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LIFECYCLE + uq9Var + "触发 onUTPairsUpdate 回调");
        this.mMediaLifecycleManager.onUTPairsUpdate(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoClose(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoClose 回调");
        this.mMediaListenersManager.onVideoClose(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoComplete(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoComplete 回调");
        this.mMediaListenersManager.onVideoComplete(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoError 回调 mp=" + obj + " errorCode=" + i + " errorExtra=" + i2);
        FluidContext fluidContext = this.mFluidContext;
        StringBuilder sb = new StringBuilder(ar9.PREFIX_FLUID_MEDIA_SERVICE_VIDEO);
        sb.append(i);
        ar9 ar9Var = new ar9(sb.toString(), "视频播放错误");
        FluidException.throwException(fluidContext, ar9Var, "视频播放错误，错误码：" + i + "，错误信息：" + i2);
        this.mContainerService.onFirstCardRenderFailed(uq9Var);
        this.mContainerService.onCardRenderFailed(uq9Var);
        this.mMediaListenersManager.onVideoError(uq9Var, obj, i, i2);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        if (3 == j) {
            this.mContainerService.onFirstCardRenderSuccess(uq9Var);
            this.mContainerService.onCardRenderSuccess(uq9Var);
        }
        this.mMediaListenersManager.onVideoInfo(uq9Var, obj, j, j2, j3, obj2);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoPause 回调");
        this.mMediaListenersManager.onVideoPause(uq9Var, z);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoPlay 回调");
        this.mMediaListenersManager.onVideoPlay(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoPrepared(uq9 uq9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoPrepared 回调");
        this.mMediaListenersManager.onVideoPrepared(uq9Var, obj);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.mMediaListenersManager.onVideoProgressChanged(uq9Var, i, i2, i3);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoScreenChanged 回调");
        this.mMediaListenersManager.onVideoScreenChanged(uq9Var, dWVideoScreenType);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoSeekTo(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoSeekTo 回调");
        this.mMediaListenersManager.onVideoSeekTo(uq9Var, i);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoStart(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoStart 回调");
        this.mMediaListenersManager.onVideoStart(uq9Var);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.f9e
    public void onVideoStateChanged(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onVideoStateChanged 回调");
        this.mMediaListenersManager.onVideoStateChanged(uq9Var, i);
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void pauseCurrentVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b01c1f", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.u();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeLivePlayerListener(vlc vlcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8973fbc2", new Object[]{this, vlcVar});
        } else {
            this.mMediaListenersManager.removeLivePlayerListener(vlcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeMediaLifecycleListener(trc trcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2284829e", new Object[]{this, trcVar});
        } else {
            this.mMediaLifecycleManager.removeMediaLifecycleListener(trcVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeMediaPlayerListener(csc cscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20275ea4", new Object[]{this, cscVar});
        } else {
            this.mMediaListenersManager.removeMediaPlayerListener(cscVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeVideoPlayerListener(f9e f9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1917c804", new Object[]{this, f9eVar});
        } else {
            this.mMediaListenersManager.removeVideoPlayerListener(f9eVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void resumeCurrentVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2a07056", new Object[]{this});
        } else {
            this.currentPlayVideoMgrComponent.w();
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setCurrentPlayInstance(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd0cdfc", new Object[]{this, atbVar});
        } else {
            this.currentPlayVideoMgrComponent.y(atbVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setFirstFrameSuccess(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae908149", new Object[]{this, new Boolean(z)});
        } else {
            this.mFirstFrameSuccess = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setNeedFloatWindow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18425979", new Object[]{this, new Boolean(z)});
        } else {
            this.currentPlayVideoMgrComponent.z(z);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setOnStateChangeFromSmallWindowToNormal(IMediaService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efd99e0", new Object[]{this, aVar});
        } else {
            this.currentPlayVideoMgrComponent.A(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setRenderScript(RenderScript renderScript) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4333468", new Object[]{this, renderScript});
        } else {
            this.mRenderScript = renderScript;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void setUseDefaultValueCreateDW(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f021e9", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseDefaultValueCreateDW = z;
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void update12003UtParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aceb7f0", new Object[]{this, map});
            return;
        }
        ici activeMediaCard = getActiveMediaCard();
        if (activeMediaCard == null) {
            ir9.b("MediaService", "update12003UtParams, the current card is null");
        } else {
            activeMediaCard.update12003UtParams(map);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addLivePlayerListener(vlc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23d6059a", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.addLivePlayerListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addMediaLifecycleListener(trc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7966cc90", new Object[]{this, aVar});
        } else {
            this.mMediaLifecycleManager.addMediaLifecycleListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void addVideoPlayerListener(f9e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fbeb1c", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.addVideoPlayerListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeLivePlayerListener(vlc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9fbc757", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.removeLivePlayerListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeMediaLifecycleListener(trc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ff5b233", new Object[]{this, aVar});
        } else {
            this.mMediaLifecycleManager.removeMediaLifecycleListener(aVar);
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public void removeVideoPlayerListener(f9e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b83199", new Object[]{this, aVar});
        } else {
            this.mMediaListenersManager.removeVideoPlayerListener(aVar);
        }
    }

    private boolean checkAutoSlideXCardAndStayInCurrentPosition(int i) {
        boolean z;
        Map<String, Map<String, Object>> map;
        Map<String, Object> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a00c7085", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int b = zk1.b();
        ir9.b("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition 用户设置过，返回用户设置过的值 autoNextVideoState=" + b);
        if (b != 0) {
            return false;
        }
        ncp j = this.mDataService.getConfig().j();
        int i2 = Integer.MAX_VALUE;
        if (!(j == null || (map = j.G) == null)) {
            Map<String, Object> map3 = j.J;
            if (map3 != null) {
                map2 = (Map) map3.get("autoSlideXCard");
                ir9.b("PickPreloadControllerNew", "下滑 新协议。autoSlideXCard=" + map2);
            } else {
                map2 = map.get("autoSlideXCard");
            }
            ir9.b("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition, autoSlideXCard=" + map2);
            if (map2 != null) {
                z = nwv.o(map2.get("enableAutoSlideXCard"), false);
                i2 = nwv.t(map2.get("autoSlideCount"), Integer.MAX_VALUE);
                boolean e = zk1.e(this.mDataService.getConfig().j().f);
                ir9.b("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition 用户未设置过，开关打开，服务端可下滑，前X坑 currentPosition=" + i + ",shouldNext=" + e + ",xCellNum=" + i2 + "，enable=" + z);
                return !e && z && i >= i2;
            }
        }
        z = false;
        boolean e2 = zk1.e(this.mDataService.getConfig().j().f);
        ir9.b("MediaService", "checkAutoSlideXCardAndStayInCurrentPosition 用户未设置过，开关打开，服务端可下滑，前X坑 currentPosition=" + i + ",shouldNext=" + e2 + ",xCellNum=" + i2 + "，enable=" + z);
        if (!e2) {
        }
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService
    public boolean shouldVideoStay() {
        Fragment findFragmentByTag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c8b90c", new Object[]{this})).booleanValue();
        }
        boolean isShareContentContainerShowing = FluidSDK.getShareAdapter().isShareContentContainerShowing();
        boolean isGoodListShowing = this.mContainerFrameService.isGoodListShowing();
        boolean isAlbumDetailFrameShowing = this.mContainerFrameService.isAlbumDetailFrameShowing();
        boolean z = (this.mFluidContext.getContext() instanceof FragmentActivity) && (findFragmentByTag = ((FragmentActivity) this.mFluidContext.getContext()).getSupportFragmentManager().findFragmentByTag("share_video_download_loading")) != null && findFragmentByTag.isAdded();
        uq9 activeCard = this.mCardService.getActiveCard();
        return isShareContentContainerShowing || isGoodListShowing || this.mContainerService.getConfig().l() || getConfig().d() || this.mCardService.getConfig().w() || this.mContainerService.getConfig().m() || z || isAlbumDetailFrameShowing || getConfig().e() || (activeCard instanceof prp ? ((prp) activeCard).t1().c().o() : false) || checkAutoSlideXCardAndStayInCurrentPosition(this.mDataService.getCurrentMediaPosition());
    }

    @Override // com.taobao.android.fluid.framework.media.IMediaService, tb.vlc
    public boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b531195d", new Object[]{this, uq9Var, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
        }
        ir9.b("MediaService", LOG_PREFIX_MEDIA_LISTENER + uq9Var + "触发 onInfo 回调");
        if (3 == j) {
            this.mContainerService.onFirstCardRenderSuccess(uq9Var);
            this.mContainerService.onCardRenderSuccess(uq9Var);
        }
        return this.mMediaListenersManager.onInfo(uq9Var, iMediaPlayer, j, j2, j3, obj);
    }
}
