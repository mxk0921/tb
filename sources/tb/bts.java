package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bts {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118845);
    }

    public static String a(String str, List<String> list, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eba1c7ed", new Object[]{str, list, map});
        }
        if (TextUtils.isEmpty(str)) {
            return "tracking_json_null";
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString(xw0.VIEW_ANIM_KEY_URLS);
            if (!TextUtils.isEmpty(string)) {
                list.addAll(JSON.parseArray(string, String.class));
            }
            String string2 = parseObject.getString(MspDBHelper.BizEntry.COLUMN_NAME_PID);
            String string3 = parseObject.getString("creative_type");
            String string4 = parseObject.getString(y5v.TEMPLATE_ID);
            String string5 = parseObject.getString("event_type");
            String string6 = parseObject.getString("session_id");
            map.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, string2);
            map.put("creative_type", string3);
            map.put(y5v.TEMPLATE_ID, string4);
            map.put("event_type", string5);
            map.put("session_id", string6);
            String str2 = list.size() <= 0 ? "exposure_urlList_empty" : null;
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && !TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
                if (!TextUtils.isEmpty(string6)) {
                    return str2;
                }
            }
            return "exposure_param_empty";
        } catch (Exception e) {
            return Uri.encode(e.getMessage());
        }
    }
}
