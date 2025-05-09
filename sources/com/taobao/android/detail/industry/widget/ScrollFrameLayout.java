package com.taobao.android.detail.industry.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.mte;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ScrollFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a mOnScrollInterceptor;
    private b mOnViewLifecycleListener;
    private float mTouchDownX;
    private float mTouchDownY;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(440402015);
    }

    public ScrollFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ScrollFrameLayout scrollFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/industry/widget/ScrollFrameLayout");
        }
    }

    private boolean shouldHorizontalScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e9a3a6f", new Object[]{this})).booleanValue();
        }
        a aVar = this.mOnScrollInterceptor;
        if (aVar == null || !((mte.b) aVar).a()) {
            return false;
        }
        return true;
    }

    private boolean shouldVerticalScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a1b1001", new Object[]{this})).booleanValue();
        }
        a aVar = this.mOnScrollInterceptor;
        if (aVar == null || !((mte.b) aVar).b()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                if (Math.abs(motionEvent.getX() - this.mTouchDownX) > Math.abs(motionEvent.getY() - this.mTouchDownY)) {
                    if (!shouldHorizontalScroll()) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                } else if (!shouldVerticalScroll()) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            return dispatchTouchEvent;
        }
        this.mTouchDownX = motionEvent.getX();
        this.mTouchDownY = motionEvent.getY();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        b bVar = this.mOnViewLifecycleListener;
        if (bVar != null) {
            ((mte.c) bVar).a();
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
        b bVar = this.mOnViewLifecycleListener;
        if (bVar != null) {
            ((mte.c) bVar).b();
        }
    }

    public void setOnScrollInterceptor(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2015cbe9", new Object[]{this, aVar});
        } else {
            this.mOnScrollInterceptor = aVar;
        }
    }

    public void setOnViewLifecycleListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc7de467", new Object[]{this, bVar});
        } else {
            this.mOnViewLifecycleListener = bVar;
        }
    }

    public ScrollFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ScrollFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
