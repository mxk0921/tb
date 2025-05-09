package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Default2023Shop$initComponent$3 extends FunctionReferenceImpl implements g1a<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Default2023Shop$initComponent$3(Default2023Shop default2023Shop) {
        super(1, default2023Shop, Default2023Shop.class, "changeToCrossStoreStyle", "changeToCrossStoreStyle(Z)Z", 0);
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initComponent$3 default2023Shop$initComponent$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initComponent$3");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue() : Default2023Shop.e1((Default2023Shop) this.receiver, z);
    }
}
