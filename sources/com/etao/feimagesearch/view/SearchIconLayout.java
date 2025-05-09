package com.etao.feimagesearch.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.hfn;
import tb.t2o;
import tb.zb7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SearchIconLayout extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int commonPaddingRight;
    private final int foldPadding;
    private final int padding;
    private final float radius;
    private final float[] radiusArray;
    private final int textMargin;
    private boolean commonMode = true;
    private final Paint paint = new Paint(1);
    private final Path path = new Path();
    private final int bgColor = Color.argb(102, 0, 0, 0);
    private int maxWidth = Integer.MAX_VALUE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SearchIconLayout.this.requestLayout();
            }
        }
    }

    static {
        t2o.a(481297690);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchIconLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
        int a2 = zb7.a(6.0f);
        this.textMargin = a2;
        this.padding = a2;
        int a3 = zb7.a(12.0f);
        this.commonPaddingRight = a3;
        this.foldPadding = a2;
        float b = zb7.b(18.0f);
        this.radius = b;
        this.radiusArray = new float[]{b, b, b, b, b, b, b, b};
        setPadding(a2, a2, a3, a2);
    }

    public static /* synthetic */ Object ipc$super(SearchIconLayout searchIconLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 623593120) {
            super.dispatchDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/view/SearchIconLayout");
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
        canvas.clipPath(this.path);
        canvas.drawColor(this.bgColor);
        super.dispatchDraw(canvas);
        if (!this.commonMode) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paint);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int i5 = this.padding;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            childAt.layout(i5, (getHeight() - childAt.getMeasuredHeight()) / 2, childAt.getMeasuredWidth() + i5, (getHeight() + childAt.getMeasuredHeight()) / 2);
            i5 = i5 + childAt.getMeasuredWidth() + this.textMargin;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.path.reset();
        this.path.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), this.radiusArray, Path.Direction.CW);
        this.paint.setShader(new LinearGradient(getWidth() - this.radius, 0.0f, getWidth(), 0.0f, new int[]{0, -16777216}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        this.maxWidth = i;
        post(new a());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i3 = this.padding;
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        while (i4 < childCount) {
            i4++;
            View childAt = getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ckf.f(layoutParams, "view.layoutParams");
            childAt.measure(ViewGroup.getChildMeasureSpec(i, 0, layoutParams.width), ViewGroup.getChildMeasureSpec(i2, 0, layoutParams.height));
            i3 += childAt.getMeasuredWidth();
            i5 = hfn.c(i5, childAt.getMeasuredHeight());
        }
        int i6 = i3 + this.textMargin;
        int i7 = this.commonPaddingRight;
        int i8 = i6 + i7;
        int i9 = this.maxWidth;
        if (i8 > i9) {
            setMeasuredDimension(i9, i5 + (this.padding * 2));
            if (this.commonMode) {
                this.commonMode = false;
                int i10 = this.padding;
                setPadding(i10, i10, i10, i10);
                return;
            }
            return;
        }
        setMeasuredDimension(i6 + i7, i5 + (this.padding * 2));
        if (!this.commonMode) {
            this.commonMode = true;
            int i11 = this.padding;
            setPadding(i11, i11, this.commonPaddingRight, i11);
        }
    }
}
