package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class puv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG1_ACCS_CHECK = "accs_check";
    public static final String ARG1_NOTIFY_LISTENERS = "notify_listeners";
    public static final String ARG1_POST_POPLAYER = "postPoplayer";
    public static final String ARG1_RECEIVE_ACCS = "receive_accs";
    public static final String PAGE = "Family_Social";

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2132e15a", new Object[]{str, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(PAGE, 19999, str, null, null, map).build());
        }
    }
}
