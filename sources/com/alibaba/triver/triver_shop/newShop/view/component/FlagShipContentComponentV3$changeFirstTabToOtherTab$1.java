package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3$changeFirstTabToOtherTab$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV3$changeFirstTabToOtherTab$1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(0);
        this.this$0 = flagShipContentComponentV3;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$changeFirstTabToOtherTab$1 flagShipContentComponentV3$changeFirstTabToOtherTab$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$changeFirstTabToOtherTab$1");
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
            h1.C();
        }
        SwipeBigCardComponent r1 = FlagShipContentComponentV3.r1(this.this$0);
        if (!(r1 == null || (c = r1.c()) == null)) {
            c.C();
        }
        SwipeBigCardComponent r12 = FlagShipContentComponentV3.r1(this.this$0);
        if (r12 != null) {
            r12.l();
        }
        ViewGroup b1 = FlagShipContentComponentV3.b1(this.this$0);
        if (b1 != null) {
            kew.C(b1);
            View c1 = FlagShipContentComponentV3.c1(this.this$0);
            if (c1 != null) {
                kew.B(c1);
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
