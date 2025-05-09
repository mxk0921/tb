package com.alibaba.triver.triver_shop.extension;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import kotlin.jvm.internal.Lambda;
import tb.arp;
import tb.d1a;
import tb.tnp;
import tb.unp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopCommonActivityLifeCycle$onCreated$1$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onCreated$1$2(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
    }

    public static /* synthetic */ Object ipc$super(ShopCommonActivityLifeCycle$onCreated$1$2 shopCommonActivityLifeCycle$onCreated$1$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/ShopCommonActivityLifeCycle$onCreated$1$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        if (ShopCommonActivityLifeCycle.d(this.this$0).b0()) {
            UCPManager.m(ShopCommonActivityLifeCycle.d(this.this$0).k1(), arp.GROUP_NAME);
        }
        if (ShopCommonActivityLifeCycle.c(this.this$0)) {
            ShopCommonActivityLifeCycle.d(this.this$0).s2(new unp(ShopCommonActivityLifeCycle.d(this.this$0)));
            tnp tnpVar = tnp.INSTANCE;
            tnp.b t = ShopCommonActivityLifeCycle.d(this.this$0).t();
            if (t != null) {
                tnpVar.b((unp) t);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.triver.triver_shop.extension.accs.ShopAccsDataListener");
            }
        }
        ShopCommonActivityLifeCycle shopCommonActivityLifeCycle = this.this$0;
        ShopCommonActivityLifeCycle.e(shopCommonActivityLifeCycle, ShopCommonActivityLifeCycle.d(shopCommonActivityLifeCycle));
    }
}
