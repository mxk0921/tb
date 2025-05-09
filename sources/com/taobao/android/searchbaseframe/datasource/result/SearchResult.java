package com.taobao.android.searchbaseframe.datasource.result;

import android.os.Parcelable;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.Map;
import java.util.Set;
import tb.gy;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface SearchResult extends Parcelable {
    boolean bizRuleNoResult();

    int calcMuiseCellCount();

    yko getCore();

    ResultError getError();

    int getPageNo();

    int getPageSize();

    gy.c getSearchConfig();

    Map<String, TemplateBean> getTemplates();

    int getTotalResult();

    boolean hasListResult();

    boolean isCache();

    boolean isFailed();

    boolean isNew();

    boolean isPageFinished();

    boolean isPreload();

    boolean isSseFinished();

    boolean isSseMode();

    boolean isSuccess();

    void merge(SearchResult searchResult);

    void partialMerge(Set<String> set, SearchResult searchResult);

    void setCache(boolean z);

    void setCore(yko ykoVar);

    void setPreLoad(boolean z);

    void setResultError(ResultError resultError);

    void setSearchConfig(gy.c cVar);

    void setSseFinished(boolean z);

    void setSseMode(boolean z);
}
