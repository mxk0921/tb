package tb;

import com.taobao.mediaplay.player.MediaAspectRatio;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface jrc {
    void a(IMediaPlayer.OnVideoClickListener onVideoClickListener);

    void b(boolean z);

    void c();

    void f(int i, float f);

    void g(fsc fscVar);

    int getBufferPercentage();

    int getCurrentPosition();

    int getDuration();

    float getVideoRenderPts();

    int getVideoState();

    void h(asc ascVar);

    void i(MediaAspectRatio mediaAspectRatio);

    void j(int i, long j);

    void k(vrc vrcVar);

    void l(boolean z);

    void pauseVideo();

    void playVideo();

    void setPlayRate(float f);
}
