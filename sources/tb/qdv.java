package tb;

import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qdv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_MAIN_BIZ_NAME = "ultronTrade";

    static {
        t2o.a(155189392);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a8d8be", new Object[]{str, str2, map});
        } else {
            UmbrellaTracker.commitFailureStability("umbrella.event.openurl", "ultron.trade.open.url", "1.0", "ultronTrade", "biz_unknow", map, str, str2);
        }
    }
}
