package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jsl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, bsl> f22186a;

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f324f255", new Object[]{str})).booleanValue();
        }
        return ((HashMap) f22186a).containsKey(str);
    }

    public static bsl b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsl) ipChange.ipc$dispatch("8fae36d0", new Object[]{str});
        }
        return (bsl) ((HashMap) f22186a).get(str);
    }

    static {
        t2o.a(156237893);
        HashMap hashMap = new HashMap();
        f22186a = hashMap;
        hashMap.put("data", new or6());
        hashMap.put("triggerData", new wfu());
        hashMap.put("jsonToString", new rwf());
    }
}
