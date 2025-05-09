package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class y7a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536685);
    }

    public static final <T> T a(Object obj, String str, KMPJsonObject kMPJsonObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9682eb00", new Object[]{obj, str, kMPJsonObject, str2});
        }
        ckf.g(str, "clsName");
        ckf.g(str2, "key");
        return null;
    }
}
