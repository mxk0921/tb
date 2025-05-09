package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.detail.checkforeground.CheckForeGroundRequest;
import com.taobao.taolive.sdk.business.detail.checkforeground.CheckForeGroundResponse;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iq3 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355998);
    }

    public iq3(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(iq3 iq3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/detail/checkforeground/CheckForeGroundBusiness");
    }

    public void K(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ecf1e7", new Object[]{this, list});
            return;
        }
        CheckForeGroundRequest checkForeGroundRequest = new CheckForeGroundRequest();
        checkForeGroundRequest.liveIdList = list;
        C(1, checkForeGroundRequest, CheckForeGroundResponse.class);
    }
}
