package tb;

import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class juf extends JobSupport implements t94 {
    public final boolean e = r1();

    public juf(m mVar) {
        super(true);
        y0(mVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean l0() {
        return this.e;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean p0() {
        return true;
    }

    public final boolean r1() {
        ir3 ir3Var;
        ir3 ir3Var2;
        hr3 t0 = t0();
        if (t0 instanceof ir3) {
            ir3Var = (ir3) t0;
        } else {
            ir3Var = null;
        }
        if (ir3Var != null) {
            JobSupport q = ir3Var.q();
            while (!q.l0()) {
                hr3 t02 = q.t0();
                if (t02 instanceof ir3) {
                    ir3Var2 = (ir3) t02;
                } else {
                    ir3Var2 = null;
                }
                if (ir3Var2 != null) {
                    q = ir3Var2.q();
                }
            }
            return true;
        }
        return false;
    }
}
