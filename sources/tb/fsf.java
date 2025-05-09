package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fsf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698351);
    }

    public fsf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }

    public static /* synthetic */ Object ipc$super(fsf fsfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSStringObject");
    }

    public String M(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0daa2e6", new Object[]{this, dqfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 302, this.b);
        if (cmd instanceof esf) {
            return ((esf) cmd).u();
        }
        return null;
    }

    @Override // tb.ksf
    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0c4885", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
