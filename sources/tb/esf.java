package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class esf extends tqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String d;

    static {
        t2o.a(921698350);
    }

    public esf(String str) {
        super(null, 0L);
        this.d = str;
    }

    public static /* synthetic */ Object ipc$super(esf esfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSString");
    }

    @Override // tb.ksf
    public ksf d(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("cf24d394", new Object[]{this, dqfVar});
        }
        return new esf(this.d);
    }

    @Override // tb.ksf
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239570e6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.ksf
    public String t(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32af5822", new Object[]{this, dqfVar});
        }
        return this.d;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c5234d1", new Object[]{this});
        }
        return this.d;
    }
}
