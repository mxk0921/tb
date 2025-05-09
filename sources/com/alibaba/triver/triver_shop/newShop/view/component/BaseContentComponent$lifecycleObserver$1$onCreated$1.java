package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npp;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseContentComponent$lifecycleObserver$1$onCreated$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BaseContentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentComponent$lifecycleObserver$1$onCreated$1(BaseContentComponent baseContentComponent) {
        super(0);
        this.this$0 = baseContentComponent;
    }

    public static /* synthetic */ Object ipc$super(BaseContentComponent$lifecycleObserver$1$onCreated$1 baseContentComponent$lifecycleObserver$1$onCreated$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/BaseContentComponent$lifecycleObserver$1$onCreated$1");
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
        BaseContentComponent baseContentComponent = this.this$0;
        try {
            int i = r54.m(baseContentComponent.n()).widthPixels;
            if (baseContentComponent.v()) {
                ShopUTExposeEventKt.a(baseContentComponent.J(), baseContentComponent.k() / i);
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
