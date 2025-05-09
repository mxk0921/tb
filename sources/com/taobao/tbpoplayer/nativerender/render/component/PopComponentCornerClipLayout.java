package com.taobao.tbpoplayer.nativerender.render.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;
import tb.wdm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopComponentCornerClipLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mCornerRadius = 0;
    private final RectF mRectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);

    static {
        t2o.a(790626474);
    }

    public PopComponentCornerClipLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PopComponentCornerClipLayout popComponentCornerClipLayout, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopComponentCornerClipLayout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        try {
            int i = this.mCornerRadius;
            if (i > 0) {
                Path path = new Path();
                this.mRectF.right = getWidth();
                this.mRectF.bottom = getHeight();
                path.addRoundRect(this.mRectF, new float[]{i, i, i, i, i, i, i, i}, Path.Direction.CW);
                canvas.clipPath(path);
            }
        } catch (Throwable th) {
            wdm.h("PopComponentCornerClipLayoutNew.dispatchDraw.error", th);
        }
        super.dispatchDraw(canvas);
    }

    public void init(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edcec44c", new Object[]{this, new Integer(i)});
        } else {
            this.mCornerRadius = i;
        }
    }

    public PopComponentCornerClipLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PopComponentCornerClipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
