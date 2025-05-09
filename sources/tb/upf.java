package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class upf extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final upf e = new upf(true);
    public static final upf f = new upf(false);
    public final boolean d;

    static {
        t2o.a(921698336);
    }

    public upf(boolean z) {
        this.d = z;
    }

    public static /* synthetic */ Object ipc$super(upf upfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSBoolean");
    }

    public static upf u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upf) ipChange.ipc$dispatch("39531f0b", new Object[]{new Boolean(z)});
        }
        if (z) {
            return e;
        }
        return f;
    }

    @Override // tb.ksf
    public ksf d(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("cf24d394", new Object[]{this, dqfVar});
        }
        return this;
    }

    @Override // tb.ksf
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e833929", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ksf
    public String t(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32af5822", new Object[]{this, dqfVar});
        }
        if (this.d) {
            return "true";
        }
        return "false";
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a35db3b3", new Object[]{this})).booleanValue();
        }
        return this.d;
    }
}
