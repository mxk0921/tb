package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class taj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, ywc> f28592a = new LinkedHashMap();

    static {
        t2o.a(729809479);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad80060c", new Object[]{this});
        } else {
            ((LinkedHashMap) this.f28592a).clear();
        }
    }

    public <T extends ywc> T b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((ywc) ipChange.ipc$dispatch("3c9deb80", new Object[]{this, str}));
        }
        return (T) ((ywc) ((LinkedHashMap) this.f28592a).get(str));
    }

    public Map<String, ywc> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1d075d6a", new Object[]{this});
        }
        return this.f28592a;
    }

    public void d(String str, ywc ywcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d463844d", new Object[]{this, str, ywcVar});
        } else {
            this.f28592a.put(str, ywcVar);
        }
    }
}
