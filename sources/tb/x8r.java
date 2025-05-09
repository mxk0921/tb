package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x8r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(708837567);
    }

    public static String a(MtopResponse mtopResponse) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50216637", new Object[]{mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        Map<String, List<String>> headerFields = mtopResponse.getHeaderFields();
        if (!bh.b(headerFields) && (list = headerFields.get("eagleeye-traceid")) != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }
}
