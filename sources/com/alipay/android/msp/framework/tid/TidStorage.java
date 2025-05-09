package com.alipay.android.msp.framework.tid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.app.helper.Tid;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.encrypt.Des;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftManager;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TidStorage {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BROADCAST_TID_CHANGED = "com.alipay.android.app.CASHIER_TID_CHANGED";
    private static final int CORRECT_TID_STR_LENGTH = 64;
    private static final String KEY_CLIENTKEY = "client_key";
    private static final String KEY_TID = "tid";
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final String KEY_UTDID = "utdid";
    private static final String KEY_VIMEI = "vimei";
    private static final String KEY_VIMSI = "vimsi";
    private static final String PREF_FILE_TID = "alipay_tid_storage";
    private static final String PREF_KEY_FLAG_SYNCED_TO_SEC = "synced_to_sec_flag";
    private static final String PREF_KEY_FLAG_WROTE_SEC = "wrote_to_sec_flag";
    private static final String PREF_KEY_NON_SEC_TID = "tidinfo";
    public static final String PREF_KEY_SEC_TID = "encrypt_tidinfo";
    private static final String TAG = "TidStorage";
    private static Context mContext;
    private static volatile TidStorage mInstance;
    private String mClientKey;
    private String mTid;
    private long mTimestamp;
    private String mUtdid;
    private String mVimei;
    private String mVimsi;
    private boolean mSafeStoreTidSwitch = false;
    private boolean mSwitchToSafeAndCleanNonSafeSwitch = false;
    private boolean isInitialized = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class LocalPreference {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private LocalPreference() {
        }

        private static boolean checkCtx(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("65564954", new Object[]{str})).booleanValue();
            }
            if (TidStorage.access$000() == null) {
                TidStorage.access$002(GlobalHelper.getInstance().getContext());
            }
            if (TidStorage.access$000() != null) {
                return true;
            }
            TidStorage.access$100(ErrorType.DEFAULT, "TidStorageCtxNull", str);
            return false;
        }

        public static void delete(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("884180c6", new Object[]{str, str2});
            } else if (checkCtx("delete")) {
                TidStorage.access$000().getSharedPreferences(str, 0).edit().remove(str2).apply();
            }
        }

        public static boolean exist(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3a62a16", new Object[]{str, str2})).booleanValue();
            }
            if (!checkCtx("exit")) {
                return false;
            }
            return TidStorage.access$000().getSharedPreferences(str, 0).contains(str2);
        }

        private static String generateAK() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f3975bfa", new Object[0]);
            }
            try {
                str = TidStorage.access$000().getApplicationContext().getPackageName();
            } catch (Throwable unused) {
                TidStorage.access$100(ErrorType.DEFAULT, ErrorCode.TID_GEN_DES_KEY_EX, "pkgName null");
                str = "";
            }
            LogUtil.record(2, "", "TidStorage.generateDesKey", "packageName:".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                str = "unknow";
            }
            return (str + "1111111111111111").substring(0, 16);
        }

        private static String generateDesKey() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("54bab577", new Object[0]);
            }
            try {
                str = TidStorage.access$000().getApplicationContext().getPackageName();
            } catch (Throwable unused) {
                TidStorage.access$100(ErrorType.DEFAULT, ErrorCode.TID_GEN_DES_KEY_EX, "pkgName null");
                str = "";
            }
            LogUtil.record(2, "", "TidStorage.generateDesKey", "packageName:".concat(String.valueOf(str)));
            if (TextUtils.isEmpty(str)) {
                str = "unknow";
            }
            return (str + "00000000").substring(0, 8);
        }

        private static String generateOldDesKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bddca45a", new Object[0]);
            }
            return "!@#23457";
        }

        public static String getLocalPreferences(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d55f0342", new Object[]{str, str2}) : getLocalPreferences(str, str2, true);
        }

        public static void putLocalPreferences(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3f737e1", new Object[]{str, str2, str3});
            } else {
                putLocalPreferences(str, str2, str3, true);
            }
        }

        public static String getLocalPreferences(String str, String str2, boolean z) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("79bf89ea", new Object[]{str, str2, new Boolean(z)});
            }
            if (!checkCtx("getLocalSp")) {
                return null;
            }
            String string = TidStorage.access$000().getSharedPreferences(str, 0).getString(str2, null);
            if (TextUtils.isEmpty(string) || !z) {
                str3 = string;
            } else {
                String generateAK = generateAK();
                str3 = Des.decryptAES(string, generateAK);
                if (TextUtils.isEmpty(str3)) {
                    str3 = Des.decrypt(string, generateDesKey());
                    if (!TextUtils.isEmpty(str3)) {
                        putLocalPreferences(str, str2, str3, true);
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = Des.decrypt(string, generateOldDesKey());
                    if (!TextUtils.isEmpty(str3)) {
                        putLocalPreferences(str, str2, str3, true);
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    TidStorage.access$100(ErrorType.DEFAULT, ErrorCode.DATA_TID_DECRPTY, "");
                    LogUtil.e(TidStorage.TAG, "getLocalPreferences", "decrypt fail, value=" + string + ", ak=" + generateAK);
                }
            }
            LogUtil.i(TidStorage.TAG, "getLocalPreferences", "value=".concat(String.valueOf(string)));
            return str3;
        }

        public static void putLocalPreferences(String str, String str2, String str3, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("daf07713", new Object[]{str, str2, str3, new Boolean(z)});
            } else if (checkCtx("putLocalSp")) {
                SharedPreferences sharedPreferences = TidStorage.access$000().getSharedPreferences(str, 0);
                if (z) {
                    String generateAK = generateAK();
                    String encryptAES = Des.encryptAES(str3, generateAK);
                    if (TextUtils.isEmpty(encryptAES)) {
                        encryptAES = Des.encrypt(str3, generateDesKey());
                    }
                    if (TextUtils.isEmpty(encryptAES)) {
                        TidStorage.access$100(ErrorType.DATA, ErrorCode.DATA_TID_ENCRPTY, "");
                        LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "TidStorage.putLocalPreferences", "encrypt fail, content=" + str3 + ", ak=" + generateAK);
                    }
                    str3 = encryptAES;
                }
                LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "TidStorage.putLocalPreferences", "target = ".concat(String.valueOf(str3)));
                sharedPreferences.edit().putString(str2, str3).apply();
            }
        }
    }

    public static /* synthetic */ Context access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bf71316f", new Object[0]);
        }
        return mContext;
    }

    public static /* synthetic */ Context access$002(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7ce2167", new Object[]{context});
        }
        mContext = context;
        return context;
    }

    public static /* synthetic */ void access$100(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3748ca96", new Object[]{str, str2, str3});
        } else {
            logError(str, str2, str3);
        }
    }

    private String genVirtualCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1be56dd1", new Object[]{this});
        }
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    public static synchronized TidStorage getInstance() {
        synchronized (TidStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TidStorage) ipChange.ipc$dispatch("62f480a", new Object[0]);
            }
            return getInstance(GlobalHelper.getInstance().getContext());
        }
    }

    private String getSecTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81cc5e05", new Object[]{this});
        }
        return LocalPreference.getLocalPreferences(PREF_FILE_TID, PREF_KEY_SEC_TID, true);
    }

    private boolean isIllegal(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3c6be9f", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return true;
        }
        return false;
    }

    public static synchronized boolean isInitialized() {
        synchronized (TidStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("18d112d5", new Object[0])).booleanValue();
            } else if (mInstance == null || !mInstance.isInitialized) {
                return false;
            } else {
                return true;
            }
        }
    }

    private boolean isSecTidExist() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6cbc9a", new Object[]{this})).booleanValue();
        }
        return LocalPreference.exist(PREF_FILE_TID, PREF_KEY_FLAG_WROTE_SEC);
    }

    private boolean isTidSyncedToSec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25f02042", new Object[]{this})).booleanValue();
        }
        return LocalPreference.exist(PREF_FILE_TID, PREF_KEY_FLAG_SYNCED_TO_SEC);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void loadNonSecTidToMemory() {
        /*
            r10 = this;
            java.lang.String r0 = ""
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.msp.framework.tid.TidStorage.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0014
            java.lang.String r0 = "6e766fe8"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r1.ipc$dispatch(r0, r2)
            return
        L_0x0014:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 0
            java.lang.String r4 = r10.getNonSecTid()     // Catch: Exception -> 0x0063
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: Exception -> 0x0063
            if (r5 != 0) goto L_0x0067
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: Exception -> 0x0063
            r5.<init>(r4)     // Catch: Exception -> 0x0063
            java.lang.String r4 = "tid"
            java.lang.String r4 = r5.optString(r4, r0)     // Catch: Exception -> 0x0063
            java.lang.String r6 = "client_key"
            java.lang.String r6 = r5.optString(r6, r0)     // Catch: Exception -> 0x005f
            java.lang.String r7 = "timestamp"
            long r8 = java.lang.System.currentTimeMillis()     // Catch: Exception -> 0x005b
            long r1 = r5.optLong(r7, r8)     // Catch: Exception -> 0x005b
            java.lang.String r7 = "vimei"
            java.lang.String r7 = r5.optString(r7, r0)     // Catch: Exception -> 0x005b
            java.lang.String r8 = "vimsi"
            java.lang.String r8 = r5.optString(r8, r0)     // Catch: Exception -> 0x0058
            java.lang.String r9 = "utdid"
            java.lang.String r3 = r5.optString(r9, r0)     // Catch: Exception -> 0x0056
            goto L_0x006f
        L_0x0056:
            r0 = move-exception
            goto L_0x006c
        L_0x0058:
            r0 = move-exception
            r8 = r3
            goto L_0x006c
        L_0x005b:
            r0 = move-exception
            r7 = r3
        L_0x005d:
            r8 = r7
            goto L_0x006c
        L_0x005f:
            r0 = move-exception
            r6 = r3
        L_0x0061:
            r7 = r6
            goto L_0x005d
        L_0x0063:
            r0 = move-exception
            r4 = r3
            r6 = r4
            goto L_0x0061
        L_0x0067:
            r0 = r3
            r6 = r0
            r7 = r6
            r8 = r7
            goto L_0x0071
        L_0x006c:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r0)
        L_0x006f:
            r0 = r3
            r3 = r4
        L_0x0071:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "tid="
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r5 = ", clientKey="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = ", timestamp="
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ", vimei="
            r4.append(r5)
            r4.append(r7)
            java.lang.String r5 = ", vimsi="
            r4.append(r5)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "TidStorage"
            java.lang.String r9 = "loadNonSecTidToMemory"
            com.alipay.android.msp.utils.LogUtil.i(r5, r9, r4)
            r10.checkTidUtdidMisMatch(r0)
            boolean r4 = r10.isIllegal(r3, r6, r7, r8)
            if (r4 == 0) goto L_0x00b5
            r10.resetTid()
            return
        L_0x00b5:
            r10.mTid = r3
            r10.mClientKey = r6
            r10.mTimestamp = r1
            r10.mVimei = r7
            r10.mVimsi = r8
            r10.mUtdid = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.tid.TidStorage.loadNonSecTidToMemory():void");
    }

    private static void logError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574b6f49", new Object[]{str, str2, str3});
        } else {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, str, str2, str3);
        }
    }

    private void removeNonSecTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10e4c8e", new Object[]{this});
        } else {
            LocalPreference.delete(PREF_FILE_TID, PREF_KEY_NON_SEC_TID);
        }
    }

    private void removeSecTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba13f3a9", new Object[]{this});
        } else {
            LocalPreference.delete(PREF_FILE_TID, PREF_KEY_SEC_TID);
        }
    }

    private void resetTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dab1947", new Object[]{this});
            return;
        }
        this.mTid = "";
        this.mClientKey = genClientKey();
        this.mTimestamp = System.currentTimeMillis();
        this.mVimei = genVirtualCode();
        this.mVimsi = genVirtualCode();
        this.mUtdid = "";
        if (this.mSafeStoreTidSwitch) {
            removeSecTid();
            setSecTidExist(false);
        }
        removeNonSecTid();
    }

    private void sendTidChangedNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0e7bfd", new Object[]{this});
            return;
        }
        LogUtil.record(2, "TidStorage:sendTidChangedNotify", "new_tid:" + this.mTid);
        try {
            Intent intent = new Intent(BROADCAST_TID_CHANGED);
            intent.putExtra("new_tid", this.mTid);
            LocalBroadcastManager.getInstance(mContext).sendBroadcast(intent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private void setSecTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57695011", new Object[]{this, str});
        } else {
            LocalPreference.putLocalPreferences(PREF_FILE_TID, PREF_KEY_SEC_TID, str, true);
        }
    }

    private void setSecTidExist(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8017c836", new Object[]{this, new Boolean(z)});
        } else if (z) {
            LocalPreference.putLocalPreferences(PREF_FILE_TID, PREF_KEY_FLAG_WROTE_SEC, "true");
        } else {
            LocalPreference.delete(PREF_FILE_TID, PREF_KEY_FLAG_WROTE_SEC);
        }
    }

    private void setTidSyncedToSec(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb65701e", new Object[]{this, new Boolean(z)});
        } else if (z) {
            LocalPreference.putLocalPreferences(PREF_FILE_TID, PREF_KEY_FLAG_SYNCED_TO_SEC, "true");
        } else if (LocalPreference.exist(PREF_FILE_TID, PREF_KEY_FLAG_SYNCED_TO_SEC)) {
            LocalPreference.delete(PREF_FILE_TID, PREF_KEY_FLAG_SYNCED_TO_SEC);
        }
    }

    public void delete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691b3cb2", new Object[]{this});
            return;
        }
        LogUtil.record(8, AlipaySDKJSBridge.LOG_TAG, "TidStorage.delete", "mTid=" + this.mTid + ", mClientKey=" + this.mClientKey + ", mTimestamp=" + this.mTimestamp + ", mVimei=" + this.mVimei + ", mVimsi=" + this.mVimsi);
        resetTid();
    }

    public String genClientKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6e442855", new Object[]{this});
        }
        String hexString = Long.toHexString(System.currentTimeMillis());
        if (hexString.length() > 10) {
            return hexString.substring(hexString.length() - 10);
        }
        return hexString;
    }

    public String getClientKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebb8d9db", new Object[]{this});
        }
        return this.mClientKey;
    }

    public Tid getTID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Tid) ipChange.ipc$dispatch("27fc863e", new Object[]{this});
        }
        LogUtil.i(TAG, "getTID", "mTid=" + this.mTid + ", mClientKey=" + this.mClientKey + ", timeStamp=" + getTimestamp() + ", mVimei=" + this.mVimei + ", mVimsi=" + this.mVimsi);
        if (isEmpty()) {
            return null;
        }
        Tid tid = new Tid();
        tid.setTid(getTid());
        tid.setTidSeed(getClientKey());
        tid.setTimestamp(getTimestamp().longValue());
        return tid;
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.mTid;
    }

    public Long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("62937f4e", new Object[]{this});
        }
        return Long.valueOf(this.mTimestamp);
    }

    public String getVirtualImei() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("945b09dc", new Object[]{this});
        }
        return this.mVimei;
    }

    public String getVirtualImsi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3116b6a", new Object[]{this});
        }
        return this.mVimsi;
    }

    public boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        }
        return isIllegal(this.mTid, this.mClientKey, this.mVimei, this.mVimsi);
    }

    public void save(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25d0298", new Object[]{this, str, str2});
            return;
        }
        LogUtil.record(2, "", "TidStorage::save", "tid=" + str + ",clientKey=" + str2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.mTid = str;
            this.mClientKey = str2;
            this.mTimestamp = System.currentTimeMillis();
            this.mUtdid = GlobalHelper.getInstance().getUtdid(mContext);
            save();
            sendTidChangedNotify();
        }
    }

    public static synchronized TidStorage getInstance(Context context) {
        synchronized (TidStorage.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TidStorage) ipChange.ipc$dispatch("2e8241ee", new Object[]{context});
            }
            if (mInstance == null) {
                LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "TidStorage.getInstance", "mInstance == null");
                TidStorage tidStorage = new TidStorage();
                mInstance = tidStorage;
                tidStorage.initialize(context);
            }
            if (mContext == null) {
                logError(ErrorType.DEFAULT, "TidStorageCtxNull", "getInstance");
                mInstance.initialize(context);
            }
            return mInstance;
        }
    }

    private String getNonSecTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f78f124", new Object[]{this});
        }
        return LocalPreference.getLocalPreferences(PREF_FILE_TID, PREF_KEY_NON_SEC_TID, true);
    }

    private void setNonSecTid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e2ef3a", new Object[]{this, str});
        } else {
            LocalPreference.putLocalPreferences(PREF_FILE_TID, PREF_KEY_NON_SEC_TID, str, true);
        }
    }

    private boolean checkTidUtdidMisMatch(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1693f7c", new Object[]{this, str})).booleanValue();
        }
        String utdid = GlobalHelper.getInstance().getUtdid(mContext);
        if (TextUtils.isEmpty(utdid) || TextUtils.isEmpty(str) || TextUtils.equals(str, utdid)) {
            z = false;
        }
        if (z) {
            LogUtil.w(TAG, "checkTidUtdidMisMatch", "misMatch, old = " + str + ", latest = " + utdid);
            logError(ErrorType.WARNING, "tid_utdid_mismatch", "");
        }
        return z;
    }

    private void initialize(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{this, context});
            return;
        }
        if (context != null) {
            LogUtil.i(TAG, "initialize", "context != null");
            mContext = context.getApplicationContext();
        } else {
            mContext = GlobalHelper.getInstance().getContext();
            logError(ErrorType.DEFAULT, "TidStorageCtxNull", "initialize, mContext=" + mContext);
        }
        if (!this.isInitialized) {
            this.isInitialized = true;
            try {
                boolean isDegrade = DrmManager.getInstance(mContext).isDegrade(DrmKey.GRAY_SAFE_GUARD_PATH_TID, false, mContext);
                this.mSafeStoreTidSwitch = isDegrade;
                if (!isDegrade || !DrmManager.getInstance(mContext).isDegrade(DrmKey.GRAY_CLEAN_NON_SAFE_GUARD_TID_STORAGE, false, mContext)) {
                    z = false;
                }
                this.mSwitchToSafeAndCleanNonSafeSwitch = z;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            if (this.mSafeStoreTidSwitch) {
                StatisticCollector.addCount(StatisticCollector.GLOBAL_AGENT, CountValue.C_SAFE_STORE_TID, "safeStoreTid", "safeStoreTid");
            }
            LogUtil.i(TAG, "initialize", "mSafeStoreTidSwitch:" + this.mSafeStoreTidSwitch);
            if (this.mSafeStoreTidSwitch) {
                synchronizeSpTidInfo();
                loadSecTidToMemory();
            } else {
                setSecTidExist(false);
                loadNonSecTidToMemory();
                setTidSyncedToSec(false);
            }
            if (this.mSwitchToSafeAndCleanNonSafeSwitch) {
                removeNonSecTid();
            }
        }
    }

    private static boolean isTidJsonModelEqual(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd629117", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.equals(str, str2)) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("tid", "");
            String optString2 = jSONObject.optString("client_key", "");
            JSONObject jSONObject2 = new JSONObject(str2);
            String optString3 = jSONObject2.optString("tid", "");
            String optString4 = jSONObject2.optString("client_key", "");
            if (TextUtils.equals(optString, optString3)) {
                if (TextUtils.equals(optString2, optString4)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void loadSecTidToMemory() {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.tid.TidStorage.loadSecTidToMemory():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isTidAvailable() {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = ""
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.framework.tid.TidStorage.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r2 = "94d44fcf"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r11
            java.lang.Object r0 = r3.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001b:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            boolean r5 = r11.mSafeStoreTidSwitch     // Catch: Exception -> 0x002d
            if (r5 == 0) goto L_0x0032
            java.lang.String r5 = r11.getSecTid()     // Catch: Exception -> 0x002d
            goto L_0x0036
        L_0x002d:
            r2 = move-exception
            r5 = r4
            r7 = r5
        L_0x0030:
            r8 = r7
            goto L_0x0083
        L_0x0032:
            java.lang.String r5 = r11.getNonSecTid()     // Catch: Exception -> 0x002d
        L_0x0036:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: Exception -> 0x002d
            if (r6 != 0) goto L_0x0076
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: Exception -> 0x002d
            r6.<init>(r5)     // Catch: Exception -> 0x002d
            java.lang.String r5 = "tid"
            java.lang.String r5 = r6.optString(r5, r2)     // Catch: Exception -> 0x002d
            java.lang.String r7 = "client_key"
            java.lang.String r7 = r6.optString(r7, r2)     // Catch: Exception -> 0x0073
            java.lang.String r8 = "timestamp"
            long r9 = java.lang.System.currentTimeMillis()     // Catch: Exception -> 0x0070
            long r8 = r6.optLong(r8, r9)     // Catch: Exception -> 0x0070
            java.lang.Long r3 = java.lang.Long.valueOf(r8)     // Catch: Exception -> 0x0070
            java.lang.String r8 = "vimei"
            java.lang.String r8 = r6.optString(r8, r2)     // Catch: Exception -> 0x0070
            java.lang.String r9 = "vimsi"
            java.lang.String r4 = r6.optString(r9, r2)     // Catch: Exception -> 0x006e
        L_0x006b:
            r2 = r4
            r4 = r5
            goto L_0x0087
        L_0x006e:
            r2 = move-exception
            goto L_0x0083
        L_0x0070:
            r2 = move-exception
            r8 = r4
            goto L_0x0083
        L_0x0073:
            r2 = move-exception
            r7 = r4
            goto L_0x0030
        L_0x0076:
            java.lang.String r2 = "ex"
            java.lang.String r5 = "TidInfoNull"
            java.lang.String r6 = "getLocalPreferences null in isTidAvailable"
            logError(r2, r5, r6)     // Catch: Exception -> 0x002d
            r2 = r4
            r7 = r2
            r8 = r7
            goto L_0x0087
        L_0x0083:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r2)
            goto L_0x006b
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "tid="
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = ", clientKey="
            r5.append(r6)
            r5.append(r7)
            java.lang.String r6 = ", timestamp="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ", vimei="
            r5.append(r3)
            r5.append(r8)
            java.lang.String r3 = ", vimsi="
            r5.append(r3)
            r5.append(r2)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "TidStorage"
            java.lang.String r6 = "isTidAvailable"
            com.alipay.android.msp.utils.LogUtil.i(r5, r6, r3)
            boolean r2 = r11.isIllegal(r4, r7, r8, r2)
            if (r2 != 0) goto L_0x00c5
            return r1
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.tid.TidStorage.isTidAvailable():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void synchronizeSpTidInfo() {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.tid.TidStorage.synchronizeSpTidInfo():void");
    }

    private void save() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84643f84", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.mTid);
            jSONObject.put("client_key", this.mClientKey);
            jSONObject.put("timestamp", this.mTimestamp);
            jSONObject.put(KEY_VIMEI, this.mVimei);
            jSONObject.put(KEY_VIMSI, this.mVimsi);
            jSONObject.put("utdid", this.mUtdid);
            String jSONObject2 = jSONObject.toString();
            if (!this.mSwitchToSafeAndCleanNonSafeSwitch) {
                setNonSecTid(jSONObject2);
            } else {
                removeNonSecTid();
            }
            if (this.mSafeStoreTidSwitch) {
                LogUtil.record(2, "", DraftManager.ACTION_TYPE_SAVE, "isDegrade:" + this.mTid);
                setSecTid(PhoneCashierMspEngine.getMspWallet().safeEncryptLocal(jSONObject2));
                setSecTidExist(true);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }
}
