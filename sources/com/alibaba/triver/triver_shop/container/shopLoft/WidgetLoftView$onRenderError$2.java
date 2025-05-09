package com.alibaba.triver.triver_shop.container.shopLoft;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
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
public final class WidgetLoftView$onRenderError$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WidgetLoftView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetLoftView$onRenderError$2(WidgetLoftView widgetLoftView) {
        super(0);
        this.this$0 = widgetLoftView;
    }

    public static /* synthetic */ Object ipc$super(WidgetLoftView$onRenderError$2 widgetLoftView$onRenderError$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/WidgetLoftView$onRenderError$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (WidgetLoftView.b(this.this$0) == null && WidgetLoftView.a(this.this$0) != null) {
            WidgetLoftView widgetLoftView = this.this$0;
            try {
                View view = null;
                WidgetLoftView.d(widgetLoftView, LayoutInflater.from(WidgetLoftView.a(widgetLoftView)).inflate(R.layout.view_shop_loft_common_error, (ViewGroup) null));
                if (WidgetLoftView.b(widgetLoftView) != null) {
                    TRWidgetInstance c = WidgetLoftView.c(widgetLoftView);
                    if (c != null) {
                        view = c.getRootView();
                    }
                    View b = WidgetLoftView.b(widgetLoftView);
                    if (!(b == null || (findViewById = b.findViewById(R.id.shop_loft_no_data_image)) == null || !(findViewById instanceof TUrlImageView))) {
                        ((TUrlImageView) findViewById).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN012ByUmB1g6BZhIrRaa_!!6000000004092-0-tps-480-480.jpg");
                    }
                    if (view instanceof ViewGroup) {
                        View b2 = WidgetLoftView.b(widgetLoftView);
                        ckf.d(b2);
                        kew.a((ViewGroup) view, b2);
                    }
                    Result.m1108constructorimpl(xhv.INSTANCE);
                }
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
    }
}
