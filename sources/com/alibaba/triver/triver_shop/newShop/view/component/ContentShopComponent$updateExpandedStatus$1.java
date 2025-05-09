package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.triver_shop.newShop.view.embed.EmbedShopLoftComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ContentShopComponent$updateExpandedStatus$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ContentShopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$updateExpandedStatus$1(ContentShopComponent contentShopComponent) {
        super(0);
        this.this$0 = contentShopComponent;
    }

    public static /* synthetic */ Object ipc$super(ContentShopComponent$updateExpandedStatus$1 contentShopComponent$updateExpandedStatus$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$updateExpandedStatus$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        EmbedShopLoftComponent c1 = ContentShopComponent.c1(this.this$0);
        if (c1 != null) {
            c1.E();
        }
        xpd e1 = ContentShopComponent.e1(this.this$0);
        if (e1 != null) {
            e1.play();
        }
        ViewGroup X0 = ContentShopComponent.X0(this.this$0);
        if (X0 != null) {
            kew.g0(X0);
            View Z0 = ContentShopComponent.Z0(this.this$0);
            if (Z0 != null) {
                kew.g0(Z0);
                View Y0 = ContentShopComponent.Y0(this.this$0);
                if (Y0 != null) {
                    kew.C(Y0);
                    TUrlImageView d1 = ContentShopComponent.d1(this.this$0);
                    if (d1 != null) {
                        kew.g0(d1);
                    } else {
                        ckf.y("loftAtmosphereBgPic");
                        throw null;
                    }
                } else {
                    ckf.y("bigCardContentFullScreenTopBlackShadow");
                    throw null;
                }
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
