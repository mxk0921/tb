package com.taobao.android.detail.ttdetail.widget.draglayout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.draglayout.b;
import tb.t2o;
import tb.tgh;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DragDismissLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATE_ANIMATED = 2;
    public static final int STATE_ANIMATING = 1;
    public static final int STATE_DISMISSED = 7;
    public static final int STATE_DISMISSING = 6;
    public static final int STATE_DRAGGING = 3;
    public static final int STATE_NONE = 0;
    public static final int STATE_RESTORED = 5;
    public static final int STATE_RESTORING = 4;
    private static final String TAG = "DragDismissLayout";
    private boolean isDragIntercept;
    private c mDragCallback;
    private com.taobao.android.detail.ttdetail.widget.draglayout.b mDragHelper;
    private volatile boolean mForceLayoutInitRect;
    private Handler mHandler;
    private Rect mInitRect;
    private Rect mInitScreenRect;
    private volatile boolean mIsLayoutRequested;
    private int mMinFlingVelocity;
    private int[] mOutLocation;
    private volatile boolean mPendingEnterAnimation;
    private b mPullListener;
    private int mState;
    private View mTargetView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(DragDismissLayout dragDismissLayout, View view, double d);

        void b(DragDismissLayout dragDismissLayout, View view, double d);

        void c(DragDismissLayout dragDismissLayout, View view);

        void d(DragDismissLayout dragDismissLayout, View view);

        void e(double d);

        void f(double d);

        void g(double d);

        void h(double d);

        void i(DragDismissLayout dragDismissLayout, View view, double d);

        void j(DragDismissLayout dragDismissLayout, View view, boolean z, double d);

        void k(DragDismissLayout dragDismissLayout, View view, double d);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c extends b.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DragDismissLayout f7009a;
        public double b;
        public double c;
        public final Rect d;
        public final Rect e;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                DragDismissLayout.access$1000(c.m(c.this), 7);
                if (DragDismissLayout.access$1100(c.m(c.this)) != null) {
                    DragDismissLayout.access$1100(c.m(c.this)).b(c.m(c.this), DragDismissLayout.access$900(c.m(c.this)), c.q(c.this));
                }
                if (DragDismissLayout.access$1200(c.m(c.this))) {
                    c.m(c.this).requestLayout();
                }
            }
        }

        static {
            t2o.a(912263012);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1788946750:
                    return new Integer(super.c(((Number) objArr[0]).intValue()));
                case -1604160880:
                    super.i((View) objArr[0], ((Boolean) objArr[1]).booleanValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
                    return null;
                case -1276834111:
                    super.h(((Number) objArr[0]).intValue());
                    return null;
                case -90054502:
                    super.g((View) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                case 852508362:
                    super.j((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/draglayout/DragDismissLayout$ViewDragCallback");
            }
        }

        public static /* synthetic */ Rect l(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("324c63d7", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ DragDismissLayout m(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DragDismissLayout) ipChange.ipc$dispatch("36f53561", new Object[]{cVar});
            }
            return cVar.f7009a;
        }

        public static /* synthetic */ Rect n(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("7b636a76", new Object[]{cVar});
            }
            return cVar.e;
        }

        public static /* synthetic */ double o(c cVar, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7f277962", new Object[]{cVar, new Double(d)})).doubleValue();
            }
            cVar.b = d;
            return d;
        }

        public static /* synthetic */ double p(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34974899", new Object[]{cVar})).doubleValue();
            }
            return cVar.t();
        }

        public static /* synthetic */ double q(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("15191078", new Object[]{cVar})).doubleValue();
            }
            return cVar.c;
        }

        public static /* synthetic */ double r(c cVar, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("de95e164", new Object[]{cVar, new Double(d)})).doubleValue();
            }
            cVar.c = d;
            return d;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public int a(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public int b(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
            }
            return i;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public int c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("955ed6c2", new Object[]{this, new Integer(i)})).intValue();
            }
            return super.c(i);
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public int d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2378c14", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public int e(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("896fc226", new Object[]{this, view})).intValue();
            }
            return 1;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public void g(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
                return;
            }
            super.g(view, i);
            this.d.left = view.getLeft();
            this.d.top = view.getTop();
            this.d.right = view.getRight();
            this.d.bottom = view.getBottom();
            this.e.left = this.d.left + this.f7009a.getWidth();
            this.e.top = this.d.top + this.f7009a.getHeight();
            Rect rect = this.e;
            rect.right = rect.left + ((int) (this.d.width() * 0.1666d));
            Rect rect2 = this.e;
            rect2.bottom = rect2.top + ((int) (this.d.height() * 0.1666d));
            this.b = t();
            this.c = vu3.b.GEO_NOT_SUPPORT;
            DragDismissLayout.access$1000(this.f7009a, 3);
            if (DragDismissLayout.access$1100(this.f7009a) != null) {
                b access$1100 = DragDismissLayout.access$1100(this.f7009a);
                DragDismissLayout dragDismissLayout = this.f7009a;
                access$1100.c(dragDismissLayout, DragDismissLayout.access$900(dragDismissLayout));
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public void h(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                return;
            }
            super.h(i);
            if (i == 0) {
                int access$600 = DragDismissLayout.access$600(this.f7009a);
                if (access$600 == 1) {
                    DragDismissLayout.access$1000(this.f7009a, 2);
                    if (DragDismissLayout.access$1100(this.f7009a) != null) {
                        b access$1100 = DragDismissLayout.access$1100(this.f7009a);
                        DragDismissLayout dragDismissLayout = this.f7009a;
                        access$1100.k(dragDismissLayout, DragDismissLayout.access$900(dragDismissLayout), this.c);
                    }
                    if (DragDismissLayout.access$1200(this.f7009a)) {
                        this.f7009a.requestLayout();
                    }
                } else if (access$600 == 4) {
                    DragDismissLayout.access$1000(this.f7009a, 5);
                    if (DragDismissLayout.access$1100(this.f7009a) != null) {
                        b access$11002 = DragDismissLayout.access$1100(this.f7009a);
                        DragDismissLayout dragDismissLayout2 = this.f7009a;
                        access$11002.a(dragDismissLayout2, DragDismissLayout.access$900(dragDismissLayout2), this.c);
                    }
                    if (DragDismissLayout.access$1200(this.f7009a)) {
                        this.f7009a.requestLayout();
                    }
                } else if (access$600 == 6) {
                    if (DragDismissLayout.access$1100(this.f7009a) != null) {
                        b access$11003 = DragDismissLayout.access$1100(this.f7009a);
                        DragDismissLayout dragDismissLayout3 = this.f7009a;
                        access$11003.i(dragDismissLayout3, DragDismissLayout.access$900(dragDismissLayout3), this.c);
                    }
                    DragDismissLayout.access$1400(this.f7009a).post(new a());
                }
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public void i(View view, boolean z, int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a0627290", new Object[]{this, view, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            super.i(view, z, i, i2, i3, i4);
            this.c = s(view) / this.b;
            if (Math.abs(this.e.width() - this.d.width()) > 1 || Math.abs(this.e.height() - this.d.height()) > 1) {
                double width = (this.e.width() - this.d.width()) * this.c;
                double height = (this.e.height() - this.d.height()) * this.c;
                int width2 = (int) (this.d.width() + width);
                int height2 = (int) (this.d.height() + height);
                int left = (view.getLeft() + view.getRight()) >> 1;
                int top = (view.getTop() + view.getBottom()) >> 1;
                int i5 = width2 / 2;
                int i6 = height2 / 2;
                view.measure(View.MeasureSpec.makeMeasureSpec(width2, 1073741824), View.MeasureSpec.makeMeasureSpec(height2, 1073741824));
                view.layout(left - i5, top - i6, left + i5, top + i6);
                ViewCompat.postInvalidateOnAnimation(this.f7009a);
            }
            int access$600 = DragDismissLayout.access$600(this.f7009a);
            if (access$600 != 1) {
                if (access$600 != 6) {
                    if (access$600 != 3) {
                        if (access$600 == 4 && DragDismissLayout.access$1100(this.f7009a) != null) {
                            DragDismissLayout.access$1100(this.f7009a).g(this.c);
                        }
                    } else if (DragDismissLayout.access$1100(this.f7009a) != null) {
                        DragDismissLayout.access$1100(this.f7009a).e(this.c);
                    }
                } else if (DragDismissLayout.access$1100(this.f7009a) != null) {
                    DragDismissLayout.access$1100(this.f7009a).f(this.c);
                }
            } else if (DragDismissLayout.access$1100(this.f7009a) != null) {
                DragDismissLayout.access$1100(this.f7009a).h(this.c);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public void j(View view, float f, float f2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                return;
            }
            super.j(view, f, f2);
            int left = view.getLeft();
            int top = view.getTop();
            int right = view.getRight();
            int bottom = view.getBottom();
            if (f > DragDismissLayout.access$1500(this.f7009a) || f2 > DragDismissLayout.access$1500(this.f7009a) || this.c > 0.3499999940395355d) {
                z = true;
            }
            if (DragDismissLayout.access$1100(this.f7009a) != null) {
                b access$1100 = DragDismissLayout.access$1100(this.f7009a);
                DragDismissLayout dragDismissLayout = this.f7009a;
                access$1100.j(dragDismissLayout, DragDismissLayout.access$900(dragDismissLayout), !z, this.c);
            }
            if ((!DragDismissLayout.access$1600(this.f7009a).isEmpty()) && z) {
                DragDismissLayout.access$1700(this.e, DragDismissLayout.access$1600(this.f7009a));
                Rect rect = this.d;
                rect.left = left;
                rect.top = top;
                rect.right = right;
                rect.bottom = bottom;
                DragDismissLayout.access$1000(this.f7009a, 6);
                this.b = t();
                DragDismissLayout.access$800(this.f7009a).F(this.e.centerX(), this.e.centerY());
            } else {
                double centerX = (((left + right) >> 1) - (this.d.centerX() / this.c)) * this.b;
                double centerY = (((top + bottom) >> 1) - (this.d.centerY() / this.c)) * this.b;
                double width = this.e.width() / 2.0f;
                double height = this.e.height() / 2.0f;
                Rect rect2 = this.e;
                rect2.left = (int) (centerX - width);
                rect2.top = (int) (centerY - height);
                rect2.right = (int) (centerX + width);
                rect2.bottom = (int) (centerY + height);
                DragDismissLayout.access$1000(this.f7009a, 4);
                DragDismissLayout.access$800(this.f7009a).F(this.d.centerX(), this.d.centerY());
            }
            this.f7009a.invalidate();
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.b.c
        public boolean k(View view, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue();
            }
            if (DragDismissLayout.access$600(this.f7009a) == 0 && !DragDismissLayout.access$700(this.f7009a).isEmpty()) {
                this.f7009a.startEnterAnimation();
                tgh.b(DragDismissLayout.TAG, "deferring startEnterAnimation() on tryCaptureView()");
                return false;
            } else if (DragDismissLayout.access$800(DragDismissLayout.this).t() == -1 && DragDismissLayout.access$900(this.f7009a) == view) {
                return true;
            } else {
                return false;
            }
        }

        public final double s(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e0eda130", new Object[]{this, view})).doubleValue();
            }
            return Math.sqrt(Math.pow(((view.getLeft() + view.getRight()) >> 1) - this.d.centerX(), 2.0d) + Math.pow(((view.getTop() + view.getBottom()) >> 1) - this.d.centerY(), 2.0d));
        }

        public final double t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("809d8e3b", new Object[]{this})).doubleValue();
            }
            return Math.sqrt(Math.pow(this.e.centerX() - this.d.centerX(), 2.0d) + Math.pow(this.e.centerY() - this.d.centerY(), 2.0d));
        }

        public c(DragDismissLayout dragDismissLayout) {
            this.d = new Rect();
            this.e = new Rect();
            this.f7009a = dragDismissLayout;
        }
    }

    static {
        t2o.a(912263009);
    }

    public DragDismissLayout(Context context) {
        super(context);
        this.mState = 0;
        this.mInitRect = new Rect();
        this.mInitScreenRect = new Rect();
        c cVar = new c(this);
        this.mDragCallback = cVar;
        this.mDragHelper = com.taobao.android.detail.ttdetail.widget.draglayout.b.m(this, cVar);
        this.mOutLocation = new int[2];
        this.mHandler = new Handler(Looper.getMainLooper());
        init(context);
    }

    public static /* synthetic */ void access$1000(DragDismissLayout dragDismissLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b23f5b5", new Object[]{dragDismissLayout, new Integer(i)});
        } else {
            dragDismissLayout.setState(i);
        }
    }

    public static /* synthetic */ b access$1100(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1d2d89ea", new Object[]{dragDismissLayout});
        }
        return dragDismissLayout.mPullListener;
    }

    public static /* synthetic */ boolean access$1200(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b03a2394", new Object[]{dragDismissLayout})).booleanValue();
        }
        return dragDismissLayout.mIsLayoutRequested;
    }

    public static /* synthetic */ Handler access$1400(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e00fd974", new Object[]{dragDismissLayout});
        }
        return dragDismissLayout.mHandler;
    }

    public static /* synthetic */ int access$1500(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5b4ca46", new Object[]{dragDismissLayout})).intValue();
        }
        return dragDismissLayout.mMinFlingVelocity;
    }

    public static /* synthetic */ Rect access$1600(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("42c016dd", new Object[]{dragDismissLayout});
        }
        return dragDismissLayout.mInitRect;
    }

    public static /* synthetic */ void access$1700(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a5c08d", new Object[]{rect, rect2});
        } else {
            copyFromSource(rect, rect2);
        }
    }

    public static /* synthetic */ int access$600(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7be5658", new Object[]{dragDismissLayout})).intValue();
        }
        return dragDismissLayout.mState;
    }

    public static /* synthetic */ Rect access$700(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5f55696f", new Object[]{dragDismissLayout});
        }
        return dragDismissLayout.mInitScreenRect;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.widget.draglayout.b access$800(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.widget.draglayout.b) ipChange.ipc$dispatch("a1287518", new Object[]{dragDismissLayout});
        }
        return dragDismissLayout.mDragHelper;
    }

    public static /* synthetic */ View access$900(DragDismissLayout dragDismissLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cf19b6a", new Object[]{dragDismissLayout});
        }
        return dragDismissLayout.mTargetView;
    }

    private static void copyFromSource(Rect rect, Rect rect2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61733361", new Object[]{rect, rect2});
        } else {
            copyFromSource(rect, rect2, 0, 0);
        }
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            this.mMinFlingVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        }
    }

    private void internalRunEnterAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f96141", new Object[]{this});
            return;
        }
        this.mPendingEnterAnimation = false;
        setState(1);
        this.mTargetView.measure(View.MeasureSpec.makeMeasureSpec(this.mInitRect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.mInitRect.height(), 1073741824));
        View view = this.mTargetView;
        Rect rect = this.mInitRect;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        this.mDragHelper.a();
        boolean H = this.mDragHelper.H(this.mTargetView, c.l(this.mDragCallback).centerX(), c.l(this.mDragCallback).centerY());
        invalidate();
        b bVar = this.mPullListener;
        if (bVar != null) {
            bVar.d(this, this.mTargetView);
        }
        if (!H) {
            tgh.b(TAG, "internalRunEnterAnimation() failed for not starting smooth scroll");
        }
    }

    public static /* synthetic */ Object ipc$super(DragDismissLayout dragDismissLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -894236565:
                super.computeScroll();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 2041279898:
                super.requestDisallowInterceptTouchEvent(((Boolean) objArr[0]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/draglayout/DragDismissLayout");
        }
    }

    private boolean isProgressingState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6658cdd1", new Object[]{this})).booleanValue();
        }
        int i = this.mState;
        if (i == 1 || i == 3 || i == 4 || i == 6) {
            return true;
        }
        return false;
    }

    public static String normalizeState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29eeb348", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 0:
                return "NONE";
            case 1:
                return "ANIMATING";
            case 2:
                return "ANIMATED";
            case 3:
                return "DRAGGING";
            case 4:
                return "RESTORING";
            case 5:
                return "RESTORED";
            case 6:
                return "DISMISSING";
            case 7:
                return "DISMISSED";
            default:
                return "UNKNOWN_STATE_WITH_VALUE: " + i;
        }
    }

    private void setState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i)});
            return;
        }
        this.mState = i;
        tgh.b(TAG, "setState() with state: " + normalizeState(i) + " for view: " + this);
    }

    private void updateStartAndFinalPositionInfo(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3399145c", new Object[]{this, view});
            return;
        }
        getLocationOnScreen(this.mOutLocation);
        int left = view.getLeft();
        int top = view.getTop();
        int right = view.getRight();
        int bottom = view.getBottom();
        c.l(this.mDragCallback).top = top;
        c.l(this.mDragCallback).left = left;
        c.l(this.mDragCallback).right = right;
        c.l(this.mDragCallback).bottom = bottom;
        Rect rect = this.mInitScreenRect;
        int i = rect.left;
        int[] iArr = this.mOutLocation;
        int i2 = iArr[0];
        int i3 = rect.top;
        int i4 = iArr[1];
        int i5 = i3 - i4;
        int i6 = rect.bottom - i4;
        Rect rect2 = this.mInitRect;
        rect2.left = i - i2;
        rect2.top = i5;
        rect2.right = rect.right - i2;
        rect2.bottom = i6;
        copyFromSource(c.n(this.mDragCallback), this.mInitRect);
        c cVar = this.mDragCallback;
        c.o(cVar, c.p(cVar));
        c.r(this.mDragCallback, vu3.b.GEO_NOT_SUPPORT);
    }

    @Override // android.view.View
    public void computeScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab3086b", new Object[]{this});
            return;
        }
        super.computeScroll();
        if (this.mDragHelper.l(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public Rect getTargetViewRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("c4cab260", new Object[]{this});
        }
        View view = this.mTargetView;
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = this.mTargetView.getWidth();
        int height = this.mTargetView.getHeight();
        if (width == 0 || height == 0) {
            return null;
        }
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, width + i, height + i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        tgh.b(TAG, "onDetachedFromWindow() with state: " + normalizeState(this.mState) + " for view: " + this);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        int i = this.mState;
        if (i == 1 || i == 4 || i == 6) {
            this.isDragIntercept = false;
            return false;
        }
        boolean G = this.mDragHelper.G(motionEvent);
        this.isDragIntercept = G;
        return super.onInterceptTouchEvent(motionEvent) | G;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if ((z || this.mForceLayoutInitRect) && (view = this.mTargetView) != null && view.getParent() == this && !this.mInitScreenRect.isEmpty() && this.mState == 0) {
            this.mForceLayoutInitRect = false;
            updateStartAndFinalPositionInfo(this.mTargetView);
        }
        if (this.mPendingEnterAnimation) {
            internalRunEnterAnimation();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.isDragIntercept) {
            return super.onTouchEvent(motionEvent);
        }
        this.mDragHelper.z(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ab759a", new Object[]{this, new Boolean(z)});
        } else {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
        } else if (isProgressingState()) {
            this.mIsLayoutRequested = true;
        } else {
            super.requestLayout();
            this.mIsLayoutRequested = false;
        }
    }

    public void setPullListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68faea49", new Object[]{this, bVar});
        } else {
            this.mPullListener = bVar;
        }
    }

    public void setTargetView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb50b813", new Object[]{this, view});
        } else {
            this.mTargetView = view;
        }
    }

    public void setTargetViewInitScreenLocation(Rect rect) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9b15329", new Object[]{this, rect});
            return;
        }
        this.mInitRect.setEmpty();
        this.mInitScreenRect.setEmpty();
        if (rect != null && !rect.isEmpty()) {
            copyFromSource(this.mInitScreenRect, rect);
            if (!ViewCompat.isLaidOut(this) || (view = this.mTargetView) == null || view.getParent() != this) {
                this.mForceLayoutInitRect = true;
                requestLayout();
                return;
            }
            updateStartAndFinalPositionInfo(this.mTargetView);
        }
    }

    public boolean startExitAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5f3814f", new Object[]{this})).booleanValue();
        }
        this.mDragHelper.a();
        setState(6);
        boolean H = this.mDragHelper.H(this.mTargetView, c.n(this.mDragCallback).centerX(), c.n(this.mDragCallback).centerY());
        invalidate();
        if (!H) {
            tgh.b(TAG, "startExitAnimation() failed for not starting smooth scroll");
        }
        return H;
    }

    private static void copyFromSource(Rect rect, Rect rect2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1823f81", new Object[]{rect, rect2, new Integer(i), new Integer(i2)});
            return;
        }
        rect.left = rect2.left - i;
        rect.top = rect2.top - i2;
        rect.right = rect2.right - i;
        rect.bottom = rect2.bottom - i2;
    }

    public void startEnterAnimation() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1763215", new Object[]{this});
        } else if (this.mTargetView == null || this.mInitScreenRect.isEmpty() || this.mState != 0) {
            StringBuilder sb = new StringBuilder("startEnterAnimation() failed for not initializing correctly with reason is mTargetView is null: ");
            if (this.mTargetView == null) {
                z = true;
            }
            sb.append(z);
            sb.append(" mInitScreenRect is empty: ");
            sb.append(this.mInitScreenRect.isEmpty());
            sb.append(" mState ( ");
            sb.append(normalizeState(this.mState));
            sb.append(" ) is not STATE_NONE");
            tgh.b(TAG, sb.toString());
        } else if (this.mInitRect.isEmpty()) {
            this.mPendingEnterAnimation = true;
        } else {
            internalRunEnterAnimation();
        }
    }

    public DragDismissLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mState = 0;
        this.mInitRect = new Rect();
        this.mInitScreenRect = new Rect();
        c cVar = new c(this);
        this.mDragCallback = cVar;
        this.mDragHelper = com.taobao.android.detail.ttdetail.widget.draglayout.b.m(this, cVar);
        this.mOutLocation = new int[2];
        this.mHandler = new Handler(Looper.getMainLooper());
        init(context);
    }

    public DragDismissLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mState = 0;
        this.mInitRect = new Rect();
        this.mInitScreenRect = new Rect();
        c cVar = new c(this);
        this.mDragCallback = cVar;
        this.mDragHelper = com.taobao.android.detail.ttdetail.widget.draglayout.b.m(this, cVar);
        this.mOutLocation = new int[2];
        this.mHandler = new Handler(Looper.getMainLooper());
        init(context);
    }
}
