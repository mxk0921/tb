package com.uc.webview.export.extension;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.klog.KLogHandler;
import com.uc.webview.base.task.d;
import com.uc.webview.internal.setup.a;
import com.uc.webview.internal.setup.b;
import com.uc.webview.internal.setup.component.t;
import com.uc.webview.internal.setup.e;
import com.uc.webview.internal.setup.h;
import com.uc.webview.internal.setup.k;
import com.uc.webview.internal.setup.l;
import com.uc.webview.internal.setup.n;
import com.uc.webview.internal.setup.o;
import com.uc.webview.internal.setup.p;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class U4Engine {
    @Deprecated
    public static final int CORE_READY_READY_REASON_DOWNLOAD_FALLCK = 3;
    @Deprecated
    public static final int CORE_READY_READY_REASON_INIT_FAILED = 2;
    @Deprecated
    public static final int CORE_READY_READY_REASON_INIT_SUCCESS = 1;
    public static final int CORE_TYPE_READY_REASON_DOWNLOAD_FALLCK = 3;
    @Deprecated
    public static final int CORE_TYPE_READY_REASON_INIT_FAILED = 2;
    public static final int CORE_TYPE_READY_REASON_INIT_SUCCESS = 1;
    private static final String TAG = "U4Engine";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface IDownloadHandle {
        void cancel();

        void restart();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Initializer {
        Initializer setAuthKey(String str);

        Initializer setAuthKey(String[] strArr);

        Initializer setClient(InitializerClient initializerClient);

        Initializer setCompressedFile(File file);

        Initializer setContext(Context context);

        Initializer setDecompressedDir(File file);

        Initializer setDownloader(IUrlDownloader iUrlDownloader);

        Initializer setSpecifiedDir(File file);

        Initializer setUrl(String str);

        void start() throws UCKnownException;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface UpgradingObserver {
        void onFailed(int i, Object obj);

        void onProgress(int i);

        void onStart();

        void onSuccess(ICoreVersion iCoreVersion);
    }

    public static void addInitProcessCallback(final ValueCallback<Integer> valueCallback) {
        h hVar = o.b().f14486a;
        if (valueCallback != null) {
            hVar.f14466a.set(true);
            h.a aVar = h.b.f14470a;
            synchronized (aVar.f14467a) {
                aVar.f14467a.add(valueCallback);
            }
            if (hVar.b.get() > 0) {
                for (int i = 0; i <= 14; i++) {
                    int i2 = 1 << i;
                    if (hVar.a(i2)) {
                        final h.a aVar2 = h.b.f14470a;
                        final Integer valueOf = Integer.valueOf(i2);
                        d.b("Setup.st", new Runnable() { // from class: com.uc.webview.internal.setup.h.a.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                valueCallback.onReceiveValue(valueOf);
                            }
                        });
                    }
                }
            }
        }
    }

    public static void cleanUnUsedFiles(Context context) {
        try {
            new a(context, null).a(3000L);
        } catch (Throwable th) {
            Log.w(TAG, "cleanUnUsedFiles failed", th);
        }
    }

    public static void clearSwitchedCore(int i) {
        b.a(i);
    }

    public static Extractor createExtractor() {
        return new com.uc.webview.internal.setup.d();
    }

    public static Initializer createInitializer() {
        return e.a();
    }

    public static void enableLog(boolean z) {
        KLogHandler.a(z);
    }

    public static void extractFile(Context context, File file, File file2, boolean z) {
        createExtractor().setContext(context).setASync(false).setCompressedFile(file).setSpecifiedDir(file2).start();
        if (z) {
            com.uc.webview.base.io.d.c("ext", file);
        }
    }

    public static File getExtractDir(Context context, File file) {
        return PathUtils.a(context, file);
    }

    public static File getExtractDirByUrl(Context context, String str) {
        o b = o.b();
        File e = PathUtils.e(context);
        if (TextUtils.isEmpty(str)) {
            return e;
        }
        l g = b.g();
        if (g == null || !g.i() || !str.equals(g.w()) || g.t() == null) {
            File[] listFiles = e.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                String b2 = PathUtils.b(str);
                File file = null;
                long j = 0;
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        File file3 = new File(file2, b2);
                        if (file3.exists() && file3.lastModified() > j) {
                            j = file3.lastModified();
                            file = file2;
                        }
                    }
                }
                if (file != null) {
                    e = file;
                }
            }
        } else {
            e = g.t();
        }
        Log.d("Setup.ctrl", "searchCoreDirByUpdateUrl url:" + str + ", coreDir:" + e.getAbsoluteFile());
        return e;
    }

    public static File getInnerCompressedFilePath(Context context) {
        return PathUtils.c(context);
    }

    public static File getRunningDir(Context context, boolean z) {
        return o.b().a(context, z);
    }

    public static boolean isExtractDirReady(File file) {
        if (file != null) {
            return PathUtils.a(file).c();
        }
        return false;
    }

    public static boolean isInited() {
        return com.uc.webview.internal.e.f();
    }

    public static boolean loadCoreDex(Context context, File file) throws UCKnownException {
        ClassLoader classLoader;
        p c = o.c();
        l b = c.b(context, file);
        if (b == null) {
            classLoader = null;
        } else {
            Object[] objArr = new Object[2];
            classLoader = c.a(context, b, com.uc.webview.internal.setup.verify.d.a(), objArr);
            Log.i("Setup.prl", "loadCoreDex:" + classLoader + ", " + objArr[0] + ", " + objArr[1]);
        }
        return classLoader != null;
    }

    public static boolean loadCoreSo(Context context, File file) throws UCKnownException {
        return o.c().a(context, file);
    }

    @Deprecated
    public static boolean loadJsiSo(Context context, ClassLoader classLoader, File file) throws UCKnownException {
        return loadJsiSo(context, classLoader, null, file, false, null);
    }

    @Deprecated
    public static void registerFirstCreateU4WebViewCallback(final ValueCallback<Object> valueCallback) {
        if (valueCallback != null) {
            addInitProcessCallback(new ValueCallback<Integer>() { // from class: com.uc.webview.export.extension.U4Engine.1
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Integer num) {
                    if (num.intValue() == 16384) {
                        valueCallback.onReceiveValue(null);
                    }
                }
            });
        }
    }

    public static void setCoreLibsDeleter(final ValueCallback<File[]> valueCallback) {
        if (valueCallback != null) {
            a.a(new a.AbstractC0839a() { // from class: com.uc.webview.export.extension.U4Engine.2
                @Override // com.uc.webview.internal.setup.a.AbstractC0839a
                public final void a(File[] fileArr) {
                    valueCallback.onReceiveValue(fileArr);
                }
            });
        }
    }

    public static void upgradeToChromeExtensionCore(UpgradingObserver upgradingObserver) {
        upgradeToSpecificCore(upgradingObserver, 2);
    }

    public static void upgradeToFullCapacityCore(UpgradingObserver upgradingObserver) {
        upgradeToSpecificCore(upgradingObserver, 1);
    }

    public static void upgradeToSpecificCore(UpgradingObserver upgradingObserver, int i) {
        t.a(upgradingObserver);
        t.a(i);
    }

    public static boolean verifyCoreFile(File file) throws UCKnownException {
        return verifyCoreFile(file, null);
    }

    public static boolean verifyCoreFiles(File file, boolean z, Object[] objArr) throws UCKnownException {
        o.b();
        return o.a(file, z, objArr);
    }

    public static void enableLog(boolean z, boolean z2) {
        GlobalSettings.set(84, z2);
        KLogHandler.a(z);
    }

    public static File getInnerCompressedFilePath(String str) {
        return PathUtils.a(str);
    }

    @Deprecated
    public static boolean loadJsiSo(Context context, ClassLoader classLoader, File file, File file2, boolean z, Map<String, Object> map) throws UCKnownException {
        return JSILoader.load(context, classLoader, file, file2, z, map);
    }

    public static void swtichCoreTo(File file) {
        b.a(4);
        if (file == null) {
            Log.w("CoreSwitcher", "switchSpecificCore ERROR compressedLib null.");
            return;
        }
        n a2 = n.a(EnvInfo.getContext(), file);
        a2.b = 3;
        a2.f14485a = false;
        Log.w("CoreSwitcher", "switchSpecificCore compressedLib:" + file.getAbsolutePath());
        try {
            k kVar = new k(a2);
            kVar.c = 0;
            kVar.start();
        } catch (Throwable th) {
            Log.w("CoreSwitcher", "postInit: failed", th);
        }
    }

    public static boolean verifyCoreFile(File file, Object[] objArr) throws UCKnownException {
        o.b();
        return o.a(file, true, objArr);
    }

    public static File getExtractDirByUrl(Context context, String str, long j, long j2) {
        return PathUtils.a(context, str, j, j2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Extractor {
        Extractor setASync(boolean z);

        Extractor setClient(Client client);

        Extractor setCompressedFile(File file);

        Extractor setContext(Context context);

        Extractor setForceVerification(boolean z);

        Extractor setSpecifiedDir(File file);

        void start() throws UCKnownException;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public static class Client {
            public boolean onStart(File file, File file2) {
                return true;
            }

            public boolean onVerification(File file, File file2) {
                return false;
            }

            public void onFailed(UCKnownException uCKnownException) {
            }

            public void onSuccess(File file) {
            }

            public void onExists(File file, File file2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class InitializerClient {
        public IRunningCoreInfo onDecideCore(IRunningCoreInfo iRunningCoreInfo, IRunningCoreInfo iRunningCoreInfo2) {
            return null;
        }

        public boolean onDownloadStart(String str, IDownloadHandle iDownloadHandle) {
            return true;
        }

        public boolean onExtractStart(File file, File file2) {
            return true;
        }

        public void onDexReady(ClassLoader classLoader) {
        }

        public void onDownloadProgress(int i) {
        }

        public void onExtractFinish(File file) {
        }

        public void onFailed(IRunningCoreInfo iRunningCoreInfo) {
        }

        public void onInitStart(IRunningCoreInfo iRunningCoreInfo) {
        }

        public void onNativeReady(File file) {
        }

        public void onSuccess(IRunningCoreInfo iRunningCoreInfo) {
        }

        public void onCoreTypeReady(int i, int i2) {
        }

        public void onDownloadFinish(String str, File file) {
        }
    }
}
