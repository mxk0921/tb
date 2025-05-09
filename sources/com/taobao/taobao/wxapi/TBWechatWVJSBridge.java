package com.taobao.taobao.wxapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cf3;
import tb.gvw;
import tb.hav;
import tb.kpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class TBWechatWVJSBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CALL_MINI_PROGRAM = "callMiniProgram";
    public static final String PLUGIN_NAME = "TBWechatWVJSBridge";

    public static /* synthetic */ Object ipc$super(TBWechatWVJSBridge tBWechatWVJSBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/wxapi/TBWechatWVJSBridge");
    }

    private void launchMiniProgram(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b589db8b", new Object[]{this, str});
            return;
        }
        JSONObject a2 = cf3.a(str);
        String string = a2.getString("userName");
        String string2 = a2.getString("path");
        String string3 = a2.getString("miniProgramType");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
            gvw.l(getContext());
            gvw.b().k(string, string2, Integer.parseInt(string3));
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        hav.d(PLUGIN_NAME, "调用 " + str + " params:" + str2);
        if (ACTION_CALL_MINI_PROGRAM.equals(str)) {
            launchMiniProgram(str2);
        }
        return false;
    }
}
