package com.taobao.homepage.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ViewPagerFakeDragView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ViewPagerFakeDragView";
    private static boolean lastIsTouchFakeDragView = false;
    private boolean enableFakeDrag;
    private float lastDownX;
    private float lastTouchX;
    private boolean shouldDispatch;
    private ViewConfiguration viewConfiguration;
    private a viewGetter;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        ArrayList<View> a();

        ViewPager getViewPager();
    }

    static {
        t2o.a(729809194);
    }

    public ViewPagerFakeDragView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(ViewPagerFakeDragView viewPagerFakeDragView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/view/widgets/ViewPagerFakeDragView");
        }
    }

    public static boolean isLastIsTouchFakeDragView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7039494e", new Object[0])).booleanValue();
        }
        return lastIsTouchFakeDragView;
    }

    public static void setLastIsTouchFakeDragView(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221fbe02", new Object[]{new Boolean(z)});
        } else {
            lastIsTouchFakeDragView = z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r4 != 3) goto L_0x00bc;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.homepage.view.widgets.ViewPagerFakeDragView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "7bb68bd5"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            java.lang.Object r8 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            com.taobao.homepage.view.widgets.ViewPagerFakeDragView$a r3 = r7.viewGetter
            if (r3 == 0) goto L_0x00ef
            androidx.viewpager.widget.ViewPager r3 = r3.getViewPager()
            if (r3 == 0) goto L_0x00ef
            boolean r3 = r7.enableFakeDrag
            if (r3 != 0) goto L_0x002c
            goto L_0x00ef
        L_0x002c:
            setLastIsTouchFakeDragView(r0)
            com.taobao.homepage.view.widgets.ViewPagerFakeDragView$a r3 = r7.viewGetter
            androidx.viewpager.widget.ViewPager r3 = r3.getViewPager()
            int r4 = r8.getAction()
            java.lang.String r5 = "ViewPagerFakeDragView"
            if (r4 == 0) goto L_0x0067
            if (r4 == r0) goto L_0x0046
            if (r4 == r2) goto L_0x007a
            r1 = 3
            if (r4 == r1) goto L_0x0046
            goto L_0x00bc
        L_0x0046:
            java.lang.String r1 = "dispatchTouchEvent up"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            tb.bqa.e(r5, r1)
            boolean r1 = r3.isFakeDragging()
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = "endFakeDrag"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            tb.bqa.e(r5, r1)
            r3.endFakeDrag()
        L_0x0061:
            r1 = 0
            r7.lastTouchX = r1
            r7.lastDownX = r1
            goto L_0x00bc
        L_0x0067:
            java.lang.String r2 = "dispatchTouchEvent down"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            tb.bqa.e(r5, r2)
            r7.shouldDispatch = r0
            float r2 = r8.getX()
            r7.lastTouchX = r2
            r7.lastDownX = r2
        L_0x007a:
            float r2 = r8.getX()
            float r4 = r7.lastDownX
            float r4 = r4 - r2
            float r4 = java.lang.Math.abs(r4)
            int r4 = (int) r4
            android.view.ViewConfiguration r6 = r7.viewConfiguration
            int r6 = r6.getScaledTouchSlop()
            if (r4 <= r6) goto L_0x009d
            boolean r4 = r7.shouldDispatch
            if (r4 == 0) goto L_0x009d
            java.lang.String r4 = "dispatchTouchEvent shouldDispatch make false"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            tb.bqa.e(r5, r4)
            r7.shouldDispatch = r1
        L_0x009d:
            boolean r1 = r7.shouldDispatch
            if (r1 != 0) goto L_0x00ba
            boolean r1 = r3.isFakeDragging()
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = "beginFakeDrag"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            tb.bqa.e(r5, r1)
            r3.beginFakeDrag()
        L_0x00b3:
            float r1 = r7.lastTouchX
            float r1 = r2 - r1
            r3.fakeDragBy(r1)
        L_0x00ba:
            r7.lastTouchX = r2
        L_0x00bc:
            boolean r1 = r7.shouldDispatch
            if (r1 == 0) goto L_0x00ea
            java.lang.String r1 = "dispatch event to views"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            tb.bqa.e(r5, r1)
            com.taobao.homepage.view.widgets.ViewPagerFakeDragView$a r1 = r7.viewGetter
            java.util.ArrayList r1 = r1.a()
            if (r1 == 0) goto L_0x00ea
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x00ea
            int r2 = r1.size()
            int r2 = r2 - r0
        L_0x00dc:
            if (r2 <= 0) goto L_0x00ea
            java.lang.Object r0 = r1.get(r2)
            android.view.View r0 = (android.view.View) r0
            r0.dispatchTouchEvent(r8)
            int r2 = r2 + (-1)
            goto L_0x00dc
        L_0x00ea:
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        L_0x00ef:
            boolean r8 = super.onInterceptTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.view.widgets.ViewPagerFakeDragView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public a getViewGetter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d229c01a", new Object[]{this});
        }
        return this.viewGetter;
    }

    public boolean isEnableFakeDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4aee21", new Object[]{this})).booleanValue();
        }
        return this.enableFakeDrag;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setEnableFakeDrag(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51645e1f", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFakeDrag = z;
        }
    }

    public void setViewGetter(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b8c964", new Object[]{this, aVar});
        } else {
            this.viewGetter = aVar;
        }
    }

    public ViewPagerFakeDragView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewPagerFakeDragView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastDownX = 0.0f;
        this.lastTouchX = 0.0f;
        this.shouldDispatch = true;
        setEnabled(false);
        setFocusable(false);
        setClickable(false);
        this.viewConfiguration = ViewConfiguration.get(context);
        this.enableFakeDrag = true;
    }
}
