package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryTrafficCardRequest;
import com.taobao.android.live.plugin.atype.flexalocal.traffic.request.QueryTrafficCardResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n8n extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700067);
    }

    public n8n(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(n8n n8nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/traffic/request/QueryTrafficCardBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9235092", new Object[]{this, str, str2});
            return;
        }
        QueryTrafficCardRequest queryTrafficCardRequest = new QueryTrafficCardRequest();
        queryTrafficCardRequest.isp = str;
        queryTrafficCardRequest.ispResult = str2;
        C(0, queryTrafficCardRequest, QueryTrafficCardResponse.class);
    }
}
