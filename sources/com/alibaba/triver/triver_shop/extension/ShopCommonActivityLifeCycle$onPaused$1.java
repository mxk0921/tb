package com.alibaba.triver.triver_shop.extension;

import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.eop;
import tb.mop;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopCommonActivityLifeCycle$onPaused$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $currentPauseTime;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onPaused$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle, long j) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
        this.$currentPauseTime = j;
    }

    public static /* synthetic */ Object ipc$super(ShopCommonActivityLifeCycle$onPaused$1 shopCommonActivityLifeCycle$onPaused$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/ShopCommonActivityLifeCycle$onPaused$1");
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
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle = this.this$0;
        long j = this.$currentPauseTime;
        try {
            if (!ShopCommonActivityLifeCycle.a(shopCommonActivityLifeCycle)) {
                ShopCommonActivityLifeCycle.d(shopCommonActivityLifeCycle).Z2(mop.KEY_SHOP_NAVI_END, Long.valueOf(j));
                ShopCommonActivityLifeCycle.d(shopCommonActivityLifeCycle).Z2(mop.KEY_FIRST_LEAVE_SHOP_TIME, Long.valueOf(j));
                if (!ckf.b(ShopCommonActivityLifeCycle.d(shopCommonActivityLifeCycle).u0(), eop.XSD_SHOP)) {
                    ShopExtKt.t0(ShopCommonActivityLifeCycle.d(shopCommonActivityLifeCycle));
                }
                ShopCommonActivityLifeCycle.f(shopCommonActivityLifeCycle, true);
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
