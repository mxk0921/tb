package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class g8q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f19787a = new AtomicBoolean(false);

    static {
        t2o.a(649068610);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0fa0149", new Object[0]);
            return;
        }
        AtomicBoolean atomicBoolean = f19787a;
        if (!atomicBoolean.get()) {
            try {
                System.loadLibrary("riverlogger");
                atomicBoolean.set(true);
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = "Empty message";
                }
                lcn.a(RVLLevel.Error, qcn.RVLModuleName).j("loadSO").g(101, message).f();
            }
        }
    }
}
