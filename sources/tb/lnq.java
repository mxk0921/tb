package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lnq extends ck9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int o;
    public boolean p;
    public int q;
    public View r;
    public boolean s;

    static {
        t2o.a(156238012);
    }

    public lnq() {
        this(true);
    }

    public static /* synthetic */ Object ipc$super(lnq lnqVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -379145078:
                super.d0((b) objArr[0]);
                return null;
            case 312774690:
                super.z(((Number) objArr[0]).intValue());
                return null;
            case 1442388153:
                super.g((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], (b) objArr[2]);
                return null;
            case 1566030385:
                super.f((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1], ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), (b) objArr[5]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/StickyLayoutHelper");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0139, code lost:
        if (r6 > r2) goto L_0x013b;
     */
    @Override // tb.sw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b0(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.RecyclerView.State r18, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.f r19, tb.vig r20, com.alibaba.android.ultron.ext.vlayout.b r21) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lnq.b0(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager$f, tb.vig, com.alibaba.android.ultron.ext.vlayout.b):void");
    }

    @Override // tb.sw1
    public void d0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966b48a", new Object[]{this, bVar});
            return;
        }
        super.d0(bVar);
        View view = this.r;
        if (view != null) {
            bVar.h(view);
            bVar.e(this.r);
            this.r = null;
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
    public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, b bVar) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
            return;
        }
        super.f(recycler, state, i, i2, i3, bVar);
        if (this.o >= 0) {
            gfl g = bVar.g();
            if (!this.s && (i4 = this.o) >= i && i4 <= i2) {
                h0(g, recycler, i, i2, bVar);
            }
            if (this.s || state.isPreLayout()) {
                state.isPreLayout();
                View view = this.r;
                if (view != null) {
                    bVar.e(view);
                } else {
                    return;
                }
            }
            View view2 = this.r;
            if (this.s || view2 == null) {
                j0(g, recycler, i, i2, bVar);
            } else if (view2.getParent() == null) {
                bVar.l(this.r);
            } else {
                i0(g, recycler, i, i2, bVar);
            }
        }
    }

    @Override // tb.sw1, com.alibaba.android.ultron.ext.vlayout.a
    public void g(RecyclerView.Recycler recycler, RecyclerView.State state, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f918b9", new Object[]{this, recycler, state, bVar});
            return;
        }
        super.g(recycler, state, bVar);
        View view = this.r;
        if (view != null && bVar.a(view)) {
            bVar.e(this.r);
            recycler.recycleView(this.r);
            this.r = null;
        }
        this.s = false;
    }

    public final void g0(View view, b bVar) {
        boolean z;
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606520d", new Object[]{this, view, bVar});
            return;
        }
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (bVar.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        int contentWidth = ((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight()) - B();
        int contentHeight = ((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom()) - I();
        float f = layoutParams.f2290a;
        if (z) {
            int q = bVar.q(contentWidth, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            if (Float.isNaN(f) || f <= 0.0f) {
                if (!Float.isNaN(this.l)) {
                    float f2 = this.l;
                    if (f2 > 0.0f) {
                        i2 = View.MeasureSpec.makeMeasureSpec((int) ((contentWidth / f2) + 0.5d), 1073741824);
                    }
                }
                i2 = bVar.q(contentHeight, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
            } else {
                i2 = View.MeasureSpec.makeMeasureSpec((int) ((contentWidth / f) + 0.5f), 1073741824);
            }
            bVar.measureChildWithMargins(view, q, i2);
            return;
        }
        int q2 = bVar.q(contentHeight, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
        if (Float.isNaN(f) || f <= 0.0f) {
            if (!Float.isNaN(this.l)) {
                float f3 = this.l;
                if (f3 > 0.0f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) ((contentHeight * f3) + 0.5d), 1073741824);
                }
            }
            i = bVar.q(contentWidth, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
        } else {
            i = View.MeasureSpec.makeMeasureSpec((int) ((contentHeight * f) + 0.5d), 1073741824);
        }
        bVar.measureChildWithMargins(view, i, q2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0(tb.gfl r5, androidx.recyclerview.widget.RecyclerView.Recycler r6, int r7, int r8, com.alibaba.android.ultron.ext.vlayout.b r9) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.lnq.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x002b
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r4
            r8[r1] = r5
            r5 = 2
            r8[r5] = r6
            r5 = 3
            r8[r5] = r3
            r5 = 4
            r8[r5] = r7
            r5 = 5
            r8[r5] = r9
            java.lang.String r5 = "3f078f7c"
            r2.ipc$dispatch(r5, r8)
            return
        L_0x002b:
            com.android.alibaba.ip.runtime.IpChange r6 = com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager.$ipChange
            android.view.View r6 = r4.r
            if (r6 == 0) goto L_0x00bf
            boolean r6 = r4.p
            if (r6 == 0) goto L_0x007b
            int r6 = r9.getChildCount()
            int r6 = r6 - r1
        L_0x003a:
            if (r6 < 0) goto L_0x00bf
            android.view.View r7 = r9.getChildAt(r6)
            int r8 = r9.getPosition(r7)
            int r0 = r4.o
            if (r8 >= r0) goto L_0x0078
            int r5 = r5.d(r7)
            com.alibaba.android.ultron.ext.vlayout.a r6 = r9.k(r8)
            boolean r7 = r6 instanceof tb.afn
            if (r7 == 0) goto L_0x005c
            tb.afn r6 = (tb.afn) r6
            int r6 = r6.g0(r9)
        L_0x005a:
            int r5 = r5 + r6
            goto L_0x006c
        L_0x005c:
            boolean r7 = r6 instanceof tb.z3i
            if (r7 == 0) goto L_0x006c
            tb.z3i r6 = (tb.z3i) r6
            int r7 = r6.D()
            int r5 = r5 + r7
            int r6 = r6.G()
            goto L_0x005a
        L_0x006c:
            int r6 = r4.q
            tb.bk9 r7 = r4.n
            r7.getClass()
            if (r5 < r6) goto L_0x00bf
            r4.s = r1
            goto L_0x00bf
        L_0x0078:
            int r6 = r6 + (-1)
            goto L_0x003a
        L_0x007b:
            int r6 = r9.getChildCount()
            if (r0 >= r6) goto L_0x00bf
            android.view.View r6 = r9.getChildAt(r0)
            int r7 = r9.getPosition(r6)
            int r8 = r4.o
            if (r7 <= r8) goto L_0x00bd
            int r5 = r5.g(r6)
            com.alibaba.android.ultron.ext.vlayout.a r6 = r9.k(r7)
            boolean r7 = r6 instanceof tb.afn
            if (r7 == 0) goto L_0x00a1
            tb.afn r6 = (tb.afn) r6
            int r6 = r6.h0(r9)
        L_0x009f:
            int r5 = r5 - r6
            goto L_0x00b1
        L_0x00a1:
            boolean r7 = r6 instanceof tb.z3i
            if (r7 == 0) goto L_0x00b1
            tb.z3i r6 = (tb.z3i) r6
            int r7 = r6.F()
            int r5 = r5 - r7
            int r6 = r6.H()
            goto L_0x009f
        L_0x00b1:
            int r6 = r4.q
            tb.bk9 r7 = r4.n
            r7.getClass()
            if (r5 < r6) goto L_0x00bf
            r4.s = r1
            goto L_0x00bf
        L_0x00bd:
            int r0 = r0 + r1
            goto L_0x007b
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lnq.h0(tb.gfl, androidx.recyclerview.widget.RecyclerView$Recycler, int, int, com.alibaba.android.ultron.ext.vlayout.b):void");
    }

    public final void i0(gfl gflVar, RecyclerView.Recycler recycler, int i, int i2, b bVar) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        View view;
        int i12;
        int i13;
        int i14;
        int H;
        int G;
        int i15 = 0;
        int i16 = -1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83be4b1", new Object[]{this, gflVar, recycler, new Integer(i), new Integer(i2), bVar});
            return;
        }
        boolean z2 = this.p;
        if ((!z2 || i2 < this.o) && (z2 || i > this.o)) {
            bVar.e(this.r);
            bVar.h(this.r);
            this.r = null;
            return;
        }
        int e = gflVar.e(this.r);
        if (bVar.getOrientation() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.n.getClass();
        this.n.getClass();
        if (z) {
            if (bVar.n()) {
                i10 = bVar.getContentWidth() - bVar.getPaddingRight();
                i9 = i10 - gflVar.f(this.r);
            } else {
                i9 = bVar.getPaddingLeft();
                i10 = gflVar.f(this.r) + i9;
            }
            if (this.p) {
                i13 = bVar.getChildCount() - 1;
                view = null;
                while (i13 >= 0) {
                    view = bVar.getChildAt(i13);
                    int position = bVar.getPosition(view);
                    if (position < this.o) {
                        i14 = gflVar.d(view);
                        a k = bVar.k(position);
                        if (k instanceof afn) {
                            G = ((afn) k).g0(bVar);
                        } else {
                            if (k instanceof z3i) {
                                z3i z3iVar = (z3i) k;
                                i14 += z3iVar.D();
                                G = z3iVar.G();
                            }
                            i11 = i14 + e;
                            this.s = true;
                            i12 = i14;
                            i16 = i13;
                        }
                        i14 += G;
                        i11 = i14 + e;
                        this.s = true;
                        i12 = i14;
                        i16 = i13;
                    } else {
                        i13--;
                    }
                }
                i12 = 0;
                i11 = 0;
            } else {
                view = null;
                for (int i17 = 0; i17 < bVar.getChildCount(); i17++) {
                    view = bVar.getChildAt(i17);
                    int position2 = bVar.getPosition(view);
                    if (position2 > this.o) {
                        int g = gflVar.g(view);
                        a k2 = bVar.k(position2);
                        if (k2 instanceof afn) {
                            H = ((afn) k2).h0(bVar);
                        } else {
                            if (k2 instanceof z3i) {
                                z3i z3iVar2 = (z3i) k2;
                                g -= z3iVar2.F();
                                H = z3iVar2.H();
                            }
                            i11 = g;
                            i14 = i11 - e;
                            i13 = i17 + 1;
                            this.s = true;
                            i12 = i14;
                            i16 = i13;
                        }
                        g -= H;
                        i11 = g;
                        i14 = i11 - e;
                        i13 = i17 + 1;
                        this.s = true;
                        i12 = i14;
                        i16 = i13;
                    }
                }
                i12 = 0;
                i11 = 0;
            }
            if (view == null || i16 < 0) {
                this.s = false;
            }
            if (bVar.getReverseLayout() || !this.p) {
                if (i11 > gflVar.i() - this.q) {
                    this.s = false;
                }
            } else if (i12 < gflVar.k() + this.q) {
                this.s = false;
            }
            if (!this.s) {
                if (bVar.getReverseLayout() || !this.p) {
                    i11 = gflVar.i() - this.q;
                    i12 = i11 - e;
                } else {
                    i12 = gflVar.k() + this.q;
                    i11 = i12 + e;
                }
            }
            i3 = i16;
            i6 = i12;
            i4 = i11;
            i5 = i10;
            i7 = i9;
        } else {
            int paddingTop = bVar.getPaddingTop();
            int f = gflVar.f(this.r) + paddingTop;
            if (this.s) {
                if (this.p) {
                    for (int childCount = bVar.getChildCount() - 1; childCount >= 0; childCount--) {
                        View childAt = bVar.getChildAt(childCount);
                        if (bVar.getPosition(childAt) < this.o) {
                            i15 = gflVar.d(childAt);
                            i8 = i15 + e;
                            break;
                        }
                    }
                    i8 = 0;
                    i5 = i8;
                    i4 = f;
                    i3 = -1;
                    i6 = paddingTop;
                    i7 = i15;
                } else {
                    for (int i18 = 0; i18 < bVar.getChildCount(); i18++) {
                        View childAt2 = bVar.getChildAt(i18);
                        if (bVar.getPosition(childAt2) > this.o) {
                            int g2 = gflVar.g(childAt2);
                            i15 = g2 - e;
                            i8 = g2;
                            break;
                        }
                    }
                    i8 = 0;
                    i5 = i8;
                    i4 = f;
                    i3 = -1;
                    i6 = paddingTop;
                    i7 = i15;
                }
            } else if (bVar.getReverseLayout() || !this.p) {
                int i19 = gflVar.i() - this.q;
                i5 = i19;
                i6 = paddingTop;
                i4 = f;
                i3 = -1;
                i7 = i19 - e;
            } else {
                int k3 = gflVar.k() + this.q;
                i5 = e + k3;
                i6 = paddingTop;
                i4 = f;
                i3 = -1;
                i7 = k3;
            }
        }
        Z(this.r, i7, i6, i5, i4, bVar);
        if (!this.s) {
            bVar.b(this.r);
            bVar.l(this.r);
        } else if (i3 >= 0) {
            if (this.r.getParent() == null) {
                bVar.d(this.r, i3);
            }
            this.r = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(tb.gfl r11, androidx.recyclerview.widget.RecyclerView.Recycler r12, int r13, int r14, com.alibaba.android.ultron.ext.vlayout.b r15) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lnq.j0(tb.gfl, androidx.recyclerview.widget.RecyclerView$Recycler, int, int, com.alibaba.android.ultron.ext.vlayout.b):void");
    }

    public boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a109492e", new Object[]{this})).booleanValue();
        }
        return true ^ this.s;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public View l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("72e2824c", new Object[]{this});
        }
        return this.r;
    }

    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b976b8e7", new Object[]{this, new Integer(i)});
        } else {
            this.q = i;
        }
    }

    public void m0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5fbe356", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
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

    public lnq(boolean z) {
        this.o = -1;
        this.q = 0;
        this.r = null;
        this.s = false;
        this.p = z;
        z(1);
    }
}
