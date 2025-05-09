package tb;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class df4 {
    public static List<String> blackDialogActivity = new ArrayList();
    public static List<String> blackDialogFragment = new ArrayList();
    public String appName;
    public Application application;
    public String city;
    public boolean clickBackViewExitDialog;
    public int delayedStartTime;
    public String group;
    public fdh logImpl;
    public int logoResourceId;
    public lkj nativeLibUpdateListener;
    public boolean popDialogBeforeInstall;
    public boolean push;
    public zpt threadExecutorImpl;
    public String ttid;
    public boolean autoStart = true;
    public boolean foregroundRequest = true;
    public int delayedKillAppTime = 5000;
    public boolean forceInstallAfaterDownload = false;
    public boolean installBundleAfterDownload = false;
    public boolean enableNavProcessor = false;
    public boolean isOutApk = false;
    public boolean enabledSoLoader = true;
    public boolean enableDialogUiV2 = true;
    public Class uiToastClass = xvu.class;
    public Class uiNotifyClass = lvu.class;
    public Class uiSysNotifyClass = vvu.class;
    public Class uiConfirmClass = suu.class;
    public int bundleUpdateMinDisk = 200;

    static {
        t2o.a(947912706);
    }

    public df4(Application application) {
        this.application = application;
    }
}
