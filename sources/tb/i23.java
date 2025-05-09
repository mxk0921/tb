package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i23 extends BasePreloadTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714697);
    }

    public i23(FluidContext fluidContext, Context context, JSONObject jSONObject, grm grmVar) {
        super(fluidContext, context, jSONObject, grmVar);
    }

    public static /* synthetic */ Object ipc$super(i23 i23Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return i23Var.toString();
            case -798600422:
                return i23Var.getPreloadVideoData();
            case -512593800:
                return i23Var.getContext();
            case 299334352:
                i23Var.a((ntm) objArr[0], (sv2) objArr[1]);
                return null;
            case 462157602:
                return new Boolean(i23Var.b((JSONObject) objArr[0]));
            case 1777338802:
                i23Var.n((String) objArr[0], objArr[1]);
                return null;
            case 2019319885:
                return i23Var.i();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/task/CancelPreloadTask");
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void c(sv2<ntm> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d7286e", new Object[]{this, sv2Var});
        } else if (sv2Var != null) {
            sv2Var.a(null);
        }
    }
}
