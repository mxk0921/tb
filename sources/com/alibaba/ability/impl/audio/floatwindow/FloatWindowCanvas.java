package com.alibaba.ability.impl.audio.floatwindow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FloatWindowCanvas extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int attachedActivityHash;

    static {
        t2o.a(98566208);
    }

    public FloatWindowCanvas(Context context) {
        this(context, null, 2, null);
    }

    public static /* synthetic */ Object ipc$super(FloatWindowCanvas floatWindowCanvas, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/audio/floatwindow/FloatWindowCanvas");
    }

    public final boolean containsFloatWindow(AbsFloatWindow absFloatWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f62a71b2", new Object[]{this, absFloatWindow})).booleanValue();
        }
        ckf.g(absFloatWindow, "child");
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == absFloatWindow) {
                return true;
            }
        }
        return false;
    }

    public final int getAttachedActivityHash() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d86e71f1", new Object[]{this})).intValue();
        }
        return this.attachedActivityHash;
    }

    public final boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        if (getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public final void setAttachedActivityHash(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2c9939", new Object[]{this, new Integer(i)});
        } else {
            this.attachedActivityHash = i;
        }
    }

    public /* synthetic */ FloatWindowCanvas(Context context, AttributeSet attributeSet, int i, a07 a07Var) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatWindowCanvas(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        this.attachedActivityHash = -1;
    }

    public final void addViewByLevel(AbsFloatWindow absFloatWindow, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62230ef", new Object[]{this, absFloatWindow, new Integer(i)});
            return;
        }
        ckf.g(absFloatWindow, "child");
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                int i3 = ((AbsFloatWindow) childAt).level;
                if (i3 != i) {
                    if (i3 > i) {
                        addView(absFloatWindow, i2);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.impl.audio.floatwindow.AbsFloatWindow");
            }
        }
        addView(absFloatWindow);
    }
}
