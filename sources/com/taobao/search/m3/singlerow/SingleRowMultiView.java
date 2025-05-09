package com.taobao.search.m3.singlerow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.ArrayList;
import tb.a07;
import tb.ckf;
import tb.dgw;
import tb.hfn;
import tb.o1p;
import tb.pzp;
import tb.t2o;
import tb.wuk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SingleRowMultiView extends ViewGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final int itemMargin = o1p.a(8.0f);
    private static final int lineColor = Color.parseColor("#dddddd");
    private static final int lineWidth = o1p.a(1.0f);
    private pzp currentInfo;
    private final ArrayList<SingleRowView> views = new ArrayList<>();
    private final Paint linePaint = new Paint(1);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792456);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792455);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRowMultiView(Context context) {
        super(context);
        ckf.g(context, "context");
        generateViews(2);
        setClipChildren(false);
        setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
    }

    public static final /* synthetic */ int access$getItemMargin$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91632c54", new Object[0])).intValue();
        }
        return itemMargin;
    }

    private final void generateViews(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b38a1d03", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.views.add(new SingleRowView(getContext()));
        }
    }

    public static /* synthetic */ Object ipc$super(SingleRowMultiView singleRowMultiView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/singlerow/SingleRowMultiView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                drawChild(canvas, childAt, getDrawingTime());
                if (i2 > 0) {
                    int left = childAt.getLeft() - (itemMargin / 2);
                    int i3 = lineWidth;
                    float f = left - (i3 / 2);
                    pzp pzpVar = this.currentInfo;
                    ckf.d(pzpVar);
                    Integer g = pzpVar.a().get(i2).g();
                    Paint paint = this.linePaint;
                    if (g != null) {
                        i = g.intValue();
                    } else {
                        i = lineColor;
                    }
                    paint.setColor(i);
                    canvas.drawRect(f, 0.0f, f + i3, getHeight(), this.linePaint);
                }
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0) {
                int measuredHeight = (getMeasuredHeight() - childAt.getMeasuredHeight()) / 2;
                childAt.layout(i5, measuredHeight, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + measuredHeight);
                i5 = i5 + childAt.getMeasuredWidth() + itemMargin;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = size;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (i4 > 0) {
                i3 -= itemMargin;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i2);
            if (i4 > 0 && ((SingleRowView) childAt).isBreak()) {
                i3 += itemMargin;
                break;
            }
            i3 -= childAt.getMeasuredWidth();
            this.views.get(i4).setVisibility(0);
            i5 = hfn.c(i5, childAt.getMeasuredHeight());
            if (i3 <= itemMargin) {
                break;
            }
            i4++;
        }
        setMeasuredDimension(size - i3, i5);
    }

    public final void update(pzp pzpVar, boolean z, wuk wukVar, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c902b1", new Object[]{this, pzpVar, new Boolean(z), wukVar, new Boolean(z2)});
            return;
        }
        ckf.g(pzpVar, "info");
        ckf.g(wukVar, DataReceiveMonitor.CB_LISTENER);
        if (this.currentInfo != pzpVar) {
            removeAllViews();
            this.currentInfo = pzpVar;
            int size = pzpVar.a().size() - this.views.size();
            if (size > 0) {
                generateViews(size);
            }
            int size2 = pzpVar.a().size();
            for (int i = 0; i < size2; i++) {
                this.views.get(i).update(pzpVar.a().get(i), z, wukVar, z2);
                addView(this.views.get(i));
                this.views.get(i).setVisibility(8);
            }
        }
    }
}
