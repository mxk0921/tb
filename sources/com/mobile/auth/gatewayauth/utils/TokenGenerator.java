package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mobile.auth.O0Oo000;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.manager.SystemManager;
import com.mobile.auth.gatewayauth.manager.VendorSdkInfoManager;
import com.mobile.auth.gatewayauth.model.CustomizeToken;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONObject;
import tb.ln8;
import tb.sy4;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TokenGenerator {
    private O0Oo000 O000000o;
    private SystemManager O00000Oo;
    private VendorSdkInfoManager O00000o0;

    public TokenGenerator(O0Oo000 o0Oo000, SystemManager systemManager, VendorSdkInfoManager vendorSdkInfoManager) {
        this.O000000o = o0Oo000;
        this.O00000Oo = systemManager;
        this.O00000o0 = vendorSdkInfoManager;
    }

    private String generateCsrf(String str) {
        try {
            try {
                return sy4.i(str, this.O00000Oo.O000000o() + this.O00000Oo.O00000Oo());
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return null;
                }
            }
        } catch (Exception e) {
            this.O000000o.O00000o("Generate csrf failed!", ln8.a(e));
            return "";
        }
    }

    public String O000000o(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, boolean z2, String str7) {
        try {
            return assembleToken(context, null, null, null, str, str2, str3, z, str4, str5, str6, z2, str7);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public String assembleToken(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, boolean z2, String str10) {
        String str11;
        String str12 = null;
        String str13 = "";
        if (z) {
            try {
                str13 = generateCsrf(str5);
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return str12;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                    return str12;
                }
            }
        }
        boolean z3 = false;
        if (z2) {
            String O000000o = O0000o00.O000000o(context, "rpk");
            if (!TextUtils.isEmpty(O000000o)) {
                z3 = true;
            }
            str11 = O000000o;
        } else {
            str11 = null;
        }
        try {
            str12 = !z3 ? sy4.a.b(EncryptUtils.encryptToken(context, str, str2, str3, this.O00000o0.O00000o0(), str4, str5, str6, str13, true, str10).getBytes("UTF-8")) : assembleCustomizeToken(context, str4, str5, str7, str8, str9, str11);
            return str12;
        } catch (UnsupportedEncodingException e) {
            this.O000000o.O00000o(ln8.a(e));
            return str12;
        }
    }

    private String assembleCustomizeToken(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7 = null;
        try {
            try {
                String packageName = PackageUtils.getPackageName(context);
                CustomizeToken customizeToken = new CustomizeToken();
                HashMap hashMap = new HashMap(3);
                hashMap.put("token", str2);
                hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str3);
                hashMap.put("appkey", str4);
                String encryptString2Base64 = AESUtils.encryptString2Base64(new JSONObject(hashMap).toString(), str, packageName);
                if (encryptString2Base64 != null && !TextUtils.isEmpty(encryptString2Base64) && !TextUtils.isEmpty(encryptString2Base64.trim())) {
                    customizeToken.setEncryptToken(encryptString2Base64);
                    customizeToken.setKey(EncryptUtils.encrpytAESKey(str6, str));
                    customizeToken.setVendorName(str5);
                    if (Constant.VENDOR_CUCC.equals(str5)) {
                        customizeToken.setVendorName(Constant.VENDOR_CUXZ);
                    } else {
                        customizeToken.setVendorName(str5);
                    }
                    str7 = sy4.a.b(wrf.n(customizeToken, null).toString().getBytes());
                    return str7;
                }
                return "";
            } catch (Exception e) {
                this.O000000o.O00000o(ln8.a(e));
                return str7;
            }
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return str7;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return str7;
            }
        }
    }
}
