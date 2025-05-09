package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h8l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final h8l INSTANCE = new h8l();

    static {
        t2o.a(1022361790);
    }

    public final String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2df0e14f", new Object[]{this, str, str2});
        }
        ckf.g(str, "group");
        ckf.g(str2, "key");
        Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, "Orange", "get", a.k(jpu.a("group", str), jpu.a("key", str2)), null, 8, null));
        if (a2 != null) {
            return ht4.e(a2, "result");
        }
        return null;
    }
}
