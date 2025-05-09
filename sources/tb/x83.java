package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.CardModel;
import com.taobao.android.dressup.common.model.MediaBrowserModel;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class x83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x83 INSTANCE = new x83();

    static {
        t2o.a(918552656);
    }

    public final CardModel a(qpu qpuVar, Map<String, ? extends Object> map) {
        CardModel cardModel;
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardModel) ipChange.ipc$dispatch("1327a326", new Object[]{this, qpuVar, map});
        }
        ckf.g(qpuVar, "context");
        ckf.g(map, "data");
        Object obj2 = map.get("renderMode");
        if (ckf.b(obj2 != null ? obj2.toString() : null, "dx") && map.get("dx") != null) {
            cardModel = new l18();
        } else if (ckf.b(map.get("type"), "dressingContentBannerComponent")) {
            Object j = mqu.Companion.j(map, "data.content.elements");
            if (!(j instanceof List)) {
                j = null;
            }
            cardModel = MediaBrowserModel.Companion.d(qpuVar, (List) j);
        } else {
            cardModel = new CardModel();
        }
        Object obj3 = map.get("type");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        cardModel.setType((String) obj3);
        Object obj4 = map.get("data");
        if (!(obj4 instanceof Map)) {
            obj4 = null;
        }
        cardModel.setData((Map) obj4);
        Object obj5 = map.get("trackInfo");
        if (!(obj5 instanceof Map)) {
            obj5 = null;
        }
        cardModel.setTrackInfo((Map) obj5);
        if (cardModel instanceof l18) {
            Object obj6 = map.get("dx");
            if (!(obj6 instanceof Map)) {
                obj6 = null;
            }
            Map map2 = (Map) obj6;
            if (map2 != null) {
                Object obj7 = map2.get("name");
                String obj8 = obj7 != null ? obj7.toString() : null;
                Object obj9 = map2.get("version");
                Long o = (obj9 == null || (obj = obj9.toString()) == null) ? null : ssq.o(obj);
                Object obj10 = map2.get("url");
                String obj11 = obj10 != null ? obj10.toString() : null;
                if (!TextUtils.isEmpty(obj8) && o != null && !TextUtils.isEmpty(obj11)) {
                    l18 l18Var = (l18) cardModel;
                    ckf.d(obj8);
                    l18Var.f(obj8);
                    l18Var.h(o.longValue());
                    ckf.d(obj11);
                    l18Var.g(obj11);
                    Map<String, Object> data = l18Var.getData();
                    if (data == null) {
                        data = a.h();
                    }
                    l18Var.e(new JSONObject(data));
                }
            }
            return null;
        }
        return cardModel;
    }
}
