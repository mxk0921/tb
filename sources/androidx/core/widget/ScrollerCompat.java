package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class ScrollerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public OverScroller mScroller;

    public ScrollerCompat(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.mScroller = overScroller;
    }

    @Deprecated
    public static ScrollerCompat create(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollerCompat) ipChange.ipc$dispatch("d79dc8d9", new Object[]{context}) : create(context, null);
    }

    @Deprecated
    public void abortAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f5ff8bb", new Object[]{this});
        } else {
            this.mScroller.abortAnimation();
        }
    }

    @Deprecated
    public boolean computeScrollOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de204ca2", new Object[]{this})).booleanValue();
        }
        return this.mScroller.computeScrollOffset();
    }

    @Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ece263", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    @Deprecated
    public float getCurrVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1768d19c", new Object[]{this})).floatValue();
        }
        return this.mScroller.getCurrVelocity();
    }

    @Deprecated
    public int getCurrX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25ca532a", new Object[]{this})).intValue();
        }
        return this.mScroller.getCurrX();
    }

    @Deprecated
    public int getCurrY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25d86aab", new Object[]{this})).intValue();
        }
        return this.mScroller.getCurrY();
    }

    @Deprecated
    public int getFinalX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7ecc0912", new Object[]{this})).intValue();
        }
        return this.mScroller.getFinalX();
    }

    @Deprecated
    public int getFinalY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7eda2093", new Object[]{this})).intValue();
        }
        return this.mScroller.getFinalY();
    }

    @Deprecated
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return this.mScroller.isFinished();
    }

    @Deprecated
    public boolean isOverScrolled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("319eb2f5", new Object[]{this})).booleanValue();
        }
        return this.mScroller.isOverScrolled();
    }

    @Deprecated
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d42974", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.mScroller.notifyHorizontalEdgeReached(i, i2, i3);
        }
    }

    @Deprecated
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b37a86", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.mScroller.notifyVerticalEdgeReached(i, i2, i3);
        }
    }

    @Deprecated
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d06c1fff", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)})).booleanValue();
        }
        return this.mScroller.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    public void startScroll(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3e1896", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.mScroller.startScroll(i, i2, i3, i4);
        }
    }

    @Deprecated
    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollerCompat) ipChange.ipc$dispatch("2f7b7054", new Object[]{context, interpolator}) : new ScrollerCompat(context, interpolator);
    }

    @Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04c3603", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Integer(i10)});
        } else {
            this.mScroller.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }
    }

    @Deprecated
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38856d2d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else {
            this.mScroller.startScroll(i, i2, i3, i4, i5);
        }
    }
}
