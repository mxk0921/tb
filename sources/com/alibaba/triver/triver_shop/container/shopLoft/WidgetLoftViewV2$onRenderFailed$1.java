package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WidgetLoftViewV2$onRenderFailed$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WidgetLoftViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetLoftViewV2$onRenderFailed$1(WidgetLoftViewV2 widgetLoftViewV2) {
        super(0);
        this.this$0 = widgetLoftViewV2;
    }

    public static /* synthetic */ Object ipc$super(WidgetLoftViewV2$onRenderFailed$1 widgetLoftViewV2$onRenderFailed$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/WidgetLoftViewV2$onRenderFailed$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (WidgetLoftViewV2.p(this.this$0) == null && WidgetLoftViewV2.o(this.this$0) != null) {
            WidgetLoftViewV2 widgetLoftViewV2 = this.this$0;
            try {
                View view = null;
                WidgetLoftViewV2.r(widgetLoftViewV2, LayoutInflater.from(WidgetLoftViewV2.o(widgetLoftViewV2)).inflate(R.layout.view_shop_loft_common_error, (ViewGroup) null));
                if (WidgetLoftViewV2.p(widgetLoftViewV2) != null) {
                    TMSEmbed q = WidgetLoftViewV2.q(widgetLoftViewV2);
                    if (q != null) {
                        view = q.h();
                    }
                    View p = WidgetLoftViewV2.p(widgetLoftViewV2);
                    if (!(p == null || (findViewById = p.findViewById(R.id.shop_loft_no_data_image)) == null || !(findViewById instanceof TUrlImageView))) {
                        ((TUrlImageView) findViewById).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN012ByUmB1g6BZhIrRaa_!!6000000004092-0-tps-480-480.jpg");
                    }
                    if (view instanceof ViewGroup) {
                        View p2 = WidgetLoftViewV2.p(widgetLoftViewV2);
                        ckf.d(p2);
                        kew.a((ViewGroup) view, p2);
                    }
                    Result.m1108constructorimpl(xhv.INSTANCE);
                }
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
    }
}
