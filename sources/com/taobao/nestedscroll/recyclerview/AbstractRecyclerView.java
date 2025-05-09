package com.taobao.nestedscroll.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import tb.jrj;
import tb.lrj;
import tb.t4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class AbstractRecyclerView extends RecyclerView implements lrj, jrj, t4d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float EPSILON = 2.0E-5f;
    public int mDisabledDirection;
    public float mLastMotionX;
    public float mLastMotionY;
    public int mVelocityY;
    public boolean mInterceptTouch = true;
    public boolean mEatInterceptTouch = true;
    public boolean mEatTouchEvent = true;

    public AbstractRecyclerView(Context context) {
        super(context);
    }

    private Field getFieldRecursively(String str) {
        Field declaredField;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("9037d6a9", new Object[]{this, str});
        }
        for (Class<? super Object> superclass = getClass().getSuperclass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                declaredField = superclass.getDeclaredField(str);
            } catch (Throwable unused) {
            }
            if (declaredField != null) {
                return declaredField;
            }
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(AbstractRecyclerView abstractRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1852077959:
                return new Boolean(super.fling(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue()));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/nestedscroll/recyclerview/AbstractRecyclerView");
        }
    }

    @Override // tb.lrj, tb.jrj
    public boolean acceptNestedFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68770903", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return isAccepted(i);
    }

    @Override // tb.lrj, tb.jrj
    public boolean acceptNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b04ce314", new Object[]{this, new Integer(i)})).booleanValue();
        }
        return isAccepted(i);
    }

    @Override // tb.lrj, tb.jrj
    public boolean dispatchNestedFling(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("daef7475", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!isAttachedToWindow()) {
            return false;
        }
        this.mInterceptTouch = true;
        fling(0, i);
        return acceptNestedFling(i);
    }

    @Override // tb.lrj, tb.jrj
    public boolean dispatchNestedScroll(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ce1e5e2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!isAttachedToWindow()) {
            return false;
        }
        this.mInterceptTouch = true;
        scrollBy(0, i);
        return acceptNestedScroll(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e647787", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        this.mVelocityY = i2;
        return fling;
    }

    public int getDisabledDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a05865a7", new Object[]{this})).intValue();
        }
        return this.mDisabledDirection;
    }

    public int getNestedScrollChildHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43fe77e3", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean isAccepted(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c10e70f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!isAttachedToWindow() || ((i2 = this.mDisabledDirection) != 0 && i2 * i >= 0)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        resetScroll();
    }

    @Override // tb.t4d
    public void onDisabledDirection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("562bc598", new Object[]{this, new Integer(i)});
        } else {
            this.mDisabledDirection = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3 != 3) goto L_0x0073;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.nestedscroll.recyclerview.AbstractRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            int r3 = r6.getAction()
            if (r3 == 0) goto L_0x0065
            if (r3 == r0) goto L_0x0062
            if (r3 == r2) goto L_0x002a
            r2 = 3
            if (r3 == r2) goto L_0x0062
            goto L_0x0073
        L_0x002a:
            float r0 = r5.mLastMotionY
            float r2 = r6.getRawY()
            float r0 = r0 - r2
            float r2 = r5.mLastMotionX
            float r3 = r6.getRawX()
            float r2 = r2 - r3
            float r0 = java.lang.Math.abs(r0)
            float r3 = r6.getRawY()
            r5.mLastMotionY = r3
            float r3 = r6.getRawX()
            r5.mLastMotionX = r3
            r3 = 933741996(0x37a7c5ac, float:2.0E-5)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0073
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0073
            boolean r0 = r5.mInterceptTouch
            if (r0 != 0) goto L_0x0073
            int r0 = r5.mDisabledDirection
            if (r0 == 0) goto L_0x0073
            r5.mEatInterceptTouch = r1
            goto L_0x0073
        L_0x0062:
            r5.mEatInterceptTouch = r0
            goto L_0x0073
        L_0x0065:
            r5.mEatInterceptTouch = r0
            float r0 = r6.getRawY()
            r5.mLastMotionY = r0
            float r0 = r6.getRawX()
            r5.mLastMotionX = r0
        L_0x0073:
            boolean r0 = r5.mEatInterceptTouch
            if (r0 != 0) goto L_0x0078
            return r1
        L_0x0078:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.nestedscroll.recyclerview.AbstractRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onParentScrollStatusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88ee564", new Object[]{this, new Integer(i)});
        }
    }

    public void onParentScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143a821c", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.t4d
    public abstract /* synthetic */ boolean onReachedEdge(int i, int i2);

    public void onScrolledByNestedParent(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cce2566", new Object[]{this, lrjVar});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3 != 3) goto L_0x0096;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.nestedscroll.recyclerview.AbstractRecyclerView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a9b14c3a"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            int r3 = r8.getAction()
            if (r3 == 0) goto L_0x0088
            if (r3 == r0) goto L_0x0085
            if (r3 == r2) goto L_0x002a
            r1 = 3
            if (r3 == r1) goto L_0x0085
            goto L_0x0096
        L_0x002a:
            float r2 = r7.mLastMotionY
            float r3 = r8.getRawY()
            float r2 = r2 - r3
            float r3 = r7.mLastMotionX
            float r4 = r8.getRawX()
            float r3 = r3 - r4
            float r4 = java.lang.Math.abs(r2)
            float r5 = r8.getRawY()
            r7.mLastMotionY = r5
            float r5 = r8.getRawX()
            r7.mLastMotionX = r5
            r5 = 933741996(0x37a7c5ac, float:2.0E-5)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0096
            float r3 = java.lang.Math.abs(r3)
            float r4 = r4 - r3
            int r3 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0096
            boolean r3 = r7.mInterceptTouch
            if (r3 != 0) goto L_0x0079
            int r3 = r7.mDisabledDirection
            if (r3 == 0) goto L_0x0079
            boolean r4 = r7.mEatTouchEvent
            if (r4 == 0) goto L_0x006d
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x006d
            r7.mEatTouchEvent = r1
        L_0x006d:
            boolean r3 = r7.mEatTouchEvent
            if (r3 != 0) goto L_0x0096
            int r2 = java.lang.Math.round(r2)
            r7.onReachedEdge(r2, r1)
            goto L_0x0096
        L_0x0079:
            boolean r1 = r7.mEatTouchEvent
            if (r1 != 0) goto L_0x0096
            int r1 = java.lang.Math.round(r2)
            r7.dispatchNestedScroll(r1)
            goto L_0x0096
        L_0x0085:
            r7.mEatTouchEvent = r0
            goto L_0x0096
        L_0x0088:
            r7.mEatTouchEvent = r0
            float r1 = r8.getRawY()
            r7.mLastMotionY = r1
            float r1 = r8.getRawX()
            r7.mLastMotionX = r1
        L_0x0096:
            boolean r1 = r7.mEatTouchEvent
            if (r1 != 0) goto L_0x009b
            return r0
        L_0x009b:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.nestedscroll.recyclerview.AbstractRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void resetScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407c1f83", new Object[]{this});
            return;
        }
        this.mInterceptTouch = true;
        this.mDisabledDirection = 0;
    }

    public void setNestedScrollChild(jrj jrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc68cf31", new Object[]{this, jrjVar});
        }
    }

    public void setNestedScrollParent(lrj lrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("750ad753", new Object[]{this, lrjVar});
        }
    }

    public float invokeCurrentVelocity() {
        try {
            Field fieldRecursively = getFieldRecursively("mViewFlinger");
            if (fieldRecursively == null) {
                return 0.0f;
            }
            fieldRecursively.setAccessible(true);
            Object obj = fieldRecursively.get(this);
            Field declaredField = obj.getClass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            Field declaredField2 = obj2.getClass().getDeclaredField("mScrollerY");
            declaredField2.setAccessible(true);
            Object obj3 = declaredField2.get(obj2);
            Field declaredField3 = obj3.getClass().getDeclaredField("mCurrVelocity");
            declaredField3.setAccessible(true);
            return ((Float) declaredField3.get(obj3)).floatValue();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public AbstractRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
