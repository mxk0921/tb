package com.taobao.android.ultron.common.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum ErrorConstants {
    CONTEXT_NULL("UTR-10001", "DMContext is Null"),
    RESPONSE_JSON_EMPTY("UTR-10100", "Response JSON Empty"),
    PROTOCOL_ROOT_KEY_EMPTY("UTR-10101", "Protocol root key Empty"),
    PROTOCOL_DATA_EMPTY("UTR-10102", "Protocol data node Empty"),
    PROTOCOL_HIERARCHY_EMPTY("UTR-10103", "Protocol hierarchy node Empty"),
    PARSE_COMPONENT_LIST_EMPTY("UTR-10104", "Parse Components List Empty"),
    PARSE_DELTA_TARGET_NULL("UTR-10105", "Parse Delta Target Null"),
    PARSE_DELTA_PARENT_NULL("UTR-10106", "Parse Delta Target Parent Null"),
    SUBMIT_COMPONENT_MAP_NULL("UTR-10107", "Component map Null");
    
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
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/common/utils/ErrorConstants");
    }

    public static ErrorConstants valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorConstants) ipChange.ipc$dispatch("a8086949", new Object[]{str});
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
