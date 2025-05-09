package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.call.CartMegaManager;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class rb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rb3 INSTANCE = new rb3();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f27243a = new AtomicInteger();

    static {
        t2o.a(478151024);
    }

    @JvmStatic
    public static final void b(String str, f8e f8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e682d06", new Object[]{str, f8eVar});
            return;
        }
        ckf.g(str, "instanceID");
        ckf.g(f8eVar, "cartVEngine");
        CartMegaManager.INSTANCE.a(str, f8eVar);
    }

    @JvmStatic
    public static final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bd759c", new Object[]{str});
            return;
        }
        ckf.g(str, "instanceID");
        CartMegaManager.INSTANCE.n(str);
    }

    public final void a(String str, j2e j2eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a042654d", new Object[]{this, str, j2eVar});
            return;
        }
        ckf.g(str, "instanceID");
        ckf.g(j2eVar, "tradeHybridInstance");
        CartMegaManager.INSTANCE.b(str, j2eVar);
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23b471a", new Object[]{this});
        }
        return "cartInstanceID_" + f27243a.incrementAndGet();
    }
}
