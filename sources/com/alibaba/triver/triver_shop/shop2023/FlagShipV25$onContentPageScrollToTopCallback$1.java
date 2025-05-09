package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.ShopOptSwipeLayout;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$onContentPageScrollToTopCallback$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$onContentPageScrollToTopCallback$1(FlagShipV25 flagShipV25) {
        super(0);
        this.this$0 = flagShipV25;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$onContentPageScrollToTopCallback$1 flagShipV25$onContentPageScrollToTopCallback$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$onContentPageScrollToTopCallback$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!FlagShipV25.m1(this.this$0) && !FlagShipV25.l1(this.this$0) && !FlagShipV25.o1(this.this$0)) {
            Shop2025HeaderNativeComponent q1 = FlagShipV25.q1(this.this$0);
            if (q1 == null) {
                ckf.y("headerNativeComponent");
                throw null;
            } else if (Shop2025HeaderNativeComponent.X(q1, null, 1, null)) {
                ShopOptSwipeLayout s1 = FlagShipV25.s1(this.this$0);
                if (s1 == null) {
                    ckf.y("outerSwiperLayout");
                    throw null;
                } else if (!s1.getAlreadyTouch()) {
                    if (!this.this$0.O() || !FlagShipV25.p1(this.this$0)) {
                        Shop2025HeaderNativeComponent q12 = FlagShipV25.q1(this.this$0);
                        if (q12 != null) {
                            Shop2025HeaderNativeComponent.M(q12, false, 0L, 2, null);
                        } else {
                            ckf.y("headerNativeComponent");
                            throw null;
                        }
                    } else {
                        Shop2025HeaderNativeComponent q13 = FlagShipV25.q1(this.this$0);
                        if (q13 == null) {
                            ckf.y("headerNativeComponent");
                            throw null;
                        } else if (q13.f1()) {
                            Shop2025HeaderNativeComponent q14 = FlagShipV25.q1(this.this$0);
                            if (q14 != null) {
                                q14.N();
                            } else {
                                ckf.y("headerNativeComponent");
                                throw null;
                            }
                        } else {
                            Shop2025HeaderNativeComponent q15 = FlagShipV25.q1(this.this$0);
                            if (q15 != null) {
                                Shop2025HeaderNativeComponent.M(q15, true, 0L, 2, null);
                            } else {
                                ckf.y("headerNativeComponent");
                                throw null;
                            }
                        }
                    }
                }
            }
        }
    }
}
