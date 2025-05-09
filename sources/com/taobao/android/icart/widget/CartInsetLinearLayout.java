package com.taobao.android.icart.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CartInsetLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151062);
    }

    public CartInsetLinearLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(CartInsetLinearLayout cartInsetLinearLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/CartInsetLinearLayout");
    }

    public void setPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b9f0d", new Object[]{this});
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() + SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }

    public CartInsetLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public CartInsetLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPaddingTop();
    }
}
