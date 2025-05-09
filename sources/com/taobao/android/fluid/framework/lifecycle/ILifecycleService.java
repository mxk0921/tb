package com.taobao.android.fluid.framework.lifecycle;

import com.taobao.android.fluid.core.FluidService;
import tb.o6d;
import tb.vng;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ILifecycleService extends FluidService, o6d {
    /* synthetic */ void addPageLifecycleListener(o6d.a aVar);

    /* synthetic */ void addPageLifecycleListener(o6d o6dVar);

    vng getConfig();

    int getPageState();

    boolean isFinish();

    boolean isNavigationBarVisible();

    @Override // tb.o6d
    /* synthetic */ void onCreate();

    @Override // tb.o6d
    /* synthetic */ void onDestroy();

    @Override // tb.o6d
    /* synthetic */ void onPause();

    @Override // tb.o6d
    /* synthetic */ void onRealStart();

    @Override // tb.o6d
    /* synthetic */ void onRealStop();

    @Override // tb.o6d
    /* synthetic */ void onResume();

    @Override // tb.o6d
    /* synthetic */ void onStart();

    @Override // tb.o6d
    /* synthetic */ void onStop();

    /* synthetic */ void removePageLifecycleListener(o6d.a aVar);

    /* synthetic */ void removePageLifecycleListener(o6d o6dVar);
}
