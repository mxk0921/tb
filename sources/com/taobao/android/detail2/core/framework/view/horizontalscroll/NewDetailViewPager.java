package com.taobao.android.detail2.core.framework.view.horizontalscroll;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cae;
import tb.hfw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailViewPager extends ViewPager implements cae {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean mIsAvailable = false;
    private int mLastInterceptEventX;
    private hfw mViewPagerFeature;

    static {
        t2o.a(352322036);
        t2o.a(352321909);
    }

    public NewDetailViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(NewDetailViewPager newDetailViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 222452193) {
            return new Boolean(super.canScroll((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue()));
        }
        if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail2/core/framework/view/horizontalscroll/NewDetailViewPager");
    }

    @Override // tb.cae
    public boolean callSuperCanScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c4c33e", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    @Override // tb.cae
    public boolean callSuperDispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("217cd1b2", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // tb.cae
    public boolean callSuperOnInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43f19901", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4259e1", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        hfw hfwVar = this.mViewPagerFeature;
        if (hfwVar != null) {
            return hfwVar.d(view, z, i, i2, i3);
        }
        return super.canScroll(view, z, i, i2, i3);
    }

    @Override // tb.cae
    public ViewPager getViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager) ipChange.ipc$dispatch("b97c6756", new Object[]{this});
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (super.onInterceptTouchEvent(r6) != false) goto L_0x004b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (super.onInterceptTouchEvent(r6) != false) goto L_0x004b;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail2.core.framework.view.horizontalscroll.NewDetailViewPager.$ipChange
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
            float r3 = r6.getX()
            int r3 = (int) r3
            int r4 = r5.getCurrentItem()
            if (r4 != 0) goto L_0x004d
            int r4 = r6.getAction()
            if (r4 != r2) goto L_0x003f
            int r2 = r5.mLastInterceptEventX
            int r2 = r3 - r2
            if (r2 <= 0) goto L_0x0034
            goto L_0x005a
        L_0x0034:
            boolean r2 = r5.mIsAvailable
            if (r2 == 0) goto L_0x004a
            boolean r6 = super.onInterceptTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x003f:
            boolean r2 = r5.mIsAvailable
            if (r2 == 0) goto L_0x004a
            boolean r6 = super.onInterceptTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r1 = r0
            goto L_0x005a
        L_0x004d:
            tb.hfw r0 = r5.mViewPagerFeature
            if (r0 == 0) goto L_0x0056
            boolean r6 = r0.f(r6)
            return r6
        L_0x0056:
            boolean r1 = super.onInterceptTouchEvent(r6)
        L_0x005a:
            r5.mLastInterceptEventX = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail2.core.framework.view.horizontalscroll.NewDetailViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setIsAvailable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("753f0e50", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsAvailable = z;
        }
    }

    public void setViewPagerFeature(hfw hfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7417dc", new Object[]{this, hfwVar});
        } else {
            this.mViewPagerFeature = hfwVar;
        }
    }
}
