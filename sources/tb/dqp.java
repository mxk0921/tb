package tb;

import android.net.Uri;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    static {
        t2o.a(766510156);
    }

    public static void a(ShopDataParser shopDataParser, JSONObject jSONObject, Map<String, String> map, Bundle bundle, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7172d2c7", new Object[]{shopDataParser, jSONObject, map, bundle, aVar, new Boolean(z)});
        } else if (bundle != null && jSONObject != null) {
            try {
                Uri.parse(shopDataParser.u1().getJSONArray(0).getJSONObject(0).getJSONObject("payload").getJSONObject("source").getString("url")).getQueryParameter(pl4.KEY_PAGE_ID);
            } catch (Exception e) {
                try {
                    e.printStackTrace();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
