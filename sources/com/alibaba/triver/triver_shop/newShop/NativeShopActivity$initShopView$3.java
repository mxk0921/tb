package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class NativeShopActivity$initShopView$3 extends FunctionReferenceImpl implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public NativeShopActivity$initShopView$3(NativeShopActivity nativeShopActivity) {
        super(0, nativeShopActivity, NativeShopActivity.class, "canSwipeDown", "canSwipeDown()Z", 0);
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$initShopView$3 nativeShopActivity$initShopView$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$initShopView$3");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : NativeShopActivity.l3((NativeShopActivity) this.receiver);
    }
}
