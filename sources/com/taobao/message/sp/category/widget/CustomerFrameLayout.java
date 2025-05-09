package com.taobao.message.sp.category.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class CustomerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int defaultHeight = DisplayUtil.ap2DesignScalePx(ApplicationUtil.getApplication(), 93.0f);
    private View hedaView;

    static {
        t2o.a(550502422);
    }

    public CustomerFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CustomerFrameLayout customerFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/CustomerFrameLayout");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        if (this.hedaView.getMeasuredHeight() != 0) {
            i3 = this.hedaView.getMeasuredHeight();
        } else {
            i3 = this.defaultHeight;
        }
        setMeasuredDimension(size, i3);
    }

    public void setHedaView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d1914a", new Object[]{this, view});
        } else {
            this.hedaView = view;
        }
    }

    public CustomerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
