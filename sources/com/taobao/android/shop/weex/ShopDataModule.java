package com.taobao.android.shop.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopDataModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412025);
    }

    public static /* synthetic */ Object ipc$super(ShopDataModule shopDataModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/weex/ShopDataModule");
    }

    @JSMethod(uiThread = false)
    public Object get(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bc5abfb4", new Object[]{this, str, map});
        }
        try {
            Context context = this.mWXSDKInstance.getContext();
            if (context instanceof ShopRenderActivity) {
                return ((ShopRenderActivity) context).getShopData(str, map);
            }
            return "failed. not ShopRenderActivity";
        } catch (Exception e) {
            return "exception. " + e.getMessage();
        }
    }

    @JSMethod(uiThread = false)
    public void getAsync(String str, Map<String, String> map, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7d25fa", new Object[]{this, str, map, jSCallback});
            return;
        }
        HashMap hashMap = new HashMap(2);
        try {
            Context context = this.mWXSDKInstance.getContext();
            if (context instanceof ShopRenderActivity) {
                ((ShopRenderActivity) context).getShopData(str, map, jSCallback);
            } else {
                hashMap.put("result", "failed. not ShopRenderActivity");
                jSCallback.invoke(hashMap);
            }
        } catch (Exception e) {
            hashMap.put("result", "exception. " + e.getMessage());
            jSCallback.invoke(hashMap);
        }
    }

    @JSMethod(uiThread = false)
    public void sendGlobalEvent(String str, Map<String, Object> map, String str2, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cc5579", new Object[]{this, str, map, str2, jSCallback});
            return;
        }
        HashMap hashMap = new HashMap(2);
        try {
            Context context = this.mWXSDKInstance.getContext();
            if (context instanceof ShopRenderActivity) {
                ((ShopRenderActivity) context).sendGlobalEvent(str, map, str2, jSCallback);
            } else {
                hashMap.put("result", "failed. not ShopRenderActivity");
                jSCallback.invoke(hashMap);
            }
        } catch (Exception e) {
            hashMap.put("result", "exception. " + e.getMessage());
            jSCallback.invoke(hashMap);
        }
    }
}
