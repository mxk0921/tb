package com.taobao.android.fcanvas.integration;

import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface b {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a();

        void b();
    }

    void attachToRenderer(com.taobao.android.fcanvas.integration.a aVar);

    void detachFromRenderer();

    View getCanvasView();

    void setLifecycleListener(a aVar);
}
