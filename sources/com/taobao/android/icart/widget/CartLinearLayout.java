package com.taobao.android.icart.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.manager.ListTopManager;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mChangeMeasureListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    static {
        t2o.a(478151063);
    }

    public CartLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CartLinearLayout cartLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/CartLinearLayout");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        a aVar = this.mChangeMeasureListener;
        if (aVar != null) {
            ((ListTopManager.d) aVar).a();
        }
    }

    public void setChangeMeasureListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b21f5e", new Object[]{this, aVar});
        } else {
            this.mChangeMeasureListener = aVar;
        }
    }

    public CartLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CartLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
