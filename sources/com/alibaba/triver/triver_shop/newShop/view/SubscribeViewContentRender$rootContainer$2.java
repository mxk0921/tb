package com.alibaba.triver.triver_shop.newShop.view;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SubscribeViewContentRender$rootContainer$2 extends Lambda implements d1a<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ SubscribeViewContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribeViewContentRender$rootContainer$2(SubscribeViewContentRender subscribeViewContentRender) {
        super(0);
        this.this$0 = subscribeViewContentRender;
    }

    public static /* synthetic */ Object ipc$super(SubscribeViewContentRender$rootContainer$2 subscribeViewContentRender$rootContainer$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/SubscribeViewContentRender$rootContainer$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final FrameLayout invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this}) : new FrameLayout(SubscribeViewContentRender.v(this.this$0));
    }
}
