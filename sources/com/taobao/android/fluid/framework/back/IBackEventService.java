package com.taobao.android.fluid.framework.back;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.layoutmanager.container.containerlifecycle.GestureLayout;
import tb.o6d;
import tb.qn1;
import tb.vrp;
import tb.yhb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IBackEventService extends FluidService, o6d, yhb {
    public static final String SERVICE_NAME = "IBackEventService";

    void acceptEnableInterceptBackMsg(vrp vrpVar);

    /* synthetic */ void addBackEventListener(yhb yhbVar);

    qn1 getBackKeyEventDetector();

    void handleExitFullPage();

    /* synthetic */ void onBackClick();

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onRealStart();

    /* synthetic */ void onRealStop();

    /* synthetic */ void onResume();

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ void removeBackEventListener(yhb yhbVar);

    void setBackInterceptListener(GestureLayout gestureLayout);

    boolean tryToInterceptBack();
}
