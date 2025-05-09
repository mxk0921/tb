package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mvv extends nvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(mvv mvvVar) {
        }
    }

    static {
        t2o.a(729809610);
    }

    public mvv(cfc cfcVar) {
        super(cfcVar);
    }

    public static /* synthetic */ Object ipc$super(mvv mvvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/scene/homemainland/invoker/UtInvoker");
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("597fb312", new Object[]{this});
        }
        JSONObject d = e0p.d();
        if (d == null) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "searchBarSection == nul");
            return null;
        }
        JSONObject jSONObject = d.getJSONObject("subSection");
        if (jSONObject == null) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "subSection == nul");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tabBar");
        if (jSONObject2 == null) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "tabBar == nul");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("item");
        if (jSONObject3 == null) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "item == nul");
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("1");
        if (jSONObject4 != null) {
            return jSONObject4.getJSONObject("passOnTrack");
        }
        uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "tabBarSection == nul");
        return null;
    }

    @Override // tb.nvv, tb.e8e
    public Map<String, String> getUpdateNextPageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("37691e90", new Object[]{this});
        }
        JSONObject a2 = a();
        if (a2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            return (Map) JSON.parseObject(a2.toJSONString(), new a(this), new Feature[0]);
        } catch (Exception e) {
            uqa.b(BHRTaskConfigBase.TYPE_CONFIG_UT, "getUpdateNextPageProperties", "出现异常： " + e);
            return hashMap;
        }
    }
}
