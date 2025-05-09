package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendRequest;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pyg extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699502);
    }

    public pyg(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(pyg pygVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/liveend/LiveEndRecommendBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93f505d", new Object[]{this, str, str2});
            return;
        }
        LiveEndRecommendRequest liveEndRecommendRequest = new LiveEndRecommendRequest();
        liveEndRecommendRequest.liveId = str;
        liveEndRecommendRequest.tppParam = str2;
        C(0, liveEndRecommendRequest, LiveEndRecommendResponse.class);
    }
}
