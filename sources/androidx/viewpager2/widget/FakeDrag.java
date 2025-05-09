package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class FakeDrag {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mActualDraggedDistance;
    private long mFakeDragBeginTime;
    private int mMaximumVelocity;
    private final RecyclerView mRecyclerView;
    private float mRequestedDragDistance;
    private final ScrollEventAdapter mScrollEventAdapter;
    private VelocityTracker mVelocityTracker;
    private final ViewPager2 mViewPager;

    public FakeDrag(ViewPager2 viewPager2, ScrollEventAdapter scrollEventAdapter, RecyclerView recyclerView) {
        this.mViewPager = viewPager2;
        this.mScrollEventAdapter = scrollEventAdapter;
        this.mRecyclerView = recyclerView;
    }

    private void addFakeMotionEvent(long j, int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cdb14", new Object[]{this, new Long(j), new Integer(i), new Float(f), new Float(f2)});
            return;
        }
        MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, j, i, f, f2, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
    }

    private void beginFakeVelocityTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567d1e24", new Object[]{this});
            return;
        }
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
            this.mMaximumVelocity = ViewConfiguration.get(this.mViewPager.getContext()).getScaledMaximumFlingVelocity();
            return;
        }
        velocityTracker.clear();
    }

    public boolean beginFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17aa257d", new Object[]{this})).booleanValue();
        }
        if (this.mScrollEventAdapter.isDragging()) {
            return false;
        }
        this.mActualDraggedDistance = 0;
        this.mRequestedDragDistance = 0;
        this.mFakeDragBeginTime = SystemClock.uptimeMillis();
        beginFakeVelocityTracker();
        this.mScrollEventAdapter.notifyBeginFakeDrag();
        if (!this.mScrollEventAdapter.isIdle()) {
            this.mRecyclerView.stopScroll();
        }
        addFakeMotionEvent(this.mFakeDragBeginTime, 0, 0.0f, 0.0f);
        return true;
    }

    public boolean endFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c967aaf", new Object[]{this})).booleanValue();
        }
        if (!this.mScrollEventAdapter.isFakeDragging()) {
            return false;
        }
        this.mScrollEventAdapter.notifyEndFakeDrag();
        VelocityTracker velocityTracker = this.mVelocityTracker;
        velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
        if (!this.mRecyclerView.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.mViewPager.snapToPage();
        }
        return true;
    }

    public boolean fakeDragBy(float f) {
        boolean z;
        int i;
        float f2;
        float f3;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfbbc7bd", new Object[]{this, new Float(f)})).booleanValue();
        }
        if (!this.mScrollEventAdapter.isFakeDragging()) {
            return false;
        }
        float f4 = this.mRequestedDragDistance - f;
        this.mRequestedDragDistance = f4;
        int round = Math.round(f4 - this.mActualDraggedDistance);
        this.mActualDraggedDistance += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.mViewPager.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = round;
        } else {
            i = 0;
        }
        if (!z) {
            i2 = round;
        }
        if (z) {
            f2 = this.mRequestedDragDistance;
        } else {
            f2 = 0.0f;
        }
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = this.mRequestedDragDistance;
        }
        this.mRecyclerView.scrollBy(i, i2);
        addFakeMotionEvent(uptimeMillis, 2, f2, f3);
        return true;
    }

    public boolean isFakeDragging() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e770b399", new Object[]{this})).booleanValue();
        }
        return this.mScrollEventAdapter.isFakeDragging();
    }
}
