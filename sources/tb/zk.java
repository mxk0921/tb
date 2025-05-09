package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zk extends at {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View[] n;
    public int o;
    public int p;
    public int q;
    public int r;

    static {
        t2o.a(80740616);
    }

    public zk() {
    }

    public static /* synthetic */ Object ipc$super(zk zkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAOverlayLayoutHelper");
    }

    @Override // tb.sw1
    public void b0(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, b bVar) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272ad6d", new Object[]{this, recycler, state, fVar, vigVar, bVar});
            return;
        }
        int c = fVar.c();
        if (!p(c)) {
            if (fVar.f() == 1) {
                z = true;
            } else {
                z = false;
            }
            zen<Integer> n = n();
            if (!z ? c == n.e().intValue() : c == n.d().intValue()) {
                int m = m();
                View[] viewArr = this.n;
                if (viewArr == null || m != viewArr.length) {
                    this.n = new View[m];
                }
                int f0 = f0(this.n, recycler, fVar, bVar);
                if (z) {
                    int i4 = 0;
                    while (i4 < f0) {
                        View view = this.n[i4];
                        if (view == null) {
                            i3 = i4;
                        } else {
                            if (i4 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            c(view, z3);
                            i0(view, fVar, bVar, f0, i4, z3, z);
                            k0(view, fVar, vigVar, bVar, z3);
                            i3 = i4;
                            h0(view, vigVar, bVar, this.p, this.o, this.r, this.q, true);
                        }
                        i4 = i3 + 1;
                    }
                } else {
                    int i5 = f0 - 1;
                    int i6 = i5;
                    while (i6 >= 0) {
                        View view2 = this.n[i6];
                        if (view2 == null) {
                            i = i6;
                            i2 = i5;
                        } else {
                            if (i5 == i6) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c(view2, z2);
                            i = i6;
                            i0(view2, fVar, bVar, f0, i6, z2, z);
                            k0(view2, fVar, vigVar, bVar, z2);
                            i2 = i5;
                            h0(view2, vigVar, bVar, this.p, this.o, this.r, this.q, true);
                        }
                        i6 = i - 1;
                        i5 = i2;
                    }
                }
            }
            l0();
        }
    }

    public void c(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487ef9d5", new Object[]{this, view, new Boolean(z)});
        }
    }

    public final void i0(View view, VirtualLayoutManager.f fVar, b bVar, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df7bb18e", new Object[]{this, view, fVar, bVar, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z2) {
            i3 = -1;
        } else {
            if (!z) {
                i4 = (i - i2) - 1;
            }
            i3 = i4;
        }
        bVar.r(fVar, view, i3);
    }

    public final void k0(View view, VirtualLayoutManager.f fVar, vig vigVar, b bVar, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61cb7dc6", new Object[]{this, view, fVar, vigVar, bVar, new Boolean(z)});
            return;
        }
        boolean m = bVar.m();
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        if (bVar.getOrientation() == 1) {
            z2 = true;
        }
        int q = bVar.q((((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight()) - B()) - C(), ((ViewGroup.MarginLayoutParams) layoutParams).width, !z2);
        int q2 = bVar.q((((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom()) - I()) - J(), ((ViewGroup.MarginLayoutParams) layoutParams).height, z2);
        if (!m) {
            bVar.measureChildWithMargins(view, q, q2);
        } else {
            bVar.measureChild(view, q, q2);
        }
        if (z) {
            gfl g = bVar.g();
            vigVar.f30032a = g.e(view);
            if (bVar.getOrientation() == 1) {
                int paddingLeft = bVar.getPaddingLeft() + this.f + this.b;
                this.o = paddingLeft;
                this.q = paddingLeft + g.f(view);
                if (fVar.f() == -1) {
                    int g2 = fVar.g();
                    this.r = g2;
                    this.p = g2 - g.e(view);
                    return;
                }
                int g3 = fVar.g();
                this.p = g3;
                this.r = g3 + g.e(view);
                return;
            }
            int paddingTop = bVar.getPaddingTop() + this.h + this.d;
            this.p = paddingTop;
            this.r = paddingTop + g.f(view);
            if (fVar.f() == -1) {
                int g4 = fVar.g();
                this.q = g4;
                this.o = g4 - g.e(view);
                return;
            }
            int g5 = fVar.g();
            this.o = g5;
            this.q = g5 + g.e(view);
        }
    }

    public final void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        View[] viewArr = this.n;
        if (viewArr != null) {
            Arrays.fill(viewArr, (Object) null);
        }
        this.o = 0;
        this.q = 0;
        this.p = 0;
        this.r = 0;
    }

    public zk(int i) {
        z(i);
    }
}
