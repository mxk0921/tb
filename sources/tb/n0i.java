package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24427a;
    public final fdb b;

    static {
        t2o.a(745537682);
    }

    public n0i(String str) {
        ckf.h(str, "userId");
        this.f24427a = "homeSnp_".concat(str);
        np cacheForModule = AVFSCacheManager.getInstance().cacheForModule("MyTaobaoV2");
        if (cacheForModule != null) {
            np L = cacheForModule.Z(n0i.class.getClassLoader()).L(new op());
            ckf.c(L, "AVFSCacheManager.getInst…Config(AVFSCacheConfig())");
            fdb w = L.w();
            ckf.c(w, "AVFSCacheManager.getInst…))\n            .fileCache");
            this.b = w;
            return;
        }
        ckf.s();
        throw null;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55371491", new Object[]{this});
        }
        return (String) this.b.d0(this.f24427a);
    }

    public final JSONObject c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        JSONObject jSONObject9;
        JSONObject jSONObject10;
        JSONObject jSONObject11;
        JSONObject jSONObject12;
        JSONObject jSONObject13;
        JSONObject jSONObject14;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ccff42be", new Object[]{this, jSONObject});
        }
        JSONObject parseObject = JSON.parseObject(jSONObject.toJSONString());
        JSONObject jSONObject15 = parseObject.getJSONObject("data");
        if (!(jSONObject15 == null || (jSONObject10 = jSONObject15.getJSONObject("hierarchyData")) == null || (jSONObject11 = jSONObject10.getJSONObject("headerModule")) == null || (jSONObject12 = jSONObject11.getJSONObject("fields")) == null || (jSONObject13 = jSONObject12.getJSONObject("benefit")) == null || (jSONObject14 = jSONObject13.getJSONObject("taoBaoTotalSaving")) == null)) {
            jSONObject14.remove("amountChanges");
        }
        JSONObject jSONObject16 = parseObject.getJSONObject("data");
        if (!(jSONObject16 == null || (jSONObject5 = jSONObject16.getJSONObject("hierarchyData")) == null || (jSONObject6 = jSONObject5.getJSONObject("benefitModule2024V2")) == null || (jSONObject7 = jSONObject6.getJSONObject("fields")) == null || (jSONObject8 = jSONObject7.getJSONObject("benefit")) == null || (jSONObject9 = jSONObject8.getJSONObject("taoBaoTotalSaving")) == null)) {
            jSONObject9.remove("amountChanges");
        }
        JSONObject jSONObject17 = parseObject.getJSONObject("data");
        JSONObject jSONObject18 = (jSONObject17 == null || (jSONObject2 = jSONObject17.getJSONObject("hierarchyData")) == null || (jSONObject3 = jSONObject2.getJSONObject("orderModule")) == null || (jSONObject4 = jSONObject3.getJSONObject("fields")) == null) ? null : jSONObject4.getJSONObject("orderInfo");
        if (jSONObject18 != null) {
            JSONObject jSONObject19 = jSONObject18.getJSONObject(lcl.KEY_ORDER_PAY);
            if (jSONObject19 != null) {
                jSONObject19.put("count", (Object) "0");
            }
            JSONObject jSONObject20 = jSONObject18.getJSONObject(lcl.KEY_ORDER_DELIVER);
            if (jSONObject20 != null) {
                jSONObject20.put("count", (Object) "0");
            }
            JSONObject jSONObject21 = jSONObject18.getJSONObject(lcl.KEY_ORDER_RECEIVE);
            if (jSONObject21 != null) {
                jSONObject21.put("count", (Object) "0");
            }
            JSONObject jSONObject22 = jSONObject18.getJSONObject(lcl.KEY_ORDER_RATE);
            if (jSONObject22 != null) {
                jSONObject22.put("count", (Object) "0");
            }
            JSONObject jSONObject23 = jSONObject18.getJSONObject(lcl.KEY_ORDER_REFUND);
            if (jSONObject23 != null) {
                jSONObject23.put("count", (Object) "0");
            }
        }
        return parseObject;
    }

    public final void d(cr6 cr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c802d9", new Object[]{this, cr6Var});
            return;
        }
        ckf.h(cr6Var, "dataMerger");
        JSONObject i = cr6Var.i();
        if (i != null) {
            this.b.N(this.f24427a, c(i).toJSONString());
        }
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63be9528", new Object[]{this});
        }
        if (MtbGlobalEnv.e() == 1) {
            String b = sf9.b(Globals.getApplication(), "mytaobao/ultron_mtb_2024_v2_thinvip.json");
            ckf.c(b, "FileUtil.getFromAssets(G…tb_2024_v2_thinvip.json\")");
            return b;
        }
        String b2 = sf9.b(Globals.getApplication(), "mytaobao/ultron_mtb_2024_v2.json");
        ckf.c(b2, "FileUtil.getFromAssets(G…ultron_mtb_2024_v2.json\")");
        return b2;
    }
}
