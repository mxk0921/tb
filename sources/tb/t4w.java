package tb;

import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface t4w {
    void onFirstFrame(long j, long j2);

    void onFrameReady();

    void onLiveStartPlay();

    void onSurfaceRenderFirstFrame(long j);

    void onVideoError(IMediaPlayer iMediaPlayer, int i, int i2);

    void onVideoInfo(IMediaPlayer iMediaPlayer, long j, long j2, Object obj);
}
