package com.alibaba.triver.triver_shop.newShop.view.provider;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.kew;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class RemoteClassDelegateContentRender$remoteClassInitFailed$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ RemoteClassDelegateContentRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteClassDelegateContentRender$remoteClassInitFailed$1(RemoteClassDelegateContentRender remoteClassDelegateContentRender) {
        super(0);
        this.this$0 = remoteClassDelegateContentRender;
    }

    public static /* synthetic */ Object ipc$super(RemoteClassDelegateContentRender$remoteClassInitFailed$1 remoteClassDelegateContentRender$remoteClassInitFailed$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/provider/RemoteClassDelegateContentRender$remoteClassInitFailed$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        RemoteClassDelegateContentRender remoteClassDelegateContentRender = this.this$0;
        try {
            RemoteClassDelegateContentRender.E(remoteClassDelegateContentRender, true);
            RemoteClassDelegateContentRender.x(remoteClassDelegateContentRender).removeView(RemoteClassDelegateContentRender.w(remoteClassDelegateContentRender));
            kew.a(RemoteClassDelegateContentRender.x(remoteClassDelegateContentRender), ShopExtKt.u(RemoteClassDelegateContentRender.v(remoteClassDelegateContentRender)));
            ShopDataParser o = RemoteClassDelegateContentRender.y(remoteClassDelegateContentRender).o();
            if (o != null) {
                o.Y2("ShopPageErrorByRemoteModuleLoadFailed", RemoteClassDelegateContentRender.y(remoteClassDelegateContentRender).k());
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }
}
