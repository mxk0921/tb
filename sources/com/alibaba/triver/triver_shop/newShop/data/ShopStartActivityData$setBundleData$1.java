package com.alibaba.triver.triver_shop.newShop.data;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopStartActivityData$setBundleData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Bundle $bundle;
    public final /* synthetic */ long $bundleId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopStartActivityData$setBundleData$1(long j, Bundle bundle) {
        super(0);
        this.$bundleId = j;
        this.$bundle = bundle;
    }

    public static /* synthetic */ Object ipc$super(ShopStartActivityData$setBundleData$1 shopStartActivityData$setBundleData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/data/ShopStartActivityData$setBundleData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopStartActivityData.a().remove(Long.valueOf(this.$bundleId));
        npp.Companion.b(ckf.p("auto remove shop start data , bundle id ", this.$bundle));
    }
}
