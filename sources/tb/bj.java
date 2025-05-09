package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bj extends ck9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final int RIGHT_CENTER = 4;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    public final int p;
    public final int q;
    public int r;
    public int o = -1;
    public View s = null;
    public boolean t = false;
    public boolean u = true;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public long y = 0;
    public final d z = new d(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.Recycler f16421a;
        public final /* synthetic */ com.alibaba.android.ultron.ext.vlayout.b b;

        public a(RecyclerView.Recycler recycler, com.alibaba.android.ultron.ext.vlayout.b bVar) {
            this.f16421a = recycler;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bj bjVar = bj.this;
            bjVar.s = this.f16421a.getViewForPosition(bj.g0(bjVar));
            bj bjVar2 = bj.this;
            bj.h0(bjVar2, bjVar2.s, this.b);
            if (bj.i0(bj.this)) {
                this.b.l(bj.this.s);
                bj.j0(bj.this, false);
                return;
            }
            bj bjVar3 = bj.this;
            bj.k0(bjVar3, this.b, bjVar3.s);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.Recycler f16422a;
        public final /* synthetic */ com.alibaba.android.ultron.ext.vlayout.b b;

        public b(RecyclerView.Recycler recycler, com.alibaba.android.ultron.ext.vlayout.b bVar) {
            this.f16422a = recycler;
            this.b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                bj.l0(bj.this, this.f16422a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(80740613);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAFixLayoutHelper$FixViewAppearAnimatorListener");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            throw null;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f16423a;
        public Runnable b;

        static {
            t2o.a(80740614);
        }

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAFixLayoutHelper$FixViewDisappearAnimatorListener");
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f82717df", new Object[]{this})).booleanValue();
            }
            return this.f16423a;
        }

        public void b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28d38550", new Object[]{this, runnable});
            } else {
                this.b = runnable;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            throw null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        t2o.a(80740610);
    }

    public bj(int i, int i2, int i3) {
        this.p = 0;
        this.q = 0;
        this.r = 0;
        new c(null);
        this.p = i;
        this.q = i2;
        this.r = i3;
        z(1);
    }

    public static /* synthetic */ int g0(bj bjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4172cb23", new Object[]{bjVar})).intValue();
        }
        return bjVar.o;
    }

    public static /* synthetic */ void h0(bj bjVar, View view, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae12c256", new Object[]{bjVar, view, bVar});
        } else {
            bjVar.p0(view, bVar);
        }
    }

    public static /* synthetic */ boolean i0(bj bjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13825536", new Object[]{bjVar})).booleanValue();
        }
        return bjVar.v;
    }

    public static /* synthetic */ Object ipc$super(bj bjVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -379145078:
                super.d0((com.alibaba.android.ultron.ext.vlayout.b) objArr[0]);
                return null;
            case 312774690:
                super.z(((Number) objArr[0]).intValue());
                return null;
            case 1442388153:
                super.g((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], (com.alibaba.android.ultron.ext.vlayout.b) objArr[2]);
                return null;
            case 1566030385:
                super.f((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[5]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAFixLayoutHelper");
        }
    }

    public static /* synthetic */ boolean j0(bj bjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59700cc3", new Object[]{bjVar, new Boolean(z)})).booleanValue();
        }
        bjVar.getClass();
        return z;
    }

    public static /* synthetic */ void k0(bj bjVar, com.alibaba.android.ultron.ext.vlayout.b bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5c9829", new Object[]{bjVar, bVar, view});
        } else {
            bjVar.m0(bVar, view);
        }
    }

    public static /* synthetic */ void l0(bj bjVar, RecyclerView.Recycler recycler, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f03fca0", new Object[]{bjVar, recycler, bVar});
        } else {
            bjVar.o0(recycler, bVar);
        }
    }

    @Override // tb.z3i
    public void K(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed713e77", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // tb.sw1
    public void b0(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272ad6d", new Object[]{this, recycler, state, fVar, vigVar, bVar});
        } else if (!p(fVar.c())) {
            if (!this.u) {
                fVar.n();
                return;
            }
            View view = this.s;
            if (view == null) {
                view = fVar.l(recycler);
            } else {
                fVar.n();
            }
            if (view == null) {
                vigVar.b = true;
                return;
            }
            boolean isPreLayout = state.isPreLayout();
            this.t = isPreLayout;
            if (isPreLayout) {
                bVar.v(fVar, view);
            }
            this.s = view;
            p0(view, bVar);
            vigVar.f30032a = 0;
            vigVar.c = true;
            V(vigVar, view);
        }
    }

    @Override // tb.sw1
    public void d0(com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966b48a", new Object[]{this, bVar});
            return;
        }
        super.d0(bVar);
        View view = this.s;
        if (view != null) {
            bVar.e(view);
            bVar.h(this.s);
            this.s.animate().cancel();
            this.s = null;
            this.v = false;
        }
    }

    @Override // tb.sw1
    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594a72bf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
            return;
        }
        super.f(recycler, state, i, i2, i3, bVar);
        if (this.o >= 0) {
            if (this.t && state.isPreLayout()) {
                View view = this.s;
                if (view != null) {
                    bVar.e(view);
                    recycler.recycleView(this.s);
                    this.v = false;
                }
                this.s = null;
            } else if (!v0(bVar, i, i2, i3) || !w0()) {
                o0(recycler, bVar);
            } else {
                this.u = true;
                View view2 = this.s;
                if (view2 == null) {
                    a aVar = new a(recycler, bVar);
                    if (this.z.a()) {
                        this.z.b(aVar);
                    } else {
                        aVar.run();
                    }
                } else if (view2.getParent() == null) {
                    m0(bVar, this.s);
                } else {
                    bVar.l(this.s);
                }
                n0(recycler, bVar);
            }
        }
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void g(RecyclerView.Recycler recycler, RecyclerView.State state, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f918b9", new Object[]{this, recycler, state, bVar});
            return;
        }
        super.g(recycler, state, bVar);
        View view = this.s;
        if (view != null && bVar.a(view)) {
            bVar.e(this.s);
            recycler.recycleView(this.s);
            this.s = null;
            this.v = true;
        }
        this.t = false;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("72e2824c", new Object[]{this});
        }
        return this.s;
    }

    public final void m0(com.alibaba.android.ultron.ext.vlayout.b bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e23d0", new Object[]{this, bVar, view});
        } else {
            bVar.l(view);
        }
    }

    public final void n0(RecyclerView.Recycler recycler, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729ad4ec", new Object[]{this, recycler, bVar});
        } else if (this.y > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new b(recycler, bVar), this.y);
        }
    }

    public final void o0(RecyclerView.Recycler recycler, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdddc762", new Object[]{this, recycler, bVar});
            return;
        }
        this.u = false;
        if (this.s != null) {
            r0(bVar);
            q0(recycler, bVar, this.s);
            this.s = null;
            this.w = true;
        }
    }

    public final void p0(View view, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        boolean z;
        int paddingLeft;
        int paddingTop;
        int i;
        int i2;
        int i3;
        int i4;
        int measuredHeight;
        int i5;
        int i6;
        int measuredHeight2;
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fb855b2", new Object[]{this, view, bVar});
        } else if (view != null && bVar != null) {
            VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
            gfl g = bVar.g();
            if (bVar.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            float U = U();
            if (z) {
                int contentWidth = (bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight();
                int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                int i10 = -2;
                if (i9 < 0) {
                    i9 = -2;
                }
                int q = bVar.q(contentWidth, i9, false);
                if (!Float.isNaN(layoutParams.f2290a) && layoutParams.f2290a > 0.0f) {
                    i8 = bVar.q((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom(), (int) ((View.MeasureSpec.getSize(q) / layoutParams.f2290a) + 0.5f), false);
                } else if (Float.isNaN(U) || U <= 0.0f) {
                    int contentHeight = (bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom();
                    int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    if (i11 >= 0) {
                        i10 = i11;
                    }
                    i8 = bVar.q(contentHeight, i10, false);
                } else {
                    i8 = bVar.q((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom(), (int) ((View.MeasureSpec.getSize(q) / U) + 0.5f), false);
                }
                bVar.measureChildWithMargins(view, q, i8);
            } else {
                int q2 = bVar.q((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                if (!Float.isNaN(layoutParams.f2290a) && layoutParams.f2290a > 0.0f) {
                    i7 = bVar.q((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight(), (int) ((View.MeasureSpec.getSize(q2) * layoutParams.f2290a) + 0.5f), false);
                } else if (Float.isNaN(U) || U <= 0.0f) {
                    i7 = bVar.q((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight(), ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                } else {
                    i7 = bVar.q((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight(), (int) ((View.MeasureSpec.getSize(q2) * U) + 0.5f), false);
                }
                bVar.measureChildWithMargins(view, i7, q2);
            }
            int i12 = this.p;
            if (i12 == 1) {
                paddingTop = bVar.getPaddingTop() + this.r;
                this.n.getClass();
                i2 = (bVar.getContentWidth() - bVar.getPaddingRight()) - this.q;
                this.n.getClass();
                paddingLeft = ((i2 - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) - view.getMeasuredWidth();
                i6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                measuredHeight2 = view.getMeasuredHeight();
            } else if (i12 == 4) {
                if (bVar.getContentHeight() > view.getMeasuredHeight()) {
                    u0((bVar.getContentHeight() - view.getMeasuredHeight()) / 2);
                }
                paddingTop = bVar.getPaddingTop() + this.r;
                this.n.getClass();
                i2 = (bVar.getContentWidth() - bVar.getPaddingRight()) - this.q;
                this.n.getClass();
                paddingLeft = ((i2 - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) - view.getMeasuredWidth();
                i6 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                measuredHeight2 = view.getMeasuredHeight();
            } else {
                if (i12 == 2) {
                    paddingLeft = bVar.getPaddingLeft() + this.q;
                    this.n.getClass();
                    i4 = (bVar.getContentHeight() - bVar.getPaddingBottom()) - this.r;
                    this.n.getClass();
                    i2 = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    measuredHeight = (i4 - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else if (i12 == 3) {
                    i2 = (bVar.getContentWidth() - bVar.getPaddingRight()) - this.q;
                    this.n.getClass();
                    i4 = (bVar.getContentHeight() - bVar.getPaddingBottom()) - this.r;
                    this.n.getClass();
                    paddingLeft = ((i2 - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) - view.getMeasuredWidth();
                    measuredHeight = (i4 - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                } else {
                    paddingLeft = bVar.getPaddingLeft() + this.q;
                    this.n.getClass();
                    paddingTop = bVar.getPaddingTop() + this.r;
                    this.n.getClass();
                    if (z) {
                        i = g.f(view);
                    } else {
                        i = g.e(view);
                    }
                    i2 = i + paddingLeft;
                    if (z) {
                        i3 = g.e(view);
                    } else {
                        i3 = g.f(view);
                    }
                    i4 = i3 + paddingTop;
                    Z(view, paddingLeft, paddingTop, i2, i4, bVar);
                }
                paddingTop = measuredHeight - i5;
                Z(view, paddingLeft, paddingTop, i2, i4, bVar);
            }
            i4 = i6 + measuredHeight2;
            Z(view, paddingLeft, paddingTop, i2, i4, bVar);
        }
    }

    public final void q0(RecyclerView.Recycler recycler, com.alibaba.android.ultron.ext.vlayout.b bVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef06d91d", new Object[]{this, recycler, bVar, view});
            return;
        }
        bVar.e(view);
        recycler.recycleView(view);
        this.v = false;
    }

    public final void r0(com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448e2b15", new Object[]{this, bVar});
        } else if (this.x) {
            cj.a(bVar.getChildViewHolder(this.s));
        }
    }

    public void s0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a67fd8d", new Object[]{this, new Boolean(z)});
        } else {
            this.x = z;
        }
    }

    public void t0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bb38d5", new Object[]{this, new Long(j)});
        } else {
            this.y = j;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4958d495", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.o = i;
        }
    }

    public void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29623985", new Object[]{this, new Integer(i)});
        } else {
            this.r = i;
        }
    }

    public boolean v0(com.alibaba.android.ultron.ext.vlayout.b bVar, int i, int i2, int i3) {
        throw null;
    }

    public final boolean w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ad621b5", new Object[]{this})).booleanValue();
        }
        if (!this.x || !this.w) {
            return true;
        }
        return false;
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        } else if (i > 0) {
            super.z(1);
        } else {
            super.z(0);
        }
    }
}
