package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.official.subscribe.OfficialSubscribeRequest;
import com.taobao.taolive.sdk.business.official.subscribe.OfficialSubscribeResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xnk extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356036);
    }

    public xnk(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(xnk xnkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/official/subscribe/OfficialSubscribeBusiness");
    }

    public void K(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        OfficialSubscribeRequest officialSubscribeRequest = new OfficialSubscribeRequest();
        officialSubscribeRequest.encryptAnchorId = str;
        officialSubscribeRequest.liveId = str2;
        officialSubscribeRequest.topic = str3;
        officialSubscribeRequest.exParam = str4;
        C(1, officialSubscribeRequest, OfficialSubscribeResponse.class);
    }
}
