package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class sgh {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sgh INSTANCE = new sgh();

    static {
        t2o.a(998244385);
    }

    @JvmStatic
    public static final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca26b54b", new Object[]{str});
        }
        ckf.g(str, "originalTag");
        return ckf.p("UniDevTools/", str);
    }
}
