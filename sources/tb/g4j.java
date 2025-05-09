package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097242);
    }

    public static awc a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (awc) ipChange.ipc$dispatch("842297f", new Object[]{new Integer(i)});
        }
        MsgLog.i("MtopAPIGeneratorFactory", "domainType=" + i);
        if (i == 1) {
            return new zvc();
        }
        if (i == 2) {
            return new yvc();
        }
        return new zvc();
    }
}
