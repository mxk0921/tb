package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tdy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile tdy c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f28652a;
    public final Method b;

    public tdy() {
        this.f28652a = null;
        this.b = null;
        try {
            IpChange ipChange = OrangeConfig.$ipChange;
            Method method = OrangeConfig.class.getMethod("getInstance", new Class[0]);
            this.b = OrangeConfig.class.getMethod("getConfig", String.class, String.class, String.class);
            this.f28652a = method.invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static tdy b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tdy) ipChange.ipc$dispatch("554b5a51", new Object[0]);
        }
        if (c == null) {
            synchronized (tdy.class) {
                try {
                    if (c == null) {
                        c = new tdy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final String a(String str, String str2) {
        Method method;
        Object obj = this.f28652a;
        if (obj == null || (method = this.b) == null) {
            return str2;
        }
        try {
            return (String) method.invoke(obj, "AliSecSecuritySDK", str, str2);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return str2;
        }
    }
}
