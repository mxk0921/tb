package com.taobao.taolive.room.service;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.b3d;
import tb.ux9;
import tb.v4q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IPlayPublicService extends v4q {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface MediaState {
        public static final int STATE_COMPLETED = 7;
        public static final int STATE_DESTROY = 4;
        public static final int STATE_ERROR = 6;
        public static final int STATE_ERROR_TO_REPLAY = 8;
        public static final int STATE_FIRST_FRAME = 5;
        public static final int STATE_INITIAL = 0;
        public static final int STATE_PAUSED = 3;
        public static final int STATE_START_PLAYING = 2;
        public static final int STATE_WARMUP = 1;
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public @interface PlayRate {
        public static final String DEFAULT_PLAY_RATE = "1";
        public static final String PLAY_SPEED_1_5X = "1.5";
        public static final String PLAY_SPEED_2X = "2";
        public static final String PLAY_SPEED_3X = "3";
    }

    void B(long j);

    void E(ux9 ux9Var, b3d b3dVar);

    void G(IMediaPlayer.g gVar);

    void H();

    boolean J();

    void L(Context context, String str);

    void M();

    void N(IMediaPlayer.d dVar);

    void O(IMediaPlayer.AspectRatio aspectRatio, boolean z);

    String b();

    long d();

    void d(IMediaPlayer.c cVar);

    VideoStatus e();

    void f(IMediaPlayer.e eVar);

    void g(Map<String, String> map);

    long getCurrentPosition();

    long getDuration();

    @Override // tb.v4q
    ViewGroup getView();

    void h(ux9 ux9Var, b3d b3dVar);

    void i(boolean z);

    boolean isPlaying();

    boolean j();

    void k();

    void l();

    void o(boolean z);

    void r(IMediaPlayer.c cVar);

    void seekTo(long j);

    void setPlayRate(float f);

    void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy);

    float t();

    boolean u();

    String w();

    View x();

    void y(Context context);
}
