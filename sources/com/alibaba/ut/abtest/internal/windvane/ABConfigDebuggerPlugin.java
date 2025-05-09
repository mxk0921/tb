package com.alibaba.ut.abtest.internal.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kpw;
import tb.n;
import tb.nsw;
import tb.ogh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ABConfigDebuggerPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME = "ABConfigDebuggerJSBridge";
    private static final String TAG = "ABConfigDebuggerPlugin";

    static {
        t2o.a(961544402);
    }

    public static /* synthetic */ Object ipc$super(ABConfigDebuggerPlugin aBConfigDebuggerPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/windvane/ABConfigDebuggerPlugin");
    }

    private void mockDraft(String str, WVCallBackContext wVCallBackContext) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e890c5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        if ("beta_test".equals(jSONObject.getString("type"))) {
            n.j().e().r("beta_test");
        }
        nsw nswVar = new nsw();
        nswVar.d("data", jSONObject);
        nswVar.b("msg", "force pull success.");
        wVCallBackContext.success(nswVar);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        try {
            if (TextUtils.equals("mockDraft", str)) {
                mockDraft(str2, wVCallBackContext);
                return true;
            }
        } catch (Exception e) {
            ogh.j(TAG, "ABConfigDebuggerJSBridge:" + str, e);
        }
        return false;
    }
}
