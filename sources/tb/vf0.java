package tb;

import android.graphics.RectF;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class vf0 extends uz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int c;
    public final int d = zb7.a(17.0f);

    static {
        t2o.a(481297387);
    }

    public vf0(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(vf0 vf0Var, String str, Object... objArr) {
        if (str.hashCode() == 1558588043) {
            super.b((lvn) objArr[0], (List) objArr[1], (lvn) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/AdjustCornerTouch");
    }

    @Override // tb.s1e
    public boolean c(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeecbc2", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        if (sparseArray.size() != 1 || lvnVar == null || !r(sparseArray.get(0))) {
            return false;
        }
        zi9 zi9Var = sparseArray.get(0);
        ckf.f(zi9Var, "fingerArray[0]");
        return t(zi9Var, lvnVar);
    }

    @Override // tb.s1e
    public boolean e(SparseArray<zi9> sparseArray, lvn lvnVar, List<lvn> list, lvn lvnVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b786c5", new Object[]{this, sparseArray, lvnVar, list, lvnVar2})).booleanValue();
        }
        ckf.g(sparseArray, "fingerArray");
        zi9 zi9Var = sparseArray.get(0);
        if (zi9Var == null || lvnVar2 == null || lvnVar == null) {
            return false;
        }
        if (!ckf.b(lvnVar, lvnVar2)) {
            lvnVar.n();
        }
        int i = this.c;
        if (i == 1) {
            s(zi9Var, lvnVar, vz1.b(), vz1.e());
        } else if (i == 2) {
            s(zi9Var, lvnVar, vz1.d(), vz1.e());
        } else if (i == 3) {
            s(zi9Var, lvnVar, vz1.b(), vz1.a());
        } else if (i == 4) {
            s(zi9Var, lvnVar, vz1.d(), vz1.a());
        }
        return true;
    }

    @Override // tb.s1e
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 5;
    }

    public final boolean t(zi9 zi9Var, lvn lvnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98feb95c", new Object[]{this, zi9Var, lvnVar})).booleanValue();
        }
        RectF k = lvnVar.k();
        if (k == null) {
            return false;
        }
        g(f22.a(), k);
        RectF a2 = f22.a();
        float f = a2.left;
        int i = this.d;
        float f2 = f - i;
        float f3 = a2.top;
        if (q(zi9Var, f2, f3 - i, f + i, f3 + i)) {
            this.c = 1;
            return true;
        }
        float f4 = a2.right;
        int i2 = this.d;
        float f5 = f4 - i2;
        float f6 = a2.top;
        if (q(zi9Var, f5, f6 - i2, f4 + i2, f6 + i2)) {
            this.c = 2;
            return true;
        }
        float f7 = a2.left;
        int i3 = this.d;
        float f8 = f7 - i3;
        float f9 = a2.bottom;
        if (q(zi9Var, f8, f9 - i3, f7 + i3, f9 + i3)) {
            this.c = 3;
            return true;
        }
        float f10 = a2.right;
        int i4 = this.d;
        float f11 = a2.bottom;
        if (!q(zi9Var, f10 - i4, f11 - i4, f10 + i4, f11 + i4)) {
            return false;
        }
        this.c = 4;
        return true;
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
            jzu.e("itemBoxCornerAdjust", new String[0]);
        }
    }
}
