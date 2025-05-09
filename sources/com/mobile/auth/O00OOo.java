package com.mobile.auth;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.cmic.sso.sdk.a;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00OOo {
    private String O000000o;
    private String O00000Oo;

    public O00o00 O000000o(O00o00 o00o00, ooooooo oooooooVar, a aVar) {
        List<String> list;
        Map<String, List<String>> O00000Oo = oooooooVar.O00000Oo();
        if (TextUtils.isEmpty(this.O000000o) && (list = O00000Oo.get("pplocation")) != null && !list.isEmpty()) {
            this.O000000o = list.get(0);
        }
        OO0oO.O00000Oo(aVar, String.valueOf(oooooooVar.O000000o()));
        List<String> list2 = O00000Oo.get("Location");
        if (list2 == null || list2.isEmpty()) {
            list2 = O00000Oo.get("Location".toLowerCase());
        }
        if (list2 != null && !list2.isEmpty()) {
            String str = list2.get(0);
            this.O00000Oo = str;
            if (!TextUtils.isEmpty(str)) {
                String b = aVar.b("operatortype", "0");
                OO0oO.O000000o(aVar, "2".equals(b) ? "getUnicomMobile" : "3".equals(b) ? "getTelecomMobile" : "NONE");
            }
        }
        O0O0O.O00000Oo("RedirectHandler", "mLocation = " + this.O00000Oo);
        O00o00 O000000o = O000000o(this.O00000Oo, o00o00.O00000oo(), "GET", new O00Oo0(o00o00.O0000Oo().O000000o()));
        O000000o.O000000o(o00o00.O0000O0o());
        return O000000o;
    }

    public O00o00 O00000Oo(O00o00 o00o00, ooooooo oooooooVar, a aVar) {
        String str;
        String b = aVar.b("operatortype", "0");
        if ("2".equals(b)) {
            str = "getNewUnicomPhoneNumberNotify";
        } else if ("3".equals(b)) {
            str = "getNewTelecomPhoneNumberNotify";
        } else {
            str = "NONE";
        }
        OO0oO.O000000o(aVar, str);
        OO0oO.O00000Oo(aVar, String.valueOf(oooooooVar.O000000o()));
        O00Oo0OO o00Oo0OO = new O00Oo0OO(o00o00.O0000Oo().O000000o(), "1.0", oooooooVar.O00000o0());
        o00Oo0OO.O00000o(aVar.b("userCapaid"));
        o00Oo0OO.O00000Oo(aVar.b("operatortype"));
        if (aVar.c("logintype") == 3 || aVar.b("isRisk", false)) {
            o00Oo0OO.O00000o0("pre");
        } else {
            o00Oo0OO.O00000o0("authz");
        }
        O00o00 O000000o = O000000o(this.O000000o, o00o00.O00000oo(), "POST", o00Oo0OO);
        O000000o.O000000o(o00o00.O0000O0o());
        this.O000000o = null;
        return O000000o;
    }

    private O00o00 O000000o(String str, String str2, String str3, O00OoO0o o00OoO0o) {
        O00o00 o00o00 = new O00o00(str, o00OoO0o, str3, str2);
        if (str3.equals("GET")) {
            o00o00.O000000o("Content-Type", HeaderConstant.HEADER_VALUE_OLD_TYPE);
        }
        return o00o00;
    }

    public String O000000o() {
        return this.O000000o;
    }
}
