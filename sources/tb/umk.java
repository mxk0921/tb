package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.official.heartbeat.OfficialHeartbeatRequest;
import com.taobao.taolive.sdk.business.official.heartbeat.OfficialHeartbeatResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class umk extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356033);
    }

    public umk(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(umk umkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/official/heartbeat/OfficialHeartbeatBusiness");
    }

    public void K(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79babcab", new Object[]{this, str, str2, str3, str4});
            return;
        }
        OfficialHeartbeatRequest officialHeartbeatRequest = new OfficialHeartbeatRequest();
        officialHeartbeatRequest.encryptAnchorId = str;
        officialHeartbeatRequest.liveId = str2;
        officialHeartbeatRequest.topic = str3;
        officialHeartbeatRequest.exParam = str4;
        C(1, officialHeartbeatRequest, OfficialHeartbeatResponse.class);
    }
}
