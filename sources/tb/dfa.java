package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.GoodRecommendRequest;
import com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.GoodRecommendResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dfa extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698704);
    }

    public dfa(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(dfa dfaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/goodrecommend/GoodRecommendBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b51d64d", new Object[]{this, str});
            return;
        }
        GoodRecommendRequest goodRecommendRequest = new GoodRecommendRequest();
        goodRecommendRequest.liveId = str;
        C(1, goodRecommendRequest, GoodRecommendResponse.class);
    }
}
