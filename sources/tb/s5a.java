package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.util.TaoHelper;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class s5a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, r4a> f27807a = new ConcurrentHashMap(16);

    static {
        t2o.a(729808945);
    }

    public static String a(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46c92462", new Object[]{z4aVar});
        }
        if (z4aVar == null) {
            return "";
        }
        if (z4a.REC_ORDER_DETAIL.b.equals(z4aVar.b)) {
            return "ORDER_DETAIL_ANDROID";
        }
        if (z4a.REC_LOGISTICS.b.equals(z4aVar.b)) {
            return "WULIU_ANDROID";
        }
        if (z4a.REC_MC_CART.b.equals(z4aVar.b)) {
            return "MAO_CHAO_ANDROID";
        }
        if (z4a.REC_CART.b.equals(z4aVar.b)) {
            return "CART_ANDROID";
        }
        if (z4a.REC_ORDER_LIST.b.equals(z4aVar.b)) {
            return "ORDER_LIST_ANDROID";
        }
        if (z4a.REC_ORDER_LIST_CATAPULT.b.equals(z4aVar.b)) {
            return "ORDER_LIST_CATAPULT_ANDROID";
        }
        if (z4a.REC_FAVORITE.b.equals(z4aVar.b)) {
            return "COLLECTION_ANDROID";
        }
        if (z4a.REC_DIRECT_SALE_CART.b.equals(z4aVar.b)) {
            return "tmallhk_ds_native_taobao_android";
        }
        if (z4a.REC_ORDER_SEARCH_RESULTS.b.equals(z4aVar.b)) {
            return "ORDER_LIST_CATAPULT_ANDROID";
        }
        if (z4a.REC_PAY_SUCCESS.b.equals(z4aVar.b)) {
            return "PAY_SUCCESS_ANDROID";
        }
        if (z4a.REC_CONFIRM_RECEIPT.b.equals(z4aVar.b)) {
            return "CONFIRM_RECEIPT_ANDROID";
        }
        return "";
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e33071", new Object[0]);
        } else {
            ((ConcurrentHashMap) f27807a).clear();
        }
    }

    public static float d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("582e20b9", new Object[]{jSONObject})).floatValue();
        }
        return zjn.c(jSONObject, "windvaneDisplay", 0.2f);
    }

    public static List<String> e(String str) {
        z4a[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6c1878ff", new Object[]{str});
        }
        ArrayList arrayList = new ArrayList(z4a.values().length);
        for (z4a z4aVar : z4a.values()) {
            if (TextUtils.equals(str, z4aVar.b)) {
                arrayList.add(z4aVar.f32522a);
            }
        }
        return arrayList;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e0d7a8", new Object[0]);
        }
        String str = (String) hhg.a("ttid", null);
        return TextUtils.isEmpty(str) ? TaoHelper.getTTID() : str;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9b56f", new Object[0]);
        }
        String str = (String) hhg.a("deviceId", null);
        if (TextUtils.isEmpty(str)) {
            return UTDevice.getUtdid(m0b.c());
        }
        return str;
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        String str = (String) hhg.a("userId", null);
        return TextUtils.isEmpty(str) ? p7p.f() : str;
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76ff1c48", new Object[]{str})).booleanValue();
        }
        if (TextUtils.equals(str, z4a.HOME_MAIN.b) || TextUtils.equals(str, z4a.HOME_INTL.b) || TextUtils.equals(str, z4a.HOME_CUN.b) || TextUtils.equals(str, z4a.HOME_OLD.b) || TextUtils.equals(str, z4a.REC_MAIN.b) || TextUtils.equals(str, z4a.REC_INTL.b) || TextUtils.equals(str, z4a.REC_CUN.b) || TextUtils.equals(str, z4a.REC_OLD.b)) {
            return false;
        }
        return true;
    }

    public static boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e97db6", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        if (TextUtils.equals(str + "_delta", str2)) {
            return true;
        }
        if (TextUtils.equals(str, str2 + "_delta")) {
            return true;
        }
        return false;
    }

    public static long l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fef8b6b5", new Object[]{new Long(j)})).longValue();
        }
        return j + (SDKUtils.getTimeOffset() * 1000);
    }

    public static int c(String str, List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68315fc9", new Object[]{str, list})).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (j(list.get(i).getString("sectionBizCode"), str)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean k(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6fa0208", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == jSONObject2) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || !j(jSONObject.getString("sectionBizCode"), jSONObject2.getString("sectionBizCode"))) {
            return false;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("item");
        JSONObject jSONObject4 = jSONObject2.getJSONObject("item");
        if (jSONObject3 != jSONObject4) {
            if (jSONObject3 == null || jSONObject4 == null || jSONObject3.size() != jSONObject4.size()) {
                return false;
            }
            for (String str : jSONObject3.keySet()) {
                JSONObject jSONObject5 = jSONObject3.getJSONObject(str);
                JSONObject jSONObject6 = jSONObject4.getJSONObject(str);
                if (jSONObject5 == jSONObject6 || (jSONObject5 != null && jSONObject6 != null && TextUtils.equals(jSONObject5.getString("content"), jSONObject6.getString("content")) && TextUtils.equals(jSONObject5.getString(vaj.KEY_SMART_CONTENT), jSONObject6.getString(vaj.KEY_SMART_CONTENT)) && TextUtils.equals(jSONObject5.getString("voiceText"), jSONObject6.getString("voiceText")) && TextUtils.equals(jSONObject5.getString("ext"), jSONObject6.getString("ext")))) {
                }
                return false;
            }
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("subSection");
        JSONObject jSONObject8 = jSONObject2.getJSONObject("subSection");
        if (jSONObject7 != jSONObject8) {
            if (jSONObject7 == null || jSONObject8 == null || jSONObject7.size() != jSONObject8.size()) {
                return false;
            }
            for (String str2 : jSONObject7.keySet()) {
                if (!k(jSONObject7.getJSONObject(str2), jSONObject8.getJSONObject(str2))) {
                    return false;
                }
            }
        }
        if (jSONObject3 == null && jSONObject4 == null && jSONObject7 == null && jSONObject8 == null) {
            if (jSONObject.size() != jSONObject2.size()) {
                return false;
            }
            for (String str3 : jSONObject.keySet()) {
                JSONObject jSONObject9 = jSONObject.getJSONObject(str3);
                JSONObject jSONObject10 = jSONObject2.getJSONObject(str3);
                if (!(jSONObject9 == jSONObject10 || (jSONObject9 != null && jSONObject10 != null && TextUtils.equals(jSONObject9.getString("content"), jSONObject10.getString("content")) && TextUtils.equals(jSONObject9.getString(vaj.KEY_SMART_CONTENT), jSONObject10.getString(vaj.KEY_SMART_CONTENT)) && TextUtils.equals(jSONObject9.getString("voiceText"), jSONObject10.getString("voiceText")) && TextUtils.equals(jSONObject9.getString("ext"), jSONObject10.getString("ext"))))) {
                    return false;
                }
            }
        }
        return true;
    }
}
