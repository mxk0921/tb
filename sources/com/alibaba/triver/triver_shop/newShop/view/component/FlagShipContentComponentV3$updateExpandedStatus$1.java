package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3$updateExpandedStatus$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV3$updateExpandedStatus$1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(0);
        this.this$0 = flagShipContentComponentV3;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$updateExpandedStatus$1 flagShipContentComponentV3$updateExpandedStatus$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$updateExpandedStatus$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        EmbedShopLoftComponent c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        EmbedShopLoftComponent h1 = FlagShipContentComponentV3.h1(this.this$0);
        if (h1 != null) {
            h1.E();
        }
        SwipeBigCardComponent r1 = FlagShipContentComponentV3.r1(this.this$0);
        if (!(r1 == null || (c = r1.c()) == null)) {
            c.E();
        }
        SwipeBigCardComponent r12 = FlagShipContentComponentV3.r1(this.this$0);
        if (r12 != null) {
            r12.k();
        }
        ViewGroup b1 = FlagShipContentComponentV3.b1(this.this$0);
        if (b1 != null) {
            kew.g0(b1);
            View c1 = FlagShipContentComponentV3.c1(this.this$0);
            if (c1 != null) {
                kew.g0(c1);
                TUrlImageView j1 = FlagShipContentComponentV3.j1(this.this$0);
                if (j1 != null) {
                    kew.g0(j1);
                } else {
                    ckf.y("loftAtmosphereBgPic");
                    throw null;
                }
            } else {
                ckf.y("bigCardTopBlackShadowBg");
                throw null;
            }
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
