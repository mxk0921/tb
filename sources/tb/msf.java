package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class msf extends asf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final msf e = new msf(true);
    public static final msf f = new msf(false);
    public final boolean d;

    static {
        t2o.a(921698356);
    }

    public msf() {
        this.d = true;
    }

    public static /* synthetic */ Object ipc$super(msf msfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSVoid");
    }

    public static msf v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (msf) ipChange.ipc$dispatch("ca46cd93", new Object[0]);
        }
        return f;
    }

    public static msf w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (msf) ipChange.ipc$dispatch("55ae9fdc", new Object[0]);
        }
        return e;
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
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b199369", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ksf
    public String t(dqf dqfVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32af5822", new Object[]{this, dqfVar});
        }
        if (this.d) {
            str = "undefined";
        } else {
            str = "null";
        }
        return "Void(" + str + f7l.BRACKET_END_STR;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("774314d1", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public msf(boolean z) {
        this.d = z;
    }
}
