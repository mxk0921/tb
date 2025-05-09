package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class pg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f26076a = new HashMap<>();

    public final JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e292bf9b", new Object[]{this, jSONObject});
        }
        ckf.g(jSONObject, "cache");
        JSONObject g = srf.g("aiSummaryRateVO", jSONObject, null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "arrow", "true");
        jSONObject2.put((JSONObject) "bizId", "rate");
        jSONObject2.put((JSONObject) "disableKeywordStaticData", "false");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "rateText", "评价");
        jSONObject2.put((JSONObject) "favorableRate", (String) jSONObject3);
        jSONObject2.put((JSONObject) xka.KEY_LOCATOR_ID, "divisionRate");
        jSONObject2.put((JSONObject) "pageTitle", "评价");
        jSONObject2.put((JSONObject) "supportFavorableRate", "true");
        jSONObject2.put((JSONObject) "title", "评价(200+)");
        jSONObject2.put((JSONObject) "aiSummaryRateVO", (String) g);
        jSONObject2.put((JSONObject) "feedAllCount", qrf.m(jSONObject, "feedAllCount", ""));
        jSONObject2.put((JSONObject) "feedAllCountFuzzy", qrf.m(jSONObject, "feedAllCountFuzzy", ""));
        jSONObject2.put((JSONObject) "firstPageTips", qrf.m(jSONObject, "firstPageTips", ""));
        jSONObject2.put((JSONObject) "firstPageTipsHoverTitle", qrf.m(jSONObject, "firstPageTipsHoverTitle", ""));
        jSONObject2.put((JSONObject) "firstPageTipsHoverDesc", qrf.m(jSONObject, "firstPageTipsHoverDesc", ""));
        jSONObject2.put((JSONObject) "skuFilter", qrf.m(jSONObject, "skuFilter", ""));
        JSONArray f = srf.f("imprItemVOS", jSONObject, new JSONArray());
        ckf.f(f, "JSONUtils.getJSONArray(\"…VOS\", cache, JSONArray())");
        jSONObject2.put((JSONObject) "keywords", (String) (f.size() > 0 ? c(f) : null));
        JSONArray f2 = srf.f("imprNewItemVOS", jSONObject, null);
        if (f2 != null && f2.size() > 0) {
            jSONObject2.put((JSONObject) "newKeywords", (String) f2);
        }
        jSONObject2.put((JSONObject) c4o.KEY_DATA_SOURCE, "cache");
        JSONObject jSONObject4 = new JSONObject();
        JSONObject g2 = srf.g("extraInfo", jSONObject, new JSONObject());
        ckf.f(g2, "JSONUtils.getJSONObject(…fo\", cache, JSONObject())");
        String h = srf.h("showImprNewItem", g2, "false");
        String h2 = srf.h("tabMergeImpr", g2, "false");
        String h3 = srf.h("newRateListV2", g2, "false");
        jSONObject4.put((JSONObject) "showImprNewItem", h);
        jSONObject4.put((JSONObject) "tabMergeImpr", h2);
        jSONObject4.put((JSONObject) "newRateListV2", h3);
        jSONObject4.put((JSONObject) "abDataGet", (String) Boolean.TRUE);
        jSONObject2.put((JSONObject) "abInfo", (String) jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        JSONArray f3 = srf.f("rateList", jSONObject, new JSONArray());
        ckf.f(f3, "JSONUtils.getJSONArray(\"…ist\", cache, JSONArray())");
        jSONObject5.put((JSONObject) "items", (String) b(f3));
        jSONObject2.put((JSONObject) "group", (String) jSONObject5);
        return jSONObject2;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e81e9e7", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "detailRate");
        JSONObject g = srf.g("group", jSONObject, null);
        if (g != null) {
            JSONArray f = srf.f("items", g, null);
            ckf.f(f, "items");
            int size = f.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = f.getJSONObject(i);
                if (jSONObject2 != null) {
                    String h = srf.h("feedId", jSONObject2, "");
                    String h2 = srf.h("headPic", jSONObject2, "");
                    HashMap<String, String> hashMap = this.f26076a;
                    ckf.f(h, "feedId");
                    ckf.f(h2, "headPic");
                    hashMap.put(h, h2);
                }
            }
        }
    }

    public final JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eff75643", new Object[]{this, jSONObject});
        }
        JSONObject g = srf.g("appendedFeed", jSONObject, new JSONObject());
        ckf.f(g, "JSONUtils.getJSONObject(…   JSONObject()\n        )");
        if (g.size() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray h = h("appendFeedPicList", g);
        jSONObject2.put((JSONObject) "content", srf.h("appendedFeedback", g, ""));
        jSONObject2.put((JSONObject) "dateTime", srf.h("createTime", g, ""));
        jSONObject2.put((JSONObject) "timeInterval", srf.h("createTimeInterval", g, ""));
        jSONObject2.put((JSONObject) q0j.SCENE_MEDIA_PLAYER, (String) h);
        f(jSONObject2);
        return jSONObject2;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf70bb87", new Object[]{this, jSONObject});
            return;
        }
        JSONArray f = srf.f(q0j.SCENE_MEDIA_PLAYER, jSONObject, null);
        JSONArray jSONArray = new JSONArray();
        if (f != null) {
            for (Object obj : f) {
                String h = srf.h("type", (JSONObject) obj, "");
                ckf.f(h, "JSONUtils.getString(\"typ…aItem as JSONObject?, \"\")");
                if (TextUtils.equals("image", h)) {
                    jSONArray.add(obj);
                } else if (TextUtils.equals("video", h) && jSONObject != null) {
                    jSONObject.put((JSONObject) "rateVideo", (String) obj);
                }
            }
        }
        if (jSONObject != null) {
            jSONObject.put((JSONObject) "rateImageList", (String) jSONArray);
        }
    }

    public final String g(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("306498a2", new Object[]{this, str, str2});
        }
        ckf.g(str, "url");
        ckf.g(str2, "id");
        return (!this.f26076a.containsKey(str2) || (str3 = this.f26076a.get(str2)) == null || TextUtils.isEmpty(str3)) ? str : str3;
    }

    public final JSONArray h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("83be7af", new Object[]{this, str, jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        JSONArray f = srf.f(str, jSONObject, null);
        if (f != null) {
            for (Object obj : f) {
                if (obj != null) {
                    String h = srf.h("thumbnail", (JSONObject) obj, "");
                    if (!TextUtils.isEmpty(h)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put((JSONObject) "imageUrl", h);
                        jSONObject2.put((JSONObject) "videoUrl", "");
                        jSONObject2.put((JSONObject) "type", "image");
                        jSONArray.add(jSONObject2);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
        }
        JSONObject g = srf.g("video", jSONObject, null);
        if (g != null && g.size() > 0) {
            String h2 = srf.h(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL, g, "");
            if (!TextUtils.isEmpty(h2)) {
                String h3 = srf.h("cloudVideoUrl", g, "");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put((JSONObject) "imageUrl", h2);
                jSONObject3.put((JSONObject) "videoUrl", h3);
                jSONObject3.put((JSONObject) "type", "video");
                jSONArray.add(jSONObject3);
            }
        }
        return jSONArray;
    }

    public final JSONArray c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ccd9f61e", new Object[]{this, jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray != null && jSONArray.size() > 0) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                ckf.f(jSONObject, "imprItemVOS.getJSONObject(i)");
                String h = srf.h("attributeId", jSONObject, "");
                String h2 = srf.h("count", jSONObject, "");
                String h3 = srf.h("status", jSONObject, "");
                String h4 = srf.h("title", jSONObject, "");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "attribute", h);
                jSONObject2.put((JSONObject) "count", h2);
                jSONObject2.put((JSONObject) "type", h3);
                jSONObject2.put((JSONObject) TaoliveSearchHotWords.TYPE_WORD, h4);
                jSONArray2.add(jSONObject2);
            }
        }
        return jSONArray2;
    }

    public final JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("24028e09", new Object[]{this, jSONArray2});
        }
        JSONArray jSONArray3 = new JSONArray();
        if (jSONArray.size() > 0) {
            int f = hfn.f(2, jSONArray.size());
            while (i < f) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String h = srf.h("id", jSONObject2, "");
                String h2 = srf.h("feedback", jSONObject2, "");
                String h3 = srf.h("feedbackTitle", jSONObject2, "");
                String h4 = srf.h("createTime", jSONObject2, "");
                String h5 = srf.h("headPicUrl", jSONObject2, "");
                String h6 = srf.h("skuValueStr", jSONObject2, "");
                String h7 = srf.h("userNick", jSONObject2, "");
                String h8 = srf.h("recomDesc", jSONObject2, "");
                String h9 = srf.h("userStarPic", jSONObject2, "");
                String h10 = srf.h("creditLevel", jSONObject2, "");
                JSONObject g = srf.g("decision", jSONObject2, null);
                ckf.f(jSONObject2, "itemObject");
                JSONArray h11 = h("feedPicList", jSONObject2);
                JSONArray f2 = srf.f("userTagList", jSONObject2, new JSONArray());
                String h12 = srf.h("createTimeInterval", jSONObject2, "");
                JSONObject e = e(jSONObject2);
                jSONObject.put((JSONObject) "feedId", h);
                jSONObject.put((JSONObject) "content", h2);
                jSONObject.put((JSONObject) "title", h3);
                jSONObject.put((JSONObject) "dateTime", h4);
                jSONObject.put((JSONObject) "headPic", h5);
                jSONObject.put((JSONObject) "skuInfo", h6);
                jSONObject.put((JSONObject) "userName", h7);
                jSONObject.put((JSONObject) "userDesc", h8);
                jSONObject.put((JSONObject) "userStarPic", h9);
                jSONObject.put((JSONObject) "memberLevel", h10);
                jSONObject.put((JSONObject) q0j.SCENE_MEDIA_PLAYER, (String) h11);
                jSONObject.put((JSONObject) "userTagList", (String) f2);
                jSONObject.put((JSONObject) "timeInterval", h12);
                jSONObject.put((JSONObject) "decision", (String) g);
                if (e != null) {
                    jSONObject.put((JSONObject) "appendedFeed", (String) e);
                }
                f(jSONObject);
                jSONArray3.add(jSONObject);
                i++;
                jSONArray3 = jSONArray3;
                f = f;
                jSONArray2 = jSONArray;
            }
        }
        return jSONArray3;
    }
}
