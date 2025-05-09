package tb;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ch extends at {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View[] p;
    public float[] n = new float[0];
    public int o = 0;
    public int q = 0;

    static {
        t2o.a(80740609);
    }

    public ch(int i) {
        z(i);
    }

    public static /* synthetic */ Object ipc$super(ch chVar, String str, Object... objArr) {
        if (str.hashCode() == 1372393155) {
            return new Integer(super.j(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue(), ((Boolean) objArr[2]).booleanValue(), (b) objArr[3]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAColumnLayoutHelper");
    }

    public final void i0(View view, int i, int i2, int i3, vig vigVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeef8c17", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), vigVar, bVar});
        } else if (view != null) {
            gfl g = bVar.g();
            int i4 = this.q + i;
            int f = i4 + g.f(view);
            h0(view, vigVar, bVar, i2, i4, i2 + i3, f, false);
            this.q = f;
        }
    }

    @Override // tb.z3i, com.alibaba.android.ultron.ext.vlayout.a
    public int j(int i, boolean z, boolean z2, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
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
                if (z3) {
                    i4 = this.i;
                    i5 = this.e;
                } else {
                    i4 = this.g;
                    i5 = this.c;
                }
                return i4 + i5;
            }
        } else if (i == 0) {
            if (z3) {
                i2 = -this.h;
                i3 = this.d;
            } else {
                i2 = -this.f;
                i3 = this.b;
            }
            return i2 - i3;
        }
        return super.j(i, z, z2, bVar);
    }

    public final void j0(View view, b bVar, int i, boolean z) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c43d592e", new Object[]{this, view, bVar, new Integer(i), new Boolean(z)});
            return;
        }
        VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
        float[] fArr = this.n;
        int length = fArr.length - i;
        float f2 = 0.0f;
        if (length > 0) {
            if (!z) {
                i = length - 1;
            }
            f = fArr[i];
        } else {
            f = 0.0f;
        }
        if (f >= 0.0f) {
            if (f > 100.0f) {
                f2 = 100.0f;
            } else {
                f2 = f;
            }
        }
        int contentWidth = ((((bVar.getContentWidth() - bVar.getPaddingLeft()) - bVar.getPaddingRight()) - B()) - C()) - ((m() - 1) * this.o);
        int i2 = (int) ((contentWidth * f2) / 100.0f);
        int q = bVar.q(contentWidth, i2, false);
        int q2 = bVar.q((((bVar.getContentHeight() - bVar.getPaddingTop()) - bVar.getPaddingBottom()) - I()) - J(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        ((ViewGroup.MarginLayoutParams) layoutParams).width = i2;
        bVar.measureChild(view, q, q2);
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b50ee28", new Object[]{this});
            return;
        }
        View[] viewArr = this.p;
        if (viewArr != null) {
            Arrays.fill(viewArr, (Object) null);
        }
        this.q = 0;
    }

    public void l0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78b9e5", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void m0(float[] fArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ad4a0b", new Object[]{this, fArr});
        } else if (fArr != null) {
            this.n = Arrays.copyOf(fArr, fArr.length);
        } else {
            this.n = new float[0];
        }
    }

    @Override // tb.sw1
    public void b0(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, b bVar) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272ad6d", new Object[]{this, recycler, state, fVar, vigVar, bVar});
            return;
        }
        int c = fVar.c();
        if (!p(c)) {
            if (!g0(bVar)) {
                ck.g().f("只支持垂直方向的布局", ck.b.b().l("AURAColumnLayoutHelper").a());
                return;
            }
            boolean z = fVar.f() == 1;
            zen<Integer> n = n();
            if (!z ? c == n.e().intValue() : c == n.d().intValue()) {
                int m = m();
                View[] viewArr = this.p;
                if (viewArr == null || m != viewArr.length) {
                    this.p = new View[m];
                }
                int f0 = f0(this.p, recycler, fVar, bVar);
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < f0; i4++) {
                    View view = this.p[i4];
                    if (view != null) {
                        bVar.v(fVar, view);
                        j0(view, bVar, i4, z);
                        i3 = Math.max(i3, bVar.g().e(view));
                    }
                }
                vigVar.f30032a = F() + i3 + D();
                if (z) {
                    int g = fVar.g() + F();
                    for (int i5 = 0; i5 < f0; i5++) {
                        if (i5 == 0) {
                            i2 = E();
                        } else {
                            i2 = this.o;
                        }
                        i0(this.p[i5], i2, g, i3, vigVar, bVar);
                    }
                } else {
                    int g2 = (fVar.g() - i3) - D();
                    int i6 = f0 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        if (i6 == 0) {
                            i = E();
                        } else {
                            i = this.o;
                        }
                        i0(this.p[i7], i, g2, i3, vigVar, bVar);
                    }
                }
            }
            k0();
        }
    }
}
