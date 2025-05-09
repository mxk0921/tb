package com.taobao.trtc.api;

import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcDefines;
import java.nio.ByteBuffer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface TrtcAudioDevice {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(b bVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f13873a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public int f;
        public ByteBuffer g;
        public int h;

        static {
            t2o.a(395313405);
        }
    }

    void enableSpeakerphone(boolean z);

    TrtcDefines.TrtcAudioRouteDevice getCurrentDevice();

    void muteLocal(boolean z);

    void muteRemote(String str, boolean z);

    void setAEDEnable(boolean z);

    @Deprecated
    void setAudioEventObserver(ITrtcObserver.a aVar);

    void setAudioObserver(a aVar);

    void setAudioPlayoutObserver(a aVar);

    void setAudioProcessObserver(a aVar);
}
