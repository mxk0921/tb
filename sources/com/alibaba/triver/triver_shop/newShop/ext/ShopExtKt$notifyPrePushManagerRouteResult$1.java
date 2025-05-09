package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.cqp;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$notifyPrePushManagerRouteResult$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Intent $finalIntent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$notifyPrePushManagerRouteResult$1(Intent intent) {
        super(0);
        this.$finalIntent = intent;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$notifyPrePushManagerRouteResult$1 shopExtKt$notifyPrePushManagerRouteResult$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$notifyPrePushManagerRouteResult$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            cqp.c(cqp.INSTANCE, this.$finalIntent, false, 2, null);
        }
    }
}
