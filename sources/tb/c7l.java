package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, h68> f16901a;

    public static h68 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h68) ipChange.ipc$dispatch("4a41c7fb", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (h68) ((HashMap) f16901a).get(str.trim().toLowerCase());
    }

    static {
        t2o.a(912262345);
        HashMap hashMap = new HashMap(4);
        f16901a = hashMap;
        hashMap.put("empty", new sc8());
        hashMap.put("not", new b8k());
        hashMap.put("and", new ov0());
        hashMap.put("or", new e8l());
        hashMap.put("deleteifnull", new hb7());
    }
}
