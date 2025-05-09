package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ftt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class azs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final azs INSTANCE = new azs();

    static {
        t2o.a(1010827285);
    }

    public final qtt a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtt) ipChange.ipc$dispatch("6bcfac2c", new Object[]{this});
        }
        ftt.a aVar = ftt.Companion;
        return bvt.c(aVar, bvt.d(aVar), null, 2, null);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0d225fc", new Object[]{this});
        }
        return c(a());
    }

    public final String c(qtt qttVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ee64a64", new Object[]{this, qttVar});
        }
        int c = qttVar.c();
        int b = qttVar.b();
        int a2 = qttVar.a();
        if (c == 0 || b == 0 || a2 == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append('-');
        sb.append(b);
        sb.append('-');
        sb.append(a2);
        return sb.toString();
    }
}
