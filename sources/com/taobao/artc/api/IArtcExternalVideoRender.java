package com.taobao.artc.api;

import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface IArtcExternalVideoRender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class Frame {
        public ByteBuffer dataU;
        public ByteBuffer dataV;
        public ByteBuffer dataY;
        public int height;
        public int rotation;
        public int strideU;
        public int strideV;
        public int strideY;
        public long timestampNs;
        public int width;

        static {
            t2o.a(395313201);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface Observer {
        void onFrame(Frame frame);

        void onFrame(String str, Frame frame);
    }

    void setObserver(Observer observer);
}
