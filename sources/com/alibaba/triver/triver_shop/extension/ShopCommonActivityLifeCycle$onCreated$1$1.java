package com.alibaba.triver.triver_shop.extension;

import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopCommonActivityLifeCycle$onCreated$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onCreated$1$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
    }

    public static /* synthetic */ Object ipc$super(ShopCommonActivityLifeCycle$onCreated$1$1 shopCommonActivityLifeCycle$onCreated$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/ShopCommonActivityLifeCycle$onCreated$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        npp.a aVar = npp.Companion;
        Uri K0 = ShopCommonActivityLifeCycle.d(this.this$0).K0();
        aVar.b(K0 == null ? null : K0.toString());
    }
}
