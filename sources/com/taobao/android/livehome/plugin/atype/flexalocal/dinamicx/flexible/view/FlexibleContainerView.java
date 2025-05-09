package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.view;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FlexibleContainerView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float FONT_SIZE = 10.0f;
    private View.OnAttachStateChangeListener mExtOnAttachListener;
    public Paint paint = null;
    public final Object lock = new Object();
    private boolean isTemplateRoot = false;

    static {
        t2o.a(310378593);
    }

    public FlexibleContainerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(FlexibleContainerView flexibleContainerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1899296582:
                return super.getTag(((Number) objArr[0]).intValue());
            case -148052640:
                super.setTag(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/FlexibleContainerView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View.OnAttachStateChangeListener getExtOnAttachListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("11c004bf", new Object[]{this});
        }
        return this.mExtOnAttachListener;
    }

    @Override // android.view.View
    public Object getTag(int i) {
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8ecb08ba", new Object[]{this, new Integer(i)});
        }
        synchronized (this) {
            tag = super.getTag(i);
        }
        return tag;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.mExtOnAttachListener;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewAttachedToWindow(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.mExtOnAttachListener;
        if (onAttachStateChangeListener != null) {
            onAttachStateChangeListener.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                childAt.layout(layoutParams2.left, layoutParams2.top, layoutParams2.right, layoutParams2.bottom);
            } else {
                childAt.layout(0, 0, layoutParams.width, layoutParams.height);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            int width = layoutParams2.width();
            int height = layoutParams2.height();
            setMeasuredDimension(width, height);
            measureChildren(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            return;
        }
        int i4 = layoutParams.width;
        if (i4 <= 0 || (i3 = layoutParams.height) <= 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(1073741824), View.MeasureSpec.getSize(1073741824));
            measureChildren(i, i2);
            return;
        }
        setMeasuredDimension(i4, i3);
        measureChildren(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
    }

    @Deprecated
    public void setExtOnAttachListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23195287", new Object[]{this, onAttachStateChangeListener});
        } else {
            this.mExtOnAttachListener = onAttachStateChangeListener;
        }
    }

    public void setIsTemplateRoot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbdc065", new Object[]{this, new Boolean(z)});
        } else {
            this.isTemplateRoot = z;
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f72ce560", new Object[]{this, new Integer(i), obj});
            return;
        }
        synchronized (this) {
            super.setTag(i, obj);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LayoutParams) ipChange.ipc$dispatch("b93385aa", new Object[]{this, layoutParams}) : new LayoutParams(layoutParams);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LayoutParams extends FrameLayout.LayoutParams {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int bottom;
        private int layoutMarginLeft;
        private int layoutMarginTop;
        public int left;
        private int outlineHeight;
        private int outlineWidth;
        public int right;
        public int top;

        static {
            t2o.a(310378594);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.right = i;
            this.bottom = i2;
            this.outlineWidth = i;
            this.outlineHeight = i2;
        }

        public static /* synthetic */ Object ipc$super(LayoutParams layoutParams, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/dinamicx/flexible/view/FlexibleContainerView$LayoutParams");
        }

        public void fillLayoutResult(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ceb6ae8", new Object[]{this, rect});
                return;
            }
            int i = rect.left;
            this.left = i;
            int i2 = rect.top;
            this.top = i2;
            int i3 = rect.right;
            this.right = i3;
            int i4 = rect.bottom;
            this.bottom = i4;
            ((FrameLayout.LayoutParams) this).width = i3 - i;
            ((FrameLayout.LayoutParams) this).height = i4 - i2;
        }

        public int getOutlineHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1565ab4d", new Object[]{this})).intValue();
            }
            return this.outlineHeight;
        }

        public int getOutlineWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("768e0894", new Object[]{this})).intValue();
            }
            return this.outlineWidth;
        }

        public int height() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("58c32a21", new Object[]{this})).intValue();
            }
            return this.bottom - this.top;
        }

        public void move(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab966fc1", new Object[]{this, rect});
                return;
            }
            int i = rect.left + this.layoutMarginLeft;
            this.left = i;
            int i2 = rect.top + this.layoutMarginTop;
            this.top = i2;
            this.right = i + ((FrameLayout.LayoutParams) this).width;
            this.bottom = i2 + ((FrameLayout.LayoutParams) this).height;
        }

        public void offset(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de25497a", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            int i3 = this.left + i;
            this.left = i3;
            int i4 = this.top + i2;
            this.top = i4;
            this.right = i3 + ((FrameLayout.LayoutParams) this).width;
            this.bottom = i4 + ((FrameLayout.LayoutParams) this).height;
        }

        public void read(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b904dedc", new Object[]{this, rect});
                return;
            }
            rect.left = this.left;
            rect.top = this.top;
            rect.right = this.right;
            rect.bottom = this.bottom;
        }

        public void setLayoutMarginLeft(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45c431db", new Object[]{this, new Integer(i)});
            } else {
                this.layoutMarginLeft = i;
            }
        }

        public void setLayoutMarginTop(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3188841", new Object[]{this, new Integer(i)});
            } else {
                this.layoutMarginTop = i;
            }
        }

        public int width() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcdb5f40", new Object[]{this})).intValue();
            }
            return this.right - this.left;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            int i = ((FrameLayout.LayoutParams) this).width;
            this.right = i;
            int i2 = ((FrameLayout.LayoutParams) this).height;
            this.bottom = i2;
            this.outlineWidth = i;
            this.outlineHeight = i2;
        }
    }
}
