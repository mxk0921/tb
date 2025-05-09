package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static y58 f29607a;

    static {
        t2o.a(1032847390);
    }

    public static ExecutorService a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecutorService) ipChange.ipc$dispatch("d418b248", new Object[0]);
        }
        if (f29607a == null) {
            y58 y58Var = new y58(4, 4, 30L, a68.TAG);
            f29607a = y58Var;
            y58Var.allowCoreThreadTimeOut(true);
        }
        return f29607a;
    }
}
