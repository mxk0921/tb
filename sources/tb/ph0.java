package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ph0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809238);
    }

    public static hh0 a(arb arbVar, List<ISubService> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hh0) ipChange.ipc$dispatch("e422755", new Object[]{arbVar, list});
        }
        if (arbVar == null) {
            return null;
        }
        if (TextUtils.equals(arbVar.getContainerId(), z4a.REC_ORDER_LIST.f32522a) || TextUtils.equals(arbVar.getContainerId(), z4a.REC_ORDER_LIST_CATAPULT.f32522a)) {
            return new ndl(arbVar);
        }
        if (TextUtils.equals(arbVar.getContainerId(), z4a.REC_CART.f32522a)) {
            return new krp(arbVar);
        }
        if (!zn4.c(arbVar.getContainerId())) {
            return new hh0(arbVar);
        }
        mz7 mz7Var = new mz7(arbVar);
        if (list == null || list.isEmpty()) {
            return mz7Var;
        }
        mz7Var.g(list);
        return mz7Var;
    }
}
