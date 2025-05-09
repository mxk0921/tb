package com.taobao.search.m3.composite;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.a07;
import tb.ckf;
import tb.ld4;
import tb.md4;
import tb.nd4;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class CompositeView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Paint bgPaint;
    private int calculateWidth;
    private md4 currentInfo;
    private final ArrayList<ld4> drawList = new ArrayList<>(2);
    private boolean useCapsule;
    public static final a Companion = new a(null);
    private static final int itemMargin = o1p.a(4.0f);
    private static final int bgColor = Color.parseColor("#f7f7f7");
    private static final int capsuleHeight = o1p.a(21.0f);
    private static final int noCapsuleHeight = o1p.a(12.0f);
    private static final int capsulePadding = o1p.a(6.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792343);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792342);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeView(Context context) {
        super(context);
        ckf.g(context, "context");
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        paint.setColor(bgColor);
    }

    public static /* synthetic */ Object ipc$super(CompositeView compositeView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/composite/CompositeView");
        }
    }

    private final void load() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6def666d", new Object[]{this});
            return;
        }
        Iterator<ld4> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ld4 next = it.next();
            ckf.f(next, "next(...)");
            ld4 ld4Var = next;
            if (ld4Var.b()) {
                ld4Var.d();
            }
        }
    }

    private final void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        Iterator<ld4> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ld4 next = it.next();
            ckf.f(next, "next(...)");
            next.release();
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        if (this.useCapsule) {
            return capsuleHeight;
        }
        return noCapsuleHeight;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getWrapContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe693fa7", new Object[]{this})).intValue();
        }
        return this.calculateWidth;
    }

    @Override // com.taobao.search.m3.BaseItemView
    public boolean isWrapContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920aeb50", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        load();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.useCapsule) {
            i = capsulePadding;
            canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), getHeight() / 2.0f, getHeight() / 2.0f, this.bgPaint);
        }
        if (i > 0) {
            canvas.translate(i, 0.0f);
        }
        Iterator<ld4> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        while (it.hasNext()) {
            ld4 next = it.next();
            ckf.f(next, "next(...)");
            ld4 ld4Var = next;
            if (ld4Var.b()) {
                ld4Var.draw(canvas);
                int width = ld4Var.getWidth() + itemMargin;
                canvas.translate(width, 0.0f);
                i += width;
            }
        }
        if (i > 0) {
            canvas.translate(-i, 0.0f);
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        float f = 0.0f;
        if (this.useCapsule) {
            int i = capsulePadding * 2;
            measuredWidth -= i;
            f = 0.0f + i;
        }
        Iterator<ld4> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        boolean z = true;
        while (it.hasNext()) {
            ld4 next = it.next();
            ckf.f(next, "next(...)");
            ld4 ld4Var = next;
            ld4Var.e(measuredWidth);
            if (ld4Var.getWidth() <= measuredWidth) {
                ld4Var.c(true);
                int width = measuredWidth - ld4Var.getWidth();
                int i2 = itemMargin;
                measuredWidth = width - i2;
                f += ld4Var.getWidth();
                if (!z) {
                    f += i2;
                } else {
                    z = false;
                }
                ld4Var.d();
            } else {
                ld4Var.release();
                ld4Var.c(false);
            }
        }
        this.calculateWidth = (int) f;
    }

    public final void update(md4 md4Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e968ed", new Object[]{this, md4Var, new Boolean(z)});
            return;
        }
        ckf.g(md4Var, "info");
        if (this.currentInfo != md4Var) {
            this.useCapsule = z;
            this.currentInfo = md4Var;
            reset();
            release();
            this.drawList.clear();
            Iterator<nd4> it = md4Var.a().iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                nd4 next = it.next();
                ckf.f(next, "next(...)");
                this.drawList.add(new ld4(next, this));
            }
            requestLayout();
        }
    }
}
