package com.taobao.tao.topmultitab.service.lifecycle;

import android.content.Intent;
import com.taobao.tao.topmultitab.service.base.IHomePageService;
import com.taobao.tao.topmultitab.service.lifecycle.listener.IPageLifeCycle;
import tb.j6d;
import tb.kkc;
import tb.lgb;
import tb.ogb;
import tb.p4d;
import tb.q4d;
import tb.uwc;
import tb.vwc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomePageLifecycleService extends IHomePageService, lgb, IPageLifeCycle, q4d, uwc {
    public static final String SERVICE_NAME = "HomePageLifecycleService";

    ogb getAppLifeCycleRegister();

    p4d getOutLinkRegister();

    j6d getPageLifeCycleRegister();

    vwc getTabLifeCycleRegister();

    /* synthetic */ void onActivityResult(int i, int i2, Intent intent);

    /* synthetic */ void onAppToBackground();

    /* synthetic */ void onAppToFront();

    /* synthetic */ void onCreate();

    /* synthetic */ void onCreateView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onLazyInit();

    /* synthetic */ void onOutLink(String str, Intent intent, String str2);

    /* synthetic */ void onPause();

    /* synthetic */ void onResume(String str);

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ void onWillExit();

    /* synthetic */ void selectMultiTab(String str, kkc kkcVar, int i);
}
