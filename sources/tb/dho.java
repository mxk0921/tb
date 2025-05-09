package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dho implements ald {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744488971);
        t2o.a(467664925);
    }

    public boolean a(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cef58e79", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "link_route_local");
            vp9.a("linkx", "RouterStrategyImp === shouldNewRouterLocal ===  " + b);
            return b;
        } catch (Throwable unused) {
            vp9.b("linkx", "RouterStrategyImp === shouldNewRouterLocal === error");
            return false;
        }
    }

    public boolean b(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c337b8bf", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "avoidreq");
            vp9.a("linkx", "RouterStrategyImp === shouldRouterLocal ===  " + b);
            return b;
        } catch (Throwable unused) {
            vp9.b("linkx", "RouterStrategyImp === shouldUseSSROpt === error");
            return false;
        }
    }

    public boolean c(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc128b8a", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "link_async_router_opt");
            vp9.a("linkx", "RouterStrategyImp === shouldUseAsyncRouterStrategy ===  " + b);
            return b;
        } catch (Throwable unused) {
            vp9.b("linkx", "RouterStrategyImp === shouldUseAsyncRouterStrategy === error");
            return true;
        }
    }

    public boolean d(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a848eb2", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "afc_new_link_info_opt");
            vp9.a("linkx", "RouterStrategyImp === shouldUseNewLinkInfoMTOP ===  " + b);
            return b;
        } catch (Throwable unused) {
            vp9.b("linkx", "RouterStrategyImp === shouldUseNewLinkInfoMTOP === error");
            return false;
        }
    }

    public boolean e(qg0 qg0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e73d9bb9", new Object[]{this, qg0Var})).booleanValue();
        }
        try {
            boolean b = ABGlobal.b(qg0Var.C, "taobao", "tbspeed", "link_opt_open_julang");
            vp9.a("linkx", "RouterStrategyImp === shouldUseSSROpt ===  " + b);
            return b;
        } catch (Throwable unused) {
            vp9.b("linkx", "RouterStrategyImp === shouldUseSSROpt === error");
            return false;
        }
    }
}
