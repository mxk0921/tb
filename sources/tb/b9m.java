package tb;

import com.alibaba.android.split.manager.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b9m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f16267a = new HashMap();

    static {
        t2o.a(677380198);
    }

    public static a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8a16adde", new Object[]{str});
        }
        Map<String, a> map = f16267a;
        if (!((HashMap) map).containsKey(str)) {
            ((HashMap) map).put(str, new a9m());
        }
        return (a) ((HashMap) map).get(str);
    }
}
