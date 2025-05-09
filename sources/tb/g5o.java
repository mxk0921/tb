package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class g5o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f19740a;

    static {
        t2o.a(961544428);
    }

    public g5o(List<Object> list) {
        this.f19740a = list;
    }

    public static g5o a(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5o) ipChange.ipc$dispatch("b4e4c4e7", new Object[]{list});
        }
        return new g5o(list);
    }

    public static g5o b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5o) ipChange.ipc$dispatch("4e34f915", new Object[]{map});
        }
        return new g5o(map);
    }

    public Object c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6045ccb0", new Object[]{this});
        }
        return this.f19740a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        try {
            return super.toString() + uwf.d(this.f19740a);
        } catch (Exception unused) {
            return super.toString();
        }
    }

    public g5o(Map<String, Object> map) {
        this.f19740a = map;
    }
}
