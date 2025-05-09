package com.taobao.wireless.link.assistant.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.irg;
import tb.jsg;
import tb.kpw;
import tb.t2o;
import tb.ypg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantHomeJsBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_HOME = "assistant_home";
    public static final String CLASSNAME_ASSISTANT_HOME = "AssistantHomeJsBridge";

    static {
        t2o.a(1030750245);
    }

    public static /* synthetic */ Object ipc$super(AssistantHomeJsBridge assistantHomeJsBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/jsbridge/AssistantHomeJsBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals(str, ACTION_ASSISTANT_HOME)) {
                irg.a("link_tag", "AssistantHomeJsBridge === execute === h5调用跳转桌面");
                jsg.t(ypg.e().f32260a);
            }
        } catch (Exception e) {
            irg.a("link_tag", "AssistantHomeJsBridge === execute === 小助手jsbridge调用，跳转桌面异常：" + e.getMessage());
        }
        return false;
    }
}
