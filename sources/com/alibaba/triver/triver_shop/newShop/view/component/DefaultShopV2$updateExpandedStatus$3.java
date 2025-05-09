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
public final class DefaultShopV2$updateExpandedStatus$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DefaultShopV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultShopV2$updateExpandedStatus$3(DefaultShopV2 defaultShopV2) {
        super(0);
        this.this$0 = defaultShopV2;
    }

    public static /* synthetic */ Object ipc$super(DefaultShopV2$updateExpandedStatus$3 defaultShopV2$updateExpandedStatus$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/DefaultShopV2$updateExpandedStatus$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ViewGroup X0 = DefaultShopV2.X0(this.this$0);
        if (X0 != null) {
            kew.C(X0);
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
