package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishQueryRequest;
import com.taobao.android.live.plugin.atype.flexalocal.giftwish.GiftWishQueryResponse;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n9a extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698836);
    }

    public n9a(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(n9a n9aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/giftwish/GiftWishQueryBusiness");
    }

    public void K(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736ac84a", new Object[]{this, str, list});
            return;
        }
        GiftWishQueryRequest giftWishQueryRequest = new GiftWishQueryRequest();
        giftWishQueryRequest.liveId = str;
        giftWishQueryRequest.activityTypes = list;
        giftWishQueryRequest.location = rr6.TYPE_BANNER;
        C(1, giftWishQueryRequest, GiftWishQueryResponse.class);
    }
}
