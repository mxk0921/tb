package com.alibaba.triver.triver_shop.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.triver.triver_shop.newShop.data.ShopStartActivityData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $bundleId;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $disableShopAnimation;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ Intent $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1(Intent intent, Context context, Intent intent2, boolean z, long j) {
        super(0);
        this.$source = intent;
        this.$context = context;
        this.$intent = intent2;
        this.$disableShopAnimation = z;
        this.$bundleId = j;
    }

    public static /* synthetic */ Object ipc$super(ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1 shopNavAdapter$Companion$canJumpToNativeShop$startAction$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/adapter/ShopNavAdapter$Companion$canJumpToNativeShop$startAction$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Intent intent = this.$source;
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            ShopStartActivityData.INSTANCE.e(this.$bundleId, extras);
        }
        if (!(this.$context instanceof Activity)) {
            this.$intent.setFlags(268435456);
            if (this.$disableShopAnimation) {
                this.$intent.addFlags(65536);
            }
        }
        this.$context.startActivity(this.$intent);
    }
}
