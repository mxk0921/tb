package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.HomeMainListData;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iza {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f21660a;
    public static JSONArray b;

    static {
        t2o.a(310378674);
    }

    public static JSONObject a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e74f3f1e", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pad", (Object) Boolean.valueOf(sj7.w(context)));
        jSONObject.put("foldDevice", (Object) Boolean.valueOf(sj7.s(context)));
        jSONObject.put("loadImgImprove", (Object) "true");
        jSONObject.put("hasTBLHomeAnimatedView", (Object) "true");
        jSONObject.put("hasLiveEqualAltitude", (Object) "true");
        jSONObject.put("newChannel", (Object) "true");
        jSONObject.put("channelType", (Object) "jingxuan");
        jSONObject.put("channelId", (Object) "0");
        return jSONObject;
    }

    public static void b(b0h b0hVar, Context context, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1fd0cf", new Object[]{b0hVar, context, jSONObject, new Boolean(z)});
            return;
        }
        try {
            HomeMainListData homeMainListData = new HomeMainListData();
            if (jSONObject != null) {
                d(b0hVar, context, homeMainListData, jSONObject.getJSONObject("data"), z);
            }
        } catch (Exception unused) {
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[0]);
            return;
        }
        f21660a = null;
        b = null;
    }

    public static void e(b0h b0hVar, Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60b4f5bf", new Object[]{b0hVar, context, jSONObject});
        } else if (b0hVar != null && context != null && jSONObject != null && b0hVar.q() != null && b0hVar.q().getDinamicSdkManager() != null) {
            b0hVar.q().getDinamicSdkManager().prefetchTemplate(context, jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME), jSONObject);
        }
    }

    public static void d(b0h b0hVar, Context context, HomeMainListData homeMainListData, JSONObject jSONObject, boolean z) {
        JSONArray jSONArray;
        int i = 3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671b6091", new Object[]{b0hVar, context, homeMainListData, jSONObject, new Boolean(z)});
        } else if (jSONObject != null) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("cardList");
            if (jSONArray2.size() == 3) {
                JSONObject a2 = a(context);
                JSONObject jSONObject2 = jSONArray2.getJSONObject(0);
                if (!(jSONObject2 == null || jSONObject2.getJSONArray("cardData") == null || jSONObject2.getJSONArray("cardData").size() <= 0)) {
                    jSONObject2.putAll(a2);
                    jSONObject2.put("isCache", "true");
                    f21660a = jSONObject2;
                    e(b0hVar, context, jSONObject2);
                }
                JSONObject jSONObject3 = jSONArray2.getJSONObject(2);
                if (!(jSONObject3 == null || jSONObject3.getJSONArray("cardData") == null || (jSONArray = jSONObject3.getJSONArray("cardData")) == null || jSONArray.size() <= 0)) {
                    homeMainListData.dataList = new ArrayList();
                    b = new JSONArray();
                    if (!z) {
                        i = 6;
                    }
                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                        jSONObject4.putAll(a2);
                        jSONObject4.put("isCache", "true");
                        b.add(jSONObject4);
                        if (i2 < i) {
                            e(b0hVar, context, jSONObject4);
                        }
                    }
                }
            }
        }
    }
}
