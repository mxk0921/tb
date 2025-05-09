package com.taobao.android.searchbaseframe.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.onb;
import tb.t2o;
import tb.wig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ImmersiveRelativeLayout extends RelativeLayout implements onb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private wig clip = new wig(this);

    static {
        t2o.a(993001954);
        t2o.a(993001680);
    }

    public ImmersiveRelativeLayout(Context context) {
        super(context);
        checkImmersiveStatus();
    }

    private void checkImmersiveStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("279b1a6c", new Object[]{this});
        } else {
            setFitsSystemWindows(true);
        }
    }

    public static /* synthetic */ Object ipc$super(ImmersiveRelativeLayout immersiveRelativeLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 880921750) {
            return super.onApplyWindowInsets((WindowInsets) objArr[0]);
        } else {
            if (hashCode == 1389530587) {
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/uikit/ImmersiveRelativeLayout");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        this.clip.b(canvas);
        super.dispatchDraw(canvas);
        this.clip.a(canvas);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsets) ipChange.ipc$dispatch("3481cc96", new Object[]{this, windowInsets});
        }
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        setPadding(getPaddingLeft(), 0, getPaddingRight(), getPaddingBottom());
        return onApplyWindowInsets;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.clip.c();
    }

    public void setBottomRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aad469d", new Object[]{this, new Integer(i)});
        } else {
            this.clip.d(i);
        }
    }

    @Override // tb.onb
    public void setTopOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843a6316", new Object[]{this, new Integer(i)});
        } else {
            this.clip.e(i);
        }
    }

    @Override // tb.onb
    public void setTopRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d38277", new Object[]{this, new Integer(i)});
        } else {
            this.clip.f(i);
        }
    }

    public ImmersiveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        checkImmersiveStatus();
    }

    public ImmersiveRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        checkImmersiveStatus();
    }
}
