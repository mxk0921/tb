package com.taobao.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import com.taobao.taobao.R;
import tb.t2o;
import tb.tdw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PullLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mLayoutId = -1;
    private final PullBase.Mode mMode;
    private int mScrollDirection;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$ptr$PullBase$Mode;

        static {
            int[] iArr = new int[PullBase.Mode.values().length];
            $SwitchMap$com$taobao$ptr$PullBase$Mode = iArr;
            try {
                iArr[PullBase.Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$ptr$PullBase$Mode[PullBase.Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        t2o.a(632291358);
    }

    public PullLayout(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        super(context);
        this.mMode = mode;
        this.mScrollDirection = i;
        init(context, mode, i, attributeSet);
    }

    private void inflateChildLayout(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73223fdd", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            LayoutInflater.from(getContext()).inflate(this.mLayoutId, (ViewGroup) this, true);
        }
    }

    private void init(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5594eae", new Object[]{this, context, mode, new Integer(i), attributeSet});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Pull);
        Drawable drawable = null;
        if (a.$SwitchMap$com$taobao$ptr$PullBase$Mode[mode.ordinal()] != 1) {
            int i2 = R.styleable.Pull_pullStartBackground;
            if (obtainStyledAttributes.hasValue(i2)) {
                drawable = obtainStyledAttributes.getDrawable(i2);
            }
            int i3 = R.styleable.Pull_pullStartLayout;
            if (obtainStyledAttributes.hasValue(i3)) {
                this.mLayoutId = obtainStyledAttributes.getResourceId(i3, -1);
            }
        } else {
            int i4 = R.styleable.Pull_pullEndBackground;
            if (obtainStyledAttributes.hasValue(i4)) {
                drawable = obtainStyledAttributes.getDrawable(i4);
            }
            int i5 = R.styleable.Pull_pullEndLayout;
            if (obtainStyledAttributes.hasValue(i5)) {
                this.mLayoutId = obtainStyledAttributes.getResourceId(i5, -1);
            }
        }
        obtainStyledAttributes.recycle();
        setPullBackground(drawable);
        inflateChildLayout(this.mLayoutId);
        onInit(context, mode, i, attributeSet);
    }

    public static /* synthetic */ Object ipc$super(PullLayout pullLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/PullLayout");
    }

    public final int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return this.mLayoutId;
    }

    public final PullBase.Mode getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullBase.Mode) ipChange.ipc$dispatch("c0b499e8", new Object[]{this});
        }
        return this.mMode;
    }

    public final int getScrollDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc210f76", new Object[]{this})).intValue();
        }
        return this.mScrollDirection;
    }

    public void onInit(Context context, PullBase.Mode mode, int i, AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e6ed4f", new Object[]{this, context, mode, new Integer(i), attributeSet});
        }
    }

    public void onScrollDirectionUpdated(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("babf5d42", new Object[]{this, mode, new Integer(i)});
        }
    }

    public final void setHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fde48d3", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void setPullBackground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab673980", new Object[]{this, drawable});
        } else if (drawable != null) {
            tdw.b(this, drawable);
        }
    }

    public final void setWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf60358", new Object[]{this, new Integer(i)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public void updateScrollDirection(PullBase.Mode mode, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c18061", new Object[]{this, mode, new Integer(i)});
            return;
        }
        this.mScrollDirection = i;
        onScrollDirectionUpdated(mode, i);
    }
}
