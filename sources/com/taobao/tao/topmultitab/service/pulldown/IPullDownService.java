package com.taobao.tao.topmultitab.service.pulldown;

import android.view.View;
import com.taobao.tao.topmultitab.service.base.IHomePageService;
import com.taobao.tao.topmultitab.service.pulldown.request.SecondFloorConfigResult;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IPullDownService extends IHomePageService {
    public static final String SERVICE_NAME = "PullDownService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onEnterPullSecondFloor();

        void onExitPullSecondFloor();
    }

    void addPullRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener);

    void addPullSecondFloorListener(a aVar);

    void createView(TBSwipeRefreshLayout tBSwipeRefreshLayout, View view);

    float getDistanceToSecondFloor();

    int getRefreshOffset();

    boolean isRefreshing();

    void removePullRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener);

    void removePullSecondFloorListener(a aVar);

    void secondBackHome();

    void setEnablePullRefresh(boolean z);

    void setEnableToSecondFloor(boolean z);

    void setRefreshHeaderAlpha(float f);

    void setRefreshing(boolean z);

    void updateSecondFloorConfig(SecondFloorConfigResult secondFloorConfigResult);
}
