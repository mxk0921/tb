package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.dx.hanlerimpl.ExpansionRPGetter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gvp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699170);
    }

    public static HashMap<String, String> b(String str) {
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

    public static void c(th5 th5Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710b6d94", new Object[]{th5Var});
        } else if (th5Var != null && (jSONObject = th5Var.b) != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("growthZone");
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                int a2 = a(th5Var.b);
                if (jSONObject.containsKey("intimacyCoin") && jSONObject.getJSONObject("intimacyCoin") != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("bannerCount", String.valueOf(a2));
                    kkr.i().o().b("pocket-bean-show", hashMap);
                }
                if (jSONObject.containsKey("rightCdp") && jSONObject.getJSONObject("rightCdp") != null) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("rightCdp");
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.put("bannerCount", String.valueOf(a2));
                    hashMap2.put("bizType", jSONObject3.getString("source"));
                    kkr.i().o().b("rightCdp-show", hashMap2);
                    return;
                }
                return;
            }
            String str = "Show-entryquanyi-" + jSONObject2.getString("type");
            HashMap<String, String> hashMap3 = new HashMap<>();
            if (jSONObject2.getJSONObject("utParams") != null) {
                hashMap3.putAll(m3s.b(jSONObject2.getJSONObject("utParams")));
            }
            kkr.i().o().b(str, hashMap3);
        }
    }

    public static void d(String str, th5 th5Var, int i, int i2, xea xeaVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i3 = i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feb2d956", new Object[]{str, th5Var, new Integer(i3), new Integer(i2), xeaVar});
        } else if (wda.G()) {
            ivp.b(str, th5Var, i, i2, xeaVar);
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("item_id", th5Var.e);
            JSONObject jSONObject3 = th5Var.b;
            String str2 = "1";
            if (!(jSONObject3 == null || jSONObject3.getJSONObject("extendVal") == null)) {
                JSONObject jSONObject4 = th5Var.b.getJSONObject("extendVal");
                hashMap.put("itemBizType", jSONObject4.getString("itemBizType"));
                hashMap.put("isYanxuan", jSONObject4.getString("isYanxuan"));
                if (!TextUtils.isEmpty(jSONObject4.getString(yj4.PARAM_PLAY_URL))) {
                    hashMap.put("kanjiangjie", str2);
                }
            }
            JSONObject jSONObject5 = th5Var.b;
            if (!(jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("personalityData")) == null || !TextUtils.equals(jSONObject2.getString("goodsSubscribeStatus"), "102"))) {
                hashMap.put("kaijiangtixing", str2);
            }
            JSONObject jSONObject6 = th5Var.b;
            HashMap<String, String> hashMap2 = null;
            JSONObject jSONObject7 = jSONObject6 != null ? jSONObject6.getJSONObject("nativeConfigInfos") : null;
            if (jSONObject7 == null || (jSONObject = jSONObject7.getJSONObject("expansionRedPacket")) == null || jSONObject.isEmpty()) {
                str2 = "0";
            } else {
                ExpansionRPGetter.b(jSONObject, hashMap);
            }
            hashMap.put("is_expansion", str2);
            qfa.a(hashMap, th5Var.b);
            Map<String, String> map = th5Var.f;
            if (map != null) {
                hashMap.putAll(map);
            }
            if (i3 >= i2) {
                i3 -= i2;
            }
            hashMap.put("item_position", String.valueOf(i3 + 1));
            hashMap.put("item_index", String.valueOf(th5Var.c));
            JSONObject jSONObject8 = th5Var.b.getJSONObject("liveItemStatusData");
            if (jSONObject8 != null) {
                if (jSONObject8.containsKey("isGray")) {
                    hashMap.put("isGray", jSONObject8.getString("isGray"));
                }
                if (jSONObject8.containsKey("isDownShelf")) {
                    hashMap.put("isDownShelf", jSONObject8.getString("isDownShelf"));
                }
            }
            hashMap.put("glopenfrom", TextUtils.isEmpty(jga.e(xeaVar)) ? "" : jga.e(xeaVar));
            int i4 = th5Var.f28716a;
            if (i4 == 8) {
                if (th5Var.b.containsKey("type")) {
                    hashMap.put("type", "top_card_" + th5Var.b.get("type"));
                }
                if (kkr.i().o() != null) {
                    kkr.i().o().b("Show-SpecialSelectExplain", hashMap);
                }
            } else if (i4 == 1) {
                if (kkr.i().o() != null) {
                    kkr.i().o().b("Show-entryquanyi", hashMap);
                    if (ijr.b()) {
                        c(th5Var);
                    }
                }
            } else if (i4 == 2) {
                if (kkr.i().o() != null) {
                    if (!(xeaVar == null || xeaVar.r() == null || TextUtils.isEmpty(xeaVar.r().utParams))) {
                        hashMap2 = b(xeaVar.r().utParams);
                    }
                    kkr.i().o().b("GoodsListExchange_RedPacket", hashMap2);
                }
            } else if ((i4 == 7 || i4 == 4) && !TextUtils.isEmpty(th5Var.e) && kkr.i().o() != null) {
                kkr.i().o().b("Show-detail", hashMap);
            }
            JSONObject jSONObject9 = th5Var.b;
            if (jSONObject9 == null || jSONObject9.getJSONObject("extendVal") == null || TextUtils.isEmpty(th5Var.b.getJSONObject("extendVal").getString(yj4.PARAM_PLAY_URL))) {
                JSONObject jSONObject10 = th5Var.b;
                if (jSONObject10 != null && jSONObject10.getJSONObject("personalityData") != null && "102".equals(th5Var.b.getJSONObject("personalityData").getString("goodsSubscribeStatus")) && kkr.i().o() != null) {
                    kkr.i().o().b("Show-kaijiangtixing", hashMap);
                }
            } else if (kkr.i().o() != null) {
                kkr.i().o().b("Show-kanjiangjie", hashMap);
            }
        }
    }

    public static int a(JSONObject jSONObject) {
        JSONArray jSONArray;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b1038ae", new Object[]{jSONObject})).intValue();
        }
        try {
            if (jSONObject.containsKey("rights") && (jSONArray = jSONObject.getJSONArray("rights")) != null && !jSONArray.isEmpty()) {
                i = 1;
            }
            if (jSONObject.containsKey("rightCdp")) {
                i++;
            }
            return jSONObject.containsKey("intimacyCoin") ? i + 1 : i;
        } catch (Exception unused) {
            return i;
        }
    }
}
