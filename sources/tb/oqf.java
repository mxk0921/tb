package tb;

import com.alibaba.jsi.standard.js.Bridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class oqf extends yrf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698340);
    }

    public oqf(dqf dqfVar, ypf ypfVar, String str) {
        super(dqfVar, Bridge.createNative(dqfVar, 12, new Object[]{ypfVar, str}));
    }

    public static /* synthetic */ Object ipc$super(oqf oqfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSFunction");
    }

    public ksf M(dqf dqfVar, ksf ksfVar, ksf[] ksfVarArr) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("7e430a2", new Object[]{this, dqfVar, ksfVar, ksfVarArr});
        }
        b();
        yrf.u(dqfVar);
        if (ksfVarArr != null) {
            i = ksfVarArr.length + 1;
        } else {
            i = 1;
        }
        Object[] objArr = new Object[i];
        objArr[0] = ksfVar;
        if (ksfVarArr != null) {
            int length = ksfVarArr.length;
            int i3 = 1;
            while (i2 < length) {
                objArr[i3] = ksfVarArr[i2];
                i2++;
                i3++;
            }
        }
        Object cmd = Bridge.cmd(dqfVar, 550, this.b, objArr);
        if (cmd instanceof ksf) {
            return (ksf) cmd;
        }
        return null;
    }

    public boolean N(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96dcb269", new Object[]{this, dqfVar})).booleanValue();
        }
        b();
        if (Bridge.cmd(dqfVar, 553, this.b) != null) {
            return true;
        }
        return false;
    }

    public ypf O(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypf) ipChange.ipc$dispatch("148f8dae", new Object[]{this, dqfVar});
        }
        b();
        Object cmd = Bridge.cmd(dqfVar, 554, this.b);
        if (cmd instanceof ypf) {
            return (ypf) cmd;
        }
        return null;
    }

    @Override // tb.ksf
    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5f63ead", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public oqf(dqf dqfVar, ypf ypfVar, String str, boolean z) {
        super(dqfVar, Bridge.createNative(dqfVar, 12, new Object[]{ypfVar, str, z ? Boolean.TRUE : null}));
    }

    public oqf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }
}
