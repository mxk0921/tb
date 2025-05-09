package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ad3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150780);
    }

    public static /* synthetic */ Object ipc$super(ad3 ad3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/event/CartReQuerySubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        fdv.d(lcuVar);
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        this.j.f0(true, hashMap, null);
    }
}
