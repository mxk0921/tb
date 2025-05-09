package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FarmShop$initComponent$3 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FarmShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FarmShop$initComponent$3(FarmShop farmShop) {
        super(0);
        this.this$0 = farmShop;
    }

    public static /* synthetic */ Object ipc$super(FarmShop$initComponent$3 farmShop$initComponent$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FarmShop$initComponent$3");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue();
        }
        return 1 ^ (FarmShop.k1(this.this$0) ? 1 : 0);
    }
}
