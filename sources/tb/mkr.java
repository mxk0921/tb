package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mkr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093365);
    }

    public static int a(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7997dea", new Object[]{arrayList})).intValue();
        }
        if (arrayList == null || arrayList.size() <= 0) {
            return -1;
        }
        if (arrayList.size() == 1) {
            return 0;
        }
        if (arrayList.size() >= 2) {
            return 1;
        }
        return -1;
    }

    public static String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e91bd33", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("liveUrlList");
        ArrayList arrayList = new ArrayList();
        int size = jSONArray == null ? 0 : jSONArray.size();
        for (int i = 0; i < size; i++) {
            arrayList.add((QualitySelectItem) JSON.parseObject(jSONArray.getString(i), QualitySelectItem.class));
        }
        int a2 = a(arrayList);
        if (a2 >= 0) {
            return ((QualitySelectItem) arrayList.get(a2)).flvUrl;
        }
        Object obj = jSONObject.get(yj4.PARAM_MEDIA_INFO_LIVEURL);
        if (obj == null) {
            return null;
        }
        return (String) obj;
    }
}
