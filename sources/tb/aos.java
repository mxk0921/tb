package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aos {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_PARAMS = "bizParams";
    public static final String FROM = "from";
    public static final String ITEM_ID = "itemId";
    public static final String PAYLOAD = "payload";
    public static final String REC_CUBE = "recCube";
    public static final String SELLER_ID = "sellerId";
    public static final String USER_ID = "userId";
    public static final String f = "TTDetailRecommendParams";

    /* renamed from: a  reason: collision with root package name */
    public String f15907a;
    public String b;
    public String c;
    public String d;
    public JSONObject e;

    static {
        t2o.a(354418774);
    }

    public static aos a(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aos) ipChange.ipc$dispatch("eb1a80c8", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("payload");
        if (jSONObject2 == null) {
            return null;
        }
        aos aosVar = new aos();
        String string = jSONObject2.getString("api");
        String string2 = jSONObject2.getString("version");
        String string3 = jSONObject2.getString("channel");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            string = "mtop.taobao.wireless.home.awesome.itemdetail.recommend";
            string2 = "1.0";
            string3 = "detail";
        }
        String str2 = f;
        tgh.b(str2, "api : " + string + ", version : " + string2 + ", channel : " + string3);
        aosVar.f15907a = string;
        aosVar.b = string2;
        aosVar.c = string3;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("bizParams");
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        String string4 = jSONObject2.getString("itemId");
        jSONObject3.put("itemId", (Object) string4);
        jSONObject3.put("sellerId", (Object) jSONObject2.getString("userId"));
        if (TextUtils.isEmpty(jSONObject2.getString("from"))) {
            str = REC_CUBE;
        } else {
            str = jSONObject2.getString("from");
        }
        jSONObject3.put("from", (Object) str);
        aosVar.d = string4;
        aosVar.e = jSONObject3;
        return aosVar;
    }
}
