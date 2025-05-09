package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop$initView$1 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Default2023Shop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initView$1(Default2023Shop default2023Shop) {
        super(0);
        this.this$0 = default2023Shop;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initView$1 default2023Shop$initView$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initView$1");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : Default2023Shop.q1(this.this$0);
    }
}
