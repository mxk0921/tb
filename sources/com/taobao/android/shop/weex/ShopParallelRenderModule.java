package com.taobao.android.shop.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.opp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopParallelRenderModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(764412033);
    }

    public static /* synthetic */ Object ipc$super(ShopParallelRenderModule shopParallelRenderModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/weex/ShopParallelRenderModule");
    }

    @JSMethod(uiThread = false)
    public void hookBackKey(boolean z, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e738a90", new Object[]{this, new Boolean(z), jSCallback});
            return;
        }
        opp.o("shop", "main-cost hookBackPress " + z);
        try {
            Context context = this.mWXSDKInstance.getContext();
            if (context instanceof ShopRenderActivity) {
                ((ShopRenderActivity) context).mHookBackPress = z;
            } else {
                jSCallback.invoke("failed. not ShopRenderActivity");
            }
        } catch (Exception e) {
            jSCallback.invoke("exception " + e.getMessage());
        }
    }

    @JSMethod(uiThread = false)
    public void merge(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f80f1f", new Object[]{this, str, jSCallback});
            return;
        }
        opp.o("shop", "main-cost merge-cost 前端触发 merge 传递 ref 值 " + str);
        try {
            Context context = this.mWXSDKInstance.getContext();
            if (context instanceof ShopRenderActivity) {
                ((ShopRenderActivity) context).addToParent(str, jSCallback);
            } else {
                jSCallback.invoke("failed. not ShopRenderActivity");
            }
        } catch (Exception e) {
            jSCallback.invoke("exception " + e.getMessage());
        }
    }
}
