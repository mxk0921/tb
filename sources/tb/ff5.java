package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ff5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597901);
    }

    public static uw5 a(String str, String str2, byte b, Map map, Map map2, wub wubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("a5a0076", new Object[]{str, str2, new Byte(b), map, map2, wubVar});
        }
        xq xqVar = new xq();
        wubVar.a(xqVar, wubVar);
        if (b == 0) {
            wubVar.e().j(str, str2, xqVar, map, new c46(wubVar, map2, str, str2));
            return uw5.Y();
        } else if (b != 1) {
            return uw5.Y();
        } else {
            ExecuteResult z = wubVar.e().z(str, str2, xqVar, map, new c46(wubVar, map2, str, str2));
            if (z == null || z.getStatusCode() > 99) {
                if (eb5.u()) {
                    h36.o("SYNC CALL 失败 ", JSON.toJSONString(z));
                }
                return uw5.V();
            }
            if (eb5.u()) {
                h36.o("DXCallMegaChainNodeOpImpl SYNC CALL " + JSON.toJSONString(z));
            }
            if (z.getData() != null) {
                return uw5.T(z.getData().get("result"));
            }
            return uw5.V();
        }
    }
}
