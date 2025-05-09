package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ShowableListMenu;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    public final View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation = new int[2];
    private Runnable mTriggerLongPress;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class DisallowIntercept implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DisallowIntercept() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ViewParent parent = ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class TriggerLongPress implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public TriggerLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ForwardingListener.this.onLongPress();
            }
        }
    }

    public ForwardingListener(View view) {
        this.mSrc = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.mTapTimeout = tapTimeout;
        this.mLongPressTimeout = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void clearCallbacks() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32273508", new Object[]{this});
            return;
        }
        Runnable runnable = this.mTriggerLongPress;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.mDisallowIntercept;
        if (runnable2 != null) {
            this.mSrc.removeCallbacks(runnable2);
        }
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
        DropDownListView dropDownListView;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f2ee44", new Object[]{this, motionEvent})).booleanValue();
        }
        View view = this.mSrc;
        ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing() || (dropDownListView = (DropDownListView) popup.getListView()) == null || !dropDownListView.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        toGlobalMotionEvent(view, obtainNoHistory);
        toLocalMotionEvent(dropDownListView, obtainNoHistory);
        boolean onForwardedEvent = dropDownListView.onForwardedEvent(obtainNoHistory, this.mActivePointerId);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            z = false;
        } else {
            z = true;
        }
        if (!onForwardedEvent || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r4 != 3) goto L_0x0086;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean onTouchObserved(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = androidx.appcompat.widget.ForwardingListener.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "c708c168"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            android.view.View r3 = r6.mSrc
            boolean r4 = r3.isEnabled()
            if (r4 != 0) goto L_0x0025
            return r1
        L_0x0025:
            int r4 = r7.getActionMasked()
            if (r4 == 0) goto L_0x005a
            if (r4 == r0) goto L_0x0056
            if (r4 == r2) goto L_0x0033
            r7 = 3
            if (r4 == r7) goto L_0x0056
            goto L_0x0086
        L_0x0033:
            int r2 = r6.mActivePointerId
            int r2 = r7.findPointerIndex(r2)
            if (r2 < 0) goto L_0x0086
            float r4 = r7.getX(r2)
            float r7 = r7.getY(r2)
            float r2 = r6.mScaledTouchSlop
            boolean r7 = pointInView(r3, r4, r7, r2)
            if (r7 != 0) goto L_0x0086
            r6.clearCallbacks()
            android.view.ViewParent r7 = r3.getParent()
            r7.requestDisallowInterceptTouchEvent(r0)
            return r0
        L_0x0056:
            r6.clearCallbacks()
            goto L_0x0086
        L_0x005a:
            int r7 = r7.getPointerId(r1)
            r6.mActivePointerId = r7
            java.lang.Runnable r7 = r6.mDisallowIntercept
            if (r7 != 0) goto L_0x006b
            androidx.appcompat.widget.ForwardingListener$DisallowIntercept r7 = new androidx.appcompat.widget.ForwardingListener$DisallowIntercept
            r7.<init>()
            r6.mDisallowIntercept = r7
        L_0x006b:
            java.lang.Runnable r7 = r6.mDisallowIntercept
            int r0 = r6.mTapTimeout
            long r4 = (long) r0
            r3.postDelayed(r7, r4)
            java.lang.Runnable r7 = r6.mTriggerLongPress
            if (r7 != 0) goto L_0x007e
            androidx.appcompat.widget.ForwardingListener$TriggerLongPress r7 = new androidx.appcompat.widget.ForwardingListener$TriggerLongPress
            r7.<init>()
            r6.mTriggerLongPress = r7
        L_0x007e:
            java.lang.Runnable r7 = r6.mTriggerLongPress
            int r0 = r6.mLongPressTimeout
            long r4 = (long) r0
            r3.postDelayed(r7, r4)
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ForwardingListener.onTouchObserved(android.view.MotionEvent):boolean");
    }

    private static boolean pointInView(View view, float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e73ed93", new Object[]{view, new Float(f), new Float(f2), new Float(f3)})).booleanValue();
        }
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= (view.getRight() - view.getLeft()) + f3 || f2 >= (view.getBottom() - view.getTop()) + f3) {
            return false;
        }
        return true;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2324e85e", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f23c110", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract ShowableListMenu getPopup();

    public boolean onForwardingStarted() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("375014b0", new Object[]{this})).booleanValue();
        }
        ShowableListMenu popup = getPopup();
        if (popup != null && !popup.isShowing()) {
            popup.show();
        }
        return true;
    }

    public boolean onForwardingStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afb2dffc", new Object[]{this})).booleanValue();
        }
        ShowableListMenu popup = getPopup();
        if (popup != null && popup.isShowing()) {
            popup.dismiss();
        }
        return true;
    }

    public void onLongPress() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad53188f", new Object[]{this});
            return;
        }
        clearCallbacks();
        View view = this.mSrc;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.mForwarding = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            return;
        }
        this.mForwarding = false;
        this.mActivePointerId = -1;
        Runnable runnable = this.mDisallowIntercept;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        boolean z2 = this.mForwarding;
        if (z2) {
            z = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            z = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.mForwarding = z;
        return z || z2;
    }
}
