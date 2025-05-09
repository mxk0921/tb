package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ElasticSchedulerEngine;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pa8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static volatile d2c f25975a = null;
    public static boolean b = true;
    public static volatile Context c;
    public static volatile String d;

    public static Context a() {
        if (c != null) {
            return c;
        }
        synchronized (pa8.class) {
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

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62fd1115", new Object[0]);
        }
        return d;
    }

    public static d2c c() {
        if (!b) {
            return null;
        }
        if (f25975a != null) {
            return f25975a;
        }
        synchronized (pa8.class) {
            if (f25975a != null) {
                return f25975a;
            }
            Constructor declaredConstructor = ElasticSchedulerEngine.class.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            f25975a = (d2c) declaredConstructor.newInstance(new Object[0]);
            f25975a.initialize(a());
            return f25975a;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else if (context != null) {
            c = context;
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145c4069", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            d = str;
        }
    }
}
