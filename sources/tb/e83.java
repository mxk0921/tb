package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539728);
    }

    public static int a(BaseSectionModel baseSectionModel, List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b445287", new Object[]{baseSectionModel, list})).intValue();
        }
        if (baseSectionModel == null || list == null || list.isEmpty()) {
            return -1;
        }
        int indexOf = list.indexOf(baseSectionModel);
        if (indexOf >= 0) {
            return indexOf;
        }
        return b(baseSectionModel.getSectionBizCode(), list);
    }

    public static int b(String str, List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68315fc9", new Object[]{str, list})).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (e(list.get(i).getSectionBizCode(), str)) {
                return i;
            }
        }
        return -1;
    }

    public static JSONObject c(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("689fd3e0", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getJSONObject(str);
    }

    public static String d(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8df138d7", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString(str);
    }

    public static boolean e(String str, String str2) {
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

    public static String h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1b028285", new Object[]{jSONObject});
        }
        return d(jSONObject, "sectionBizCode");
    }

    public static JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bd92123c", new Object[]{jSONObject});
        }
        return c(jSONObject, "template");
    }
}
