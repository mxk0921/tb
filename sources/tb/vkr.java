package tb;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class vkr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093366);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa7c660", new Object[]{str});
        } else {
            igq.n().g("alive_interactive_count_action", str, 1.0d);
        }
    }

    public static void b(ux9 ux9Var, String str, String str2) {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a76b1fbb", new Object[]{ux9Var, str, str2});
            return;
        }
        if (ux9Var == null) {
            ux9Var = vx9.d();
        }
        if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null) {
            z0.o(str, str2);
        }
    }

    public static void c(ux9 ux9Var, String str, Map<String, Object> map) {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcbc1334", new Object[]{ux9Var, str, map});
            return;
        }
        if (ux9Var == null) {
            ux9Var = vx9.d();
        }
        if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null) {
            z0.v(str, map);
        }
    }

    public static void d(ux9 ux9Var, String str, Map<String, Object> map) {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831d412e", new Object[]{ux9Var, str, map});
            return;
        }
        if (ux9Var == null) {
            ux9Var = vx9.d();
        }
        if ((ux9Var instanceof t54) && (z0 = ((t54) ux9Var).z0()) != null && z0.d() != null) {
            z0.d().a(str, map);
        }
    }

    public static boolean e(ux9 ux9Var, ViewGroup viewGroup, String str, Map<String, String> map) {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddde56f", new Object[]{ux9Var, viewGroup, str, map})).booleanValue();
        }
        if (ux9Var == null) {
            ux9Var = vx9.d();
        }
        if (!(ux9Var instanceof t54) || (z0 = ((t54) ux9Var).z0()) == null) {
            return false;
        }
        return z0.f(viewGroup, str, map);
    }

    public static boolean f(ux9 ux9Var, ViewGroup viewGroup, String str, Map<String, String> map) {
        IInteractiveProxy.h z0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b75d131", new Object[]{ux9Var, viewGroup, str, map})).booleanValue();
        }
        if (ux9Var == null) {
            ux9Var = vx9.d();
        }
        if (!(ux9Var instanceof t54) || (z0 = ((t54) ux9Var).z0()) == null) {
            return false;
        }
        return z0.b(viewGroup, str, map);
    }
}
