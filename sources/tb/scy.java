package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class scy implements z7e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static z7e f27961a;

    static {
        t2o.a(283115580);
        t2o.a(283115577);
    }

    public scy(z7e z7eVar) {
        f27961a = z7eVar;
    }

    @Override // tb.z7e
    public void a(String str, int i, Object obj, Object obj2, Object obj3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330e9ea", new Object[]{this, str, new Integer(i), obj, obj2, obj3, map});
            return;
        }
        try {
            z7e z7eVar = f27961a;
            if (z7eVar != null) {
                z7eVar.a(str, i, obj, obj2, obj3, map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93341c36", new Object[]{this, str, map});
        } else {
            a("tanx_exposer_sdk_trace", ocy.a(), str, null, null, map);
        }
    }
}
