package tb;

import android.graphics.RectF;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class uz1 extends e22 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297392);
    }

    public uz1(ph7 ph7Var) {
        super(ph7Var);
    }

    public static /* synthetic */ Object ipc$super(uz1 uz1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/regionedit/touch/BaseRegionTouch");
    }

    public void s(zi9 zi9Var, lvn lvnVar, nqk nqkVar, nqk nqkVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98e531", new Object[]{this, zi9Var, lvnVar, nqkVar, nqkVar2});
            return;
        }
        ckf.g(zi9Var, "fingerPos");
        ckf.g(lvnVar, "selectedObject");
        if (nqkVar != null) {
            float i = zi9Var.i() / n();
            RectF j = lvnVar.j();
            float c = vz1.c();
            eid p = p();
            ckf.d(p);
            nqkVar.a(j, i, c / p.getImageView().getWidth());
        }
        if (nqkVar2 != null) {
            float j2 = zi9Var.j() / h();
            RectF j3 = lvnVar.j();
            float c2 = vz1.c();
            eid p2 = p();
            ckf.d(p2);
            nqkVar2.a(j3, j2, c2 / p2.getImageView().getHeight());
        }
    }
}
