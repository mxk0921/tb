package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.AceSubStrategy;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n9p extends nw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001613);
    }

    public static /* synthetic */ Object ipc$super(n9p n9pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/method/SelectMockMethod");
    }

    /* renamed from: c */
    public Object b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("963513dc", new Object[]{this, jsonRpcRequest});
        }
        JSONObject jSONObject = (JSONObject) jsonRpcRequest.getParams();
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("type");
        String string3 = jSONObject.getString("requestAlias");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
            AceSubStrategy aceSubStrategy = new AceSubStrategy();
            aceSubStrategy.setId(string);
            aceSubStrategy.setStrategyType(string2);
            aceSubStrategy.setRequestParams(new HashMap());
            p80.q(string3, aceSubStrategy);
        }
        return null;
    }
}
