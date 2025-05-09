package com.taobao.uikit.immersive;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBInsetRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mRequirePaddingTop;

    public TBInsetRelativeLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(TBInsetRelativeLayout tBInsetRelativeLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/immersive/TBInsetRelativeLayout");
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            int i4 = layoutParams.height;
            if (i4 > 0) {
                i3 = i4;
            }
            if (i3 > 0) {
                i3 += SystemBarDecorator.getStatusBarHeight(getContext());
            }
            setFitsSystemWindows(true);
            if (i3 > 0) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            } else {
                super.onMeasure(i, i2);
            }
        } else {
            super.onMeasure(i, i2);
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

    public void setRequirePaddingTop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d0bd06", new Object[]{this, new Boolean(z)});
            return;
        }
        boolean z2 = this.mRequirePaddingTop;
        if (z2 != z) {
            if (z2) {
                setPadding(getPaddingLeft(), getPaddingTop() - SystemBarDecorator.getStatusBarHeight(getContext()), getPaddingRight(), getPaddingBottom());
            } else {
                setPaddingTop();
            }
        }
        this.mRequirePaddingTop = z;
    }

    public TBInsetRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* JADX WARN: Finally extract failed */
    public TBInsetRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRequirePaddingTop = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TBInsetRelativeLayout, 0, 0);
        try {
            this.mRequirePaddingTop = obtainStyledAttributes.getBoolean(R.styleable.TBInsetRelativeLayout_requirePaddingTop, true);
            obtainStyledAttributes.recycle();
            if (this.mRequirePaddingTop) {
                setPaddingTop();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
