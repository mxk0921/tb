package com.alibaba.ariver.app.api.ui.tabbar;

import android.view.animation.Animation;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarBadgeModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarItemModel;
import com.alibaba.ariver.app.api.ui.tabbar.model.TabBarModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface TabBar {
    public static final int DEFAULT_TABBAR_COUNT = 4;
    public static final int SWITCH_TAB_FROM_CLICK = 2;
    public static final int SWITCH_TAB_FROM_INIT = 0;
    public static final int SWITCH_TAB_FROM_JSAPI = 1;
    public static final int SWITCH_TAB_FROM_PUSH = 3;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface SwitchTabSource {
    }

    void addTabItem(int i, TabBarItemModel tabBarItemModel, boolean z);

    void changeTabBarStyle(TabBarModel tabBarModel, Integer num);

    void create(Page page);

    int getCreateIndex();

    int getCurrentIndex();

    int getIndexByPage(Page page);

    int getIndexByPage(String str);

    int getPageCount();

    Page getSelectedPage();

    Set<Page> getTabPages();

    TabBarModel getTabbarModel();

    void hide(Animation animation);

    void init(TabBarModel tabBarModel);

    boolean isAutoShow();

    boolean isCreated();

    boolean isEnableTabClick();

    boolean isShowing();

    boolean isTabPage(Page page);

    void onDestroy();

    void recreate(String str);

    void removeTabBarBadge(int i);

    void removeTabItem(int i);

    void reset();

    void setAutoShow(boolean z);

    void setEnableTabClick(boolean z);

    void setSelectedPage(Page page);

    void setTabBarBadge(int i, TabBarBadgeModel tabBarBadgeModel);

    void setTabItem(int i, TabBarItemModel tabBarItemModel);

    void show(Page page, Animation animation);

    void showDefaultTab(int i);

    boolean switchTab(int i, int i2);
}
