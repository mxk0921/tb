package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.model.FactorNextRequest;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class fho {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366867);
    }

    public FactorNextResponse a(FactorNextRequest factorNextRequest, HummerGWFacade hummerGWFacade) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FactorNextResponse) ipChange.ipc$dispatch("96ab6915", new Object[]{this, factorNextRequest, hummerGWFacade});
        }
        return hummerGWFacade.forward(factorNextRequest);
    }
}
