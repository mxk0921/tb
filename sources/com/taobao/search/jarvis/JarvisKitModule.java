package com.taobao.search.jarvis;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.cbk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class JarvisKitModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "JarvisKit";
    private static final String TAG = "JarviskitModule";

    static {
        t2o.a(815792275);
    }

    public static /* synthetic */ Object ipc$super(JarvisKitModule jarvisKitModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/JarvisKitModule");
    }

    @JSMethod
    public void recordItemClick(JSONObject jSONObject) {
        cbk.a E1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f854e5", new Object[]{this, jSONObject});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if ((wXSDKInstance instanceof cbk) && (E1 = ((cbk) wXSDKInstance).E1()) != null) {
            E1.r2("recordItemClick", jSONObject, null, null);
        }
    }
}
