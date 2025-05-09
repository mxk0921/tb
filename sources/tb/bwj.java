package tb;

import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class bwj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bwj INSTANCE = new bwj();

    static {
        t2o.a(998244392);
    }

    public final String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe5f5b0e", new Object[]{this, str, map});
        }
        ckf.g(str, "url");
        ckf.g(map, "headers");
        DegradableNetwork degradableNetwork = new DegradableNetwork(yaa.n);
        RequestImpl requestImpl = new RequestImpl(str);
        requestImpl.setMethod("GET");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            requestImpl.addHeader(entry.getKey(), entry.getValue());
        }
        Response syncSend = degradableNetwork.syncSend(requestImpl, null);
        if (syncSend == null || syncSend.getStatusCode() != 200) {
            return null;
        }
        byte[] bytedata = syncSend.getBytedata();
        ckf.f(bytedata, "response.bytedata");
        return new String(bytedata, uj3.UTF_8);
    }
}
