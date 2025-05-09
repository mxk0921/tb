package com.taobao.tao.topmultitab.service.searchbar;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.service.base.IHomePageService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomeSearchBarService extends IHomePageService {
    public static final String SERVICE_NAME = "HomeSearchBarService";

    void addViewToMultiTabContainer(View view);

    void createView(View view);

    void forceRefreshSearchBar();

    int getCurrentSearchContainerHeightPX();

    @Deprecated
    DXRootView getDX3SearchView();

    Object getValueFromSearchBarData(String str);

    boolean isDX3SearchViewReady();

    void partialRefreshWidgetNode(String str);

    void refreshSearchBox(JSONObject jSONObject);

    void setSearchBarAlpha(float f);

    void setSearchBarVisibility(int i);

    void setSearchSection(JSONObject jSONObject);
}
