package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class nx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993002163);
    }

    public abstract String a();

    public abstract String b();

    public abstract Map<String, String> c();

    public final zsm d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zsm) ipChange.ipc$dispatch("516a9108", new Object[]{this});
        }
        zsm zsmVar = new zsm();
        zsmVar.e(a());
        zsmVar.h(b());
        Map<String, String> c = c();
        HashMap hashMap = new HashMap();
        p80.p(j3p.g(), hashMap, e(), false);
        c.putAll(hashMap);
        zsmVar.f(c);
        Map<String, String> f = f();
        if (f != null) {
            f.putAll(hashMap);
        }
        zsmVar.g(f);
        return zsmVar;
    }

    public abstract String e();

    public abstract Map<String, String> f();

    public abstract boolean g(Uri uri);
}
