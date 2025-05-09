package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.DragStartHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DragStartHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mDragging;
    private int mLastTouchX;
    private int mLastTouchY;
    private final OnDragStartListener mListener;
    private final View.OnLongClickListener mLongClickListener = new View.OnLongClickListener() { // from class: tb.sw7
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return DragStartHelper.this.onLongClick(view);
        }
    };
    private final View.OnTouchListener mTouchListener = new View.OnTouchListener() { // from class: tb.tw7
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return DragStartHelper.this.onTouch(view, motionEvent);
        }
    };
    private final View mView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnDragStartListener {
        boolean onDragStart(View view, DragStartHelper dragStartHelper);
    }

    public DragStartHelper(View view, OnDragStartListener onDragStartListener) {
        this.mView = view;
        this.mListener = onDragStartListener;
    }

    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        ViewProxy.setOnLongClickListener(this.mView, this.mLongClickListener);
        ViewProxy.setOnTouchListener(this.mView, this.mTouchListener);
    }

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
            return;
        }
        ViewProxy.setOnLongClickListener(this.mView, null);
        ViewProxy.setOnTouchListener(this.mView, null);
    }

    public void getTouchPosition(Point point) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdbffc", new Object[]{this, point});
        } else {
            point.set(this.mLastTouchX, this.mLastTouchY);
        }
    }

    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        if (this.mDragging) {
            return true;
        }
        boolean onDragStart = this.mListener.onDragStart(view, this);
        this.mDragging = onDragStart;
        return onDragStart;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r6 != 3) goto L_0x0069;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            r3 = 3
            com.android.alibaba.ip.runtime.IpChange r4 = androidx.core.view.DragStartHelper.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = "d4aa3aa4"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r7
            r3[r1] = r8
            r3[r0] = r9
            java.lang.Object r8 = r4.ipc$dispatch(r5, r3)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0020:
            float r4 = r9.getX()
            int r4 = (int) r4
            float r5 = r9.getY()
            int r5 = (int) r5
            int r6 = r9.getAction()
            if (r6 == 0) goto L_0x0065
            if (r6 == r1) goto L_0x0062
            if (r6 == r0) goto L_0x0037
            if (r6 == r3) goto L_0x0062
            goto L_0x0069
        L_0x0037:
            r0 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = androidx.core.view.MotionEventCompat.isFromSource(r9, r0)
            if (r0 == 0) goto L_0x0069
            int r9 = r9.getButtonState()
            r9 = r9 & r1
            if (r9 != 0) goto L_0x0047
            goto L_0x0069
        L_0x0047:
            boolean r9 = r7.mDragging
            if (r9 == 0) goto L_0x004c
            goto L_0x0069
        L_0x004c:
            int r9 = r7.mLastTouchX
            if (r9 != r4) goto L_0x0055
            int r9 = r7.mLastTouchY
            if (r9 != r5) goto L_0x0055
            goto L_0x0069
        L_0x0055:
            r7.mLastTouchX = r4
            r7.mLastTouchY = r5
            androidx.core.view.DragStartHelper$OnDragStartListener r9 = r7.mListener
            boolean r8 = r9.onDragStart(r8, r7)
            r7.mDragging = r8
            return r8
        L_0x0062:
            r7.mDragging = r2
            goto L_0x0069
        L_0x0065:
            r7.mLastTouchX = r4
            r7.mLastTouchY = r5
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.DragStartHelper.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
