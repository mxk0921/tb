package tb;

import android.graphics.Rect;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ffn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ffn<T extends ffn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public zen<Integer> f19255a;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View l;
    public final ArrayMap<zen<Integer>, T> b = new ArrayMap<>();
    public final Rect k = new Rect();

    static {
        t2o.a(156238004);
    }

    public ffn(sw1 sw1Var) {
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee5420b", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de8e620c", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ae65fd3", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("111699fc", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f2526fb", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public zen<Integer> H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zen) ipChange.ipc$dispatch("9e61f991", new Object[]{this});
        }
        return this.f19255a;
    }

    public int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33abcd34", new Object[]{this})).intValue();
        }
        return this.i + this.j;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b040477f", new Object[]{this})).intValue();
        }
        return this.e + this.f;
    }

    public final void K(b bVar, ffn<T> ffnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384608b3", new Object[]{this, bVar, ffnVar});
            return;
        }
        int size = ffnVar.b.size();
        for (int i = 0; i < size; i++) {
            T valueAt = ffnVar.b.valueAt(i);
            if (!valueAt.M()) {
                K(bVar, valueAt);
            }
            View view = valueAt.l;
            if (view != null) {
                bVar.i(view);
            }
        }
    }

    public final void L(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c46f9e", new Object[]{this, bVar});
        } else if (Q()) {
            K(bVar, this);
            View view = this.l;
            if (view != null) {
                bVar.i(view);
            }
        }
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd81980f", new Object[]{this})).booleanValue();
        }
        return this.b.isEmpty();
    }

    public boolean N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfd605d1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        zen<Integer> zenVar = this.f19255a;
        if (zenVar == null || zenVar.d().intValue() != i) {
            return false;
        }
        return true;
    }

    public boolean O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("358424d7", new Object[]{this, new Integer(i)})).booleanValue();
        }
        zen<Integer> zenVar = this.f19255a;
        if (zenVar == null || zenVar.e().intValue() != i) {
            return false;
        }
        return true;
    }

    public boolean P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d623d5e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        zen<Integer> zenVar = this.f19255a;
        if (zenVar == null || !zenVar.a(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public final boolean R(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b145d2e2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public void S(View view, int i, int i2, int i3, int i4, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4726e66", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bVar, new Boolean(z)});
            return;
        }
        bVar.f(view, i, i2, i3, i4);
        e(i, i2, i3, i4, z);
    }

    public void T(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966b48a", new Object[]{this, bVar});
        } else {
            d(bVar, this);
        }
    }

    public final void U(b bVar, ffn<T> ffnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8657ff", new Object[]{this, bVar, ffnVar});
            return;
        }
        if (!ffnVar.M()) {
            int size = ffnVar.b.size();
            for (int i = 0; i < size; i++) {
                U(bVar, ffnVar.b.valueAt(i));
            }
        }
        View view = ffnVar.l;
        if (view != null) {
            bVar.e(view);
            ffnVar.l = null;
        }
    }

    public final boolean V(ffn<T> ffnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("898ec59e", new Object[]{this, ffnVar})).booleanValue();
        }
        ffnVar.getClass();
        int size = ffnVar.b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            T valueAt = ffnVar.b.valueAt(i);
            if (valueAt.M()) {
                return valueAt.W();
            }
            z |= V(valueAt);
        }
        return z;
    }

    public boolean W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594a72bf", new Object[]{this})).booleanValue();
        }
        if (!M()) {
            return V(this);
        }
        return false;
    }

    public void X(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed713e77", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.g = i;
        this.i = i2;
        this.h = i3;
        this.j = i4;
    }

    public void Y(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.c = i;
        this.d = i3;
        this.e = i2;
        this.f = i4;
    }

    public void Z(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9230e2", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f19255a = zen.c(Integer.valueOf(i), Integer.valueOf(i2));
        if (!this.b.isEmpty()) {
            SimpleArrayMap<? extends zen<Integer>, ? extends T> simpleArrayMap = new SimpleArrayMap<>();
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                T valueAt = this.b.valueAt(i3);
                int C = valueAt.C() + i;
                int B = valueAt.B() + i;
                simpleArrayMap.put(zen.c(Integer.valueOf(C), Integer.valueOf(B)), valueAt);
                valueAt.Z(C, B);
            }
            this.b.clear();
            this.b.putAll(simpleArrayMap);
        }
    }

    public void a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, b bVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
            return;
        }
        if (!M()) {
            int size = this.b.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.b.valueAt(i4).a(recycler, state, i, i2, i3, bVar);
            }
        }
        if (W()) {
            if (R(i3) && (view = this.l) != null) {
                this.k.union(view.getLeft(), this.l.getTop(), this.l.getRight(), this.l.getBottom());
            }
            if (!this.k.isEmpty()) {
                if (R(i3)) {
                    if (bVar.getOrientation() == 1) {
                        this.k.offset(0, -i3);
                    } else {
                        this.k.offset(-i3, 0);
                    }
                }
                a0(this);
                int contentWidth = bVar.getContentWidth();
                int contentHeight = bVar.getContentHeight();
                if (bVar.getOrientation() != 1 ? !this.k.intersects((-contentWidth) / 4, 0, contentWidth + (contentWidth / 4), contentHeight) : !this.k.intersects(0, (-contentHeight) / 4, contentWidth, contentHeight + (contentHeight / 4))) {
                    this.k.set(0, 0, 0, 0);
                    View view2 = this.l;
                    if (view2 != null) {
                        view2.layout(0, 0, 0, 0);
                    }
                    L(bVar);
                } else {
                    if (this.l == null) {
                        View j = bVar.j();
                        this.l = j;
                        bVar.p(j, true);
                    }
                    if (bVar.getOrientation() == 1) {
                        this.k.left = bVar.getPaddingLeft() + m() + g();
                        this.k.right = ((bVar.getContentWidth() - bVar.getPaddingRight()) - n()) - h();
                    } else {
                        this.k.top = bVar.getPaddingTop() + o() + i();
                        this.k.bottom = ((bVar.getContentWidth() - bVar.getPaddingBottom()) - l()) - f();
                    }
                    c(this.l);
                    L(bVar);
                    return;
                }
            }
        }
        L(bVar);
        if (Q()) {
            U(bVar, this);
        }
    }

    public final void a0(ffn<T> ffnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19ff235", new Object[]{this, ffnVar});
        } else if (!ffnVar.M()) {
            int size = ffnVar.b.size();
            for (int i = 0; i < size; i++) {
                T valueAt = ffnVar.b.valueAt(i);
                a0(valueAt);
                View view = valueAt.l;
                if (view != null) {
                    ffnVar.k.union(view.getLeft(), valueAt.l.getTop(), valueAt.l.getRight(), valueAt.l.getBottom());
                }
            }
        }
    }

    public void b(RecyclerView.Recycler recycler, RecyclerView.State state, b bVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f918b9", new Object[]{this, recycler, state, bVar});
            return;
        }
        if (!M()) {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                this.b.valueAt(i).b(recycler, state, bVar);
            }
        }
        if (!W() && (view = this.l) != null) {
            bVar.e(view);
            this.l = null;
        }
    }

    public void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0bd365f", new Object[]{this, view});
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(this.k.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.k.height(), 1073741824));
        Rect rect = this.k;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        view.setBackgroundColor(0);
        this.k.set(0, 0, 0, 0);
    }

    public final void d(b bVar, ffn<T> ffnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecf0738", new Object[]{this, bVar, ffnVar});
            return;
        }
        View view = ffnVar.l;
        if (view != null) {
            bVar.e(view);
            ffnVar.l = null;
        }
        if (!ffnVar.b.isEmpty()) {
            int size = ffnVar.b.size();
            for (int i = 0; i < size; i++) {
                d(bVar, ffnVar.b.valueAt(i));
            }
        }
    }

    public void e(int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b69032c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        } else if (z) {
            this.k.union((i - this.c) - this.g, (i2 - this.e) - this.i, i3 + this.d + this.h, i4 + this.f + this.j);
        } else {
            this.k.union(i - this.c, i2 - this.e, i3 + this.d, i4 + this.f);
        }
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6690dbcd", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cfca1da9", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e218ee", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("227c09a7", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d02d0fe6", new Object[]{this})).intValue();
        }
        return v();
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3e75b0d", new Object[]{this})).intValue();
        }
        return w();
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c17fed", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("461549c9", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9fc70ce", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e0ad987", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("820508dc", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d344278", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46bc8dff", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("41e28ef8", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3058338", new Object[]{this})).intValue();
        }
        return I();
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c1d51fb", new Object[]{this})).intValue();
        }
        return J();
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d068cae2", new Object[]{this})).intValue();
        }
        return this.g + this.h;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab22ff91", new Object[]{this})).intValue();
        }
        return this.c + this.d;
    }

    public int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f2a18e9", new Object[]{this})).intValue();
        }
        return this.j;
    }

    public int y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ddec852", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public ffn() {
    }
}
