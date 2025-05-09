package com.taobao.android.searchbaseframe.xsl.refact;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PullRefreshContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Rect clipRect = new Rect();
    private int offset;
    private boolean offsetUpdated;

    static {
        t2o.a(993002071);
    }

    public PullRefreshContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PullRefreshContainer pullRefreshContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/searchbaseframe/xsl/refact/PullRefreshContainer");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        canvas.save();
        canvas.clipRect(this.clipRect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        if (!this.offsetUpdated) {
            this.offset = -getMeasuredHeight();
        }
        this.clipRect.set(0, -this.offset, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void updateOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c4620", new Object[]{this, new Integer(i)});
            return;
        }
        this.offsetUpdated = true;
        this.offset = i;
        this.clipRect.set(0, -i, getMeasuredWidth(), getMeasuredHeight());
        invalidate();
    }
}
