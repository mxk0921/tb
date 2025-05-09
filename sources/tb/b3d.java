package tb;

import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface b3d {
    void a();

    void b();

    boolean c(IMediaPlayer iMediaPlayer, long j, long j2, Object obj);

    void onCompletion(IMediaPlayer iMediaPlayer);

    void onEnd();

    boolean onError(IMediaPlayer iMediaPlayer, int i, int i2);

    void onPause(IMediaPlayer iMediaPlayer);

    void onPrepared();

    void onStart(IMediaPlayer iMediaPlayer);
}
