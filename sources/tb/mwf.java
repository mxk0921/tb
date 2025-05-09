package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mwf extends wx<JsonRpcRequest, JsonRpcResponse> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001605);
    }

    public mwf(si4<JsonRpcRequest, JsonRpcResponse> si4Var) {
        super(si4Var);
    }

    public static /* synthetic */ Object ipc$super(mwf mwfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/client/JsonRpcClient");
    }

    /* renamed from: e */
    public String a(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1da2f260", new Object[]{this, jsonRpcRequest});
        }
        return JSON.toJSONString(jsonRpcRequest);
    }
}
