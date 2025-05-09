package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.goods.response.CheckCollectResponseData;
import com.taobao.android.favoritesdk.goods.response.OriginCheckCollectResponseData;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class eq3 implements st6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(463470626);
        t2o.a(463470651);
    }

    @Override // tb.st6
    public Object a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b59d48f7", new Object[]{this, obj});
        }
        if (!(obj instanceof OriginCheckCollectResponseData)) {
            return null;
        }
        CheckCollectResponseData checkCollectResponseData = new CheckCollectResponseData();
        HashMap<String, String> favCheckResult = ((OriginCheckCollectResponseData) obj).getFavCheckResult();
        if (favCheckResult != null && favCheckResult.size() == 1) {
            if (favCheckResult.containsValue("true")) {
                checkCollectResponseData.isFavItem = true;
            } else {
                checkCollectResponseData.isFavItem = false;
            }
        }
        return checkCollectResponseData;
    }
}
