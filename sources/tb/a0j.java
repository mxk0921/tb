package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a0j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        boolean a();

        void b(a aVar);
    }

    static {
        t2o.a(628097115);
    }

    public static zzi a(int i, int i2, List<svc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzi) ipChange.ipc$dispatch("f53694a", new Object[]{new Integer(i), new Integer(i2), list});
        }
        MsgLog.e("MonitorTaskFactory", "createMonitorTask type= ", Integer.valueOf(i));
        if (i == 1) {
            return new bxe(i2);
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return null;
                    }
                } else if (list != null) {
                    return new nzn(i2, list);
                }
                if (list != null) {
                    return new zd0(list);
                }
                return null;
            }
        } else if (list != null) {
            return new bpn(list);
        }
        return new e2o(i2);
    }
}
