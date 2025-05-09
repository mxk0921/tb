package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class cr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17257a = false;
    public static Context b;

    static {
        t2o.a(469762050);
    }

    public static anl a(Context context, sll sllVar, String str, boolean z, Bundle bundle) {
        boolean z2;
        ir9.b("FluidInitializeReflect", "FluidSDK 创建视频流二跳页实例：" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (!str.contains("/video-fullpage/transparent-videolist.html") && !ufs.v(str)) {
                z2 = false;
                Class<?> h = or9.h();
                Class<?> cls = Boolean.TYPE;
                return (anl) h.getConstructor(Context.class, sll.class, String.class, cls, cls).newInstance(context, sllVar, str, Boolean.valueOf(z2), Boolean.valueOf(z));
            }
            z2 = true;
            Class<?> h2 = or9.h();
            Class<?> cls2 = Boolean.TYPE;
            return (anl) h2.getConstructor(Context.class, sll.class, String.class, cls2, cls2).newInstance(context, sllVar, str, Boolean.valueOf(z2), Boolean.valueOf(z));
        } catch (InvocationTargetException e) {
            ir9.c("FluidInitializeReflect", "FluidSDK 创建视频流二跳页实例失败", e.getTargetException());
            return null;
        } catch (Exception e2) {
            ir9.c("FluidInitializeReflect", "FluidSDK 创建视频流二跳页实例失败", e2);
            return null;
        }
    }

    public static void b(Context context, HashMap<String, Object> hashMap) {
        ir9.b("FluidInitializeReflect", "FluidSDK 加载新架构 FullPageWakeChainLauncher");
        c(context);
        Class<?> i = or9.i(or9.FLUID_SDK_FULL_PAGE_WAKE_CHAIN_LAUNCHER_CLASS_NAME);
        if (i != null) {
            try {
                i.getDeclaredMethod("init", Context.class, HashMap.class).invoke(null, context, hashMap);
                ir9.b("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始方法 init");
            } catch (InvocationTargetException e) {
                ir9.c("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始化方法 init 失败 ", e.getTargetException());
            } catch (Exception e2) {
                ir9.c("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始化方法 init 失败", e2);
            }
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a491301", new Object[]{context});
        } else if (b == null) {
            b = context;
            ir9.b("FluidInitializeReflect", "FluidSDK 加载新架构初始化 Application: " + context);
        }
    }

    public static void d(Context context) {
        if (f17257a) {
            ir9.b("FluidInitializeReflect", "FluidSDK 加载新架构已经初始化");
            return;
        }
        ir9.b("FluidInitializeReflect", "FluidSDK 加载新架构 FullPageWakeChainLauncher");
        c(context);
        Class<?> i = or9.i(or9.FLUID_SDK_FULL_PAGE_WAKE_CHAIN_LAUNCHER_CLASS_NAME);
        if (i != null) {
            try {
                i.getDeclaredMethod("initTBVideoSDK", Context.class).invoke(null, context);
                f17257a = true;
                ir9.b("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始方法 initTBVideoSDK");
            } catch (InvocationTargetException e) {
                ir9.c("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始方法 initTBVideoSDK 失败 ", e.getTargetException());
            } catch (Exception e2) {
                ir9.c("FluidInitializeReflect", "FluidSDK 执行新架构唤端初始化方法 initTBVideoSDK 失败 ", e2);
            }
        }
    }

    public static Class<?> e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("11ce53a", new Object[]{context});
        }
        c(context);
        return or9.h();
    }
}
