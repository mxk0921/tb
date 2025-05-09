package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.bop;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopActivity$onPageChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $newBottomIndex;
    public final /* synthetic */ int $newSubIndex;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$onPageChanged$1(ShopActivity shopActivity, int i, int i2) {
        super(0);
        this.this$0 = shopActivity;
        this.$newBottomIndex = i;
        this.$newSubIndex = i2;
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$onPageChanged$1 shopActivity$onPageChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$onPageChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        bop o3 = ShopActivity.o3(this.this$0);
        if (o3 != null) {
            o3.c(this.$newBottomIndex, this.$newSubIndex);
        } else {
            ckf.y("shopBroadCastDelegate");
            throw null;
        }
    }
}
