package com.etao.feimagesearch.result;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ScrollerCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FirstChildOffsetView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mFlingRunnable;
    private ScrollerCompat mScroller;
    private int mOffset = 0;
    private boolean mCenter = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297414);
        }

        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FirstChildOffsetView.access$100(FirstChildOffsetView.this) != null && FirstChildOffsetView.access$100(FirstChildOffsetView.this).computeScrollOffset()) {
                int access$200 = FirstChildOffsetView.access$200(FirstChildOffsetView.this);
                int currY = FirstChildOffsetView.access$100(FirstChildOffsetView.this).getCurrY();
                if (access$200 != currY) {
                    FirstChildOffsetView.this.moveChildTo(currY);
                }
                ViewCompat.postOnAnimation(FirstChildOffsetView.this, this);
            }
        }
    }

    static {
        t2o.a(481297412);
    }

    public FirstChildOffsetView(Context context) {
        super(context);
    }

    public static /* synthetic */ ScrollerCompat access$100(FirstChildOffsetView firstChildOffsetView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerCompat) ipChange.ipc$dispatch("89ada134", new Object[]{firstChildOffsetView});
        }
        return firstChildOffsetView.mScroller;
    }

    public static /* synthetic */ int access$200(FirstChildOffsetView firstChildOffsetView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c1be434", new Object[]{firstChildOffsetView})).intValue();
        }
        return firstChildOffsetView.mOffset;
    }

    private int constrainOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1102cca5", new Object[]{this, new Integer(i)})).intValue();
        }
        int measuredHeight = getChildAt(0).getMeasuredHeight();
        if (measuredHeight <= getMeasuredHeight()) {
            return this.mOffset;
        }
        if (i > 0) {
            return 0;
        }
        if (i < getMeasuredHeight() - measuredHeight) {
            return getMeasuredHeight() - measuredHeight;
        }
        return i;
    }

    private void flyInternal(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6195f777", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        Runnable runnable = this.mFlingRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.mFlingRunnable = null;
        }
        if (this.mScroller == null) {
            this.mScroller = ScrollerCompat.create(getContext());
        }
        if (!this.mScroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        this.mScroller.startScroll(0, i, 0, i2 - i, 300);
        if (this.mScroller.computeScrollOffset()) {
            b bVar = new b();
            this.mFlingRunnable = bVar;
            ViewCompat.postOnAnimation(this, bVar);
        }
    }

    private int getDownStateOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba889ec6", new Object[]{this})).intValue();
        }
        return 1700;
    }

    public static /* synthetic */ Object ipc$super(FirstChildOffsetView firstChildOffsetView, String str, Object... objArr) {
        if (str.hashCode() == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/result/FirstChildOffsetView");
    }

    private boolean onChildRegion(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75bc5bf1", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getY() >= this.mOffset) {
            return true;
        }
        return false;
    }

    public void appearAnim(boolean z) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a1c69a7", new Object[]{this, new Boolean(z)});
            return;
        }
        int i2 = this.mOffset;
        if (!z) {
            i = getDownStateOffset();
        }
        flyInternal(i2, i);
    }

    public void flyChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d6fd18", new Object[]{this, new Integer(i)});
        } else {
            flyInternal(this.mOffset, constrainOffset(i));
        }
    }

    public int getChildState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8cab8fc5", new Object[]{this})).intValue();
        }
        return this.mOffset;
    }

    public int getOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7531f83", new Object[]{this})).intValue();
        }
        return this.mOffset;
    }

    public boolean isCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c69b1b2a", new Object[]{this})).booleanValue();
        }
        return this.mCenter;
    }

    public void moveChildBy(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef6db1a", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = getChildAt(0);
        int constrainOffset = constrainOffset(this.mOffset + i);
        ViewCompat.offsetTopAndBottom(childAt, constrainOffset - this.mOffset);
        this.mOffset = constrainOffset;
    }

    public void moveChildTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26168f76", new Object[]{this, new Integer(i)});
            return;
        }
        View childAt = getChildAt(0);
        int constrainOffset = constrainOffset(i);
        ViewCompat.offsetTopAndBottom(childAt, constrainOffset - this.mOffset);
        this.mOffset = constrainOffset;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = i4 - i2;
        if (isCenter()) {
            this.mOffset = (i5 - measuredHeight) / 2;
        }
        ViewCompat.offsetTopAndBottom(childAt, this.mOffset);
    }

    public void setCenter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1101a36", new Object[]{this, new Boolean(z)});
        } else {
            this.mCenter = z;
        }
    }

    public FirstChildOffsetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FirstChildOffsetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
