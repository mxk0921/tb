package io.unicorn.plugin.platform;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class WeexNestedFrameLayout extends FrameLayout {
    private static final String TAG = "WeexNestedFrameLayout";
    private boolean isMoveSlideUp;
    private float mDispatchDownY;
    private float mDownX;
    private float mDownY;
    public boolean isPlatformListCanScroll = false;
    public boolean isWeex2Scrolling = false;
    public boolean isIntercept = false;
    private boolean mIsActionMove = false;
    private boolean isInterceptRoll = false;

    static {
        t2o.a(945815819);
    }

    public WeexNestedFrameLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r0 != 3) goto L_0x0049;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r5.getAction()
            r1 = 0
            if (r0 == 0) goto L_0x003d
            r2 = 1
            if (r0 == r2) goto L_0x0035
            r3 = 2
            if (r0 == r3) goto L_0x0011
            r2 = 3
            if (r0 == r2) goto L_0x0035
            goto L_0x0049
        L_0x0011:
            boolean r0 = r4.isInterceptRoll
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            r4.mIsActionMove = r2
            r4.isWeex2Scrolling = r2
            boolean r0 = r4.isPlatformListCanScroll
            if (r0 == 0) goto L_0x0025
            boolean r0 = r4.isIntercept
            if (r0 == 0) goto L_0x0025
            r5.setAction(r1)
        L_0x0025:
            float r0 = r5.getRawY()
            float r3 = r4.mDispatchDownY
            float r0 = r0 - r3
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0032
            r1 = 1
        L_0x0032:
            r4.isMoveSlideUp = r1
            goto L_0x0049
        L_0x0035:
            boolean r0 = r4.isInterceptRoll
            if (r0 == 0) goto L_0x003a
            return r1
        L_0x003a:
            r4.mIsActionMove = r1
            goto L_0x0049
        L_0x003d:
            float r0 = r5.getRawY()
            r4.mDispatchDownY = r0
            r4.mIsActionMove = r1
            r4.isWeex2Scrolling = r1
            r4.isInterceptRoll = r1
        L_0x0049:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.plugin.platform.WeexNestedFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean isActionMove() {
        return this.mIsActionMove;
    }

    public boolean isMoveSlideUp() {
        return this.isMoveSlideUp;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
        } else if ((action == 1 || action == 2) && this.mDownX == motionEvent.getRawX() && this.mDownY == motionEvent.getRawY()) {
            return false;
        }
        if (this.isPlatformListCanScroll || !this.isWeex2Scrolling) {
            this.isIntercept = false;
            return super.onInterceptTouchEvent(motionEvent);
        }
        this.isIntercept = true;
        return true;
    }

    public void setInterceptRoll(boolean z) {
        this.isInterceptRoll = z;
    }

    public void setPlatformListCanScroll(boolean z) {
        this.isPlatformListCanScroll = z;
    }
}
