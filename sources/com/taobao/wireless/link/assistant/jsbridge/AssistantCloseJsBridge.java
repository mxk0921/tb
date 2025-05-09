package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.irg;
import tb.kpw;
import tb.md1;
import tb.t2o;
import tb.ypg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantCloseJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_CLOSE = "assistant_close";
    public static final String CLASSNAME_ASSISTANT_CLOSE = "AssistantCloseJsBridge";

    static {
        t2o.a(1030750244);
    }

    public static /* synthetic */ Object ipc$super(AssistantCloseJsBridge assistantCloseJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/jsbridge/AssistantCloseJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals(str, ACTION_ASSISTANT_CLOSE)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String str3 = jSONObject.has("id") ? (String) jSONObject.get("id") : null;
                    irg.a("link_tag", "AssistantCloseJsBridge === execute === 关闭小助手，活动id=" + str3);
                    md1.h().d(ypg.e().f32260a, str3);
                } catch (Exception e) {
                    irg.a("link_tag", "AssistantCloseJsBridge === execute === 关闭小助手异常=" + e.getMessage());
                    return false;
                }
            }
        } catch (Exception e2) {
            irg.a("link_tag", "AssistantCloseJsBridge === execute === 小助手jsbridge调用，关闭异常：" + e2.getMessage());
        }
        return false;
    }
}
