package tb;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.ultron.ext.vlayout.VirtualLayoutManager;
import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class sw1 extends z3i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View k;
    public final Rect j = new Rect();
    public final float l = Float.NaN;
    public int m = 0;

    static {
        t2o.a(156237978);
    }

    public static /* synthetic */ Object ipc$super(sw1 sw1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/BaseLayoutHelper");
    }

    public void Q(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0bd365f", new Object[]{this, view});
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(this.j.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.j.height(), 1073741824));
        Rect rect = this.j;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        view.setBackgroundColor(0);
        this.j.set(0, 0, 0, 0);
    }

    public int S(b bVar, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d99ed469", new Object[]{this, bVar, new Boolean(z), new Boolean(z2), new Boolean(z3)})).intValue();
        }
        if (z) {
            i = this.i;
            i2 = this.e;
        } else {
            i = this.f;
            i2 = this.b;
        }
        return i + i2;
    }

    public int T(b bVar, boolean z, boolean z2, boolean z3) {
        a aVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5f132b0", new Object[]{this, bVar, new Boolean(z), new Boolean(z2), new Boolean(z3)})).intValue();
        }
        z3i z3iVar = null;
        if (bVar instanceof VirtualLayoutManager) {
            aVar = ((VirtualLayoutManager) bVar).l0(this, z2);
        } else {
            aVar = null;
        }
        if (aVar != null && (aVar instanceof z3i)) {
            z3iVar = (z3i) aVar;
        }
        if (aVar == this) {
            return 0;
        }
        if (!z3) {
            if (z) {
                i9 = this.h;
                i10 = this.d;
            } else {
                i9 = this.f;
                i10 = this.b;
            }
            return i9 + i10;
        }
        if (z3iVar == null) {
            if (z) {
                i7 = this.h;
                i8 = this.d;
            } else {
                i7 = this.f;
                i8 = this.b;
            }
            i = i7 + i8;
        } else if (z) {
            if (z2) {
                i5 = z3iVar.i;
                i6 = this.h;
            } else {
                i5 = z3iVar.h;
                i6 = this.i;
            }
            i = a(i5, i6);
        } else {
            if (z2) {
                i3 = z3iVar.g;
                i4 = this.f;
            } else {
                i3 = z3iVar.f;
                i4 = this.g;
            }
            i = a(i3, i4);
        }
        if (z) {
            if (z2) {
                i2 = this.d;
            } else {
                i2 = this.e;
            }
        } else if (z2) {
            i2 = this.b;
        } else {
            i2 = this.c;
        }
        return i + i2;
    }

    public float U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371754", new Object[]{this})).floatValue();
        }
        return this.l;
    }

    public void V(vig vigVar, View view) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82bcf7ef", new Object[]{this, vigVar, view});
        } else if (view != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                vigVar.c = true;
            }
            if (!vigVar.d && !view.isFocusable()) {
                z = false;
            }
            vigVar.d = z;
        }
    }

    public void X(View view, int i, int i2, int i3, int i4, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7f8a2e", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bVar});
        } else {
            Y(view, i, i2, i3, i4, bVar, false);
        }
    }

    public void Y(View view, int i, int i2, int i3, int i4, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4726e66", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bVar, new Boolean(z)});
            return;
        }
        bVar.x(view, i, i2, i3, i4);
        if (!e0()) {
            return;
        }
        if (z) {
            this.j.union((i - this.b) - this.f, (i2 - this.d) - this.h, i3 + this.c + this.g, i4 + this.e + this.i);
        } else {
            this.j.union(i - this.b, i2 - this.d, i3 + this.c, i4 + this.e);
        }
    }

    public void Z(View view, int i, int i2, int i3, int i4, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac7dbfa", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bVar});
        } else {
            a0(view, i, i2, i3, i4, bVar, false);
        }
    }

    public final int a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6431fd42", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (i < i2) {
            return i2 - i;
        }
        return 0;
    }

    public void a0(View view, int i, int i2, int i3, int i4, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae34561a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), bVar, new Boolean(z)});
            return;
        }
        bVar.f(view, i, i2, i3, i4);
        if (!e0()) {
            return;
        }
        if (z) {
            this.j.union((i - this.b) - this.f, (i2 - this.d) - this.h, i3 + this.c + this.g, i4 + this.e + this.i);
        } else {
            this.j.union(i - this.b, i2 - this.d, i3 + this.c, i4 + this.e);
        }
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b145d2e2", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i == Integer.MAX_VALUE || i == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public abstract void b0(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, b bVar);

    public final View c0(RecyclerView.Recycler recycler, VirtualLayoutManager.f fVar, b bVar, vig vigVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c1364f79", new Object[]{this, recycler, fVar, bVar, vigVar});
        }
        View l = fVar.l(recycler);
        if (l == null) {
            vigVar.b = true;
            return null;
        }
        bVar.v(fVar, l);
        return l;
    }

    public void d0(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e966b48a", new Object[]{this, bVar});
        }
    }

    public boolean e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("594a72bf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void f(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, b bVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d57ba31", new Object[]{this, recycler, state, new Integer(i), new Integer(i2), new Integer(i3), bVar});
            return;
        }
        if (e0()) {
            if (b(i3) && (view = this.k) != null) {
                this.j.union(view.getLeft(), this.k.getTop(), this.k.getRight(), this.k.getBottom());
            }
            if (!this.j.isEmpty()) {
                if (b(i3)) {
                    if (bVar.getOrientation() == 1) {
                        this.j.offset(0, -i3);
                    } else {
                        this.j.offset(-i3, 0);
                    }
                }
                int contentWidth = bVar.getContentWidth();
                int contentHeight = bVar.getContentHeight();
                if (bVar.getOrientation() != 1 ? !this.j.intersects((-contentWidth) / 4, 0, contentWidth + (contentWidth / 4), contentHeight) : !this.j.intersects(0, (-contentHeight) / 4, contentWidth, contentHeight + (contentHeight / 4))) {
                    this.j.set(0, 0, 0, 0);
                    View view2 = this.k;
                    if (view2 != null) {
                        view2.layout(0, 0, 0, 0);
                    }
                } else {
                    if (this.k == null) {
                        View j = bVar.j();
                        this.k = j;
                        bVar.o(j, true);
                    }
                    if (bVar.getOrientation() == 1) {
                        this.j.left = bVar.getPaddingLeft() + this.f;
                        this.j.right = (bVar.getContentWidth() - bVar.getPaddingRight()) - this.g;
                    } else {
                        this.j.top = bVar.getPaddingTop() + this.h;
                        this.j.bottom = (bVar.getContentWidth() - bVar.getPaddingBottom()) - this.i;
                    }
                    Q(this.k);
                    return;
                }
            }
        }
        View view3 = this.k;
        if (view3 != null) {
            bVar.e(view3);
            this.k = null;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void g(RecyclerView.Recycler recycler, RecyclerView.State state, b bVar) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f918b9", new Object[]{this, recycler, state, bVar});
        } else if (!e0() && (view = this.k) != null) {
            bVar.e(view);
            this.k = null;
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public final void i(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("233c6729", new Object[]{this, bVar});
            return;
        }
        View view = this.k;
        if (view != null) {
            bVar.e(view);
            this.k = null;
        }
        d0(bVar);
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void k(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.f fVar, vig vigVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d20ce4de", new Object[]{this, recycler, state, fVar, vigVar, bVar});
        } else {
            b0(recycler, state, fVar, vigVar, bVar);
        }
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.m;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a143a0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a49022", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }
}
