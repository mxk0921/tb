package com.taobao.infoflow.protocol.subservice.framework;

import android.content.Intent;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.ayd;
import tb.h6d;
import tb.l6d;
import tb.mgb;
import tb.pgb;
import tb.zxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IMainLifecycleService extends ISubService, h6d, zxd, mgb {
    public static final String SERVICE_NAME = "FrameworkService";

    pgb getAppLifeCycleRegister();

    l6d getPageLifeCycleRegister();

    ayd getTabLifeCycleRegister();

    boolean isSelect();

    boolean isVisible();

    /* synthetic */ void onAppToBackground();

    /* synthetic */ void onAppToFront();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onDestroyView();

    /* synthetic */ void onNewIntent(Intent intent);

    /* synthetic */ void onPageScrolled(float f, int i);

    /* synthetic */ void onPageSelected();

    /* synthetic */ void onPageUnSelected();

    /* synthetic */ void onPause();

    /* synthetic */ void onRestart();

    /* synthetic */ void onResume();

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ void onWillExit();
}
