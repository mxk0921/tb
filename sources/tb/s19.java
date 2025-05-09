package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.MtopStatistics;
import tb.t19;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f27745a = 60000;

    static {
        t2o.a(468713619);
    }

    public static void a(uq9 uq9Var, String str, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5771a39", new Object[]{uq9Var, str, map, map2});
        } else {
            i(uq9Var, null, "action", str, map, map2);
        }
    }

    public static void b(uq9 uq9Var, String str, String str2) {
        t19.b o;
        IMTopAdapter mTopAdapter;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9970c6d5", new Object[]{uq9Var, str, str2});
        } else if (!TextUtils.isEmpty(str2) && (o = o(uq9Var)) != null && (mTopAdapter = FluidSDK.getMTopAdapter()) != null) {
            long serverTimeMillis = mTopAdapter.getServerTimeMillis();
            Object d = o.d(str);
            if (d instanceof String) {
                str3 = (String) d;
            } else {
                str3 = "";
            }
            if (str3.length() == 0) {
                str4 = serverTimeMillis + ":" + str2;
                o.nodeFirstTime = serverTimeMillis;
            } else {
                str4 = str3 + "|" + (serverTimeMillis - o.nodeFirstTime) + ":" + str2;
            }
            o.g(str, str4);
        }
    }

    public static void c(uq9 uq9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601d6b90", new Object[]{uq9Var, str});
        } else {
            b(uq9Var, "states", str);
        }
    }

    public static void d(uq9 uq9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe1f39c", new Object[]{uq9Var, str});
        } else {
            b(uq9Var, "nodes", str);
        }
    }

    public static void e(uq9 uq9Var) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c748720", new Object[]{uq9Var});
            return;
        }
        t19.b o = o(uq9Var);
        if (o != null) {
            IMTopAdapter mTopAdapter = FluidSDK.getMTopAdapter();
            if (mTopAdapter != null) {
                j = mTopAdapter.getServerTimeMillis();
            } else {
                j = System.currentTimeMillis();
            }
            o.g("activeTime", String.valueOf(j));
            ncp j2 = ((IDataService) uq9Var.U().getService(IDataService.class)).getConfig().j();
            if (j2 != null) {
                o.g(Constants.Name.AUTO_PLAY, String.valueOf(zk1.e(j2.f)));
            }
            o.startTime = SystemClock.elapsedRealtime();
        }
    }

    public static void f(uq9 uq9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f588f4c9", new Object[]{uq9Var, str});
            return;
        }
        t19.b o = o(uq9Var);
        if (o != null) {
            o.g("contentId", str);
        }
    }

    public static void g(uq9 uq9Var, String str) {
        t19.b d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b67f7b", new Object[]{uq9Var, str});
            return;
        }
        t19 n = n(uq9Var);
        if (n != null && (d = n.d()) != null) {
            d.g("duration", String.valueOf(SystemClock.elapsedRealtime() - d.startTime));
            VideoControllerManager.a g = VideoControllerManager.g(str);
            if (g != null) {
                d.g("OBI", g.a());
                d.g("PDC", Boolean.valueOf(g.f));
            }
            n.b();
            h(uq9Var);
        }
    }

    public static void h(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a30cd3", new Object[]{uq9Var});
        } else {
            uq9Var.T().m(null);
        }
    }

    public static t19.b i(uq9 uq9Var, String str, String str2, String str3, Map<String, Object> map, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("e747bc05", new Object[]{uq9Var, str, str2, str3, map, map2});
        }
        t19 n = n(uq9Var);
        t19.b bVar = null;
        if (!(n == null || n.d() == null)) {
            t19.b d = n.d();
            if (d == null) {
                return null;
            }
            bVar = l(d, str);
            if (bVar == null) {
                bVar = t19.b.b(str).i(str2).f(str3);
                n.a(bVar);
            }
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    bVar.g(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null && !map2.isEmpty()) {
                bVar.c(map2);
            }
        }
        return bVar;
    }

    public static void j(boolean z, t19.b bVar, MtopResponse mtopResponse) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5afdcbd6", new Object[]{new Boolean(z), bVar, mtopResponse});
        } else if (bVar != null) {
            bVar.g("cost", String.valueOf(SystemClock.elapsedRealtime() - bVar.startTime));
            if (z) {
                str = "2";
            } else {
                str = "1";
            }
            bVar.g("state", str);
            if (mtopResponse != null) {
                if (z) {
                    bVar.g("errorCode", mtopResponse.getRetCode());
                    bVar.g("errorMsg", mtopResponse.getRetMsg());
                }
                MtopStatistics mtopStat = mtopResponse.getMtopStat();
                if (mtopStat != null) {
                    bVar.g("eTId", mtopStat.eagleEyeTraceId);
                }
            }
        }
    }

    public static t19.b k(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("8fd300ba", new Object[]{fluidContext});
        }
        t19.b s = s(fluidContext);
        if (s == null) {
            return null;
        }
        s.f("detail");
        return s;
    }

    public static t19.b l(t19.b bVar, String str) {
        List<t19.b> e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("a2f1800d", new Object[]{bVar, str});
        }
        if (!(bVar == null || str == null || (e = bVar.e()) == null || e.size() == 0)) {
            for (t19.b bVar2 : e) {
                if (TextUtils.equals(bVar2.lid, str)) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    public static Map m(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4dc53000", new Object[]{uq9Var});
        }
        t19 n = n(uq9Var);
        if (n == null) {
            return new HashMap();
        }
        return n.c();
    }

    public static t19 n(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19) ipChange.ipc$dispatch("f6248738", new Object[]{uq9Var});
        }
        return uq9Var.T().d();
    }

    public static t19.b o(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("5be628a1", new Object[]{uq9Var});
        }
        t19 n = n(uq9Var);
        if (n != null) {
            return n.d();
        }
        return null;
    }

    public static Map p(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2b3fd3c2", new Object[]{fluidContext});
        }
        t19 q = q(fluidContext);
        if (q == null) {
            return new HashMap();
        }
        return q.c();
    }

    public static t19 q(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19) ipChange.ipc$dispatch("c5626536", new Object[]{fluidContext});
        }
        return ((ITrackService) fluidContext.getService(ITrackService.class)).getPageFastTracker();
    }

    public static void r(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cce847", new Object[]{fluidContext});
        } else if (pto.g(fluidContext) && System.currentTimeMillis() - f27745a >= oau.c() * 1000) {
            t(fluidContext);
            f27745a = System.currentTimeMillis();
        }
    }

    public static t19.b s(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("499ccf09", new Object[]{fluidContext});
        }
        t19 q = q(fluidContext);
        if (q == null) {
            return null;
        }
        t19.b i = t19.b.a().i("request");
        i.g("state", "0");
        return q.a(i);
    }

    public static void t(FluidContext fluidContext) {
        t19.b d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c27d505", new Object[]{fluidContext});
            return;
        }
        t19 q = q(fluidContext);
        if (q != null && (d = q.d()) != null) {
            d.g("duration", String.valueOf(SystemClock.elapsedRealtime() - d.startTime));
            q.b();
        }
    }

    public static t19.b u(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("ca0256e5", new Object[]{fluidContext});
        }
        t19.b s = s(fluidContext);
        if (s == null) {
            return null;
        }
        s.f("recommend");
        return s;
    }

    public static t19.b v(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t19.b) ipChange.ipc$dispatch("4866c8a2", new Object[]{fluidContext});
        }
        t19.b s = s(fluidContext);
        if (s == null) {
            return null;
        }
        s.f("reportNoExpose");
        return s;
    }

    public static void w(uq9 uq9Var, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e2a069", new Object[]{uq9Var, str, str2});
            return;
        }
        t19.b o = o(uq9Var);
        if (o != null && !TextUtils.isEmpty(str)) {
            o.g("lastErrorCode", str);
            o.g("lastErrorContent", str2);
        }
    }

    public static void y(t19.b bVar, MtopBuilder mtopBuilder) {
        w4j mtopContext;
        MtopStatistics mtopStatistics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586aed4b", new Object[]{bVar, mtopBuilder});
        } else if (bVar != null && mtopBuilder != null && (mtopContext = mtopBuilder.getMtopContext()) != null && (mtopStatistics = mtopContext.g) != null) {
            bVar.g("cTId", mtopStatistics.fullTraceId);
        }
    }

    public static void x(uq9 uq9Var, String str) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9799c29c", new Object[]{uq9Var, str});
            return;
        }
        t19.b o = o(uq9Var);
        if (o != null && !TextUtils.isEmpty(str)) {
            Object d = o.d("playerTokens");
            if (d instanceof List) {
                list = (List) d;
            } else {
                list = new ArrayList(2);
            }
            list.add(str);
            o.g("playerTokens", list);
        }
    }
}
