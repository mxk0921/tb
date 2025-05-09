package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.spp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop$onStatusBarStyleChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$onStatusBarStyleChanged$1(TmallCardShop tmallCardShop) {
        super(0);
        this.this$0 = tmallCardShop;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$onStatusBarStyleChanged$1 tmallCardShop$onStatusBarStyleChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$onStatusBarStyleChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        boolean c = spp.c(TmallCardShop.o1(this.this$0).R());
        if (this.this$0.O() || c) {
            TmallCardShop.e1(this.this$0);
        } else {
            TmallCardShop.d1(this.this$0);
        }
    }
}
