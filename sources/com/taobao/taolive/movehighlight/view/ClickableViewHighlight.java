package com.taobao.taolive.movehighlight.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gu3;
import tb.iw0;
import tb.qoc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ClickableViewHighlight extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private gu3 mClickUtil;
    private boolean mIsScreenEdge;
    private qoc mOnViewPagerLongClickListener;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mHasLongClick = false;
    private final Runnable mOnLongClickRunnable = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ClickableViewHighlight.access$002(ClickableViewHighlight.this, true);
            if (ClickableViewHighlight.access$100(ClickableViewHighlight.this) != null) {
                ClickableViewHighlight.this.getParent().requestDisallowInterceptTouchEvent(true);
                qoc access$100 = ClickableViewHighlight.access$100(ClickableViewHighlight.this);
                ClickableViewHighlight clickableViewHighlight = ClickableViewHighlight.this;
                access$100.a(clickableViewHighlight, ClickableViewHighlight.access$200(clickableViewHighlight));
            }
        }
    }

    static {
        t2o.a(779092728);
    }

    public ClickableViewHighlight(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ boolean access$002(ClickableViewHighlight clickableViewHighlight, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd8c06a7", new Object[]{clickableViewHighlight, new Boolean(z)})).booleanValue();
        }
        clickableViewHighlight.mHasLongClick = z;
        return z;
    }

    public static /* synthetic */ qoc access$100(ClickableViewHighlight clickableViewHighlight) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoc) ipChange.ipc$dispatch("9ee08c8c", new Object[]{clickableViewHighlight});
        }
        return clickableViewHighlight.mOnViewPagerLongClickListener;
    }

    public static /* synthetic */ boolean access$200(ClickableViewHighlight clickableViewHighlight) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a039dd5", new Object[]{clickableViewHighlight})).booleanValue();
        }
        return clickableViewHighlight.mIsScreenEdge;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setClickable(true);
        }
    }

    public static /* synthetic */ Object ipc$super(ClickableViewHighlight clickableViewHighlight, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/view/ClickableViewHighlight");
    }

    private void longClickOnTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0f1dc2", new Object[]{this, motionEvent});
        } else if (motionEvent != null) {
            int x = (int) motionEvent.getX();
            int g = iw0.g();
            if (x >= 188 && x <= g - 188) {
                z = false;
            }
            this.mIsScreenEdge = z;
            this.mHandler.postDelayed(this.mOnLongClickRunnable, 800L);
        }
    }

    private void onLongPressCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4423029", new Object[]{this});
            return;
        }
        removeLongPressCallback();
        if (this.mOnViewPagerLongClickListener != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.mHasLongClick) {
                this.mOnViewPagerLongClickListener.c();
            }
        }
        this.mHasLongClick = false;
    }

    private void removeLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a2f8ef", new Object[]{this});
            return;
        }
        Runnable runnable = this.mOnLongClickRunnable;
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            gu3 gu3Var = this.mClickUtil;
            if (gu3Var != null) {
                gu3Var.j(motionEvent.getX(), motionEvent.getY());
            }
            removeLongPressCallback();
            longClickOnTouchEvent(motionEvent);
        } else if (action == 1 || action == 3) {
            gu3 gu3Var2 = this.mClickUtil;
            if (gu3Var2 != null) {
                gu3Var2.k(motionEvent.getX(), motionEvent.getY());
            }
            onLongPressCancel();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnSingleClickListener(gu3.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730988cd", new Object[]{this, cVar});
        } else {
            this.mClickUtil = new gu3(getContext(), cVar);
        }
    }

    public void setOnViewPagerLongClickListener(qoc qocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb795550", new Object[]{this, qocVar});
        } else {
            this.mOnViewPagerLongClickListener = qocVar;
        }
    }

    public ClickableViewHighlight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ClickableViewHighlight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
