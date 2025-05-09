package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tconhook.InlinePatch;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.tao.log.TLog;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import java.io.File;
import java.io.IOException;
import tb.ttl;
import tb.yjv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yq2 extends vjv implements yjv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32277a;
    public String b;
    public int c = -1;
    public boolean d = false;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$msg;

        public a(String str) {
            this.val$msg = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Toast.makeText(kjv.sContext, this.val$msg, 1).show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements OnFileCreatedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ File val$crashIdentifyFile;

        public b(File file) {
            this.val$crashIdentifyFile = file;
        }

        @Override // com.taobao.android.tcrash.OnFileCreatedListener
        public void onFileCreated(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b8cac13e", new Object[]{this, str});
                return;
            }
            try {
                this.val$crashIdentifyFile.createNewFile();
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final yq2 f32278a = new yq2();

        static {
            t2o.a(948961285);
        }

        public static /* synthetic */ yq2 access$000() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yq2) ipChange.ipc$dispatch("32df7eec", new Object[0]);
            }
            return f32278a;
        }
    }

    static {
        t2o.a(948961282);
        t2o.a(950009883);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5f58cd", new Object[]{str, str2});
            return;
        }
        try {
            PreferenceManager.getDefaultSharedPreferences(kjv.sContext).edit().putString("inlinepatch_effective_version", str).putString("inlinepatch_effective_type", str2).apply();
        } catch (Exception unused) {
            TLog.loge("tconhook", "Failed to update local patch version");
        }
    }

    public static yq2 instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yq2) ipChange.ipc$dispatch("88c88011", new Object[0]);
        }
        return c.access$000();
    }

    public static /* synthetic */ Object ipc$super(yq2 yq2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/cppinlinepatch/CPPInlinePatch");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new a(str));
        }
    }

    public boolean checkAndInstallNativeCrashCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("768213b4", new Object[]{this})).booleanValue();
        }
        if (!this.d) {
            this.d = true;
            File file = new File(this.b + "/inlinepatch_nativecrash_0.sig");
            if (file.exists()) {
                file.delete();
                this.e = true;
            } else {
                this.e = false;
            }
            TCrashSDK.instance().addOnFileCreatedListener(UncaughtCrashType.NATIVE_ONLY, new b(file));
        }
        return this.e;
    }

    @Override // tb.vjv
    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!this.mInit) {
            int currentRuntimeCpuArchValue = lw4.getCurrentRuntimeCpuArchValue(context);
            if (currentRuntimeCpuArchValue == 8) {
                this.f32277a = kgd.ABI_ARM64;
            } else if (currentRuntimeCpuArchValue == 7) {
                this.f32277a = kgd.ABI_ARM;
            }
            this.b = context.getFilesDir().getAbsolutePath() + "/tconcrasper";
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String versionName = nkv.getVersionName();
            if (!versionName.equals(defaultSharedPreferences.getString("inlinepatch_mainversion", ""))) {
                defaultSharedPreferences.edit().putString("inlinepatch_mainversion", versionName).putString("inlinepatch_effective_version", "").putString("inlinepatch_effective_type", "").apply();
                try {
                    File file = new File(this.b);
                    if (file.exists()) {
                        fs2.deleteDir(file);
                    }
                } catch (Exception unused) {
                }
            }
            File file2 = new File(this.b);
            if (!file2.exists()) {
                this.mInit = file2.mkdir();
            } else {
                this.mInit = true;
            }
        }
    }

    @Override // tb.yjv
    public void patchProcessListener(yjv.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d04f53", new Object[]{this, aVar});
        }
    }

    @Override // tb.yjv
    public void onUpdate(boolean z, JSONObject jSONObject, String str) {
        File[] listFiles;
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba63f5", new Object[]{this, new Boolean(z), jSONObject, str});
        } else if (jSONObject != null && this.mInit && this.f32277a != null) {
            try {
                String string = jSONObject.getString("baseVersion");
                int intValue = jSONObject.getIntValue("patchVersion");
                String string2 = jSONObject.getString("patchUrl");
                boolean booleanValue = jSONObject.getBooleanValue("rollback");
                String string3 = jSONObject.getString("md5");
                boolean containsKey = jSONObject.containsKey("beta");
                if ((!TextUtils.isEmpty(string2) || booleanValue) && string != null && string.equals(nkv.getVersionName())) {
                    if (str.equals(gjv.SCAN)) {
                        a("C++ inlinepatch updating ......");
                    }
                    synchronized (this) {
                        if (!checkAndInstallNativeCrashCallback()) {
                            int i2 = this.c;
                            if (i2 != intValue) {
                                if (!booleanValue) {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long j = intValue;
                                    zq2.onPatchStageSuccess("revupdate", 0L, 0, "", j, containsKey);
                                    ttl.b prepareInstall = new ttl(string2, string3, this.b, this.f32277a).prepareInstall();
                                    if (prepareInstall == null || !prepareInstall.mIsSuccess || (listFiles = prepareInstall.mPatchFilesDir.listFiles()) == null) {
                                        TLog.loge("tconhook", "failed to download and unzip patch: " + string2);
                                        zq2.onPatchStageFailure("download", System.currentTimeMillis() - currentTimeMillis, 1, "down_and_unzip_error", j, containsKey);
                                    } else {
                                        zq2.onPatchStageSuccess("download", System.currentTimeMillis() - currentTimeMillis, 1, "download_success", j, containsKey);
                                        int length = listFiles.length;
                                        while (i < length) {
                                            File file = listFiles[i];
                                            int install = InlinePatch.install(file.getAbsolutePath());
                                            long currentTimeMillis2 = System.currentTimeMillis();
                                            String name = file.getName();
                                            if (install != 0) {
                                                TLog.loge("tconhook", name + " patch failed");
                                                zq2.onPatchStageFailure("install", currentTimeMillis2 - currentTimeMillis, install, name + "_install_error_code:" + install, j, containsKey);
                                                j = j;
                                            } else {
                                                TLog.loge("tconhook", name + " patch success");
                                                zq2.onPatchStageSuccess("install", currentTimeMillis2 - currentTimeMillis, install, name + "_install_error_code:" + install, j, containsKey);
                                                j = j;
                                                zq2.onPatchSuccess(j, containsKey);
                                            }
                                            if (gjv.SCAN.equals(str)) {
                                                a("C++ inlinepatch updating result: " + install);
                                            }
                                            i++;
                                        }
                                        this.c = intValue;
                                        String valueOf = String.valueOf(intValue);
                                        if (containsKey) {
                                            str2 = InstantPatchChangeInfo.TYPE_BETA;
                                        } else {
                                            str2 = InstantPatchChangeInfo.TYPE_RELEASE;
                                        }
                                        b(valueOf, str2);
                                    }
                                } else if (i2 != -1) {
                                    ttl.b prepareUnInstall = new ttl(string2, string3, this.b, this.f32277a).prepareUnInstall();
                                    if (prepareUnInstall != null && prepareUnInstall.mIsSuccess) {
                                        File[] listFiles2 = prepareUnInstall.mPatchFilesDir.listFiles();
                                        if (listFiles2 == null) {
                                            TLog.loge("tconhook", "failed to read patch files: " + string2);
                                            zq2.onPatchStageFailure("install", 0L, 3, "failed_to_read_patch_files", (long) intValue, containsKey);
                                            return;
                                        }
                                        int length2 = listFiles2.length;
                                        while (i < length2) {
                                            InlinePatch.uninstall(listFiles2[i].getAbsolutePath());
                                            i++;
                                        }
                                    }
                                    this.c = -1;
                                    b("", "");
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                TLog.loge("tconhook", th.getMessage());
            }
        }
    }
}
