package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.o6v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class hd0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(350224386);
    }

    public hd0 a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hd0) ipChange.ipc$dispatch("c3d64f53", new Object[]{this, dinamicXEngine});
        }
        id0.b(dinamicXEngine);
        return this;
    }

    public hd0 b(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hd0) ipChange.ipc$dispatch("52ea4e16", new Object[]{this, dinamicXEngine});
        }
        id0.c(dinamicXEngine);
        return this;
    }

    public hd0 c(f8v f8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hd0) ipChange.ipc$dispatch("b660c85", new Object[]{this, f8vVar});
        }
        if (f8vVar != null) {
            f8vVar.t(new qdu());
        }
        return this;
    }

    public hd0 d(DinamicXEngine dinamicXEngine, mqk mqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hd0) ipChange.ipc$dispatch("dcee4d5f", new Object[]{this, dinamicXEngine, mqkVar});
        }
        if (!(dinamicXEngine == null || dinamicXEngine.v() == null || mqkVar == null)) {
            dinamicXEngine.v().i(o6v.ULTRONBRIDGE, new o6v.a(mqkVar));
        }
        return this;
    }
}
