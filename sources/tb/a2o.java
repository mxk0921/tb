package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.exception.IPCException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(393216035);
    }

    public static ijd a(Call call) throws IPCException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ijd) ipChange.ipc$dispatch("f3e7026e", new Object[]{call});
        }
        int type = call.getServiceWrapper().getType();
        if (type == 0) {
            return new s0k(call);
        }
        if (type == 1) {
            return new r7a(call);
        }
        if (type == 3) {
            return new zsi(call);
        }
        if (type == 4 || type == 5) {
            return new wdp(call);
        }
        if (type == 6) {
            return new ikz(call);
        }
        throw new IPCException(13, "Type " + call.getServiceWrapper().getType() + " is not supported.");
    }
}
