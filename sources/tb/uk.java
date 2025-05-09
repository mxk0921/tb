package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ucp.bridge.NativeBroadcast;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740487);
    }

    public static void b(kk kkVar, vpq vpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fbac41c", new Object[]{kkVar, vpqVar});
            return;
        }
        ok g = kkVar.g();
        g.t(true);
        if (vpqVar != null) {
            g.n(vpqVar.f());
            g.u(vpqVar.c());
            g.p(vpqVar.b());
            g.o(vpqVar.a());
            g.w(vpqVar.e());
            g.v(vpqVar.d());
        }
    }

    public static void c(String str, ok okVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980f6ca9", new Object[]{str, okVar});
        } else {
            ck.g().e(str, ck.b.b().i("AURA/performance").h("uiThread", ao.a()).d("requestStart", okVar.g()).d("requestStartEndTime", System.nanoTime() / 1000000).d("requestEnd", okVar.b()).d("requestTotalCost", okVar.a()).d("parseData", okVar.e()).d(NativeBroadcast.SWITCH_THREAD, okVar.j()).a());
        }
    }

    public static void a(ok okVar, int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc59494", new Object[]{okVar, new Integer(i), new Long(j), new Long(j2)});
        } else if (i == 0) {
            okVar.s(j);
            okVar.m(j2);
        } else if (i != 1) {
            if (i == 2 && okVar.j() <= 0 && j2 - j > 0) {
                okVar.w(j);
                okVar.v(j2);
                hl.a("增加线程切换埋点：" + okVar.j() + "ms");
            }
        } else if (okVar.e() <= 0 && j2 - j > 0) {
            okVar.p(j);
            okVar.o(j2);
            hl.a("增加解析埋点：" + okVar.e() + "ms");
        }
    }
}
