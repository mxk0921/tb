package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.util.List;
import tb.v4a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uyj implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f29677a;

    static {
        t2o.a(729809765);
        t2o.a(475004944);
    }

    public uyj(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f29677a = imnVar;
            return;
        }
        throw new GatewayException("RarecmdGatewayDataSource should not be null");
    }

    public final void c(String str, JSONObject jSONObject, d90 d90Var, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0930e2", new Object[]{this, str, jSONObject, d90Var, new Integer(i), str2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        jSONObject2.put("containerId", (Object) str);
        n5a.a(jSONObject2, n5a.c(jSONObject));
        ((v4a.a) d90Var).a("fail", jSONObject2, null);
    }

    public final void d(String str, JSONObject jSONObject, d90 d90Var, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fc3b2c", new Object[]{this, str, jSONObject, d90Var, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("containerId", (Object) str);
        n5a.a(jSONObject2, n5a.c(jSONObject));
        ((v4a.a) d90Var).a("success", jSONObject2, null);
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        String[] b;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null && (b = yyj.e().b(jSONObject)) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("deleteModel");
            for (String str2 : b) {
                if (jSONObject2 == null) {
                    str = "null";
                } else {
                    str = jSONObject2.getString("sectionBizCode");
                }
                bqa.e("gateway2.dataDelete", "start action:", str2, ", ", str);
                if (jSONObject2 == null) {
                    c(str2, jSONObject, d90Var, 1, "deleteModel is null");
                    return;
                }
                AwesomeGetContainerData u = this.f29677a.u(str2);
                List<SectionModel> list = null;
                List<SectionModel> totalData = u == null ? null : u.getTotalData();
                if (totalData != null && !totalData.isEmpty()) {
                    if (b(jSONObject2, totalData)) {
                        try {
                            AwesomeGetContainerInnerData q = this.f29677a.q(str2);
                            List<SectionModel> list2 = q == null ? null : q.sections;
                            if (list2 != null) {
                                list2.remove(jSONObject2);
                            }
                            AwesomeGetContainerInnerData x = this.f29677a.x(str2);
                            if (x != null) {
                                list = x.sections;
                            }
                            if (list != null) {
                                list.remove(jSONObject2);
                            }
                        } catch (Throwable th) {
                            sfh.e("gateway2.dataDelete", "delete base or delta data exception.", th);
                        }
                        d(str2, jSONObject, d90Var, u);
                    } else {
                        c(str2, jSONObject, d90Var, 4, "delete failed");
                    }
                }
            }
            bqa.e("gateway2.dataDelete", "end action");
        }
    }

    public final boolean b(JSONObject jSONObject, List<SectionModel> list) {
        int f;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f2d39c3", new Object[]{this, jSONObject, list})).booleanValue();
        }
        if (list == null || list.isEmpty() || jSONObject == null) {
            return false;
        }
        boolean remove = list.remove(jSONObject);
        if (remove) {
            return remove;
        }
        String string = jSONObject.getString("sectionBizCode");
        if (TextUtils.isEmpty(string) || (f = kmn.f(string, list)) == -1) {
            return remove;
        }
        if (list.remove(f) == null) {
            z = false;
        }
        return z;
    }
}
