package tb;

import android.view.View;
import com.taobao.android.detail.ttdetail.widget.video.VideoView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface u9d {
    void a(qtb qtbVar);

    boolean b();

    void c(VideoView.e eVar);

    void d();

    void destroy();

    void e(boolean z);

    void f(int i, int i2);

    long getDuration();

    int getVideoState();

    View getView();

    void mute(boolean z);

    void pauseVideo();

    void playVideo();

    void seekTo(int i);

    void start();
}
