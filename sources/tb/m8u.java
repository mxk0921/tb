package tb;

import com.alipay.android.app.crender.ext.TemplateTransport;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m8u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Object f23854a;
    public static Method b;

    public static /* synthetic */ List a(Map map) throws Exception {
        Method method = b;
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(f23854a, map);
        if (invoke instanceof List) {
            return (List) invoke;
        }
        return null;
    }

    public static synchronized v1e b() {
        l8u l8uVar;
        synchronized (m8u.class) {
            if (f23854a != null) {
                if (b == null) {
                }
                l8uVar = new l8u();
            }
            f23854a = TemplateTransport.class.newInstance();
            b = TemplateTransport.class.getMethod("fetchTemplates", Map.class);
            l8uVar = new l8u();
        }
        return l8uVar;
    }
}
