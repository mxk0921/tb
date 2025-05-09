package tb;

import android.view.View;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface r4d extends v4q {
    void D(RoomPlayerObserver roomPlayerObserver);

    void F(String str);

    String K();

    String a();

    String b();

    String c();

    void d(IMediaPlayer.c cVar);

    void destroy();

    void f(IMediaPlayer.e eVar);

    void g(Map<String, String> map);

    long getCurrentPosition();

    View getVideoView();

    boolean isPlaying();

    void m();

    void p(PreloadParams preloadParams);

    void release();
}
