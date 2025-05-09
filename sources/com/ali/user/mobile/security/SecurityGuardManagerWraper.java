package com.ali.user.mobile.security;

import android.content.ContextWrapper;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.init.Debuggable;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.info.AlipayInfo;
import com.ali.user.mobile.info.AppInfo;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.model.FingerInfo;
import com.ali.user.mobile.model.FingerList;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.rpc.login.model.SessionModel;
import com.ali.user.mobile.rpc.login.model.WSecurityData;
import com.ali.user.mobile.rpc.login.model.WUAData;
import com.ali.user.mobile.service.FaceService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.service.StorageService;
import com.ali.user.mobile.utils.EnvUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.constants.LoginStatus;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.login4android.utils.FileUtils;
import com.taobao.login4android.utils.LoginSwitch;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class SecurityGuardManagerWraper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FINGER_LIST = "finger_list";
    private static final String HISTORY_LOGIN_ACCOUNTS = "aliusersdk_history_acounts";
    private static final String SESSION_LIST = "aliusersdk_session_lists";
    private static final String TAG = "login.SecurityManager";
    private static LoginHistory mLoginHistory;
    private static final boolean DEBUG = Debuggable.isDebug();
    private static SecurityGuardManager mSecurityGuardManager = null;
    private static boolean hadReadHistory = false;

    static {
        t2o.a(68157599);
    }

    public static void afterCancelAccount(String str) {
        List<SessionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1c5528", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                List<HistoryAccount> historyAccounts = getHistoryAccounts();
                if (historyAccounts != null && historyAccounts.size() > 0) {
                    HistoryAccount historyAccount = null;
                    int i = 0;
                    for (int i2 = 0; i2 < historyAccounts.size(); i2++) {
                        if (str.equals(mask(historyAccounts.get(i2).userId))) {
                            i++;
                            historyAccount = historyAccounts.get(i2);
                        }
                    }
                    if (i == 1 && historyAccount != null) {
                        removeHistoryAccount(historyAccount);
                    }
                }
                SessionList sessionListFromFile = getSessionListFromFile();
                if (!(sessionListFromFile == null || (list = sessionListFromFile.sessionModels) == null || list.size() <= 0)) {
                    String str2 = null;
                    int i3 = 0;
                    for (int i4 = 0; i4 < sessionListFromFile.sessionModels.size(); i4++) {
                        if (str.equals(mask(sessionListFromFile.sessionModels.get(i4).userId))) {
                            str2 = sessionListFromFile.sessionModels.get(i4).userId;
                            i3++;
                        }
                    }
                    if (i3 == 1 && str2 != null) {
                        removeSessionModelFromFile(str2);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static void backupHistoryAccounts(LoginHistory loginHistory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843e9df1", new Object[]{loginHistory});
            return;
        }
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup != null) {
            harmonyLoginBackup.backupHistoryAccountList(loginHistory, null);
        }
    }

    private static void backupSessionList(SessionList sessionList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee96bd92", new Object[]{sessionList});
            return;
        }
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup != null) {
            harmonyLoginBackup.backupSessionList(sessionList, null);
        }
    }

    public static WSecurityData buildRPSecurityData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WSecurityData) ipChange.ipc$dispatch("747e8c8b", new Object[0]);
        }
        WSecurityData wSecurityData = new WSecurityData();
        WUAData rpwua = getRPWUA();
        if (rpwua != null) {
            wSecurityData.wua = rpwua.wua;
            wSecurityData.t = rpwua.t;
        }
        wSecurityData.apdId = AlipayInfo.getInstance().getApdid();
        wSecurityData.umidToken = AppInfo.getInstance().getUmidToken();
        return wSecurityData;
    }

    public static WSecurityData buildWSecurityData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WSecurityData) ipChange.ipc$dispatch("1e6293c8", new Object[0]) : buildWSecurityData(getWUA());
    }

    public static synchronized void clearAutologinTokenFromFile(String str) {
        SessionList sessionList;
        List<SessionModel> list;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("77b03023", new Object[]{str});
            } else if (!TextUtils.isEmpty(str)) {
                String decrypt = decrypt(FileUtils.readFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST));
                if (TextUtils.isEmpty(decrypt)) {
                    sessionList = new SessionList();
                } else {
                    try {
                        sessionList = (SessionList) JSON.parseObject(decrypt, SessionList.class);
                    } catch (JSONException unused) {
                        emptySessionListFromFile();
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (!(sessionList == null || (list = sessionList.sessionModels) == null)) {
                    for (SessionModel sessionModel : list) {
                        if (TextUtils.equals(str, sessionModel.userId)) {
                            sessionModel.autoLoginToken = "";
                            sessionModel.sid = "";
                        }
                        arrayList.add(sessionModel);
                    }
                }
                sessionList.sessionModels = arrayList;
                FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionList)));
                backupSessionList(sessionList);
            }
        }
    }

    public static String decrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72c54002", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = getSecurityGuardManager().getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp != null) {
                if (str.length() <= 4 || str.charAt(3) != '&') {
                    return dynamicDataEncryptComp.dynamicDecrypt(str);
                }
                return dynamicDataEncryptComp.dynamicDecryptDDp(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static void deleteHistoryAccounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4232c76", new Object[0]);
            return;
        }
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup != null) {
            harmonyLoginBackup.deleteHistoryAccountList(null);
        }
    }

    public static synchronized void emptyAllSessionAutoLoginTokenFromFile() {
        SessionList sessionListFromFile;
        List<SessionModel> list;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("325f6f0e", new Object[0]);
                return;
            }
            try {
                sessionListFromFile = getSessionListFromFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!(sessionListFromFile == null || (list = sessionListFromFile.sessionModels) == null || list.size() == 0)) {
                for (SessionModel sessionModel : sessionListFromFile.sessionModels) {
                    sessionModel.autoLoginToken = "";
                }
                FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionListFromFile)));
                backupSessionList(sessionListFromFile);
            }
        }
    }

    public static void emptySessionListFromFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb51c34", new Object[0]);
            return;
        }
        FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, "");
        IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
        if (harmonyLoginBackup != null) {
            harmonyLoginBackup.deleteSessionList(null);
        }
    }

    public static String encode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52dc359", new Object[]{str});
        }
        try {
            IDynamicDataEncryptComponent dynamicDataEncryptComp = getSecurityGuardManager().getDynamicDataEncryptComp();
            if (dynamicDataEncryptComp != null) {
                String dynamicEncryptDDp = dynamicDataEncryptComp.dynamicEncryptDDp(str);
                if (TextUtils.isEmpty(dynamicEncryptDDp)) {
                    return str;
                }
                return dynamicEncryptDDp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    public static HistoryAccount findHistoryAccount(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("61c298f", new Object[]{new Long(j)});
        }
        try {
            List<HistoryAccount> historyAccounts = getHistoryAccounts();
            if (historyAccounts != null) {
                for (HistoryAccount historyAccount : historyAccounts) {
                    if (j == historyAccount.userId) {
                        return historyAccount;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static synchronized String getAutoLoginTokenFromList(SessionList sessionList, String str) {
        List<SessionModel> list;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1a3d89af", new Object[]{sessionList, str});
            }
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            if (!(sessionList == null || (list = sessionList.sessionModels) == null || list.size() == 0)) {
                for (SessionModel sessionModel : sessionList.sessionModels) {
                    if (sessionModel.userId.equals(str)) {
                        return sessionModel.autoLoginToken;
                    }
                }
                return "";
            }
            return "";
        }
    }

    public static String getDeviceTokenKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f59886dd", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                HistoryAccount findHistoryAccount = findHistoryAccount(Long.parseLong(str));
                if (findHistoryAccount != null) {
                    return findHistoryAccount.tokenKey;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static synchronized List<FingerInfo> getFingerList() {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("99dae423", new Object[0]);
            }
            List<FingerInfo> arrayList = new ArrayList<>();
            String string = getString(FINGER_LIST);
            if (TextUtils.isEmpty(string)) {
                UserTrackAdapter.sendUT("readFingerFromFile");
                string = FileUtils.readFileData(DataProviderFactory.getApplicationContext(), FINGER_LIST);
                if (!TextUtils.isEmpty(string)) {
                    UserTrackAdapter.sendUT("readFingerFromFileNotEmpty");
                }
            }
            if (!TextUtils.isEmpty(string)) {
                if (LoginSwitch.getSwitch("fingerLog", "true")) {
                    LoginTLogAdapter.e(TAG, "getFingerString:" + string);
                }
                arrayList = ((FingerList) JSON.parseObject(string, FingerList.class)).list;
            }
            return arrayList;
        }
    }

    public static List<HistoryAccount> getHistoryAccounts() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("17c249fc", new Object[0]);
        }
        try {
            LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
            if (loginHistoryFromLocal != null) {
                return loginHistoryFromLocal.accountHistory;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static HistoryAccount getLastHistoryAccount() {
        List<HistoryAccount> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("bf3b888e", new Object[0]);
        }
        LoginHistory loginHistory = getLoginHistory();
        if (loginHistory == null || (list = loginHistory.accountHistory) == null || list.size() <= 0) {
            return null;
        }
        int i = loginHistory.index;
        if (i < 0 || i >= loginHistory.accountHistory.size()) {
            i = loginHistory.accountHistory.size() - 1;
        }
        return loginHistory.accountHistory.get(i);
    }

    public static LoginHistory getLoginHistory() {
        List<HistoryAccount> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("9a16b920", new Object[0]);
        }
        try {
            LoginHistory loginHistory = mLoginHistory;
            if (loginHistory == null && !hadReadHistory) {
                loginHistory = getLoginHistoryFromLocal();
                if (!(loginHistory == null || (list = loginHistory.accountHistory) == null)) {
                    Collections.sort(list, new HistoryAccount());
                    loginHistory.index = 0;
                }
                mLoginHistory = loginHistory;
                hadReadHistory = true;
            }
            return loginHistory;
        } catch (Exception e) {
            SecurityUTHitUtils.utHit("80027", TLogTracker.SCENE_EXCEPTION + e, "Event_getLoginHistoryFailException");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static LoginHistory getLoginHistoryFromLocal() {
        LoginHistory loginHistory;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoginHistory) ipChange.ipc$dispatch("cec487e1", new Object[0]);
        }
        String string = getString(HISTORY_LOGIN_ACCOUNTS);
        try {
            if (TextUtils.isEmpty(string)) {
                loginHistory = new LoginHistory();
            } else {
                loginHistory = (LoginHistory) JSON.parseObject(string, LoginHistory.class);
            }
            return loginHistory;
        } catch (JSONException e) {
            LoginTLogAdapter.e(TAG, "removeHistoryAccount JSONException");
            e.printStackTrace();
            SecurityUTHitUtils.utHit("80005", "JSONException: " + string, "Event_removeHistoryAccountFail");
            LoginHistory loginHistory2 = new LoginHistory();
            removeString(HISTORY_LOGIN_ACCOUNTS);
            deleteHistoryAccounts();
            return loginHistory2;
        }
    }

    private static WUAData getRPWUA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("9574a898", new Object[0]);
        }
        if (ServiceFactory.getService(FaceService.class) == null) {
            return null;
        }
        return new WUAData(DataProviderFactory.getDataProvider().getAppkey(), String.valueOf(System.currentTimeMillis()), ((FaceService) ServiceFactory.getService(FaceService.class)).getDeviceInfo());
    }

    private static String getSecurityBodyOpen(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28b083bb", new Object[]{new Long(j), str});
        }
        try {
            return ((ISecurityBodyComponent) getSecurityGuardManager().getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(String.valueOf(j), str, "", null, 4, EnvUtil.getAlimmsdk_env());
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, e);
            return null;
        } catch (Throwable th) {
            LoginTLogAdapter.e(TAG, th);
            return null;
        }
    }

    public static synchronized SecurityGuardManager getSecurityGuardManager() {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SecurityGuardManager) ipChange.ipc$dispatch("e7fb8de8", new Object[0]);
            }
            if (mSecurityGuardManager == null) {
                try {
                    mSecurityGuardManager = SecurityGuardManager.getInstance(new ContextWrapper(DataProviderFactory.getApplicationContext()));
                } catch (SecException e) {
                    e.printStackTrace();
                }
            }
            return mSecurityGuardManager;
        }
    }

    public static void getSessionList(final DataCallback<SessionList> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ee72d8b", new Object[]{dataCallback});
        } else if (dataCallback != null) {
            CoordinatorWrapper.executeSafely(new AsyncTask<Object, Void, SessionList>() { // from class: com.ali.user.mobile.security.SecurityGuardManagerWraper.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/mobile/security/SecurityGuardManagerWraper$2");
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.AsyncTask
                public SessionList doInBackground(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (SessionList) ipChange2.ipc$dispatch("eddb0b47", new Object[]{this, objArr}) : SecurityGuardManagerWraper.getSessionListFromFile();
                }

                public void onPostExecute(SessionList sessionList) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e4cb11ee", new Object[]{this, sessionList});
                    } else {
                        DataCallback.this.result(sessionList);
                    }
                }
            }, new Object[0]);
        }
    }

    public static SessionList getSessionListFromFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionList) ipChange.ipc$dispatch("d7c5bc26", new Object[0]);
        }
        try {
            String decrypt = decrypt(FileUtils.readFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST));
            if (TextUtils.isEmpty(decrypt)) {
                return null;
            }
            return (SessionList) JSON.parseObject(decrypt, SessionList.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        return ((StorageService) ServiceFactory.getService(StorageService.class)).get(str);
    }

    public static HistoryAccount getTargetAccount(LoginHistory loginHistory, String str) {
        List<HistoryAccount> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HistoryAccount) ipChange.ipc$dispatch("d3d2db71", new Object[]{loginHistory, str});
        }
        if (!(TextUtils.isEmpty(str) || loginHistory == null || (list = loginHistory.accountHistory) == null || list.size() == 0)) {
            for (HistoryAccount historyAccount : loginHistory.accountHistory) {
                if (str.equals(String.valueOf(historyAccount.userId))) {
                    return historyAccount;
                }
            }
        }
        return null;
    }

    public static void getWSecurityData(final DataCallback<WSecurityData> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43857f9e", new Object[]{dataCallback});
        } else if (dataCallback != null) {
            getWUAData(new DataCallback<WUAData>() { // from class: com.ali.user.mobile.security.SecurityGuardManagerWraper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void result(WUAData wUAData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a3fea72e", new Object[]{this, wUAData});
                    } else {
                        DataCallback.this.result(SecurityGuardManagerWraper.buildWSecurityData(wUAData));
                    }
                }
            });
        }
    }

    public static WUAData getWUA() {
        com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent securityBodyComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WUAData) ipChange.ipc$dispatch("64bf2216", new Object[0]);
        }
        try {
            com.taobao.wireless.security.sdk.SecurityGuardManager instance = com.taobao.wireless.security.sdk.SecurityGuardManager.getInstance(new ContextWrapper(DataProviderFactory.getApplicationContext()));
            if (instance == null || (securityBodyComp = instance.getSecurityBodyComp()) == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String valueOf = String.valueOf(currentTimeMillis);
            String appkey = DataProviderFactory.getDataProvider().getAppkey();
            String securityBodyOpen = getSecurityBodyOpen(currentTimeMillis, appkey);
            if (TextUtils.isEmpty(securityBodyOpen)) {
                securityBodyOpen = securityBodyComp.getSecurityBodyData(valueOf, appkey);
            }
            return new WUAData(DataProviderFactory.getDataProvider().getAppkey(), valueOf, securityBodyOpen);
        } catch (Exception e) {
            LoginTLogAdapter.e(TAG, e);
            return null;
        }
    }

    public static void getWUAData(DataCallback<WUAData> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("193a5c32", new Object[]{dataCallback});
        } else if (dataCallback != null) {
            new WUATask(dataCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
    }

    public static String hiddenExceptPreAndPost(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad76ad38", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length <= i + i2) {
            return str;
        }
        return hiddenMiddle(str, 1 + i, (length - i) - i2);
    }

    public static String hiddenMiddle(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ef08fd10", new Object[]{str, new Integer(i), new Integer(i2)});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 1; i3 <= length; i3++) {
            if (i3 < i || i3 >= i + i2) {
                sb.append(str.charAt(i3 - 1));
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public static String mask(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("727f3d0f", new Object[]{new Long(j)}) : mask(String.valueOf(j));
    }

    public static synchronized void putLoginHistory(HistoryAccount historyAccount, String str) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e72d2cf", new Object[]{historyAccount, str});
            } else if (AlibabaSecurityTokenService.saveToken(historyAccount.tokenKey, str) || !LoginStatus.saveSalt) {
                saveHistoryOnly(historyAccount);
            }
        }
    }

    public static synchronized void putSessionModelToFile(SessionModel sessionModel) {
        SessionList sessionList;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b371af7e", new Object[]{sessionModel});
                return;
            }
            String decrypt = decrypt(FileUtils.readFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST));
            if (TextUtils.isEmpty(decrypt)) {
                sessionList = new SessionList();
            } else {
                try {
                    sessionList = (SessionList) JSON.parseObject(decrypt, SessionList.class);
                } catch (JSONException unused) {
                    sessionList = new SessionList();
                    emptySessionListFromFile();
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(sessionModel);
            if (sessionList != null) {
                List<SessionModel> list = sessionList.sessionModels;
                if (list != null) {
                    for (SessionModel sessionModel2 : list) {
                        if (!TextUtils.equals(sessionModel.userId, sessionModel2.userId)) {
                            arrayList.add(sessionModel2);
                        }
                    }
                }
            } else {
                sessionList = new SessionList();
            }
            int maxSessionSize = DataProviderFactory.getDataProvider().getMaxSessionSize();
            if (maxSessionSize > 20) {
                maxSessionSize = 20;
            }
            if (arrayList.size() - maxSessionSize > 0 && arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
            sessionList.sessionModels = arrayList;
            FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionList)));
            backupSessionList(sessionList);
        }
    }

    public static void putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
        } else {
            ((StorageService) ServiceFactory.getService(StorageService.class)).put(str, str2);
        }
    }

    public static void removeAllFinger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa94d9cd", new Object[0]);
            return;
        }
        UserTrackAdapter.sendUT("removeAllFinger");
        removeString(FINGER_LIST);
        FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), FINGER_LIST, "");
    }

    public static void removeAllHistoryAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ccb105d", new Object[0]);
            return;
        }
        try {
            removeString(HISTORY_LOGIN_ACCOUNTS);
            updateMemoryHistory(null);
            deleteHistoryAccounts();
        } catch (Throwable th) {
            th.printStackTrace();
            SecurityUTHitUtils.utHit("80005", "Throwable: " + th, "Event_removeHistoryAccountFail");
        }
    }

    public static void removeAutoLoginFromHistory(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f24865", new Object[]{str});
        } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            try {
                removeAutoLoginFromHistory(Long.parseLong(str));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void removeHistoryAccount(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7056c8", new Object[]{historyAccount});
        } else if (historyAccount != null) {
            UserTrackAdapter.sendUT("history_remove_user");
            try {
                AlibabaSecurityTokenService.removeSafeToken(historyAccount.tokenKey);
                LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
                if (!(loginHistoryFromLocal == null || loginHistoryFromLocal.accountHistory == null)) {
                    ArrayList arrayList = new ArrayList();
                    if (historyAccount.alipayHid == 0) {
                        for (HistoryAccount historyAccount2 : loginHistoryFromLocal.accountHistory) {
                            if (historyAccount2.userId != historyAccount.userId || historyAccount2.alipayHid != 0) {
                                arrayList.add(historyAccount2);
                            }
                        }
                        loginHistoryFromLocal.accountHistory = arrayList;
                    } else {
                        for (HistoryAccount historyAccount3 : loginHistoryFromLocal.accountHistory) {
                            if (historyAccount.alipayHid != historyAccount3.alipayHid) {
                                arrayList.add(historyAccount3);
                            }
                        }
                        loginHistoryFromLocal.accountHistory = arrayList;
                    }
                }
                if (loginHistoryFromLocal != null) {
                    List<HistoryAccount> list = loginHistoryFromLocal.accountHistory;
                    if (list != null && !list.isEmpty()) {
                        Collections.sort(loginHistoryFromLocal.accountHistory, new HistoryAccount());
                        loginHistoryFromLocal.index = 0;
                        putString(HISTORY_LOGIN_ACCOUNTS, JSON.toJSONString(loginHistoryFromLocal));
                        backupHistoryAccounts(loginHistoryFromLocal);
                    }
                    removeString(HISTORY_LOGIN_ACCOUNTS);
                    deleteHistoryAccounts();
                }
                updateMemoryHistory(loginHistoryFromLocal);
            } catch (Throwable th) {
                th.printStackTrace();
                SecurityUTHitUtils.utHit("80005", "Throwable: " + th, "Event_removeHistoryAccountFail");
            }
        }
    }

    public static synchronized void removeSessionAutoLoginTokenFromFile(String str) {
        SessionList sessionListFromFile;
        List<SessionModel> list;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fc03fe8", new Object[]{str});
            } else if (!TextUtils.isEmpty(str)) {
                try {
                    sessionListFromFile = getSessionListFromFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (!(sessionListFromFile == null || (list = sessionListFromFile.sessionModels) == null || list.size() == 0)) {
                    for (SessionModel sessionModel : sessionListFromFile.sessionModels) {
                        if (sessionModel.userId.equals(str)) {
                            sessionModel.autoLoginToken = "";
                        }
                    }
                    FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionListFromFile)));
                    backupSessionList(sessionListFromFile);
                }
            }
        }
    }

    public static synchronized void removeSessionModelFromFile(String str) {
        SessionList sessionListFromFile;
        List<SessionModel> list;
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca43d50e", new Object[]{str});
            } else if (!TextUtils.isEmpty(str)) {
                try {
                    sessionListFromFile = getSessionListFromFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (!(sessionListFromFile == null || (list = sessionListFromFile.sessionModels) == null || list.size() == 0)) {
                    ArrayList arrayList = new ArrayList();
                    for (SessionModel sessionModel : sessionListFromFile.sessionModels) {
                        if (!sessionModel.userId.equals(str)) {
                            arrayList.add(sessionModel);
                        }
                    }
                    sessionListFromFile.sessionModels = arrayList;
                    FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), SESSION_LIST, encode(JSON.toJSONString(sessionListFromFile)));
                    backupSessionList(sessionListFromFile);
                }
            }
        }
    }

    public static void removeString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986ba686", new Object[]{str});
        } else {
            ((StorageService) ServiceFactory.getService(StorageService.class)).remove(str);
        }
    }

    public static String staticSafeDecrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e62a6ffd", new Object[]{str});
        }
        try {
            return getSecurityGuardManager().getStaticDataEncryptComp().staticSafeDecrypt(16, DataProviderFactory.getDataProvider().getAppkey(), str, "");
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String staticSafeEncrypt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f48d425", new Object[]{str});
        }
        try {
            IStaticDataEncryptComponent staticDataEncryptComp = SecurityGuardManager.getInstance(new ContextWrapper(DataProviderFactory.getApplicationContext())).getStaticDataEncryptComp();
            if (staticDataEncryptComp != null) {
                return staticDataEncryptComp.staticSafeEncrypt(16, DataProviderFactory.getDataProvider().getAppkey(), str, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }

    private static void updateMemoryHistory(LoginHistory loginHistory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16cba303", new Object[]{loginHistory});
            return;
        }
        mLoginHistory = loginHistory;
        hadReadHistory = true;
    }

    public static String mask(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("74755c3", new Object[]{str}) : hiddenExceptPreAndPost(str, 3, 2);
    }

    public static WSecurityData buildWSecurityData(WUAData wUAData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WSecurityData) ipChange.ipc$dispatch("9e1db4a6", new Object[]{wUAData});
        }
        WSecurityData wSecurityData = new WSecurityData();
        if (wUAData != null) {
            wSecurityData.wua = wUAData.wua;
            wSecurityData.t = wUAData.t;
        }
        wSecurityData.apdId = AlipayInfo.getInstance().getApdid();
        wSecurityData.umidToken = AppInfo.getInstance().getUmidToken();
        wSecurityData.appStore = DataProviderFactory.getDataProvider().getTTID();
        wSecurityData.foreignLocation = DataProviderFactory.getDataProvider().isForigenLocation();
        wSecurityData.osName = "android";
        wSecurityData.osVersion = Build.VERSION.RELEASE;
        String str = Build.MODEL;
        wSecurityData.deviceModel = str;
        wSecurityData.deviceBrand = Build.MANUFACTURER;
        wSecurityData.deviceName = str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        DataProviderFactory.getApplicationContext().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        wSecurityData.screenSize = i + "x" + i2;
        return wSecurityData;
    }

    public static synchronized String getFingerValue(String str) {
        synchronized (SecurityGuardManagerWraper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ac6f579d", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                UserTrackAdapter.sendUT("getFingerEmptyId");
                return "";
            } else {
                List<FingerInfo> fingerList = getFingerList();
                if (!(fingerList == null || fingerList.size() == 0)) {
                    UserTrackAdapter.sendUT("startFindFor_" + fingerList.size());
                    for (int i = 0; i < fingerList.size(); i++) {
                        UserTrackAdapter.sendExtendUT("checkEncryptedUserId", str, fingerList.get(i).key, null);
                        if (TextUtils.equals(str, fingerList.get(i).key)) {
                            return fingerList.get(i).value;
                        }
                    }
                    return "";
                }
                UserTrackAdapter.sendUT("getFingerEmptyList");
                return "";
            }
        }
    }

    public static void removeFinger(FingerInfo fingerInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e7d3be", new Object[]{fingerInfo});
        } else if (fingerInfo != null && !TextUtils.isEmpty(fingerInfo.key)) {
            UserTrackAdapter.sendExtendUT("rmFinger", fingerInfo.key);
            List<FingerInfo> fingerList = getFingerList();
            if (fingerList != null && fingerList.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < fingerList.size(); i++) {
                    FingerInfo fingerInfo2 = fingerList.get(i);
                    if (!TextUtils.equals(fingerInfo.key, fingerInfo2.key)) {
                        arrayList.add(fingerInfo2);
                    }
                }
                FingerList fingerList2 = new FingerList();
                fingerList2.list = arrayList;
                try {
                    putString(FINGER_LIST, JSON.toJSONString(fingerList2));
                } catch (Throwable th) {
                    th.printStackTrace();
                    LoginTLogAdapter.e(TAG, th.getMessage());
                    UserTrackAdapter.sendExtendUT("SGPutFingerException", th.getMessage());
                }
                try {
                    FileUtils.writeFileData(DataProviderFactory.getApplicationContext(), FINGER_LIST, JSON.toJSONString(fingerList2));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    UserTrackAdapter.sendExtendUT("SaveFingerFileException", th2.getMessage());
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:16|(11:24|(4:27|(2:31|55)|32|25)|52|33|35|(1:37)|50|38|41|45|46)|34|35|(0)|50|38|41|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e0, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e1, code lost:
        r9.printStackTrace();
        com.taobao.login4android.log.LoginTLogAdapter.e(com.ali.user.mobile.security.SecurityGuardManagerWraper.TAG, r9.getMessage());
        com.ali.user.mobile.log.UserTrackAdapter.sendExtendUT("SGPutException", r9.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0005, B:6:0x000b, B:11:0x001e, B:13:0x0026, B:16:0x0030, B:18:0x003e, B:21:0x0046, B:24:0x004d, B:25:0x005b, B:27:0x0061, B:29:0x0071, B:31:0x0079, B:32:0x0080, B:33:0x0082, B:34:0x0093, B:35:0x00aa, B:37:0x00c1, B:40:0x00e1, B:41:0x00f7, B:42:0x0102), top: B:49:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void saveFinger(com.ali.user.mobile.model.FingerInfo r8, java.util.ArrayList<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.user.mobile.security.SecurityGuardManagerWraper.saveFinger(com.ali.user.mobile.model.FingerInfo, java.util.ArrayList):void");
    }

    public static void saveHistoryOnly(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8814bdce", new Object[]{historyAccount});
            return;
        }
        if (DEBUG) {
            new StringBuilder("saveHistoryOnly HistoryAccount: ").append(historyAccount);
        }
        UserTrackAdapter.sendUT("history_update_user");
        if (getSecurityGuardManager().getDynamicDataStoreComp() == null) {
            SecurityUTHitUtils.utHit("80016", "dynamicDataStoreComp = null", "Event_putLoginHistoryFail");
            return;
        }
        LoginHistory loginHistoryFromLocal = getLoginHistoryFromLocal();
        if (loginHistoryFromLocal != null) {
            if (loginHistoryFromLocal.accountHistory != null) {
                ArrayList arrayList = new ArrayList();
                if (historyAccount.alipayHid != 0) {
                    for (HistoryAccount historyAccount2 : loginHistoryFromLocal.accountHistory) {
                        if (historyAccount2.alipayHid == historyAccount.alipayHid) {
                            historyAccount2.update(historyAccount);
                            historyAccount = historyAccount2;
                        } else {
                            arrayList.add(historyAccount2);
                        }
                    }
                    arrayList.add(historyAccount);
                } else {
                    for (HistoryAccount historyAccount3 : loginHistoryFromLocal.accountHistory) {
                        if (historyAccount3.userId == historyAccount.userId && historyAccount3.alipayHid == 0) {
                            historyAccount3.update(historyAccount);
                            historyAccount = historyAccount3;
                        } else {
                            arrayList.add(historyAccount3);
                        }
                    }
                    arrayList.add(historyAccount);
                }
                int size = arrayList.size() - DataProviderFactory.getDataProvider().getMaxHistoryAccount();
                Collections.sort(arrayList, new HistoryAccount());
                if (size > 0) {
                    AlibabaSecurityTokenService.removeSafeToken(((HistoryAccount) arrayList.remove(arrayList.size() - 1)).tokenKey);
                }
                loginHistoryFromLocal.accountHistory = arrayList;
                loginHistoryFromLocal.index = arrayList.indexOf(historyAccount);
                putString(HISTORY_LOGIN_ACCOUNTS, JSON.toJSONString(loginHistoryFromLocal));
                backupHistoryAccounts(loginHistoryFromLocal);
            } else if (DataProviderFactory.getDataProvider().getMaxHistoryAccount() > 0) {
                ArrayList arrayList2 = new ArrayList();
                loginHistoryFromLocal.accountHistory = arrayList2;
                arrayList2.add(historyAccount);
                loginHistoryFromLocal.index = 0;
                putString(HISTORY_LOGIN_ACCOUNTS, JSON.toJSONString(loginHistoryFromLocal));
                backupHistoryAccounts(loginHistoryFromLocal);
            }
        }
        updateMemoryHistory(loginHistoryFromLocal);
        LoginTLogAdapter.e(TAG, "putLoginHistory Success");
    }

    public static void removeAutoLoginFromHistory(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607e42c9", new Object[]{new Long(j)});
            return;
        }
        HistoryAccount findHistoryAccount = findHistoryAccount(j);
        if (findHistoryAccount != null) {
            findHistoryAccount.autologinToken = "";
            putLoginHistory(findHistoryAccount, null);
        }
    }
}
