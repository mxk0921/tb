package com.taobao.message.lab.comfrm.support.list;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.UIHandler;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class LongClickListenFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isLongClick;
    private OnWrapClickListener onClickListener;
    private OnLongPressListener onLongPressListener;
    private long time;
    private float x = -1.0f;
    private float y = -1.0f;
    private int foregroundColor = 268435456;
    private final MyRunnable myRunnable = new MyRunnable();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MyRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919830);
        }

        private MyRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!(LongClickListenFrameLayout.access$000(LongClickListenFrameLayout.this) == -1.0f || LongClickListenFrameLayout.access$100(LongClickListenFrameLayout.this) == -1.0f)) {
                LongClickListenFrameLayout.access$202(LongClickListenFrameLayout.this, true);
                if (LongClickListenFrameLayout.access$300(LongClickListenFrameLayout.this) != null) {
                    LongClickListenFrameLayout.access$300(LongClickListenFrameLayout.this).onLongPress(LongClickListenFrameLayout.this, null);
                }
            }
            LongClickListenFrameLayout.access$400(LongClickListenFrameLayout.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface OnLongPressListener {
        void onLongPress(View view, MotionEvent motionEvent);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface OnWrapClickListener {
        void onClick(View view);
    }

    static {
        t2o.a(537919828);
    }

    public LongClickListenFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ float access$000(LongClickListenFrameLayout longClickListenFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdfafff7", new Object[]{longClickListenFrameLayout})).floatValue();
        }
        return longClickListenFrameLayout.x;
    }

    public static /* synthetic */ float access$100(LongClickListenFrameLayout longClickListenFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6fc5196", new Object[]{longClickListenFrameLayout})).floatValue();
        }
        return longClickListenFrameLayout.y;
    }

    public static /* synthetic */ boolean access$202(LongClickListenFrameLayout longClickListenFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1547535", new Object[]{longClickListenFrameLayout, new Boolean(z)})).booleanValue();
        }
        longClickListenFrameLayout.isLongClick = z;
        return z;
    }

    public static /* synthetic */ OnLongPressListener access$300(LongClickListenFrameLayout longClickListenFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnLongPressListener) ipChange.ipc$dispatch("d79fe69a", new Object[]{longClickListenFrameLayout});
        }
        return longClickListenFrameLayout.onLongPressListener;
    }

    public static /* synthetic */ void access$400(LongClickListenFrameLayout longClickListenFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32004683", new Object[]{longClickListenFrameLayout});
        } else {
            longClickListenFrameLayout.reset();
        }
    }

    public static /* synthetic */ Object ipc$super(LongClickListenFrameLayout longClickListenFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/LongClickListenFrameLayout");
    }

    private boolean isMove(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d7d0abb", new Object[]{this, motionEvent})).booleanValue();
        }
        if (Math.abs(this.x - motionEvent.getX()) > ViewConfiguration.get(getContext()).getScaledTouchSlop() || Math.abs(this.y - motionEvent.getY()) > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
            return true;
        }
        return false;
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.x = -1.0f;
        this.y = -1.0f;
        UIHandler.removeCallbacks(this.myRunnable);
        setForeground(new ColorDrawable(0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        OnLongPressListener onLongPressListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0 && this.x == -1.0f && this.y == -1.0f) {
            this.isLongClick = false;
            this.x = motionEvent.getX();
            this.y = motionEvent.getY();
            setForeground(new ColorDrawable(this.foregroundColor));
            this.time = SystemClock.uptimeMillis();
            UIHandler.postDelayed(this.myRunnable, ViewConfiguration.getLongPressTimeout());
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 4) {
            reset();
            if (this.isLongClick) {
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (SystemClock.uptimeMillis() - this.time >= ViewConfiguration.getLongPressTimeout()) {
                if (!(this.x == -1.0f || this.y == -1.0f || (onLongPressListener = this.onLongPressListener) == null)) {
                    onLongPressListener.onLongPress(this, null);
                }
                reset();
                return true;
            }
            OnWrapClickListener onWrapClickListener = this.onClickListener;
            if (onWrapClickListener != null) {
                onWrapClickListener.onClick(this);
            }
            reset();
        } else if (isMove(motionEvent)) {
            reset();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnLongPressListener(OnLongPressListener onLongPressListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f59e05", new Object[]{this, onLongPressListener});
        } else {
            this.onLongPressListener = onLongPressListener;
        }
    }

    public void setOnWrapClickListener(OnWrapClickListener onWrapClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b830d57", new Object[]{this, onWrapClickListener});
        } else {
            this.onClickListener = onWrapClickListener;
        }
    }

    public void setSelector(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd14419b", new Object[]{this, new Integer(i)});
        } else {
            this.foregroundColor = i;
        }
    }

    public LongClickListenFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LongClickListenFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
