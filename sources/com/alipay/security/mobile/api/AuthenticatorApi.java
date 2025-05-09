package com.alipay.security.mobile.api;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.security.mobile.agent.AuthenticatorLock;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.AuthenticatorLOG;
import com.alipay.security.mobile.auth.Constants;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.alipay.security.mobile.util.CommonUtils;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.util.LogCollect;
import com.alipay.security.mobile.util.TrackEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AuthenticatorApi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String sCacheAAID = "";
    private static String sSecDataCache = "";
    private static long sSecDataValid;
    public static int sSystemFaceNumber;
    public static int sSystemFingerPrintNumber;
    public static int TYPE_FINGERPRINT = Constants.TYPE_FINGERPRINT;
    public static int TYPE_BRACELET = Constants.TYPE_BRACELET;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class FpServiceErrItem {
        public String err;
        public String errLog;
        public String extend;
        public String func;

        public FpServiceErrItem(String str, String str2, String str3, String str4) {
            this.func = str == null ? "" : str;
            this.err = str2 == null ? "" : str2;
            this.errLog = str3 == null ? "" : str3;
            this.extend = str4 == null ? "" : str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:8:0x0020, B:10:0x002a, B:12:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004f, B:25:0x0058, B:27:0x005c, B:29:0x0062, B:30:0x0065, B:31:0x0068, B:32:0x006a), top: B:35:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:8:0x0020, B:10:0x002a, B:12:0x0036, B:16:0x003e, B:18:0x0046, B:20:0x004f, B:25:0x0058, B:27:0x005c, B:29:0x0062, B:30:0x0065, B:31:0x0068, B:32:0x006a), top: B:35:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void buildBiModel(android.content.Context r5, com.alipay.security.mobile.api.BICDataModel r6, boolean r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.security.mobile.api.AuthenticatorApi.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r5
            r7[r0] = r6
            r5 = 2
            r7[r5] = r3
            java.lang.String r5 = "6224decd"
            r2.ipc$dispatch(r5, r7)
            return
        L_0x001d:
            if (r6 != 0) goto L_0x0020
            return
        L_0x0020:
            android.content.Context r5 = r5.getApplicationContext()     // Catch: Exception -> 0x003b
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: Exception -> 0x003b
            r3 = 23
            if (r2 < r3) goto L_0x003d
            java.lang.String r2 = "fingerprint"
            java.lang.Object r2 = r5.getSystemService(r2)     // Catch: Exception -> 0x003b
            android.hardware.fingerprint.FingerprintManager r2 = tb.cj9.a(r2)     // Catch: Exception -> 0x003b
            if (r2 == 0) goto L_0x003d
            boolean r2 = tb.lzb.a(r2)     // Catch: Exception -> 0x003b
            goto L_0x003e
        L_0x003b:
            r5 = move-exception
            goto L_0x0077
        L_0x003d:
            r2 = 0
        L_0x003e:
            int r3 = com.alipay.security.mobile.api.AuthenticatorApi.sSystemFingerPrintNumber     // Catch: Exception -> 0x003b
            org.ifaa.android.manager.IFAAManager r4 = com.alipay.security.mobile.alipayauthenticatorservice.fingerprint.manager.IFAAFingerprintManagerFactory.getIFAAManager(r5)     // Catch: Exception -> 0x003b
            if (r4 == 0) goto L_0x0055
            int r5 = r4.getSupportBIOTypes(r5)     // Catch: Exception -> 0x003b
            int r4 = com.alipay.security.mobile.auth.Constants.TYPE_FINGERPRINT     // Catch: Exception -> 0x003b
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0055
            r5 = r5 & 16
            if (r5 == 0) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r7 == 0) goto L_0x0068
            int r7 = com.alipay.security.mobile.api.AuthenticatorApi.sSystemFingerPrintNumber     // Catch: Exception -> 0x003b
            if (r7 <= 0) goto L_0x0065
            int r7 = r6.getClientStatus()     // Catch: Exception -> 0x003b
            if (r7 == r0) goto L_0x0065
            r6.hasAi = r0     // Catch: Exception -> 0x003b
            goto L_0x006a
        L_0x0065:
            r6.hasAi = r1     // Catch: Exception -> 0x003b
            goto L_0x006a
        L_0x0068:
            r6.hasAi = r0     // Catch: Exception -> 0x003b
        L_0x006a:
            r6.setSensorSupport(r2)     // Catch: Exception -> 0x003b
            r6.setBioInput(r3)     // Catch: Exception -> 0x003b
            r6.setAccessPermission(r0)     // Catch: Exception -> 0x003b
            r6.setHardwareInfo(r5)     // Catch: Exception -> 0x003b
            goto L_0x007a
        L_0x0077:
            com.alipay.security.mobile.auth.AuthenticatorLOG.error(r5)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.security.mobile.api.AuthenticatorApi.buildBiModel(android.content.Context, com.alipay.security.mobile.api.BICDataModel, boolean):void");
    }

    private static void buildFaceBiModel(BICDataModel bICDataModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a945b3fe", new Object[]{bICDataModel, new Boolean(z)});
        } else if (bICDataModel != null) {
            try {
                int i = sSystemFaceNumber;
                if (!z) {
                    bICDataModel.hasAi = true;
                } else if (i <= 0 || bICDataModel.getClientStatus() == 1) {
                    bICDataModel.hasAi = false;
                } else {
                    bICDataModel.hasAi = true;
                }
                bICDataModel.setSensorSupport(1);
                bICDataModel.setBioInput(i);
                bICDataModel.setAccessPermission(1);
                bICDataModel.setHardwareInfo(0);
            } catch (Throwable th) {
                AuthenticatorLOG.error(th);
            }
        }
    }

    public static IAuthenticator create(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("8b63650b", new Object[]{context, new Integer(i)});
        }
        return AuthenticatorFactory.create(context.getApplicationContext(), i);
    }

    public static String getFastPayAuthData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f0d095d", new Object[]{context, str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            try {
                AuthenticatorLOG.fpInfo("getFastPayAuthData enter [userID:" + str + "]");
                long currentTimeMillis = System.currentTimeMillis();
                if (CommonUtils.isBlank(sSecDataCache) || sSecDataValid <= System.currentTimeMillis()) {
                    Context applicationContext = context.getApplicationContext();
                    ArrayList arrayList = new ArrayList();
                    BICDataModel authModelByAuthType = getAuthModelByAuthType(applicationContext, 1, 0, null);
                    buildBiModel(applicationContext, authModelByAuthType, false);
                    if (authModelByAuthType != null) {
                        arrayList.add(authModelByAuthType);
                    }
                    BICDataModel authModelByAuthType2 = getAuthModelByAuthType(applicationContext, Constants.TYPE_FACE, 0, str);
                    buildFaceBiModel(authModelByAuthType2, true);
                    if (authModelByAuthType2 != null) {
                        arrayList.add(authModelByAuthType2);
                    }
                    BICDataModel authModelByAuthType3 = getAuthModelByAuthType(applicationContext, 2, 0, str);
                    if (authModelByAuthType3 != null && authModelByAuthType3.getClientStatus() == 2) {
                        arrayList.add(authModelByAuthType3);
                    }
                    sSecDataCache = BICDataUtil.secData2Json(arrayList, applicationContext);
                    sSecDataValid = System.currentTimeMillis() + 5000;
                    AuthenticatorLOG.fpInfo("getFastPayAuthData exit [result:" + sSecDataCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + "]");
                    return sSecDataCache;
                }
                return sSecDataCache;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getFastPayAuthDataWithNoLog(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdfc5aca", new Object[]{context, str});
        }
        return getFastPayAuthData(context, str);
    }

    public static String getFingerprintExtInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1010eec0", new Object[]{context});
        }
        try {
            return IFAAManagerAdaptor.getFingerprintExtInfo(context);
        } catch (Throwable th) {
            AuthenticatorLOG.fpInfo(th.toString());
            return null;
        }
    }

    public static String getFpAAID(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2831e25a", new Object[]{context});
        }
        if (!CommonUtils.isBlank(sCacheAAID)) {
            AuthenticatorLOG.fpInfo("getFpAAID exit [cache result:" + sCacheAAID + "]");
            return sCacheAAID;
        }
        String deviceMode = AuthenticatorFactory.getDeviceMode(context);
        sCacheAAID = deviceMode;
        if (deviceMode != null) {
            sCacheAAID = deviceMode.replace("-", "#");
        }
        AuthenticatorLOG.fpInfo("getFpAAID exit [new result:" + sCacheAAID + "]");
        return sCacheAAID;
    }

    public static List<FpServiceErrItem> getFpServiceErr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("52f1d390", new Object[0]);
        }
        return LogCollect.getErr();
    }

    public static String getPayAuthData(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9116059", new Object[]{context, str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            try {
                AuthenticatorLOG.fpInfo("getPayAuthData enter [userID:" + str + "]");
                long currentTimeMillis = System.currentTimeMillis();
                if (CommonUtils.isBlank(sSecDataCache) || sSecDataValid <= System.currentTimeMillis()) {
                    Context applicationContext = context.getApplicationContext();
                    ArrayList arrayList = new ArrayList();
                    BICDataModel authModelByAuthType = getAuthModelByAuthType(applicationContext, 1, 0, str);
                    buildBiModel(applicationContext, authModelByAuthType, false);
                    if (authModelByAuthType != null) {
                        arrayList.add(authModelByAuthType);
                    }
                    BICDataModel authModelByAuthType2 = getAuthModelByAuthType(applicationContext, Constants.TYPE_FACE, 0, str);
                    buildFaceBiModel(authModelByAuthType2, true);
                    if (authModelByAuthType2 != null) {
                        arrayList.add(authModelByAuthType2);
                    }
                    BICDataModel authModelByAuthType3 = getAuthModelByAuthType(applicationContext, 2, 0, str);
                    if (authModelByAuthType3 != null && authModelByAuthType3.getClientStatus() == 2) {
                        arrayList.add(authModelByAuthType3);
                    }
                    sSecDataCache = BICDataUtil.secData2Json(arrayList, applicationContext);
                    sSecDataValid = System.currentTimeMillis() + 5000;
                    AuthenticatorLOG.fpInfo("getPayAuthData exit [result:" + sSecDataCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + "]");
                    return sSecDataCache;
                }
                AuthenticatorLOG.fpInfo("getPayAuthData exit [result:" + sSecDataCache + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + "]");
                return sSecDataCache;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getRegAuthData(Context context, int i, int i2, String str) {
        String secData2Json;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cb5d025", new Object[]{context, new Integer(i), new Integer(i2), str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            try {
                AuthenticatorLOG.fpInfo("getRegAuthData enter [userID:" + str + "]");
                long currentTimeMillis = System.currentTimeMillis();
                Context applicationContext = context.getApplicationContext();
                ArrayList arrayList = new ArrayList();
                BICDataModel authModelByAuthType = getAuthModelByAuthType(applicationContext, 1, 0, str);
                buildBiModel(applicationContext, authModelByAuthType, false);
                if (authModelByAuthType != null) {
                    arrayList.add(authModelByAuthType);
                }
                BICDataModel authModelByAuthType2 = getAuthModelByAuthType(applicationContext, Constants.TYPE_FACE, 0, str);
                buildFaceBiModel(authModelByAuthType2, false);
                if (authModelByAuthType2 != null) {
                    arrayList.add(authModelByAuthType2);
                }
                BICDataModel authModelByAuthType3 = getAuthModelByAuthType(applicationContext, 2, 1, str);
                if (authModelByAuthType3 != null) {
                    arrayList.add(authModelByAuthType3);
                }
                if (authModelByAuthType3 != null) {
                    arrayList.add(new BICDataModel(authModelByAuthType3.getClientStatus(), 2, 2, authModelByAuthType3.getProtocalType(), authModelByAuthType3.getProtocalVersion(), authModelByAuthType3.getVendor(), authModelByAuthType3.getServiceVersion(), authModelByAuthType3.getDeviceId(), authModelByAuthType3.getPhoneModel()));
                }
                secData2Json = BICDataUtil.secData2Json(arrayList, applicationContext);
                AuthenticatorLOG.fpInfo("getRegAuthData exit [result:" + secData2Json + "] [timecost:" + (System.currentTimeMillis() - currentTimeMillis) + "]");
            } catch (Throwable th) {
                throw th;
            }
        }
        return secData2Json;
    }

    private static BICDataModel getAuthModelByAuthType(Context context, int i, int i2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BICDataModel) ipChange.ipc$dispatch("64631c8b", new Object[]{context, new Integer(i), new Integer(i2), str});
        }
        synchronized (AuthenticatorLock.INIT_LOCK) {
            try {
                Context applicationContext = context.getApplicationContext();
                try {
                    IAuthenticator create = create(applicationContext, i);
                    int init = create.init(applicationContext, new AuthenticatorCallback() { // from class: com.alipay.security.mobile.api.AuthenticatorApi.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
                        public void callback(AuthenticatorResponse authenticatorResponse) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                            }
                        }
                    }, str);
                    if (!(init == 111 || init == 105 || init == 106 || init == 126)) {
                        if (i == 1) {
                            sSystemFingerPrintNumber = create.registedFingerPrintNumber();
                        }
                        if (i == Constants.TYPE_FACE) {
                            sSystemFaceNumber = create.registedFingerPrintNumber();
                        }
                        AuthInfo authInfo = create.getAuthInfo();
                        String deviceId = create.getDeviceId();
                        int checkUserStatus = !CommonUtils.isBlank(str) ? create.checkUserStatus(str) : 2;
                        int i3 = init == 127 ? 5 : 6;
                        int parseInt = Integer.parseInt(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_IFAA_DI_MAX_LENGTH, "100"));
                        if (parseInt <= 0 || (!TextUtils.isEmpty(deviceId) && deviceId.length() <= parseInt)) {
                            str2 = deviceId;
                        } else {
                            TrackEvent.getIns().event(null, "di为空 或者 di超长,替换为\"null\"占位");
                            str2 = "null";
                        }
                        return new BICDataModel(checkUserStatus, authInfo.getType(), i2, authInfo.getProtocolType(), authInfo.getProtocolVersion(), authInfo.getVendor(), i3, str2, authInfo.getPhoneModle());
                    }
                    return null;
                } catch (Exception unused) {
                    TrackEvent.getIns().event(null, "AuthenticatorApi :: getAuthModelByAuthType error!");
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
