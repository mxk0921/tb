package tb;

import android.view.View;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface v4q {
    int getVideoHeight();

    int getVideoWidth();

    View getView();

    boolean isMuted();

    void n(IMediaPlayer.h hVar);

    void pause();

    void q(IMediaPlayer.f fVar);

    void s(IMediaPlayer.b bVar);

    void setMuted(boolean z);

    void start();

    void z(IMediaPlayer.i iVar);
}
