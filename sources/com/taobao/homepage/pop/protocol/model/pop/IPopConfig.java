package com.taobao.homepage.pop.protocol.model.pop;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IPopConfig extends Serializable {

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface FatigueReportStyle {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PopContentType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PopHierarchyType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PopPointYType {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface PopTriggerType {
    }

    boolean enablePopControl();

    JSONObject getBizParams();

    List<String> getDeltaWhiteList();

    String getFatigueReportStyle();

    int getHierarchy();

    IPopPoint getPoint();

    int getPointY();

    int getPopContentType();

    String getPopHierarchyName();

    long getRefreshInterval();

    String getRequestType();

    String getScrollToSection();

    int getSelectMaxCount();

    int getSelectMinCount();

    int getShowMaxCount();

    long getShowTimeMills();

    int getTrigger();

    String getWeexUrl();

    boolean isForceUpdate();

    boolean isInterceptClick();

    boolean isPageSwitchHidden();

    boolean isPopLayerHidden();

    boolean isPopMessage();

    boolean isSideslipHidden();

    boolean isTabSwitchHidden();
}
