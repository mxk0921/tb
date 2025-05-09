package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV2$initTemplateComponent$4 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV2$initTemplateComponent$4(FlagShipContentComponentV2 flagShipContentComponentV2) {
        super(0);
        this.this$0 = flagShipContentComponentV2;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV2$initTemplateComponent$4 flagShipContentComponentV2$initTemplateComponent$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV2$initTemplateComponent$4");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        Pair<Integer, Integer> Q = ShopExtKt.Q("impression", this.this$0.J().u1());
        npp.a aVar = npp.Companion;
        aVar.f("honorNativeComponent " + Q + ' ');
        if (Q.getFirst().intValue() == 0 && Q.getSecond().intValue() == 0) {
            return null;
        }
        this.this$0.O0(Q.getFirst().intValue(), Q.getSecond().intValue(), "impression");
        return 1;
    }
}
