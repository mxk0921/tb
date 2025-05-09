package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vqf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698344);
    }

    public vqf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }

    public static /* synthetic */ Object ipc$super(vqf vqfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSNumberObject");
    }

    public double M(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75f2a4e8", new Object[]{this, dqfVar})).doubleValue();
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 300, this.b);
        if (cmd instanceof uqf) {
            return ((uqf) cmd).w();
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // tb.ksf
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2eb91dbd", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
