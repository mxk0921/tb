package com.alibaba.android.icart.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CartScrollRelativeLayout extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Scroller mScroller;

    static {
        t2o.a(479199624);
    }

    public CartScrollRelativeLayout(Context context) {
        super(context);
        init();
    }

    private void clearChildrenCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85900fd", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setDrawingCacheEnabled(false);
        }
    }

    private void enableChildrenCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1b2487", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setDrawingCacheEnabled(true);
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mScroller = new Scroller(getContext());
        enableChildrenCache();
    }

    public static /* synthetic */ Object ipc$super(CartScrollRelativeLayout cartScrollRelativeLayout, String str, Object... objArr) {
        if (str.hashCode() == -1577577649) {
            super.scrollTo(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/widget/CartScrollRelativeLayout");
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller == null || scroller.isFinished()) {
            clearChildrenCache();
        } else if (this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
            invalidate();
        } else {
            clearChildrenCache();
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f8134f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.scrollTo(i, i2);
        postInvalidate();
    }

    public void smoothScrollIn(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460ea3c7", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null) {
            scroller.startScroll(getScrollX(), 0, getScrollX(), -i, i2);
            invalidate();
        }
    }

    public void smoothScrollOut(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be95c1a", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null) {
            scroller.startScroll(getScrollX(), -getHeight(), getScrollX(), i, i2);
            invalidate();
        }
    }

    public CartScrollRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public CartScrollRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
