package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWebUCClient$createShopLoft$1$1$1 extends Lambda implements u1a<String, JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopWebUCClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWebUCClient$createShopLoft$1$1$1(ShopWebUCClient shopWebUCClient) {
        super(2);
        this.this$0 = shopWebUCClient;
    }

    public static /* synthetic */ Object ipc$super(ShopWebUCClient$createShopLoft$1$1$1 shopWebUCClient$createShopLoft$1$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/extend/ShopWebUCClient$createShopLoft$1$1$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, JSONObject jSONObject) {
        invoke2(str, jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe686b07", new Object[]{this, str, jSONObject});
        } else {
            WVStandardEventCenter.postNotificationToJS(this.this$0.b(), str, jSONObject == null ? null : jSONObject.toString());
        }
    }
}
