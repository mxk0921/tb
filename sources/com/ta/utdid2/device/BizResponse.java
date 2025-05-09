package com.ta.utdid2.device;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Variables;
import com.ta.audid.upload.UtdidKeyFile;
import com.ta.audid.utils.UtdidLogger;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BizResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG_AUDID = "audid";
    private static final String TAG_CODE = "code";
    private static final String TAG_DATA = "data";
    private static final String TAG_UTDID = "utdid";
    public int code = -1;

    static {
        t2o.a(966787125);
    }

    public static boolean isSuccess(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8ebbb87", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i < 0 || i == 10012) {
            return false;
        }
        return true;
    }

    public static BizResponse parseResult(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizResponse) ipChange.ipc$dispatch("baec8520", new Object[]{str});
        }
        BizResponse bizResponse = new BizResponse();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("code")) {
                bizResponse.code = jSONObject2.getInt("code");
            }
            if (jSONObject2.has("data") && (jSONObject = jSONObject2.getJSONObject("data")) != null) {
                if (jSONObject.has("audid")) {
                    String string = jSONObject.getString("audid");
                    if (!TextUtils.isEmpty(string)) {
                        UtdidKeyFile.writeAudidFile(string);
                    }
                }
                if (jSONObject.has("utdid")) {
                    String string2 = jSONObject.getString("utdid");
                    if (UTUtdid.isValidUtdid(string2)) {
                        Context context = Variables.getInstance().getContext();
                        UtdidKeyFile.writeAppUtdidFile(string2);
                        UtdidKeyFile.writeUtdidToSettings(context, string2);
                        UtdidKeyFile.writeSdcardUtdidFile(string2);
                    }
                }
            }
            UtdidLogger.d("BizResponse", "content", str);
        } catch (JSONException e) {
            UtdidLogger.d("", e.toString());
        }
        return bizResponse;
    }
}
