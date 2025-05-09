package com.taobao.gateway.dispatch;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.RequestTypeEnum;
import tb.gl4;
import tb.o78;
import tb.r78;
import tb.s0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum GatewayRequestType {
    PAGE_BACK("onResume", Constant.KEY_PAGEBACK, 1, 0),
    SCROLL_NEXT_PAGE("scroll", "scrollNextPage", 1, 0),
    AI_REFRESH("scroll", "aiRefresh", 1, 1),
    LOCATION_CHANGE(r78.LOCATION_CHANGED, r78.LOCATION_CHANGED, 1, 0),
    SECOND_REFRESH("secondRequest", "secondRequest", 1, 0),
    SWITCH_CONTAINER("switchDataWithContainerId", "editionSwitch", 2, 0),
    LOGIN_SUCCESS(o78.REFRESH_SOURCE_LOGIN_SUCCESS, LogContext.ENVENT_USERLOGIN, 1, 0),
    COLD_START("onCreate", "coldStart", 1, 0),
    HOT_START("fromBackground", o78.REFRESH_SOURCE_HOT_START, 1, 0),
    PULL_DOWN(gl4.CONFIG_PULL_DOWN, "pullRefresh", 1, 0),
    URL_START("onNewIntent", "preview", 1, 0),
    PAGE_ENTER("pageEnter", "pageEnter", 1, 1),
    PAGE_REFRESH("pageRefresh", "pageRefresh", 1, 1),
    PAGE_ENTER_REMIND_CLICKED("pageEnter", "pageEnter", 2, 2),
    ERROR_RETRY("errorRetry", "errorRetry", 1, 0),
    DATA_DEL("dataDel", "dataDel"),
    DATA_UPDATE("dataUpdate", "dataUpdate"),
    TIP_REPLACE("tipReplace", "tipReplace", 1, 1),
    TIP_REMOVE("tipRemove", "tipRemove", 1, 1),
    TIP_CLOSE("tipClose", "tipClose", 1, 1),
    HOME_TAB_APPEAR("onTabSelected", "homeTabAppear", 1, 0),
    RESPONSE_SUCCESS("responseSuccess", "responseSuccess"),
    RESPONSE_FAILED("responseFailed", "responseFailed"),
    LOAD_CACHE(s0j.MTS_SUB_STAGE_LOAD_CACHE, s0j.MTS_SUB_STAGE_LOAD_CACHE),
    FAST_LOAD_CACHE("fastLoadCache", "fastLoadCache"),
    PREPARE_PARAMS("prepareParams", "prepareParams"),
    INTERNAL_ERROR("internalError", "internalError");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String behavior;
    public int otherConflictStrategy;
    public int processType;
    public String request;
    public int selfConflictStrategy;

    GatewayRequestType(String str, String str2, int i, int i2) {
        this.behavior = str;
        this.request = str2;
        this.selfConflictStrategy = i;
        this.otherConflictStrategy = i2;
    }

    public static GatewayRequestType getGatewayRequestType(RequestTypeEnum requestTypeEnum) {
        GatewayRequestType[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatewayRequestType) ipChange.ipc$dispatch("4699e308", new Object[]{requestTypeEnum});
        }
        for (GatewayRequestType gatewayRequestType : values()) {
            if (TextUtils.equals(requestTypeEnum.behaviorName, gatewayRequestType.behavior)) {
                return gatewayRequestType;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(GatewayRequestType gatewayRequestType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/gateway/dispatch/GatewayRequestType");
    }

    public static GatewayRequestType valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GatewayRequestType) ipChange.ipc$dispatch("c96f4330", new Object[]{str});
        }
        return (GatewayRequestType) Enum.valueOf(GatewayRequestType.class, str);
    }

    GatewayRequestType(String str, String str2) {
        this.selfConflictStrategy = -1;
        this.otherConflictStrategy = -1;
        this.behavior = str;
        this.request = str2;
    }
}
