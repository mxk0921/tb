package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.recommendLiveItem.LiveItemRecommendRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.business.recommendLiveItem.LiveItemRecommendResponse;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k0h extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698545);
    }

    public k0h(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(k0h k0hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/guide/business/recommendLiveItem/LiveItemRecommendBusiness");
    }

    public void K(HashMap<String, String> hashMap, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf95b85", new Object[]{this, hashMap, jSONArray});
            return;
        }
        LiveItemRecommendRequest liveItemRecommendRequest = new LiveItemRecommendRequest();
        if (hashMap != null) {
            liveItemRecommendRequest.itemId = hashMap.get("itemId");
            liveItemRecommendRequest.liveId = hashMap.get("liveId");
            liveItemRecommendRequest.anchorId = hashMap.get(RequestConfig.KEY_ANCHOR_ID);
            liveItemRecommendRequest.userId = hashMap.get("userId");
            liveItemRecommendRequest.categoryId = hashMap.get("categoryId");
            JSONObject jSONObject = new JSONObject();
            liveItemRecommendRequest.realExpoInfo = jSONObject;
            jSONObject.put("lastRefreshTime", (Object) Long.valueOf(System.currentTimeMillis()));
            liveItemRecommendRequest.realExpoInfo.put("requestInterval", (Object) 0);
            liveItemRecommendRequest.realExpoInfo.put("requestType", (Object) 1);
            int size = jSONArray.size() - 1;
            while (true) {
                if (size >= 0) {
                    if ((jSONArray.get(size) instanceof JSONObject) && ((JSONObject) jSONArray.get(size)).getString("liveId").equals(liveItemRecommendRequest.liveId)) {
                        ((JSONObject) jSONArray.get(size)).put("itemId", (Object) liveItemRecommendRequest.itemId);
                        break;
                    }
                    size--;
                } else {
                    break;
                }
            }
            liveItemRecommendRequest.realExpoInfo.put("realExpoItemList", (Object) jSONArray);
            C(1, liveItemRecommendRequest, LiveItemRecommendResponse.class);
        }
    }
}
