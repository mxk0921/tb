package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.preload.business.PreloadRecommendRequest;
import com.taobao.android.tab2liveroom.liveroom.preload.business.PreloadRecommendResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lsm extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092161);
    }

    public lsm(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(lsm lsmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/preload/business/PreloadRecommendBusiness");
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82666fba", new Object[]{this});
        } else {
            C(1, new PreloadRecommendRequest(), PreloadRecommendResponse.class);
        }
    }
}
