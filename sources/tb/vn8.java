package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.mtop.mtoptracker.ExpMonitorRequest;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.fluid.framework.adapter.mtop.a;
import com.taobao.android.fluid.framework.analysis.IAnalysisService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vn8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REASON_LIST_NO_REFRESH = 5;
    public static final int REASON_MTOP_EMPTY = 3;
    public static final int REASON_MTOP_FAIL = 2;
    public static final int REASON_MTOP_NO_DATA = 4;
    public static final int REASON_MTOP_SLOW = 1;
    public static final int REASON_NORMAL = 0;
    public static final int REASON_NOT_REQUEST = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements IMTopAdapter.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void a(MtopResponse mtopResponse, BaseOutDo baseOutDo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ed028ea", new Object[]{this, mtopResponse, baseOutDo});
            }
        }

        @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
        public void onError(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c98ef35", new Object[]{this, mtopResponse});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        @JSONField(name = "lastNoRecDep")
        public int lastNoRecDep;
        @JSONField(name = "lastNoRecReason")
        public int lastNoRecReason;
        @JSONField(name = "listCount")
        public int listCount;
        @JSONField(name = "noRecCount")
        public int noRecCount;
        @JSONField(name = "noRecCountByEmpty")
        public int noRecCountByEmpty;
        @JSONField(name = "noRecCountByFailed")
        public int noRecCountByFailed;
        @JSONField(name = "visitDep")
        public int visitDep;

        static {
            t2o.a(468713593);
        }
    }

    static {
        t2o.a(468713591);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88e02eeb", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableExpMonitor", true);
    }

    public static int b(boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dea1cef2", new Object[]{new Boolean(z), new Boolean(z2), new Integer(i)})).intValue();
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 4;
        }
        return i;
    }

    public static b c(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("e2401734", new Object[]{fluidContext});
        }
        if (!a()) {
            return null;
        }
        b b2 = ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().b();
        if (b2 != null) {
            return b2;
        }
        b bVar = new b();
        ((IAnalysisService) fluidContext.getService(IAnalysisService.class)).getConfig().h(bVar);
        return bVar;
    }

    public static void d(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50acc6eb", new Object[]{fluidContext});
        } else if (pto.g(fluidContext)) {
            e(fluidContext);
        }
    }

    public static void f(FluidContext fluidContext, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b962ba", new Object[]{fluidContext, bVar});
        } else if (bVar != null) {
            bVar.listCount = ((IDataService) fluidContext.getService(IDataService.class)).getTotalCount();
        }
    }

    public static void h(FluidContext fluidContext, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbb2464", new Object[]{fluidContext, new Integer(i)});
            return;
        }
        b c = c(fluidContext);
        if (c != null && c.visitDep < i) {
            c.visitDep = i;
        }
    }

    public static void e(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5024a6d", new Object[]{fluidContext});
            return;
        }
        b c = c(fluidContext);
        if (c != null) {
            f(fluidContext, c);
            ExpMonitorRequest expMonitorRequest = new ExpMonitorRequest();
            expMonitorRequest.sid = com.taobao.android.fluid.business.usertrack.track.ut.videotracker.b.d(fluidContext);
            pep sessionParams = ((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams();
            if (sessionParams != null) {
                expMonitorRequest.source = sessionParams.c;
                expMonitorRequest.type = sessionParams.b;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("recommendResultScene", c);
            String d = hxf.d(hashMap);
            ir9.b("ExpMonitorUtils", "body=" + d);
            expMonitorRequest.body = d;
            FluidSDK.getMTopAdapter().send(a.b.m().s(expMonitorRequest).k(new a()).p(true).j());
        }
    }

    public static void g(FluidContext fluidContext, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("216b45e6", new Object[]{fluidContext, new Integer(i), new Integer(i2)});
            return;
        }
        b c = c(fluidContext);
        if (c != null) {
            c.noRecCount++;
            if (i2 == 2) {
                c.noRecCountByFailed++;
            } else if (i2 == 3) {
                c.noRecCountByEmpty++;
            }
            c.lastNoRecDep = i;
            c.lastNoRecReason = i2;
            ir9.b("ExpMonitorUtils", "setNoRec: dep=" + i + " reason=" + i2);
        }
    }
}
