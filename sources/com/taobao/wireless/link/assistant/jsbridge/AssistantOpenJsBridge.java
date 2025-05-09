package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import org.json.JSONObject;
import tb.irg;
import tb.jsg;
import tb.kpw;
import tb.md1;
import tb.t2o;
import tb.ypg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantOpenJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_OPEN = "assistant_open";
    public static final String CLASSNAME_ASSISTANT_OPEN = "AssistantOpenJsBridge";

    static {
        t2o.a(1030750246);
    }

    public static /* synthetic */ Object ipc$super(AssistantOpenJsBridge assistantOpenJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/jsbridge/AssistantOpenJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals(str, ACTION_ASSISTANT_OPEN)) {
                HashMap hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String str3 = jSONObject.has("id") ? (String) jSONObject.get("id") : null;
                    boolean booleanValue = jSONObject.has("needEquity") ? ((Boolean) jSONObject.get("needEquity")).booleanValue() : false;
                    if (jSONObject.has("extraInfo")) {
                        hashMap = (HashMap) jsg.s(jSONObject.getJSONObject("extraInfo"));
                    }
                    md1.h().i(ypg.e().f32260a, str3, booleanValue, hashMap);
                } catch (Exception e) {
                    irg.a("link_tag", "AssistantOpenJsBridge === execute === 打开小助手获取参数异常=" + e.getMessage());
                    return false;
                }
            }
        } catch (Exception e2) {
            irg.a("link_tag", "AssistantOpenJsBridge === execute === 小助手jsbridge调用，打开异常：" + e2.getMessage());
        }
        return false;
    }
}
