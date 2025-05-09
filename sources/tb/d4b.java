package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d4b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_CODE_EMPTY_PAGE_PROVIDER = "EmptyPageProvider";
    public static final String ERROR_CODE_EMPTY_SERVICE = "EmptyService";
    public static final String ERROR_CODE_ERROR_CONTEXT = "ErrorHomePageContext";
    public static final String ERROR_CODE_MULTI_ACTIVITY_INSTANCE = "MultiActivityInstance";

    static {
        t2o.a(729810152);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a29fdd9", new Object[]{str, str2, map});
            return;
        }
        ddv.b("HomePageService", "homepage", "1.0", null, map, str, str2);
        bqa.d("HomeServiceMonitor", "commitError errorCode:" + str + " errorMsg:" + str2 + " args:" + map);
    }
}
