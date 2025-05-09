package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class k55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(440402012);
    }

    public static Map<String, String> a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6ee97cc0", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri == null) {
            return hashMap;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                String queryParameter = uri.getQueryParameter(str);
                if (queryParameter != null) {
                    hashMap.put(str, queryParameter);
                }
            }
        }
        return hashMap;
    }
}
