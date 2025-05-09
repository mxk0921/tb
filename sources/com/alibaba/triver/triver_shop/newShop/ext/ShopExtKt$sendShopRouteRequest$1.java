package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendShopRouteRequest$1 extends Lambda implements g1a<JSONObject, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isStoreBizType;
    public final /* synthetic */ boolean $match3Rules;
    public final /* synthetic */ Ref$ObjectRef<String> $renderStyleSaver;
    public final /* synthetic */ long $routeStart;
    public final /* synthetic */ String $shopUrl;
    public final /* synthetic */ long $startTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShopRouteRequest$1(String str, Ref$ObjectRef<String> ref$ObjectRef, boolean z, boolean z2, Context context, long j, long j2) {
        super(1);
        this.$shopUrl = str;
        this.$renderStyleSaver = ref$ObjectRef;
        this.$match3Rules = z;
        this.$isStoreBizType = z2;
        this.$context = context;
        this.$startTime = j;
        this.$routeStart = j2;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendShopRouteRequest$1 shopExtKt$sendShopRouteRequest$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendShopRouteRequest$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(JSONObject jSONObject) {
        invoke2(jSONObject);
        return xhv.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fa  */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, java.lang.String] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void invoke2(com.alibaba.fastjson.JSONObject r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$sendShopRouteRequest$1.invoke2(com.alibaba.fastjson.JSONObject):void");
    }
}
