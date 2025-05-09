package com.taobao.search.sf.uikit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchInsetFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793471);
    }

    public SearchInsetFrameLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(SearchInsetFrameLayout searchInsetFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/uikit/SearchInsetFrameLayout");
    }

    public void clearPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77261b8", new Object[]{this});
        } else {
            setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i3 = layoutParams.height;
            if (i3 <= 0) {
                i3 = (int) getContext().getResources().getDimension(R.dimen.uik_immersive_action_bar_height);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + getPaddingTop(), 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b9f0d", new Object[]{this});
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() + SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }

    public SearchInsetFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SearchInsetFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPaddingTop();
    }
}
