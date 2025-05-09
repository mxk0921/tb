package com.taobao.tao.topmultitab.protocol;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.ntd;
import tb.v7d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IHomeSubTabController {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface RefreshState {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState;

        static {
            int[] iArr = new int[TBRefreshHeader.RefreshState.values().length];
            $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState = iArr;
            try {
                iArr[TBRefreshHeader.RefreshState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$taobao$uikit$extend$component$refresh$TBRefreshHeader$RefreshState[TBRefreshHeader.RefreshState.SECOND_FLOOR_END.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    void addPopMessageListenerByMain(IPopViewService.a aVar);

    View createView(Context context);

    String getCurrentSubContainerType();

    Map<String, String> getRequestUpstreamBizParam(String str);

    int getSubContainerScrollY();

    String getSubPageName();

    JSONObject getSubTabData();

    ntd getSubTabParams();

    JSONObject getSubTabSearchBarData();

    JSONObject getSubTabSearchBoxData();

    String getTabBarButtonShowState();

    int getTabLayoutType();

    Map<String, String> getUpdateNextPageProperties();

    String getUpdatePageName();

    Map<String, String> getUpdatePageProperties();

    String getUpdatePageUtParam();

    View getViewBySectionBizCodeAndItemBizCode(String str, String str2);

    boolean isAllowProcessPageBack();

    boolean isEnablePullReFresh();

    boolean isEnableToSecondFloor();

    boolean isHandleUpAndDownScrollingEvent();

    boolean isOnRocketState();

    boolean isReachTop();

    void locationChange(TBLocationDTO tBLocationDTO);

    void notifyOutLinkParams(Intent intent, String str);

    void notifyRefreshPage();

    void onActivityResult(int i, int i2, Intent intent);

    void onAppToBackground();

    void onAppToFront();

    void onClickRocket();

    void onColdStartResume();

    void onCreate();

    void onCustomGlobalThemeChanged(String str, ThemeData themeData, boolean z);

    void onDestroy();

    void onEnterPullSecondFloor();

    void onExitPullSecondFloor();

    void onFestivalRefresh();

    void onPageScrolled(float f, int i);

    void onPageSelected();

    void onPageUnSelected();

    void onPause();

    void onPullDistance(int i);

    void onPullRefresh();

    void onRefreshStateChanged(String str, String str2);

    void onResume();

    void onStart();

    void onStop();

    void onTabClicked();

    void onWillExit();

    void passThroughData(v7d v7dVar, String str, String str2);

    View preCreateView(Context context);

    void removePopMessageListenerByMain(IPopViewService.a aVar);

    boolean scrollToPositionWithOffset(int i, int i2);

    void selectTabByTabId(String str);

    boolean smoothScrollToPositionFromInfoFlow(int i);

    void syncGreyStatus(boolean z);

    void triggerPopRemoveByMain(String str);

    void triggerPopShowByMain(int i, JSONObject jSONObject);
}
