package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class qcf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<String> listenEvents = new ArrayList();

    static {
        t2o.a(985661622);
    }

    public void addInterceptEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3e2bca", new Object[]{this, str});
        } else if (!this.listenEvents.contains(str)) {
            this.listenEvents.add(str);
        }
    }

    public List<String> getListenEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c392caea", new Object[]{this});
        }
        return this.listenEvents;
    }

    public abstract void onFireEvent(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2);

    public void onInterceptFireEvent(String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0931e66", new Object[]{this, str, str2, str3, map, map2});
        } else if (map != null && this.listenEvents.contains(str3)) {
            onFireEvent(str, str2, str3, map, map2);
        }
    }
}
