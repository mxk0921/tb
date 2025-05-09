package com.alibaba.triver.triver_shop.shop2023;

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
public final class TmallCardShop$changeFirstTabToOtherTab$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$changeFirstTabToOtherTab$1(TmallCardShop tmallCardShop) {
        super(0);
        this.this$0 = tmallCardShop;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$changeFirstTabToOtherTab$1 tmallCardShop$changeFirstTabToOtherTab$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$changeFirstTabToOtherTab$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        EmbedShopLoftComponent k1 = TmallCardShop.k1(this.this$0);
        if (k1 != null) {
            k1.C();
        }
        ViewGroup f1 = TmallCardShop.f1(this.this$0);
        if (f1 != null) {
            kew.C(f1);
            View g1 = TmallCardShop.g1(this.this$0);
            if (g1 != null) {
                kew.B(g1);
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
