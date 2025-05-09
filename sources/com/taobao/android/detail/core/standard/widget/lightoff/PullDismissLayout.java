package com.taobao.android.detail.core.standard.widget.lightoff;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import tb.pfh;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PullDismissLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean animateAlpha;
    private boolean animateScale;
    private ViewDragHelper dragHelper;
    private float horizonTouchSlop;
    private boolean isAllowPull;
    private b listener;
    private float minFlingVelocity;
    public View targetView;
    private float verticalTouchSlop;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class ViewDragCallback extends ViewDragHelper.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final PullDismissLayout f6588a;
        public int b;
        public int c;
        public int d;
        public int e;
        public float f;
        public View g;
        public boolean h;
        public boolean i;

        static {
            t2o.a(438304826);
        }

        public static /* synthetic */ Object ipc$super(ViewDragCallback viewDragCallback, String str, Object... objArr) {
            if (str.hashCode() == -1788946750) {
                return new Integer(super.getOrderedChildIndex(((Number) objArr[0]).intValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/PullDismissLayout$ViewDragCallback");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getOrderedChildIndex(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("955ed6c2", new Object[]{this, new Integer(i)})).intValue();
            }
            if (this.f6588a.getTargetView() == null || !this.f6588a.getTargetView().equals(this.f6588a.getChildAt(i))) {
                return super.getOrderedChildIndex(i);
            }
            return i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
                return;
            }
            this.g = view;
            this.b = view.getTop();
            this.c = view.getLeft();
            this.f = 0.0f;
            this.d = 0;
            this.e = 0;
            this.h = false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
            } else if (this.g != null && i == 0 && PullDismissLayout.access$100(this.f6588a) != null) {
                if (this.h) {
                    PullDismissLayout.access$100(this.f6588a).b(this.f, this.g, this.d, this.e);
                    return;
                }
                PullDismissLayout.access$100(this.f6588a).d();
                this.g = null;
                this.i = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            PullDismissLayout pullDismissLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            int height = this.f6588a.getHeight();
            int i5 = i2 - this.b;
            this.e = i5;
            this.d = i - this.c;
            if (height > 0) {
                this.f = Math.abs(i5) / height;
            }
            if (!this.i && (pullDismissLayout = this.f6588a) != null && PullDismissLayout.access$100(pullDismissLayout) != null && PullDismissLayout.access$100(this.f6588a).a()) {
                this.i = true;
                PullDismissLayout.access$100(this.f6588a).e();
            }
            if (PullDismissLayout.access$200(this.f6588a) && PullDismissLayout.access$300(this.f6588a)) {
                view.setAlpha(1.0f - this.f);
                view.setScaleX(1.0f - this.f);
                view.setScaleY(1.0f - this.f);
                this.f6588a.invalidate();
            } else if (PullDismissLayout.access$200(this.f6588a) && !PullDismissLayout.access$300(this.f6588a)) {
                view.setAlpha(1.0f - this.f);
                this.f6588a.invalidate();
            } else if (PullDismissLayout.access$200(this.f6588a) || !PullDismissLayout.access$300(this.f6588a)) {
                this.f6588a.invalidate();
            } else {
                view.setScaleX(1.0f - this.f);
                view.setScaleY(1.0f - this.f);
                this.f6588a.invalidate();
            }
            if (PullDismissLayout.access$100(this.f6588a) != null) {
                PullDismissLayout.access$100(this.f6588a).c(this.f, this.d, this.e);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View view, float f, float f2) {
            int i;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            if (this.f < 0.5f && (Math.abs(f2) <= PullDismissLayout.access$400(this.f6588a) || this.f <= 0.15f)) {
                z = false;
            }
            this.h = z;
            if (z) {
                i = this.f6588a.getHeight();
            } else {
                i = this.b;
            }
            if (this.h) {
                onViewDragStateChanged(0);
                return;
            }
            PullDismissLayout.access$500(this.f6588a).settleCapturedViewAt(0, i);
            this.f6588a.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            if (this.g == null) {
                return true;
            }
            return false;
        }

        public ViewDragCallback(PullDismissLayout pullDismissLayout) {
            this.i = false;
            this.f6588a = pullDismissLayout;
            this.f = 0.0f;
            this.h = false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(438304825);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a8a436b9", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public void b(float f, View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3f5bb43", new Object[]{this, new Float(f), view, new Integer(i), new Integer(i2)});
            }
        }

        public void c(float f, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf63f4d", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47202f1c", new Object[]{this});
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98b2132f", new Object[]{this});
            }
        }

        public void f(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d219b9be", new Object[]{this, motionEvent});
            }
        }
    }

    static {
        t2o.a(438304823);
    }

    public PullDismissLayout(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ b access$100(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("eacd590d", new Object[]{pullDismissLayout});
        }
        return pullDismissLayout.listener;
    }

    public static /* synthetic */ boolean access$200(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6faef075", new Object[]{pullDismissLayout})).booleanValue();
        }
        return pullDismissLayout.animateAlpha;
    }

    public static /* synthetic */ boolean access$300(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e605a94", new Object[]{pullDismissLayout})).booleanValue();
        }
        return pullDismissLayout.animateScale;
    }

    public static /* synthetic */ float access$400(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd11c49f", new Object[]{pullDismissLayout})).floatValue();
        }
        return pullDismissLayout.minFlingVelocity;
    }

    public static /* synthetic */ ViewDragHelper access$500(PullDismissLayout pullDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewDragHelper) ipChange.ipc$dispatch("b991c660", new Object[]{pullDismissLayout});
        }
        return pullDismissLayout.dragHelper;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.minFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.dragHelper = ViewDragHelper.create(this, new ViewDragCallback());
    }

    public static /* synthetic */ Object ipc$super(PullDismissLayout pullDismissLayout, String str, Object... objArr) {
        if (str.hashCode() == -894236565) {
            super.computeScroll();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/PullDismissLayout");
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        ViewDragHelper viewDragHelper = this.dragHelper;
        if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public View getTargetView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c4d62fd5", new Object[]{this});
        }
        if (this.targetView == null) {
            this.targetView = getChildAt(0);
        }
        return this.targetView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3 != 3) goto L_0x007f;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "e7b587fe"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            int r3 = androidx.core.view.MotionEventCompat.getActionMasked(r7)
            if (r3 == 0) goto L_0x0030
            if (r3 == r0) goto L_0x002a
            if (r3 == r2) goto L_0x004b
            r4 = 3
            if (r3 == r4) goto L_0x002a
            goto L_0x007f
        L_0x002a:
            r3 = 0
            r6.verticalTouchSlop = r3
            r6.horizonTouchSlop = r3
            goto L_0x007f
        L_0x0030:
            float r3 = r7.getY()
            r6.verticalTouchSlop = r3
            float r3 = r7.getX()
            r6.horizonTouchSlop = r3
            com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout$b r3 = r6.listener
            if (r3 == 0) goto L_0x004b
            boolean r3 = r3.a()
            r6.isAllowPull = r3
            com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout$b r3 = r6.listener
            r3.f(r7)
        L_0x004b:
            float r3 = r7.getY()
            float r4 = r6.verticalTouchSlop
            float r3 = r3 - r4
            float r4 = r7.getX()
            float r5 = r6.horizonTouchSlop
            float r4 = r4 - r5
            float r4 = java.lang.Math.abs(r4)
            androidx.customview.widget.ViewDragHelper r5 = r6.dragHelper
            int r5 = r5.getTouchSlop()
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x007f
            float r3 = java.lang.Math.abs(r3)
            androidx.customview.widget.ViewDragHelper r4 = r6.dragHelper
            int r4 = r4.getTouchSlop()
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x007f
            int r3 = androidx.core.view.MotionEventCompat.getPointerCount(r7)
            if (r3 != r0) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            android.view.View r4 = r6.getTargetView()
            boolean r5 = r6.isAllowPull
            if (r5 == 0) goto L_0x00bc
            if (r4 == 0) goto L_0x00bc
            androidx.customview.widget.ViewDragHelper r5 = r6.dragHelper
            boolean r5 = r5.shouldInterceptTouchEvent(r7)
            if (r5 != 0) goto L_0x00bc
            if (r3 == 0) goto L_0x00bc
            androidx.customview.widget.ViewDragHelper r3 = r6.dragHelper
            int r3 = r3.getViewDragState()
            if (r3 != 0) goto L_0x00bc
            androidx.customview.widget.ViewDragHelper r3 = r6.dragHelper
            boolean r2 = r3.checkTouchSlop(r2)
            if (r2 == 0) goto L_0x00bc
            com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout$b r2 = r6.listener
            if (r2 == 0) goto L_0x00bc
            androidx.customview.widget.ViewDragHelper r2 = r6.dragHelper
            int r7 = r7.getPointerId(r1)
            r2.captureChildView(r4, r7)
            androidx.customview.widget.ViewDragHelper r7 = r6.dragHelper
            int r7 = r7.getViewDragState()
            if (r7 != r0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            return r0
        L_0x00bc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.standard.widget.lightoff.PullDismissLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
        } catch (Exception e) {
            String a2 = pfh.a("PullDismissLayout", BTags.XLightOff);
            tgh.b(a2, "draging excepiton:" + e);
        }
        if ((this.listener != null && !this.isAllowPull) || MotionEventCompat.getPointerCount(motionEvent) > 1) {
            return false;
        }
        this.dragHelper.processTouchEvent(motionEvent);
        if (this.dragHelper.getCapturedView() != null) {
            return true;
        }
        return false;
    }

    public void setAnimateAlpha(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7853760e", new Object[]{this, new Boolean(z)});
        } else {
            this.animateAlpha = z;
        }
    }

    public void setAnimateScale(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335031a2", new Object[]{this, new Boolean(z)});
        } else {
            this.animateScale = z;
        }
    }

    public void setListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5170906", new Object[]{this, bVar});
        } else {
            this.listener = bVar;
        }
    }

    public void setMinFlingVelocity(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3042810", new Object[]{this, new Float(f)});
        } else {
            this.minFlingVelocity = f;
        }
    }

    public void setTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.targetView = view;
        }
    }

    public PullDismissLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public PullDismissLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public PullDismissLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
