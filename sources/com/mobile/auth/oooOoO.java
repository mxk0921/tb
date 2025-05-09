package com.mobile.auth;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.cmic.sso.sdk.a;
import com.mobile.auth.O000o;
import com.mobile.auth.O0OO0O;
import com.mobile.auth.O0OOO00;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oooOoO {
    private static oooOoO O00000o0;
    private O000o O000000o;
    private final O000o O00000Oo;
    private volatile boolean O00000o = false;
    private O000000o O00000oO;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface O000000o {
        void O000000o(O000o o000o);
    }

    private oooOoO(boolean z) {
        O000o O000000o2 = new O000o.O000000o().O000000o();
        this.O00000Oo = O000000o2;
        if (!z) {
            this.O000000o = O00000o();
        } else {
            this.O000000o = O000000o2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public O000o O00000o() {
        return new O000o.O000000o().O000000o(O00O00Oo.O00000Oo(this.O00000Oo.O000000o())).O00000o0(O00O00Oo.O000000o(this.O00000Oo.O00000o0())).O00000Oo(O00O00Oo.O00000Oo(this.O00000Oo.O00000Oo())).O00000o(O00O00Oo.O00000o0(this.O00000Oo.O00000o())).O00000o(O00O00Oo.O000000o(this.O00000Oo.O0000OOo())).O00000oO(O00O00Oo.O00000Oo(this.O00000Oo.O0000Oo0())).O000000o(O00O00Oo.O00000oO(this.O00000Oo.O00000oO())).O00000Oo(O00O00Oo.O00000o(this.O00000Oo.O00000oo())).O00000o0(O00O00Oo.O00000o0(this.O00000Oo.O0000O0o())).O00000oo(O00O00Oo.O00000oo(this.O00000Oo.O0000Oo())).O000000o(O00O00Oo.O000000o(this.O00000Oo.O0000OoO())).O00000Oo(O00O00Oo.O00000Oo(this.O00000Oo.O0000Ooo())).O000000o();
    }

    public O000o O000000o() {
        return this.O00000Oo;
    }

    public O000o O00000Oo() {
        return this.O000000o;
    }

    public void O00000o0() {
        O0OO0O.O000000o O00000Oo = O0OO0O.O00000Oo("sso_config_xf");
        O00000Oo.O00000o0();
        O00000Oo.O00000Oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O00000Oo(a aVar) {
        if (this.O00000o) {
            O0O0O.O000000o("UmcConfigHandle", "正在获取配置中...");
            return;
        }
        this.O00000o = true;
        O00o0000.O000000o().O000000o(false, aVar, new O00o0() { // from class: com.mobile.auth.oooOoO.1
            @Override // com.mobile.auth.O00o0
            public void O000000o(String str, String str2, JSONObject jSONObject) {
                try {
                    if ("103000".equals(str)) {
                        oooOoO.this.O000000o(jSONObject);
                        O0OO0O.O000000o("sdk_config_version", BuildConfig.CMCC_SDK_VERSION);
                        oooOoO oooooo = oooOoO.this;
                        oooooo.O000000o = oooooo.O00000o();
                        if (oooOoO.this.O00000oO != null) {
                            oooOoO.this.O00000oO.O000000o(oooOoO.this.O000000o);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                oooOoO.this.O00000o = false;
            }
        });
    }

    public static oooOoO O000000o(boolean z) {
        if (O00000o0 == null) {
            synchronized (oooOoO.class) {
                try {
                    if (O00000o0 == null) {
                        O00000o0 = new oooOoO(z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return O00000o0;
    }

    private String O000000o(String str, String str2) {
        String str3;
        String[] split = str.split("&");
        int length = split.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                str3 = "";
                break;
            }
            str3 = split[i];
            if (str3.contains(str2)) {
                break;
            }
            i++;
        }
        return !TextUtils.isEmpty(str3) ? str3.substring(str3.lastIndexOf("=") + 1) : str3;
    }

    public void O000000o(final a aVar) {
        if (O00O00Oo.O000000o()) {
            O0OOO00.O000000o(new O0OOO00.O000000o() { // from class: com.mobile.auth.oooOoO.2
                @Override // com.mobile.auth.O0OOO00.O000000o
                public void O000000o() {
                    O0O0O.O00000Oo("UmcConfigHandle", "开始拉取配置..");
                    oooOoO.this.O00000Oo(aVar);
                }
            });
        }
    }

    public void O000000o(O000000o o000000o) {
        this.O00000oO = o000000o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O000000o(JSONObject jSONObject) {
        O0OO0O.O000000o O00000Oo = O0OO0O.O00000Oo("sso_config_xf");
        try {
            if (jSONObject.has("client_valid")) {
                O00000Oo.O000000o("client_valid", System.currentTimeMillis() + (Integer.parseInt(jSONObject.getString("client_valid")) * 3600000));
            }
            if (jSONObject.has("Configlist")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("Configlist");
                if (jSONObject2.has("CHANGE_HOST")) {
                    String string = jSONObject2.getString("CHANGE_HOST");
                    if (string.contains("M007")) {
                        String O000000o2 = O000000o(string, "M007");
                        if (!TextUtils.isEmpty(O000000o2)) {
                            O00000Oo.O000000o(LoggingSPCache.STORAGE_LOGHOST, O000000o2);
                        }
                    }
                    if (string.contains("M008")) {
                        String O000000o3 = O000000o(string, "M008");
                        if (!TextUtils.isEmpty(O000000o3)) {
                            O00000Oo.O000000o("https_get_phone_scrip_host", O000000o3);
                        }
                    }
                    if (string.contains("M009")) {
                        String O000000o4 = O000000o(string, "M009");
                        if (!TextUtils.isEmpty(O000000o4)) {
                            O00000Oo.O000000o("config_host", O000000o4);
                        }
                    }
                } else {
                    O00000Oo.O000000o(LoggingSPCache.STORAGE_LOGHOST);
                    O00000Oo.O000000o("https_get_phone_scrip_host");
                    O00000Oo.O000000o("config_host");
                }
                O000000o(jSONObject2, "CLOSE_FRIEND_WAPKS", "0", O00000Oo);
                O000000o(jSONObject2, "CLOSE_LOGS_VERSION", "0", O00000Oo);
                O000000o(jSONObject2, "CLOSE_IPV4_LIST", "0", O00000Oo);
                O000000o(jSONObject2, "CLOSE_IPV6_LIST", "0", O00000Oo);
                O000000o(jSONObject2, "CLOSE_M008_SDKVERSION_LIST", "0", O00000Oo);
                O000000o(jSONObject2, "CLOSE_M008_APPID_LIST", "0", O00000Oo);
                if (jSONObject2.has("LOGS_CONTROL")) {
                    String[] split = jSONObject2.getString("LOGS_CONTROL").replace("h", "").split("&");
                    if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                        try {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            O00000Oo.O000000o("maxFailedLogTimes", parseInt);
                            O00000Oo.O000000o("pauseTime", parseInt2);
                        } catch (Exception unused) {
                            O0O0O.O000000o("UmcConfigHandle", "解析日志上报限制时间次数异常");
                        }
                    }
                } else {
                    O00000Oo.O000000o("maxFailedLogTimes");
                    O00000Oo.O000000o("pauseTime");
                }
            }
            O00000Oo.O00000Oo();
        } catch (Exception e) {
            O0O0O.O000000o("UmcConfigHandle", "配置项异常，配置失效");
            e.printStackTrace();
        }
    }

    private void O000000o(JSONObject jSONObject, String str, String str2, O0OO0O.O000000o o000000o) {
        if (jSONObject.has(str)) {
            String optString = jSONObject.optString(str, str2);
            if (!"CLOSE_FRIEND_WAPKS".equals(str)) {
                if (!"0".equals(optString) && !"1".equals(optString)) {
                    return;
                }
            } else if (TextUtils.isEmpty(optString)) {
                return;
            } else {
                if (!optString.contains("CU") && !optString.contains("CT") && !optString.contains("CM")) {
                    return;
                }
            }
            o000000o.O000000o(str, jSONObject.optString(str, str2));
            return;
        }
        o000000o.O000000o(str);
    }
}
