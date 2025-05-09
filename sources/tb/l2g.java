package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l2g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1002438669);
    }

    public static final <T> mjn<Object, T> a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mjn) ipChange.ipc$dispatch("d038da67", new Object[]{map, str});
        }
        ckf.g(map, "map");
        ckf.g(str, "key");
        return new b3i(map, str);
    }
}
