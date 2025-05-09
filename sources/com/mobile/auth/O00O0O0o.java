package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.cmic.sso.sdk.a;
import com.cmic.sso.sdk.b;
import java.util.UUID;
import org.json.JSONObject;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00O0O0o {
    private static O00O0O0o O00000o0;
    private final Context O00000Oo;
    private final Object O00000o = new Object();
    private final O00o0000 O000000o = O00o0000.O000000o();

    private O00O0O0o(Context context) {
        this.O00000Oo = context.getApplicationContext();
    }

    public static O00O0O0o O000000o(Context context) {
        if (O00000o0 == null) {
            synchronized (O00O0O0o.class) {
                try {
                    if (O00000o0 == null) {
                        O00000o0 = new O00O0O0o(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O00000o0;
    }

    private void O00000Oo(a aVar) {
        String packageName = this.O00000Oo.getPackageName();
        String O000000o = O0O0OO0.O000000o(O0Oo0o0.O000000o(this.O00000Oo, packageName));
        aVar.a("apppackage", packageName);
        aVar.a("appsign", O000000o);
    }

    private void O00000Oo(final a aVar, final O00O0OOo o00O0OOo) {
        String str;
        O0O0O.O00000Oo("AuthnBusiness", "getScripAndToken start");
        boolean b = aVar.b("isGotScrip", false);
        O0O0O.O00000Oo("AuthnBusiness", "isGotScrip = " + b);
        if (!b) {
            O00000Oo(aVar);
            if (!aVar.b("isCacheScrip", false)) {
                O00000o0(aVar);
                if (aVar.c("networktype") == 3 && aVar.c("logintype") != 3) {
                    aVar.a("isRisk", true);
                }
            }
            if (aVar.c("logintype") == 1) {
                str = "200";
            } else if (aVar.c("logintype") == 0) {
                str = "50";
            }
            aVar.a("userCapaid", str);
        }
        this.O000000o.O000000o(aVar, new O00o0() { // from class: com.mobile.auth.O00O0O0o.1
            @Override // com.mobile.auth.O00o0
            public void O000000o(String str2, String str3, JSONObject jSONObject) {
                O00O0O0o.this.O000000o(aVar, o00O0OOo, str2, str3, jSONObject);
            }
        });
    }

    private void O00000o0(a aVar) {
        byte[] bArr = new byte[0];
        if (aVar.b("use2048PublicKey", false)) {
            O0O0O.O000000o("AuthnBusiness", "使用2048公钥对应的对称秘钥生成方式");
            bArr = O0O00o.O000000o();
        } else {
            O0O0O.O000000o("AuthnBusiness", "使用1024公钥对应的对称秘钥生成方式");
            try {
                bArr = UUID.randomUUID().toString().substring(0, 16).getBytes("utf-8");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        byte[] O000000o = O0O00o.O000000o();
        aVar.a(b.a.f4617a, bArr);
        aVar.a(b.a.b, O000000o);
        aVar.a(MspGlobalDefine.AUTH_TYPE, "3");
    }

    public void O000000o(a aVar, O00O0OOo o00O0OOo) {
        if (!O0O0OO.O000000o(aVar.b("traceId"))) {
            O0O0O.O00000Oo("AuthnBusiness", "LoginCheck method start");
            if (O000000o(aVar)) {
                O0O0O.O00000Oo("AuthnBusiness", "LoginCheck method start");
                int c = aVar.c("logintype");
                if (aVar.b("isCacheScrip", false)) {
                    String b = aVar.b("securityphone", "");
                    if (c == 3) {
                        o00O0OOo.O000000o("103000", "true", aVar, O00O0Oo0.O000000o(b));
                    } else {
                        O00000Oo(aVar, o00O0OOo);
                    }
                } else {
                    O00000Oo(aVar, o00O0OOo);
                }
            } else {
                o00O0OOo.O000000o("102103", "无数据网络", aVar, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O000000o(com.cmic.sso.sdk.a r25, com.mobile.auth.O00O0OOo r26, java.lang.String r27, java.lang.String r28, org.json.JSONObject r29) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O00O0O0o.O000000o(com.cmic.sso.sdk.a, com.mobile.auth.O00O0OOo, java.lang.String, java.lang.String, org.json.JSONObject):void");
    }

    private boolean O000000o(a aVar) {
        boolean O000000o;
        synchronized (this.O00000o) {
            try {
                O000000o = O0O0o0.O000000o(aVar);
                if (O000000o) {
                    String O00000Oo = O0OO0O.O00000Oo("securityphone", "");
                    String O00000Oo2 = O0OO0O.O00000Oo("operatorTypeName", "");
                    String O00000Oo3 = O0OO0O.O00000Oo(x96.PATH_OPERATOR, "");
                    aVar.a("securityphone", O00000Oo);
                    aVar.a("operatorTypeName", O00000Oo2);
                    aVar.a(x96.PATH_OPERATOR, O00000Oo3);
                    if (3 != aVar.c("logintype")) {
                        String O000000o2 = O0O0o0.O000000o(this.O00000Oo);
                        StringBuilder sb = new StringBuilder("解密phoneScript ");
                        sb.append(!TextUtils.isEmpty(O000000o2));
                        O0O0O.O00000Oo("AuthnBusiness", sb.toString());
                        if (!TextUtils.isEmpty(O000000o2)) {
                            aVar.a("phonescrip", O000000o2);
                        } else {
                            O000000o = false;
                        }
                        O0O0o0.O000000o(true, false);
                    }
                }
                aVar.a("isCacheScrip", O000000o);
                O0O0O.O00000Oo("AuthnBusiness", "isCachePhoneScrip = " + O000000o);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar.c("networktype") == 2) {
            return O000000o;
        }
        return true;
    }
}
