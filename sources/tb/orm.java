package tb;

import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class orm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final orm INSTANCE = new orm();

    public final Pair<JSONArray, Integer> a(JSONObject jSONObject) {
        JSONArray f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("59b4b12e", new Object[]{this, jSONObject});
        }
        ckf.g(jSONObject, "itemObject");
        JSONArray jSONArray = new JSONArray();
        JSONObject g = srf.g("video", jSONObject, null);
        if (g != null && !g.isEmpty()) {
            String h = srf.h(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL, g, "");
            ckf.f(h, tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL);
            if (!wsq.a0(h)) {
                jSONArray.add(h);
            }
        }
        JSONArray f2 = srf.f("feedPicList", jSONObject, null);
        if (f2 != null) {
            for (Object obj : f2) {
                if (!(obj instanceof JSONObject)) {
                    obj = null;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 != null) {
                    String h2 = srf.h("thumbnail", jSONObject2, "");
                    ckf.f(h2, "imageUrl");
                    if (!wsq.a0(h2)) {
                        jSONArray.add(h2);
                    }
                }
            }
        }
        int size = jSONArray.size();
        JSONObject g2 = srf.g("appendedFeed", jSONObject, null);
        if (!(g2 == null || (f = srf.f("appendFeedPicList", g2, null)) == null)) {
            for (Object obj2 : f) {
                if (!(obj2 instanceof JSONObject)) {
                    obj2 = null;
                }
                JSONObject jSONObject3 = (JSONObject) obj2;
                if (jSONObject3 != null) {
                    String h3 = srf.h("thumbnail", jSONObject3, "");
                    ckf.f(h3, "imageUrl");
                    if (!wsq.a0(h3)) {
                        jSONArray.add(h3);
                    }
                }
            }
        }
        return new Pair<>(jSONArray, Integer.valueOf(size));
    }
}
