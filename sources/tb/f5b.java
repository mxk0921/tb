package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f5b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809211);
    }

    public static void a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd6fd6c", new Object[0]);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        f0b.i().s(f0b.HOME_DATA_PROCESS_TRIGGER);
        String k = yyj.e().k();
        imn c = yyj.e().c();
        AwesomeGetContainerData u = c == null ? null : c.u(k);
        if (u == null || u.isEmptySync() || (!vxl.j() && !vxl.a())) {
            yyj.e().C();
            bqa.d(mxl.TAG, "HomepageDataTriggerProcess error ");
            f0b.i().f(f0b.HOME_DATA_PROCESS_TRIGGER);
            return;
        }
        boolean m = a3b.m(u);
        boolean z = !m;
        if (!m) {
            str = "coldStart";
        } else {
            str = s0j.MTS_SUB_STAGE_LOAD_CACHE;
        }
        f0b.i().s(f0b.HOME_RENDER);
        yyj.e().R(z, true, str, new String[]{yyj.e().f(), yyj.e().k()});
        bqa.d(mxl.TAG, "HomepageDataTriggerProcess success thread = " + Thread.currentThread().getName() + " ,type " + str + ",time =" + (System.currentTimeMillis() - currentTimeMillis));
        f0b.i().f(f0b.HOME_DATA_PROCESS_TRIGGER);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffd376", new Object[0]);
        } else {
            a();
        }
    }
}
