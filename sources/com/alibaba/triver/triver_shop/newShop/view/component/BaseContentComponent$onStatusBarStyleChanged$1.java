package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseContentComponent$onStatusBarStyleChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BaseContentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentComponent$onStatusBarStyleChanged$1(BaseContentComponent baseContentComponent) {
        super(0);
        this.this$0 = baseContentComponent;
    }

    public static /* synthetic */ Object ipc$super(BaseContentComponent$onStatusBarStyleChanged$1 baseContentComponent$onStatusBarStyleChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/BaseContentComponent$onStatusBarStyleChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!this.this$0.v() || this.this$0.o() != 0 || !this.this$0.r()) {
            this.this$0.e();
        } else {
            this.this$0.f();
        }
    }
}
