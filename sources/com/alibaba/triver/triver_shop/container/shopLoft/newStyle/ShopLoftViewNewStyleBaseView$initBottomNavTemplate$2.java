package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftViewNewStyleBaseView$initBottomNavTemplate$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $templateData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftViewNewStyleBaseView$initBottomNavTemplate$2(JSONObject jSONObject) {
        super(0);
        this.$templateData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftViewNewStyleBaseView$initBottomNavTemplate$2 shopLoftViewNewStyleBaseView$initBottomNavTemplate$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftViewNewStyleBaseView$initBottomNavTemplate$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            npp.Companion.b(ckf.p("shop loft bottom nav template load failed , ", this.$templateData));
        }
    }
}
