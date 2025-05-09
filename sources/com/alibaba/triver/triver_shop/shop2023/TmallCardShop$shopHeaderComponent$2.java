package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop$shopHeaderComponent$2 extends Lambda implements d1a<Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$shopHeaderComponent$2(TmallCardShop tmallCardShop) {
        super(0);
        this.this$0 = tmallCardShop;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$shopHeaderComponent$2 tmallCardShop$shopHeaderComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$shopHeaderComponent$2");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Boolean, boolean] */
    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Boolean invoke2() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7560cd03", new Object[]{this})).booleanValue() : this.this$0.c();
    }
}
