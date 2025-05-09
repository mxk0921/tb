package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.shop2023.template.OverseaShopHeaderInfoTemplate;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class OverseaShop$onSubscribeStatusChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $subscribeData;
    public final /* synthetic */ boolean $subscribed;
    public final /* synthetic */ OverseaShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaShop$onSubscribeStatusChanged$1(OverseaShop overseaShop, boolean z, JSONObject jSONObject) {
        super(0);
        this.this$0 = overseaShop;
        this.$subscribed = z;
        this.$subscribeData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(OverseaShop$onSubscribeStatusChanged$1 overseaShop$onSubscribeStatusChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop$onSubscribeStatusChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        OverseaShopHeaderInfoTemplate c1 = OverseaShop.c1(this.this$0);
        if (c1 != null) {
            c1.J(this.$subscribed, this.$subscribeData);
        }
    }
}
