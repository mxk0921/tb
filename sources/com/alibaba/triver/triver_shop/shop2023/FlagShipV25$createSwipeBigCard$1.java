package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class FlagShipV25$createSwipeBigCard$1 extends FunctionReferenceImpl implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FlagShipV25$createSwipeBigCard$1(FlagShipV25 flagShipV25) {
        super(0, flagShipV25, FlagShipV25.class, "checkBigCardVisible", "checkBigCardVisible()Z", 0);
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$createSwipeBigCard$1 flagShipV25$createSwipeBigCard$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$createSwipeBigCard$1");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : FlagShipV25.G1((FlagShipV25) this.receiver);
    }
}
