package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.spp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV2$onStatusBarStyleChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$onStatusBarStyleChanged$1(FlagShipContentComponentV2 flagShipContentComponentV2) {
        super(0);
        this.this$0 = flagShipContentComponentV2;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV2$onStatusBarStyleChanged$1 flagShipContentComponentV2$onStatusBarStyleChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$onStatusBarStyleChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (this.this$0.v() && this.this$0.o() == 0 && this.this$0.r()) {
            z = true;
        }
        boolean c = spp.c(this.this$0.J().R());
        if (z || c) {
            this.this$0.f();
        } else {
            this.this$0.e();
        }
    }
}
