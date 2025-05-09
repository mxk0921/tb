package com.mobile.auth;

import android.os.SystemClock;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mobile.auth.O00Oo;
import com.taobao.weex.utils.tools.TimeCalculator;
import org.json.JSONObject;
import tb.h1p;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00o0000 {
    private static O00o0000 O000000o;

    private O00o0000() {
    }

    public static O00o0000 O000000o() {
        if (O000000o == null) {
            synchronized (O00o0000.class) {
                try {
                    if (O000000o == null) {
                        O000000o = new O00o0000();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O000000o;
    }

    public void O000000o(a aVar, O00o0 o00o0) {
        String str;
        O00o00 o00o00;
        String str2;
        int c = aVar.c("networktype");
        O00OoOO0 o00OoOO0 = new O00OoOO0();
        o00OoOO0.O00000Oo("1.0");
        o00OoOO0.O00000o0(BuildConfig.CMCC_SDK_VERSION);
        o00OoOO0.O00000o(aVar.b(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        o00OoOO0.O00000oO(aVar.b("operatortype"));
        o00OoOO0.O00000oo(c + "");
        o00OoOO0.O0000O0o(O0OO0Oo.O000000o());
        o00OoOO0.O0000OOo(O0OO0Oo.O00000Oo());
        o00OoOO0.O0000Oo0(O0OO0Oo.O00000o0());
        o00OoOO0.O0000Oo("0");
        o00OoOO0.O0000OoO("3.1");
        o00OoOO0.O0000Ooo(OO0oO.O00000Oo());
        o00OoOO0.O0000o00(O0OOO0.O000000o());
        o00OoOO0.O0000o0O(aVar.b("apppackage"));
        o00OoOO0.O0000o0o(aVar.b("appsign"));
        o00OoOO0.O0000oo0(aVar.b(x96.PATH_OPERATOR));
        o00OoOO0.O000000o(O0OO0O.O00000Oo("AID", ""));
        if (aVar.c("logintype") == 3 || aVar.b("isRisk", false)) {
            str = "pre";
        } else {
            o00OoOO0.O0000ooo(aVar.b("userCapaid"));
            o00OoOO0.O0000ooo(aVar.c("logintype") == 1 ? "200" : "50");
            str = "authz";
        }
        o00OoOO0.O0000oO(str);
        OO0oO.O000000o(aVar, "scripAndTokenForHttpsV2");
        O000o b = aVar.b();
        if (aVar.b("isCacheScrip", false) || aVar.b("isGotScrip", false)) {
            o00OoOO0.O0000ooO(aVar.b("phonescrip"));
            o00OoOO0.O0000o0(o00OoOO0.O0000oo(aVar.b("appkey")));
            o00o00 = new O00o00(h1p.HTTPS_PREFIX + b.O000000o() + "/unisdk/rs/scripAndTokenForHttpsV2", o00OoOO0, "POST", aVar.b("traceId"));
            o00o00.O000000o("defendEOF", "0");
        } else {
            O00Oo0o0 o00Oo0o0 = new O00Oo0o0();
            o00Oo0o0.O000000o(aVar.a(b.a.f4617a));
            o00Oo0o0.O00000Oo(aVar.a(b.a.b));
            o00Oo0o0.O000000o(o00OoOO0);
            o00Oo0o0.O000000o(false);
            aVar.a("isCloseIpv4", b.O0000OOo());
            aVar.a("isCloseIpv6", b.O0000Oo0());
            String str3 = h1p.HTTPS_PREFIX + b.O00000Oo() + "/unisdk/rs/scripAndTokenForHttpsV2";
            if (aVar.b("use2048PublicKey", false)) {
                O0O0O.O000000o("BaseRequest", "使用2对应的编码");
                o00Oo0o0.O00000Oo("2");
                str2 = O0OoOo.O000000o().O00000Oo(aVar.a(b.a.f4617a));
            } else {
                str2 = O0OoOo.O000000o().O000000o(aVar.a(b.a.f4617a));
            }
            o00Oo0o0.O00000o0(str2);
            o00o00 = new O00o000(str3, o00Oo0o0, "POST", aVar.b("traceId"));
            if (c == 3) {
                o00o00.O000000o(true);
                aVar.a("doNetworkSwitch", true);
            } else {
                o00o00.O000000o(false);
                aVar.a("doNetworkSwitch", false);
            }
        }
        o00o00.O000000o("interfaceVersion", "3.1");
        o00o00.O000000o("dnsParseResult", "1");
        O000000o(o00o00, o00o0, aVar);
    }

    private void O000000o(final O00o00 o00o00, final O00o0 o00o0, final a aVar) {
        O00OOo0 o00OOo0 = new O00OOo0();
        O00OOOo o00OOOo = new O00OOOo();
        O00O0o o00O0o = new O00O0o();
        o00OOo0.O000000o(o00OOOo);
        o00OOOo.O000000o(o00O0o);
        o00o00.O000000o(SystemClock.elapsedRealtime());
        o00OOo0.O000000o(o00o00, new O0O00oO() { // from class: com.mobile.auth.O00o0000.1
            private void O000000o() {
                if (!o00o00.O000000o().contains("uniConfig")) {
                    OO0oO.O00000o0(aVar, String.valueOf(SystemClock.elapsedRealtime() - o00o00.O0000OOo()));
                }
            }

            @Override // com.mobile.auth.O0O00oO
            public void O000000o(O00o o00o) {
                O000000o();
                OO0oO.O00000Oo(aVar, String.valueOf(o00o.O000000o()));
                o00o0.O000000o(String.valueOf(o00o.O000000o()), o00o.O00000Oo(), O00O0Oo0.O000000o(String.valueOf(o00o.O000000o()), o00o.O00000Oo()));
            }

            @Override // com.mobile.auth.O0O00oO
            public void O000000o(ooooooo oooooooVar) {
                try {
                    O000000o();
                    JSONObject jSONObject = new JSONObject(oooooooVar.O00000o0());
                    String string = jSONObject.has("resultcode") ? jSONObject.getString("resultcode") : jSONObject.getString("resultCode");
                    OO0oO.O00000Oo(aVar, string);
                    o00o0.O000000o(string, jSONObject.optString("desc"), jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                    O000000o(O00o.O000000o(102223));
                }
            }
        }, aVar);
    }

    public void O000000o(JSONObject jSONObject, a aVar, O00o0 o00o0) {
        O00Oo o00Oo = new O00Oo();
        O00Oo.O000000o o000000o = new O00Oo.O000000o();
        O00Oo.O00000Oo o00000Oo = new O00Oo.O00000Oo();
        o00000Oo.O00000oO(OO0oO.O00000Oo());
        o00000Oo.O00000oo(O0OOO0.O000000o());
        o00000Oo.O00000Oo("2.0");
        o00000Oo.O00000o0(aVar.b(HiAnalyticsConstant.HaKey.BI_KEY_APPID, ""));
        o00000Oo.O00000o(o00000Oo.O0000oo(""));
        o000000o.O000000o(jSONObject);
        o00Oo.O000000o(o000000o);
        o00Oo.O000000o(o00000Oo);
        O000o b = aVar.b();
        O000000o(new O00o00(h1p.HTTPS_PREFIX + b.O00000o() + "/log/logReport", o00Oo, "POST", aVar.b("traceId")), o00o0, aVar);
    }

    public void O000000o(boolean z, a aVar, O00o0 o00o0) {
        O00Oo00o o00Oo00o = new O00Oo00o();
        o00Oo00o.O00000Oo("1.0");
        o00Oo00o.O00000o0(TimeCalculator.PLATFORM_ANDROID);
        o00Oo00o.O00000o(O0OO0O.O00000Oo("AID", ""));
        o00Oo00o.O00000oO(z ? "1" : "0");
        o00Oo00o.O00000oo(BuildConfig.CMCC_SDK_VERSION);
        o00Oo00o.O0000O0o(aVar.b(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        o00Oo00o.O0000OOo(o00Oo00o.O0000oo("iYm0HAnkxQtpvN44"));
        O000o b = aVar.b();
        O000000o(new O00o00(h1p.HTTPS_PREFIX + b.O00000o0() + "/client/uniConfig", o00Oo00o, "POST", aVar.b("traceId")), o00o0, aVar);
    }
}
