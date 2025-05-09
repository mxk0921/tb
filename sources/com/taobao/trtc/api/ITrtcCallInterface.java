package com.taobao.trtc.api;

import com.taobao.trtc.api.TrtcDefines;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ITrtcCallInterface {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        a a(String str);

        a c(boolean z);

        a e(ITrtcInputStream iTrtcInputStream);

        a f(TrtcDefines.TrtcAnswerType trtcAnswerType);

        a g(String str, String str2);

        boolean start();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        b b(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3);

        boolean start();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        c a(String str);

        c b(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3);

        c c(boolean z);

        c d(String str);

        c e(String str);

        boolean start();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        d a(String str);

        d b(String str, TrtcDefines.TrtcUserRole trtcUserRole, String str2, String str3);

        d c(boolean z);

        d d(String str);

        d e(ITrtcInputStream iTrtcInputStream);

        d f(int i);

        boolean start();
    }
}
