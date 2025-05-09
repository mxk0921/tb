package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.ServerConfigs;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.UltronServerConfigResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699184);
        t2o.a(295699178);
    }

    public Map<String, String> a(NetBaseOutDo netBaseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2df6ea66", new Object[]{this, netBaseOutDo});
        }
        if (!(netBaseOutDo instanceof UltronServerConfigResponse)) {
            return null;
        }
        ServerConfigs data = ((UltronServerConfigResponse) netBaseOutDo).getData();
        HashMap hashMap = new HashMap();
        if (data == null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(data.taolivegoodsSmallCard)) {
            JSONObject d = fkx.d(data.taolivegoodsSmallCard);
            if (d != null) {
                b(d);
                data.taolivegoodsSmallCard = d.toJSONString();
            }
            hashMap.put(GLRenderType.SMALL_CARD.pageCode, data.taolivegoodsSmallCard);
        }
        if (!TextUtils.isEmpty(data.taolivegoodsBigCard)) {
            JSONObject d2 = fkx.d(data.taolivegoodsBigCard);
            if (d2 != null) {
                b(d2);
                data.taolivegoodsBigCard = d2.toJSONString();
            }
            hashMap.put(GLRenderType.BIG_CARD.pageCode, data.taolivegoodsBigCard);
        }
        if (!TextUtils.isEmpty(data.taolivegoodspage2)) {
            JSONObject d3 = fkx.d(data.taolivegoodspage2);
            if (d3 != null) {
                b(d3);
                data.taolivegoodspage2 = d3.toJSONString();
            }
            hashMap.put(q2s.FILE_NAME2, data.taolivegoodspage2);
        }
        if (!TextUtils.isEmpty(data.taolivegoodsGL)) {
            JSONObject d4 = fkx.d(data.taolivegoodsGL);
            if (d4 != null) {
                b(d4);
                data.taolivegoodsGL = d4.toJSONString();
            }
            hashMap.put(GLRenderType.GOODS_LIST.pageCode, data.taolivegoodsGL);
        }
        return hashMap;
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449c444e", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            if (jSONObject2 != null && jSONObject3 != null) {
                String string = jSONObject3.getString("root");
                if (!TextUtils.isEmpty(string)) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("__nodeCode", (Object) string);
                    jSONObject4.put("tag", (Object) string);
                    if (!jSONObject2.containsKey(string)) {
                        jSONObject2.put(string, (Object) jSONObject4);
                    }
                }
            }
        }
    }
}
