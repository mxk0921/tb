package com.taobao.android.trade.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.d2u;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class EllipsizedView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_HORIZONTAL_SPACE = 3;
    private ContentView contentView;
    private View ellipsizeView;
    private int horizontalSpace;
    private int maxVisibleNum;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class ContentView extends ViewGroup {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int horizontalSpace;
        private int maxVisibleNum = -1;
        private EllipsizedView parent;

        static {
            t2o.a(724566032);
        }

        public ContentView(Context context, EllipsizedView ellipsizedView) {
            super(context);
            this.parent = ellipsizedView;
        }

        public static /* synthetic */ Object ipc$super(ContentView contentView, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/EllipsizedView$ContentView");
        }

        @Override // android.view.ViewGroup
        public ViewGroup.LayoutParams generateDefaultLayoutParams() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("6dca2b10", new Object[]{this});
            }
            return new LayoutParams(-2, -2);
        }

        @Override // android.view.ViewGroup
        public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("ce603fbe", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams.width, layoutParams.height);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i7 = layoutParams.f9694a;
                if (i7 >= 0 && (i5 = layoutParams.b) >= 0) {
                    childAt.layout(i7, i5, childAt.getMeasuredWidth() + i7, layoutParams.b + childAt.getMeasuredHeight());
                }
            }
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i5 < getChildCount()) {
                View childAt = getChildAt(i5);
                measureChild(childAt, i, i2);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i5 == 0) {
                    i3 = measuredWidth;
                } else {
                    i3 = this.horizontalSpace + measuredWidth;
                }
                int i8 = i3 + i6;
                if (i8 > size || ((i4 = this.maxVisibleNum) >= 0 && i5 + 1 > i4)) {
                    EllipsizedView ellipsizedView = this.parent;
                    if (!(ellipsizedView == null || ellipsizedView.getEllipsizeView() == null || this.parent.getEllipsizeView().getVisibility() == 0)) {
                        this.parent.getEllipsizeView().setVisibility(0);
                    }
                    while (i5 < getChildCount()) {
                        View childAt2 = getChildAt(i5);
                        childAt2.setVisibility(8);
                        LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                        layoutParams.f9694a = -1;
                        layoutParams.b = -1;
                        i5++;
                    }
                    setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i6 + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(i7 + getPaddingTop() + getPaddingBottom(), 1073741824));
                }
                childAt.setVisibility(0);
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f9694a = i8 - measuredWidth;
                layoutParams2.b = getPaddingTop();
                if (measuredHeight > i7) {
                    i7 = measuredHeight;
                }
                i5++;
                i6 = i8;
            }
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i6 + getPaddingLeft() + getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(i7 + getPaddingTop() + getPaddingBottom(), 1073741824));
        }

        public void setHorizontalSpace(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f08eb8dc", new Object[]{this, new Integer(i)});
            } else {
                this.horizontalSpace = i;
            }
        }

        public void setMaxVisibleNum(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7c0dc26", new Object[]{this, new Integer(i)});
            } else {
                this.maxVisibleNum = i;
            }
        }

        @Override // android.view.ViewGroup
        public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ViewGroup.LayoutParams) ipChange.ipc$dispatch("84bf71af", new Object[]{this, attributeSet}) : new LayoutParams(getContext(), attributeSet);
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static class LayoutParams extends ViewGroup.LayoutParams {

            /* renamed from: a  reason: collision with root package name */
            public int f9694a = -1;
            public int b = -1;

            static {
                t2o.a(724566033);
            }

            public LayoutParams(Context context, AttributeSet attributeSet) {
                super(context, attributeSet);
            }

            public LayoutParams(int i, int i2) {
                super(i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class DefaultEllipsizeView extends View {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int[] cx;
        public int cy;
        private int dotMargin;
        private int dotRadius;
        public int height;
        private Paint paint;
        public int width;

        static {
            t2o.a(724566034);
        }

        public DefaultEllipsizeView(Context context) {
            this(context, null);
        }

        private void init(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
                return;
            }
            Paint paint = new Paint();
            this.paint = paint;
            paint.setColor(context.getResources().getColor(R.color.TC_D_D));
            this.paint.setAntiAlias(true);
            this.paint.setStyle(Paint.Style.FILL);
            this.dotMargin = d2u.a(context, 3.0f);
            this.dotRadius = d2u.a(context, 1.5f);
        }

        public static /* synthetic */ Object ipc$super(DefaultEllipsizeView defaultEllipsizeView, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1117127205) {
                super.onDraw((Canvas) objArr[0]);
                return null;
            } else if (hashCode == 650865254) {
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/trade/ui/widget/EllipsizedView$DefaultEllipsizeView");
            }
        }

        @Override // android.view.View
        public void onDraw(Canvas canvas) {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
                return;
            }
            super.onDraw(canvas);
            while (true) {
                int[] iArr = this.cx;
                if (i < iArr.length) {
                    canvas.drawCircle(iArr[i], this.cy, this.dotRadius, this.paint);
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // android.view.View
        public void onMeasure(int i, int i2) {
            int i3 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.onMeasure(i, i2);
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((this.dotMargin * 6) + (this.dotRadius * 6), 1073741824), i2);
            this.width = getMeasuredWidth();
            this.height = getMeasuredHeight();
            while (true) {
                int[] iArr = this.cx;
                if (i3 < iArr.length) {
                    int i4 = this.dotRadius;
                    iArr[i3] = (((i4 * 2) + this.dotMargin) * i3) + i4;
                    i3++;
                } else {
                    this.cy = this.height / 2;
                    return;
                }
            }
        }

        public DefaultEllipsizeView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public DefaultEllipsizeView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.cx = new int[3];
            init(context);
        }
    }

    static {
        t2o.a(724566031);
    }

    public EllipsizedView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r7 == null) goto L_0x0058;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void init(android.content.Context r6, android.util.AttributeSet r7) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.trade.ui.widget.EllipsizedView.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "16013b5d"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r0 = 1
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            r1 = 1077936128(0x40400000, float:3.0)
            r2 = -1
            if (r6 == 0) goto L_0x0050
            if (r7 == 0) goto L_0x0050
            int[] r3 = com.taobao.taobao.R.styleable.TradeEllipsizedView
            android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r3)
            int r3 = com.taobao.taobao.R.styleable.TradeEllipsizedView_trade_horizontal_space     // Catch: all -> 0x003d, Exception -> 0x003f
            int r4 = tb.d2u.a(r6, r1)     // Catch: all -> 0x003d, Exception -> 0x003f
            int r3 = r7.getDimensionPixelSize(r3, r4)     // Catch: all -> 0x003d, Exception -> 0x003f
            r5.horizontalSpace = r3     // Catch: all -> 0x003d, Exception -> 0x003f
            int r3 = com.taobao.taobao.R.styleable.TradeEllipsizedView_trade_max_visible_num     // Catch: all -> 0x003d, Exception -> 0x003f
            int r3 = r7.getInt(r3, r2)     // Catch: all -> 0x003d, Exception -> 0x003f
            r5.maxVisibleNum = r3     // Catch: all -> 0x003d, Exception -> 0x003f
        L_0x0039:
            r7.recycle()
            goto L_0x0058
        L_0x003d:
            r6 = move-exception
            goto L_0x004a
        L_0x003f:
            int r1 = tb.d2u.a(r6, r1)     // Catch: all -> 0x003d
            r5.horizontalSpace = r1     // Catch: all -> 0x003d
            r5.maxVisibleNum = r2     // Catch: all -> 0x003d
            if (r7 == 0) goto L_0x0058
            goto L_0x0039
        L_0x004a:
            if (r7 == 0) goto L_0x004f
            r7.recycle()
        L_0x004f:
            throw r6
        L_0x0050:
            int r7 = tb.d2u.a(r6, r1)
            r5.horizontalSpace = r7
            r5.maxVisibleNum = r2
        L_0x0058:
            r5.setOrientation(r0)
            r7 = 16
            r5.setGravity(r7)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = new com.taobao.android.trade.ui.widget.EllipsizedView$ContentView
            r7.<init>(r6, r5)
            r5.contentView = r7
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r0 = -2
            r7.<init>(r2, r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.weight = r1
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r1 = r5.contentView
            r1.setLayoutParams(r7)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = r5.contentView
            int r1 = r5.horizontalSpace
            r7.setHorizontalSpace(r1)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = r5.contentView
            int r1 = r5.maxVisibleNum
            r7.setMaxVisibleNum(r1)
            com.taobao.android.trade.ui.widget.EllipsizedView$ContentView r7 = r5.contentView
            r5.addView(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r0, r2)
            com.taobao.android.trade.ui.widget.EllipsizedView$DefaultEllipsizeView r0 = new com.taobao.android.trade.ui.widget.EllipsizedView$DefaultEllipsizeView
            r0.<init>(r6)
            r0.setLayoutParams(r7)
            r5.setEllipsizeView(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.trade.ui.widget.EllipsizedView.init(android.content.Context, android.util.AttributeSet):void");
    }

    public static /* synthetic */ Object ipc$super(EllipsizedView ellipsizedView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/widget/EllipsizedView");
    }

    public void addItemView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd20b2", new Object[]{this, view});
        } else {
            this.contentView.addView(view);
        }
    }

    public View getEllipsizeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8d914325", new Object[]{this});
        }
        return this.ellipsizeView;
    }

    public boolean isEllipsizeViewVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe157515", new Object[]{this})).booleanValue();
        }
        View view = this.ellipsizeView;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        View view = this.ellipsizeView;
        if (view != null) {
            view.setVisibility(8);
        }
        this.contentView.removeAllViews();
    }

    public void setEllipsizeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130d015b", new Object[]{this, view});
            return;
        }
        View view2 = this.ellipsizeView;
        if (view2 != null) {
            removeView(view2);
        }
        this.ellipsizeView = view;
        view.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ellipsizeView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.ellipsizeView.setLayoutParams(layoutParams);
        }
        layoutParams.weight = 0.0f;
        layoutParams.leftMargin = this.horizontalSpace * 2;
        addView(this.ellipsizeView);
    }

    public void setMaxVisibleNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7c0dc26", new Object[]{this, new Integer(i)});
        } else {
            this.maxVisibleNum = i;
        }
    }

    public EllipsizedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EllipsizedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.maxVisibleNum = -1;
        init(context, attributeSet);
    }
}
