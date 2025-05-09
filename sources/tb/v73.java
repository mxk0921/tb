package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.falco.m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v73 extends xt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093415);
    }

    public static /* synthetic */ Object ipc$super(v73 v73Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/analysis/CardAnalysis");
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70c6308e", new Object[]{this})).booleanValue();
        }
        return pvs.C1();
    }

    public void u(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ef18c1", new Object[]{this, new Long(j)});
        } else {
            l(j);
        }
    }

    public void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffe4c49", new Object[]{this, str});
            return;
        }
        m mVar = this.c;
        if (mVar != null) {
            mVar.l0(str);
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d4d43a", new Object[]{this, new Boolean(z)});
            return;
        }
        m mVar = this.c;
        if (mVar != null) {
            mVar.j(z);
        }
    }
}
