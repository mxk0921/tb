package com.taobao.android.icart.widget.swipe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import tb.ivk;
import tb.pjh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SwipeFrameLayout extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SCROLL_THETA_THRESHOLD = 15;
    private boolean interceptUpEvent;
    private boolean isMoveRight;
    private boolean isShowSwipe;
    private boolean isStartPanMove;
    private boolean isSwipeShow;
    private float mLastMoveX;
    private View.OnLongClickListener mLongClick;
    private ObjectAnimator mObjectAnimator;
    private float mRawDownX;
    private float mRawDownY;
    private ivk mSwipeListener;
    private VelocityTracker mVelocityTracker;
    private int maxSwipeWidth;
    private final RecyclerView.OnItemTouchListener mItemTouchListener = new RecyclerView.OnItemTouchListener() { // from class: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f8090a = false;
        public boolean b = false;
        public float c = 0.0f;

        /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
            if (com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$300(r7, com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r7).d(), r8) != false) goto L_0x007e;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
            /*
                r6 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.AnonymousClass1.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x001f
                java.lang.String r4 = "35491ccb"
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r6
                r5[r1] = r7
                r5[r0] = r8
                java.lang.Object r7 = r3.ipc$dispatch(r4, r5)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                return r7
            L_0x001f:
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$000(r7)
                if (r7 != 0) goto L_0x00d4
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                tb.ivk r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r7)
                if (r7 != 0) goto L_0x0031
                goto L_0x00d4
            L_0x0031:
                int r7 = r8.getAction()
                if (r7 != 0) goto L_0x0087
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$200(r7)
                if (r7 == 0) goto L_0x0051
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                tb.ivk r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r7)
                android.graphics.Rect r0 = r0.d()
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$300(r7, r0, r8)
                if (r7 == 0) goto L_0x0051
                r7 = 1
                goto L_0x0052
            L_0x0051:
                r7 = 0
            L_0x0052:
                r6.f8090a = r7
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$200(r7)
                if (r7 == 0) goto L_0x007d
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                tb.ivk r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r7)
                android.graphics.Rect r0 = r0.d()
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$400(r7, r0, r8)
                if (r7 == 0) goto L_0x007d
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                tb.ivk r0 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r7)
                android.graphics.Rect r0 = r0.d()
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$300(r7, r0, r8)
                if (r7 == 0) goto L_0x007d
                goto L_0x007e
            L_0x007d:
                r1 = 0
            L_0x007e:
                r6.b = r1
                float r7 = r8.getY()
                r6.c = r7
                goto L_0x00bf
            L_0x0087:
                int r7 = r8.getAction()
                if (r7 != r0) goto L_0x00bf
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                tb.ivk r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$100(r7)
                boolean r7 = r7.a()
                if (r7 != 0) goto L_0x00bd
                boolean r7 = r6.b
                if (r7 == 0) goto L_0x00bc
                float r7 = r6.c
                float r8 = r8.getRawY()
                float r7 = r7 - r8
                float r7 = java.lang.Math.abs(r7)
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r8 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                android.content.Context r8 = r8.getContext()
                android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r8)
                int r8 = r8.getScaledTouchSlop()
                float r8 = (float) r8
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 <= 0) goto L_0x00bc
                goto L_0x00bd
            L_0x00bc:
                r1 = 0
            L_0x00bd:
                r6.f8090a = r1
            L_0x00bf:
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                boolean r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$200(r7)
                if (r7 == 0) goto L_0x00d1
                boolean r7 = r6.f8090a
                if (r7 == 0) goto L_0x00d1
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout r7 = com.taobao.android.icart.widget.swipe.SwipeFrameLayout.this
                r8 = 0
                com.taobao.android.icart.widget.swipe.SwipeFrameLayout.access$500(r7, r8)
            L_0x00d1:
                boolean r7 = r6.f8090a
                return r7
            L_0x00d4:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.AnonymousClass1.onInterceptTouchEvent(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1dcb2bb", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d4838b0b", new Object[]{this, recyclerView, motionEvent});
            }
        }
    };
    private final Runnable mCloseSwipeRunnable = new a();
    private final int mScaleTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    private pjh mLongClickHelper = new pjh(this);

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
            } else {
                SwipeFrameLayout.access$500(SwipeFrameLayout.this, 0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            if (SwipeFrameLayout.access$600(SwipeFrameLayout.this) != null) {
                SwipeFrameLayout.access$600(SwipeFrameLayout.this).onLongClick(view);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f8093a;
        public final /* synthetic */ int b;

        public c(float f, int i) {
            this.f8093a = f;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/swipe/SwipeFrameLayout$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                return;
            }
            SwipeFrameLayout swipeFrameLayout = SwipeFrameLayout.this;
            if (this.f8093a != (-this.b)) {
                z = false;
            }
            SwipeFrameLayout.access$202(swipeFrameLayout, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            SwipeFrameLayout swipeFrameLayout = SwipeFrameLayout.this;
            if (this.f8093a != (-this.b)) {
                z = false;
            }
            SwipeFrameLayout.access$202(swipeFrameLayout, z);
            if (SwipeFrameLayout.access$100(SwipeFrameLayout.this) != null) {
                SwipeFrameLayout.access$100(SwipeFrameLayout.this).e(SwipeFrameLayout.access$200(SwipeFrameLayout.this));
                if (this.f8093a == 0.0f) {
                    SwipeFrameLayout.access$100(SwipeFrameLayout.this).c();
                }
            }
        }
    }

    static {
        t2o.a(478151137);
    }

    public SwipeFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ boolean access$000(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57b2406", new Object[]{swipeFrameLayout})).booleanValue();
        }
        return swipeFrameLayout.isSwipeDisable();
    }

    public static /* synthetic */ ivk access$100(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivk) ipChange.ipc$dispatch("2fe1796c", new Object[]{swipeFrameLayout});
        }
        return swipeFrameLayout.mSwipeListener;
    }

    public static /* synthetic */ boolean access$200(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc9a2c88", new Object[]{swipeFrameLayout})).booleanValue();
        }
        return swipeFrameLayout.isShowSwipe;
    }

    public static /* synthetic */ boolean access$202(SwipeFrameLayout swipeFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef28f612", new Object[]{swipeFrameLayout, new Boolean(z)})).booleanValue();
        }
        swipeFrameLayout.isShowSwipe = z;
        return z;
    }

    public static /* synthetic */ boolean access$300(SwipeFrameLayout swipeFrameLayout, Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f04554d", new Object[]{swipeFrameLayout, rect, motionEvent})).booleanValue();
        }
        return swipeFrameLayout.isOutsideSwipeRect(rect, motionEvent);
    }

    public static /* synthetic */ boolean access$400(SwipeFrameLayout swipeFrameLayout, Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d107f2c", new Object[]{swipeFrameLayout, rect, motionEvent})).booleanValue();
        }
        return swipeFrameLayout.isInsideItemRect(rect, motionEvent);
    }

    public static /* synthetic */ void access$500(SwipeFrameLayout swipeFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ced759", new Object[]{swipeFrameLayout, new Float(f)});
        } else {
            swipeFrameLayout.onPanMoveWithAnimation(f);
        }
    }

    public static /* synthetic */ View.OnLongClickListener access$600(SwipeFrameLayout swipeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLongClickListener) ipChange.ipc$dispatch("2e6cff8d", new Object[]{swipeFrameLayout});
        }
        return swipeFrameLayout.mLongClick;
    }

    private void addOnItemTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222736c7", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.addOnItemTouchListener(this.mItemTouchListener);
        }
    }

    private RecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        View view = this;
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
        }
        return null;
    }

    private float handleVelocity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d09d11c", new Object[]{this})).floatValue();
        }
        float xVelocity = this.mVelocityTracker.getXVelocity();
        try {
            this.mVelocityTracker.recycle();
        } catch (Exception unused) {
        }
        this.mVelocityTracker = null;
        return xVelocity;
    }

    public static /* synthetic */ Object ipc$super(SwipeFrameLayout swipeFrameLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/swipe/SwipeFrameLayout");
        }
    }

    private boolean isInsideItemRect(Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c4726e", new Object[]{this, rect, motionEvent})).booleanValue();
        }
        if (rect == null || !rect.contains(rect.left, (int) motionEvent.getRawY())) {
            return false;
        }
        return true;
    }

    private boolean isOutsideSwipeRect(Rect rect, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a94c48", new Object[]{this, rect, motionEvent})).booleanValue();
        }
        if (rect == null || rect.contains((int) motionEvent.getX(), (int) motionEvent.getRawY())) {
            return false;
        }
        return true;
    }

    private boolean isSwipeDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7dd03123", new Object[]{this})).booleanValue();
        }
        if (!this.isSwipeShow || this.maxSwipeWidth == 0) {
            return true;
        }
        return false;
    }

    private void onPanMove(float f) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e97d4e4a", new Object[]{this, new Float(f)});
            return;
        }
        if (!this.isStartPanMove) {
            ivk ivkVar = this.mSwipeListener;
            if (ivkVar != null) {
                ivkVar.b();
            }
            this.isStartPanMove = true;
        }
        if (f > 0.0f) {
            f = 0.0f;
        }
        float f2 = -this.maxSwipeWidth;
        if (f < f2) {
            f = f2;
        }
        if (f != f2) {
            z = false;
        }
        this.isShowSwipe = z;
        if (z) {
            onPanMoveWithAnimation(f);
        } else {
            setTranslationX(f);
        }
    }

    private void removeLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca158cf", new Object[]{this});
        } else {
            this.mLongClickHelper.j(null);
        }
    }

    private void removeOnItemTouchListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53008784", new Object[]{this});
            return;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.mItemTouchListener);
        }
    }

    private void resetLongClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78f95e4", new Object[]{this});
        } else {
            this.mLongClickHelper.j(new b());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        if (r3 != 3) goto L_0x019c;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.swipe.SwipeFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getMaxSwipeWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7da97af4", new Object[]{this})).intValue();
        }
        return this.maxSwipeWidth;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        addOnItemTouchListener();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isShowSwipe = false;
        ObjectAnimator objectAnimator = this.mObjectAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            setTranslationX(0.0f);
        }
        removeOnItemTouchListener();
        removeCallbacks(this.mCloseSwipeRunnable);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (isSwipeDisable()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 2) && this.interceptUpEvent) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setMaxSwipeWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb1da2e", new Object[]{this, new Integer(i)});
        } else {
            this.maxSwipeWidth = i;
        }
    }

    public void setOnLongClick(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ae8983", new Object[]{this, onLongClickListener});
        } else {
            this.mLongClick = onLongClickListener;
        }
    }

    public void setSwipeListener(ivk ivkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86759e06", new Object[]{this, ivkVar});
        } else {
            this.mSwipeListener = ivkVar;
        }
    }

    public void setSwipeShow(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc26d138", new Object[]{this, new Boolean(z)});
        } else {
            this.isSwipeShow = z;
        }
    }

    private void onPanMoveWithAnimation(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8f4f0a", new Object[]{this, new Float(f)});
            return;
        }
        if (f > 0.0f) {
            f = 0.0f;
        }
        float f2 = -this.maxSwipeWidth;
        if (f < f2) {
            f = f2;
        }
        ObjectAnimator objectAnimator = this.mObjectAnimator;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", getTranslationX(), f);
            this.mObjectAnimator = ofFloat;
            ofFloat.setInterpolator(new LinearInterpolator());
            this.mObjectAnimator.setDuration(300L);
            this.mObjectAnimator.start();
            this.mObjectAnimator.addListener(new c(f, getMaxSwipeWidth()));
        }
    }
}
