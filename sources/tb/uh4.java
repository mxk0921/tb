package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uh4 implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944706);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        String str = map.get("condition");
        String k = kzo.c().k();
        if (!(str == null || k == null)) {
            try {
                z = h3w.a(new JSONObject(str), k);
            } catch (Throwable unused) {
            }
            hashMap.put("result", "" + z);
        }
        return hashMap;
    }
}
