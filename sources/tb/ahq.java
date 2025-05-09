package tb;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ahq extends sw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INVALID_LINE = Integer.MIN_VALUE;
    public final Runnable A;
    public int n;
    public c[] o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public BitSet u;
    public final b v;
    public final List<View> w;
    public boolean x;
    public int y;
    public WeakReference<VirtualLayoutManager> z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
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
                ahq.f0(ahq.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int[] f15747a;

        static {
            t2o.a(156238010);
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6af3e15d", new Object[]{this, new Integer(i)});
                return;
            }
            int[] iArr = this.f15747a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f15747a = iArr2;
                Arrays.fill(iArr2, Integer.MIN_VALUE);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[d(i)];
                this.f15747a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f15747a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, Integer.MIN_VALUE);
            }
        }

        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d63bf78f", new Object[]{this, new Integer(i)})).intValue();
            }
            int[] iArr = this.f15747a;
            if (iArr == null || i >= iArr.length || i < 0) {
                return Integer.MIN_VALUE;
            }
            return iArr[i];
        }

        public void c(int i, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2cf88d", new Object[]{this, new Integer(i), cVar});
                return;
            }
            a(i);
            this.f15747a[i] = cVar.e;
        }

        public int d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8e3fab9e", new Object[]{this, new Integer(i)})).intValue();
            }
            int length = this.f15747a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int INVALID_OFFSET = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f15748a;
        public int b;
        public int c;
        public int d;
        public final int e;
        public int f;
        public int g;

        static {
            t2o.a(156238011);
        }

        public /* synthetic */ c(int i, a aVar) {
            this(i);
        }

        public static /* synthetic */ ArrayList a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("dd215790", new Object[]{cVar});
            }
            return cVar.f15748a;
        }

        public void b(View view, gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a666d881", new Object[]{this, view, gflVar});
                return;
            }
            RecyclerView.LayoutParams l = l(view);
            this.f15748a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.f15748a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (l.isItemRemoved() || l.isItemChanged()) {
                this.d += gflVar.e(view);
            }
        }

        public void c(boolean z, int i, gfl gflVar) {
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e22e079e", new Object[]{this, new Boolean(z), new Integer(i), gflVar});
                return;
            }
            if (z) {
                i2 = k(gflVar);
            } else {
                i2 = n(gflVar);
            }
            f();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= gflVar.i()) && !z) {
                    gflVar.k();
                }
                if (i != Integer.MIN_VALUE) {
                    i2 += i;
                }
                this.c = i2;
                this.b = i2;
                this.g = Integer.MIN_VALUE;
                this.f = Integer.MIN_VALUE;
            }
        }

        public void d(gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa1a5c2f", new Object[]{this, gflVar});
            } else if (this.f15748a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            } else {
                ArrayList<View> arrayList = this.f15748a;
                this.c = gflVar.d(arrayList.get(arrayList.size() - 1));
            }
        }

        public void e(gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8f411b6", new Object[]{this, gflVar});
            } else if (this.f15748a.size() == 0) {
                this.b = Integer.MIN_VALUE;
            } else {
                this.b = gflVar.g(this.f15748a.get(0));
            }
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f15748a.clear();
            o();
            this.d = 0;
        }

        public boolean g(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e967de4d", new Object[]{this, view})).booleanValue();
            }
            int size = this.f15748a.size();
            if (size <= 0 || this.f15748a.get(size - 1) != view) {
                return false;
            }
            return true;
        }

        public boolean h(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2a95d8a6", new Object[]{this, view})).booleanValue();
            }
            if (this.f15748a.size() <= 0 || this.f15748a.get(0) != view) {
                return false;
            }
            return true;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bc8eb8fe", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public int j(int i, gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6b7f71cb", new Object[]{this, new Integer(i), gflVar})).intValue();
            }
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (i == Integer.MIN_VALUE || this.f15748a.size() != 0) {
                d(gflVar);
                return this.c;
            }
            int i3 = this.f;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            return i;
        }

        public int k(gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8b13fbc8", new Object[]{this, gflVar})).intValue();
            }
            return j(Integer.MIN_VALUE, gflVar);
        }

        public RecyclerView.LayoutParams l(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.LayoutParams) ipChange.ipc$dispatch("79f8f4b6", new Object[]{this, view});
            }
            return (RecyclerView.LayoutParams) view.getLayoutParams();
        }

        public int m(int i, gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0808524", new Object[]{this, new Integer(i), gflVar})).intValue();
            }
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (i == Integer.MIN_VALUE || this.f15748a.size() != 0) {
                e(gflVar);
                return this.b;
            }
            int i3 = this.g;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            return i;
        }

        public int n(gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b066994f", new Object[]{this, gflVar})).intValue();
            }
            return m(Integer.MIN_VALUE, gflVar);
        }

        public void o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4924c40e", new Object[]{this});
                return;
            }
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
        }

        public void p(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65c9874a", new Object[]{this, new Integer(i)});
                return;
            }
            int i2 = this.f;
            if (i2 != Integer.MIN_VALUE) {
                this.f = i2 + i;
            }
            int i3 = this.b;
            if (i3 != Integer.MIN_VALUE) {
                this.b = i3 + i;
            }
            int i4 = this.g;
            if (i4 != Integer.MIN_VALUE) {
                this.g = i4 + i;
            }
            int i5 = this.c;
            if (i5 != Integer.MIN_VALUE) {
                this.c = i5 + i;
            }
        }

        public void q(gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b610e166", new Object[]{this, gflVar});
                return;
            }
            int size = this.f15748a.size();
            View remove = this.f15748a.remove(size - 1);
            RecyclerView.LayoutParams l = l(remove);
            if (l.isItemRemoved() || l.isItemChanged()) {
                this.d -= gflVar.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void r(gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d15e252d", new Object[]{this, gflVar});
                return;
            }
            View remove = this.f15748a.remove(0);
            RecyclerView.LayoutParams l = l(remove);
            if (this.f15748a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (l.isItemRemoved() || l.isItemChanged()) {
                this.d -= gflVar.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void s(View view, gfl gflVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e96568d", new Object[]{this, view, gflVar});
                return;
            }
            RecyclerView.LayoutParams l = l(view);
            this.f15748a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.f15748a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (l.isItemRemoved() || l.isItemChanged()) {
                this.d += gflVar.e(view);
            }
        }

        public void t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edddd9a6", new Object[]{this, new Integer(i)});
                return;
            }
            this.b = i;
            this.c = i;
            this.g = Integer.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
        }

        public c(int i) {
            this.f15748a = new ArrayList<>();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.e = i;
        }
    }

    static {
        t2o.a(156238008);
    }

    public ahq() {
        this(1, 0);
    }

    public static /* synthetic */ void f0(ahq ahqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f248d4e", new Object[]{ahqVar});
        } else {
            ahqVar.g0();
        }
    }

    public static /* synthetic */ Object ipc$super(ahq ahqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1250399331:
                return new Boolean(super.q(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[3], ((Boolean) objArr[4]).booleanValue()));
            case -451962688:
                ahqVar.w((Bundle) objArr[0]);
                return null;
            case -379145078:
                super.d0((com.alibaba.android.ultron.ext.vlayout.b) objArr[0]);
                return null;
            case 123959900:
                super.s(((Number) objArr[0]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[1]);
                return null;
            case 230087070:
                super.v((RecyclerView.State) objArr[0], (VirtualLayoutManager.d) objArr[1], (com.alibaba.android.ultron.ext.vlayout.b) objArr[2]);
                return null;
            case 417178499:
                super.h((RecyclerView.State) objArr[0], (VirtualLayoutManager.d) objArr[1], (com.alibaba.android.ultron.ext.vlayout.b) objArr[2]);
                return null;
            case 613864280:
                ahqVar.x((Bundle) objArr[0]);
                return null;
            case 1393967370:
                super.t(((Number) objArr[0]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[1]);
                return null;
            case 1442388153:
                super.g((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], (com.alibaba.android.ultron.ext.vlayout.b) objArr[2]);
                return null;
            case 1566030385:
                super.f((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (com.alibaba.android.ultron.ext.vlayout.b) objArr[5]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/StaggeredGridLayoutHelper");
        }
    }

    @Override // tb.sw1
    public void b0(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        boolean z;
        int g;
        int d;
        VirtualLayoutManager.f fVar2;
        int i;
        int i2;
        int i3;
        int i4;
        c cVar;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        View view;
        gfl gflVar;
        int i11;
        c cVar2;
        int m;
        int i12;
        int i13;
        int i14;
        int size;
        int size2;
        RecyclerView.Recycler recycler2 = recycler;
        RecyclerView.State state2 = state;
        VirtualLayoutManager.f fVar3 = fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272ad6d", new Object[]{this, recycler2, state2, fVar3, vigVar, bVar});
        } else if (!p(fVar.c())) {
            i0();
            if (bVar.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            gfl g2 = bVar.g();
            gfl c2 = bVar.c();
            boolean m2 = bVar.m();
            this.u.set(0, this.n, true);
            if (fVar.f() == 1) {
                g = fVar.g() + fVar.b();
                d = fVar.d() + g + g2.j();
            } else {
                g = fVar.g() - fVar.b();
                d = (g - fVar.d()) - g2.k();
            }
            int i15 = d;
            y0(fVar.f(), i15, g2);
            int g3 = fVar.g();
            ((ArrayList) this.w).clear();
            while (fVar3.h(state2) && !this.u.isEmpty() && !p(fVar.c())) {
                int c3 = fVar.c();
                View l = fVar3.l(recycler2);
                if (l == null) {
                    break;
                }
                VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) l.getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                int b2 = this.v.b(viewLayoutPosition);
                if (b2 == Integer.MIN_VALUE) {
                    cVar = o0(g3, fVar3, bVar);
                    this.v.c(viewLayoutPosition, cVar);
                } else {
                    cVar = this.o[b2];
                }
                if (viewLayoutPosition - n().d().intValue() < this.n) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (n().e().intValue() - viewLayoutPosition < this.n) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fVar.j()) {
                    ((ArrayList) this.w).add(l);
                }
                bVar.v(fVar3, l);
                if (z) {
                    int q = bVar.q(this.r, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
                    int l2 = g2.l();
                    if (Float.isNaN(layoutParams.f2290a)) {
                        size2 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    } else {
                        size2 = (int) ((View.MeasureSpec.getSize(q) / layoutParams.f2290a) + 0.5f);
                    }
                    bVar.measureChildWithMargins(l, q, bVar.q(l2, size2, true));
                    z4 = true;
                } else {
                    int q2 = bVar.q(this.r, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
                    int l3 = g2.l();
                    if (Float.isNaN(layoutParams.f2290a)) {
                        size = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    } else {
                        size = (int) ((View.MeasureSpec.getSize(q2) * layoutParams.f2290a) + 0.5f);
                    }
                    z4 = true;
                    bVar.measureChildWithMargins(l, bVar.q(l3, size, true), q2);
                }
                if (fVar.f() == z4) {
                    i6 = cVar.j(g3, g2);
                    if (z2) {
                        i14 = T(bVar, z, z4, m2);
                    } else if (this.x) {
                        if (Math.abs(c3 - this.y) >= this.n) {
                            if (z) {
                                i14 = this.q;
                            } else {
                                i14 = this.p;
                            }
                        }
                        i5 = g2.e(l) + i6;
                    } else if (z) {
                        i14 = this.q;
                    } else {
                        i14 = this.p;
                    }
                    i6 += i14;
                    i5 = g2.e(l) + i6;
                } else {
                    if (z3) {
                        m = cVar.m(g3, g2);
                        if (z) {
                            i13 = this.i;
                        } else {
                            i13 = this.g;
                        }
                        i12 = i13 + this.c;
                    } else {
                        m = cVar.m(g3, g2);
                        if (z) {
                            i12 = this.q;
                        } else {
                            i12 = this.p;
                        }
                    }
                    int i16 = m - i12;
                    i5 = i16;
                    i6 = i16 - g2.e(l);
                }
                if (fVar.f() == 1) {
                    cVar.b(l, g2);
                } else {
                    cVar.s(l, g2);
                }
                int i17 = cVar.e;
                int i18 = this.n - 1;
                int i19 = this.r;
                if (i17 == i18) {
                    int i20 = this.s;
                    i7 = ((i17 * (i19 + i20)) - i20) + this.t;
                } else {
                    i7 = i17 * (i19 + this.s);
                }
                int k = i7 + c2.k();
                if (z) {
                    i8 = this.f;
                    i9 = this.b;
                } else {
                    i8 = this.h;
                    i9 = this.d;
                }
                int i21 = k + i8 + i9;
                int f = i21 + g2.f(l);
                if (z) {
                    view = l;
                    i10 = g3;
                    z5 = m2;
                    Z(l, i21, i6, f, i5, bVar);
                    i11 = i15;
                    cVar2 = cVar;
                    gflVar = g2;
                } else {
                    view = l;
                    i10 = g3;
                    z5 = m2;
                    cVar2 = cVar;
                    i11 = i15;
                    gflVar = g2;
                    Z(view, i6, i21, i5, f, bVar);
                }
                z0(cVar2, fVar.f(), i11, gflVar);
                q0(recycler, fVar, cVar2, g, bVar);
                V(vigVar, view);
                recycler2 = recycler;
                i15 = i11;
                g2 = gflVar;
                m2 = z5;
                g3 = i10;
                state2 = state;
                fVar3 = fVar;
            }
            if (p(fVar.c())) {
                if (fVar.f() == -1) {
                    int length = this.o.length;
                    for (int i22 = 0; i22 < length; i22++) {
                        c cVar3 = this.o[i22];
                        int i23 = cVar3.b;
                        if (i23 != Integer.MIN_VALUE) {
                            cVar3.f = i23;
                        }
                    }
                } else {
                    int length2 = this.o.length;
                    for (int i24 = 0; i24 < length2; i24++) {
                        c cVar4 = this.o[i24];
                        int i25 = cVar4.c;
                        if (i25 != Integer.MIN_VALUE) {
                            cVar4.g = i25;
                        }
                    }
                }
            }
            if (fVar.f() == -1) {
                if (!p(fVar.c())) {
                    fVar2 = fVar;
                    if (fVar2.h(state)) {
                        vigVar.f30032a = fVar.g() - l0(g2.k(), g2);
                    }
                } else {
                    fVar2 = fVar;
                }
                int g4 = fVar.g() - n0(g2.i(), g2);
                if (z) {
                    i3 = this.h;
                    i4 = this.d;
                } else {
                    i3 = this.f;
                    i4 = this.b;
                }
                vigVar.f30032a = g4 + i3 + i4;
            } else {
                fVar2 = fVar;
                if (p(fVar.c()) || !fVar2.h(state)) {
                    int k0 = k0(g2.i(), g2) - fVar.g();
                    if (z) {
                        i = this.i;
                        i2 = this.e;
                    } else {
                        i = this.g;
                        i2 = this.c;
                    }
                    vigVar.f30032a = k0 + i + i2;
                } else {
                    vigVar.f30032a = m0(g2.i(), g2) - fVar.g();
                }
            }
            r0(recycler, fVar2, bVar);
        }
    }

    @Override // tb.sw1
    public void d0(com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966b48a", new Object[]{this, bVar});
        } else {
            super.d0(bVar);
        }
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
            return;
        }
        super.f(recycler, state, i, i2, i3, bVar);
        this.x = false;
        if (i <= n().e().intValue() && i2 >= n().d().intValue() && !state.isPreLayout() && bVar.getChildCount() > 0) {
            ViewCompat.postOnAnimation(bVar.getChildAt(0), this.A);
        }
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void g(RecyclerView.Recycler recycler, RecyclerView.State state, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        int contentHeight;
        int J;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f918b9", new Object[]{this, recycler, state, bVar});
            return;
        }
        super.g(recycler, state, bVar);
        if (bVar.getOrientation() == 1) {
            contentHeight = ((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight()) - B();
            J = C();
        } else {
            contentHeight = ((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom()) - I();
            J = J();
        }
        int i2 = contentHeight - J;
        int i3 = this.p;
        int i4 = this.n;
        int i5 = (int) (((i2 - (i3 * (i4 - 1))) / i4) + 0.5d);
        this.r = i5;
        int i6 = i2 - (i5 * i4);
        if (i4 <= 1) {
            this.t = 0;
            this.s = 0;
        } else if (i4 == 2) {
            this.s = i6;
            this.t = i6;
        } else {
            if (bVar.getOrientation() == 1) {
                i = this.p;
            } else {
                i = this.q;
            }
            this.t = i;
            this.s = i;
        }
        WeakReference<VirtualLayoutManager> weakReference = this.z;
        if ((weakReference == null || weakReference.get() == null || this.z.get() != bVar) && (bVar instanceof VirtualLayoutManager)) {
            this.z = new WeakReference<>((VirtualLayoutManager) bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0100 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c A[LOOP:2: B:58:0x010a->B:59:0x010c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g0() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ahq.g0():void");
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void h(RecyclerView.State state, VirtualLayoutManager.d dVar, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        int i;
        int i2;
        boolean z;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dda383", new Object[]{this, state, dVar, bVar});
            return;
        }
        super.h(state, dVar, bVar);
        i0();
        zen<Integer> n = n();
        if (dVar.c) {
            if (dVar.f2292a < (n.d().intValue() + this.n) - 1) {
                dVar.f2292a = Math.min((n.d().intValue() + this.n) - 1, n.e().intValue());
            }
        } else if (dVar.f2292a > n.e().intValue() - (this.n - 1)) {
            dVar.f2292a = Math.max(n.d().intValue(), n.e().intValue() - (this.n - 1));
        }
        View findViewByPosition = bVar.findViewByPosition(dVar.f2292a);
        if (bVar.getOrientation() == 1) {
            i = this.q;
        } else {
            i = this.p;
        }
        gfl g = bVar.g();
        if (findViewByPosition == null) {
            int length = this.o.length;
            while (i3 < length) {
                c cVar = this.o[i3];
                cVar.f();
                cVar.t(dVar.b);
                i3++;
            }
            return;
        }
        int i4 = Integer.MIN_VALUE;
        if (dVar.c) {
            i2 = Integer.MIN_VALUE;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int length2 = this.o.length;
        for (int i5 = 0; i5 < length2; i5++) {
            c cVar2 = this.o[i5];
            if (!c.a(cVar2).isEmpty()) {
                if (dVar.c) {
                    i2 = Math.max(i2, bVar.getPosition((View) c.a(cVar2).get(c.a(cVar2).size() - 1)));
                } else {
                    i2 = Math.min(i2, bVar.getPosition((View) c.a(cVar2).get(0)));
                }
            }
        }
        if (!p(i2)) {
            if (i2 == n.d().intValue()) {
                z = true;
            } else {
                z = false;
            }
            View findViewByPosition2 = bVar.findViewByPosition(i2);
            if (findViewByPosition2 != null) {
                if (dVar.c) {
                    dVar.f2292a = i2;
                    int d = g.d(findViewByPosition);
                    int i6 = dVar.b;
                    if (d < i6) {
                        int i7 = i6 - d;
                        if (z) {
                            i = 0;
                        }
                        int i8 = i7 + i;
                        dVar.b = g.d(findViewByPosition2) + i8;
                        i4 = i8;
                    } else {
                        if (z) {
                            i = 0;
                        }
                        dVar.b = g.d(findViewByPosition2) + i;
                        i4 = i;
                    }
                } else {
                    dVar.f2292a = i2;
                    int g2 = g.g(findViewByPosition);
                    int i9 = dVar.b;
                    if (g2 > i9) {
                        int i10 = i9 - g2;
                        if (z) {
                            i = 0;
                        }
                        i4 = i10 - i;
                        dVar.b = g.g(findViewByPosition2) + i4;
                    } else {
                        if (z) {
                            i = 0;
                        }
                        i4 = -i;
                        dVar.b = g.g(findViewByPosition2) + i4;
                    }
                }
            }
        } else {
            this.y = dVar.f2292a;
            this.x = true;
        }
        int length3 = this.o.length;
        while (i3 < length3) {
            this.o[i3].c(bVar.getReverseLayout() ^ dVar.c, i4, g);
            i3++;
        }
    }

    public final boolean h0(c cVar, VirtualLayoutManager virtualLayoutManager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ecba018", new Object[]{this, cVar, virtualLayoutManager, new Integer(i)})).booleanValue();
        }
        gfl g = virtualLayoutManager.g();
        if (virtualLayoutManager.getReverseLayout()) {
            if (cVar.k(g) < i) {
                return true;
            }
        } else if (cVar.n(g) > i) {
            return true;
        }
        return false;
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70f3e70", new Object[]{this});
            return;
        }
        c[] cVarArr = this.o;
        if (cVarArr == null || cVarArr.length != this.n || this.u == null) {
            this.u = new BitSet(this.n);
            this.o = new c[this.n];
            for (int i = 0; i < this.n; i++) {
                this.o[i] = new c(i, null);
            }
        }
    }

    @Override // tb.z3i, com.alibaba.android.ultron.ext.vlayout.a
    public int j(int i, boolean z, boolean z2, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51cd0ec3", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), bVar})).intValue();
        }
        if (bVar.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        gfl g = bVar.g();
        View findViewByPosition = bVar.findViewByPosition(n().d().intValue() + i);
        if (findViewByPosition == null) {
            return 0;
        }
        i0();
        if (z3) {
            if (z) {
                if (i == m() - 1) {
                    return this.i + this.e + (k0(g.d(findViewByPosition), g) - g.d(findViewByPosition));
                }
                if (!z2) {
                    return m0(g.g(findViewByPosition), g) - g.d(findViewByPosition);
                }
            } else if (i == 0) {
                return ((-this.h) - this.d) - (g.g(findViewByPosition) - n0(g.g(findViewByPosition), g));
            } else {
                if (!z2) {
                    return l0(g.d(findViewByPosition), g) - g.g(findViewByPosition);
                }
            }
        }
        return 0;
    }

    public final c j0(int i, View view, boolean z) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("276e2f18", new Object[]{this, new Integer(i), view, new Boolean(z)});
        }
        int b2 = this.v.b(i);
        if (b2 >= 0) {
            c[] cVarArr = this.o;
            if (b2 < cVarArr.length) {
                c cVar = cVarArr[b2];
                if (z && cVar.h(view)) {
                    return cVar;
                }
                if (!z && cVar.g(view)) {
                    return cVar;
                }
            }
        }
        while (true) {
            c[] cVarArr2 = this.o;
            if (i2 >= cVarArr2.length) {
                return null;
            }
            if (i2 != b2) {
                c cVar2 = cVarArr2[i2];
                if (z && cVar2.h(view)) {
                    return cVar2;
                }
                if (!z && cVar2.g(view)) {
                    return cVar2;
                }
            }
            i2++;
        }
    }

    public final int k0(int i, gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("346d43b7", new Object[]{this, new Integer(i), gflVar})).intValue();
        }
        int j = this.o[0].j(i, gflVar);
        for (int i2 = 1; i2 < this.n; i2++) {
            int j2 = this.o[i2].j(i, gflVar);
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public final int l0(int i, gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a75c9590", new Object[]{this, new Integer(i), gflVar})).intValue();
        }
        int m = this.o[0].m(i, gflVar);
        for (int i2 = 1; i2 < this.n; i2++) {
            int m2 = this.o[i2].m(i, gflVar);
            if (m2 > m) {
                m = m2;
            }
        }
        return m;
    }

    public final int m0(int i, gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e40ada5", new Object[]{this, new Integer(i), gflVar})).intValue();
        }
        int j = this.o[0].j(i, gflVar);
        for (int i2 = 1; i2 < this.n; i2++) {
            int j2 = this.o[i2].j(i, gflVar);
            if (j2 < j) {
                j = j2;
            }
        }
        return j;
    }

    public final int n0(int i, gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9fd3bfe", new Object[]{this, new Integer(i), gflVar})).intValue();
        }
        int m = this.o[0].m(i, gflVar);
        for (int i2 = 1; i2 < this.n; i2++) {
            int m2 = this.o[i2].m(i, gflVar);
            if (m2 < m) {
                m = m2;
            }
        }
        return m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r3 != r9.getReverseLayout()) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r3 == r9.n()) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
        r1 = r6.n - 1;
        r9 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        r4 = r6.n;
        r9 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.ahq.c o0(int r7, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.f r8, com.alibaba.android.ultron.ext.vlayout.b r9) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ahq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0023
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r6
            r7[r0] = r3
            r0 = 2
            r7[r0] = r8
            r8 = 3
            r7[r8] = r9
            java.lang.String r8 = "ec263e27"
            java.lang.Object r7 = r2.ipc$dispatch(r8, r7)
            tb.ahq$c r7 = (tb.ahq.c) r7
            return r7
        L_0x0023:
            tb.gfl r2 = r9.g()
            int r3 = r9.getOrientation()
            r4 = -1
            if (r3 != 0) goto L_0x003e
            int r3 = r8.f()
            if (r3 != r4) goto L_0x0036
            r3 = 1
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            boolean r9 = r9.getReverseLayout()
            if (r3 == r9) goto L_0x005c
            goto L_0x0056
        L_0x003e:
            int r3 = r8.f()
            if (r3 != r4) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            boolean r5 = r9.getReverseLayout()
            if (r3 != r5) goto L_0x004f
            r3 = 1
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            boolean r9 = r9.n()
            if (r3 != r9) goto L_0x005c
        L_0x0056:
            int r9 = r6.n
            int r1 = r9 + (-1)
            r9 = -1
            goto L_0x005f
        L_0x005c:
            int r4 = r6.n
            r9 = 1
        L_0x005f:
            int r8 = r8.f()
            r3 = 0
            if (r8 != r0) goto L_0x007a
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0069:
            if (r1 == r4) goto L_0x0079
            tb.ahq$c[] r0 = r6.o
            r0 = r0[r1]
            int r5 = r0.j(r7, r2)
            if (r5 >= r8) goto L_0x0077
            r3 = r0
            r8 = r5
        L_0x0077:
            int r1 = r1 + r9
            goto L_0x0069
        L_0x0079:
            return r3
        L_0x007a:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            if (r1 == r4) goto L_0x008c
            tb.ahq$c[] r0 = r6.o
            r0 = r0[r1]
            int r5 = r0.m(r7, r2)
            if (r5 <= r8) goto L_0x008a
            r3 = r0
            r8 = r5
        L_0x008a:
            int r1 = r1 + r9
            goto L_0x007c
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ahq.o0(int, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$f, com.alibaba.android.ultron.ext.vlayout.b):tb.ahq$c");
    }

    public final View p0(VirtualLayoutManager virtualLayoutManager, int i, int i2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3a1e3b6a", new Object[]{this, virtualLayoutManager, new Integer(i), new Integer(i2)});
        }
        if (virtualLayoutManager.findViewByPosition(i) == null) {
            return null;
        }
        new BitSet(this.n).set(0, this.n, true);
        int length = this.o.length;
        for (int i3 = 0; i3 < length; i3++) {
            c cVar = this.o[i3];
            if (c.a(cVar).size() != 0 && h0(cVar, virtualLayoutManager, i2)) {
                if (virtualLayoutManager.getReverseLayout()) {
                    obj = c.a(cVar).get(c.a(cVar).size() - 1);
                } else {
                    obj = c.a(cVar).get(0);
                }
                return (View) obj;
            }
        }
        return null;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public boolean q(int i, int i2, int i3, com.alibaba.android.ultron.ext.vlayout.b bVar, boolean z) {
        View findViewByPosition;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5786b9d", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), bVar, new Boolean(z)})).booleanValue();
        }
        boolean q = super.q(i, i2, i3, bVar, z);
        if (q && (findViewByPosition = bVar.findViewByPosition(i)) != null) {
            gfl g = bVar.g();
            int viewLayoutPosition = ((RecyclerView.LayoutParams) findViewByPosition.getLayoutParams()).getViewLayoutPosition();
            if (bVar.getReverseLayout()) {
                if (z) {
                    c j0 = j0(viewLayoutPosition, findViewByPosition, true);
                    if (j0 != null) {
                        j0.q(g);
                    }
                } else {
                    c j02 = j0(viewLayoutPosition, findViewByPosition, false);
                    if (j02 != null) {
                        j02.r(g);
                    }
                }
            } else if (z) {
                c j03 = j0(viewLayoutPosition, findViewByPosition, true);
                if (j03 != null) {
                    j03.r(g);
                }
            } else {
                c j04 = j0(viewLayoutPosition, findViewByPosition, false);
                if (j04 != null) {
                    j04.q(g);
                }
            }
        }
        return q;
    }

    public final void q0(RecyclerView.Recycler recycler, VirtualLayoutManager.f fVar, c cVar, int i, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb2045d", new Object[]{this, recycler, fVar, cVar, new Integer(i), bVar});
            return;
        }
        gfl g = bVar.g();
        if (fVar.f() == -1) {
            s0(recycler, Math.max(i, l0(cVar.n(g), g)) + (g.h() - g.k()), bVar);
        } else {
            t0(recycler, Math.min(i, m0(cVar.k(g), g)) - (g.h() - g.k()), bVar);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void r(com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dbe72f", new Object[]{this, bVar});
        }
    }

    public final void r0(RecyclerView.Recycler recycler, VirtualLayoutManager.f fVar, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645dd537", new Object[]{this, recycler, fVar, bVar});
            return;
        }
        gfl g = bVar.g();
        for (int size = ((ArrayList) this.w).size() - 1; size >= 0; size--) {
            View view = (View) ((ArrayList) this.w).get(size);
            if (view != null && g.g(view) > g.i()) {
                c j0 = j0(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), view, false);
                if (j0 != null) {
                    j0.q(g);
                }
                bVar.e(view);
                recycler.recycleView(view);
            } else if (view != null) {
                c j02 = j0(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), view, false);
                if (j02 != null) {
                    j02.q(g);
                }
                bVar.e(view);
                recycler.recycleView(view);
                return;
            }
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void s(int i, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7637a5c", new Object[]{this, new Integer(i), bVar});
            return;
        }
        super.s(i, bVar);
        if (bVar.getOrientation() == 0) {
            int length = this.o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.o[i2].p(i);
            }
        }
    }

    public final void s0(RecyclerView.Recycler recycler, int i, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f7ab8dd", new Object[]{this, recycler, new Integer(i), bVar});
            return;
        }
        gfl g = bVar.g();
        for (int childCount = bVar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = bVar.getChildAt(childCount);
            if (childAt != null && g.g(childAt) > i) {
                c j0 = j0(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewPosition(), childAt, false);
                if (j0 != null) {
                    j0.q(g);
                    bVar.e(childAt);
                    recycler.recycleView(childAt);
                }
            } else {
                return;
            }
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void t(int i, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5316410a", new Object[]{this, new Integer(i), bVar});
            return;
        }
        super.t(i, bVar);
        if (bVar.getOrientation() == 1) {
            int length = this.o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.o[i2].p(i);
            }
        }
    }

    public final void t0(RecyclerView.Recycler recycler, int i, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        View childAt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd955076", new Object[]{this, recycler, new Integer(i), bVar});
            return;
        }
        gfl g = bVar.g();
        boolean z = true;
        while (bVar.getChildCount() > 0 && z && (childAt = bVar.getChildAt(0)) != null && g.d(childAt) < i) {
            c j0 = j0(((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewPosition(), childAt, true);
            if (j0 != null) {
                j0.r(g);
                bVar.e(childAt);
                recycler.recycleView(childAt);
            } else {
                z = false;
            }
        }
    }

    public void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2264c8", new Object[]{this, new Integer(i)});
            return;
        }
        v0(i);
        x0(i);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void v(RecyclerView.State state, VirtualLayoutManager.d dVar, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6d99e", new Object[]{this, state, dVar, bVar});
            return;
        }
        super.v(state, dVar, bVar);
        i0();
        if (p(dVar.f2292a)) {
            int length = this.o.length;
            for (int i = 0; i < length; i++) {
                this.o[i].f();
            }
        }
    }

    public void v0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33f8748c", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void w0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed472ae", new Object[]{this, new Integer(i)});
            return;
        }
        this.n = i;
        i0();
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb6869a", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void y(int i, int i2, int i3, com.alibaba.android.ultron.ext.vlayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a480a2", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), bVar});
        } else if (i2 <= n().e().intValue() && i3 >= n().d().intValue() && i == 0) {
            g0();
        }
    }

    public final void y0(int i, int i2, gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2108b4c7", new Object[]{this, new Integer(i), new Integer(i2), gflVar});
            return;
        }
        for (int i3 = 0; i3 < this.n; i3++) {
            if (!c.a(this.o[i3]).isEmpty()) {
                z0(this.o[i3], i, i2, gflVar);
            }
        }
    }

    public final void z0(c cVar, int i, int i2, gfl gflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ac31f5", new Object[]{this, cVar, new Integer(i), new Integer(i2), gflVar});
            return;
        }
        int i3 = cVar.i();
        if (i == -1) {
            if (cVar.n(gflVar) + i3 < i2) {
                this.u.set(cVar.e, false);
            }
        } else if (cVar.k(gflVar) - i3 > i2) {
            this.u.set(cVar.e, false);
        }
    }

    public ahq(int i, int i2) {
        this.n = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = null;
        this.v = new b();
        this.w = new ArrayList();
        this.z = null;
        this.A = new a();
        w0(i);
        u0(i2);
    }
}
