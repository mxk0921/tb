package com.taobao.android.detail.ttdetail.bridge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TTWXModule";

    static {
        t2o.a(912261339);
    }

    public static void initBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdd68c0", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("detail_utils", TTWXModule.class);
        } catch (Throwable th) {
            tgh.c(TAG, "initBridge error", th);
        }
    }

    public static /* synthetic */ Object ipc$super(TTWXModule tTWXModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/bridge/TTWXModule");
    }

    @WXModuleAnno
    public void openUrlByNav(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f474d8", new Object[]{this, str});
            return;
        }
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null) {
            q84.f(wXSDKInstance.getContext(), new rc7("openUrl", new JSONObject(str) { // from class: com.taobao.android.detail.ttdetail.bridge.TTWXModule.1
                public final /* synthetic */ String val$url;

                {
                    this.val$url = str;
                    put("url", (Object) str);
                }
            }, new RuntimeAbilityParam[0]));
        }
    }
}
