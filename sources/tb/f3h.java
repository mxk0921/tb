package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.goodcard.LiveRecommendGoodCardRequest;
import com.taobao.taolive.room.business.goodcard.LiveRecommendGoodCardResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f3h extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092809);
    }

    public f3h(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(f3h f3hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/goodcard/LiveRecommendGoodCardBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f6db161", new Object[]{this, str});
            return;
        }
        LiveRecommendGoodCardRequest liveRecommendGoodCardRequest = new LiveRecommendGoodCardRequest();
        liveRecommendGoodCardRequest.tppParam = str;
        E(0, liveRecommendGoodCardRequest, LiveRecommendGoodCardResponse.class, true, true);
    }
}
