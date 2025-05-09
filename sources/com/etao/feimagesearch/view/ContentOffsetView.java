package com.etao.feimagesearch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.hfn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ContentOffsetView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int offset;

    static {
        t2o.a(481297682);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentOffsetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(ContentOffsetView contentOffsetView, String str, Object... objArr) {
        if (str.hashCode() == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/view/ContentOffsetView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        int f = hfn.f(hfn.c(getHeight() + getOffset(), 0), getHeight());
        if (f == getHeight()) {
            super.dispatchDraw(canvas);
        } else if (f != 0) {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), f);
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public final int getOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        return this.offset;
    }

    public final void setOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976b8e7", new Object[]{this, new Integer(i)});
            return;
        }
        this.offset = i;
        invalidate();
    }
}
