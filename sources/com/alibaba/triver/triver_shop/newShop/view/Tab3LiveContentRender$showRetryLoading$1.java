package com.alibaba.triver.triver_shop.newShop.view;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.Tab3LiveContentRender;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Tab3LiveContentRender$showRetryLoading$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Tab3LiveContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tab3LiveContentRender$showRetryLoading$1(Tab3LiveContentRender tab3LiveContentRender) {
        super(0);
        this.this$0 = tab3LiveContentRender;
    }

    public static /* synthetic */ Object ipc$super(Tab3LiveContentRender$showRetryLoading$1 tab3LiveContentRender$showRetryLoading$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3LiveContentRender$showRetryLoading$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        View v = Tab3LiveContentRender.v(this.this$0);
        if ((v == null ? null : v.getParent()) != null && Tab3LiveContentRender.u(this.this$0) == Tab3LiveContentRender.LiveStatus.RETRY_LOADING) {
            this.this$0.K();
        }
    }
}
