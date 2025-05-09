package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d7l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, i68> f17639a;

    public static i68 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i68) ipChange.ipc$dispatch("312199b5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (i68) ((HashMap) f17639a).get(str.trim().toLowerCase());
    }

    static {
        t2o.a(912262879);
        HashMap hashMap = new HashMap(4);
        f17639a = hashMap;
        hashMap.put("empty", new tc8());
        hashMap.put("not", new c8k());
        hashMap.put("and", new pv0());
        hashMap.put("or", new f8l());
        hashMap.put("deleteifnull", new ib7());
    }
}
