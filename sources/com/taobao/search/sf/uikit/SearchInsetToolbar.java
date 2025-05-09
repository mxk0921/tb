package com.taobao.search.sf.uikit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.oxb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SearchInsetToolbar extends Toolbar {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mRequirePaddingTop;

    static {
        t2o.a(815793472);
    }

    public SearchInsetToolbar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(SearchInsetToolbar searchInsetToolbar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 765565787:
                super.setBackground((Drawable) objArr[0]);
                return null;
            case 1812230441:
                super.setBackgroundColor(((Number) objArr[0]).intValue());
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/uikit/SearchInsetToolbar");
        }
    }

    private boolean isDarkMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ded1a48e", new Object[]{this})).booleanValue();
        }
        if (!(getContext() instanceof oxb) || !((oxb) getContext()).E1()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
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
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + SystemBarDecorator.getStatusBarHeight(getContext()), 1073741824));
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da19b5b", new Object[]{this, drawable});
        } else if (drawable == null || !isDarkMode()) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else if (!isDarkMode()) {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
        } else if (drawable == null || !isDarkMode()) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setPaddingTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44b9f0d", new Object[]{this});
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() + SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
        }
    }

    public SearchInsetToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SearchInsetToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRequirePaddingTop = true;
        setPaddingTop();
    }
}
