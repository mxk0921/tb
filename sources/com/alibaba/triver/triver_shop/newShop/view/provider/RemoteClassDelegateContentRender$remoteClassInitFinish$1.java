package com.alibaba.triver.triver_shop.newShop.view.provider;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.wpd;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RemoteClassDelegateContentRender$remoteClassInitFinish$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RemoteClassDelegateContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteClassDelegateContentRender$remoteClassInitFinish$1(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        super(0);
        this.this$0 = remoteClassDelegateContentRender;
    }

    public static /* synthetic */ Object ipc$super(RemoteClassDelegateContentRender$remoteClassInitFinish$1 remoteClassDelegateContentRender$remoteClassInitFinish$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/RemoteClassDelegateContentRender$remoteClassInitFinish$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        RemoteClassDelegateContentRender.E(this.this$0, true);
        RemoteClassDelegateContentRender.x(this.this$0).removeView(RemoteClassDelegateContentRender.w(this.this$0));
        RemoteClassDelegateContentRender remoteClassDelegateContentRender = this.this$0;
        RemoteClassDelegateContentRender.F(remoteClassDelegateContentRender, (wpd) RemoteClassDelegateContentRender.A(remoteClassDelegateContentRender).invoke());
        RemoteClassDelegateContentRender.B(this.this$0);
        FrameLayout x = RemoteClassDelegateContentRender.x(this.this$0);
        wpd z = RemoteClassDelegateContentRender.z(this.this$0);
        View contentView = z == null ? null : z.getContentView();
        if (contentView != null) {
            kew.a(x, contentView);
        }
    }
}
