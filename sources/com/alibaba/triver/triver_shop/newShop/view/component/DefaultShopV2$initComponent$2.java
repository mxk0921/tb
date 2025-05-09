package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class DefaultShopV2$initComponent$2 extends FunctionReferenceImpl implements g1a<Boolean, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DefaultShopV2$initComponent$2(DefaultShopV2 defaultShopV2) {
        super(1, defaultShopV2, DefaultShopV2.class, "changeToCrossStoreStyle", "changeToCrossStoreStyle(Z)Z", 0);
    }

    public static /* synthetic */ Object ipc$super(DefaultShopV2$initComponent$2 defaultShopV2$initComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/DefaultShopV2$initComponent$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return Boolean.valueOf(invoke(bool.booleanValue()));
    }

    public final boolean invoke(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("36b985b9", new Object[]{this, new Boolean(z)})).booleanValue() : DefaultShopV2.W0((DefaultShopV2) this.receiver, z);
    }
}
