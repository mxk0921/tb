package tb;

import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.internal.config.ConfigServiceNative;
import com.tmall.android.dai.internal.config.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qtf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static qtf f26919a;

    static {
        t2o.a(1034944533);
    }

    public static synchronized qtf a() {
        synchronized (qtf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qtf) ipChange.ipc$dispatch("d6cf99e6", new Object[0]);
            }
            if (f26919a == null) {
                f26919a = new qtf();
            }
            return f26919a;
        }
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bf4f11e", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cecdc64c", new Object[]{this});
            return;
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("jarvis_scenes_v3", "");
        kgh.c("JarvisPkgLoadManagerV3", "reCheckPkgInfoCpp");
        ConfigServiceNative.b(customConfig);
        v24.e().b();
        iwt.e().h();
    }

    public boolean e(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c711eebf", new Object[]{this, h45Var})).booleanValue();
        }
        int registerModel = DAI.registerModel(h45Var);
        f(h45Var);
        if (registerModel == 0) {
            return true;
        }
        return false;
    }

    public final void f(h45 h45Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8007e9d", new Object[]{this, h45Var});
        } else if (h45Var != null) {
            try {
                if (!(h45Var.i() == null || h45Var.i().versions == null)) {
                    Map<String, String> map = h45Var.i().versions;
                    for (String str : map.keySet()) {
                        cxw.b(str, "version", map.get(str));
                    }
                }
            } catch (Throwable th) {
                kgh.d("JarvisPkgLoadManagerV3", "writeModelVersionsToCache err: ", th);
            }
        }
    }

    public h45 c(JSONObject jSONObject) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h45) ipChange.ipc$dispatch("122a3683", new Object[]{this, jSONObject});
        }
        h45 h45Var = new h45();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mix");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("walleConfig");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("solutionConfig");
        prl.e(optJSONObject2, jSONObject);
        prl.e(optJSONObject3, jSONObject);
        prl.e(optJSONObject4, jSONObject);
        h45Var.p(jSONObject.optString("solutionName"));
        h45Var.o(jSONObject.optString("furl"));
        h45Var.n(jSONObject.optString("mmd5"));
        h45Var.m(jSONObject.optString("cln"));
        JSONArray optJSONArray = jSONObject.optJSONArray("trigger");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject5 = optJSONArray.optJSONObject(0);
            if ("jt".equals(optJSONObject5.optString("t"))) {
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(ErrorType.DATA);
                JSONArray optJSONArray2 = optJSONObject6.optJSONArray("pgin");
                h45Var.l = optJSONObject5.optString("id");
                if (optJSONArray2 != null) {
                    String optString = optJSONArray2.optString(0);
                    String optString2 = optJSONObject6.optString("eid");
                    h45Var.f20401a = "" + optString + "#" + optString2;
                }
            } else {
                List parseArray = JSON.parseArray(optJSONArray.toString(), Config.ModelTrigger.class);
                if (parseArray != null) {
                    Iterator it = parseArray.iterator();
                    while (it.hasNext()) {
                        h45Var.a(a.a((Config.ModelTrigger) it.next()));
                    }
                }
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("resource");
        if (optJSONObject7 != null && optJSONObject7.length() > 0) {
            try {
                h45Var.q((Config.ModelResource) JSON.parseObject(optJSONObject7.toString(), Config.ModelResource.class));
            } catch (Exception unused) {
            }
        }
        if (jSONObject.has("extend_info") && (optJSONObject = jSONObject.optJSONObject("extend_info")) != null) {
            h45Var.c = optJSONObject.optString("jarvis_sceneName");
            h45Var.b = optJSONObject.optBoolean("jarvis_isBeta");
            h45Var.d = optJSONObject.optString("matched_condition");
        }
        h45Var.e = jSONObject;
        return h45Var;
    }
}
