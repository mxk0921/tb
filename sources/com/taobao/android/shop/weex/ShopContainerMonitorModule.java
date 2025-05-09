package com.taobao.android.shop.weex;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopContainerMonitorModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412024);
    }

    public static /* synthetic */ Object ipc$super(ShopContainerMonitorModule shopContainerMonitorModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/weex/ShopContainerMonitorModule");
    }

    @JSMethod(uiThread = false)
    public void shopPageRenderFinished(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9956d86", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            WXSDKInstance wXSDKInstance = this.mWXSDKInstance;
            if (wXSDKInstance != null) {
                boolean z = wXSDKInstance.getContext() instanceof ShopRenderActivity;
            }
        } catch (Throwable unused) {
        }
    }
}
