package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o4v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String S_UT_ARG1 = "arg1";
    public static final String S_UT_ARG2 = "arg2";
    public static final String S_UT_ARG3 = "arg3";
    public static final String S_UT_ARGS = "args";
    public static final String S_UT_EVENT_ID = "eventId";
    public static final String S_UT_PAGE_NAME = "page";

    static {
        t2o.a(736100479);
    }

    public static void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5b4b47", new Object[]{jSONObject, new Boolean(z)});
        } else if (z) {
            tm1.a("UTUtils", "addHotStartExposeIntervalArgs, isColdStart");
        } else {
            long f = oh2.e().f();
            if (f == -1) {
                tm1.a("UTUtils", "addHotStartExposeParamArgs, lastHotStartTime -1");
            } else if (jSONObject == null) {
                tm1.a("UTUtils", "addHotStartExposeParamArgs, exposureParam null");
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("args");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                    jSONObject.put("args", (Object) jSONObject2);
                }
                try {
                    jSONObject2.put("hotStartInterval", (Object) Integer.valueOf((int) ((System.currentTimeMillis() - f) / 1000)));
                } catch (Exception e) {
                    tm1.b("UTUtils", "addHotStartExposeParamArgs, error", e);
                }
            }
        }
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b528b986", new Object[]{jSONObject});
        } else if (jSONObject == null || jSONObject.size() <= 0 || !jSONObject.containsKey("page") || !jSONObject.containsKey("eventId")) {
            tm1.a("UTUtils", "UT-commitEvent, illegal trackParams ");
        } else {
            try {
                String string = jSONObject.getString("page");
                String string2 = jSONObject.getString("eventId");
                String string3 = jSONObject.getString("arg1");
                String string4 = jSONObject.getString("arg2");
                String string5 = jSONObject.getString("arg3");
                String c = c(string, jSONObject.getJSONObject("args"));
                TBS.Ext.commitEvent(string, Integer.parseInt(string2), string3, string4, string5, c);
                tm1.a("UTUtils", "UT-commitEvent, pageName = " + string + ", eventId = " + string2 + ", arg1 = " + string3 + ", arg2 = " + string4 + ", arg3 = " + string5 + ", trackString = " + c);
            } catch (Exception e) {
                tm1.b("UTUtils", "UT-commitEvent", e);
            }
        }
    }

    public static String c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eeb5dac2", new Object[]{str, jSONObject});
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.size() != 0) {
                    StringBuilder sb = new StringBuilder(600);
                    for (String str2 : jSONObject.keySet()) {
                        String string = jSONObject.getString(str2);
                        if (!TextUtils.isEmpty(string)) {
                            if (string.length() > 2048) {
                                TBS.Ext.commitEvent(str, 19999, "super_long_args", str2);
                            }
                            sb.append(str2);
                            sb.append("=");
                            sb.append(string);
                            sb.append(",");
                        }
                    }
                    if (sb.length() <= 0) {
                        return "";
                    }
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            } catch (Throwable th) {
                tm1.b("UTUtils", "toTrackString", th);
                return "toTrackString_exception";
            }
        }
        return "";
    }
}
