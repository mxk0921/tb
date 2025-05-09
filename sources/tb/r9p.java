package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.AceStrategy;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class r9p extends nw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001614);
    }

    public static /* synthetic */ Object ipc$super(r9p r9pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/method/SelectStrategyMethod");
    }

    /* renamed from: c */
    public Object b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("963513dc", new Object[]{this, jsonRpcRequest});
        }
        JSONObject jSONObject = (JSONObject) jsonRpcRequest.getParams();
        String string = jSONObject.getString("name");
        Map<String, String> a2 = qxv.a(jSONObject.getJSONObject("params"));
        AceStrategy aceStrategy = new AceStrategy();
        aceStrategy.setId(jSONObject.getIntValue("id"));
        aceStrategy.setName(string);
        aceStrategy.setParams(a2);
        aceStrategy.setStrategyMap(d(jSONObject.getJSONArray("subStrategies")));
        p80.r(aceStrategy);
        return null;
    }

    public final Map<String, AceSubStrategy> d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("47530c02", new Object[]{this, jSONArray});
        }
        if (jSONArray == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("requestAlias");
            if (!TextUtils.isEmpty(string)) {
                String string2 = jSONObject.getString("id");
                Map<String, String> a2 = qxv.a(jSONObject.getJSONObject("requestParams"));
                AceSubStrategy aceSubStrategy = new AceSubStrategy();
                aceSubStrategy.setId(string2);
                aceSubStrategy.setStrategyType("strategy");
                aceSubStrategy.setRequestParams(a2);
                aceSubStrategy.setUrl(jSONObject.getString("url"));
                hashMap.put(string, aceSubStrategy);
            }
        }
        return hashMap;
    }
}
