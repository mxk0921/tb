package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.d1a;
import tb.snp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendShopRouteRequest$1$1$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ JSONObject $shopStructure;
    public final /* synthetic */ Ref$ObjectRef<String> $shopTargetUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShopRouteRequest$1$1$1$1(Context context, JSONObject jSONObject, Ref$ObjectRef<String> ref$ObjectRef) {
        super(0);
        this.$context = context;
        this.$shopStructure = jSONObject;
        this.$shopTargetUrl = ref$ObjectRef;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendShopRouteRequest$1$1$1$1 shopExtKt$sendShopRouteRequest$1$1$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendShopRouteRequest$1$1$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (snp.INSTANCE.a()) {
            ShopExtKt.d(this.$context, this.$shopStructure, this.$shopTargetUrl.element);
        }
    }
}
