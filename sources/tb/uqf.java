package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uqf extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final double d;
    public final boolean e = false;

    static {
        t2o.a(921698343);
    }

    public uqf(int i) {
        this.d = i;
    }

    public static /* synthetic */ Object ipc$super(uqf uqfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSNumber");
    }

    @Override // tb.ksf
    public ksf d(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("cf24d394", new Object[]{this, dqfVar});
        }
        if (this.e) {
            return new uqf((int) this.d);
        }
        return new uqf(this.d);
    }

    @Override // tb.ksf
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69f8901e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ksf
    public String t(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32af5822", new Object[]{this, dqfVar});
        }
        if (this.e) {
            return String.valueOf((int) this.d);
        }
        return String.valueOf(this.d);
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67689f26", new Object[]{this})).intValue();
        }
        if (this.e) {
            return (int) this.d;
        }
        throw new AssertionError("Not a integer");
    }

    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db80d33f", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public double w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a35db39d", new Object[]{this})).doubleValue();
        }
        return this.d;
    }

    public uqf(double d) {
        this.d = d;
    }
}
