package com.alipay.security.mobile.api;

import android.content.Context;
import com.alipay.security.mobile.agent.Version;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.cache.AuthenticatorModel;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BICDataUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String AUTHINFO_KEY = "ai";
    private static final String AUTHPARAMETER_KEY = "ap";
    private static final String BIOINFO_KEY = "bi";
    private static final String CPMODEL_KEY = "cm";
    private static final String DEVICEID_KEY = "di";
    private static final String IGNORE_FP_KEY = "ig";
    private static final String LOCAL_ERROR_KEY = "le";
    private static final String PACKAGE_NAME = "pn";
    private static final String PHONEMODEL_KEY = "pm";
    private static final String ROOT_KEY = "rt";
    private static final String SECDATAVERSION_KEY = "dv";
    private static final String SERVICEVERSION_KEY = "sv";
    private static final String VENDOR_KEY = "vendor";

    private BICDataUtil() {
    }

    public static String getGlobalSecDataJson(List<BICDataModel> list, Context context) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbc9dc9a", new Object[]{list, context});
        }
        if (!(list == null || list.size() == 0)) {
            try {
                String fpAAID = AuthenticatorApi.getFpAAID(context);
                String str = "";
                String str2 = str;
                String str3 = str2;
                String str4 = str3;
                for (BICDataModel bICDataModel : list) {
                    if (!str.equals("")) {
                        str = str + ";";
                    }
                    if (!CommonUtils.isBlank(bICDataModel.getGlobalBioInfo())) {
                        str = str + bICDataModel.getGlobalBioInfo();
                    }
                    if (str2.equals("")) {
                        str2 = str2 + bICDataModel.getDeviceId();
                    } else if (!str2.endsWith(bICDataModel.getDeviceId())) {
                        str2 = str2 + ";" + bICDataModel.getDeviceId();
                    } else if (str2.endsWith(bICDataModel.getDeviceId())) {
                        str2 = str2 + ";#";
                    }
                    if (str3.equals("")) {
                        str3 = str3 + bICDataModel.getPhoneModel();
                    }
                    if (fpAAID.equals("")) {
                        fpAAID = fpAAID + bICDataModel.getCpModel();
                    }
                    if (bICDataModel.getRootStatus() != 0) {
                        i = bICDataModel.getRootStatus();
                    }
                    if (str4.equals("")) {
                        str4 = str4 + context.getPackageName();
                    }
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("bi", str);
                    jSONObject.put("di", str2);
                    jSONObject.put("vendor", 100);
                    jSONObject.put("pm", str3);
                    jSONObject.put(CPMODEL_KEY, fpAAID);
                    jSONObject.put(ROOT_KEY, i);
                    jSONObject.put(PACKAGE_NAME, str4);
                    jSONObject.put(SECDATAVERSION_KEY, "1");
                    return jSONObject.toString();
                } catch (JSONException e) {
                    AuthenticatorLOG.error(e.getMessage());
                    return "";
                }
            } catch (Exception e2) {
                AuthenticatorLOG.error(e2.getMessage());
            }
        }
        return "";
    }

    public static String secData2Json(List<BICDataModel> list, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2c98c8f", new Object[]{list, context});
        }
        if (list == null || list.size() == 0) {
            return "";
        }
        String fpAAID = AuthenticatorApi.getFpAAID(context);
        int readServiceVersion = Version.readServiceVersion(context);
        if (readServiceVersion > 1) {
            str = String.valueOf(readServiceVersion);
        } else {
            str = "";
        }
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        for (BICDataModel bICDataModel : list) {
            if (bICDataModel.hasAi) {
                if (!str2.equals("")) {
                    str2 = str2.concat(";");
                }
                str2 = str2 + bICDataModel.getAuthInfo();
                if (str3.equals("")) {
                    str3 = str3 + bICDataModel.getDeviceId();
                } else if (bICDataModel.getDeviceId() != null && !str3.endsWith(bICDataModel.getDeviceId())) {
                    str3 = str3 + ";" + bICDataModel.getDeviceId();
                } else if (bICDataModel.getDeviceId() != null && str3.endsWith(bICDataModel.getDeviceId())) {
                    str3 = str3.concat(";#");
                }
            }
            if (str4.equals("")) {
                str4 = str4 + bICDataModel.getPhoneModel();
            }
            if (str5.equals("")) {
                str5 = str5 + bICDataModel.getRootStatus();
            }
            if (!str6.equals("")) {
                str6 = str6.concat(";");
            }
            str6 = str6 + bICDataModel.getBioInfo();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AUTHINFO_KEY, str2);
            jSONObject.put("di", str3);
            jSONObject.put("ap", "");
            jSONObject.put("pm", str4);
            jSONObject.put("sv", str);
            jSONObject.put(CPMODEL_KEY, fpAAID);
            jSONObject.put(SECDATAVERSION_KEY, "16");
            jSONObject.put(ROOT_KEY, str5);
            jSONObject.put("bi", str6);
            if (!"off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_SILENT_REG, ""))) {
                jSONObject.put(PACKAGE_NAME, context.getPackageName());
                jSONObject.put(IGNORE_FP_KEY, IFAAManagerAdaptor.isIgnoreFpIndex(context) ? 1 : 0);
                jSONObject.put(LOCAL_ERROR_KEY, !"2".equals(AuthenticatorModel.getClientStatus(context)) ? 1 : 0);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static String toDataJson(List<BICDataModel> list, Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3db79dd", new Object[]{list, context});
        }
        if (list == null || list.size() == 0) {
            return "";
        }
        String fpAAID = AuthenticatorApi.getFpAAID(context);
        int readServiceVersion = Version.readServiceVersion(context);
        if (readServiceVersion > 1) {
            str = String.valueOf(readServiceVersion);
        } else {
            str = "";
        }
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        for (BICDataModel bICDataModel : list) {
            if (!str2.equals("")) {
                str2 = str2.concat(";");
            }
            str2 = str2 + bICDataModel.getAuthInfo();
            if (str3.equals("")) {
                str3 = str3 + bICDataModel.getDeviceId();
            } else if (bICDataModel.getDeviceId() != null && !str3.endsWith(bICDataModel.getDeviceId())) {
                str3 = str3 + ";" + bICDataModel.getDeviceId();
            } else if (bICDataModel.getDeviceId() != null && str3.endsWith(bICDataModel.getDeviceId())) {
                str3 = str3.concat(";#");
            }
            if (str4.equals("")) {
                str4 = str4 + bICDataModel.getPhoneModel();
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AUTHINFO_KEY, str2);
            jSONObject.put("di", str3);
            jSONObject.put("ap", "");
            jSONObject.put("pm", str4);
            jSONObject.put("sv", str);
            jSONObject.put(CPMODEL_KEY, fpAAID);
            if (!"off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_SILENT_REG, ""))) {
                jSONObject.put(PACKAGE_NAME, context.getPackageName());
                jSONObject.put(IGNORE_FP_KEY, IFAAManagerAdaptor.isIgnoreFpIndex(context) ? 1 : 0);
                jSONObject.put(LOCAL_ERROR_KEY, !"2".equals(AuthenticatorModel.getClientStatus(context)) ? 1 : 0);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public static List<BICDataModel> fromDataJson(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1c0c639a", new Object[]{str});
        }
        if (str != null && !str.trim().equals("")) {
            ArrayList arrayList = new ArrayList();
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e) {
                AuthenticatorLOG.error("BICDataUtil", e);
                jSONObject = null;
            }
            if (jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString(AUTHINFO_KEY);
            String optString2 = jSONObject.optString("di");
            String optString3 = jSONObject.optString("ap");
            String optString4 = jSONObject.optString("sv");
            String optString5 = jSONObject.optString("pm");
            String optString6 = jSONObject.optString(CPMODEL_KEY);
            if (optString != null && !optString.trim().equals("")) {
                String[] split = optString.split(";");
                int length = split.length;
                String[] strArr = {""};
                String[] strArr2 = {""};
                String[] strArr3 = {""};
                if (optString2 != null) {
                    strArr = optString2.split(";");
                    for (int i = 0; i < strArr.length; i++) {
                        if (strArr[i].equals("#")) {
                            strArr[i] = strArr[i - 1];
                        }
                    }
                }
                if (optString3 != null) {
                    strArr2 = optString3.split(";");
                }
                if (optString5 != null) {
                    strArr3 = optString5.split(";");
                }
                int i2 = 0;
                while (i2 < length) {
                    BICDataModel bICDataModel = new BICDataModel(split[i2], strArr[i2 > strArr.length - 1 ? 0 : i2], strArr2[i2 > strArr2.length - 1 ? 0 : i2], strArr3[i2 > strArr3.length - 1 ? 0 : i2]);
                    bICDataModel.setCpModel(optString6);
                    bICDataModel.setServiceVersion(CommonUtils.isBlank(optString4) ? 15 : Integer.parseInt(optString4));
                    arrayList.add(bICDataModel);
                    i2++;
                }
                return arrayList;
            }
        }
        return null;
    }

    public static List<BICDataModel> secDataFromJson(String str) {
        JSONObject jSONObject;
        String[] strArr;
        String[] strArr2;
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7507749", new Object[]{str});
        }
        if (str == null || str.trim().equals("")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException e) {
            AuthenticatorLOG.error("BICDataUtil", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(AUTHINFO_KEY);
        String optString2 = jSONObject.optString("di");
        String optString3 = jSONObject.optString("ap");
        String optString4 = jSONObject.optString("sv");
        String optString5 = jSONObject.optString("pm");
        String optString6 = jSONObject.optString(CPMODEL_KEY);
        String optString7 = jSONObject.optString(SECDATAVERSION_KEY);
        String optString8 = jSONObject.optString(ROOT_KEY);
        String optString9 = jSONObject.optString("bi");
        boolean z = optString != null && !optString.trim().equals("");
        boolean z2 = optString9 != null && !optString9.trim().equals("");
        if (!z && !z2) {
            return null;
        }
        String[] strArr3 = {""};
        String[] strArr4 = {""};
        String[] strArr5 = {""};
        if (optString2 != null) {
            String[] split = optString2.split(";");
            while (i2 < split.length) {
                if (split[i2].equals("#")) {
                    i = 1;
                    split[i2] = split[i2 - 1];
                } else {
                    i = 1;
                }
                i2 += i;
                strArr5 = strArr5;
            }
            strArr2 = strArr5;
            strArr = split;
        } else {
            strArr2 = strArr5;
            strArr = strArr3;
        }
        String[] split2 = optString3 != null ? optString3.split(";") : strArr4;
        if (optString5 != null) {
            strArr2 = optString5.split(";");
        }
        if (!z || z2) {
            String[] split3 = optString9.split(";");
            int i3 = 0;
            while (i3 < split3.length) {
                BICDataModel bICDataModel = new BICDataModel(split3[i3], strArr[i3 > strArr.length - 1 ? 0 : i3], split2[i3 > split2.length - 1 ? 0 : i3], strArr2[i3 > strArr2.length - 1 ? 0 : i3]);
                bICDataModel.setCpModel(optString6);
                bICDataModel.setServiceVersion(CommonUtils.isBlank(optString4) ? 15 : Integer.parseInt(optString4));
                bICDataModel.setSecDataVersion(CommonUtils.isBlank(optString7) ? 15 : Integer.parseInt(optString7));
                bICDataModel.setRootStatus(CommonUtils.isBlank(optString8) ? 0 : Integer.parseInt(optString8));
                arrayList.add(bICDataModel);
                i3++;
            }
        } else {
            String[] split4 = optString.split(";");
            int i4 = 0;
            while (i4 < split4.length) {
                BICDataModel bICDataModel2 = new BICDataModel(split4[i4], strArr[i4 > strArr.length - 1 ? 0 : i4], split2[i4 > split2.length - 1 ? 0 : i4], strArr2[i4 > strArr2.length - 1 ? 0 : i4]);
                bICDataModel2.setCpModel(optString6);
                bICDataModel2.setServiceVersion(CommonUtils.isBlank(optString4) ? 15 : Integer.parseInt(optString4));
                bICDataModel2.setSecDataVersion(CommonUtils.isBlank(optString4) ? 15 : Integer.parseInt(optString4));
                bICDataModel2.setRootStatus(0);
                arrayList.add(bICDataModel2);
                i4++;
            }
        }
        return arrayList;
    }
}
