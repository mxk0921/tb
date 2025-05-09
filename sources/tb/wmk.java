package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.detail.LiveDetailRequest;
import com.taobao.taolive.sdk.business.detail.LiveDetailResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wmk extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699539);
    }

    public wmk(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(wmk wmkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/officialLive/OfficialLiveBusiness");
    }

    public void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8957fac", new Object[]{this, str, str2, str3});
            return;
        }
        LiveDetailRequest liveDetailRequest = new LiveDetailRequest();
        liveDetailRequest.liveId = str;
        liveDetailRequest.liveSource = str2;
        liveDetailRequest.entryLiveSource = str3;
        liveDetailRequest.setAPI_NAME(zxg.LIVE_DETAIL_QUERY);
        liveDetailRequest.setVERSION("4.0");
        C(1, liveDetailRequest, LiveDetailResponse.class);
    }
}
