package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.sendmsg.MtopTbliveLiveDetailSendUserAtmosphereRequest;
import com.taobao.taolive.sdk.business.sendmsg.MtopTbliveLiveDetailSendUserAtmosphereResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cbp extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356044);
    }

    public cbp(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(cbp cbpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/sendmsg/SendUserAtmosphereBusiness");
    }

    public void K(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f24efee", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        MtopTbliveLiveDetailSendUserAtmosphereRequest mtopTbliveLiveDetailSendUserAtmosphereRequest = new MtopTbliveLiveDetailSendUserAtmosphereRequest();
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setLiveId(str);
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setAnchorId(str2);
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setTopic(str3);
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setSubtype(zqq.h(str4));
        mtopTbliveLiveDetailSendUserAtmosphereRequest.setData(str5);
        C(1, mtopTbliveLiveDetailSendUserAtmosphereRequest, MtopTbliveLiveDetailSendUserAtmosphereResponse.class);
    }
}
