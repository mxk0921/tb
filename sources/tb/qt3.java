package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qt3 extends nw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001608);
    }

    public static /* synthetic */ Object ipc$super(qt3 qt3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/method/ClearStrategyMethod");
    }

    /* renamed from: c */
    public Object b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("963513dc", new Object[]{this, jsonRpcRequest});
        }
        p80.h();
        oen.a();
        JsonRpcRequest obtainMessage = JsonRpcRequest.obtainMessage("notify.ABTest");
        obtainMessage.setParams(new JSONObject());
        t70.c().k(obtainMessage);
        return null;
    }
}
