package com.taobao.android.dinamic_v35.view;

import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tb.ji6;
import tb.k56;
import tb.knd;
import tb.la6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXScrollableViewImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SCROLLING = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f7279a;
    public VelocityTracker b;
    public e c;
    public h d;
    public g e;
    public i f;
    public f g;
    public DXNanoScrollViewContainer j;
    public boolean m;
    public int n;
    public ViewGroup r;
    public boolean s;
    public boolean[] t;
    public boolean w;
    public d x;
    public DinamicXEngine y;
    public Handler h = new Handler(Looper.getMainLooper());
    public int i = 0;
    public int k = 0;
    public boolean l = false;
    public int o = 0;
    public int p = -1;
    public final ArrayList<Integer> q = new ArrayList<>();
    public final Runnable u = new a();
    public int v = 0;
    public int z = 1000;
    public final BroadcastReceiver A = new BroadcastReceiver() { // from class: com.taobao.android.dinamic_v35.view.DXScrollableViewImpl.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic_v35/view/DXScrollableViewImpl$4");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                DXScrollableViewImpl.this.Y();
            } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
            } else {
                if (DXScrollableViewImpl.this.r.isShown()) {
                    DXScrollableViewImpl.this.X();
                } else {
                    DXScrollableViewImpl.this.Y();
                }
            }
        }
    };

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
                DXScrollableViewImpl.a(DXScrollableViewImpl.this, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f7282a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public b(boolean z, int i, int i2) {
            this.f7282a = z;
            this.b = i;
            this.c = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (this.f7282a) {
                DXScrollableViewImpl.this.r.scrollTo(0, this.b + ((Integer) valueAnimator.getAnimatedValue()).intValue());
            } else {
                DXScrollableViewImpl.this.r.scrollTo(this.c + ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7283a;
        public final /* synthetic */ int b;

        public c(int i, int i2) {
            this.f7283a = i;
            this.b = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
            } else if (DXScrollableViewImpl.this.v()) {
                DXScrollableViewImpl.this.r.scrollTo(0, this.f7283a + ((Integer) valueAnimator.getAnimatedValue()).intValue());
            } else {
                DXScrollableViewImpl.this.r.scrollTo(this.b + ((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d implements ji6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DXScrollableViewImpl> f7284a;

        static {
            t2o.a(444596446);
            t2o.a(444597056);
        }

        public d(DXScrollableViewImpl dXScrollableViewImpl) {
            this.f7284a = new WeakReference<>(dXScrollableViewImpl);
        }

        @Override // tb.ji6
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bdbf6212", new Object[]{this});
                return;
            }
            DXScrollableViewImpl dXScrollableViewImpl = this.f7284a.get();
            if (dXScrollableViewImpl != null) {
                dXScrollableViewImpl.h();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface g {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface h {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface i {
    }

    static {
        t2o.a(444596441);
    }

    public static /* synthetic */ void a(DXScrollableViewImpl dXScrollableViewImpl, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb4364d", new Object[]{dXScrollableViewImpl, new Integer(i2)});
        } else {
            dXScrollableViewImpl.T(i2);
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6dd28", new Object[]{this});
            return;
        }
        d dVar = this.x;
        if (dVar != null) {
            DinamicXEngine dinamicXEngine = this.y;
            if (dinamicXEngine != null) {
                dinamicXEngine.p1(dVar);
            }
            this.x = null;
        }
    }

    public void B(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            dXNanoScrollViewContainer.removeView(view);
        }
    }

    public void C(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be51980", new Object[]{this, new Integer(i2)});
            return;
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            dXNanoScrollViewContainer.removeViewAt(i2);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8de4262a", new Object[]{this});
            return;
        }
        boolean[] zArr = this.t;
        if (zArr != null) {
            int length = zArr.length;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                boolean[] zArr2 = this.t;
                if (zArr2[i2]) {
                    zArr2[i2] = false;
                    z = true;
                }
            }
            if (z) {
                this.r.requestLayout();
            }
        }
    }

    public void E(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c35caa3", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            this.j.saveMeasureSpec(i2, i3);
        }
    }

    public void F(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684e10b8", new Object[]{this, new Integer(i2)});
        } else if (this.m) {
            ((knd) this.r).smoothScrollTo(i2, 0);
        } else {
            this.r.scrollTo(i2, 0);
        }
    }

    public void G(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i2)});
        } else if (i2 >= 0 && i2 < this.k) {
            this.r.scrollTo(this.q.get(i2).intValue(), 0);
            this.p = i2;
            f fVar = this.g;
            if (fVar != null) {
                ((k56.a.c) fVar).a(i2);
            }
        }
    }

    public void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public void I(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5dcc0a2", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        this.n = i2;
        this.m = z;
        this.s = true;
    }

    public void J(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18fd536", new Object[]{this, new Integer(i2)});
            return;
        }
        this.p = i2;
        this.v = i2;
        this.s = true;
    }

    public void K(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8ed1c5", new Object[]{this, dinamicXEngine});
        } else {
            this.y = dinamicXEngine;
        }
    }

    public void L(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92a457", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void M(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i2)});
        } else {
            this.z = i2;
        }
    }

    public void N(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c538f0a", new Object[]{this, eVar});
        } else {
            this.c = eVar;
        }
    }

    public void O(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7a360", new Object[]{this, fVar});
        } else {
            this.g = fVar;
        }
    }

    public void P(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de27cb64", new Object[]{this, gVar});
        } else {
            this.e = gVar;
        }
    }

    public void Q(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af48a4b5", new Object[]{this, hVar});
            return;
        }
        this.h = new Handler(Looper.getMainLooper());
        this.d = hVar;
    }

    public void R(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0433da", new Object[]{this, iVar});
        } else {
            this.f = iVar;
        }
    }

    public void S(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9964a171", new Object[]{this, new Boolean(z)});
        } else {
            this.f7279a = z;
        }
    }

    public final void T(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfef36d", new Object[]{this, new Integer(i2)});
            return;
        }
        this.i = i2;
        if (i2 == 0) {
            x();
        } else if (i2 == 1) {
            w();
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4a566a", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ((knd) this.r).smoothScrollTo(0, this.q.get(this.p).intValue());
        } else {
            ((knd) this.r).smoothScrollTo(this.q.get(this.p).intValue(), 0);
        }
    }

    public void V(boolean z) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d225f5", new Object[]{this, new Boolean(z)});
        } else if (this.l) {
            int i3 = this.p;
            if (i3 < this.k - 1) {
                this.p = i3 + 1;
            } else {
                this.p = 0;
            }
            this.v++;
            int scrollX = this.r.getScrollX();
            int scrollY = this.r.getScrollY();
            if (z) {
                i2 = this.q.get(this.v).intValue() - scrollY;
            } else {
                i2 = this.q.get(this.v).intValue() - scrollX;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, i2);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new b(z, scrollY, scrollX));
            ofInt.start();
            f fVar = this.g;
            if (fVar != null) {
                ((k56.a.c) fVar).a(this.p);
            }
        } else {
            int i4 = this.p;
            if (i4 < this.k - 1) {
                int i5 = i4 + 1;
                this.p = i5;
                if (z) {
                    ((knd) this.r).smoothScrollTo(0, this.q.get(i5).intValue());
                } else {
                    ((knd) this.r).smoothScrollTo(this.q.get(i5).intValue(), 0);
                }
                f fVar2 = this.g;
                if (fVar2 != null) {
                    ((k56.a.c) fVar2).a(this.p);
                    return;
                }
                return;
            }
            U(z);
        }
    }

    public void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6723b1", new Object[]{this, new Boolean(z)});
            return;
        }
        int i2 = this.p;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.p = i3;
            if (z) {
                ((knd) this.r).smoothScrollTo(0, this.q.get(i3).intValue());
            } else {
                ((knd) this.r).smoothScrollTo(this.q.get(i3).intValue(), 0);
            }
            f fVar = this.g;
            if (fVar != null) {
                ((k56.a.c) fVar).a(this.p);
                return;
            }
            return;
        }
        U(z);
    }

    public void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8b0a", new Object[]{this});
        } else if (this.w && this.j.getChildCount() > 1) {
            if (this.x == null) {
                this.x = new d(this);
            }
            if (this.y != null) {
                la6.b("DXScrollableViewImpl startTimer");
                this.y.b1(this.x, this.z);
            }
        }
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b325b6a", new Object[]{this});
        } else if (this.w && this.j.getChildCount() > 1 && this.y != null) {
            la6.b("DXScrollableViewImpl stopTimer" + this.p);
            this.y.p1(this.x);
            this.x = null;
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else {
            this.j.addView(view);
        }
    }

    public void c(View view, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd73ec5e", new Object[]{this, view, new Integer(i2)});
        } else {
            this.j.addView(view, i2);
        }
    }

    public void d(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c4d8ff", new Object[]{this, view, new Integer(i2), layoutParams});
        } else {
            this.j.addView(view, i2, layoutParams);
        }
    }

    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a332ea78", new Object[]{this, view, layoutParams});
        } else {
            this.j.addView(view, layoutParams);
        }
    }

    public void f(DXNanoScrollViewContainer dXNanoScrollViewContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b620c222", new Object[]{this, dXNanoScrollViewContainer});
        } else {
            this.j = dXNanoScrollViewContainer;
        }
    }

    public void g(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6583f398", new Object[]{this, viewGroup});
        } else {
            this.r = viewGroup;
        }
    }

    public void h() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e36d1ce", new Object[]{this});
            return;
        }
        int i3 = this.p;
        if (i3 < this.k - 1) {
            this.p = i3 + 1;
        } else {
            this.p = 0;
        }
        this.v++;
        int scrollX = this.r.getScrollX();
        int scrollY = this.r.getScrollY();
        if (this.v > this.k - 1) {
            Y();
            return;
        }
        if (v()) {
            i2 = this.j.getChildAt(this.v).getHeight();
        } else {
            i2 = this.j.getChildAt(this.v).getWidth();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, i2);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new c(scrollY, scrollX));
        ofInt.start();
        f fVar = this.g;
        if (fVar != null) {
            ((k56.a.c) fVar).a(this.p);
        }
    }

    public void i() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27151c1", new Object[]{this});
        } else if (this.f != null) {
            int scrollX = this.r.getScrollX();
            int width = this.r.getWidth();
            for (int i2 = 0; i2 < this.j.getChildCount(); i2++) {
                View childAt = this.j.getChildAt(i2);
                int left = childAt.getLeft() - scrollX;
                int right = childAt.getRight() - scrollX;
                if (left >= width || right <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                boolean[] zArr = this.t;
                if (z != zArr[i2]) {
                    zArr[i2] = z;
                    if (z) {
                        ((k56.a.b) this.f).b(childAt, i2);
                    } else {
                        ((k56.a.b) this.f).a(childAt, i2);
                    }
                }
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341e1bbb", new Object[]{this});
            return;
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            this.k = dXNanoScrollViewContainer.getChildCount();
            this.q.clear();
            for (int i2 = 0; i2 < this.k; i2++) {
                if (this.j.getChildAt(i2).getMeasuredWidth() > 0) {
                    this.q.add(Integer.valueOf(this.j.getChildAt(i2).getLeft()));
                }
            }
        }
    }

    public boolean[] k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("c593a654", new Object[]{this});
        }
        return this.t;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue();
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            return dXNanoScrollViewContainer.getMeasuredHeight();
        }
        return 0;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67e015b5", new Object[]{this})).intValue();
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            return dXNanoScrollViewContainer.getMeasuredWidth();
        }
        return 0;
    }

    public View n(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("33f9f883", new Object[]{this, new Integer(i2)});
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            return dXNanoScrollViewContainer.getChildAt(i2);
        }
        return null;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769baf5e", new Object[]{this});
            return;
        }
        try {
            la6.b("DXScrollableViewImpl onAttachedToWindow" + this.p);
            if (this.w) {
                X();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                this.r.getContext().registerReceiver(this.A, intentFilter);
                la6.b("DXNativeAutoLoopRecyclerView registerReceiver mReceiver" + this.A);
            }
        } catch (Throwable unused) {
        }
    }

    public void p(int i2, int i3, int i4, int i5) {
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e348190", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
        } else if (this.l && (i6 = this.k - 1) >= 0) {
            if (v()) {
                if (i3 < this.q.get(i6).intValue()) {
                    return;
                }
            } else if (i2 < this.q.get(i6).intValue()) {
                return;
            }
            View childAt = this.j.getChildAt(i6);
            C(i6);
            c(childAt, 0);
            this.v = 0;
            this.r.scrollTo(0, 0);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b5c41b", new Object[]{this});
            return;
        }
        try {
            la6.b("DXScrollableViewImpl onDetachedFromWindow" + this.p);
            if (this.w) {
                Y();
                this.r.getContext().unregisterReceiver(this.A);
                la6.b("DXNativeAutoLoopRecyclerView unregisterReceiver mReceiver" + this.A);
            }
        } catch (Throwable unused) {
        }
    }

    public void r(boolean z, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf1b23b", new Object[]{this, new Boolean(z), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        e eVar = this.c;
        if (eVar != null) {
            ((k56.a.C0965a) eVar).a(this.r, i2, i3, i4, i5);
        }
        boolean[] zArr = this.t;
        if (zArr == null || zArr.length != this.j.getChildCount()) {
            this.t = new boolean[this.j.getChildCount()];
        }
        if (this.f7279a) {
            j();
            if (this.s) {
                G(this.p);
                this.s = false;
            }
        }
        if (this.s) {
            this.s = false;
            F(this.n);
        }
        i();
    }

    public void s(int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc3708a6", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        if (this.i == 0) {
            T(1);
        }
        if (this.d != null) {
            if (this.i == 0) {
                T(1);
            }
            this.h.removeCallbacks(this.u);
            this.h.postDelayed(this.u, 500L);
        }
        g gVar = this.e;
        if (gVar != null) {
            ((k56.a.d) gVar).a(i2, i3, i4, i5);
        }
        i();
        if (this.f7279a) {
            p(i2, i3, i4, i5);
        }
    }

    public boolean t(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07fef83", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.w) {
            return true;
        }
        if (this.b == null) {
            this.b = VelocityTracker.obtain();
        }
        this.b.addMovement(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.o = (int) motionEvent.getX();
        } else if (action == 1 || action == 3) {
            this.b.computeCurrentVelocity(1000);
            int xVelocity = (int) this.b.getXVelocity();
            if (Math.abs(xVelocity) > 400) {
                if (xVelocity < 0) {
                    V(false);
                } else {
                    W(false);
                }
            } else if (Math.abs(motionEvent.getX() - this.o) <= this.r.getWidth() / 3.0f) {
                U(false);
            } else if (motionEvent.getX() - this.o > 0.0f) {
                W(false);
            } else {
                V(false);
            }
            this.b.clear();
            return true;
        }
        return false;
    }

    public void u(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fb83b2", new Object[]{this, new Integer(i2)});
            return;
        }
        la6.b("DXScrollableViewImpl onWindowVisibilityChanged visibility" + i2);
        if (!this.w) {
            return;
        }
        if (i2 == 0) {
            X();
        } else {
            Y();
        }
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d064334b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e907d75c", new Object[]{this});
            return;
        }
        h hVar = this.d;
        if (hVar != null) {
            ((k56.a.e) hVar).a(1);
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616aa2a8", new Object[]{this});
            return;
        }
        h hVar = this.d;
        if (hVar != null) {
            ((k56.a.e) hVar).a(0);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70e3cbc4", new Object[]{this});
        } else if (this.j.getChildCount() > 0) {
            ViewGroup viewGroup = this.r;
            int i2 = DXWidgetNode.TAG_WIDGET_NODE;
            r rVar = (r) viewGroup.getTag(i2);
            if (rVar.isHandleListData() && ((DXWidgetNode) this.j.getChildAt(0).getTag(i2)).getDXRuntimeContext().P() != 0) {
                this.j.removeAllViews();
                int childrenCount = rVar.getChildrenCount();
                if (childrenCount > 0) {
                    for (int i3 = 0; i3 < childrenCount; i3++) {
                        View nativeView = rVar.getChildAt(i3).getNativeView();
                        if (nativeView != null) {
                            this.j.addView(nativeView);
                        }
                    }
                }
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("816149f8", new Object[]{this});
            return;
        }
        DXNanoScrollViewContainer dXNanoScrollViewContainer = this.j;
        if (dXNanoScrollViewContainer != null) {
            dXNanoScrollViewContainer.removeAllViews();
        }
    }
}
