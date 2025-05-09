package com.taobao.android.dinamic.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.bn7;
import tb.t2o;
import tb.tl7;
import tb.tn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DHorizontalScrollLayout extends DFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup containerView;
    public FrameLayout scrollView;
    public String SL_LAYOUT_TYPE_LINEAR = "linear";
    public String SL_LAYOUT_TYPE_FRAME = "frame";
    public String SL_SCROLLBAR_INVISIBLE = "invisible";
    public String SL_SCROLLBAR_VISIBLE = "visible";

    static {
        t2o.a(444596414);
    }

    public DHorizontalScrollLayout(Context context) {
        super(context);
    }

    private void generateChildView(AttributeSet attributeSet, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e12152e", new Object[]{this, attributeSet, bn7Var});
            return;
        }
        HashMap hashMap = (HashMap) tl7.d("DHorizontalScrollLayout").handleAttributeSet(attributeSet).b;
        String str = (String) hashMap.get("dLayoutType");
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(getContext());
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setOverScrollMode(2);
        this.scrollView.setVerticalScrollBarEnabled(false);
        if (!TextUtils.equals((String) hashMap.get("dScrollBar"), this.SL_SCROLLBAR_VISIBLE)) {
            this.scrollView.setHorizontalScrollBarEnabled(false);
        }
        if (TextUtils.equals(str, this.SL_LAYOUT_TYPE_FRAME)) {
            DFrameLayout dFrameLayout = (DFrameLayout) tn7.b("DFrameLayout", getContext(), attributeSet, bn7Var);
            this.containerView = dFrameLayout;
            this.scrollView.addView(dFrameLayout);
        } else {
            DLinearLayout dLinearLayout = (DLinearLayout) tn7.b("DLinearLayout", getContext(), attributeSet, bn7Var);
            this.containerView = dLinearLayout;
            this.scrollView.addView(dLinearLayout);
        }
        super.addView(this.scrollView, -1, generateLayoutParams(attributeSet));
        hashMap.remove("dLayoutType");
        hashMap.remove("dScrollBar");
    }

    public static /* synthetic */ Object ipc$super(DHorizontalScrollLayout dHorizontalScrollLayout, String str, Object... objArr) {
        if (str.hashCode() == 1992612095) {
            super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/view/DHorizontalScrollLayout");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
            return;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.addView(view, i, layoutParams);
        }
    }

    public DHorizontalScrollLayout(Context context, AttributeSet attributeSet, bn7 bn7Var) {
        super(context, attributeSet);
        generateChildView(attributeSet, bn7Var);
    }
}
