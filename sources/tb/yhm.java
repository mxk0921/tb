package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.PopConst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yhm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6ce6113", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public static boolean d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c3a6f47", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 3 || e(i)) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a14a967", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 2 || i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public static boolean f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1bec901", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static JSONObject a(int i, String str, IPopData iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c403f863", new Object[]{new Integer(i), str, iPopData});
        }
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put(PopConst.POP_UPLOAD_DATA_KEY, (Object) iPopData.getUploadData());
        jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) Integer.valueOf(i));
        jSONObject.put("messageId", (Object) str);
        JSONObject clientParams = iPopData.getClientParams();
        if (clientParams.containsKey(PopConst.POP_KEY_TAG_IDS)) {
            jSONObject.put(PopConst.POP_KEY_TAG_IDS, clientParams.remove(PopConst.POP_KEY_TAG_IDS));
        }
        jSONObject.put(PopConst.POP_CLIENT_PARAMS_KEY, (Object) clientParams);
        return jSONObject;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc4554d9", new Object[]{str})).booleanValue();
        }
        return "other".equals(str) || "removePop".equals(str) || "endTime".equals(str) || "confirm".equals(str) || "cancel".equals(str);
    }
}
