package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kjr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static kjr f22710a;

    static {
        t2o.a(779092498);
    }

    public static kjr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kjr) ipChange.ipc$dispatch("5c54639d", new Object[0]);
        }
        if (f22710a == null) {
            synchronized (kjr.class) {
                f22710a = new kjr();
            }
        }
        return f22710a;
    }

    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69b8705c", new Object[]{this, str, map});
        }
    }
}
