package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class xt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xt4 INSTANCE = new xt4();

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f31592a;
    public static List<String> b;

    static {
        t2o.a(1004535857);
    }

    public final List<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4563d1bd", new Object[]{this});
        }
        if (b == null) {
            b = wsq.z0(avs.INSTANCE.h("adLiveSourceWhiteListConfig", "ad_hudong11;ad_brandzone;ad_tanx;ad_tblive_task;ad_timemove;p4p-kgb"), new String[]{";"}, false, 0, 6, null);
        }
        return b;
    }

    public final Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d40195cd", new Object[]{this});
        }
        if (f31592a == null) {
            List<String> z0 = wsq.z0(avs.INSTANCE.h("pmInputKeyValueConfig", "pmParams:pmParams;"), new String[]{";"}, false, 0, 6, null);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : z0) {
                List z02 = wsq.z0(str, new String[]{":"}, false, 0, 6, null);
                if (z02.size() == 2) {
                    linkedHashMap.put(z02.get(0), z02.get(1));
                }
            }
            f31592a = linkedHashMap;
        }
        return f31592a;
    }
}
