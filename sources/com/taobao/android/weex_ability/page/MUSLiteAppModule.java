package com.taobao.android.weex_ability.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import org.json.JSONArray;
import tb.pvh;
import tb.t2o;
import tb.xwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSLiteAppModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "liteApp";

    static {
        t2o.a(980418664);
    }

    public MUSLiteAppModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSLiteAppModule mUSLiteAppModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/MUSLiteAppModule");
    }

    @MUSMethod(uiThread = true)
    public void getRecentlyApps(pvh pvhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("tb.yln");
            JSONArray jSONArray = (JSONArray) xwh.a(cls, "getRecentlyItem", new Class[0]).invoke(xwh.a(cls, "getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (jSONArray != null) {
                jSONObject.put("result", (Object) jSONArray);
                jSONObject.put("success", (Object) Boolean.TRUE);
            } else {
                jSONObject.put("success", (Object) Boolean.FALSE);
            }
        } catch (Throwable unused) {
            jSONObject.put("success", (Object) Boolean.FALSE);
        }
        if (pvhVar != null) {
            pvhVar.b(jSONObject);
        }
    }
}
