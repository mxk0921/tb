package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zkf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237840);
    }

    public static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a20728b9", new Object[]{closeable});
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
