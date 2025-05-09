package com.taobao.trtc.api;

import com.taobao.trtc.api.TrtcDefines;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITrtcDataStream {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b(TrtcDefines.f fVar);

        void c();
    }

    void sendDataFrame(TrtcDefines.f fVar);

    void setDataStreamObserver(a aVar);
}
