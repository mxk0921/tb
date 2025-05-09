package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class FlagShipContentComponentV3$createSwipeBigCard$1 extends FunctionReferenceImpl implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FlagShipContentComponentV3$createSwipeBigCard$1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(0, flagShipContentComponentV3, FlagShipContentComponentV3.class, "checkBigCardVisible", "checkBigCardVisible()Z", 0);
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$createSwipeBigCard$1 flagShipContentComponentV3$createSwipeBigCard$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$createSwipeBigCard$1");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : FlagShipContentComponentV3.X0((FlagShipContentComponentV3) this.receiver);
    }
}
