package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.fscrmid.nav.ShotVideoNavProcessor;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class erm implements gcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Method f18778a;

    static {
        t2o.a(502268015);
        t2o.a(503316597);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323a8ecb", new Object[0]);
            return;
        }
        try {
            IpChange ipChange2 = ShotVideoNavProcessor.$ipChange;
            f18778a = ytn.c("setNavStartTime", ShotVideoNavProcessor.class, new Class[0]);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.gcd
    public void a() {
        try {
            Method method = f18778a;
            if (method != null) {
                method.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
