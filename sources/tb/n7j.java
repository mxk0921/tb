package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillBusinessThresholdGetRequest;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillBusinessThresholdGetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n7j extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092584);
    }

    public n7j(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(n7j n7jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/detail/MtopTbliveSeckillBusinessThresholdGetBusiness");
    }

    public void K(String str, String str2, long j, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e0679a4", new Object[]{this, str, str2, new Long(j), str3});
            return;
        }
        MtopTbliveSeckillBusinessThresholdGetRequest mtopTbliveSeckillBusinessThresholdGetRequest = new MtopTbliveSeckillBusinessThresholdGetRequest();
        mtopTbliveSeckillBusinessThresholdGetRequest.setAnchorId(str);
        mtopTbliveSeckillBusinessThresholdGetRequest.setLiveId(str2);
        mtopTbliveSeckillBusinessThresholdGetRequest.setItemId(String.valueOf(j));
        mtopTbliveSeckillBusinessThresholdGetRequest.setRecordId(str3);
        C(1, mtopTbliveSeckillBusinessThresholdGetRequest, MtopTbliveSeckillBusinessThresholdGetResponse.class);
    }
}
