package com.taobao.ask;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public enum ASK_CONST$ERROR {
    USER_CANCELED("USER_CANCELED", ""),
    INVALID_PARAMS("INVALID_PARAMS", ""),
    PUBLISHER_DEGRADED("PUBLISHER_DEGRADED", ""),
    RENDER_ERROR("RENDER_ERROR", ""),
    PUB_MTOP_FAILED("PUB_MTOP_FAILED", "");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String code;
    private String message;

    ASK_CONST$ERROR(String str, String str2) {
        this.code = str;
        this.message = str2;
    }

    public static /* synthetic */ Object ipc$super(ASK_CONST$ERROR ask_const$error, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ask/ASK_CONST$ERROR");
    }

    public static ASK_CONST$ERROR valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ASK_CONST$ERROR) ipChange.ipc$dispatch("3e4499f4", new Object[]{str});
        }
        return (ASK_CONST$ERROR) Enum.valueOf(ASK_CONST$ERROR.class, str);
    }

    public String getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
        }
        return this.code;
    }

    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        return this.message;
    }

    public JSONObject toJSONObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e5b411a9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", (Object) this.code);
        jSONObject.put("message", (Object) this.message);
        return jSONObject;
    }
}
