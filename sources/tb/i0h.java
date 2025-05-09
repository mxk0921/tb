package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemPersonalityGetResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i0h extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698885);
    }

    public i0h(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(i0h i0hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/business/LiveItemPersonalityGetBusiness");
    }

    public void K(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6b6a998", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        LiveItemPersonalityGetRequest liveItemPersonalityGetRequest = new LiveItemPersonalityGetRequest();
        liveItemPersonalityGetRequest.itemIds = str;
        liveItemPersonalityGetRequest.creatorId = j;
        liveItemPersonalityGetRequest.liveId = j2;
        C(1, liveItemPersonalityGetRequest, LiveItemPersonalityGetResponse.class);
    }
}
