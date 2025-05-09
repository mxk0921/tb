package com.taobao.themis.kernel.adapter;

import tb.bbs;
import tb.n8s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface IInstanceLifecycleAdapter extends n8s {
    void onCreate(bbs bbsVar);

    void onDestroy(bbs bbsVar);

    void onPause(bbs bbsVar);

    void onResume(bbs bbsVar);

    void onStart(bbs bbsVar);

    void onStop(bbs bbsVar);
}
