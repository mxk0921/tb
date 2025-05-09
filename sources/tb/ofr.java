package tb;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.hourlydelivery.DeliveryBiz;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ofr extends kfr<xfr> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final jfr<xfr> b;

    static {
        t2o.a(440401989);
    }

    public ofr(jfr<xfr> jfrVar) {
        ckf.g(jfrVar, "context");
        this.b = jfrVar;
        c(new xb7());
    }

    public static /* synthetic */ Object ipc$super(ofr ofrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/TBIDeliveryDataEngine");
    }

    /* renamed from: d */
    public xfr a(qd2 qd2Var) {
        JSONObject jSONObject;
        xb7 g;
        xb7 xb7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfr) ipChange.ipc$dispatch("ea0b51", new Object[]{this, qd2Var});
        }
        ckf.g(qd2Var, "bizData");
        JSONObject jSONObject2 = JSON.parseObject(qd2Var.a()).getJSONObject("data");
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("model")) == null || (g = g(jSONObject)) == null || (xb7Var = (xb7) b()) == null) {
            return null;
        }
        xb7Var.h(g.a());
        xb7Var.n(g.d());
        xb7Var.o(g.e());
        xb7Var.p(g.f());
        agr agrVar = agr.INSTANCE;
        Context c = this.b.c();
        String jSONString = jSONObject.toJSONString();
        ckf.f(jSONString, "model.toJSONString()");
        agrVar.b(c, DeliveryBiz.DELIVERY_DX_DATA, jSONString);
        qc4 b = xb7Var.b();
        if (b == null || !b.equals(g.a())) {
            return e(g);
        }
        return null;
    }

    public final JSONObject f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e9c3d28d", new Object[]{this, new Integer(i)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "containerHeight", (String) Integer.valueOf(i));
        jSONObject.put((JSONObject) "data", (String) new JSONArray());
        Uri uri = (Uri) this.b.h().a("outLinkUri");
        if (uri != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(k55.a(uri));
            jSONObject.put((JSONObject) DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, (String) jSONObject2);
            this.b.h().d("outLinkUri", null);
        }
        return jSONObject;
    }

    public final xb7 g(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xb7) ipChange.ipc$dispatch("2a637a3f", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("name");
        Long l = jSONObject.getLong("version");
        long longValue = l != null ? l.longValue() : 0L;
        String string2 = jSONObject.getString("url");
        if (string == null || longValue == 0 || string2 == null) {
            return null;
        }
        qc4 qc4Var = new qc4(string, "dx", string2, longValue);
        String string3 = jSONObject.getString("updatePageName");
        String string4 = jSONObject.getString("updatePageUtParam");
        JSONObject jSONObject2 = jSONObject.getJSONObject(a1v.UPDATE_PAGE_PROPERTIES);
        xb7 xb7Var = new xb7();
        xb7Var.p(string4);
        xb7Var.n(string3);
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                ckf.f(key, "entry.key");
                Object value = entry.getValue();
                if (value == null || (str = value.toString()) == null) {
                    str = "";
                }
                hashMap.put(key, str);
            }
        }
        xb7Var.o(hashMap);
        xb7Var.h(qc4Var);
        return xb7Var;
    }

    public final xfr e(xb7 xb7Var) {
        int i;
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xfr) ipChange.ipc$dispatch("3ef10e9", new Object[]{this, xb7Var});
        }
        ckf.g(xb7Var, "meta");
        xfr xfrVar = new xfr();
        qc4 a2 = xb7Var.a();
        ckf.d(a2);
        String a3 = a2.a();
        xfrVar.b().add(a3);
        HashMap<String, qc4> a4 = xfrVar.a();
        qc4 a5 = xb7Var.a();
        ckf.d(a5);
        a4.put(a3, a5);
        Resources resources = this.b.c().getResources();
        ckf.f(resources, "context.context.resources");
        if (resources.getConfiguration().orientation != 2) {
            z = false;
        }
        if (z) {
            i = ngr.INSTANCE.b(this.b.c());
        } else {
            i = ngr.INSTANCE.a(this.b.c());
        }
        wg5 wg5Var = (wg5) this.b.b().c("dx");
        if (wg5Var != null) {
            if (z) {
                str = "横屏";
            } else {
                str = "竖屏";
            }
            int A = pb6.A(wg5Var.e().a(), this.b.c(), i);
            wfr wfrVar = wfr.INSTANCE;
            wfrVar.d("TBIDeliveryDataEngine", "屏幕方向: " + str + ", 使用尺寸: " + i + ", 适配单位: " + A);
            i = A;
        }
        xfrVar.c().put(a3, new lb4(f(i)));
        return xfrVar;
    }
}
