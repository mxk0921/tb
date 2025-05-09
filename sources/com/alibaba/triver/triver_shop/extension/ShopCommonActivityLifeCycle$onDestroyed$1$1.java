package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopCommonActivityLifeCycle$onDestroyed$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onDestroyed$1$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
    }

    public static /* synthetic */ Object ipc$super(ShopCommonActivityLifeCycle$onDestroyed$1$1 shopCommonActivityLifeCycle$onDestroyed$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/ShopCommonActivityLifeCycle$onDestroyed$1$1");
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
        try {
            ShopWrapWebView Y0 = ShopCommonActivityLifeCycle.d(this.this$0).Y0();
            if (Y0 != null) {
                Y0.destroy();
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
