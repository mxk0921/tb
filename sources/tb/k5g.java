package tb;

import com.taobao.avplayer.DWVideoScreenType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface k5g {
    void a(String str);

    void b(Object obj, long j, long j2, long j3, Object obj2);

    void onVideoClose();

    void onVideoComplete();

    void onVideoError(Object obj, int i, int i2);

    void onVideoPause(boolean z);

    void onVideoPlay();

    void onVideoPrepared(Object obj);

    void onVideoProgressChanged(int i, int i2, int i3);

    void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType);

    void onVideoSeekTo(int i);

    void onVideoStart();
}
