package tb;

import android.graphics.RectF;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class jvn extends e22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297408);
    }

    public jvn(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(jvn jvnVar, String str, Object... objArr) {
        if (str.hashCode() == 1558588043) {
            super.b((lvn) objArr[0], (List) objArr[1], (lvn) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/RegionDragTouch");
    }

    @Override // tb.s1e
    public boolean c(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeecbc2", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        zi9 zi9Var = sparseArray.get(0);
        if (!r(zi9Var)) {
            return false;
        }
        if (lvnVar == null) {
            rectF = null;
        } else {
            rectF = lvnVar.k();
        }
        if (rectF == null) {
            return false;
        }
        g(f22.a(), rectF);
        return f22.a().contains(zi9Var.f(), zi9Var.g());
    }

    @Override // tb.s1e
    public boolean e(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b786c5", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        if (lvnVar == null || lvnVar2 == null) {
            return false;
        }
        if (!ckf.b(lvnVar, lvnVar2)) {
            lvnVar.n();
        }
        zi9 zi9Var = sparseArray.get(0);
        if (zi9Var == null) {
            return false;
        }
        lvnVar.j().offset(zi9Var.i() / n(), zi9Var.j() / h());
        s(lvnVar.j());
        return true;
    }

    @Override // tb.s1e
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 4;
    }

    public final void s(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679e2f14", new Object[]{this, rectF});
            return;
        }
        float f = rectF.left;
        if (f < 0.0f) {
            rectF.offset(-f, 0.0f);
        } else {
            float f2 = rectF.right;
            if (f2 > 1.0f) {
                rectF.offset(1.0f - f2, 0.0f);
            }
        }
        float f3 = rectF.top;
        if (f3 < 0.0f) {
            rectF.offset(0.0f, -f3);
            return;
        }
        float f4 = rectF.bottom;
        if (f4 > 1.0f) {
            rectF.offset(0.0f, 1.0f - f4);
        }
    }

    @Override // tb.e22, tb.s1e
    public void b(lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        eid p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ce62a8b", new Object[]{this, lvnVar, list, lvnVar2});
            return;
        }
        super.b(lvnVar, list, lvnVar2);
        if (lvnVar2 != null && lvnVar != null) {
            if (!ckf.b(lvnVar, lvnVar2) && (p = p()) != null) {
                p.setSelfDefinedSelected();
            }
            ph7 o = o();
            if (o != null) {
                o.e(lvnVar2.j(), null);
            }
            jzu.e("itemBoxDrag", new String[0]);
        }
    }
}
