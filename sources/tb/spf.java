package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class spf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698334);
    }

    public spf(dqf dqfVar) {
        super(dqfVar, Bridge.createNative(dqfVar, 8));
    }

    public static /* synthetic */ Object ipc$super(spf spfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSArray");
    }

    public int M(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae4fc6ab", new Object[]{this, dqfVar})).intValue();
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 200, this.b);
        if (cmd instanceof Long) {
            return ((Long) cmd).intValue();
        }
        return 0;
    }

    @Override // tb.ksf
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c645a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public spf(dqf dqfVar, int i) {
        super(dqfVar, Bridge.createNative(dqfVar, 8, i));
    }

    public spf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }
}
