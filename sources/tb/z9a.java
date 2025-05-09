package tb;

import android.app.Application;
import android.os.Handler;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z9a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DeviceEvaluator";

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f32627a = null;
    public static Handler b = null;
    public static boolean c = true;

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55723a7d", new Object[]{new Long(j)})).longValue();
        }
        return j * 3600000;
    }

    public static Application b() {
        if (f32627a != null) {
            return f32627a;
        }
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
            return (Application) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return f32627a;
        }
    }
}
