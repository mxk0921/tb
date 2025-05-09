package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vpf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698337);
    }

    public vpf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }

    public static /* synthetic */ Object ipc$super(vpf vpfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSBooleanObject");
    }

    public boolean M(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75f2a4fe", new Object[]{this, dqfVar})).booleanValue();
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 301, this.b);
        if (cmd instanceof upf) {
            return ((upf) cmd).v();
        }
        return false;
    }

    @Override // tb.ksf
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36c59288", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
