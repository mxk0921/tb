package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.f64;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q5i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static f64.a f26517a;

    static {
        t2o.a(993001651);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0dd92", new Object[0]);
        } else {
            c();
        }
    }

    public static void b(f64.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307f9076", new Object[]{aVar});
            return;
        }
        c();
        f26517a = aVar;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7573e3f", new Object[0]);
            return;
        }
        f64.a aVar = f26517a;
        if (aVar != null) {
            aVar.invoke(null);
            f26517a = null;
        }
    }
}
