package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class es0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1032847392);
    }

    public static fs0 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("a011bb0e", new Object[]{str});
        }
        String e = emp.e("edlpCacheKey_" + str, "");
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return a(new JSONObject(e));
        } catch (Throwable th) {
            th.printStackTrace();
            TLog.loge("ConvertUtil", "getCacheAlienInfo error " + Log.getStackTraceString(th));
            return null;
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee17b933", new Object[]{str, str2});
        } else if (!TextUtils.isEmpty(str2)) {
            emp.b("edlpCacheKey_" + str, str2);
        }
    }

    public static fs0 a(JSONObject jSONObject) {
        String str;
        Throwable th;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        String str9;
        String str10;
        String str11;
        String str12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fs0) ipChange.ipc$dispatch("265cc5b3", new Object[]{jSONObject});
        }
        fs0 fs0Var = null;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("result");
            if (optJSONObject == null) {
                try {
                    TLog.loge("ConvertUtil", " convertAlienInfo error result is null  " + jSONObject);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    str = "ConvertUtil";
                }
            } else {
                JSONArray optJSONArray = optJSONObject.optJSONArray("sections");
                if (optJSONArray != null) {
                    try {
                        if (optJSONArray.length() != 0) {
                            JSONObject jSONObject5 = optJSONArray.getJSONObject(0).getJSONObject("item").getJSONObject("0");
                            JSONObject optJSONObject2 = jSONObject5.optJSONObject("clickParam");
                            JSONObject optJSONObject3 = jSONObject5.optJSONObject(i2b.TRACK_EXPOSURE_PARAM);
                            JSONObject optJSONObject4 = jSONObject5.optJSONObject("passOnTrack");
                            JSONObject jSONObject6 = jSONObject5.getJSONObject("newContent");
                            jSONObject6.optJSONObject("utParams");
                            JSONObject optJSONObject5 = jSONObject6.optJSONObject("tabInfo");
                            long optLong = jSONObject6.optLong("version");
                            if (optJSONObject5 != null) {
                                String optString = optJSONObject5.optString("overlayMode");
                                String optString2 = optJSONObject5.optString("staticImg");
                                String optString3 = optJSONObject5.optString("strangeImg");
                                String optString4 = optJSONObject5.optString("selectedImg");
                                String optString5 = optJSONObject5.optString("brokenWindowDegrade");
                                int parseInt = Integer.parseInt(optJSONObject5.optString("animationLimitCount"));
                                String optString6 = optJSONObject5.optString("strangeInterval");
                                String optString7 = optJSONObject5.optString("staticInterval");
                                String optString8 = optJSONObject5.optString("animationMode");
                                String optString9 = optJSONObject5.optString(pg1.ATOM_EXT_animationDuration);
                                String optString10 = optJSONObject5.optString(l2o.COL_TASK);
                                int parseInt2 = Integer.parseInt(optJSONObject5.optString("promotionCount"));
                                str10 = optString;
                                str5 = optString8;
                                str4 = optString9;
                                jSONObject2 = optJSONObject2;
                                jSONObject3 = optJSONObject3;
                                str7 = optString3;
                                i = parseInt2;
                                str11 = optString4;
                                str2 = optString5;
                                str9 = optString6;
                                str = "ConvertUtil";
                                i2 = parseInt;
                                str8 = optString7;
                                jSONObject4 = optJSONObject4;
                                str6 = optString2;
                                str3 = optString10;
                            } else {
                                str5 = "fadeUpDown";
                                str4 = "0.8";
                                str8 = "2.4";
                                str2 = "false";
                                str = "ConvertUtil";
                                jSONObject2 = optJSONObject2;
                                jSONObject3 = optJSONObject3;
                                jSONObject4 = optJSONObject4;
                                str10 = null;
                                i2 = -1;
                                str7 = null;
                                str6 = null;
                                str3 = null;
                                i = 0;
                                str9 = str8;
                                str11 = null;
                            }
                            try {
                                JSONObject optJSONObject6 = jSONObject6.optJSONObject("popExtInfo");
                                JSONObject optJSONObject7 = jSONObject6.optJSONObject("tabData");
                                drs drsVar = new drs();
                                if (optJSONObject7 != null) {
                                    str12 = str3;
                                    drsVar.f18031a = optJSONObject7.optString("targetUrl");
                                    drsVar.b = optJSONObject7.optString("type");
                                    drsVar.f = optJSONObject7.optString("zCachePackageName");
                                } else {
                                    str12 = str3;
                                }
                                JSONObject optJSONObject8 = jSONObject6.optJSONObject(MtopAbility.API_REQUEST_DATA);
                                if (optJSONObject8 != null) {
                                    drsVar.c = optJSONObject8.optString("api");
                                    drsVar.d = optJSONObject8.optString("version");
                                    drsVar.e = optJSONObject8.optString("paramsData");
                                    drsVar.g = optJSONObject8.optString("extParams");
                                    drsVar.h = optLong;
                                }
                                boolean z = !TextUtils.isEmpty(str2) && "true".equals(str2);
                                fs0 fs0Var2 = new fs0();
                                try {
                                    fs0Var2.i = str7;
                                    fs0Var2.f19495a = str6;
                                    fs0Var2.h = str11;
                                    fs0Var2.b = str10;
                                    fs0Var2.c = str9;
                                    fs0Var2.d = str8;
                                    fs0Var2.e = str4;
                                    fs0Var2.f = Boolean.valueOf(z);
                                    fs0Var2.g = str5;
                                    fs0Var2.j = i2;
                                    fs0Var2.k = str12;
                                    fs0Var2.l = i;
                                    fs0Var2.m = optJSONObject6;
                                    fs0Var2.n = drsVar;
                                    fs0Var2.o = jSONObject2;
                                    fs0Var2.p = jSONObject3;
                                    fs0Var2.q = jSONObject4;
                                    return fs0Var2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    fs0Var = fs0Var2;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                fs0Var = null;
                                TLog.loge(str, " convertAlienInfo error " + jSONObject);
                                TLog.loge(str, "服务端下发的tabInfo外部数据错误或者解析错误或者构造异形类出错" + Log.getStackTraceString(th));
                                return fs0Var;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        str = "ConvertUtil";
                    }
                }
                return null;
            }
        } catch (Throwable th6) {
            th = th6;
            str = "ConvertUtil";
        }
        TLog.loge(str, " convertAlienInfo error " + jSONObject);
        TLog.loge(str, "服务端下发的tabInfo外部数据错误或者解析错误或者构造异形类出错" + Log.getStackTraceString(th));
        return fs0Var;
    }
}
