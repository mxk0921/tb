package com.ali.user.mobile.harmony;

import android.content.Context;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.rpc.LoginHistory;
import com.ali.user.mobile.rpc.login.model.SessionList;
import com.ali.user.mobile.utils.CommonUtil;
import com.alibaba.alibity.container.file.FileAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.utils.BackgroundExecutor;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HarmonyLoginBackupImpl implements IHarmonyLoginBackup {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FILE_NAME_HISTORY_ACCOUNTS = "login/login_h";
    public static final String FILE_NAME_SESSION_LIST = "login/login_s";
    public static final String FILE_NAME_UMID_TOKEN = "login/login_u";
    public static final String TAG = "HarmonyLoginBackup";
    private Context mContext;

    static {
        t2o.a(68157488);
        t2o.a(68157496);
    }

    public HarmonyLoginBackupImpl(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static /* synthetic */ Context access$000(HarmonyLoginBackupImpl harmonyLoginBackupImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5b92c288", new Object[]{harmonyLoginBackupImpl});
        }
        return harmonyLoginBackupImpl.mContext;
    }

    public static /* synthetic */ boolean access$100(HarmonyLoginBackupImpl harmonyLoginBackupImpl, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fb8ee2f", new Object[]{harmonyLoginBackupImpl, context, str, str2})).booleanValue();
        }
        return harmonyLoginBackupImpl.writeFileSync(context, str, str2);
    }

    public static /* synthetic */ boolean access$200(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a733fd", new Object[]{context, str})).booleanValue();
        }
        return deleteFileSync(context, str);
    }

    public static synchronized void deleteAllFileSync(final Context context) {
        synchronized (HarmonyLoginBackupImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("479eeff4", new Object[]{context});
            } else {
                BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        boolean access$200 = HarmonyLoginBackupImpl.access$200(context, HarmonyLoginBackupImpl.FILE_NAME_UMID_TOKEN);
                        boolean access$2002 = HarmonyLoginBackupImpl.access$200(context, HarmonyLoginBackupImpl.FILE_NAME_SESSION_LIST);
                        AdapterForTLog.loge(HarmonyLoginBackupImpl.TAG, "deleteAllFileSync uResult:" + access$200 + " sResult:" + access$2002);
                        UserTrackAdapter.sendUT(HarmonyLoginBackupImpl.TAG, "deleteAllFileSync", access$200 + "_" + access$2002, "deleteAll", null);
                    }
                });
            }
        }
    }

    private static synchronized boolean deleteFileSync(Context context, String str) {
        Throwable th;
        boolean z = true;
        boolean z2 = false;
        synchronized (HarmonyLoginBackupImpl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc750f6d", new Object[]{context, str})).booleanValue();
            }
            try {
                File file = new File(context.getFilesDir(), str);
                AdapterForTLog.loge(TAG, "deleteFile start filename:" + str + " exist:" + file.exists() + " path:" + file.getAbsolutePath());
                if (file.exists()) {
                    z = file.delete();
                    try {
                        AdapterForTLog.loge(TAG, "deleteFile delete:" + z + " path:" + file.getAbsolutePath());
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z;
                        AdapterForTLog.loge(TAG, "deleteFile fail", th);
                        z = z2;
                        AdapterForTLog.loge(TAG, "deleteFile end filename:" + str + " result:" + z);
                        UserTrackAdapter.sendUT(TAG, str, String.valueOf(z), "delete", null);
                        return z;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            AdapterForTLog.loge(TAG, "deleteFile end filename:" + str + " result:" + z);
            UserTrackAdapter.sendUT(TAG, str, String.valueOf(z), "delete", null);
            return z;
        }
    }

    private static String staticSafeEncrypt(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6318da1f", new Object[]{context, str});
        }
        try {
            String staticSafeEncrypt = SecurityGuardManager.getInstance(context).getStaticDataEncryptComp().staticSafeEncrypt(18, "LOGIN_MIGRATE", str, "");
            AdapterForTLog.loge(TAG, "staticSafeEncrypt originData:" + str + " encryptData:" + staticSafeEncrypt);
            return staticSafeEncrypt;
        } catch (Exception e) {
            AdapterForTLog.loge(TAG, "staticSafeEncrypt fail", e);
            return "";
        }
    }

    @Override // com.ali.user.mobile.harmony.i.IHarmonyLoginBackup
    public void backupHistoryAccountList(final LoginHistory loginHistory, final IHarmonyLoginBackup.IBackup iBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f095d31", new Object[]{this, loginHistory, iBackup});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HarmonyLoginBackupImpl harmonyLoginBackupImpl = HarmonyLoginBackupImpl.this;
                    boolean access$100 = HarmonyLoginBackupImpl.access$100(harmonyLoginBackupImpl, HarmonyLoginBackupImpl.access$000(harmonyLoginBackupImpl), HarmonyLoginBackupImpl.FILE_NAME_HISTORY_ACCOUNTS, JSON.toJSONString(loginHistory));
                    IHarmonyLoginBackup.IBackup iBackup2 = iBackup;
                    if (iBackup2 != null) {
                        iBackup2.backup(access$100);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.harmony.i.IHarmonyLoginBackup
    public void backupSessionList(final SessionList sessionList, final IHarmonyLoginBackup.IBackup iBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70ee0a71", new Object[]{this, sessionList, iBackup});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HarmonyLoginBackupImpl harmonyLoginBackupImpl = HarmonyLoginBackupImpl.this;
                    boolean access$100 = HarmonyLoginBackupImpl.access$100(harmonyLoginBackupImpl, HarmonyLoginBackupImpl.access$000(harmonyLoginBackupImpl), HarmonyLoginBackupImpl.FILE_NAME_SESSION_LIST, JSON.toJSONString(sessionList));
                    IHarmonyLoginBackup.IBackup iBackup2 = iBackup;
                    if (iBackup2 != null) {
                        iBackup2.backup(access$100);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.harmony.i.IHarmonyLoginBackup
    public void backupUmidToken(final String str, final IHarmonyLoginBackup.IBackup iBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f98862e", new Object[]{this, str, iBackup});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    HarmonyLoginBackupImpl harmonyLoginBackupImpl = HarmonyLoginBackupImpl.this;
                    boolean access$100 = HarmonyLoginBackupImpl.access$100(harmonyLoginBackupImpl, HarmonyLoginBackupImpl.access$000(harmonyLoginBackupImpl), HarmonyLoginBackupImpl.FILE_NAME_UMID_TOKEN, str);
                    IHarmonyLoginBackup.IBackup iBackup2 = iBackup;
                    if (iBackup2 != null) {
                        iBackup2.backup(access$100);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.harmony.i.IHarmonyLoginBackup
    public void deleteHistoryAccountList(final IHarmonyLoginBackup.IBackup iBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b2aa9da", new Object[]{this, iBackup});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean access$200 = HarmonyLoginBackupImpl.access$200(HarmonyLoginBackupImpl.access$000(HarmonyLoginBackupImpl.this), HarmonyLoginBackupImpl.FILE_NAME_HISTORY_ACCOUNTS);
                    IHarmonyLoginBackup.IBackup iBackup2 = iBackup;
                    if (iBackup2 != null) {
                        iBackup2.backup(access$200);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.harmony.i.IHarmonyLoginBackup
    public void deleteSessionList(final IHarmonyLoginBackup.IBackup iBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c232f93", new Object[]{this, iBackup});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean access$200 = HarmonyLoginBackupImpl.access$200(HarmonyLoginBackupImpl.access$000(HarmonyLoginBackupImpl.this), HarmonyLoginBackupImpl.FILE_NAME_SESSION_LIST);
                    IHarmonyLoginBackup.IBackup iBackup2 = iBackup;
                    if (iBackup2 != null) {
                        iBackup2.backup(access$200);
                    }
                }
            });
        }
    }

    @Override // com.ali.user.mobile.harmony.i.IHarmonyLoginBackup
    public void deleteUmidToken(final IHarmonyLoginBackup.IBackup iBackup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55a6861", new Object[]{this, iBackup});
        } else {
            BackgroundExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.harmony.HarmonyLoginBackupImpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean access$200 = HarmonyLoginBackupImpl.access$200(HarmonyLoginBackupImpl.access$000(HarmonyLoginBackupImpl.this), HarmonyLoginBackupImpl.FILE_NAME_UMID_TOKEN);
                    IHarmonyLoginBackup.IBackup iBackup2 = iBackup;
                    if (iBackup2 != null) {
                        iBackup2.backup(access$200);
                    }
                }
            });
        }
    }

    private synchronized boolean writeFileSync(Context context, String str, String str2) {
        boolean z;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55e99943", new Object[]{this, context, str, str2})).booleanValue();
        }
        boolean isInABTestRegion = CommonUtil.isInABTestRegion(TAG, 10000);
        AdapterForTLog.loge(TAG, "writeFileSync start filename:" + str + " harmonyLoginBackup:" + isInABTestRegion);
        if (!isInABTestRegion) {
            return false;
        }
        Properties properties = new Properties();
        long currentTimeMillis = System.currentTimeMillis();
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(context.getFilesDir(), str);
            AdapterForTLog.loge(TAG, "writeFileSync start filename:" + str + " exist:" + file.exists() + " path:" + file.getAbsolutePath());
            properties.setProperty(FileAbility.API_EXISTS, String.valueOf(file.exists()));
            properties.setProperty("absPath", file.getAbsolutePath());
            if (file.exists()) {
                boolean delete = file.delete();
                AdapterForTLog.loge(TAG, "writeFileSync delete:" + delete + " path:" + file.getAbsolutePath());
            } else {
                File parentFile = file.getParentFile();
                boolean mkdirs = parentFile.mkdirs();
                AdapterForTLog.loge(TAG, "writeFileSync parent mkdirs:" + mkdirs + " parent path:" + parentFile.getAbsolutePath());
            }
            String staticSafeEncrypt = staticSafeEncrypt(context, str2);
            int i = -1;
            int length = str2 == null ? -1 : str2.length();
            if (staticSafeEncrypt != null) {
                i = staticSafeEncrypt.length();
            }
            AdapterForTLog.loge(TAG, "writeFileSync filename：" + str + " dataLen" + length + " encryptDataLen:" + i);
            properties.setProperty("dataLen", String.valueOf(length));
            properties.setProperty("encryptDataLen", String.valueOf(i));
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                fileOutputStream2.write(staticSafeEncrypt.getBytes(StandardCharsets.UTF_8));
                fileOutputStream2.close();
                z = true;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                AdapterForTLog.loge(TAG, "writeFileSync fail", th);
                properties.setProperty("wfail", th.getMessage());
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                z = false;
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                AdapterForTLog.loge(TAG, "writeFileSync end filename:" + str + " result:" + z + " cost:" + currentTimeMillis2);
                properties.setProperty("cost", String.valueOf(currentTimeMillis2));
                UserTrackAdapter.sendUT(TAG, str, String.valueOf(z), "write", properties);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
        AdapterForTLog.loge(TAG, "writeFileSync end filename:" + str + " result:" + z + " cost:" + currentTimeMillis22);
        properties.setProperty("cost", String.valueOf(currentTimeMillis22));
        UserTrackAdapter.sendUT(TAG, str, String.valueOf(z), "write", properties);
        return z;
    }
}
