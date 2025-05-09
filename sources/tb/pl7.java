package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.mytaobao.base.MtbGlobalEnv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pl7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537702);
    }

    public final void a(JSONObject jSONObject, cr6 cr6Var, cr6 cr6Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("962b099d", new Object[]{this, jSONObject, cr6Var, cr6Var2});
            return;
        }
        ckf.h(jSONObject, "hierarchyData");
        ckf.h(cr6Var, "newData");
        for (String str : jSONObject.keySet()) {
            if (MtbGlobalEnv.h() || ckf.b(str, "basementTip")) {
                ckf.c(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
                JSONObject e = cr6Var.e(str);
                if (e != null) {
                    JSONObject e2 = cr6Var2 != null ? cr6Var2.e(str) : null;
                    if (c(e, e2)) {
                        e.put((JSONObject) "diffLoadIdentify", b(str));
                    } else {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                        JSONObject j = cr6Var2 != null ? cr6Var2.j(str) : null;
                        ckf.c(jSONObject2, "newOriginData");
                        if (d(jSONObject2, j)) {
                            e.put((JSONObject) "diffLoadIdentify", b(str));
                        } else if (e2 != null) {
                            e.put((JSONObject) "diffLoadIdentify", (String) e2.get("diffLoadIdentify"));
                        } else {
                            ckf.s();
                            throw null;
                        }
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.c(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
                JSONObject e3 = cr6Var.e(str);
                if (e3 != null) {
                    e3.put((JSONObject) "diffLoadIdentify", b(str));
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a382ae63", new Object[]{this, str});
        }
        ckf.h(str, AliFestivalWVPlugin.PARAMS_MODULE_NAME);
        return str + System.currentTimeMillis();
    }

    public final boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda8bb1c", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject("fields")) == null) {
            return true;
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject("fields");
        if (jSONObject4 != null) {
            return !ckf.b(jSONObject3, jSONObject4);
        }
        ckf.s();
        throw null;
    }

    public final boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cd3b9e99", new Object[]{this, jSONObject, jSONObject2})).booleanValue();
        }
        return jSONObject2 == null || !ckf.b(jSONObject.getString("name"), jSONObject2.getString("name")) || !ckf.b(jSONObject.getString("url"), jSONObject2.getString("url")) || !ckf.b(jSONObject.getString("version"), jSONObject2.getString("version")) || !ckf.b(jSONObject.getString("containerType"), jSONObject2.getString("containerType"));
    }
}
