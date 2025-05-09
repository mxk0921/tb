package com.taobao.android.tbsku.image;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ViewPagerFixed extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private float mLastMotionX;
    private float mLastMotionY;

    static {
        t2o.a(785383541);
    }

    public ViewPagerFixed(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ViewPagerFixed viewPagerFixed, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/tbsku/image/ViewPagerFixed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3 != 3) goto L_0x00a3;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tbsku.image.ViewPagerFixed.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            r2[r0] = r10
            java.lang.Object r10 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L_0x001c:
            int r3 = r10.getActionMasked()
            if (r3 == 0) goto L_0x008c
            if (r3 == r0) goto L_0x007b
            if (r3 == r2) goto L_0x002b
            r0 = 3
            if (r3 == r0) goto L_0x007b
            goto L_0x00a3
        L_0x002b:
            float r2 = r10.getY()
            float r3 = r10.getX()
            float r4 = r9.mLastMotionX
            float r4 = r3 - r4
            float r5 = r9.mLastMotionY
            float r5 = r2 - r5
            float r6 = r9.mInitialMotionY
            float r6 = r2 - r6
            float r6 = java.lang.Math.abs(r6)
            float r7 = r9.mInitialMotionX
            float r7 = r3 - r7
            float r7 = java.lang.Math.abs(r7)
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            r8 = 1051931443(0x3eb33333, float:0.35)
            float r5 = r5 * r8
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x006c
            float r6 = r6 * r8
            int r4 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0063
            goto L_0x006c
        L_0x0063:
            int r0 = com.taobao.taobao.R.id.sku_child_first_intercept
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r9.setTag(r0, r4)
            r0 = 0
            goto L_0x0075
        L_0x006c:
            android.view.ViewParent r1 = r9.getParent()
            if (r1 == 0) goto L_0x0075
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x0075:
            r9.mLastMotionY = r2
            r9.mLastMotionX = r3
            r1 = r0
            goto L_0x00a3
        L_0x007b:
            r0 = 0
            r9.mInitialMotionY = r0
            r9.mLastMotionY = r0
            r9.mInitialMotionX = r0
            r9.mLastMotionX = r0
            int r0 = com.taobao.taobao.R.id.sku_child_first_intercept
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r9.setTag(r0, r2)
            goto L_0x00a3
        L_0x008c:
            float r0 = r10.getY()
            r9.mInitialMotionY = r0
            r9.mLastMotionY = r0
            float r0 = r10.getX()
            r9.mInitialMotionX = r0
            r9.mLastMotionX = r0
            int r0 = com.taobao.taobao.R.id.sku_child_first_intercept
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r9.setTag(r0, r2)
        L_0x00a3:
            boolean r10 = super.onInterceptTouchEvent(r10)     // Catch: all -> 0x00a8
            r1 = r1 | r10
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbsku.image.ViewPagerFixed.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public ViewPagerFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
