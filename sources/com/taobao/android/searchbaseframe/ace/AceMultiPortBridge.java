package com.taobao.android.searchbaseframe.ace;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.c4p;
import tb.kpw;
import tb.t2o;
import tb.t70;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AceMultiPortBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_NAME = "ACEMultiPortBridge";

    static {
        t2o.a(993001575);
    }

    public static /* synthetic */ Object ipc$super(AceMultiPortBridge aceMultiPortBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/AceMultiPortBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "fetchCurrentPort")) {
            int b = t70.c().b();
            c4p.m(PLUGIN_NAME, "ace current port:" + b);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("port", (Object) String.valueOf(b));
            wVCallBackContext.success(jSONObject.toString());
        }
        return false;
    }
}
