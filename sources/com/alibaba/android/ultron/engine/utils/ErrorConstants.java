package com.alibaba.android.ultron.engine.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public enum ErrorConstants {
    ULTRON_INSTANCE_NULL("UTR-20001", "Ultron Instance Null"),
    EVENT_NULL("UTR-20100", "Event Null"),
    EVENT_FIELDS_NULL("UTR-20101", "Event Fields Null"),
    EVENT_MTOP_CONFIG_NULL("UTR-20102", "Event Mtop Config Null"),
    TEMPLATE_URL_NULL("UTR-20201", "Template Url Null"),
    TEMPLATE_FETCH_FAILED("UTR-20202", "Template Fetch Failed"),
    TEMPLATE_KEY_NOT_MATCH("UTR-20203", "Template Id and Key not match");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String errorCode;
    private String errorMsg;

    ErrorConstants(String str, String str2) {
        this.errorCode = str;
        this.errorMsg = str2;
    }

    public static /* synthetic */ Object ipc$super(ErrorConstants errorConstants, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/utils/ErrorConstants");
    }

    public static ErrorConstants valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorConstants) ipChange.ipc$dispatch("fb2b4bb4", new Object[]{str});
        }
        return (ErrorConstants) Enum.valueOf(ErrorConstants.class, str);
    }

    public String errorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3674ce04", new Object[]{this});
        }
        return this.errorCode;
    }

    public String errorMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae7c537a", new Object[]{this});
        }
        return this.errorMsg;
    }
}
