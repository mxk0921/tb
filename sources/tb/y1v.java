package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class y1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592842);
    }

    public abstract String[] a();

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b22962", new Object[]{this, str});
        }
    }

    public abstract void c(String str, Map<String, String> map);
}
