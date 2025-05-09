package com.taobao.trtc.api;

import android.view.Surface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITrtcInputStream extends ITrtcDataStream {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b();

        void c(Surface surface);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
    }

    void inputSei(String str, boolean z);

    void setStatsObserver(b bVar);

    TrtcStreamConfig streamConfig();

    String streamId();

    void update(boolean z, boolean z2, boolean z3);

    Surface videoInputSurface();
}
