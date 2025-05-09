package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class o extends bu6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static o b;

    static {
        t2o.a(961544349);
    }

    public o() {
        super(new p(n.j().b()));
    }

    public static synchronized o L() {
        synchronized (o.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o) ipChange.ipc$dispatch("2b2612c8", new Object[0]);
            }
            if (b == null) {
                b = new o();
            }
            return b;
        }
    }

    public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/internal/database/ABDatabase");
    }
}
