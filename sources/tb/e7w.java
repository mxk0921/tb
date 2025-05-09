package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.SingleRoomManageEngine;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e7w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093445);
    }

    public static boolean a(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fefd1b81", new Object[]{ux9Var})).booleanValue();
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            return f.r();
        }
        return false;
    }

    public static void b(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("336d27fe", new Object[]{ux9Var});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.s();
        }
    }

    public static void c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6257af6b", new Object[]{ux9Var});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.t();
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{str});
        }
    }

    public static void e(ux9 ux9Var, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e64197ec", new Object[]{ux9Var, new Boolean(z), str});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.x(ux9Var, z, str);
        }
    }

    public static SingleRoomManageEngine f(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleRoomManageEngine) ipChange.ipc$dispatch("81579c98", new Object[]{ux9Var});
        }
        return g(ux9Var, true);
    }

    public static SingleRoomManageEngine g(ux9 ux9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SingleRoomManageEngine) ipChange.ipc$dispatch("35cfb3bc", new Object[]{ux9Var, new Boolean(z)});
        }
        SingleRoomManageEngine singleRoomManageEngine = null;
        if (ux9Var == null) {
            ux9 d = vx9.d();
            if (d != null && (d.t() instanceof SingleRoomManageEngine)) {
                singleRoomManageEngine = (SingleRoomManageEngine) d.t();
            }
            if (z && singleRoomManageEngine == null && hw0.l()) {
                v2s.o().A().c("VideoEngineABSwitcher", Log.getStackTraceString(new Throwable()));
                x0u.a(v2s.o().f().getApplication(), "SingleRoomManageEngine为空，请关注");
            }
        } else if (ux9Var.t() instanceof SingleRoomManageEngine) {
            return (SingleRoomManageEngine) ux9Var.t();
        }
        return singleRoomManageEngine;
    }

    public static TBLiveDataModel h(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("5d4e7a83", new Object[]{ux9Var});
        }
        SingleRoomManageEngine g = g(ux9Var, false);
        if (g != null) {
            return g.A();
        }
        return null;
    }

    public static bwd i(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("65b6bb22", new Object[]{ux9Var});
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            return f.B();
        }
        return null;
    }

    public static void j(ux9 ux9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b440dfc", new Object[]{ux9Var, new Boolean(z)});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.D(z);
        }
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3332c2", new Object[0]);
        }
    }

    public static void l(ux9 ux9Var, String str, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b98e74b", new Object[]{ux9Var, str, tBLiveDataModel});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.F(ux9Var, str, tBLiveDataModel);
        }
    }

    public static void m(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24469586", new Object[]{ux9Var});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.H();
        }
    }

    public static void n(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4913239b", new Object[]{ux9Var});
            return;
        }
        SingleRoomManageEngine g = g(ux9Var, false);
        if (g != null) {
            g.I();
        }
    }

    public static void o(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c027e9f2", new Object[]{ux9Var});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.J();
        }
    }

    public static void p(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3737f1b0", new Object[]{ux9Var});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.K();
        }
    }

    public static void q(ux9 ux9Var, gtc gtcVar, MessageTypeFilter messageTypeFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470e78a", new Object[]{ux9Var, gtcVar, messageTypeFilter});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.l(gtcVar, messageTypeFilter);
        }
    }

    public static void r(ux9 ux9Var, k9e k9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166c6963", new Object[]{ux9Var, k9eVar});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.M(k9eVar);
        }
    }

    public static void s(ux9 ux9Var, ncc nccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec823cec", new Object[]{ux9Var, nccVar});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.N(nccVar);
        }
    }

    public static void t(ux9 ux9Var, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c34e79", new Object[]{ux9Var, tBLiveDataModel});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.O(tBLiveDataModel);
        }
    }

    public static void u(ux9 ux9Var, gtc gtcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192a93c4", new Object[]{ux9Var, gtcVar});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.a(gtcVar);
        }
    }

    public static void v(ux9 ux9Var, k9e k9eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01d7b0a", new Object[]{ux9Var, k9eVar});
            return;
        }
        SingleRoomManageEngine f = f(ux9Var);
        if (f != null) {
            f.W(k9eVar);
        }
    }
}
