package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zai implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Md5ModTask";

    static {
        t2o.a(1034944712);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        int i;
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        Objects.toString(map);
        HashMap hashMap = new HashMap();
        try {
            i = um2.a(map.get("base"), Integer.parseInt(map.get(iiz.PERF_STAG_TOTAL)));
        } catch (Exception unused) {
            i = -1;
            z = true;
        }
        if (i >= 0) {
        }
        hashMap.put("mod", String.valueOf(i));
        hashMap.put("hasException", String.valueOf(z));
        return hashMap;
    }
}
