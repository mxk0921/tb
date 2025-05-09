package tb;

import android.os.Bundle;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.VersionInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kjj implements ljj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CrashApi f22704a;
    public final UncaughtCrashHeader b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements UncaughtCrashHeader {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final CrashApi f22705a;

        public b(CrashApi crashApi) {
            this.f22705a = crashApi;
        }

        @Override // com.taobao.android.tcrash.UncaughtCrashHeader
        public void addHeaderInfo(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
                return;
            }
            try {
                this.f22705a.addHeaderInfo(str, str2);
            } catch (Throwable th) {
                ehh.d(th);
            }
        }
    }

    public kjj(x0s x0sVar, boolean z) {
        UncaughtCrashHeader uncaughtCrashHeader;
        CrashApi a2 = new c().a(x0sVar, z);
        this.f22704a = a2;
        if (a2 != null) {
            uncaughtCrashHeader = new b(a2);
        } else {
            uncaughtCrashHeader = new mc8();
        }
        this.b = uncaughtCrashHeader;
    }

    @Override // tb.ljj
    public void a(Callable<String> callable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6263cd94", new Object[]{this, callable});
            return;
        }
        CrashApi crashApi = this.f22704a;
        if (crashApi != null) {
            crashApi.registerInfoCallback("UCCore3_5_2_1", 1048576, callable);
        }
    }

    @Override // tb.ljj
    public void b(ValueCallback<Bundle> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407a6415", new Object[]{this, valueCallback});
            return;
        }
        CrashApi crashApi = this.f22704a;
        if (crashApi != null) {
            crashApi.registerCallback(1, valueCallback);
            this.f22704a.registerCallback(4, valueCallback);
        }
    }

    @Override // tb.ljj
    public void disable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5097f36f", new Object[]{this});
            return;
        }
        CrashApi crashApi = this.f22704a;
        if (crashApi != null) {
            crashApi.disableLog(1);
        }
    }

    @Override // tb.ljj
    public void enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
        }
    }

    @Override // tb.ljj
    public UncaughtCrashHeader getUncaughtCrashHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this});
        }
        return this.b;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public boolean c(x0s x0sVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2e3f858f", new Object[]{this, x0sVar})).booleanValue();
            }
            HashSet hashSet = new HashSet();
            hashSet.add(LauncherRuntime.PROCESS_UC_SUFFIX);
            hashSet.add(":gpu_process");
            if (o1r.a(x0sVar.g()).b("ignoreNativeCrash", false)) {
                String h = x0sVar.h();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (h.contains((String) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public CrashApi a(x0s x0sVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CrashApi) ipChange.ipc$dispatch("fec7e451", new Object[]{this, x0sVar, new Boolean(z)});
            }
            try {
                System.loadLibrary("crashsdk");
                CrashApi createInstanceEx = CrashApi.createInstanceEx(x0sVar.g(), "native", false, b(x0sVar, z));
                createInstanceEx.setForeground(true);
                String f = x0sVar.f();
                VersionInfo versionInfo = new VersionInfo();
                versionInfo.mVersion = f;
                versionInfo.mBuildId = f;
                createInstanceEx.updateVersionInfo(versionInfo);
                return createInstanceEx;
            } catch (Throwable th) {
                ehh.f(th);
                return null;
            }
        }

        public Bundle b(x0s x0sVar, boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("dce9bb4b", new Object[]{this, x0sVar, new Boolean(z)});
            }
            Bundle bundle = new Bundle();
            String f = x0sVar.f();
            t5v t5vVar = new t5v(x0sVar.g(), x0sVar.h());
            String str2 = "app_tombstone/" + x0sVar.h() + "/crashsdk";
            bundle.putBoolean("mBackupLogs", false);
            bundle.putString("mLogsBackupPathName", t5vVar.a().getAbsolutePath());
            bundle.putString("mTagFilesFolderName", str2 + "/tags");
            bundle.putString("mCrashLogsFolderName", str2 + "/logs");
            if (z) {
                bundle.putInt("mAnrTraceStrategy", 2);
            } else {
                bundle.putInt("mAnrTraceStrategy", 1);
            }
            bundle.putInt("mMaxAnrLogcatLineCount", 200);
            bundle.putBoolean("mEncryptLog", false);
            bundle.putString("mJavaCrashLogFileName", "java_" + System.currentTimeMillis() + "_java.log");
            long currentTimeMillis = System.currentTimeMillis();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
            StringBuilder sb = new StringBuilder("CrashSDK_3.3.0.0_df_df_df_");
            sb.append(x0sVar.d("APP_KEY", "0"));
            sb.append("_");
            sb.append(f);
            sb.append("_");
            sb.append(currentTimeMillis);
            sb.append("_");
            sb.append(simpleDateFormat.format(new Date(currentTimeMillis)));
            sb.append("_");
            if (c(x0sVar)) {
                str = "_ignore_jni.log";
            } else {
                str = "_jni.log";
            }
            sb.append(str);
            bundle.putString("mNativeCrashLogFileName", sb.toString());
            bundle.putBoolean("enableJavaLog", false);
            bundle.putBoolean("enableUnexpLog", true);
            bundle.putBoolean("mCallJavaDefaultHandler", false);
            bundle.putBoolean("mCallNativeDefaultHandler", true);
            bundle.putBoolean("mZipLog", false);
            bundle.putBoolean("mEnableStatReport", false);
            bundle.putBoolean("useApplicationContext", false);
            bundle.putBoolean("mSyncUploadSetupCrashLogs", false);
            bundle.putBoolean("mSyncUploadLogs", false);
            bundle.putLong("mDisableSignals", 16386L);
            bundle.putLong("mDisableBackgroundSignals", 16384L);
            bundle.putInt("uploadLogDelaySeconds", -1);
            bundle.putInt("mUnexpInfoUpdateInterval", 900);
            bundle.putString("mBuildId", f);
            bundle.putBoolean("mMonitorBattery", false);
            return bundle;
        }
    }
}
