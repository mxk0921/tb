package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Intent;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.gop;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopDXEngine$downgradeToMiniAppShop$block$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDXEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDXEngine$downgradeToMiniAppShop$block$1(ShopDXEngine shopDXEngine) {
        super(0);
        this.this$0 = shopDXEngine;
    }

    public static /* synthetic */ Object ipc$super(ShopDXEngine$downgradeToMiniAppShop$block$1 shopDXEngine$downgradeToMiniAppShop$block$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopDXEngine$downgradeToMiniAppShop$block$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!ShopDXEngine.b(this.this$0).isFinishing() && !ShopDXEngine.d(this.this$0)) {
            ShopDXEngine.e(this.this$0, true);
            Intent intent = ShopDXEngine.b(this.this$0).getIntent();
            Uri a2 = gop.a(intent == null ? null : intent.getData());
            if (a2 == null) {
                ShopDXEngine.b(this.this$0).finish();
                return;
            }
            Nav.from(ShopDXEngine.b(this.this$0)).toUri(a2);
            ShopDXEngine.b(this.this$0).finish();
        }
    }
}
