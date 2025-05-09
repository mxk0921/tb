package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopMoreUtils$shopLoftRemoveCollection$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<String, xhv> $collectionCountCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopMoreUtils$shopLoftRemoveCollection$1(g1a<? super String, xhv> g1aVar) {
        super(1);
        this.$collectionCountCallback = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopMoreUtils$shopLoftRemoveCollection$1 shopMoreUtils$shopLoftRemoveCollection$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$shopLoftRemoveCollection$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(JSONObject jSONObject) {
        JSONObject jSONObject2;
        g1a<String, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583b49d1", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null) {
            String string = jSONObject2.getString("collectionCountStr");
            if (ckf.b(jSONObject2.getString("success"), "true") && string != null && (g1aVar = this.$collectionCountCallback) != null) {
                g1aVar.invoke(string);
            }
        }
    }
}
