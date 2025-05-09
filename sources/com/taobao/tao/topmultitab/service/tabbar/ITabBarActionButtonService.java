package com.taobao.tao.topmultitab.service.tabbar;

import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ITabBarActionButtonService extends IHomePageService {
    public static final String SERVICE_NAME = "TabBarActionButtonService";

    void changeToHomepageButtonView();

    void changeToR4UButtonView();

    void setRocketState(boolean z);

    void setTabBarActionButtonState(String str);
}
