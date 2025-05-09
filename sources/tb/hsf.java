package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hsf extends tqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(921698352);
    }

    public hsf(dqf dqfVar, long j) {
        super(dqfVar, j);
    }

    public static /* synthetic */ Object ipc$super(hsf hsfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/jsi/standard/js/JSSymbol");
    }

    @Override // tb.ksf
    public final ksf a(dqf dqfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksf) ipChange.ipc$dispatch("db5ac280", new Object[]{this, dqfVar});
        }
        return f(dqfVar);
    }
}
