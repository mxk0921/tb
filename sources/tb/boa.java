package tb;

import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class boa implements adt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1034944711);
        t2o.a(1034944593);
    }

    @Override // tb.adt
    public Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e53be4f", new Object[]{this, map});
        }
        String str = map.get("content");
        HashMap hashMap = new HashMap();
        String str2 = "";
        String c = !TextUtils.isEmpty(str) ? sd8.c(Base64.decode(str, 0)) : str2;
        if (c != null) {
            str2 = c;
        }
        hashMap.put("result", str2);
        return hashMap;
    }
}
