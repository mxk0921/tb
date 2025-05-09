package com.alibaba.triver.triver_shop.shop2023;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.alibaba.triver.triver_shop.newShop.view.component.nativeview.Shop2025HeaderNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.vpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$onShopLoftLiveClick$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ View $this_apply;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$onShopLoftLiveClick$1$1(FlagShipV25 flagShipV25, View view) {
        super(0);
        this.this$0 = flagShipV25;
        this.$this_apply = view;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$onShopLoftLiveClick$1$1 flagShipV25$onShopLoftLiveClick$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$onShopLoftLiveClick$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Shop2025HeaderNativeComponent q1 = FlagShipV25.q1(this.this$0);
        if (q1 != null) {
            q1.U0(true);
            ViewGroup e1 = FlagShipV25.e1(this.this$0);
            if (e1 != null) {
                e1.addView(this.$this_apply);
                ViewGroup e12 = FlagShipV25.e1(this.this$0);
                if (e12 != null) {
                    kew.g0(e12);
                    ViewGroup e13 = FlagShipV25.e1(this.this$0);
                    if (e13 != null) {
                        kew.e(e13, FlagShipV25.t1(this.this$0).getHeight());
                        PerceptionSizeFrameLayout r1 = FlagShipV25.r1(this.this$0);
                        if (r1 != null) {
                            kew.d0(r1, FlagShipV25.t1(this.this$0).getHeight());
                            Tab3LiveContentRender x1 = FlagShipV25.x1(this.this$0);
                            if (x1 != null) {
                                x1.j();
                            }
                            ViewGroup y1 = FlagShipV25.y1(this.this$0);
                            if (y1 != null) {
                                kew.C(y1);
                                vpd I = FlagShipV25.v1(this.this$0).I();
                                if (I != null) {
                                    I.c(99, 0);
                                    return;
                                }
                                return;
                            }
                            ckf.y("tabBarContainer");
                            throw null;
                        }
                        ckf.y("navViewContainer");
                        throw null;
                    }
                    ckf.y("bigCardContainer");
                    throw null;
                }
                ckf.y("bigCardContainer");
                throw null;
            }
            ckf.y("bigCardContainer");
            throw null;
        }
        ckf.y("headerNativeComponent");
        throw null;
    }
}
