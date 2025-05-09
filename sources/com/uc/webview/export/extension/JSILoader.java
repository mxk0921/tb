package com.uc.webview.export.extension;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.c;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class JSILoader {
    public static final String EXTRA_PARAM_SPECIFIED_DIR = "specifiedDir";
    private static final String TAG = "jsi";
    private static boolean sLoaded;
    private static File sUsingDir;

    private static ClassLoader getClassLoader() {
        return JSILoader.class.getClassLoader();
    }

    private static Class<?> getJSEngineClass(ClassLoader classLoader) {
        if (classLoader == null) {
            try {
                classLoader = JSILoader.class.getClassLoader();
            } catch (Throwable th) {
                Log.e(TAG, "reflect JSEngine failed", th);
                return null;
            }
        }
        return Class.forName("com.alibaba.jsi.standard.JSEngine", false, classLoader);
    }

    public static synchronized File getUsingDir() {
        File file;
        synchronized (JSILoader.class) {
            file = sUsingDir;
        }
        return file;
    }

    public static boolean load(Context context, File file, boolean z) throws UCKnownException {
        return load(context, file, null, z);
    }

    private static synchronized boolean loadImpl(Context context, ClassLoader classLoader, File file, File file2, File file3, boolean z, Map<String, Object> map) throws UCKnownException {
        File runningDir;
        synchronized (JSILoader.class) {
            try {
                boolean z2 = sLoaded;
                if (z2) {
                    return z2;
                }
                Class<?> jSEngineClass = getJSEngineClass(classLoader);
                if (jSEngineClass == null) {
                    ErrorCode.JSI_JSENGINE_NOT_FOUND.report();
                }
                if (file3 != null) {
                    Log.i(TAG, "loadJsiBySpecifiedDir:" + file3.getPath());
                    boolean loadJsi = loadJsi(context, jSEngineClass, file, file3);
                    sLoaded = loadJsi;
                    sUsingDir = file3;
                    return loadJsi;
                }
                if (!z && (runningDir = U4Engine.getRunningDir(context, false)) != null) {
                    try {
                        Log.i(TAG, "loadJsiByRunningDir:" + runningDir.getPath());
                        boolean loadJsi2 = loadJsi(context, jSEngineClass, file, runningDir);
                        sLoaded = loadJsi2;
                        sUsingDir = runningDir;
                        return loadJsi2;
                    } catch (UCKnownException e) {
                        if (!ErrorCode.JSI_JSENGINE_INCOMPATIBLE_CORE.equals(e)) {
                            sLoaded = false;
                            throw e;
                        }
                    }
                }
                File extractCore = extractCore(context, file2);
                if (extractCore == null) {
                    ErrorCode.JSI_U4ENGINE_EXTRACT_FAILED.report();
                }
                Log.i(TAG, "loadJsiByCompressedFile:" + extractCore.getPath());
                boolean loadJsi3 = loadJsi(context, jSEngineClass, file, extractCore);
                sLoaded = loadJsi3;
                sUsingDir = extractCore;
                return loadJsi3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean load(Context context, File file, File file2, boolean z) throws UCKnownException {
        return loadImpl(context, getClassLoader(), file2, file, null, z, null);
    }

    private static File extractCore(Context context, File file) {
        c cVar = new c();
        if (file == null) {
            file = PathUtils.c(context);
        }
        if (file == null || !file.exists()) {
            ErrorCode.JSI_JSENGINE_INVALID_COMPRESSED_FILE.report();
        }
        final File[] fileArr = {null};
        U4Engine.createExtractor().setContext(context).setCompressedFile(file).setForceVerification(true).setASync(false).setClient(new U4Engine.Extractor.Client() { // from class: com.uc.webview.export.extension.JSILoader.1
            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onExists(File file2, File file3) {
                Log.i(JSILoader.TAG, "extract.exists: " + file2.getPath() + ", " + file3.getPath());
                fileArr[0] = file3;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onFailed(UCKnownException uCKnownException) {
                Log.e(JSILoader.TAG, "extract.failed:", uCKnownException);
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final boolean onStart(File file2, File file3) {
                Log.i(JSILoader.TAG, "extract.start: " + file2.getPath() + ", " + file3.getPath());
                return true;
            }

            @Override // com.uc.webview.export.extension.U4Engine.Extractor.Client
            public final void onSuccess(File file2) {
                Log.i(JSILoader.TAG, "extract.success: " + file2.getPath());
                fileArr[0] = file2;
            }
        }).start();
        Log.i(TAG, "extract.finish, " + cVar.toString());
        return fileArr[0];
    }

    public static boolean load(Context context, File file) throws UCKnownException {
        return load(context, file, (File) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[Catch: all -> 0x0025, UCKnownException -> 0x0028, TryCatch #2 {UCKnownException -> 0x0028, all -> 0x0025, blocks: (B:3:0x000c, B:6:0x0018, B:8:0x001e, B:15:0x002b, B:18:0x0041, B:20:0x0047, B:22:0x004e, B:24:0x0054, B:25:0x0063, B:27:0x0069, B:29:0x006f, B:31:0x0076, B:32:0x007a, B:33:0x0089), top: B:39:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[Catch: all -> 0x0025, UCKnownException -> 0x0028, TryCatch #2 {UCKnownException -> 0x0028, all -> 0x0025, blocks: (B:3:0x000c, B:6:0x0018, B:8:0x001e, B:15:0x002b, B:18:0x0041, B:20:0x0047, B:22:0x004e, B:24:0x0054, B:25:0x0063, B:27:0x0069, B:29:0x006f, B:31:0x0076, B:32:0x007a, B:33:0x0089), top: B:39:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean loadJsi(android.content.Context r12, java.lang.Class r13, java.io.File r14, java.io.File r15) {
        /*
            r0 = 1
            r1 = 2
            r2 = 0
            java.lang.String r3 = "JSEngine.loadSo failed:"
            java.lang.String r4 = "jsi"
            java.lang.String r5 = "JSEngine.loadSo "
            java.lang.String r6 = "JSEngine.loadSo args: "
            com.uc.webview.base.c r7 = new com.uc.webview.base.c     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r7.<init>()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.io.File r15 = com.uc.webview.base.io.PathUtils.getDirCoreLib(r15)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r14 == 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            java.io.File r14 = com.uc.webview.base.io.PathUtils.getFileJsiLib(r15)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
        L_0x001c:
            if (r14 == 0) goto L_0x002b
            boolean r8 = r14.exists()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r8 != 0) goto L_0x003a
            goto L_0x002b
        L_0x0025:
            r12 = move-exception
            goto L_0x00ea
        L_0x0028:
            r12 = move-exception
            goto L_0x00f8
        L_0x002b:
            java.io.File r14 = new java.io.File     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            android.content.pm.ApplicationInfo r8 = r12.getApplicationInfo()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r8 = r8.nativeLibraryDir     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r14.<init>(r8)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.io.File r14 = com.uc.webview.base.io.PathUtils.getFileJsiLib(r14)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
        L_0x003a:
            java.lang.String r8 = "null"
            java.lang.String r9 = "JSEngine.loadSo invalid jsi so:"
            if (r14 == 0) goto L_0x0047
            boolean r10 = r14.exists()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r10 != 0) goto L_0x0063
        L_0x0047:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r10.<init>(r9)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r14 == 0) goto L_0x0053
            java.lang.String r11 = r14.getPath()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            goto L_0x0054
        L_0x0053:
            r11 = r8
        L_0x0054:
            r10.append(r11)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r10 = r10.toString()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            com.uc.webview.base.Log.i(r4, r10)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            com.uc.webview.base.ErrorCode r10 = com.uc.webview.base.ErrorCode.JSI_JSENGINE_INVALID_JSI_SO_FILE     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r10.report()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
        L_0x0063:
            java.io.File r15 = com.uc.webview.base.io.PathUtils.getFileCoreLib(r15)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r15 == 0) goto L_0x006f
            boolean r10 = r15.exists()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r10 != 0) goto L_0x0089
        L_0x006f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r10.<init>(r9)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            if (r15 == 0) goto L_0x007a
            java.lang.String r8 = r15.getPath()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
        L_0x007a:
            r10.append(r8)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r8 = r10.toString()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            com.uc.webview.base.Log.i(r4, r8)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            com.uc.webview.base.ErrorCode r8 = com.uc.webview.base.ErrorCode.JSI_JSENGINE_INVALID_CORE_SO_FILE     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r8.report()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
        L_0x0089:
            android.os.Bundle r8 = new android.os.Bundle     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r8.<init>()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r9 = "jsiSoPath"
            java.lang.String r14 = r14.getPath()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r8.putString(r9, r14)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r14 = "jsEngineSoPath"
            java.lang.String r15 = r15.getPath()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r8.putString(r14, r15)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r14.<init>(r6)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r14.append(r8)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r14 = r14.toString()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            com.uc.webview.base.Log.i(r4, r14)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r14 = "loadSo"
            java.lang.Class[] r15 = new java.lang.Class[r1]     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r15[r2] = r6     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r15[r0] = r6     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r1[r2] = r12     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r1[r0] = r8     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.Object r12 = com.uc.webview.base.f.a(r13, r14, r15, r1)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            boolean r12 = r12.booleanValue()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r13.<init>(r5)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r13.append(r12)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r14 = ", "
            r13.append(r14)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r14 = r7.toString()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            r13.append(r14)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            java.lang.String r13 = r13.toString()     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            com.uc.webview.base.Log.i(r4, r13)     // Catch: all -> 0x0025, UCKnownException -> 0x0028
            return r12
        L_0x00ea:
            com.uc.webview.base.Log.e(r4, r3, r12)
            com.uc.webview.base.ErrorCode r13 = com.uc.webview.base.ErrorCode.JSI_JSENGINE_INCOMPATIBLE_CORE
            r13.report(r12)
            com.uc.webview.base.ErrorCode r13 = com.uc.webview.base.ErrorCode.JSI_JSENGINE_LOADSO_FAILED
            r13.report(r12)
            return r2
        L_0x00f8:
            com.uc.webview.base.Log.e(r4, r3, r12)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.export.extension.JSILoader.loadJsi(android.content.Context, java.lang.Class, java.io.File, java.io.File):boolean");
    }

    public static boolean load(Context context, File file, File file2) throws UCKnownException {
        return loadImpl(context, getClassLoader(), file2, null, file, true, null);
    }

    public static boolean load(Context context, ClassLoader classLoader, File file, File file2, boolean z, Map<String, Object> map) throws UCKnownException {
        File file3 = null;
        String str = map != null ? (String) map.get(EXTRA_PARAM_SPECIFIED_DIR) : null;
        if (!TextUtils.isEmpty(str)) {
            file3 = new File(str);
        }
        return loadImpl(context, classLoader, file, file2, file3, z, map);
    }
}
