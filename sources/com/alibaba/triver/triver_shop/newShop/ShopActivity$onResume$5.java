package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopActivity$onResume$5 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopActivity$onResume$5(ShopActivity shopActivity) {
        super(0);
        this.this$0 = shopActivity;
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$onResume$5 shopActivity$onResume$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$onResume$5");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (ShopActivity.p3(this.this$0) != null) {
            ShopDataParser p3 = ShopActivity.p3(this.this$0);
            if (p3 != null) {
                ShopUTExposeEventKt.h(p3);
                ShopDataParser p32 = ShopActivity.p3(this.this$0);
                if (p32 == null) {
                    ckf.y("shopDataParser");
                    throw null;
                } else if (!p32.H1()) {
                    ShopDataParser p33 = ShopActivity.p3(this.this$0);
                    if (p33 != null) {
                        ShopUTExposeEventKt.l(p33);
                        ShopDataParser p34 = ShopActivity.p3(this.this$0);
                        if (p34 != null) {
                            ShopUTExposeEventKt.i(p34);
                            ShopDataParser p35 = ShopActivity.p3(this.this$0);
                            if (p35 != null) {
                                ShopUTExposeEventKt.k(p35);
                                ShopDataParser p36 = ShopActivity.p3(this.this$0);
                                if (p36 != null) {
                                    ShopUTExposeEventKt.d(p36);
                                } else {
                                    ckf.y("shopDataParser");
                                    throw null;
                                }
                            } else {
                                ckf.y("shopDataParser");
                                throw null;
                            }
                        } else {
                            ckf.y("shopDataParser");
                            throw null;
                        }
                    } else {
                        ckf.y("shopDataParser");
                        throw null;
                    }
                }
            } else {
                ckf.y("shopDataParser");
                throw null;
            }
        }
    }
}
