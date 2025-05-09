package com.taobao.android.weex.bridge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexValue;
import java.io.Serializable;
import tb.dwh;
import tb.gce;
import tb.r3x;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformExceptionReportBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(982515837);
    }

    public static void ReportException(String str, String str2, String str3, String str4, String str5, String str6, WeexValue weexValue, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20aae978", new Object[]{str, str2, str3, str4, str5, str6, weexValue, str7});
            return;
        }
        try {
            gce e = r3x.e();
            if (e != null) {
                JSONObject jSONObject = null;
                if (weexValue != null && weexValue.isObject()) {
                    jSONObject = weexValue.toJSONObjectOrNull();
                }
                e.b(str, str2, str3, str4, str5, str6, jSONObject, str7);
            }
        } catch (Throwable th) {
            dwh.i(th);
        }
    }
}
