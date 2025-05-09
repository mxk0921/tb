package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class ShopActivity$initComponent$3 extends FunctionReferenceImpl implements u1a<Integer, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopActivity$initComponent$3(ShopActivity shopActivity) {
        super(2, shopActivity, ShopActivity.class, "onHeadCollapsed", "onHeadCollapsed(IZ)V", 0);
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$initComponent$3 shopActivity$initComponent$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$initComponent$3");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Boolean bool) {
        invoke(num.intValue(), bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0702970", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            ShopActivity.r3((ShopActivity) this.receiver, i, z);
        }
    }
}
