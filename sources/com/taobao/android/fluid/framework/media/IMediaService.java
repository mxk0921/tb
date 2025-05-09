package com.taobao.android.fluid.framework.media;

import android.graphics.drawable.Drawable;
import android.renderscript.RenderScript;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.avplayer.DWVideoScreenType;
import java.util.Map;
import tb.atb;
import tb.chi;
import tb.csc;
import tb.e5g;
import tb.f9e;
import tb.o6d;
import tb.trc;
import tb.uq9;
import tb.vlc;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IMediaService extends FluidService, o6d, csc, vlc, f9e, trc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void l();
    }

    /* synthetic */ void addLivePlayerListener(vlc.a aVar);

    /* synthetic */ void addLivePlayerListener(vlc vlcVar);

    /* synthetic */ void addMediaLifecycleListener(trc.a aVar);

    /* synthetic */ void addMediaLifecycleListener(trc trcVar);

    /* synthetic */ void addMediaPlayerListener(csc cscVar);

    /* synthetic */ void addVideoPlayerListener(f9e.a aVar);

    /* synthetic */ void addVideoPlayerListener(f9e f9eVar);

    chi getConfig();

    atb getCurrentPlayInstance();

    e5g getKirinEngineDelegate();

    RenderScript getRenderScript();

    int getVideoLength();

    int getVideoProgress();

    /* synthetic */ int getVideoState();

    @Override // tb.csc
    /* synthetic */ boolean hook(uq9 uq9Var);

    boolean isFirstFrameSuccess();

    boolean isUseDefaultValueCreateDW();

    @Override // tb.vlc
    /* synthetic */ void onCompletion(uq9 uq9Var, IMediaPlayer iMediaPlayer);

    @Override // tb.o6d
    /* synthetic */ void onCreate();

    @Override // tb.trc
    /* synthetic */ void onDataUpdate(uq9 uq9Var);

    @Override // tb.o6d
    /* synthetic */ void onDestroy();

    @Override // tb.vlc
    /* synthetic */ boolean onError(uq9 uq9Var, IMediaPlayer iMediaPlayer, int i, int i2);

    @Override // tb.vlc
    /* synthetic */ boolean onInfo(uq9 uq9Var, IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);

    @Override // tb.f9e
    /* synthetic */ void onLoopCompletion(uq9 uq9Var);

    @Override // tb.o6d
    /* synthetic */ void onPause();

    @Override // tb.trc
    /* synthetic */ void onPauseMedia(uq9 uq9Var);

    @Override // tb.f9e
    /* synthetic */ void onPreCompletion(uq9 uq9Var);

    @Override // tb.vlc
    /* synthetic */ void onPrepared(uq9 uq9Var, IMediaPlayer iMediaPlayer);

    @Override // tb.o6d
    /* synthetic */ void onRealStart();

    @Override // tb.o6d
    /* synthetic */ void onRealStop();

    @Override // tb.trc
    /* synthetic */ void onRecyclePlayer(uq9 uq9Var, boolean z);

    @Override // tb.trc
    /* synthetic */ void onRequestMediaPlayer(uq9 uq9Var);

    @Override // tb.o6d
    /* synthetic */ void onResume();

    @Override // tb.trc
    /* synthetic */ void onShowCover(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str);

    @Override // tb.o6d
    /* synthetic */ void onStart();

    @Override // tb.trc
    /* synthetic */ void onStartMedia(uq9 uq9Var, boolean z, boolean z2);

    @Override // tb.o6d
    /* synthetic */ void onStop();

    @Override // tb.trc
    /* synthetic */ void onStopMedia(uq9 uq9Var);

    @Override // tb.trc
    /* synthetic */ void onUTPairsUpdate(uq9 uq9Var);

    @Override // tb.f9e
    /* synthetic */ void onVideoClose(uq9 uq9Var);

    @Override // tb.f9e
    /* synthetic */ void onVideoComplete(uq9 uq9Var);

    @Override // tb.f9e
    /* synthetic */ void onVideoError(uq9 uq9Var, Object obj, int i, int i2);

    @Override // tb.f9e
    /* synthetic */ void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2);

    @Override // tb.f9e
    /* synthetic */ void onVideoPause(uq9 uq9Var, boolean z);

    @Override // tb.f9e
    /* synthetic */ void onVideoPlay(uq9 uq9Var);

    @Override // tb.f9e
    /* synthetic */ void onVideoPrepared(uq9 uq9Var, Object obj);

    @Override // tb.f9e
    /* synthetic */ void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3);

    @Override // tb.f9e
    /* synthetic */ void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType);

    @Override // tb.f9e
    /* synthetic */ void onVideoSeekTo(uq9 uq9Var, int i);

    @Override // tb.f9e
    /* synthetic */ void onVideoStart(uq9 uq9Var);

    @Override // tb.f9e
    /* synthetic */ void onVideoStateChanged(uq9 uq9Var, int i);

    void pauseCurrentVideo();

    /* synthetic */ void removeLivePlayerListener(vlc.a aVar);

    /* synthetic */ void removeLivePlayerListener(vlc vlcVar);

    /* synthetic */ void removeMediaLifecycleListener(trc.a aVar);

    /* synthetic */ void removeMediaLifecycleListener(trc trcVar);

    /* synthetic */ void removeMediaPlayerListener(csc cscVar);

    /* synthetic */ void removeVideoPlayerListener(f9e.a aVar);

    /* synthetic */ void removeVideoPlayerListener(f9e f9eVar);

    void resumeCurrentVideo();

    void setCurrentPlayInstance(atb atbVar);

    void setFirstFrameSuccess(boolean z);

    void setNeedFloatWindow(boolean z);

    void setOnStateChangeFromSmallWindowToNormal(a aVar);

    void setRenderScript(RenderScript renderScript);

    void setUseDefaultValueCreateDW(boolean z);

    boolean shouldVideoStay();

    void update12003UtParams(Map<String, String> map);
}
