package com.taobao.mediaplay.player;

import android.view.Surface;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface c {
    public static final int AR_16_9_FIT_PARENT = 4;
    public static final int AR_4_3_FIT_PARENT = 5;
    public static final int AR_ASPECT_FILL_PARENT = 1;
    public static final int AR_ASPECT_FIT_PARENT = 0;
    public static final int AR_ASPECT_WRAP_CONTENT = 2;
    public static final int AR_MATCH_PARENT = 3;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(b bVar, int i, int i2, int i3);

        void b(b bVar);

        void c(b bVar, int i, int i2);

        void d(b bVar, boolean z);

        void onAttachedToWindow();

        void onDetachedFromWindow();

        void onWindowVisibilityChanged(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(IMediaPlayer iMediaPlayer);

        c getRenderView();

        Surface getSurface();

        boolean isBackground();
    }

    void addRenderCallback(a aVar);

    float getDisplayAspectRatio();

    View getView();

    boolean isAvailable();

    void removeRenderCallback(a aVar);

    void requestLayout();

    void setAspectRatio(int i);

    void setBackground(boolean z);

    void setVideoRotation(int i);

    void setVideoSampleAspectRatio(int i, int i2);

    void setVideoSize(int i, int i2);
}
