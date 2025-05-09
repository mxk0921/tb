package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class FarmShop$initComponent$4 extends FunctionReferenceImpl implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FarmShop$initComponent$4(FarmShop farmShop) {
        super(1, farmShop, FarmShop.class, "canPullDownSplitHeader", "canPullDownSplitHeader(Z)V", 0);
    }

    public static /* synthetic */ Object ipc$super(FarmShop$initComponent$4 farmShop$initComponent$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$initComponent$4");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else {
            FarmShop.e1((FarmShop) this.receiver, z);
        }
    }
}
