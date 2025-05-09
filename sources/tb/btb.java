package tb;

import android.view.View;
import com.taobao.avplayer.DWInstanceType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface btb {
    void a();

    void b();

    void c(HashMap<String, String> hashMap);

    void d(qtb qtbVar);

    void destroy();

    void e(HashMap<String, String> hashMap);

    void f(int i, int i2);

    int getVideoState();

    View getView();

    void i(DWInstanceType dWInstanceType);

    void j(aub aubVar);

    void l(nj9 nj9Var);

    void m(float f, float f2, int i, int i2);

    void mute(boolean z);

    void n(boolean z);

    void pauseVideo();

    void playVideo();

    void prepareToFirstFrame();

    void r(HashMap<String, Object> hashMap);

    void seekTo(int i);

    void setPlayRate(float f);

    void setVideoLoop(boolean z);

    void setVolume(float f);

    void start();

    void w(HashMap<String, String> hashMap);

    void x(zxc zxcVar);
}
