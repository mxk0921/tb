package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3$updateExpandedStatus$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV3$updateExpandedStatus$3(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(0);
        this.this$0 = flagShipContentComponentV3;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$updateExpandedStatus$3 flagShipContentComponentV3$updateExpandedStatus$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$updateExpandedStatus$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ViewGroup b1 = FlagShipContentComponentV3.b1(this.this$0);
        if (b1 != null) {
            kew.C(b1);
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
