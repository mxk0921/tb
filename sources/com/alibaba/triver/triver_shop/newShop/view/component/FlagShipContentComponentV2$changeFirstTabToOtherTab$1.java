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
public final class FlagShipContentComponentV2$changeFirstTabToOtherTab$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$changeFirstTabToOtherTab$1(FlagShipContentComponentV2 flagShipContentComponentV2) {
        super(0);
        this.this$0 = flagShipContentComponentV2;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV2$changeFirstTabToOtherTab$1 flagShipContentComponentV2$changeFirstTabToOtherTab$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$changeFirstTabToOtherTab$1");
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
        EmbedShopLoftComponent g1 = FlagShipContentComponentV2.g1(this.this$0);
        if (g1 != null) {
            g1.C();
        }
        SwipeBigCardComponent r1 = FlagShipContentComponentV2.r1(this.this$0);
        if (!(r1 == null || (c = r1.c()) == null)) {
            c.C();
        }
        SwipeBigCardComponent r12 = FlagShipContentComponentV2.r1(this.this$0);
        if (r12 != null) {
            r12.l();
        }
        ViewGroup a1 = FlagShipContentComponentV2.a1(this.this$0);
        if (a1 != null) {
            kew.C(a1);
            View b1 = FlagShipContentComponentV2.b1(this.this$0);
            if (b1 != null) {
                kew.B(b1);
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
