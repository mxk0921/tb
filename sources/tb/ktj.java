package tb;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.NetworkDiagnosisCenter;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ktj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile zzc f22913a = null;
    public static boolean b = true;
    public static volatile Context c;

    public static zzc a() {
        if (!b) {
            return null;
        }
        if (f22913a != null) {
            return f22913a;
        }
        synchronized (ktj.class) {
            if (f22913a != null) {
                return f22913a;
            }
            Constructor declaredConstructor = NetworkDiagnosisCenter.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            f22913a = (zzc) declaredConstructor.newInstance(new Object[0]);
            f22913a.initialize(b());
            return f22913a;
        }
    }

    public static Context b() {
        if (c != null) {
            return c;
        }
        synchronized (ktj.class) {
            if (c != null) {
                return c;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                c = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return c;
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (context != null) {
            c = context;
        }
    }
}
