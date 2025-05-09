package tb;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class lp6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317210);
        Pattern.compile("\\{\\{([^\\{\\}]+)\\}\\}");
        Pattern.compile("\\{\\{(.+?)(\\|.+?)?\\}\\}");
        new HashMap();
    }

    public static Object a(JSONObject jSONObject, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("fe1bb0a5", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        String[] split = str.split("\\.");
        for (int i = 0; i < split.length; i++) {
            String str2 = split[i];
            if (str2.contains("[")) {
                int indexOf = str2.indexOf(91);
                String substring = str2.substring(0, indexOf);
                int parseInt = Integer.parseInt(str2.substring(indexOf + 1, str2.length() - 1));
                if (i == split.length - 1) {
                    return jSONObject.getJSONArray(substring).get(parseInt);
                }
                jSONObject = (JSONObject) jSONObject.getJSONArray(substring).get(parseInt);
            } else if (i != split.length - 1) {
                jSONObject = jSONObject.getJSONObject(str2);
                if (jSONObject == null) {
                    tfs.h("getAttribute: " + str + "  " + str2 + " not exist");
                    throw new JSONException("getAttribute: " + str + "  " + str2 + " not exist");
                }
            } else if (jSONObject.containsKey(str2)) {
                return jSONObject.get(str2);
            } else {
                throw new JSONException("getAttribute: " + str + "  " + str2 + " not exist");
            }
        }
        return null;
    }
}
