package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vyj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xs6 f30344a;

    static {
        t2o.a(487587905);
        t2o.a(475004944);
    }

    public vyj(xs6 xs6Var) throws GatewayException {
        if (xs6Var != null) {
            this.f30344a = xs6Var;
            return;
        }
        throw new GatewayException("dataServiceEngineContext should not be null");
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
            return;
        }
        at6 e = this.f30344a.e();
        if (jSONObject != null && e != null) {
            String e2 = e(jSONObject);
            if (!TextUtils.isEmpty(e2)) {
                JSONObject f = f(jSONObject);
                if (f == null) {
                    c(jSONObject, e2, d90Var, 1, "deleteModel is null");
                    return;
                }
                i65.d("NewFaceDataDeleteAction", "start action:", e2, ", ", f.getString("sectionBizCode"));
                List<SectionModel> g = g(e, e2);
                if (g == null || g.isEmpty()) {
                    c(jSONObject, e2, d90Var, 4, "containerModel is empty");
                    return;
                }
                if (d(f, g)) {
                    b(e.k(e2), f);
                    b(e.m(e2), f);
                    h(jSONObject, e2, d90Var, e.l(e2));
                } else {
                    c(jSONObject, e2, d90Var, 4, "delete failed");
                }
                i65.d("NewFaceDataDeleteAction", "end action");
            }
        }
    }

    public final void b(AwesomeGetContainerInnerData awesomeGetContainerInnerData, JSONObject jSONObject) {
        List<SectionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a072662", new Object[]{this, awesomeGetContainerInnerData, jSONObject});
            return;
        }
        if (awesomeGetContainerInnerData == null) {
            list = null;
        } else {
            list = awesomeGetContainerInnerData.getSections();
        }
        if (list != null) {
            d(jSONObject, list);
        }
    }

    public final void c(JSONObject jSONObject, String str, d90 d90Var, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a1a230e", new Object[]{this, jSONObject, str, d90Var, new Integer(i), str2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("dataSourceType", (Object) "remote");
        o5a.a(jSONObject2, o5a.b(jSONObject));
        ((v4a.a) d90Var).a("fail", jSONObject2, null);
    }

    public final String e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4639fc3d", new Object[]{this, jSONObject});
        }
        String[] a2 = w4a.a(jSONObject);
        if (a2 == null || a2.length != 1) {
            return null;
        }
        return a2[0];
    }

    public final JSONObject f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7fc76942", new Object[]{this, jSONObject});
        }
        return jSONObject.getJSONObject("deleteModel");
    }

    public final List<SectionModel> g(at6 at6Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7dfd3b60", new Object[]{this, at6Var, str});
        }
        AwesomeGetContainerData l = at6Var.l(str);
        if (l == null) {
            return null;
        }
        return l.getTotalData();
    }

    public final void h(JSONObject jSONObject, String str, d90 d90Var, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a67230da", new Object[]{this, jSONObject, str, d90Var, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("dataSourceType", (Object) "remote");
        o5a.a(jSONObject2, o5a.b(jSONObject));
        ((v4a.a) d90Var).a("success", jSONObject2, null);
    }

    public final boolean d(JSONObject jSONObject, List<SectionModel> list) {
        int c;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("386f1f4a", new Object[]{this, jSONObject, list})).booleanValue();
        }
        boolean remove = list.remove(jSONObject);
        if (remove) {
            return remove;
        }
        String string = jSONObject.getString("sectionBizCode");
        if (TextUtils.isEmpty(string) || (c = ot6.c(string, list)) == -1) {
            return remove;
        }
        if (list.remove(c) == null) {
            z = false;
        }
        return z;
    }
}
