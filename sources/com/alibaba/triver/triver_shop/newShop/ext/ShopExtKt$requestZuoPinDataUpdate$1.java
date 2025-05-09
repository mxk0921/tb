package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$requestZuoPinDataUpdate$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<Boolean, xhv> $needShowRedDotCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopExtKt$requestZuoPinDataUpdate$1(g1a<? super Boolean, xhv> g1aVar) {
        super(1);
        this.$needShowRedDotCallback = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$requestZuoPinDataUpdate$1 shopExtKt$requestZuoPinDataUpdate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$requestZuoPinDataUpdate$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
            return;
        }
        String str = null;
        if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject("data")) == null)) {
            str = jSONObject3.getString("status");
        }
        this.$needShowRedDotCallback.invoke(Boolean.valueOf(ckf.b("1", str)));
    }
}
