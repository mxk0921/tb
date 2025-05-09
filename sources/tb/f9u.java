package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class f9u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189389);
    }

    public static String a(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a81cccb", new Object[]{mtopResponse});
        }
        if (mtopResponse == null || mtopResponse.getHeaderFields() == null || (list = mtopResponse.getHeaderFields().get("mtop-buytraceid")) == null || list.isEmpty()) {
            return "";
        }
        return list.get(0);
    }
}
