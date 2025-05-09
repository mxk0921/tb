package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class slz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262833);
    }

    public static boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6f69ee3", new Object[]{map})).booleanValue();
        }
        return map != null && Boolean.parseBoolean(map.get("updateWithCustomApi"));
    }
}
