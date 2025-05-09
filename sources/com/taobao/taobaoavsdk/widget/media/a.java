package com.taobao.taobaoavsdk.widget.media;

import android.view.Surface;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface a {
    public static final int AR_16_9_FIT_PARENT = 4;
    public static final int AR_4_3_FIT_PARENT = 5;
    public static final int AR_ASPECT_FILL_PARENT = 1;
    public static final int AR_ASPECT_FIT_PARENT = 0;
    public static final int AR_ASPECT_WRAP_CONTENT = 2;
    public static final int AR_MATCH_PARENT = 3;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taobaoavsdk.widget.media.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0740a {
        void a(b bVar, int i, int i2);

        void b(b bVar, int i, int i2, int i3);

        void c(b bVar, boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void a(IMediaPlayer iMediaPlayer);

        a getRenderView();

        Surface getSurface();
    }

    void addRenderCallback(AbstractC0740a aVar);

    View getView();

    void removeRenderCallback(AbstractC0740a aVar);

    void setAspectRatio(int i);

    void setVideoRotation(int i);

    void setVideoSampleAspectRatio(int i, int i2);

    void setVideoSize(int i, int i2);
}
