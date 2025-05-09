package com.mobile.auth;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Cipher;
import org.json.JSONObject;
import tb.man;
import tb.x96;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class OOO000o {
    public OOO00O0 O00000Oo;
    private ExecutorService O00000o0 = Executors.newSingleThreadExecutor();
    public ScheduledExecutorService O000000o = Executors.newScheduledThreadPool(1);

    public static String O000000o(Context context) {
        String str = "";
        try {
            try {
                String O00000o0 = OOOO00O.O00000o0();
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                String sb2 = sb.toString();
                String O00000Oo = OOO0OO0.O00000Oo();
                String packageName = context.getPackageName();
                String O0000O0o = OOOO0.O0000O0o();
                String O000000o = OOOO0.O000000o();
                String O000000o2 = OOOO0.O000000o(O0000O0o, O000000o.substring(0, 16), O000000o.substring(16, 32));
                PublicKey generatePublic = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(OO0o.O00000Oo("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCVc1ecjpc5k7TkabF935iQONDZ0/E5XWPVv9FEsI59XTRW0+BCMK1MODRSWMvHFrPMh9ZilnRr7qXuAKCBEynQEghmpIVvMYhFu48FAI9bKfkI5lKuQK+tc4X0+zTbNrpedNoKXK4C7dDjTETBH6prwWE9j5WsAf0gbjUbIs3FxwIDAQAB")));
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, generatePublic);
                String O000000o3 = OO0o.O000000o(instance.doFinal(O000000o.getBytes()));
                String O000000o4 = OOOO0.O000000o(context, context.getPackageName(), OOO0OO0.O00000Oo);
                String O00000Oo2 = OOOO00O.O00000Oo();
                if (!TextUtils.isEmpty(O00000Oo2)) {
                    O00000Oo2 = "0";
                }
                String str2 = O000000o4 + "\n" + O00000o0 + "\n2.1\njson\n" + O00000Oo2 + "\n" + packageName + "\n" + O000000o2 + "\n" + O00000Oo + "\n" + O000000o3 + "\n" + sb2;
                String O000000o5 = OOOO0.O000000o(str2.replaceAll("\n", str));
                OOO.O000000o("unSignDebugInfo=".concat(str2));
                String O000000o6 = OO0o.O000000o(O000000o2);
                String O000000o7 = OO0o.O000000o(O000000o3);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("androidMd5", O000000o4);
                jSONObject.put("apiKey", O00000o0);
                jSONObject.put("apiVersion", "2.1");
                jSONObject.put("format", "json");
                jSONObject.put(x96.PATH_OPERATOR, O00000Oo2);
                jSONObject.put("packName", packageName);
                jSONObject.put("privateIp", O000000o6);
                jSONObject.put("sdkVersion", O00000Oo);
                jSONObject.put("secretKey", O000000o7);
                jSONObject.put("timeStamp", sb2);
                jSONObject.put("sign", O000000o5);
                str = jSONObject.toString();
                OOO.O00000o0("getPreCheckParam_CU_Oath: param ok  \n");
                return str;
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
            return null;
        }
    }

    public final void O000000o(final Context context, final int i, final Object obj, final OOO00Oo oOO00Oo) {
        try {
            synchronized (this) {
                try {
                    this.O00000o0.submit(new Runnable() { // from class: com.mobile.auth.OOO000o.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                try {
                                    String str = "";
                                    int i2 = i;
                                    if (i2 != 2) {
                                        oOO00Oo.O000000o(i2, 410009, "410009no this type");
                                    } else {
                                        str = OOOO00O.O000000o() + OOO0o0.O000000o(OOO000o.O000000o(context), "&");
                                    }
                                    OOO00o oOO00o = new OOO00o();
                                    Context context2 = context;
                                    HashMap<String, String> hashMap = new HashMap<>();
                                    hashMap.put("user-agent", "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 %sSafari/533.1");
                                    hashMap.put("netType", "2");
                                    hashMap.put("os", "android");
                                    hashMap.put(HttpRequest.HEADER_ACCEPT, "*/*");
                                    String O000000o = oOO00o.O000000o(context2, str, hashMap, obj);
                                    if (OOOO00O.O0000OOo() == 1) {
                                        try {
                                            OOO0oO.O000000o().O00000Oo();
                                            OOO.O00000o0("\n  WIFI + 流量 \n call releaseNetwork() \n");
                                        } catch (Exception unused) {
                                            OOO.O00000Oo();
                                        }
                                    }
                                    if (TextUtils.isEmpty(O000000o)) {
                                        oOO00Oo.O000000o(i, 410002, "网络请求响应为空");
                                    } else {
                                        oOO00Oo.O000000o(i, 1, O000000o);
                                    }
                                } catch (Throwable th) {
                                    ExceptionProcessor.processException(th);
                                }
                            } catch (Exception unused2) {
                                OOO.O00000Oo();
                            }
                        }
                    });
                } catch (Exception e) {
                    oOO00Oo.O000000o(i, 410009, "410009" + e.getMessage());
                }
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }

    public static /* synthetic */ void O000000o(OOO000o oOO000o) {
        try {
            try {
                ScheduledExecutorService scheduledExecutorService = oOO000o.O000000o;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    oOO000o.O000000o = null;
                }
            } catch (Exception unused) {
                OOO.O00000Oo();
            }
        } catch (Throwable th) {
            ExceptionProcessor.processException(th);
        }
    }
}
