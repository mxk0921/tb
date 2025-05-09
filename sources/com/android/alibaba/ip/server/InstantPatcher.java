package com.android.alibaba.ip.server;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.common.IPatchVerifier;
import com.android.alibaba.ip.common.PatchClassHolder;
import com.android.alibaba.ip.common.PatchInfo;
import com.android.alibaba.ip.common.PatchResult;
import com.android.alibaba.ip.runtime.ApplicationPatch;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.runtime.PatchesLoader;
import com.android.alibaba.ip.utils.PreferencesUtils;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InstantPatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLASSES_DEX = "classes.dex";
    public static final int HAS_PATCHED = 1;
    private static final String INSTANT_BASE_VERSION = "instant_base_Version";
    private static final String INSTANT_DISABLED_CLAZZES = "instant_disabled_clazzes";
    private static final String INSTANT_PATCH_HAS_RESOUECE = "instant_patch_has_resource";
    private static final String INSTANT_PATCH_HAS_SYSTERM_CALL = "instant_patch_has_system_call";
    private static final String INSTANT_PATCH_PRIORITY = "instant_patch_priority";
    private static final String INSTANT_PATCH_VERSION = "instant_patch_version";
    public static final int NO_DEX_AND_RES = 4;
    public static final int PATCH_FAILED = 3;
    private static final String PATCH_INFO_FILE_NAME = "instant_patch";
    public static final int PATCH_MODIFIED = 2;
    public static final int PATCH_NOT_MATCH = 5;
    public static final int PATCH_RES_FAILED = 6;
    public static final int PATCH_SUCCESS = 0;
    public static final String RES_PATCH = "resources.ap_";
    public static final String SYS_CALL_CLASSES_DEX = "classes2.dex";
    private static final String TAG = "InstantPatcher";
    private final Context context;
    private String packageName;
    private PatchesLoader.PatchLoaderListener patchLoaderListener;
    private IPatchVerifier patchVerifier;
    public static volatile boolean handled = false;
    private static InstantPatcher sInstantPatcher = null;
    public static volatile boolean hasResources = false;
    public static volatile boolean hasSystemCall = false;
    private PatchInfo savePatchInfo = null;
    private boolean isMainProcess = true;
    private Map<String, List<String>> mDisabledClazzes = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class FileState {
        public boolean external;
        public File file;

        static {
            t2o.a(493879328);
        }
    }

    static {
        t2o.a(493879326);
    }

    private InstantPatcher(String str, Context context) {
        this.context = context;
        this.packageName = str;
        FileManager.context = context;
    }

    public static /* synthetic */ PatchesLoader.PatchLoaderListener access$000(InstantPatcher instantPatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchesLoader.PatchLoaderListener) ipChange.ipc$dispatch("721f7c02", new Object[]{instantPatcher});
        }
        return instantPatcher.patchLoaderListener;
    }

    public static /* synthetic */ List access$100(InstantPatcher instantPatcher, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("337a6a52", new Object[]{instantPatcher, new Integer(i)});
        }
        return instantPatcher.getDisabledClazz(i);
    }

    private boolean authenticate(String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0f563aa", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (this.context.getPackageManager().getPackageInfo(this.packageName, 0).versionName.equals(str)) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    private void clearPatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d447102", new Object[]{this});
            return;
        }
        try {
            File dataFolder = FileManager.getDataFolder();
            File externalDataFolder = FileManager.getExternalDataFolder();
            File file = new File(optPathFor(this.context.getCacheDir()));
            File file2 = new File(optPathFor(this.context.getExternalCacheDir()));
            if (externalDataFolder != null) {
                FileManager.purgeTempDexFiles(externalDataFolder);
            }
            FileManager.purgeTempDexFiles(dataFolder);
            FileManager.purgeOptFiles(file);
            FileManager.purgeOptFiles(file2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void clearPatchInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59017d50", new Object[]{this});
            return;
        }
        this.savePatchInfo = null;
        PreferencesUtils.clear(this.context, PATCH_INFO_FILE_NAME).apply();
    }

    public static InstantPatcher create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstantPatcher) ipChange.ipc$dispatch("f4aa1a87", new Object[]{context});
        }
        if (sInstantPatcher == null) {
            sInstantPatcher = new InstantPatcher(context.getPackageName(), context);
        }
        return sInstantPatcher;
    }

    private List<String> getDisabledClazz(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9dd399f1", new Object[]{this, new Integer(i)});
        }
        if (this.mDisabledClazzes.containsKey(String.valueOf(i)) || handled) {
            return this.mDisabledClazzes.get(String.valueOf(i));
        }
        String string = PreferencesUtils.getString(this.context, PATCH_INFO_FILE_NAME, INSTANT_DISABLED_CLAZZES);
        if (TextUtils.isEmpty(string)) {
            return new ArrayList();
        }
        Map<String, List<String>> map = (Map) JSON.parseObject(string, Map.class);
        this.mDisabledClazzes = map;
        return map.get(String.valueOf(i));
    }

    private void handlePatch(FileState fileState, PatchResult patchResult, final int i, boolean z) {
        String str;
        PatchInfo patchInfo;
        try {
            String path = FileManager.getNativeLibraryFolder().getPath();
            if (!fileState.external) {
                str = optPathFor(this.context.getCacheDir());
            } else {
                str = optPathFor(this.context.getExternalCacheDir());
            }
            DexClassLoader dexClassLoader = new DexClassLoader(fileState.file.getPath(), str, path, getClass().getClassLoader());
            if (!hasResources || !handled) {
                try {
                    Class<?> cls = Class.forName("com.android.alibaba.ip.runtime.AppPatchesLoaderImpl", true, dexClassLoader);
                    Log.e("InstantPatcher", "Got the patcher class " + cls);
                    PatchesLoader patchesLoader = (PatchesLoader) cls.newInstance();
                    Log.e("InstantPatcher", "Got the patcher instance " + patchesLoader);
                    patchesLoader.addClassLoadListener(new PatchesLoader.ClassLoaderListener() { // from class: com.android.alibaba.ip.server.InstantPatcher.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.android.alibaba.ip.runtime.PatchesLoader.ClassLoaderListener
                        public void onLoadResult(String str2, boolean z2, Throwable th) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                ipChange.ipc$dispatch("60f8de54", new Object[]{this, str2, new Boolean(z2), th});
                                return;
                            }
                            if (InstantPatcher.access$000(InstantPatcher.this) != null) {
                                InstantPatcher.access$000(InstantPatcher.this).onLoadResult(str2, z2, th);
                            }
                            if (!z2) {
                                th.printStackTrace();
                            }
                        }

                        @Override // com.android.alibaba.ip.runtime.PatchesLoader.ClassLoaderListener
                        public boolean onPrePareLoad(String str2) {
                            IpChange ipChange = $ipChange;
                            if (ipChange instanceof IpChange) {
                                return ((Boolean) ipChange.ipc$dispatch("f7f40363", new Object[]{this, str2})).booleanValue();
                            }
                            if (InstantPatcher.access$000(InstantPatcher.this) != null) {
                                InstantPatcher.access$000(InstantPatcher.this).onPrePareLoad(str2);
                            }
                            List access$100 = InstantPatcher.access$100(InstantPatcher.this, i);
                            if (access$100 == null || !access$100.contains(str2)) {
                                return true;
                            }
                            return false;
                        }
                    });
                    Log.e("InstantPatcher", "Got the list of classes ");
                    Iterator it = ((List) cls.getDeclaredMethod("getPatchedClasses", new Class[0]).invoke(patchesLoader, new Object[0])).iterator();
                    while (it.hasNext()) {
                        Log.e("InstantPatcher", "class " + ((PatchClassHolder) it.next()).className);
                    }
                    if (!patchesLoader.load()) {
                        PatchesLoader.PatchLoaderListener patchLoaderListener = this.patchLoaderListener;
                        if (patchLoaderListener != null) {
                            patchLoaderListener.onLoadAllFinish(false);
                        }
                        patchResult.resCode = 3;
                        patchResult.msg = "exception to apply changes load";
                        return;
                    }
                    PatchesLoader.PatchLoaderListener patchLoaderListener2 = this.patchLoaderListener;
                    if (patchLoaderListener2 != null) {
                        patchLoaderListener2.onLoadAllFinish(true);
                    }
                } catch (Exception e) {
                    if ((e instanceof ClassNotFoundException) && !TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("com.android.alibaba.ip.runtime.AppPatchesLoaderImpl")) {
                        Log.e("InstantPatcher", "add system class from ApkLoader");
                        if (!z || (patchInfo = this.savePatchInfo) == null || i > patchInfo.getPatchVersion()) {
                            Log.e("InstantPatcher", "Couldn't apply code changes", e);
                            e.printStackTrace();
                            patchResult.resCode = 3;
                            patchResult.msg = "exception to apply changes " + e.getMessage();
                            patchResult.t = e;
                            return;
                        }
                        Log.e("InstantPatcher", "rollback version < effective version");
                    }
                }
            } else {
                Log.e("InstantPatcher", "patch class need restart because has resouce patch ");
            }
        } catch (Throwable th) {
            Log.e("InstantPatcher", "Couldn't apply code changes", th);
            patchResult.resCode = 3;
            patchResult.msg = "dexopt failed or loadclass Failed";
            patchResult.t = th;
        }
    }

    private void handleResourcePatch(ApplicationPatch applicationPatch, String str, PatchResult patchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e3c357d", new Object[]{this, applicationPatch, str, patchResult});
            return;
        }
        try {
            FileManager.startUpdate();
            FileManager.writeAaptResources(str, applicationPatch.getBytes());
            FileManager.finishUpdate(true);
            MonkeyPatcher.mergeResFile(new File(this.context.getApplicationInfo().sourceDir), FileManager.getExternalResourceFile().getAbsolutePath());
        } catch (Throwable th) {
            patchResult.resCode = 6;
            patchResult.msg = th.getMessage();
            patchResult.t = th;
        }
    }

    private static boolean hasResources(List<ApplicationPatch> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("688fb8a7", new Object[]{list})).booleanValue();
        }
        for (ApplicationPatch applicationPatch : list) {
            if (isResourcePath(applicationPatch.getPath())) {
                return true;
            }
        }
        return false;
    }

    private boolean isNormalPatch(ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62fb45d1", new Object[]{this, applicationPatch})).booleanValue();
        }
        if (applicationPatch.mChange == 0) {
            return true;
        }
        return false;
    }

    private boolean isSysCallPatch(ApplicationPatch applicationPatch) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48fcc961", new Object[]{this, applicationPatch})).booleanValue();
        }
        if (applicationPatch.mChange == 1) {
            z = true;
        }
        if (z) {
            hasSystemCall = true;
        }
        return z;
    }

    private String optPathFor(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ffa590d1", new Object[]{this, file});
        }
        File file2 = new File(file, "instant-opt");
        file2.mkdirs();
        return file2.getPath();
    }

    private FileState readSystemFileState(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileState) ipChange.ipc$dispatch("87625b8a", new Object[]{this, patchInfo});
        }
        return FileManager.getTempDexFile(1, patchInfo.patchVersion, false);
    }

    private void savePatchInfo(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4341ea8", new Object[]{this, patchInfo});
            return;
        }
        this.savePatchInfo = patchInfo;
        PreferencesUtils.putString(this.context, PATCH_INFO_FILE_NAME, INSTANT_BASE_VERSION, patchInfo.baseVersion).putInt(INSTANT_PATCH_VERSION, patchInfo.patchVersion).putInt(INSTANT_PATCH_PRIORITY, patchInfo.priority).putBoolean(INSTANT_PATCH_HAS_SYSTERM_CALL, hasSystemCall).putBoolean(INSTANT_PATCH_HAS_RESOUECE, hasResources).commit();
    }

    public IPatchVerifier getPatchVerifier() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPatchVerifier) ipChange.ipc$dispatch("a838efa4", new Object[]{this});
        }
        return this.patchVerifier;
    }

    public PatchResult handlePatches(String str, PatchInfo patchInfo) throws IOException {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchResult) ipChange.ipc$dispatch("4d3e7e52", new Object[]{this, str, patchInfo});
        }
        PatchResult patchResult = new PatchResult();
        if (hasPatched(patchInfo)) {
            patchResult.resCode = 1;
            return patchResult;
        }
        ZipFile zipFile = null;
        try {
            try {
                handled = true;
            } catch (Exception e2) {
                e = e2;
            }
            if (TextUtils.isEmpty(str) || !new File(str).exists()) {
                handled = false;
                return patchResult;
            } else if (this.patchVerifier == null || isApkInDebug() || this.patchVerifier.authenticate(new File(str))) {
                ZipFile zipFile2 = new ZipFile(str);
                try {
                    ZipEntry entry = zipFile2.getEntry(CLASSES_DEX);
                    ZipEntry entry2 = zipFile2.getEntry(RES_PATCH);
                    if (entry == null && entry2 == null) {
                        patchResult.resCode = 4;
                        handled = false;
                        zipFile2.close();
                        return patchResult;
                    } else if (!authenticate(patchInfo.baseVersion)) {
                        patchResult.resCode = 5;
                        handled = false;
                        zipFile2.close();
                        return patchResult;
                    } else {
                        List<ApplicationPatch> makePatch = ApplicationPatch.makePatch(str, patchInfo.patchVersion);
                        hasResources = hasResources(makePatch);
                        handlePatches(makePatch, patchResult);
                        if (patchResult.resCode == 0) {
                            savePatchInfo(patchInfo);
                            Log.e("InstantPatcher", "patch success");
                        }
                        handled = false;
                        zipFile2.close();
                        return patchResult;
                    }
                } catch (Exception e3) {
                    e = e3;
                    zipFile = zipFile2;
                    e.printStackTrace();
                    handled = false;
                    if (zipFile != null) {
                        zipFile.close();
                    }
                    return patchResult;
                } catch (Throwable th) {
                    th = th;
                    zipFile = zipFile2;
                    handled = false;
                    if (zipFile != null) {
                        zipFile.close();
                    }
                    throw th;
                }
            } else {
                patchResult.resCode = 2;
                handled = false;
                return patchResult;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean hasPatched(PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55867858", new Object[]{this, patchInfo})).booleanValue();
        }
        return patchInfo.equals(getPatchInfo());
    }

    public boolean isApkInDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49c51c7", new Object[]{this})).booleanValue();
        }
        try {
            if ((this.context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isMainProcess(Context context) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{this, context})).booleanValue();
        }
        if (context != null) {
            try {
                int myPid = Process.myPid();
                Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (context.getPackageName().equals(next.processName)) {
                        if (next.pid == myPid) {
                            this.isMainProcess = true;
                            z = true;
                            break;
                        }
                        z = true;
                    }
                }
                if (!this.isMainProcess && !z) {
                    this.isMainProcess = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this.isMainProcess;
    }

    public void purge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc867b2", new Object[]{this});
            return;
        }
        clearPatchInfo();
        clearPatch();
        FileManager.purgeResourceFiles();
    }

    public void setDisabledClazzes(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a6daa", new Object[]{this, str, list});
            return;
        }
        this.mDisabledClazzes.put(str, list);
        if (list.size() > 0 && !TextUtils.isEmpty(str)) {
            PreferencesUtils.putString(this.context, PATCH_INFO_FILE_NAME, INSTANT_DISABLED_CLAZZES, JSON.toJSONString(this.mDisabledClazzes)).apply();
        }
    }

    public void setPatchLoaderListener(PatchesLoader.PatchLoaderListener patchLoaderListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62fcb4d", new Object[]{this, patchLoaderListener});
        } else {
            this.patchLoaderListener = patchLoaderListener;
        }
    }

    public void setiPatchVerifier(IPatchVerifier iPatchVerifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01b8cfb", new Object[]{this, iPatchVerifier});
        } else {
            this.patchVerifier = iPatchVerifier;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyPatch$0(FileState fileState, PatchResult patchResult, PatchInfo patchInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0a40b1e", new Object[]{this, fileState, patchResult, patchInfo});
            return;
        }
        File file = fileState.file;
        if (file != null && file.exists()) {
            handlePatch(fileState, patchResult, patchInfo.patchVersion, false);
            if (patchResult.resCode != 0) {
                Log.e("InstantPatcher", "patch failed :" + fileState.file.getPath());
            }
        }
        if (patchResult.resCode == 0) {
            if (hasSystemCall) {
                Log.e("InstantPatcher", "readSystemFile");
                FileState readSystemFileState = readSystemFileState(patchInfo);
                File file2 = readSystemFileState.file;
                if (file2 != null && file2.exists()) {
                    Log.e("InstantPatcher", "handleSystemPatch");
                    handlePatch(readSystemFileState, patchResult, patchInfo.patchVersion, false);
                }
            }
            Log.e("InstantPatcher", "patch success");
            return;
        }
        purge();
    }

    public PatchInfo getPatchInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchInfo) ipChange.ipc$dispatch("7b4e3bdf", new Object[]{this});
        }
        if (this.savePatchInfo == null) {
            PatchInfo patchInfo = new PatchInfo();
            this.savePatchInfo = patchInfo;
            patchInfo.baseVersion = PreferencesUtils.getString(this.context, PATCH_INFO_FILE_NAME, INSTANT_BASE_VERSION, "");
            this.savePatchInfo.patchVersion = PreferencesUtils.getInt(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_VERSION, 0);
            this.savePatchInfo.priority = PreferencesUtils.getInt(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_PRIORITY, 0);
            hasResources = PreferencesUtils.getBoolean(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_HAS_RESOUECE, false);
            hasSystemCall = PreferencesUtils.getBoolean(this.context, PATCH_INFO_FILE_NAME, INSTANT_PATCH_HAS_SYSTERM_CALL, false);
        }
        return this.savePatchInfo;
    }

    private void handleHotSwapPatch(PatchResult patchResult, ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("113059c9", new Object[]{this, patchResult, applicationPatch});
            return;
        }
        try {
            FileState writeTempDexFile = FileManager.writeTempDexFile(applicationPatch.getChange(), applicationPatch.getPath(), applicationPatch.getPatchVersion());
            if (writeTempDexFile.file == null) {
                patchResult.resCode = 3;
                patchResult.msg = "mkdir failed";
                Log.e("InstantPatcher", "mkdir failed");
                return;
            }
            handlePatch(writeTempDexFile, patchResult, applicationPatch.patchVersion, true);
        } catch (Exception e) {
            e.printStackTrace();
            patchResult.resCode = 3;
            patchResult.msg = "write dex failed";
            patchResult.t = e;
        }
    }

    private void handleSystemClassPatch(PatchResult patchResult, ApplicationPatch applicationPatch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f436be60", new Object[]{this, patchResult, applicationPatch});
            return;
        }
        try {
            FileState writeSystemTempDexFile = FileManager.writeSystemTempDexFile(applicationPatch.getChange(), applicationPatch.getBytes(), applicationPatch.getPatchVersion());
            File file = writeSystemTempDexFile.file;
            if (file != null && file.exists() && isValid(writeSystemTempDexFile.file)) {
                handlePatch(writeSystemTempDexFile, patchResult, applicationPatch.patchVersion, true);
                return;
            }
            patchResult.resCode = 3;
            patchResult.msg = "mkdir failed";
            Log.e("InstantPatcher", "mkdir failed");
        } catch (Exception e) {
            e.printStackTrace();
            patchResult.resCode = 3;
            patchResult.msg = "write dex failed";
            patchResult.t = e;
        }
    }

    private static boolean isResourcePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a26ece72", new Object[]{str})).booleanValue();
        }
        return str.equals(RES_PATCH) || str.startsWith("res/");
    }

    private boolean isValid(File file) {
        Throwable th;
        Exception e;
        ZipFile zipFile;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97573a34", new Object[]{this, file})).booleanValue();
        }
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (zipFile.getEntry(CLASSES_DEX) == null) {
                z = false;
            }
            try {
                zipFile.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return z;
        } catch (Exception e4) {
            e = e4;
            zipFile2 = zipFile;
            e.printStackTrace();
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            zipFile2 = zipFile;
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:25:0x006f, B:27:0x0079, B:32:0x0082, B:34:0x0086, B:35:0x0090, B:37:0x0099, B:39:0x009f), top: B:44:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void applyPatch() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.android.alibaba.ip.server.InstantPatcher.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = "ec0cd901"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0013:
            com.android.alibaba.ip.common.PatchInfo r2 = r7.getPatchInfo()
            java.lang.String r3 = r2.baseVersion
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r4 = "InstantPatcher"
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = "no patch"
            android.util.Log.e(r4, r0)
            return
        L_0x0028:
            com.android.alibaba.ip.common.PatchResult r3 = new com.android.alibaba.ip.common.PatchResult
            r3.<init>()
            java.lang.String r5 = com.taobao.tao.TaobaoApplication.getAppVersion()     // Catch: Exception -> 0x0047
            java.lang.String r6 = r2.baseVersion     // Catch: Exception -> 0x0047
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch: Exception -> 0x0047
            if (r5 != 0) goto L_0x004a
            java.lang.String r0 = "patch miss match"
            android.util.Log.e(r4, r0)     // Catch: Exception -> 0x0047
            boolean r0 = r7.isMainProcess     // Catch: Exception -> 0x0047
            if (r0 == 0) goto L_0x0049
            r7.purge()     // Catch: Exception -> 0x0047
            return
        L_0x0047:
            r0 = move-exception
            goto L_0x00a7
        L_0x0049:
            return
        L_0x004a:
            boolean r5 = com.android.alibaba.ip.server.InstantPatcher.hasResources
            if (r5 == 0) goto L_0x006f
            java.lang.String r5 = "start patch res......"
            android.util.Log.e(r4, r5)
            android.content.Context r5 = r7.context     // Catch: Exception -> 0x0062
            java.io.File r6 = com.android.alibaba.ip.server.FileManager.getExternalResourceFile()     // Catch: Exception -> 0x0062
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: Exception -> 0x0062
            com.android.alibaba.ip.server.MonkeyPatcher.monkeyPatchExistingResources(r5, r6)     // Catch: Exception -> 0x0062
            goto L_0x006f
        L_0x0062:
            r5 = move-exception
            r6 = 6
            r3.resCode = r6
            java.lang.String r6 = r5.getMessage()
            r3.msg = r6
            r5.printStackTrace()
        L_0x006f:
            int r5 = r2.patchVersion     // Catch: Exception -> 0x0080
            com.android.alibaba.ip.server.InstantPatcher$FileState r0 = com.android.alibaba.ip.server.FileManager.getTempDexFile(r0, r5, r0)     // Catch: Exception -> 0x0080
            java.io.File r5 = r0.file     // Catch: Exception -> 0x0080
            if (r5 == 0) goto L_0x0082
            boolean r5 = r5.exists()     // Catch: Exception -> 0x0080
            if (r5 != 0) goto L_0x0090
            goto L_0x0082
        L_0x0080:
            r0 = move-exception
            goto L_0x00a3
        L_0x0082:
            boolean r5 = com.android.alibaba.ip.server.InstantPatcher.hasResources     // Catch: Exception -> 0x0080
            if (r5 != 0) goto L_0x0090
            r7.purge()     // Catch: Exception -> 0x0080
            java.lang.String r0 = "no patchFile"
            android.util.Log.e(r4, r0)     // Catch: Exception -> 0x0080
            goto L_0x00a6
        L_0x0090:
            tb.ycf r4 = new tb.ycf     // Catch: Exception -> 0x0080
            r4.<init>()     // Catch: Exception -> 0x0080
            int r0 = r2.priority     // Catch: Exception -> 0x0080
            if (r0 != 0) goto L_0x009d
            com.android.alibaba.ip.utils.ThreadUtils.asyncExecute(r4)     // Catch: Exception -> 0x0080
            goto L_0x00a6
        L_0x009d:
            if (r0 != r1) goto L_0x00a6
            com.android.alibaba.ip.utils.ThreadUtils.syncExecute(r4)     // Catch: Exception -> 0x0080
            goto L_0x00a6
        L_0x00a3:
            r0.printStackTrace()
        L_0x00a6:
            return
        L_0x00a7:
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.alibaba.ip.server.InstantPatcher.applyPatch():void");
    }

    private void handlePatches(List<ApplicationPatch> list, PatchResult patchResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a212593", new Object[]{this, list, patchResult});
            return;
        }
        for (ApplicationPatch applicationPatch : list) {
            if (isResourcePath(applicationPatch.path)) {
                handleResourcePatch(applicationPatch, applicationPatch.getPath(), patchResult);
                if (patchResult.resCode != 0) {
                    FileManager.purgeResourceFiles();
                    return;
                }
            } else if (isNormalPatch(applicationPatch)) {
                handleHotSwapPatch(patchResult, applicationPatch);
                if (patchResult.resCode != 0) {
                    purge();
                    return;
                }
            } else if (isSysCallPatch(applicationPatch)) {
                handleSystemClassPatch(patchResult, applicationPatch);
                patchResult.resCode = 0;
            }
        }
    }
}
