package com.alibaba.triver.triver_shop.shop2023;

import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023BaseComponent$initComponent$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FragmentActivity $context;
    public final /* synthetic */ ShopDataParser $shopData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BaseComponent$initComponent$1(FragmentActivity fragmentActivity, ShopDataParser shopDataParser) {
        super(0);
        this.$context = fragmentActivity;
        this.$shopData = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseComponent$initComponent$1 shop2023BaseComponent$initComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Shop2023BaseComponent$initComponent$1");
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
        FragmentActivity fragmentActivity = this.$context;
        Intent intent = fragmentActivity.getIntent();
        String str = null;
        if (!(intent == null || (data = intent.getData()) == null)) {
            str = data.toString();
        }
        ShopExtKt.m0(fragmentActivity, str, this.$shopData);
    }
}
