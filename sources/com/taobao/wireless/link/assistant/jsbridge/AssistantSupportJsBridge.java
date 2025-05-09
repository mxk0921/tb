package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.irg;
import tb.kpw;
import tb.nsw;
import tb.qd1;
import tb.t2o;
import tb.ypg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantSupportJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_SUPPORT = "assistant_support";
    public static final String CLASSNAME_ASSISTANT_SUPPORT = "AssistantSupportJsBridge";

    static {
        t2o.a(1030750250);
    }

    public static /* synthetic */ Object ipc$super(AssistantSupportJsBridge assistantSupportJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/jsbridge/AssistantSupportJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals(str, ACTION_ASSISTANT_SUPPORT)) {
                boolean r = qd1.r(ypg.e().f32260a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("supportAssistant", r);
                nsw nswVar = new nsw();
                nswVar.d("data", jSONObject);
                wVCallBackContext.success(nswVar);
                irg.a("link_tag", "AssistantSupportJsBridge === execute === h5调用是否支持小助手=" + jSONObject);
            }
        } catch (Exception e) {
            irg.a("link_tag", "AssistantSupportJsBridge === execute === 小助手jsbridge调用，是否支持异常：" + e.getMessage());
        }
        return false;
    }
}
