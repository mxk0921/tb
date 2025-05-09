package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rwr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991502);
    }

    public static /* synthetic */ ovd a(rwr rwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ovd) ipChange.ipc$dispatch("dce406d4", new Object[]{rwrVar});
        }
        throw null;
    }

    public static /* synthetic */ Handler b(rwr rwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6f1ce925", new Object[]{rwrVar});
        }
        throw null;
    }
}
