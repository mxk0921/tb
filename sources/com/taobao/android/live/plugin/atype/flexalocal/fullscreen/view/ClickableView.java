package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gu3;
import tb.hw0;
import tb.qoc;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ClickableView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private gu3 mClickUtil;
    private boolean mIsScreenEdge;
    private qoc mOnLongClickListener;
    private boolean mHasLongClick = false;
    private final Runnable mOnLongClickRunnable = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            ClickableView.access$002(ClickableView.this, true);
            if (ClickableView.access$100(ClickableView.this) != null) {
                if (ClickableView.this.getParent() != null) {
                    ClickableView.this.getParent().requestDisallowInterceptTouchEvent(true);
                }
                qoc access$100 = ClickableView.access$100(ClickableView.this);
                ClickableView clickableView = ClickableView.this;
                access$100.a(clickableView, ClickableView.access$200(clickableView));
            }
        }
    }

    static {
        t2o.a(295698827);
    }

    public ClickableView(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ boolean access$002(ClickableView clickableView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("925fed35", new Object[]{clickableView, new Boolean(z)})).booleanValue();
        }
        clickableView.mHasLongClick = z;
        return z;
    }

    public static /* synthetic */ qoc access$100(ClickableView clickableView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qoc) ipChange.ipc$dispatch("3e48ae78", new Object[]{clickableView});
        }
        return clickableView.mOnLongClickListener;
    }

    public static /* synthetic */ boolean access$200(ClickableView clickableView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63154e87", new Object[]{clickableView})).booleanValue();
        }
        return clickableView.mIsScreenEdge;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            setClickable(true);
        }
    }

    public static /* synthetic */ Object ipc$super(ClickableView clickableView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/view/ClickableView");
    }

    private void longClickOnTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af0f1dc2", new Object[]{this, motionEvent});
            return;
        }
        int x = (int) motionEvent.getX();
        int i = hw0.i();
        if (x >= 188 && x <= i - 188) {
            z = false;
        }
        this.mIsScreenEdge = z;
        postDelayedLongPressCallback();
    }

    private void onLongPressCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4423029", new Object[]{this});
            return;
        }
        removeLongPressCallback();
        if (this.mOnLongClickListener != null) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (this.mHasLongClick) {
                this.mOnLongClickListener.c();
            }
        }
        this.mHasLongClick = false;
    }

    private void postDelayedLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eec6d391", new Object[]{this});
        } else {
            postDelayed(this.mOnLongClickRunnable, 800L);
        }
    }

    private void removeLongPressCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a2f8ef", new Object[]{this});
            return;
        }
        Runnable runnable = this.mOnLongClickRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
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

    public void setOnLongClickListener(qoc qocVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e79932c", new Object[]{this, qocVar});
        } else {
            this.mOnLongClickListener = qocVar;
        }
    }

    public void setOnMultiClickListener(gu3.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb7ad13", new Object[]{this, dVar});
        } else {
            this.mClickUtil = new gu3(getContext(), dVar);
        }
    }

    public void setOnSingleClickListener(gu3.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730988cd", new Object[]{this, cVar});
        } else {
            this.mClickUtil = new gu3(getContext(), cVar);
        }
    }

    public ClickableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ClickableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
