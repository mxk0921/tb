package tb;

import android.util.Size;
import com.taobao.android.litecreator.sdk.editor.data.Media;
import com.taobao.android.litecreator.sdk.editor.data.MediaClips;
import com.taobao.android.litecreator.sdk.editor.data.Video;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface v8e extends prc<Video>, y6c, bjc, srb, fxc, sae, xsd, x7d, ueb, xib {
    long F();

    boolean M();

    void U(boolean z);

    b9e V();

    void Y(Media media);

    void Z(boolean z, float f);

    @Override // tb.prc
    VideoEditInfo a();

    void c0(List<Video> list);

    void destroy();

    void f(boolean z);

    List<Video> getVideos();

    void j0(Media media);

    VideoEditInfo k();

    void m(float f);

    Size m0();

    void o0(boolean z);

    boolean p0();

    void setCanvasSize(int i, int i2);

    void x(MediaClips mediaClips);

    Video y();
}
