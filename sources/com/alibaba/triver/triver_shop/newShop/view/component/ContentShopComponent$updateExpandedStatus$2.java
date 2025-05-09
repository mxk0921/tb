package com.alibaba.triver.triver_shop.newShop.view.component;

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
public final class ContentShopComponent$updateExpandedStatus$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ContentShopComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentShopComponent$updateExpandedStatus$2(ContentShopComponent contentShopComponent) {
        super(0);
        this.this$0 = contentShopComponent;
    }

    public static /* synthetic */ Object ipc$super(ContentShopComponent$updateExpandedStatus$2 contentShopComponent$updateExpandedStatus$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/ContentShopComponent$updateExpandedStatus$2");
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
            c1.C();
        }
        xpd e1 = ContentShopComponent.e1(this.this$0);
        if (e1 != null) {
            e1.pause();
        }
        TUrlImageView d1 = ContentShopComponent.d1(this.this$0);
        if (d1 != null) {
            kew.B(d1);
        } else {
            ckf.y("loftAtmosphereBgPic");
            throw null;
        }
    }
}
