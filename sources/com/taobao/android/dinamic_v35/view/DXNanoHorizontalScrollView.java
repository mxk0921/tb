package com.taobao.android.dinamic_v35.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.knd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXNanoHorizontalScrollView extends HorizontalScrollView implements knd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXScrollableViewImpl dxScrollableViewImpl;
    private boolean isContainerInit;

    static {
        t2o.a(444596437);
        t2o.a(444596453);
    }

    public DXNanoHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        setHorizontalScrollBarEnabled(false);
        setOverScrollMode(2);
        DXNanoScrollViewContainer dXNanoScrollViewContainer = new DXNanoScrollViewContainer(context);
        super.addView(dXNanoScrollViewContainer, new FrameLayout.LayoutParams(-1, -1));
        DXScrollableViewImpl dXScrollableViewImpl = new DXScrollableViewImpl();
        this.dxScrollableViewImpl = dXScrollableViewImpl;
        dXScrollableViewImpl.g(this);
        this.dxScrollableViewImpl.f(dXNanoScrollViewContainer);
        this.isContainerInit = true;
    }

    public static /* synthetic */ Object ipc$super(DXNanoHorizontalScrollView dXNanoHorizontalScrollView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1556944264:
                super.addView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case -461309207:
                super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1992612095:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue(), (ViewGroup.LayoutParams) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/view/DXNanoHorizontalScrollView");
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i), layoutParams});
        } else if (this.isContainerInit) {
            this.dxScrollableViewImpl.d(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // tb.knd
    public DXScrollableViewImpl getScrollViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXScrollableViewImpl) ipChange.ipc$dispatch("49e9dce6", new Object[]{this});
        }
        return this.dxScrollableViewImpl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.dxScrollableViewImpl.o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.dxScrollableViewImpl.q();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.dxScrollableViewImpl.r(z, i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.dxScrollableViewImpl.E(i, i2);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        this.dxScrollableViewImpl.s(i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        DXScrollableViewImpl dXScrollableViewImpl = this.dxScrollableViewImpl;
        if (!dXScrollableViewImpl.f7279a) {
            return super.onTouchEvent(motionEvent);
        }
        if (dXScrollableViewImpl.t(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        this.dxScrollableViewImpl.u(i);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816149f8", new Object[]{this});
        } else {
            this.dxScrollableViewImpl.z();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
        } else {
            this.dxScrollableViewImpl.B(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i)});
        } else {
            this.dxScrollableViewImpl.C(i);
        }
    }

    public DXNanoHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else if (this.isContainerInit) {
            this.dxScrollableViewImpl.b(view);
        } else {
            super.addView(view);
        }
    }

    public DXNanoHorizontalScrollView(Context context) {
        super(context);
        init(context);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i)});
        } else if (this.isContainerInit) {
            this.dxScrollableViewImpl.c(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
        } else if (this.isContainerInit) {
            this.dxScrollableViewImpl.e(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }
}
