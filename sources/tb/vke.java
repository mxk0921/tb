package tb;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vke extends eu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final RectF d = new RectF();
    public final RectF e = new RectF();

    static {
        t2o.a(481297402);
    }

    public vke(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(vke vkeVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/ImageDragTouchV2");
    }

    public void A() {
        float f;
        View holderView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("418e935b", new Object[]{this});
            return;
        }
        eid p = p();
        if (p != null) {
            ArrayList arrayList = new ArrayList(2);
            t(arrayList, n(), u(), i(), true, p);
            float l = l();
            eid p2 = p();
            if (!(p2 == null || (holderView = p2.getHolderView()) == null)) {
                i = holderView.getTop();
            }
            float b = hfn.b(l, i + p.getDragTopEdgeLimit());
            float dragBottomEdgeLimit = p.getDragBottomEdgeLimit();
            float j = j();
            if (dragBottomEdgeLimit > 0.0f) {
                f = hfn.e(j, dragBottomEdgeLimit);
            } else {
                f = j;
            }
            w(arrayList, b, f, h(), m(), p);
            if (!arrayList.isEmpty()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.start();
                v(animatorSet);
            }
        }
    }

    @Override // tb.s1e
    public boolean c(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeecbc2", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        return r(sparseArray.get(0));
    }

    @Override // tb.s1e
    public boolean e(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b786c5", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        zi9 zi9Var = sparseArray.get(0);
        if (zi9Var == null) {
            return false;
        }
        z(zi9Var.i(), zi9Var.j(), true);
        return true;
    }

    @Override // tb.s1e
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 2;
    }

    public final void w(List<Animator> list, float f, float f2, float f3, float f4, eid eidVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4375157", new Object[]{this, list, new Float(f), new Float(f2), new Float(f3), new Float(f4), eidVar});
        } else {
            s(list, f4, f4 + f3, f, f2, false, eidVar);
        }
    }

    public final void x(RectF rectF, float f, float f2, float f3, pvn pvnVar, float f4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3c84e1", new Object[]{this, rectF, new Float(f), new Float(f2), new Float(f3), pvnVar, new Float(f4), new Boolean(z)});
            return;
        }
        if (z) {
            if (pvnVar.e(rectF) + f4 > f2) {
                if (pvnVar.e(rectF) < f2) {
                    f4 += pvnVar.e(rectF) - f2;
                    pvnVar.d(rectF, f2);
                }
                f4 *= f;
            } else if (pvnVar.b(rectF) + f4 < f3) {
                if (pvnVar.b(rectF) > f3) {
                    f4 += pvnVar.b(rectF) - f3;
                    pvnVar.c(rectF, f3);
                }
                f4 *= f;
            }
        }
        pvnVar.a(rectF, f4);
    }

    public final void y(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cff4212", new Object[]{this, rectF});
            return;
        }
        float i = i();
        float m = m();
        rectF.set(i, m, n() + i, h() + m);
    }

    public final void z(float f, float f2, boolean z) {
        float f3;
        View holderView;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb029da3", new Object[]{this, new Float(f), new Float(f2), new Boolean(z)});
            return;
        }
        eid p = p();
        if (p != null) {
            y(this.d);
            this.e.set(this.d);
            x(this.e, 0.3f, k(), u(), wke.a(), f, z);
            float l = l();
            eid p2 = p();
            if (!(p2 == null || (holderView = p2.getHolderView()) == null)) {
                i = holderView.getTop();
            }
            float b = hfn.b(l, i + p.getDragTopEdgeLimit());
            float dragBottomEdgeLimit = p.getDragBottomEdgeLimit();
            float j = j();
            if (dragBottomEdgeLimit > 0.0f) {
                f3 = hfn.e(j, dragBottomEdgeLimit);
            } else {
                f3 = j;
            }
            x(this.e, 0.3f, b, f3, wke.b(), f2, z);
            if (this.d.left != this.e.left) {
                eid p3 = p();
                ckf.d(p3);
                p.setImageTranslationX((p3.getImageView().getTranslationX() + this.e.left) - this.d.left);
            }
            if (this.d.top != this.e.top) {
                eid p4 = p();
                ckf.d(p4);
                p.setImageTranslationY((p4.getImageView().getTranslationY() + this.e.top) - this.d.top);
            }
        }
    }

    @Override // tb.e22, tb.s1e
    public void b(lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce62a8b", new Object[]{this, lvnVar, list, lvnVar2});
            return;
        }
        A();
        jzu.e("picDrag", new String[0]);
    }
}
