package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class OverseaShop$changeFirstTabToOtherTab$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ OverseaShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaShop$changeFirstTabToOtherTab$1(OverseaShop overseaShop) {
        super(0);
        this.this$0 = overseaShop;
    }

    public static /* synthetic */ Object ipc$super(OverseaShop$changeFirstTabToOtherTab$1 overseaShop$changeFirstTabToOtherTab$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop$changeFirstTabToOtherTab$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        EmbedShopLoftComponent Y0 = OverseaShop.Y0(this.this$0);
        if (Y0 != null) {
            Y0.C();
        }
        ViewGroup W0 = OverseaShop.W0(this.this$0);
        if (W0 != null) {
            kew.C(W0);
            View X0 = OverseaShop.X0(this.this$0);
            if (X0 != null) {
                kew.B(X0);
            } else {
                ckf.y("bigCardTopBlackShadowBg");
                throw null;
            }
        } else {
            ckf.y("bigCardContainer");
            throw null;
        }
    }
}
