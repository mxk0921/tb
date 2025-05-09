package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class OverseaShop$updateExpandedStatus$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ OverseaShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverseaShop$updateExpandedStatus$2(OverseaShop overseaShop) {
        super(0);
        this.this$0 = overseaShop;
    }

    public static /* synthetic */ Object ipc$super(OverseaShop$updateExpandedStatus$2 overseaShop$updateExpandedStatus$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/OverseaShop$updateExpandedStatus$2");
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
        View X0 = OverseaShop.X0(this.this$0);
        if (X0 != null) {
            kew.B(X0);
            TUrlImageView Z0 = OverseaShop.Z0(this.this$0);
            if (Z0 != null) {
                kew.B(Z0);
            } else {
                ckf.y("loftAtmosphereBgPic");
                throw null;
            }
        } else {
            ckf.y("bigCardTopBlackShadowBg");
            throw null;
        }
    }
}
