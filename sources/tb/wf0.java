package tb;

import android.graphics.RectF;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class wf0 extends uz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int c = zb7.a(10.0f);
    public int d;

    static {
        t2o.a(481297389);
    }

    public wf0(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(wf0 wf0Var, String str, Object... objArr) {
        if (str.hashCode() == 1558588043) {
            super.b((lvn) objArr[0], (List) objArr[1], (lvn) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/AdjustEdgeTouch");
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
        g(f22.a(), lvnVar.k());
        zi9 zi9Var = sparseArray.get(0);
        ckf.f(zi9Var, "fingerArray[0]");
        return t(zi9Var, f22.a());
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
        int i = this.d;
        if (i == 1) {
            s(zi9Var, lvnVar, null, vz1.e());
        } else if (i == 2) {
            s(zi9Var, lvnVar, vz1.b(), null);
        } else if (i == 3) {
            s(zi9Var, lvnVar, vz1.d(), null);
        } else if (i == 4) {
            s(zi9Var, lvnVar, null, vz1.a());
        }
        return true;
    }

    @Override // tb.s1e
    public int getState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("830709d5", new Object[]{this})).intValue();
        }
        return 6;
    }

    public final boolean t(zi9 zi9Var, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a91ddb11", new Object[]{this, zi9Var, rectF})).booleanValue();
        }
        float f = rectF.left;
        float f2 = rectF.top;
        int i = this.c;
        if (q(zi9Var, f, f2 - i, rectF.right, f2 + i)) {
            this.d = 1;
            return true;
        }
        float f3 = rectF.left;
        int i2 = this.c;
        if (q(zi9Var, f3 - i2, rectF.top, f3 + i2, rectF.bottom)) {
            this.d = 2;
            return true;
        }
        float f4 = rectF.left;
        float f5 = rectF.bottom;
        int i3 = this.c;
        if (q(zi9Var, f4, f5 - i3, rectF.right, f5 + i3)) {
            this.d = 4;
            return true;
        }
        float f6 = rectF.right;
        int i4 = this.c;
        if (!q(zi9Var, f6 - i4, rectF.top, f6 + i4, rectF.bottom)) {
            return false;
        }
        this.d = 3;
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
            jzu.e("itemBoxEdgeAdjust", new String[0]);
        }
    }
}
