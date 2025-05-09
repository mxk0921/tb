package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809401);
    }

    public static void a() {
        AwesomeGetContainerData awesomeGetContainerData;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857b4003", new Object[0]);
            return;
        }
        String k = yyj.e().k();
        imn c = yyj.e().c();
        if (c == null) {
            awesomeGetContainerData = null;
        } else {
            awesomeGetContainerData = c.u(k);
        }
        if (awesomeGetContainerData == null || awesomeGetContainerData.isEmpty()) {
            phg.m("infoFlow_loadCache_triggerLoadCache");
            yyj.e().C();
            phg.l("infoFlow_loadCache_triggerLoadCache");
            fve.e("TriggerAdapter", "loadCacheAdapterProcess 触发缓存加载");
            return;
        }
        phg.m("infoFlow_loadCache_triggerUiRefresh");
        boolean m = a3b.m(awesomeGetContainerData);
        boolean z = !m;
        if (!m) {
            str = "coldStart";
        } else {
            str = s0j.MTS_SUB_STAGE_LOAD_CACHE;
        }
        yyj.e().R(z, true, str, new String[]{k});
        phg.l("infoFlow_loadCache_triggerUiRefresh");
        fve.e("TriggerAdapter", "loadCacheAdapterProcess 触发刷新");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ab, code lost:
        if (r8.equals("PageEnter") == false) goto L_0x004c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(java.lang.String r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.tfu.b(java.lang.String, com.alibaba.fastjson.JSONObject):boolean");
    }
}
