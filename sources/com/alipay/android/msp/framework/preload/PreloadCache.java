package com.alipay.android.msp.framework.preload;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspConfig;
import com.alipay.android.msp.framework.sys.DeviceInfo;
import com.alipay.android.msp.framework.tid.TidStorage;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.UserLocation;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import java.util.HashMap;
import tb.f7l;
import tb.oeh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class PreloadCache {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean b;
    public long e;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f3656a = new HashMap<>();
    public final HashMap<String, String> c = new HashMap<>();
    public long d = 60000;

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b40a0b6b", new Object[0]);
        }
        if (Utils.isDeviceRooted()) {
            return "1";
        }
        return "0";
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee9ccbb7", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace(f7l.BRACKET_START_STR, "（").replace(f7l.BRACKET_END_STR, "）").replace(";", "；");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[0]);
        }
        try {
            return PhoneCashierMspEngine.getMspWallet().getUserId();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a09122fc", new Object[]{str});
        }
        try {
            return PhoneCashierMspEngine.getMspViSec().getVIData(str);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f21ce807", new Object[]{context});
        }
        if (DeviceInfo.hasAlipayWallet(context)) {
            return "1";
        }
        return "0";
    }

    public static String f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67970e48", new Object[]{context});
        }
        if (DeviceInfo.isSupportCertPay(context)) {
            return "1";
        }
        return "0";
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93da6dc2", new Object[]{this})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.e > this.d) {
            return true;
        }
        return false;
    }

    public String getCachedHasAlipayString(Context context, HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74c95011", new Object[]{this, context, hashMap});
        }
        String str2 = this.c.get("HAS_ALIPAY");
        if (TextUtils.isEmpty(str2) || g()) {
            str2 = e(context);
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("HAS_ALIPAY", str);
        }
        return str2;
    }

    public String getCachedHasCertPayString(Context context, HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fc6357b", new Object[]{this, context, hashMap});
        }
        String str2 = this.c.get("HAS_CERTPAY");
        if (TextUtils.isEmpty(str2) || g()) {
            str2 = f(context);
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("HAS_CERTPAY", str);
        }
        return str2;
    }

    public String getCachedManufacturerAndModel(boolean z, HashMap<String, String> hashMap, boolean z2, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        char c = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("242d1b63", new Object[]{this, new Boolean(z), hashMap, new Boolean(z2), str});
        }
        if (TextUtils.isEmpty(str) || str.length() <= 15) {
            c = 2;
        }
        Context context = GlobalHelper.getInstance().getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(b(Build.MANUFACTURER));
        sb.append(";");
        sb.append(Build.MODEL);
        if (c == 2) {
            sb.append(")(2)(");
            String str9 = this.f3656a.get("LOCALE");
            String str10 = "0";
            if (TextUtils.isEmpty(str9)) {
                str9 = Utils.getDefaultLocale(context);
                str2 = str10;
            } else {
                str2 = "1";
            }
            if (hashMap != null) {
                hashMap.put("LOCALE", str2);
            }
            sb.append(str9);
            sb.append(";");
            if (z || z2) {
                str3 = "-1;-1";
            } else {
                str3 = this.c.get("LAC");
                if (TextUtils.isEmpty(str3) || g()) {
                    str3 = Utils.getCellInfo(context);
                    str8 = str10;
                } else {
                    str8 = "1";
                }
                if (hashMap != null) {
                    hashMap.put("LAC", str8);
                }
            }
            sb.append(str3);
            sb.append(";");
            String str11 = "";
            if (z2) {
                str4 = str11;
            } else {
                str4 = UserLocation.getLocationInfo();
            }
            sb.append(str4);
            sb.append(";");
            if (z2) {
                str5 = str11;
            } else {
                String str12 = this.c.get("WIFI_SSID");
                if (TextUtils.isEmpty(str12) || g()) {
                    str12 = DeviceInfo.getWifiSSID(context);
                    str7 = str10;
                } else {
                    str7 = "1";
                }
                if (hashMap != null) {
                    hashMap.put("WIFI_SSID", str7);
                }
                if (!TextUtils.isEmpty(str12)) {
                    str12 = str12.replaceAll(";", str11);
                }
                str5 = b(str12);
            }
            sb.append(str5);
            sb.append(";");
            if (!z2) {
                String str13 = this.c.get("WIFI_BSSID");
                if (TextUtils.isEmpty(str13) || g()) {
                    String wifiSSID = DeviceInfo.getWifiSSID(context);
                    if (!TextUtils.isEmpty(wifiSSID)) {
                        str6 = wifiSSID.replaceAll(";", str11);
                    } else {
                        str6 = "-1";
                    }
                    str13 = str6;
                } else {
                    str10 = "1";
                }
                if (hashMap != null) {
                    hashMap.put("WIFI_BSSID", str10);
                }
                str11 = b(str13);
            }
            sb.append(str11);
        }
        return sb.toString();
    }

    public String getCachedPa(HashMap<String, String> hashMap, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8587119b", new Object[]{this, hashMap, context});
        }
        String str2 = this.f3656a.get("PA");
        if (TextUtils.isEmpty(str2)) {
            str2 = MspConfig.getInstance().getPa(context);
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put("PA", str);
        }
        return str2;
    }

    public String getCachedUserAgentByTypeV2(HashMap<String, String> hashMap, boolean z, String str) {
        String str2;
        String str3;
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebb891bf", new Object[]{this, hashMap, new Boolean(z), str});
        }
        if (!TextUtils.isEmpty(str) && str.length() > 15) {
            c = 1;
        }
        Context context = GlobalHelper.getInstance().getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(GlobalSdkConstant.getMspVersion());
        sb.append("(a ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(";6;(a);");
        DeviceInfo instance = DeviceInfo.getInstance(context);
        sb.append(instance.getIMEI(context));
        sb.append(";");
        sb.append(instance.getIMSI(context));
        sb.append(";(b);");
        String str4 = this.c.get("NET_TYPE");
        String str5 = "0";
        if (TextUtils.isEmpty(str4) || g()) {
            str4 = DeviceInfo.getNetConnectionType().getName();
            str2 = str5;
        } else {
            str2 = "1";
        }
        if (hashMap != null) {
            hashMap.put("NET_TYPE", str2);
        }
        sb.append(str4);
        sb.append(";");
        if (z) {
            str3 = "";
        } else {
            str3 = instance.getMacAddress(context);
        }
        sb.append(str3);
        sb.append(";");
        String str6 = this.f3656a.get("ROOT");
        if (TextUtils.isEmpty(str6)) {
            str6 = a();
        } else {
            str5 = "1";
        }
        if (hashMap != null) {
            hashMap.put("ROOT", str5);
        }
        sb.append(str6);
        sb.append(";(c))");
        if (c == 1) {
            sb.append("(1)(");
            sb.append(PhoneCashierMspEngine.getMspBase().getApdidToken(context));
            sb.append(f7l.BRACKET_END_STR);
        }
        return sb.toString();
    }

    public String getCachedUtdid(HashMap<String, String> hashMap) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fce93c9c", new Object[]{this, hashMap});
        }
        String str2 = this.f3656a.get(oeh.UTDID);
        if (TextUtils.isEmpty(str2)) {
            str2 = GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext());
            str = "0";
        } else {
            str = "1";
        }
        if (hashMap != null) {
            hashMap.put(oeh.UTDID, str);
        }
        return str2;
    }

    public String getCachedVIData(String str, HashMap<String, String> hashMap) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb218033", new Object[]{this, str, hashMap});
        }
        String str3 = this.c.get("VIDATA");
        this.c.get("CHECK_USERID");
        if (TextUtils.isEmpty(str3) || g()) {
            str3 = d(str);
            str2 = "0";
        } else {
            str2 = "1";
        }
        if (hashMap != null) {
            hashMap.put("VIDATA", str2);
        }
        return str3;
    }

    public synchronized void startCache(long j, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cf4b8b", new Object[]{this, new Long(j), context});
            return;
        }
        if (!this.b) {
            this.f3656a.put("ROOT", a());
            this.f3656a.put("LOCALE", Utils.getDefaultLocale(context));
            this.f3656a.put(oeh.UTDID, GlobalHelper.getInstance().getUtdid(context));
            this.f3656a.put("PA", MspConfig.getInstance().getPa(context));
            this.b = true;
        }
        this.c.put("HAS_ALIPAY", e(context));
        this.c.put("HAS_CERTPAY", f(context));
        this.c.put("NET_TYPE", DeviceInfo.getNetConnectionType().getName());
        String c = c();
        this.c.put("CHECK_USERID", c);
        this.c.put("VIDATA", d(c));
        this.e = SystemClock.elapsedRealtime();
        this.d = j;
        if (GlobalHelper.getInstance().getContext() == null) {
            GlobalHelper.getInstance().init(context);
        }
        TidStorage.getInstance();
        DeviceInfo.getInstance(context);
    }

    public String assembleLog(HashMap<String, String> hashMap, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("acb7dad2", new Object[]{this, hashMap, context});
        }
        String[] strArr = {oeh.UTDID, "ROOT", "LOCALE", "WIFI_SSID", "WIFI_BSSID", "NET_TYPE", "WIFI_OBJ", "CELL_OBJ", "MAC_ADDRESS", "DEVICE_NAME", "LAC", "VIDATA", "HAS_ALIPAY", "HAS_CERTPAY", "PA", "BP"};
        String str2 = "0";
        if (hashMap != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                String str3 = hashMap.get(strArr[i]);
                if (TextUtils.isEmpty(str3)) {
                    str3 = str2;
                }
                sb.append(str3);
            }
            str = sb.toString();
        } else {
            str = EncryptUtils.IV_PARAMETER_SPEC;
        }
        if (!DrmManager.getInstance(context).isDegrade(DrmKey.DEGRADE_PRELOAD_NETWORK, false, context)) {
            str2 = "1";
        }
        String concat = "1".concat(str2);
        return "V1(" + concat + "|" + str + f7l.BRACKET_END_STR;
    }
}
