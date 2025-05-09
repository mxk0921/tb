package com.ali.user.mobile.info;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.callback.DataCallback;
import com.ali.user.mobile.common.api.AliUserLogin;
import com.ali.user.mobile.harmony.i.IHarmonyLoginBackup;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.security.SecurityGuardManagerWraper;
import com.ali.user.mobile.utils.CommonUtil;
import com.ali.user.mobile.utils.NetworkUtil;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.init.loginbar.LoginBarController;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.ut.device.UTDevice;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INITED_ACTION = "com.ali.user.sdk.biz.inited.action";
    public static final String INIT_TAG = "init.login-tag";
    private static AppInfo INSTANCE = null;
    private static final String TAG = "login.AppInfo";
    private boolean isRoot = false;
    private String mAppVersion;
    private String mUmidToken;
    private String mUtdid;

    static {
        t2o.a(68157520);
    }

    private AppInfo() {
    }

    public static /* synthetic */ String access$000(AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5ceaed0", new Object[]{appInfo});
        }
        return appInfo.mUmidToken;
    }

    public static /* synthetic */ String access$002(AppInfo appInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d6d884", new Object[]{appInfo, str});
        }
        appInfo.mUmidToken = str;
        return str;
    }

    public static /* synthetic */ void access$100(AppInfo appInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00d0ad1", new Object[]{appInfo});
        } else {
            appInfo.clearInOrange();
        }
    }

    private void clearInOrange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbe561a7", new Object[]{this});
        } else {
            NetworkUtil.doInOrange(new DataCallback<String>() { // from class: com.ali.user.mobile.info.AppInfo.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void result(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dec15eee", new Object[]{this, str});
                    } else if (CommonUtil.isInABTestRegion("clearCacheGetUmid", -1)) {
                        LoginTLogAdapter.e(LoginBarController.TAG, "clearCacheData");
                        AliUserLogin.clearCacheData("getAppLaunch_first");
                    } else {
                        LoginTLogAdapter.e(LoginBarController.TAG, "not_clearCacheData");
                    }
                }
            });
        }
    }

    public static synchronized AppInfo getInstance() {
        synchronized (AppInfo.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppInfo) ipChange.ipc$dispatch("7fb73dd", new Object[0]);
            }
            if (INSTANCE == null) {
                INSTANCE = new AppInfo();
            }
            return INSTANCE;
        }
    }

    public String getAndroidAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28488a69", new Object[]{this});
        }
        return "android_" + getAppVersion();
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        if (this.mAppVersion == null) {
            try {
                PackageInfo packageInfo = DataProviderFactory.getApplicationContext().getPackageManager().getPackageInfo(DataProviderFactory.getApplicationContext().getPackageName(), 0);
                if (packageInfo != null) {
                    this.mAppVersion = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return this.mAppVersion;
    }

    public String getSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a69c45", new Object[]{this});
        }
        String str = "7.7.1.3";
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("-");
            if (split != null && split.length > 0) {
                str = split[0];
                if (!TextUtils.isEmpty(str)) {
                    String[] split2 = str.split("_");
                    if (split2 != null && split2.length > 0) {
                        str = split2[0];
                    }
                }
            }
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = "5.3.15";
        }
        return "android_" + str;
    }

    public String getUmidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4aa3a9", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mUmidToken)) {
            generateUmidToken(null, 3000);
        }
        return this.mUmidToken;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        if (!TextUtils.isEmpty(DataProviderFactory.getDataProvider().getUtdid())) {
            return DataProviderFactory.getDataProvider().getUtdid();
        }
        if (this.mUtdid == null) {
            this.mUtdid = UTDevice.getUtdid(DataProviderFactory.getApplicationContext());
        }
        String str = this.mUtdid;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void init(DataCallback<String> dataCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60a6159", new Object[]{this, dataCallback});
            return;
        }
        LoginTLogAdapter.trace("init.login-tag", "AppInfo init: start");
        try {
            if (TextUtils.isEmpty(this.mUtdid)) {
                this.mUtdid = UTDevice.getUtdid(DataProviderFactory.getApplicationContext());
            }
            this.isRoot = NetworkUtil.isSuEnable();
            Properties properties = new Properties();
            properties.setProperty("isRoot", String.valueOf(this.isRoot));
            UserTrackAdapter.sendUT("isRoot", properties);
            generateUmidToken(dataCallback, 5000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        LoginTLogAdapter.trace("init.login-tag", "AppInfo init: end");
    }

    public boolean isRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6b36bb7", new Object[]{this})).booleanValue();
        }
        return this.isRoot;
    }

    public void getUmidToken(DataCallback<String> dataCallback, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea62550a", new Object[]{this, dataCallback, new Integer(i)});
        } else if (TextUtils.isEmpty(this.mUmidToken)) {
            generateUmidToken(dataCallback, i);
            UserTrackAdapter.sendUT("Event_InitApdidToken");
        } else {
            dataCallback.result(this.mUmidToken);
        }
    }

    private void generateUmidToken(final DataCallback<String> dataCallback, int i) {
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00c5bcb", new Object[]{this, dataCallback, new Integer(i)});
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ali.user.mobile.info.AppInfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                DataCallback dataCallback2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                UserTrackAdapter.sendUT("generateUmidTokenTimeout");
                if (atomicBoolean.compareAndSet(false, true) && (dataCallback2 = dataCallback) != null) {
                    dataCallback2.result(AppInfo.access$000(AppInfo.this));
                }
            }
        }, i);
        int envType = DataProviderFactory.getDataProvider().getEnvType();
        if (!(envType == 0 || envType == 1 || (envType != 2 && envType != 3 && envType == 4))) {
            i2 = 0;
        }
        LoginTLogAdapter.e(TAG, "before call getSecurityGuardManager");
        final long currentTimeMillis = System.currentTimeMillis();
        UserTrackAdapter.sendUT("umid_commit");
        SecurityGuardManager securityGuardManager = SecurityGuardManagerWraper.getSecurityGuardManager();
        if (securityGuardManager != null) {
            LoginTLogAdapter.e(TAG, "before call getUMIDComp");
            IUMIDComponent uMIDComp = securityGuardManager.getUMIDComp();
            if (uMIDComp != null) {
                try {
                    LoginTLogAdapter.e(TAG, "before call finalUmidComponent");
                    uMIDComp.initUMID(i2, new IUMIDInitListenerEx() { // from class: com.ali.user.mobile.info.AppInfo.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
                        public void onUMIDInitFinishedEx(String str, int i3) {
                            DataCallback dataCallback2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("1c2fc40b", new Object[]{this, str, new Integer(i3)});
                                return;
                            }
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            Properties properties = new Properties();
                            properties.put("umid_delta", String.valueOf(currentTimeMillis2));
                            if (i3 == 200) {
                                UserTrackAdapter.sendUT("umid_success", properties);
                                AppInfo.access$002(AppInfo.this, str);
                                AppInfo.access$100(AppInfo.this);
                                IHarmonyLoginBackup harmonyLoginBackup = DataProviderFactory.getDataProvider().getHarmonyLoginBackup();
                                if (harmonyLoginBackup != null) {
                                    harmonyLoginBackup.backupUmidToken(AppInfo.access$000(AppInfo.this), null);
                                }
                            } else {
                                UserTrackAdapter.sendExtendUT("initUMID_failure", i3 + "", properties);
                            }
                            LoginTLogAdapter.e(AppInfo.TAG, "resultCode=" + i3 + " onInitFinished umidToken = " + str);
                            if (atomicBoolean.compareAndSet(false, true) && (dataCallback2 = dataCallback) != null) {
                                dataCallback2.result(AppInfo.access$000(AppInfo.this));
                            }
                        }
                    });
                } catch (SecException e) {
                    UserTrackAdapter.sendExtendUT("initUMID_failure", e.getErrorCode() + "");
                    if (dataCallback != null) {
                        dataCallback.result(this.mUmidToken);
                    }
                }
            } else if (dataCallback != null) {
                dataCallback.result(this.mUmidToken);
            }
        } else if (dataCallback != null) {
            dataCallback.result(this.mUmidToken);
        }
    }
}
