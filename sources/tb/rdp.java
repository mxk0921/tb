package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uniinfra_kmp.common_utils.concurrent.ConcurrentMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class rdp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rdp INSTANCE = new rdp();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentMap<String, r39> f27300a = new ConcurrentMap<>();
    public static final x29 b = new x29();
    public static final d39 c = new d39();

    static {
        t2o.a(1007681542);
    }

    public final x29 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x29) ipChange.ipc$dispatch("9cb64940", new Object[]{this});
        }
        return b;
    }

    public final d39 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d39) ipChange.ipc$dispatch("b70d3e84", new Object[]{this});
        }
        return c;
    }

    public final r39 c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r39) ipChange.ipc$dispatch("45b374c8", new Object[]{this, str});
        }
        l4s.INSTANCE.e("getStatusService");
        if (str == null) {
            str = ovy.DEFAULT_USERID;
        }
        ovy.a().lock();
        ConcurrentMap<String, r39> concurrentMap = f27300a;
        r39 r39Var = concurrentMap.get(str);
        if (r39Var == null) {
            r39Var = new r39(str);
        }
        concurrentMap.putValue(str, r39Var);
        ovy.a().unlock();
        return r39Var;
    }
}
