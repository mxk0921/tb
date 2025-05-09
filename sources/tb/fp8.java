package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONArray f19452a;
    public final JSONArray b = new JSONArray();
    public final JSONArray c;
    public final JSONArray d;
    public long e;

    static {
        t2o.a(310378758);
    }

    public fp8() {
        this.f19452a = new JSONArray();
        this.c = new JSONArray();
        this.d = new JSONArray();
        this.e = 0L;
        Object b = kza.b();
        JSONObject jSONObject = null;
        JSONObject jSONObject2 = b instanceof JSONObject ? (JSONObject) b : null;
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.get("lastRefreshTime") != null) {
                    this.e = jSONObject2.getLong("lastRefreshTime").longValue();
                }
                if (jSONObject2.get("realExpoItemList") != null) {
                    this.c = JSON.parseArray(jSONObject2.getString("realExpoItemList"));
                    this.d = JSON.parseArray(jSONObject2.getString("realExpoItemList"));
                }
            } catch (Exception unused) {
            }
        }
        Object c = kza.c();
        jSONObject = c instanceof JSONObject ? (JSONObject) c : jSONObject;
        if (jSONObject != null) {
            try {
                if (jSONObject.get("lastRefreshTime") != null) {
                    this.e = jSONObject.getLong("lastRefreshTime").longValue();
                }
                if (jSONObject.get("realExpoItemList") != null) {
                    this.f19452a = JSON.parseArray(jSONObject.getString("realExpoItemList"));
                }
            } catch (Exception unused2) {
            }
        }
    }

    public final void a(JSONArray jSONArray, JSONArray jSONArray2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd049f91", new Object[]{this, jSONArray, jSONArray2});
        } else if (jSONArray != null && jSONArray.size() != 0 && jSONArray2 != null) {
            int size = (jSONArray2.size() + jSONArray.size()) - nvs.n0();
            if (size > 0) {
                for (int min = Math.min(size, jSONArray2.size()) - 1; min >= 0; min--) {
                    jSONArray2.remove(min);
                }
            }
            jSONArray2.addAll(jSONArray);
        }
    }

    public final void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d753cda7", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            String string = jSONObject.getString("exposureUrl");
            if (!TextUtils.isEmpty(string)) {
                AlimamaAdvertising.instance().commitIfsExposure(Globals.getApplication(), "tb_live_cpm", string);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5cec78", new Object[]{this});
        } else {
            this.f19452a.clear();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b7bbd41", new Object[]{this});
            return;
        }
        this.f19452a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        kza.f(new JSONObject());
        kza.g(new JSONObject());
    }

    public void e(List<IMTOPDataObject> list, boolean z) {
        DinamicDataObject dinamicDataObject;
        HashMap<String, JSONObject> hashMap;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4241f48f", new Object[]{this, list, new Boolean(z)});
        } else if (list != null && list.size() > 0) {
            for (IMTOPDataObject iMTOPDataObject : list) {
                if (!(!(iMTOPDataObject instanceof DinamicDataObject) || (hashMap = (dinamicDataObject = (DinamicDataObject) iMTOPDataObject).data) == null || hashMap.get("data") == null || (jSONObject = dinamicDataObject.data.get("data")) == null || !(jSONObject.get("cardData") instanceof JSONArray) || (jSONArray = jSONObject.getJSONArray("cardData")) == null || jSONArray.size() <= 0)) {
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        new JSONArray();
                        if (z) {
                            jSONArray2 = j(jSONObject2);
                        } else {
                            jSONArray2 = i(jSONObject2);
                        }
                        a(jSONArray2, this.d);
                        a(jSONArray2, this.b);
                    }
                }
            }
        }
    }

    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f6081b6", new Object[]{this, new Long(j)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lastRefreshTime", (Object) Long.valueOf(j));
        jSONObject.put("realExpoItemList", (Object) JSON.toJSONString(this.c));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lastRefreshTime", (Object) Long.valueOf(j));
        jSONObject2.put("realExpoItemList", (Object) JSON.toJSONString(this.f19452a));
        kza.f(jSONObject);
        kza.g(jSONObject2);
    }

    public void f(DinamicDataObject dinamicDataObject, boolean z, boolean z2) {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5b8c46", new Object[]{this, dinamicDataObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!(dinamicDataObject == null || (hashMap = dinamicDataObject.data) == null)) {
            try {
                JSONObject jSONObject = hashMap.get("data");
                if (jSONObject != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("showMaidian");
                    if (jSONObject2 != null) {
                        String string = jSONObject.getString("trackInfo");
                        HashMap hashMap2 = new HashMap();
                        String string2 = jSONObject2.getString("params");
                        if (TextUtils.isEmpty(string2)) {
                            string2 = "";
                        }
                        hashMap2.putAll(xxv.a(string2));
                        if (!TextUtils.isEmpty(string)) {
                            hashMap2.put("trackInfo", string);
                        }
                        p9m.g(jSONObject2.getString("name"), hashMap2);
                    }
                    String string3 = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                    if (!TextUtils.isEmpty(string3) && string3.equals("taolive_channel_follow_recentwatch")) {
                        g(jSONObject, false, false);
                    } else if (jSONObject.get("cardData") instanceof JSONArray) {
                        JSONArray jSONArray = jSONObject.getJSONArray("cardData");
                        if (jSONArray != null && jSONArray.size() > 0) {
                            for (int i = 0; i < jSONArray.size(); i++) {
                                g(jSONArray.getJSONObject(i), (TextUtils.isEmpty(string3) || !string3.equals("taolive_discovery_recentwatch_2025")) && z, z2);
                            }
                        }
                    } else if (jSONObject.get("cardData") instanceof JSONObject) {
                        g(jSONObject.getJSONObject("cardData"), z, false);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final JSONArray i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("c75c05ad", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("accountInfo");
            String str = "";
            String string = jSONObject2 != null ? jSONObject2.getString("accountId") : str;
            JSONObject jSONObject3 = jSONObject.getJSONObject("liveInfo");
            if (jSONObject3 != null) {
                str = jSONObject3.getString("liveId");
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(bia.UNDER_TAKE_GOODS_LIST);
            if (jSONArray2 == null || jSONArray2.size() <= 0) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("accountId", (Object) string);
                jSONObject4.put("liveId", (Object) str);
                jSONObject4.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
                jSONArray.add(jSONObject4);
            } else {
                for (int i = 0; i < jSONArray2.size(); i++) {
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i);
                    if (jSONObject5 != null) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("accountId", (Object) string);
                        jSONObject6.put("liveId", (Object) str);
                        jSONObject6.put("itemId", (Object) jSONObject5.getString("itemId"));
                        jSONObject6.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
                        jSONArray.add(jSONObject6);
                    }
                }
            }
        }
        return jSONArray;
    }

    public final JSONArray j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ed008015", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject.getJSONObject("accountInfo");
            String str = "";
            String string = jSONObject3 != null ? jSONObject3.getString("accountId") : str;
            JSONObject jSONObject4 = jSONObject.getJSONObject("liveInfo");
            if (jSONObject4 != null) {
                str = jSONObject4.getString("liveId");
            }
            StringBuilder sb = new StringBuilder();
            JSONArray jSONArray2 = jSONObject.getJSONArray(bia.UNDER_TAKE_GOODS_LIST);
            if (jSONArray2 != null && jSONArray2.size() > 0) {
                for (int i = 0; i < jSONArray2.size(); i++) {
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i);
                    if (jSONObject5 != null) {
                        String string2 = jSONObject5.getString("itemId");
                        if (!TextUtils.isEmpty(string2)) {
                            if (i == 0) {
                                sb.append(string2);
                            } else {
                                sb.append(",");
                                sb.append(string2);
                            }
                        }
                    }
                }
            }
            jSONObject2.put("accountId", (Object) string);
            jSONObject2.put("liveId", (Object) str);
            jSONObject2.put("itemId", (Object) sb.toString());
            jSONObject2.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis() / 1000));
            jSONArray.add(jSONObject2);
        }
        return jSONArray;
    }

    public void g(JSONObject jSONObject, boolean z, boolean z2) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbcf224", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2)});
        } else if (jSONObject != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("showMaidian");
            String string = jSONObject.getString("trackInfo");
            JSONObject jSONObject4 = jSONObject.getJSONObject("areaMaidian");
            HashMap hashMap = new HashMap();
            if (jSONObject3 != null) {
                String string2 = jSONObject3.getString("params");
                if (TextUtils.isEmpty(string2)) {
                    string2 = "";
                }
                hashMap.putAll(xxv.a(string2));
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("trackInfo", string);
                }
                if (!(jSONObject4 == null || (jSONObject2 = jSONObject4.getJSONObject("allLive")) == null)) {
                    for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (!lrq.a(key) && (value instanceof String)) {
                            hashMap.put(key, (String) value);
                        }
                    }
                }
                JSONArray jSONArray2 = jSONObject.getJSONArray(bia.UNDER_TAKE_GOODS_LIST);
                if (jSONArray2 != null && jSONArray2.size() > 0) {
                    if (jSONArray2.getJSONObject(0) != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(!TextUtils.isEmpty(jSONArray2.getJSONObject(0).getString("promotionPrice")));
                        sb.append("");
                        hashMap.put("hasPromotionPrice", sb.toString());
                    }
                }
                p9m.g(jSONObject3.getString("name"), hashMap);
                b(jSONObject3);
                if (z) {
                    if (z2) {
                        a(j(jSONObject), this.c);
                        a(j(jSONObject), this.f19452a);
                    } else {
                        JSONArray i = i(jSONObject);
                        a(i, this.c);
                        a(i, this.f19452a);
                    }
                }
            }
            if (z2 && (jSONArray = jSONObject.getJSONArray(bia.UNDER_TAKE_GOODS_LIST)) != null && jSONArray.size() > 0) {
                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                    JSONObject jSONObject5 = jSONArray.getJSONObject(i2).getJSONObject("showMaidian");
                    if (jSONObject5 != null) {
                        String string3 = jSONObject5.getString("params");
                        if (TextUtils.isEmpty(string3)) {
                            string3 = "";
                        }
                        if (!TextUtils.isEmpty(string)) {
                            string3 = string3 + ",trackInfo=" + string;
                        }
                        p9m.f(jSONObject5.getString("name"), string3);
                    }
                }
            }
        }
    }
}
