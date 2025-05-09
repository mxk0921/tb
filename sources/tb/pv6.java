package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class pv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f26337a = new ArrayList();

    static {
        t2o.a(961544263);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c27643b", new Object[]{this, str});
        } else {
            ((ArrayList) this.f26337a).add(str);
        }
    }

    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ea", new Object[]{this, str, map});
        } else if (map != null && !map.isEmpty()) {
            a(str + "=" + map.toString());
        }
    }
}
