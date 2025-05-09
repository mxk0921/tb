package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ur9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(469762051);
    }

    public static void a(String str, lr9 lr9Var) {
        Class<?> g;
        if (vr9.e() && (g = or9.g()) != null) {
            try {
                g.getMethod("registerMessageHandler", String.class, lr9.class).invoke(null, str, lr9Var);
                ir9.b("FluidSDKReflect", "FluidSDKReflect 调用 registerMessageHandler，bizName: " + str + ", messageHandler: " + lr9Var);
            } catch (InvocationTargetException e) {
                ir9.c("FluidSDKReflect", "FluidSDKReflect 调用 registerMessageHandler 失败", e.getTargetException());
            } catch (Exception e2) {
                ir9.c("FluidSDKReflect", "FluidSDKReflect 调用 registerMessageHandler 失败", e2);
            }
        }
    }

    public static void b(String str, vrp vrpVar) {
        Class<?> g;
        if (vr9.e() && (g = or9.g()) != null) {
            try {
                g.getMethod("sendMessage", String.class, vrp.class).invoke(null, str, vrpVar);
                ir9.b("FluidSDKReflect", "FluidSDKReflect 调用 sendMessage，bizName: " + str + ", message: " + vrpVar);
            } catch (InvocationTargetException e) {
                ir9.c("FluidSDKReflect", "FluidSDKReflect 调用 sendMessage 失败", e.getTargetException());
            } catch (Exception e2) {
                ir9.c("FluidSDKReflect", "FluidSDKReflect 调用 sendMessage 失败", e2);
            }
        }
    }

    public static void c(String str, lr9 lr9Var) {
        Class<?> g;
        if (vr9.e() && (g = or9.g()) != null) {
            try {
                g.getMethod("unRegisterMessageHandler", String.class, lr9.class).invoke(null, str, lr9Var);
                ir9.b("FluidSDKReflect", "FluidSDKReflect 调用 unRegisterMessageHandler，bizName: " + str + ", messageHandler: " + lr9Var);
            } catch (InvocationTargetException e) {
                ir9.c("FluidSDKReflect", "FluidSDKReflect 调用 unRegisterMessageHandler 失败", e.getTargetException());
            } catch (Exception e2) {
                ir9.c("FluidSDKReflect", "FluidSDKReflect 调用 unRegisterMessageHandler 失败", e2);
            }
        }
    }
}
