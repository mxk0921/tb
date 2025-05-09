package com.taobao.trtc.api;

import com.taobao.trtc.api.TrtcDefines;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITrtcObserver {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void c(String str);

        void l(String str);

        void onAudioRouteChanged(int i);

        void onBlueToothDeviceDisconnected();

        void y(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void A(String str, int i, int i2, int i3);

        void B(String str, String str2);

        void F(String str);

        void I(boolean z, int i, int i2, int i3);

        void b(int i, String str);

        void i(String str, int i);

        void j(boolean z, ArrayList<String> arrayList);

        void k(String str);

        void m(String str, String str2);

        void q(TrtcDefines.b bVar, TrtcDefines.TrtcAnswerType trtcAnswerType);

        void r(TrtcDefines.b bVar);

        void t(TrtcDefines.c cVar, TrtcDefines.TrtcAnswerType trtcAnswerType, String str);

        void v(String str);

        void w(ArrayList<TrtcDefines.c> arrayList, String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void D(String str, String str2);

        void E(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3);

        void G(ArrayList<TrtcDefines.n> arrayList);

        void h(ArrayList<TrtcDefines.n> arrayList);

        void n(String str, String str2);

        void x(TrtcDefines.e eVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface e {
        void C(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState);

        void H(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str);

        void J(String str, boolean z);

        void d(String str, String str2, String str3, String str4);

        void e(ArrayList<String> arrayList);

        void f(TrtcDefines.l lVar);

        void g(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality);

        void o(boolean z);

        void onLiveChannelIdUpdate(String str);

        void p(int i);

        void s();

        void u(String str, int i, String str2, String str3, String str4);

        void z(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface f {
    }
}
