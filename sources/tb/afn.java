package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class afn extends sw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int q = View.MeasureSpec.makeMeasureSpec(0, 0);
    public final a n;
    public int o;
    public boolean p;

    static {
        t2o.a(156238002);
    }

    public afn(int i) {
        this(i, -1, -1);
    }

    public static /* synthetic */ Object ipc$super(afn afnVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -379145078:
                super.d0((b) objArr[0]);
                return null;
            case -311345545:
                super.K(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1289754646:
                super.P(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1372393155:
                return new Integer(super.j(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (b) objArr[3]));
            case 1390143279:
                super.r((b) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/RangeGridLayoutHelper");
        }
    }

    @Override // tb.z3i
    public void K(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed713e77", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.K(i, i2, i3, i4);
        this.n.X(i, i2, i3, i4);
    }

    @Override // tb.z3i
    public void P(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.P(i, i2, i3, i4);
        this.n.Y(i, i2, i3, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ca, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f9, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0332, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0166, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0291, code lost:
        r10 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x025d A[EDGE_INSN: B:359:0x025d->B:80:0x025d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0260  */
    @Override // tb.sw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(androidx.recyclerview.widget.RecyclerView.Recycler r32, androidx.recyclerview.widget.RecyclerView.State r33, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.f r34, tb.vig r35, com.alibaba.android.ultron.ext.vlayout.b r36) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.afn.b0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$f, tb.vig, com.alibaba.android.ultron.ext.vlayout.b):void");
    }

    @Override // tb.sw1
    public void d0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966b48a", new Object[]{this, bVar});
            return;
        }
        super.d0(bVar);
        this.n.T(bVar);
        this.n.t0();
    }

    @Override // tb.sw1
    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594a72bf", new Object[]{this})).booleanValue();
        }
        return this.n.W();
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
        } else {
            this.n.a(recycler, state, i, i2, i3, bVar);
        }
    }

    public final void f0(a aVar, RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, boolean z, b bVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a37c84b4", new Object[]{this, aVar, recycler, state, new Integer(i), new Integer(i2), new Boolean(z), bVar});
            return;
        }
        if (z) {
            i3 = i;
            i4 = 0;
            i5 = 1;
        } else {
            i4 = i - 1;
            i3 = -1;
            i5 = -1;
        }
        if (bVar.getOrientation() != 1 || !bVar.n()) {
            i6 = 1;
        } else {
            i7 = i2 - 1;
            i6 = -1;
        }
        while (i4 != i3) {
            int k0 = k0(a.j0(aVar), recycler, state, bVar.getPosition(a.k0(aVar)[i4]));
            if (i6 != -1 || k0 <= 1) {
                a.e0(aVar)[i4] = i7;
            } else {
                a.e0(aVar)[i4] = i7 - (k0 - 1);
            }
            i7 += k0 * i6;
            i4 += i5;
        }
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void g(RecyclerView.Recycler recycler, RecyclerView.State state, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f918b9", new Object[]{this, recycler, state, bVar});
        } else {
            this.n.b(recycler, state, bVar);
        }
    }

    public int g0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("818432fc", new Object[]{this, bVar})).intValue();
        }
        a s0 = this.n.s0(n().e().intValue());
        if (bVar.getOrientation() == 1) {
            return s0.l() + s0.p();
        }
        return s0.n() + s0.r();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void h(RecyclerView.State state, VirtualLayoutManager.d dVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18dda383", new Object[]{this, state, dVar, bVar});
        } else if (state.getItemCount() > 0) {
            a s0 = this.n.s0(dVar.f2292a);
            int b = a.j0(s0).b(dVar.f2292a, a.d0(s0));
            if (!dVar.c) {
                while (b > 0) {
                    int i = dVar.f2292a;
                    if (i <= 0) {
                        break;
                    }
                    dVar.f2292a = i - 1;
                    b = a.j0(s0).b(dVar.f2292a, a.d0(s0));
                }
            } else {
                while (b < a.d0(s0) - 1 && dVar.f2292a < n().e().intValue()) {
                    dVar.f2292a++;
                    b = a.j0(s0).b(dVar.f2292a, a.d0(s0));
                }
            }
            this.p = true;
        }
    }

    public int h0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("672d8355", new Object[]{this, bVar})).intValue();
        }
        a s0 = this.n.s0(n().d().intValue());
        if (bVar.getOrientation() == 1) {
            return s0.o() + s0.s();
        }
        return s0.m() + s0.q();
    }

    public final int i0(a aVar, int i, int i2, int i3, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b14f704e", new Object[]{this, aVar, new Integer(i), new Integer(i2), new Integer(i3), new Float(f)})).intValue();
        }
        if (!Float.isNaN(f) && f > 0.0f && i3 > 0) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i3 / f) + 0.5f), 1073741824);
        }
        if (!Float.isNaN(a.f0(aVar)) && a.f0(aVar) > 0.0f) {
            return View.MeasureSpec.makeMeasureSpec((int) ((i2 / a.f0(aVar)) + 0.5f), 1073741824);
        }
        if (i < 0) {
            return q;
        }
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    @Override // tb.z3i, com.alibaba.android.ultron.ext.vlayout.a
    public int j(int i, boolean z, boolean z2, b bVar) {
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51cd0ec3", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), bVar})).intValue();
        }
        if (bVar.getOrientation() == 1) {
            z3 = true;
        }
        if (z) {
            if (i == m() - 1) {
                return a.o0(this.n, z3);
            }
        } else if (i == 0) {
            return a.p0(this.n, z3);
        }
        return super.j(i, z, z2, bVar);
    }

    public final int j0(eka ekaVar, int i, RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c8ebdc5a", new Object[]{this, ekaVar, new Integer(i), recycler, state, new Integer(i2)})).intValue();
        }
        if (!state.isPreLayout()) {
            return ekaVar.b(i2, i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i2);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return ekaVar.b(convertPreLayoutPositionToPostLayout, i);
    }

    public final int k0(eka ekaVar, RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2cc7c5be", new Object[]{this, ekaVar, recycler, state, new Integer(i)})).intValue();
        }
        if (!state.isPreLayout()) {
            return ekaVar.d(i);
        }
        int convertPreLayoutPositionToPostLayout = recycler.convertPreLayoutPositionToPostLayout(i);
        if (convertPreLayoutPositionToPostLayout == -1) {
            return 0;
        }
        return ekaVar.d(convertPreLayoutPositionToPostLayout);
    }

    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fb6869a", new Object[]{this, new Integer(i)});
        } else {
            this.n.w0(i);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void r(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dbe72f", new Object[]{this, bVar});
            return;
        }
        super.r(bVar);
        this.n.t0();
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void u(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4958d495", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.n.Z(i, i2);
        }
    }

    public afn(int i, int i2, int i3) {
        this(i, i2, i3, i3);
    }

    public afn(int i, int i2, int i3, int i4) {
        this.o = 0;
        this.p = false;
        a aVar = new a(this);
        this.n = aVar;
        aVar.v0(i);
        aVar.w0(i3);
        aVar.u0(i4);
        z(i2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends ffn<a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final float m;
        public int n;
        public int o;
        public final boolean p;
        public final eka q;
        public int r;
        public int s;
        public final float[] t;
        public View[] u;
        public int[] v;
        public int[] w;

        static {
            t2o.a(156238003);
        }

        public a(afn afnVar) {
            super(afnVar);
            this.m = Float.NaN;
            this.n = 4;
            this.o = 0;
            this.p = true;
            dka dkaVar = new dka();
            this.q = dkaVar;
            this.r = 0;
            this.s = 0;
            this.t = new float[0];
            dkaVar.f(true);
        }

        public static /* synthetic */ int b0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a64eb708", new Object[]{aVar})).intValue();
            }
            return aVar.o;
        }

        public static /* synthetic */ int c0(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("936a54bf", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.o = i;
            return i;
        }

        public static /* synthetic */ int d0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6c793fc9", new Object[]{aVar})).intValue();
            }
            return aVar.n;
        }

        public static /* synthetic */ int[] e0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("823c9aa0", new Object[]{aVar});
            }
            return aVar.v;
        }

        public static /* synthetic */ float f0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a955c775", new Object[]{aVar})).floatValue();
            }
            return aVar.m;
        }

        public static /* synthetic */ int g0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32a3c88a", new Object[]{aVar})).intValue();
            }
            return aVar.s;
        }

        public static /* synthetic */ int h0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f8ce514b", new Object[]{aVar})).intValue();
            }
            return aVar.r;
        }

        public static /* synthetic */ void i0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bef8da19", new Object[]{aVar});
            } else {
                aVar.q0();
            }
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -23973662) {
                super.Z(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/RangeGridLayoutHelper$GridRangeStyle");
        }

        public static /* synthetic */ eka j0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eka) ipChange.ipc$dispatch("c114b56e", new Object[]{aVar});
            }
            return aVar.q;
        }

        public static /* synthetic */ View[] k0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View[]) ipChange.ipc$dispatch("643d9f78", new Object[]{aVar});
            }
            return aVar.u;
        }

        public static /* synthetic */ boolean l0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("11787460", new Object[]{aVar})).booleanValue();
            }
            return aVar.p;
        }

        public static /* synthetic */ float[] m0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (float[]) ipChange.ipc$dispatch("1cbca764", new Object[]{aVar});
            }
            return aVar.t;
        }

        public static /* synthetic */ int[] n0(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("1be336c6", new Object[]{aVar});
            }
            return aVar.w;
        }

        public static int o0(a aVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d39c9d8e", new Object[]{aVar, new Boolean(z)})).intValue();
            }
            if (z) {
                i = aVar.j;
                i2 = aVar.f;
            } else {
                i = aVar.h;
                i2 = aVar.d;
            }
            int i5 = i + i2;
            int intValue = aVar.H().e().intValue();
            int size = aVar.b.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar2 = (a) aVar.b.valueAt(i6);
                if (!aVar2.M()) {
                    i5 += o0(aVar2, z);
                } else if (aVar2.f19255a.e().intValue() == intValue) {
                    if (z) {
                        i3 = aVar2.j;
                        i4 = aVar2.f;
                    } else {
                        i3 = aVar2.h;
                        i4 = aVar2.d;
                    }
                    return i5 + i3 + i4;
                }
            }
            return i5;
        }

        public static int p0(a aVar, boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bbfe5b55", new Object[]{aVar, new Boolean(z)})).intValue();
            }
            if (z) {
                i = -aVar.i;
                i2 = aVar.e;
            } else {
                i = -aVar.g;
                i2 = aVar.c;
            }
            int i5 = i - i2;
            int intValue = aVar.H().d().intValue();
            int size = aVar.b.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar2 = (a) aVar.b.valueAt(i6);
                if (!aVar2.M()) {
                    i5 += p0(aVar2, z);
                } else if (aVar2.f19255a.d().intValue() == intValue) {
                    if (z) {
                        i3 = -aVar2.i;
                        i4 = aVar2.e;
                    } else {
                        i3 = -aVar2.g;
                        i4 = aVar2.c;
                    }
                    return i5 + (i3 - i4);
                }
            }
            return i5;
        }

        @Override // tb.ffn
        public void Z(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe9230e2", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            super.Z(i, i2);
            this.q.g(i);
            this.q.e();
        }

        public final void q0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb725a4e", new Object[]{this});
                return;
            }
            View[] viewArr = this.u;
            if (viewArr == null || viewArr.length != this.n) {
                this.u = new View[this.n];
            }
            int[] iArr = this.v;
            if (iArr == null || iArr.length != this.n) {
                this.v = new int[this.n];
            }
            int[] iArr2 = this.w;
            if (iArr2 == null || iArr2.length != this.n) {
                this.w = new int[this.n];
            }
        }

        public final a r0(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d2973d83", new Object[]{this, aVar, new Integer(i)});
            }
            int size = aVar.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = (a) aVar.b.valueAt(i2);
                zen zenVar = (zen) aVar.b.keyAt(i2);
                if (!aVar2.M()) {
                    return r0(aVar2, i);
                }
                if (zenVar.a(Integer.valueOf(i))) {
                    return (a) aVar.b.valueAt(i2);
                }
            }
            return aVar;
        }

        public a s0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a76683e5", new Object[]{this, new Integer(i)});
            }
            return r0(this, i);
        }

        public void t0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fe825b", new Object[]{this});
                return;
            }
            this.q.e();
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((a) this.b.valueAt(i)).t0();
            }
        }

        public void u0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33f8748c", new Object[]{this, new Integer(i)});
                return;
            }
            if (i < 0) {
                i = 0;
            }
            this.s = i;
        }

        public void v0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1607399", new Object[]{this, new Integer(i)});
            } else if (i != this.n) {
                if (i >= 1) {
                    this.n = i;
                    this.q.e();
                    q0();
                    return;
                }
                throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
            }
        }

        public void w0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4fb6869a", new Object[]{this, new Integer(i)});
                return;
            }
            if (i < 0) {
                i = 0;
            }
            this.r = i;
        }

        public a() {
            this.m = Float.NaN;
            this.n = 4;
            this.o = 0;
            this.p = true;
            dka dkaVar = new dka();
            this.q = dkaVar;
            this.r = 0;
            this.s = 0;
            this.t = new float[0];
            dkaVar.f(true);
        }
    }
}
