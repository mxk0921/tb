package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.bop;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopActivity$onResume$4 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $needProcessUTEventByComponentSelf;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$onResume$4(ShopActivity shopActivity, Ref$BooleanRef ref$BooleanRef) {
        super(0);
        this.this$0 = shopActivity;
        this.$needProcessUTEventByComponentSelf = ref$BooleanRef;
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$onResume$4 shopActivity$onResume$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$onResume$4");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (ShopActivity.p3(this.this$0) != null && !this.$needProcessUTEventByComponentSelf.element) {
            bop o3 = ShopActivity.o3(this.this$0);
            if (o3 != null) {
                ShopDataParser p3 = ShopActivity.p3(this.this$0);
                if (p3 != null) {
                    int C = p3.C();
                    ShopDataParser p32 = ShopActivity.p3(this.this$0);
                    if (p32 != null) {
                        o3.c(C, p32.p1());
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                } else {
                    ckf.y("shopDataParser");
                    throw null;
                }
            } else {
                ckf.y("shopBroadCastDelegate");
                throw null;
            }
        }
    }
}
