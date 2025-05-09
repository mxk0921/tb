package com.taobao.android.order.bundle.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wq2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OrderCornerLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wq2 cLipRadiusHandler;

    static {
        t2o.a(713031983);
    }

    public OrderCornerLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(OrderCornerLinearLayout orderCornerLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/widget/OrderCornerLinearLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        this.cLipRadiusHandler.b(this, canvas);
        super.dispatchDraw(canvas);
        this.cLipRadiusHandler.a(this, canvas);
    }

    public void setClipRadiusHandler(wq2 wq2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("592fcdab", new Object[]{this, wq2Var});
        } else {
            this.cLipRadiusHandler = wq2Var;
        }
    }

    public OrderCornerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OrderCornerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
