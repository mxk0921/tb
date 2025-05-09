package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.cmic.sso.sdk.a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0O00o0 {
    private a O000000o;

    public void O000000o(Context context, String str, a aVar) {
        JSONArray jSONArray;
        StackTraceElement[] stackTrace;
        String str2 = "";
        try {
            O0O000o a2 = aVar.a();
            String O00000Oo = O0O0OOO.O00000Oo(context);
            a2.O00000o(str);
            a2.O0000oOo(aVar.b("loginMethod", str2));
            a2.O0000o(aVar.b("isCacheScrip", false) ? "scrip" : "pgw");
            a2.O0000Oo0(O0O0OOO.O000000o(context));
            if (!TextUtils.isEmpty(O00000Oo)) {
                str2 = O00000Oo;
            }
            a2.O0000Oo(str2);
            O000000o(a2, aVar);
            if (a2.O000000o.size() > 0) {
                jSONArray = new JSONArray();
                Iterator<Throwable> it = a2.O000000o.iterator();
                while (it.hasNext()) {
                    Throwable next = it.next();
                    StringBuffer stringBuffer = new StringBuffer();
                    JSONObject jSONObject = new JSONObject();
                    for (StackTraceElement stackTraceElement : next.getStackTrace()) {
                        stringBuffer.append("\n");
                        stringBuffer.append(stackTraceElement.toString());
                    }
                    jSONObject.put("message", next.toString());
                    jSONObject.put(pg1.ATOM_stack, stringBuffer.toString());
                    jSONArray.put(jSONObject);
                }
                a2.O000000o.clear();
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                a2.O000000o(jSONArray);
            }
            O0O0O.O000000o("SendLog", "登录日志");
            O000000o(a2.O00000Oo(), aVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void O000000o(O0O000o o0O000o, a aVar) {
        if (o0O000o != null && aVar != null) {
            o0O000o.O00000Oo(aVar.b(HiAnalyticsConstant.HaKey.BI_KEY_APPID, ""));
            o0O000o.O00000oO(O0OO0Oo.O000000o());
            o0O000o.O0000OOo(aVar.b("interfaceType", ""));
            o0O000o.O0000O0o(aVar.b("interfaceCode", ""));
            o0O000o.O00000oo(aVar.b("interfaceElasped", ""));
            o0O000o.O0000OoO(aVar.b("timeOut"));
            o0O000o.O0000oO0(aVar.b("traceId"));
            o0O000o.O0000o00(aVar.b("simCardNum"));
            o0O000o.O0000o0(aVar.b("operatortype"));
            o0O000o.O0000o0O(O0OO0Oo.O00000Oo());
            o0O000o.O0000o0o(O0OO0Oo.O00000o0());
            o0O000o.O0000oo0(String.valueOf(aVar.b("networktype", 0)));
            o0O000o.O0000oO(aVar.b("starttime"));
            o0O000o.O0000oOO(aVar.b("endtime"));
            o0O000o.O0000Ooo(String.valueOf(aVar.b("systemEndTime", 0L) - aVar.b("systemStartTime", 0L)));
            o0O000o.O00000o0(aVar.b("imsiState"));
            o0O000o.O0000ooO(O0OO0O.O00000Oo("AID", ""));
            o0O000o.O0000ooo(aVar.b("operatortype"));
            o0O000o.O00oOooO(aVar.b("scripType"));
            o0O000o.O00oOooo(aVar.b("networkTypeByAPI"));
            O0O0O.O000000o("SendLog", "traceId" + aVar.b("traceId"));
        }
    }

    private void O000000o(JSONObject jSONObject) {
        O00o0000.O000000o().O000000o(jSONObject, this.O000000o, new O00o0() { // from class: com.mobile.auth.O0O00o0.1
            @Override // com.mobile.auth.O00o0
            public void O000000o(String str, String str2, JSONObject jSONObject2) {
                long j;
                O000o b = O0O00o0.this.O000000o.b();
                HashMap hashMap = new HashMap();
                if (!str.equals("103000")) {
                    if (!(b.O0000Ooo() == 0 || b.O0000OoO() == 0)) {
                        int O000000o = O0OO0O.O000000o("logFailTimes", 0) + 1;
                        if (O000000o >= b.O0000OoO()) {
                            hashMap.put("logFailTimes", 0);
                            j = System.currentTimeMillis();
                        } else {
                            hashMap.put("logFailTimes", Integer.valueOf(O000000o));
                        }
                    }
                    O0OO0O.O000000o(hashMap);
                }
                hashMap.put("logFailTimes", 0);
                j = 0;
                hashMap.put("logCloseTime", Long.valueOf(j));
                O0OO0O.O000000o(hashMap);
            }
        });
    }

    private void O000000o(JSONObject jSONObject, a aVar) {
        this.O000000o = aVar;
        O000000o(jSONObject);
    }
}
