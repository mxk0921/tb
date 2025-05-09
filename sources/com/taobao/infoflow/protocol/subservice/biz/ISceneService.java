package com.taobao.infoflow.protocol.subservice.biz;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.cac;
import tb.dzc;
import tb.e6d;
import tb.e7c;
import tb.e8e;
import tb.ejb;
import tb.hed;
import tb.j4d;
import tb.kgb;
import tb.kqb;
import tb.m4d;
import tb.o1e;
import tb.oqb;
import tb.sad;
import tb.ssd;
import tb.u7d;
import tb.uzc;
import tb.vkd;
import tb.wjd;
import tb.xxd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ISceneService extends ISubService, e6d, xxd, ejb, kgb {
    public static final String SERVICE_NAME = "SceneService";

    View createView(Context context);

    /* synthetic */ kqb getContainerDataInvoker();

    /* synthetic */ oqb getContainerInvoker();

    /* synthetic */ e7c getFirstScreenConfigInvoker();

    /* synthetic */ cac getGlobalThemeInvoker();

    /* synthetic */ dzc getNaviBarInvoker();

    /* synthetic */ uzc getNetRequestInvoke();

    /* synthetic */ j4d getOrderPreRequestInvoker();

    /* synthetic */ m4d getOutLinkInvoker();

    /* synthetic */ u7d getPassParamsInvoker();

    /* synthetic */ sad getPopInvoker();

    /* synthetic */ hed getPullDownRefreshInvoker();

    /* synthetic */ wjd getRequestParamsInvoker();

    /* synthetic */ vkd getRocketInvoker();

    /* synthetic */ ssd getStayTimeInvoker();

    /* synthetic */ o1e getTopViewInvoker();

    /* synthetic */ e8e getUtInvoker();

    /* synthetic */ JSONObject invoke(String str, JSONObject jSONObject);

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
