package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class sv1 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912261825);
        t2o.a(912261826);
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("93fe213d", new Object[]{this});
        }
        return null;
    }
}
