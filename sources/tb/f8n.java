package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryOperatorRequest;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryOperatorResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f8n extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700063);
    }

    public f8n(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(f8n f8nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/traffic/request/QueryOperatorBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd7aafe7", new Object[]{this, str});
            return;
        }
        QueryOperatorRequest queryOperatorRequest = new QueryOperatorRequest();
        queryOperatorRequest.isp = str;
        C(0, queryOperatorRequest, QueryOperatorResponse.class);
    }
}
