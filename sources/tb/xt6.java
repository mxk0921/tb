package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539596);
    }

    public static boolean a(IContainerDataModel iContainerDataModel) {
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f8ac54e", new Object[]{iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null) {
            return true;
        }
        return base.isAbandoned();
    }
}
