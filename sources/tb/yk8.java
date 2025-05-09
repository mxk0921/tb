package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yk8 implements zgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f32143a = "ultroncommonpage";

    public void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45fd57e1", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        try {
            hdv.a().commitFailure(str, str2, "1.0", f32143a, "", map, str3, str4);
        } catch (Throwable unused) {
        }
    }

    static {
        t2o.a(153092148);
        t2o.a(156237887);
    }
}
