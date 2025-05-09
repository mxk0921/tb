package com.taobao.search.m3.property;

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
import tb.dqu;
import tb.f1n;
import tb.g1n;
import tb.jzp;
import tb.l32;
import tb.o1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class PropertyView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private f1n currentInfo;
    private final ArrayList<l32> drawList = new ArrayList<>(3);
    private int itemMargin;
    private float lineMargin;
    private final Paint linePaint;
    private boolean priceMode;
    private final boolean singleLine;
    private boolean singleLineMode;
    private boolean summaryTips;
    private boolean useCapsule;
    public static final a Companion = new a(null);
    private static final int singleLineItemMargin = o1p.a(6.0f);
    private static final int singleLineItemMarginCapsule = o1p.a(4.0f);
    private static final int twoLineItemMargin = o1p.a(13.0f);
    private static final int lineWidth = o1p.a(1.0f);
    private static final float lineMarginWhenTwoLines = o1p.a(5.0f);
    private static final int lineColor = Color.parseColor("#dddddd");
    private static final int lineDarkColor = Color.parseColor("#999999");
    private static final int capsuleHeight = o1p.a(21.0f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792442);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792441);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyView(Context context, boolean z) {
        super(context);
        ckf.g(context, "context");
        this.singleLine = z;
        Paint paint = new Paint(1);
        this.linePaint = paint;
        paint.setColor(lineColor);
    }

    public static /* synthetic */ Object ipc$super(PropertyView propertyView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/property/PropertyView");
    }

    private final void updateDrawList(f1n f1nVar, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1249a31b", new Object[]{this, f1nVar, new Boolean(z)});
            return;
        }
        this.drawList.clear();
        this.priceMode = false;
        if (z || this.singleLine || this.summaryTips) {
            for (g1n g1nVar : f1nVar.b()) {
                this.priceMode = g1nVar.a();
                this.drawList.add(new jzp(g1nVar, f1nVar.a(), z, this));
            }
        } else {
            boolean z3 = true;
            for (g1n g1nVar2 : f1nVar.b()) {
                this.priceMode = g1nVar2.a();
                if (!z3 || !g1nVar2.d()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (g1nVar2.d()) {
                    this.drawList.add(new jzp(g1nVar2, f1nVar.a(), z, this));
                } else {
                    this.drawList.add(new dqu(g1nVar2, this));
                }
            }
            z2 = z3;
        }
        this.singleLineMode = z2;
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
        if (this.singleLineMode) {
            return jzp.Companion.a();
        }
        if (this.priceMode) {
            return dqu.Companion.b();
        }
        return dqu.Companion.a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        Iterator<l32> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        float f = 0.0f;
        while (it.hasNext()) {
            l32 next = it.next();
            ckf.f(next, "next(...)");
            l32 l32Var = next;
            if (l32Var.b()) {
                if (!z && !this.useCapsule) {
                    float f2 = ((-this.itemMargin) - i) / 2.0f;
                    canvas.drawRect(f2, this.lineMargin, f2 + lineWidth, getHeight() - this.lineMargin, this.linePaint);
                }
                l32Var.draw(canvas);
                float width = l32Var.getWidth() + this.itemMargin;
                canvas.translate(width, 0.0f);
                f += width;
                z = false;
            }
        }
        canvas.translate(-f, 0.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
            return;
        }
        int measuredWidth = getMeasuredWidth();
        Iterator<l32> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        boolean z = true;
        while (it.hasNext()) {
            l32 next = it.next();
            ckf.f(next, "next(...)");
            l32 l32Var = next;
            if (this.priceMode && this.singleLineMode && !z) {
                l32Var.c(false);
            } else if (l32Var.getWidth() <= measuredWidth) {
                l32Var.c(true);
                measuredWidth = (measuredWidth - l32Var.getWidth()) - this.itemMargin;
                z = false;
            } else {
                l32Var.c(false);
            }
        }
    }

    public final void update(f1n f1nVar, boolean z, boolean z2) {
        int i;
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dda477", new Object[]{this, f1nVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(f1nVar, "info");
        if (this.currentInfo != f1nVar) {
            this.summaryTips = z2;
            this.useCapsule = z;
            reset();
            this.currentInfo = f1nVar;
            updateDrawList(f1nVar, z);
            boolean z3 = this.singleLineMode;
            if (!z3) {
                i = twoLineItemMargin;
            } else if (z) {
                i = singleLineItemMarginCapsule;
            } else {
                i = singleLineItemMargin;
            }
            this.itemMargin = i;
            if (z3) {
                f = 0.0f;
            } else {
                f = lineMarginWhenTwoLines;
            }
            this.lineMargin = f;
        }
    }
}
