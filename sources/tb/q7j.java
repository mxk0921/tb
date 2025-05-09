package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MtopTbliveSeckillLimitCheckRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MtopTbliveSeckillLimitCheckResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q7j extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698894);
    }

    public q7j(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(q7j q7jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/MtopTbliveSeckillLimitCheckBusiness");
    }

    public void K(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e161be", new Object[]{this, str, str2, str3, str4});
            return;
        }
        MtopTbliveSeckillLimitCheckRequest mtopTbliveSeckillLimitCheckRequest = new MtopTbliveSeckillLimitCheckRequest();
        mtopTbliveSeckillLimitCheckRequest.setAnchorId(str);
        mtopTbliveSeckillLimitCheckRequest.setLiveId(str2);
        mtopTbliveSeckillLimitCheckRequest.setItemId(str3);
        mtopTbliveSeckillLimitCheckRequest.setActivityId(str4);
        C(1, mtopTbliveSeckillLimitCheckRequest, MtopTbliveSeckillLimitCheckResponse.class);
    }
}
