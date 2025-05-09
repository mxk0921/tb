package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class FarmShop$initComponent$5 extends FunctionReferenceImpl implements g1a<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FarmShop$initComponent$5(FarmShop farmShop) {
        super(1, farmShop, FarmShop.class, "changeToCrossStoreStyle", "changeToCrossStoreStyle(Z)Z", 0);
    }

    public static /* synthetic */ Object ipc$super(FarmShop$initComponent$5 farmShop$initComponent$5, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$initComponent$5");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue() : FarmShop.f1((FarmShop) this.receiver, z);
    }
}
