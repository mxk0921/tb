package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.official.unsubscribe.OfficialUnsubscribeRequest;
import com.taobao.taolive.sdk.business.official.unsubscribe.OfficialUnsubscribeResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ynk extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356039);
    }

    public ynk(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(ynk ynkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/official/unsubscribe/OfficialUnsubscribeBusiness");
    }

    public void K(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bf3700", new Object[]{this, str, str2, str3, str4});
            return;
        }
        OfficialUnsubscribeRequest officialUnsubscribeRequest = new OfficialUnsubscribeRequest();
        officialUnsubscribeRequest.encryptAnchorId = str;
        officialUnsubscribeRequest.liveId = str2;
        officialUnsubscribeRequest.topic = str3;
        officialUnsubscribeRequest.exParam = str4;
        C(1, officialUnsubscribeRequest, OfficialUnsubscribeResponse.class);
    }
}
