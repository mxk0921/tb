package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.d1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndicatorView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private d1a<xhv> onLayoutListener;

    static {
        t2o.a(766510402);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndicatorView(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(ShopIndicatorView shopIndicatorView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/ShopIndicatorView");
    }

    public final d1a<xhv> getOnLayoutListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("1a337ac3", new Object[]{this});
        }
        return this.onLayoutListener;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        d1a<xhv> d1aVar = this.onLayoutListener;
        if (d1aVar != null) {
            d1aVar.invoke();
        }
    }

    public final void setOnLayoutListener(d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1990cad", new Object[]{this, d1aVar});
        } else {
            this.onLayoutListener = d1aVar;
        }
    }

    public ShopIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
