package com.alibaba.android.ultron.vfw.listcontainer;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.k9v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class UltonSmoothScroller extends RecyclerView.SmoothScroller {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    public PointF c;
    public final float d;
    public k9v h;

    /* renamed from: a  reason: collision with root package name */
    public Interpolator f2335a = new LinearInterpolator();
    public Interpolator b = new DecelerateInterpolator();
    public int e = 0;
    public int f = 0;
    public int g = 300;

    static {
        t2o.a(157286673);
    }

    public UltonSmoothScroller(Context context) {
        this.d = calculateSpeedPerPixel(context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ Object ipc$super(UltonSmoothScroller ultonSmoothScroller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/listcontainer/UltonSmoothScroller");
    }

    public final Interpolator a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("419583a2", new Object[]{this});
        }
        if (this.f2335a == null) {
            this.f2335a = new LinearInterpolator();
        }
        return this.f2335a;
    }

    public final Interpolator b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Interpolator) ipChange.ipc$dispatch("8d6912be", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new LinearInterpolator();
        }
        return this.b;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int calculateDxToMakeVisible(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59e24b1a", new Object[]{this, view, new Integer(i)})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollHorizontally()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, layoutManager.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
    }

    public int calculateDyToMakeVisible(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb34e7b9", new Object[]{this, view, new Integer(i)})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null || !layoutManager.canScrollVertically()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return calculateDtToFit(layoutManager.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutManager.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
    }

    public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
        }
        return 25.0f / displayMetrics.densityDpi;
    }

    public int calculateTimeForScrolling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b288dc90", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) Math.ceil(Math.abs(i) * this.d);
    }

    public final int clampApplyScroll(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6be9f3a", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public PointF computeScrollVectorForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("d3d13928", new Object[]{this, new Integer(i)});
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return ((RecyclerView.SmoothScroller.ScrollVectorProvider) layoutManager).computeScrollVectorForPosition(i);
        }
        new StringBuilder("You should override computeScrollVectorForPosition when the LayoutManager does not implement ").append(RecyclerView.SmoothScroller.ScrollVectorProvider.class.getCanonicalName());
        return null;
    }

    public void d(Interpolator interpolator, Interpolator interpolator2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b82d70", new Object[]{this, interpolator, interpolator2});
            return;
        }
        this.f2335a = interpolator;
        this.b = interpolator2;
    }

    public void e(k9v k9vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d972eb97", new Object[]{this, k9vVar});
        } else {
            this.h = k9vVar;
        }
    }

    public int getHorizontalSnapPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f19bf9", new Object[]{this})).intValue();
        }
        PointF pointF = this.c;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    public int getVerticalSnapPreference() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ecfe2c4b", new Object[]{this})).intValue();
        }
        PointF pointF = this.c;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            return 1;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0aa957a", new Object[]{this, new Integer(i), new Integer(i2), state, action});
        } else if (getChildCount() == 0) {
            stop();
        } else {
            this.e = clampApplyScroll(this.e, i);
            int clampApplyScroll = clampApplyScroll(this.f, i2);
            this.f = clampApplyScroll;
            if (this.e == 0 && clampApplyScroll == 0) {
                updateActionForInterimTarget(action);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.f = 0;
        this.e = 0;
        this.c = null;
        k9v k9vVar = this.h;
        if (k9vVar != null) {
            k9vVar.a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43a25518", new Object[]{this, view, state, action});
            return;
        }
        int calculateDxToMakeVisible = calculateDxToMakeVisible(view, getHorizontalSnapPreference());
        int calculateDyToMakeVisible = calculateDyToMakeVisible(view, getVerticalSnapPreference());
        int i = this.g;
        if (i > 0) {
            action.update(-calculateDxToMakeVisible, -calculateDyToMakeVisible, i, b());
        }
    }

    public void updateActionForInterimTarget(RecyclerView.SmoothScroller.Action action) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0b579b", new Object[]{this, action});
            return;
        }
        PointF computeScrollVectorForPosition = computeScrollVectorForPosition(getTargetPosition());
        if (computeScrollVectorForPosition == null || (computeScrollVectorForPosition.x == 0.0f && computeScrollVectorForPosition.y == 0.0f)) {
            action.jumpTo(getTargetPosition());
            stop();
            return;
        }
        normalize(computeScrollVectorForPosition);
        this.c = computeScrollVectorForPosition;
        this.e = (int) (computeScrollVectorForPosition.x * 10000.0f);
        this.f = (int) (computeScrollVectorForPosition.y * 10000.0f);
        action.update((int) (this.e * 1.2f), (int) (this.f * 1.2f), (int) (calculateTimeForScrolling(10000) * 1.2f), a());
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
        }
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
