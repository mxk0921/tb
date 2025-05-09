package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a9p extends nw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001612);
    }

    public static /* synthetic */ Object ipc$super(a9p a9pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/method/SelectABTestMethod");
    }

    /* renamed from: c */
    public Object b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("963513dc", new Object[]{this, jsonRpcRequest});
        }
        Map<String, String> map = null;
        for (Map.Entry<String, Object> entry : ((JSONObject) jsonRpcRequest.getParams()).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                map = oen.f(key, value.toString());
            }
        }
        if (map != null) {
            JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.ABTest");
            obtainMessage.setParams((JSON) JSON.toJSON(map));
            t70.c().k(obtainMessage);
        }
        return null;
    }
}
