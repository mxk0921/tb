package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vzj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f30366a;
    public final xzj b;
    public final Set<String> c = new HashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f30367a;
        public final /* synthetic */ d90 b;

        public a(JSONObject jSONObject, d90 d90Var) {
            this.f30367a = jSONObject;
            this.b = d90Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                vzj.b(vzj.this, this.f30367a, this.b);
            }
        }
    }

    static {
        t2o.a(729809792);
        t2o.a(475004944);
    }

    public vzj(imn imnVar, xzj xzjVar) throws GatewayException {
        if (imnVar != null) {
            this.f30366a = imnVar;
            this.b = xzjVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static /* synthetic */ void b(vzj vzjVar, JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2946bb43", new Object[]{vzjVar, jSONObject, d90Var});
        } else {
            vzjVar.f(jSONObject, d90Var);
        }
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab3aa65", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("requestType");
        String string2 = jSONObject.getString("containerId");
        Object obj = jSONObject.get("containerModel");
        vqa g = vqa.k().i("MTopRequest").j(fdv.F_DATA_PROCESS).e("gateway2.uiRefresh.doProcess").g("containerId", string2).g("dataSourceType", jSONObject.getString("dataSourceType"));
        g.g("requestType", string);
        if (this.f30366a.q(yyj.l().f32522a) != null) {
            g.g("scene", "infoFlow");
            ucm.d("dataRefresh").c("scene", "infoFlow").c("requestType", string).e();
        }
        g.a();
        d0b.c();
        boolean booleanValue = jSONObject.getBooleanValue("isSecondReturn");
        if (TextUtils.isEmpty(string2) || obj == null) {
            h(jSONObject);
        } else if (!booleanValue || !yyj.e().o(string2)) {
            e(string2, this.f30366a, jSONObject);
        }
    }

    public final void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8224d5ee", new Object[]{this, jSONObject});
            return;
        }
        String[] b = yyj.e().b(jSONObject);
        if (b != null) {
            for (String str : b) {
                if (vxl.j()) {
                    jSONObject.put("containerId", (Object) str);
                    jSONObject.put("containerModel", (Object) this.f30366a.u(str));
                }
                if (jSONObject.get("containerId") == null) {
                    jSONObject.put("containerId", (Object) str);
                }
                e(str, this.f30366a, jSONObject);
            }
        }
    }

    public final void i(String str, imn imnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5807ec5a", new Object[]{this, str, imnVar, jSONObject});
            return;
        }
        uqb a2 = yyj.e().a(str);
        if (a2 != null) {
            phg.m("uiRefresh_start_" + str);
            a2.h(imnVar, jSONObject);
            phg.l("uiRefresh_finish_" + str);
        }
    }

    public final void f(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5973857b", new Object[]{this, jSONObject, d90Var});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        hrg.e(fdv.F_COMPONENT_RENDER_TAG, "gateway2.uiRefresh", "start action");
        String string = jSONObject.getString("requestType");
        if (TextUtils.equals(string, s0j.MTS_SUB_STAGE_LOAD_CACHE) && !((HashSet) this.c).contains(string)) {
            ((HashSet) this.c).add(string);
            dvh.a(dvh.STAGE_1ST_LOCAL_DATA_UI_REFRESH);
            dvh.m("requestType", "local_data", dvh.c(dvh.TASK_UI_REFRESH));
        } else if (TextUtils.equals(string, "coldStart") && !((HashSet) this.c).contains(string)) {
            ((HashSet) this.c).add(string);
            dvh.a(dvh.STAGE_1ST_NETWORK_DATA_UI_REFRESH);
            dvh.m("requestType", "network_data", dvh.c(dvh.TASK_UI_REFRESH));
            e7n.c(e7n.TAG_COLD_START_REFRESH_START);
        }
        phg.m("NewFaceUIRefreshAction_" + string);
        String string2 = jSONObject.getString("dataSourceType");
        String string3 = jSONObject.getString("containerId");
        String str = "NewFaceUIRefreshAction_" + string + "_" + string3;
        f0b.i().p(str, 1);
        i(string3, this.f30366a, jSONObject);
        if (TextUtils.equals(string2, "local") && TextUtils.equals(string, s0j.MTS_SUB_STAGE_LOAD_CACHE) && this.f30366a.t().get()) {
            ddv.c("UIRefresh", "loadCache_coldstart_ready");
        }
        g(jSONObject);
        p6j.d(string, SystemClock.uptimeMillis() - uptimeMillis, string3, string2);
        if (TextUtils.equals(jSONObject.getString("requestType"), "coldStart")) {
            n7p.s(n7p.STAGE_DRAW_COLD_START_DATA);
        }
        phg.l("NewFaceUIRefreshAction_" + string);
        f0b.i().c(str);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        boolean z;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("requestType");
            String string2 = jSONObject.getString("containerId");
            if (!TextUtils.isEmpty(string2) && yyj.e().c() != null) {
                yyj.e().c().j0(string2, string);
            }
            if (TextUtils.equals(string, s0j.MTS_SUB_STAGE_LOAD_CACHE)) {
                f(jSONObject, d90Var);
                return;
            }
            vxm.b.e().a("disableHomepageUIRefreshOnPagePause", Boolean.valueOf(vxl.b().j()));
            if (vxl.b().r()) {
                z = !TextUtils.isEmpty(string);
            } else {
                z = TextUtils.equals(string, "coldStart");
            }
            if (!vxl.b().r()) {
                i = vxl.b().A();
            } else if (!TextUtils.equals(string, "coldStart") || !TextUtils.equals(jSONObject.getString("containerId"), yyj.e().k())) {
                i = 0;
                bqa.d("gateway2.uiRefresh", "runAfterInteractiveAndPageVisible...containerId:" + jSONObject.getString("containerId") + " , requestType:" + string + " , useQosQueue:" + z + " , doFrameCount:" + i);
                this.b.x(new a(jSONObject, d90Var), string, z, 2, i);
            } else {
                i = vxl.b().A();
            }
            bqa.d("gateway2.uiRefresh", "runAfterInteractiveAndPageVisible...containerId:" + jSONObject.getString("containerId") + " , requestType:" + string + " , useQosQueue:" + z + " , doFrameCount:" + i);
            this.b.x(new a(jSONObject, d90Var), string, z, 2, i);
        }
    }

    public final void e(String str, imn imnVar, JSONObject jSONObject) {
        AwesomeGetContainerData u;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439d8ff1", new Object[]{this, str, imnVar, jSONObject});
            return;
        }
        uqb a2 = yyj.e().a(str);
        if (a2 != null) {
            String string = jSONObject.getString("requestType");
            if (!TextUtils.equals(string, s0j.MTS_SUB_STAGE_LOAD_CACHE) && ((u = imnVar.u(str)) == null || u.getPageNum() != 0)) {
                z = false;
            }
            xpa.a(string, jSONObject.getString("dataChangeType"), z);
            phg.m("uiRefresh_" + str);
            long uptimeMillis = SystemClock.uptimeMillis();
            a2.d(imnVar, jSONObject);
            bqa.d("gateway2.uiRefresh", "uiRefresh cost time : " + (SystemClock.uptimeMillis() - uptimeMillis) + " , containerId : " + str + " , requestType : " + string);
            StringBuilder sb = new StringBuilder("uiRefresh_");
            sb.append(str);
            phg.l(sb.toString());
        }
    }
}
