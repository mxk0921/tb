package com.taobao.homepage.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import tb.gl4;
import tb.o78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum RequestTypeEnum {
    COLD_START("onCreate", "coldStart"),
    HOT_START("fromBackground", o78.REFRESH_SOURCE_HOT_START),
    PULL_DOWN(gl4.CONFIG_PULL_DOWN, gl4.CONFIG_PULL_DOWN),
    LOGIN_SUCCESS(o78.REFRESH_SOURCE_LOGIN_SUCCESS, o78.REFRESH_SOURCE_LOGIN_SUCCESS),
    PAGE_SWITCH("onResume", IMainFeedsLoopStartStopService.a.PAGE_SWITCH),
    URL_START("onNewIntent", "urlStart"),
    PREPARE_PARAMS("prepareParams", "prepareParams"),
    TAB_SELECTED("onTabSelected", "onTabSelected"),
    SWITCH_CONTAINER("switchDataWithContainerId", "switchContainer");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String behaviorName;
    public String requestName;

    RequestTypeEnum(String str, String str2) {
        this.behaviorName = str;
        this.requestName = str2;
    }

    public static /* synthetic */ Object ipc$super(RequestTypeEnum requestTypeEnum, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/utils/RequestTypeEnum");
    }

    public static RequestTypeEnum valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RequestTypeEnum) ipChange.ipc$dispatch("c39dbfcc", new Object[]{str});
        }
        return (RequestTypeEnum) Enum.valueOf(RequestTypeEnum.class, str);
    }
}
