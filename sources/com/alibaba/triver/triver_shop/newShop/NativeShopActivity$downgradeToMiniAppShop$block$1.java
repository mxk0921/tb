package com.alibaba.triver.triver_shop.newShop;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$downgradeToMiniAppShop$block$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$downgradeToMiniAppShop$block$1(NativeShopActivity nativeShopActivity) {
        super(0);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$downgradeToMiniAppShop$block$1 nativeShopActivity$downgradeToMiniAppShop$block$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$downgradeToMiniAppShop$block$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!this.this$0.isFinishing() && !NativeShopActivity.E3(this.this$0)) {
            NativeShopActivity.h4(this.this$0, true);
            Uri z3 = NativeShopActivity.z3(this.this$0);
            if (z3 == null) {
                this.this$0.finish();
                return;
            }
            Nav.from(this.this$0).toUri(z3);
            this.this$0.finish();
        }
    }
}
