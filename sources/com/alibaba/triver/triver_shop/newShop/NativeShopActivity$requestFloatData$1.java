package com.alibaba.triver.triver_shop.newShop;

import android.content.Intent;
import android.net.Uri;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$requestFloatData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$requestFloatData$1(NativeShopActivity nativeShopActivity) {
        super(0);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$requestFloatData$1 nativeShopActivity$requestFloatData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$requestFloatData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        NativeShopActivity nativeShopActivity = this.this$0;
        Intent intent = nativeShopActivity.getIntent();
        String uri = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        ShopDataParser I3 = NativeShopActivity.I3(this.this$0);
        if (I3 != null) {
            ShopExtKt.m0(nativeShopActivity, uri, I3);
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }
}
