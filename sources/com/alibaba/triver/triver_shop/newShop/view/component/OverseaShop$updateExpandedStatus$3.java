package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class OverseaShop$updateExpandedStatus$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ OverseaShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaShop$updateExpandedStatus$3(OverseaShop overseaShop) {
        super(0);
        this.this$0 = overseaShop;
    }

    public static /* synthetic */ Object ipc$super(OverseaShop$updateExpandedStatus$3 overseaShop$updateExpandedStatus$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop$updateExpandedStatus$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ViewGroup W0 = OverseaShop.W0(this.this$0);
        if (W0 != null) {
            kew.C(W0);
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
