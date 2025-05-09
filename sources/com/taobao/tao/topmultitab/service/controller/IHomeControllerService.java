package com.taobao.tao.topmultitab.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import com.taobao.tao.topmultitab.service.base.IHomeStaticService;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomeControllerService extends IHomeStaticService {
    public static final String HOME_TAB_ID_CAMPAIGN = "campaign";
    public static final String HOME_TAB_ID_HOME = "home";
    public static final String HOME_TAB_ID_HOUR_DELIVERY = "hourlyDelivery";
    public static final String HOME_TAB_ID_RECOMMEND = "recommend";
    public static final String HOME_TAB_ID_SUBSCRIBE = "subscribe";
    public static final String SERVICE_NAME = "HomeControllerService";

    void checkLoadSubscribeBundle();

    Map<String, IHomeSubTabController> getControllers();

    IHomeSubTabController getCurrentSubTabController();

    IHomeSubTabController getHomeSubTabController(String str);

    IHomeSubTabController getLastTabController();

    IHomeSubTabController getRealSubTabController(String str);

    String getSubControllerType(IHomeSubTabController iHomeSubTabController);

    boolean hotSwitchContainer(JSONObject jSONObject);

    void initOverseaTabController();

    boolean isAtRecommendTab();

    boolean isSubscribeTab();

    void registerHomeSubTabController(String str);

    void unRegisterHomeSubTabController(String str);
}
