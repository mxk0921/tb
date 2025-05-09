package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vxq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, Method> f30318a = new ConcurrentHashMap<>();

    public static synchronized void a(String str, Method method) {
        synchronized (vxq.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59d68da", new Object[]{str, method});
                return;
            }
            if (method != null) {
                f30318a.put(str, method);
            }
        }
    }
}
