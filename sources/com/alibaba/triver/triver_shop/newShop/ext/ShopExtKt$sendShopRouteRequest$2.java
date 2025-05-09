package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.mop;
import tb.npp;
import tb.od7;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendShopRouteRequest$2 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isStoreBizType;
    public final /* synthetic */ String $shopUrl;
    public final /* synthetic */ long $startTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShopRouteRequest$2(boolean z, Context context, String str, long j) {
        super(2);
        this.$isStoreBizType = z;
        this.$context = context;
        this.$shopUrl = str;
        this.$startTime = j;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendShopRouteRequest$2 shopExtKt$sendShopRouteRequest$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendShopRouteRequest$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("routeRequestError : " + i + ',' + ((Object) str));
        if (!this.$isStoreBizType) {
            ShopExtKt.a(this.$context, this.$shopUrl);
        }
        Intent intent = new Intent();
        long j = this.$startTime;
        boolean z = this.$isStoreBizType;
        String str2 = this.$shopUrl;
        Bundle bundle = new Bundle();
        bundle.putLong(mop.KEY_APP_START, j);
        bundle.putBoolean(od7.e.SHOW_ERROR, z);
        bundle.putString("originalRouteUrl", str2);
        xhv xhvVar = xhv.INSTANCE;
        intent.putExtras(bundle);
        ShopExtKt.c(intent);
    }
}
