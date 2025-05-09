package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.subscribe.TBLiveSubscribeRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class smr extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700050);
    }

    public smr(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(smr smrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/subscribe/TBLiveSubscribeBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d280d59", new Object[]{this, str});
            return;
        }
        TBLiveSubscribeRequest tBLiveSubscribeRequest = new TBLiveSubscribeRequest();
        tBLiveSubscribeRequest.requests = str;
        C(1, tBLiveSubscribeRequest, null);
    }
}
