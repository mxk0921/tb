package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, Object> f20972a = new ConcurrentHashMap();
    public Map<String, Long> b = new ConcurrentHashMap();

    static {
        t2o.a(444596627);
    }

    public void a(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c122c", new Object[]{this, str, l});
            return;
        }
        if (this.b == null) {
            this.b = new ConcurrentHashMap();
        }
        this.b.put(str, l);
    }

    public void b(String str, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30ddd76", new Object[]{this, str, num});
            return;
        }
        if (this.f20972a == null) {
            this.f20972a = new ConcurrentHashMap();
        }
        this.f20972a.put(str, num);
    }

    public Map<String, Long> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e6b026e5", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16796045", new Object[]{this});
        }
        return this.f20972a;
    }
}
