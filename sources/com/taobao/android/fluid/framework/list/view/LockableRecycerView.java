package com.taobao.android.fluid.framework.list.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.list.render.MultiRecyclerViewAdapter;
import tb.dtn;
import tb.eps;
import tb.ir9;
import tb.pr9;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LockableRecycerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DRAG_DOWN = -1;
    private static final int DRAG_NONE = 0;
    private static final int DRAG_UP = 1;
    private static final String TAG = "LockableRecycerView";
    private int distanceY;
    private boolean isAutoLock;
    private boolean mHookScrollHorizontally;
    private RecyclerView.Recycler mRecycler;
    private int mScrollState;
    private a onDragListener;
    private b onLayoutCompletedListener;
    private dtn recyclerViewTouchHelper;
    private boolean isLocked = false;
    private float startY = -1.0f;
    private float startX = -1.0f;
    private boolean mIsTouching = false;
    private boolean isDuringLayout = false;
    private boolean isConsumingEvent = false;
    private boolean mCloseFastScroll = eps.d();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void j();

        void onDragUp();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c extends a {
        void l();

        void n();
    }

    static {
        t2o.a(468714496);
    }

    public LockableRecycerView(Context context) {
        super(context);
        init(context);
    }

    private int checkDragGesture(MotionEvent motionEvent) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb16e25c", new Object[]{this, motionEvent})).intValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.startX = motionEvent.getX();
            this.startY = motionEvent.getY();
            return 0;
        } else if (actionMasked == 1) {
            if (this.startY == -1.0f) {
                this.startY = motionEvent.getY();
            }
            if (this.startX == -1.0f) {
                this.startX = motionEvent.getX();
            }
            if (this.startY - motionEvent.getY() <= this.distanceY) {
                if (this.startY - motionEvent.getY() < (-this.distanceY)) {
                    i = -1;
                } else {
                    i = 0;
                }
            }
            this.startY = -1.0f;
            return i;
        } else if (actionMasked != 2) {
            this.startY = -1.0f;
            return 0;
        } else {
            if (this.startY == -1.0f) {
                this.startY = motionEvent.getY();
            }
            if (this.startX != -1.0f) {
                return 0;
            }
            this.startX = motionEvent.getX();
            return 0;
        }
    }

    private boolean checkIsTouching(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6477a3d5", new Object[]{this, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 2) {
            return true;
        }
        return false;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.distanceY = ViewConfiguration.get(context).getScaledTouchSlop() + pr9.c(context, 30);
        this.recyclerViewTouchHelper = new dtn(this);
    }

    public static /* synthetic */ Object ipc$super(LockableRecycerView lockableRecycerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -614473710:
                return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/list/view/LockableRecycerView");
        }
    }

    private boolean needInerceptGestureToAvoidFastScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de8b633", new Object[]{this})).booleanValue();
        }
        if (!this.mCloseFastScroll || this.mScrollState != 2) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.mHookScrollHorizontally || (this.mIsTouching && isShown())) {
            return super.canScrollHorizontally(i);
        }
        return false;
    }

    public RecyclerView.Recycler getRecycler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Recycler) ipChange.ipc$dispatch("73c1f670", new Object[]{this});
        }
        return this.mRecycler;
    }

    public boolean isConsumingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c812a336", new Object[]{this})).booleanValue();
        }
        return this.isConsumingEvent;
    }

    public boolean isDuringLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2221d20", new Object[]{this})).booleanValue();
        }
        return this.isDuringLayout;
    }

    public final boolean isLocked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4521f5f", new Object[]{this})).booleanValue();
        }
        if (this.isLocked || this.isAutoLock) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof RecyclerView.ViewHolder) && (adapter = getAdapter()) != null) {
                    adapter.onViewAttachedToWindow((RecyclerView.ViewHolder) tag);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RecyclerView.Adapter adapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            ir9.c(TAG, "", th);
        }
        try {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null) {
                    Object tag = childAt.getTag();
                    if ((tag instanceof RecyclerView.ViewHolder) && (adapter = getAdapter()) != null) {
                        adapter.onViewDetachedFromWindow((RecyclerView.ViewHolder) tag);
                    }
                }
            }
        } catch (Throwable th2) {
            ir9.c(TAG, "", th2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isLocked || this.isAutoLock) {
            int checkDragGesture = checkDragGesture(motionEvent);
            if (checkDragGesture == 1) {
                a aVar = this.onDragListener;
                if (aVar instanceof c) {
                    ((c) aVar).n();
                    return false;
                }
            }
            if (checkDragGesture == -1) {
                a aVar2 = this.onDragListener;
                if (aVar2 instanceof c) {
                    ((c) aVar2).l();
                }
            }
            return false;
        } else if (needInerceptGestureToAvoidFastScroll()) {
            ir9.b(TAG, "inercept gesture to avoid fast scroll in onIntercept");
            return false;
        } else {
            if (this.mHookScrollHorizontally) {
                this.mIsTouching = checkIsTouching(motionEvent);
            }
            if (!this.recyclerViewTouchHelper.d(motionEvent) || !super.onInterceptTouchEvent(motionEvent)) {
                z = false;
            }
            this.isConsumingEvent = z;
            return z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            this.isDuringLayout = true;
            super.onLayout(z, i, i2, i3, i4);
            b bVar = this.onLayoutCompletedListener;
            if (bVar != null) {
                ((MultiRecyclerViewAdapter.c) bVar).a();
            }
        } finally {
            this.isDuringLayout = false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        this.mScrollState = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        a aVar;
        a aVar2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        ir9.b(TAG, "albumEvent onTouchEvent ev=" + motionEvent.getAction());
        if (!this.isLocked && !this.isAutoLock) {
            if (needInerceptGestureToAvoidFastScroll()) {
                ir9.b(TAG, "inercept gesture to avoid fast scroll in touch");
            } else {
                int checkDragGesture = checkDragGesture(motionEvent);
                if (checkDragGesture == 1 && (aVar2 = this.onDragListener) != null) {
                    aVar2.onDragUp();
                } else if (checkDragGesture == -1 && (aVar = this.onDragListener) != null) {
                    aVar.j();
                }
                if (this.mHookScrollHorizontally) {
                    this.mIsTouching = checkIsTouching(motionEvent);
                }
                if (!this.recyclerViewTouchHelper.d(motionEvent) || !super.onTouchEvent(motionEvent)) {
                    z = false;
                } else {
                    z = true;
                }
                ir9.b(TAG, "albumEvent onTouchEvent;result=" + z + " mIsTouching=" + this.mIsTouching);
                if (z || !this.mIsTouching) {
                    z2 = false;
                }
                this.isConsumingEvent = z2;
                return z;
            }
        }
        z = false;
        if (z) {
        }
        z2 = false;
        this.isConsumingEvent = z2;
        return z;
    }

    public void setAutoLock(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b3d6b1", new Object[]{this, new Boolean(z)});
        } else {
            this.isAutoLock = z;
        }
    }

    public void setHookScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c46caa", new Object[]{this});
        } else {
            this.mHookScrollHorizontally = true;
        }
    }

    public final void setLocked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a399ca1", new Object[]{this, new Boolean(z)});
        } else {
            this.isLocked = z;
        }
    }

    public void setOnDragListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d3ac4b", new Object[]{this, aVar});
        } else {
            this.onDragListener = aVar;
        }
    }

    public void setOnLayoutCompletedListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8a5f93", new Object[]{this, bVar});
        } else {
            this.onLayoutCompletedListener = bVar;
        }
    }

    public void setRecycler(RecyclerView.Recycler recycler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78d1895e", new Object[]{this, recycler});
        } else {
            this.mRecycler = recycler;
        }
    }

    public LockableRecycerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public LockableRecycerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
