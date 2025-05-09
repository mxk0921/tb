package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dzv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1022362008);
    }

    public static final <K, V> void a(Map<K, V> map, K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1eb60", new Object[]{map, k, v});
            return;
        }
        ckf.g(map, "<this>");
        if (v != null) {
            map.put(k, v);
        }
    }
}
