package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;
import tb.z9w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBLoftDWShopVideoView$getWebView$4 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TBLoftDWShopVideoView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TBLoftDWShopVideoView$getWebView$4(TBLoftDWShopVideoView tBLoftDWShopVideoView) {
        super(1);
        this.this$0 = tBLoftDWShopVideoView;
    }

    public static /* synthetic */ Object ipc$super(TBLoftDWShopVideoView$getWebView$4 tBLoftDWShopVideoView$getWebView$4, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/TBLoftDWShopVideoView$getWebView$4");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
            return;
        }
        z9w Y = TBLoftDWShopVideoView.Y(this.this$0);
        if (Y != null) {
            Y.g(z);
        } else {
            ckf.y("videoPlayController");
            throw null;
        }
    }
}
