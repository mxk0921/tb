package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $resumeData;
    public final /* synthetic */ ShopWrapWebView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1(ShopWrapWebView shopWrapWebView, JSONObject jSONObject) {
        super(0);
        this.this$0 = shopWrapWebView;
        this.$resumeData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1 shopWrapWebView$startRenderByRealUrl$injectJsBlock$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/extend/ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopWrapWebView shopWrapWebView = this.this$0;
        shopWrapWebView.evaluateJavascript("if (window.onNShopPreloadResume) {window.onNShopPreloadResume(" + this.$resumeData + ");} else {window.__nShopPreloadResumeData__ = " + this.$resumeData + '}', new WVUCWebView.WVValueCallback() { // from class: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/extend/ShopWrapWebView$startRenderByRealUrl$injectJsBlock$1$1");
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebView.WVValueCallback
            public void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                } else {
                    npp.Companion.b(ckf.p("shopIndex star render by real url get message : ", str));
                }
            }
        });
    }
}
