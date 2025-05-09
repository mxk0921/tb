package com.taobao.android.fluid.framework.hostapp;

import android.content.Context;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.layoutmanager.module.NavigationTabModule;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IHostAppService extends FluidService {
    public static final String SERVICE_NAME = "IHostAppService";

    /* synthetic */ void addNavigationShowHideStatusListener(NavigationTabModule.d dVar);

    int getCurrentTabIndex();

    int getTabIndex();

    boolean isTBMainActivity(Context context);

    boolean isTabBarHide();

    boolean isTaoBaoApp(Context context);

    /* synthetic */ void removeNavigationShowHideStatusListener(NavigationTabModule.d dVar);
}
