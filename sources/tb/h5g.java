package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(500170820);
    }

    public static long a(m2c m2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80cb8245", new Object[]{m2cVar})).longValue();
        }
        if (m2cVar == null) {
            return -1L;
        }
        long f = m2cVar.f(m2cVar.a());
        if (f > 0) {
            return f;
        }
        return -1L;
    }
}
