package com.taobao.android.dinamicx.widget.video;

import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface a {

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.dinamicx.widget.video.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface AbstractC0403a {
        void a(boolean z, boolean z2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void a();

        void onPlayCompleted();
    }

    void canPlay(boolean z);

    void destroyVideo();

    boolean isMuted();

    boolean isPlaying();

    void pauseVideo();

    void playVideo();

    void playVideo(boolean z);

    void prepareToFirstFrame();

    void responseOnClick();

    void seekTo(int i);

    void setAutoControl(boolean z);

    void setBackGroundColor(int i);

    void setBizId(String str);

    void setClickListenerControlPlay(boolean z);

    void setCoverImage(String str);

    void setCoverImageScaleType(int i);

    void setCustomerPlayIcon(DXWidgetNode dXWidgetNode);

    void setEnablePlayControl(boolean z);

    void setHideIconOnStop(boolean z);

    void setITSVideoStatusCallback(b bVar);

    void setLooping(boolean z);

    void setMuted(boolean z);

    void setPassOnTrack(String str);

    void setPlayButtonImage(String str);

    void setPlayIgnoreNetwork(boolean z);

    void setProgressInterval(int i);

    void setScaleType(int i);

    void setSubBusinessId(String str);

    void setVideoId(String str);

    void setVideoSize(int i, int i2);

    void setVideoUrl(String str);

    void showCoverImageView();
}
