package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ivp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699171);
    }

    public static HashMap<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("9fa2752f", new Object[]{str});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(",")) {
            String[] split = str2.split("=");
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    public static void b(String str, th5 th5Var, int i, int i2, xea xeaVar) {
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb2d956", new Object[]{str, th5Var, new Integer(i), new Integer(i2), xeaVar});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("item_id", th5Var.e);
        JSONObject jSONObject3 = th5Var.b;
        String str3 = "1";
        if (!(jSONObject3 == null || jSONObject3.getJSONObject("extendVal") == null)) {
            JSONObject jSONObject4 = th5Var.b.getJSONObject("extendVal");
            hashMap.put("itemBizType", jSONObject4.getString("itemBizType"));
            hashMap.put("isYanxuan", jSONObject4.getString("isYanxuan"));
            if (!TextUtils.isEmpty(jSONObject4.getString(yj4.PARAM_PLAY_URL))) {
                hashMap.put("kanjiangjie", str3);
            }
        }
        JSONObject jSONObject5 = th5Var.b;
        if (!(jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("personalityData")) == null || !TextUtils.equals(jSONObject2.getString("goodsSubscribeStatus"), "102"))) {
            hashMap.put("kaijiangtixing", str3);
        }
        qfa.a(hashMap, th5Var.b);
        Map<String, String> map = th5Var.f;
        if (map != null) {
            hashMap.putAll(map);
        }
        if (i >= i2) {
            i -= i2;
        }
        hashMap.put("item_position", String.valueOf(i + 1));
        hashMap.put("item_index", String.valueOf(th5Var.c));
        JSONObject jSONObject6 = th5Var.b.getJSONObject("liveItemStatusData");
        if (jSONObject6 != null) {
            if (jSONObject6.containsKey("isGray")) {
                hashMap.put("isGray", jSONObject6.getString("isGray"));
            }
            if (jSONObject6.containsKey("isDownShelf")) {
                hashMap.put("isDownShelf", jSONObject6.getString("isDownShelf"));
            }
        }
        JSONObject jSONObject7 = th5Var.b.getJSONObject("nativeConfigInfos");
        if (jSONObject7 == null || (jSONObject = jSONObject7.getJSONObject("expansionRedPacket")) == null || jSONObject.isEmpty()) {
            str3 = "0";
        } else {
            ExpansionRPGetter.b(jSONObject, hashMap);
        }
        hashMap.put("is_expansion", str3);
        if (TextUtils.isEmpty(jga.e(xeaVar))) {
            str2 = "";
        } else {
            str2 = jga.e(xeaVar);
        }
        hashMap.put("glopenfrom", str2);
        int i3 = th5Var.f28716a;
        if (i3 == 2) {
            if (kkr.i().o() != null) {
                kkr.i().o().a("GoodsListExchange_RedPacket", (xeaVar == null || xeaVar.r() == null || TextUtils.isEmpty(xeaVar.r().utParams)) ? null : a(xeaVar.r().utParams));
            }
        } else if ((i3 == 7 || i3 == 4) && !TextUtils.isEmpty(th5Var.e) && kkr.i().o() != null) {
            kkr.i().o().a("Show-detail", hashMap);
        }
    }
}
