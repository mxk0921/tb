package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class b6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f16212a = b6o.class.getSimpleName();

    static {
        t2o.a(713031875);
    }

    public static MtopRequest a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("e18202a4", new Object[]{str, str2, map});
        }
        if (TextUtils.isEmpty(str)) {
            lor.c(f16212a, "getMtopRequest empty", "apiName is null");
            return null;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.setNeedEcode(true);
        mtopRequest.setNeedSession(true);
        if (map != null && !map.isEmpty()) {
            mtopRequest.setData(JSON.toJSONString(map));
        }
        String str3 = f16212a;
        lor.c(str3, "getMtopRequest", "mtopRequest:" + mtopRequest.toString());
        return mtopRequest;
    }
}
