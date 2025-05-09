package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.growth.GrowthQueryRequest;
import com.taobao.taolive.room.business.growth.GrowthQueryResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ama extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092812);
    }

    public ama(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(ama amaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/growth/GrowthQueryBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d1ff2e3", new Object[]{this, str, str2});
            return;
        }
        GrowthQueryRequest growthQueryRequest = new GrowthQueryRequest();
        growthQueryRequest.liveId = str;
        growthQueryRequest.liveSource = str2;
        C(1, growthQueryRequest, GrowthQueryResponse.class);
    }
}
