package tb;

import com.taobao.mediaplay.MediaPlayScreenType;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface asc {
    void onMediaClose();

    void onMediaComplete();

    void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2);

    void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj);

    void onMediaPause(boolean z);

    void onMediaPlay();

    void onMediaPrepared(IMediaPlayer iMediaPlayer);

    void onMediaProgressChanged(int i, int i2, int i3);

    void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType);

    void onMediaSeekTo(int i);

    void onMediaStart();
}
