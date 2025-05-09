package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AnimatorDisplayLinearLayout extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float displayRate = 1.0f;

    static {
        t2o.a(502268026);
    }

    public AnimatorDisplayLinearLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(AnimatorDisplayLinearLayout animatorDisplayLinearLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/containerlifecycle/AnimatorDisplayLinearLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        float height = getHeight();
        canvas.clipRect(0.0f, height - (this.displayRate * height), getWidth(), height);
        super.dispatchDraw(canvas);
    }

    public void setDisplayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b597f119", new Object[]{this, new Float(f)});
            return;
        }
        this.displayRate = f;
        invalidate();
    }

    public AnimatorDisplayLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimatorDisplayLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
