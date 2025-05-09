package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class NativeShopActivity$initShopView$1 extends FunctionReferenceImpl implements u1a<Boolean, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NativeShopActivity$initShopView$1(NativeShopActivity nativeShopActivity) {
        super(2, nativeShopActivity, NativeShopActivity.class, "headCollapsedCallback", "headCollapsedCallback(ZI)V", 0);
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$initShopView$1 nativeShopActivity$initShopView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$initShopView$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool, Integer num) {
        invoke(bool.booleanValue(), num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a077a3ee", new Object[]{this, new Boolean(z), new Integer(i)});
        } else {
            NativeShopActivity.U3((NativeShopActivity) this.receiver, z, i);
        }
    }
}
