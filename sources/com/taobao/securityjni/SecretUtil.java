package com.taobao.securityjni;

import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.securityjni.tools.DataContext;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.SecurityGuardParamContext;
import com.taobao.wireless.security.sdk.indiekit.IIndieKitComponent;
import com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent;
import com.taobao.wireless.security.sdk.securesignature.SecureSignatureDefine;
import java.util.HashMap;
import java.util.TreeMap;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SecretUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String M_API = "API";
    public static final String M_DATA = "DATA";
    public static final String M_DEV = "DEV";
    public static final String M_ECODE = "ECODE";
    public static final String M_IMEI = "IMEI";
    public static final String M_IMSI = "IMSI";
    public static final String M_SSO = "SSO";
    public static final String M_TIME = "TIME";
    public static final String M_V = "V";
    private IIndieKitComponent indieKitProxy;
    private SecurityGuardManager manager;
    private ISecureSignatureComponent signProxy;

    static {
        t2o.a(421527569);
    }

    public SecretUtil(ContextWrapper contextWrapper) {
        SecurityGuardManager instance = SecurityGuardManager.getInstance(contextWrapper);
        this.manager = instance;
        if (instance != null) {
            this.signProxy = instance.getSecureSignatureComp();
            this.indieKitProxy = this.manager.getIndieKitComp();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getExternalSign(java.util.LinkedHashMap<java.lang.String, java.lang.String> r9, com.taobao.securityjni.tools.DataContext r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.securityjni.SecretUtil.getExternalSign(java.util.LinkedHashMap, com.taobao.securityjni.tools.DataContext):java.lang.String");
    }

    public String getLaiwangSign(String str, String str2, DataContext dataContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4ab59ec", new Object[]{this, str, str2, dataContext});
        }
        if (!(this.signProxy == null || dataContext == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("INPUT", str);
            hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_KEY, str2);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 7;
            byte[] bArr = dataContext.extData;
            if (bArr == null) {
                int i2 = dataContext.index;
                if (i2 >= 0) {
                    i = i2;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            } else if (bArr.length == 0) {
                return null;
            } else {
                securityGuardParamContext.appKey = new String(bArr);
            }
            return this.signProxy.signRequest(securityGuardParamContext);
        }
        return null;
    }

    public String getLoginTopToken(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8afdf4e", new Object[]{this, str, str2}) : getLoginTopToken(str, str2, new DataContext(0, null));
    }

    public String getMtopSign(HashMap<String, String> hashMap, DataContext dataContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c928e774", new Object[]{this, hashMap, dataContext});
        }
        if (!(this.signProxy == null || hashMap == null || dataContext == null)) {
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 3;
            byte[] bArr = dataContext.extData;
            if (bArr == null) {
                int i2 = dataContext.index;
                if (i2 >= 0) {
                    i = i2;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            } else if (bArr.length == 0) {
                return null;
            } else {
                securityGuardParamContext.appKey = new String(bArr);
            }
            return this.signProxy.signRequest(securityGuardParamContext);
        }
        return null;
    }

    public String getMtopV4RespSign(String str, DataContext dataContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e80a7f2b", new Object[]{this, str, dataContext});
        }
        if (!(this.signProxy == null || dataContext == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("INPUT", str);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 5;
            byte[] bArr = dataContext.extData;
            if (bArr == null) {
                int i2 = dataContext.index;
                if (i2 >= 0) {
                    i = i2;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            } else if (bArr.length == 0) {
                return null;
            } else {
                securityGuardParamContext.appKey = new String(bArr);
            }
            return this.signProxy.signRequest(securityGuardParamContext);
        }
        return null;
    }

    public String getMtopV4Sign(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, DataContext dataContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("766bd741", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, dataContext});
        }
        if (!(this.signProxy == null || dataContext == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("ECODE", str);
            hashMap.put("DATA", str2);
            hashMap.put("TIME", str3);
            hashMap.put("API", str4);
            hashMap.put("V", str5);
            hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_SID, str6);
            hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_TTID, str7);
            hashMap.put("DEVICEID", str8);
            hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_LAT, str9);
            hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_LNG, str10);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 4;
            byte[] bArr = dataContext.extData;
            if (bArr == null) {
                int i2 = dataContext.index;
                if (i2 >= 0) {
                    i = i2;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            } else if (bArr.length == 0) {
                return null;
            } else {
                securityGuardParamContext.appKey = new String(bArr);
            }
            return this.signProxy.signRequest(securityGuardParamContext);
        }
        return null;
    }

    public String getQianNiuSign(byte[] bArr, byte[] bArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a0b262f", new Object[]{this, bArr, bArr2});
        }
        if (this.signProxy == null || bArr == null || bArr2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = new String(bArr);
        String str2 = new String(bArr2);
        hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_STR1, str);
        hashMap.put(SecureSignatureDefine.SG_KEY_SIGN_STR2, str2);
        SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
        securityGuardParamContext.paramMap = hashMap;
        securityGuardParamContext.requestType = 9;
        return this.signProxy.signRequest(securityGuardParamContext);
    }

    public String getSign(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1f38a3ea", new Object[]{this, str, str2, str3, str4, str5, str6}) : getSign(str, str2, str3, str4, str5, null, str6);
    }

    public String getTopSign(TreeMap<String, String> treeMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("92818840", new Object[]{this, treeMap}) : getTopSign(treeMap, new DataContext(0, null));
    }

    public String indieKitRequest(SecurityGuardParamContext securityGuardParamContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82233b7", new Object[]{this, securityGuardParamContext});
        }
        IIndieKitComponent iIndieKitComponent = this.indieKitProxy;
        if (iIndieKitComponent == null) {
            return null;
        }
        return iIndieKitComponent.indieKitRequest(securityGuardParamContext);
    }

    public int reportSusText(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4805758", new Object[]{this, str, str2})).intValue();
        }
        throw new UnsupportedOperationException();
    }

    public String signRequest(SecurityGuardParamContext securityGuardParamContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41620bd9", new Object[]{this, securityGuardParamContext});
        }
        ISecureSignatureComponent iSecureSignatureComponent = this.signProxy;
        if (iSecureSignatureComponent == null) {
            return null;
        }
        return iSecureSignatureComponent.signRequest(securityGuardParamContext);
    }

    public int validateFileSignature(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91f798be", new Object[]{this, str, str2, str3})).intValue();
        }
        return -1;
    }

    public String getSign(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fff988e0", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
        }
        if (str == null || str2 == null || str3 == null || str4 == null || str7 == null) {
            return null;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("API", str);
        hashMap.put("V", str2);
        hashMap.put("IMEI", str3);
        hashMap.put("IMSI", str4);
        if (str5 != null) {
            hashMap.put("DATA", str5);
        }
        if (str6 != null) {
            hashMap.put("ECODE", str6);
        }
        hashMap.put("TIME", str7);
        return getSign(hashMap, new DataContext(0, null));
    }

    public String getLoginTopToken(String str, String str2, DataContext dataContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2aa15193", new Object[]{this, str, str2, dataContext});
        }
        if (!(this.indieKitProxy == null || str == null || str2 == null || dataContext == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("username", str);
            hashMap.put("timestamp", str2);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 0;
            byte[] bArr = dataContext.extData;
            if (bArr == null) {
                int i2 = dataContext.index;
                if (i2 >= 0) {
                    i = i2;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            } else if (bArr.length == 0) {
                return null;
            } else {
                securityGuardParamContext.appKey = new String(bArr);
            }
            return this.indieKitProxy.indieKitRequest(securityGuardParamContext);
        }
        return null;
    }

    public String getTopSign(TreeMap<String, String> treeMap, DataContext dataContext) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97bbac05", new Object[]{this, treeMap, dataContext});
        }
        if (!(this.signProxy == null || treeMap == null || treeMap.isEmpty())) {
            StringBuilder sb = new StringBuilder(512);
            for (String str : treeMap.keySet()) {
                String str2 = treeMap.get(str);
                if (str2 != null) {
                    sb.append(str);
                    sb.append(str2);
                } else {
                    sb.append(str);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("INPUT", sb.toString());
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 2;
            byte[] bArr = dataContext.extData;
            if (bArr == null) {
                int i2 = dataContext.index;
                if (i2 >= 0) {
                    i = i2;
                }
                dataContext.index = i;
                String appKeyByIndex = this.manager.getStaticDataStoreComp().getAppKeyByIndex(dataContext.index);
                if (appKeyByIndex != null && !"".equals(appKeyByIndex)) {
                    securityGuardParamContext.appKey = appKeyByIndex;
                }
            } else if (bArr.length == 0) {
                return null;
            } else {
                securityGuardParamContext.appKey = new String(bArr);
            }
            return this.signProxy.signRequest(securityGuardParamContext);
        }
        return null;
    }

    public String getSign(HashMap<String, String> hashMap, DataContext dataContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("25709e8c", new Object[]{this, hashMap, dataContext}) : getMtopSign(hashMap, dataContext);
    }
}
