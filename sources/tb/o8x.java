package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, ede> f25222a = new HashMap<>();

    static {
        t2o.a(982515947);
    }

    public static synchronized ede a(String str) {
        synchronized (o8x.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ede) ipChange.ipc$dispatch("6e9e508f", new Object[]{str});
            }
            HashMap<String, ede> hashMap = f25222a;
            ede edeVar = hashMap.get(str);
            if (edeVar == null) {
                edeVar = r3x.l().a(str);
                hashMap.put(str, edeVar);
            }
            return edeVar;
        }
    }
}
