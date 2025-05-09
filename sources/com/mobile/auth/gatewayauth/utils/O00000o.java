package com.mobile.auth.gatewayauth.utils;

import android.content.Context;
import android.os.Build;
import com.mobile.auth.BuildConfig;
import com.mobile.auth.O0o00;
import com.mobile.auth.gatewayauth.Constant;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.model.TerminalInfo;
import com.mobile.auth.gatewayauth.utils.security.PackageUtils;
import tb.wrf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00000o {
    public static String O000000o() {
        try {
            return Build.BRAND;
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

    public static String O00000Oo() {
        try {
            return Build.VERSION.RELEASE;
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

    public static String O00000o0() {
        try {
            String str = Build.MODEL;
            if (str.length() > 20) {
                return str.substring(0, 20);
            }
            return str;
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

    public static String O000000o(Context context) {
        try {
            return O0o00.O000000o(context);
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

    public static String O000000o(Context context, String str, String str2) {
        try {
            TerminalInfo terminalInfo = new TerminalInfo();
            terminalInfo.setOsVersion(O00000Oo());
            terminalInfo.setDeviceName(O00000o0());
            terminalInfo.setDeviceBrand(O000000o());
            terminalInfo.setPackageName(PackageUtils.getPackageName(context));
            terminalInfo.setAppVersion(PackageUtils.getVersionName(context));
            terminalInfo.setSign(PackageUtils.getSign(context));
            terminalInfo.setVendorKey(str2);
            terminalInfo.setSdkVersion(BuildConfig.VERSION_NAME);
            terminalInfo.setOperatorCode(O00000Oo.O00000o0(str2));
            terminalInfo.setNetworkType(O00000Oo.O000000o(context, true));
            terminalInfo.setSceneCode(str);
            terminalInfo.setUniqueId(com.mobile.auth.gatewayauth.manager.O00000o.O000000o);
            return wrf.n(terminalInfo, null).toString();
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

    public static String O000000o(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        try {
            TerminalInfo terminalInfo = new TerminalInfo();
            terminalInfo.setAccessCode(str4);
            terminalInfo.setOsVersion(O00000Oo());
            terminalInfo.setDeviceName(O00000o0());
            terminalInfo.setDeviceBrand(O000000o());
            terminalInfo.setPackageName(PackageUtils.getPackageName(context));
            terminalInfo.setAppVersion(PackageUtils.getVersionName(context));
            terminalInfo.setSign(PackageUtils.getSign(context));
            if (Constant.VENDOR_CUCC.equals(str5)) {
                terminalInfo.setVendorKey(Constant.VENDOR_CUXZ);
                terminalInfo.setApiCode("9");
            } else {
                terminalInfo.setVendorKey(str5);
            }
            terminalInfo.setSdkVersion(BuildConfig.VERSION_NAME);
            terminalInfo.setOperatorCode(O00000Oo.O00000o0(str5));
            terminalInfo.setNetworkType(O00000Oo.O000000o(context, true));
            if (z) {
                terminalInfo.setInnerIP(O00000Oo.O000000o());
            }
            terminalInfo.setCsrf(str6);
            terminalInfo.setTimeStamp(String.valueOf(System.currentTimeMillis()));
            terminalInfo.setSceneCode(str3);
            terminalInfo.setCertifyId(str);
            terminalInfo.setCustomId(str2);
            terminalInfo.setMark("V9_MARK");
            return wrf.n(terminalInfo, null).toString();
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
}
