package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.utils.ResourceUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDialogButton extends TextView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable mDefaultBackground;
    private boolean mStacked = false;
    private Drawable mStackedBackground;
    private int mStackedEndPadding;
    private GravityEnum mStackedGravity;

    static {
        t2o.a(932184141);
    }

    public TBDialogButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aae387d", new Object[]{this, context, attributeSet, new Integer(i), new Integer(i2)});
            return;
        }
        this.mStackedEndPadding = ResourceUtils.getDimensionPixelSize(context, R.dimen.uik_mdDialogFrameMargin);
        this.mStackedGravity = GravityEnum.END;
    }

    public static /* synthetic */ Object ipc$super(TBDialogButton tBDialogButton, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/extend/component/unify/Dialog/TBDialogButton");
    }

    public void setAllCapsCompat(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89bc3f6b", new Object[]{this, new Boolean(z)});
        } else {
            setAllCaps(z);
        }
    }

    public void setDefaultSelector(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381722a9", new Object[]{this, drawable});
            return;
        }
        this.mDefaultBackground = drawable;
        if (!this.mStacked) {
            setStacked(false, true);
        }
    }

    public void setStacked(boolean z, boolean z2) {
        int i;
        int i2;
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dc8fec", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (this.mStacked != z || z2) {
            if (z) {
                i = this.mStackedGravity.getGravityInt() | 16;
            } else {
                i = 17;
            }
            setGravity(i);
            if (z) {
                i2 = this.mStackedGravity.getTextAlignment();
            } else {
                i2 = 4;
            }
            setTextAlignment(i2);
            if (z) {
                drawable = this.mStackedBackground;
            } else {
                drawable = this.mDefaultBackground;
            }
            ResourceUtils.setBackgroundCompat(this, drawable);
            if (z) {
                setPadding(this.mStackedEndPadding, getPaddingTop(), this.mStackedEndPadding, getPaddingBottom());
            }
            this.mStacked = z;
        }
    }

    public void setStackedGravity(GravityEnum gravityEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e4744", new Object[]{this, gravityEnum});
        } else {
            this.mStackedGravity = gravityEnum;
        }
    }

    public void setStackedSelector(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d83f58f", new Object[]{this, drawable});
            return;
        }
        this.mStackedBackground = drawable;
        if (this.mStacked) {
            setStacked(true, true);
        }
    }

    public TBDialogButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    public TBDialogButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }
}
