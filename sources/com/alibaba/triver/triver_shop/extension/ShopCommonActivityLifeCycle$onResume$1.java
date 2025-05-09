package com.alibaba.triver.triver_shop.extension;

import android.content.Context;
import com.alibaba.triver.triver_shop.extension.accs.ShopAccsUpStreamData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.khu;
import tb.tnp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopCommonActivityLifeCycle$onResume$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopCommonActivityLifeCycle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopCommonActivityLifeCycle$onResume$1(ShopCommonActivityLifeCycle shopCommonActivityLifeCycle) {
        super(0);
        this.this$0 = shopCommonActivityLifeCycle;
    }

    public static /* synthetic */ Object ipc$super(ShopCommonActivityLifeCycle$onResume$1 shopCommonActivityLifeCycle$onResume$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/ShopCommonActivityLifeCycle$onResume$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (ShopCommonActivityLifeCycle.c(this.this$0) && ShopCommonActivityLifeCycle.b(this.this$0)) {
            tnp tnpVar = tnp.INSTANCE;
            ShopAccsUpStreamData.ChannelCode channelCode = ShopAccsUpStreamData.ChannelCode.onShopEnter;
            Context Q = ShopCommonActivityLifeCycle.d(this.this$0).Q();
            String str2 = "";
            if (Q == null || (str = khu.c(Q)) == null) {
                str = str2;
            }
            String N0 = ShopCommonActivityLifeCycle.d(this.this$0).N0();
            if (N0 == null) {
                N0 = str2;
            }
            String W0 = ShopCommonActivityLifeCycle.d(this.this$0).W0();
            if (W0 != null) {
                str2 = W0;
            }
            tnpVar.c(new ShopAccsUpStreamData(channelCode, str, N0, str2));
        }
    }
}
