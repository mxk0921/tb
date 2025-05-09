package com.taobao.android.interactive_common.wxmodule;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.nav.Nav;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import tb.kq9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CXNavModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(CXNavModule cXNavModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/wxmodule/CXNavModule");
    }

    @JSMethod
    public void closeFloatLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203a0674", new Object[]{this});
            return;
        }
        kq9.b("CXNavModule_closeFloatLayer", null);
        WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
        if (wXSDKInstance != null && wXSDKInstance.getContext() != null && (this.mWXSDKInstance.getContext() instanceof CXCommonActivity)) {
            ((CXCommonActivity) this.mWXSDKInstance.getContext()).finish();
            ((CXCommonActivity) this.mWXSDKInstance.getContext()).overridePendingTransition(17432576, 17432577);
        }
    }

    @JSMethod
    public void openFloatLayer(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9178ad", new Object[]{this, hashMap});
        } else if (hashMap != null) {
            try {
                WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
                if (wXSDKInstance != null && wXSDKInstance.getContext() != null) {
                    String str = (String) hashMap.get("url");
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str);
                    kq9.b("CXNavModule_openFloatLayer", hashMap2);
                    Bundle bundle = new Bundle();
                    bundle.putString("extraData", JSON.toJSONString(hashMap.get("extraData")));
                    Nav.from(this.mWXSDKInstance.getContext()).withExtras(bundle).toUri(str);
                }
            } catch (Exception unused) {
            }
        }
    }
}
