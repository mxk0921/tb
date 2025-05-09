package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class FlagShipContentComponentV3$initComponent$2 extends FunctionReferenceImpl implements g1a<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FlagShipContentComponentV3$initComponent$2(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(1, flagShipContentComponentV3, FlagShipContentComponentV3.class, "changeToCrossStoreStyle", "changeToCrossStoreStyle(Z)Z", 0);
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$initComponent$2 flagShipContentComponentV3$initComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$initComponent$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue() : FlagShipContentComponentV3.W0((FlagShipContentComponentV3) this.receiver, z);
    }
}
