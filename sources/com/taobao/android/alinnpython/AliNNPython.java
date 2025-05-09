package com.taobao.android.alinnpython;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import tb.bh9;
import tb.bmv;
import tb.bzn;
import tb.tq0;
import tb.tuy;
import tb.uq0;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AliNNPython {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_WHITELIST = "MODULE_WHITELIST";
    private static String TAG = "AliNNPython";
    private static boolean initialized;
    private static Map<String, String> mVmConifgMap;
    private static boolean sAliNNPythonAvailable;
    private long currentThreadId;
    private long instance;
    private static List<tq0> pythonInitCallbackList = new ArrayList();
    private static Context sContext = null;
    public static Exception initException = null;
    private static Map<String, AliNNPythonObjectToJavaCallback> convertCallbackMap = new HashMap();
    private String bizName = "AliNNPython";
    public AliNNPythonThreadState threadState = null;

    private AliNNPython() {
        this.instance = 0L;
        this.currentThreadId = -1L;
        long nativeNewInstance = nativeNewInstance(this);
        this.instance = nativeNewInstance;
        if (nativeNewInstance != 0) {
            this.currentThreadId = Thread.currentThread().getId();
        }
    }

    public static void addPythonPath(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a00afb3", new Object[]{str});
        } else if (nativeAvailable()) {
            nativeAddPythonPath(str);
        } else {
            throw new AliNNPythonException("Python not init");
        }
    }

    private void checkInstance() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fcdb3c4", new Object[]{this});
        } else if (this.instance == 0) {
            throw new AliNNPythonException("instance is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean copyAssertFileTo(android.content.Context r6, java.lang.String r7, java.io.File r8) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.alinnpython.AliNNPython.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "e02e5c14"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            r6 = 2
            r4[r6] = r8
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            r2 = 0
            boolean r3 = r8.exists()     // Catch: all -> 0x0031, IOException -> 0x0035
            if (r3 != 0) goto L_0x0038
            java.io.File r3 = r8.getParentFile()     // Catch: all -> 0x0031, IOException -> 0x0035
            r3.mkdirs()     // Catch: all -> 0x0031, IOException -> 0x0035
            r8.createNewFile()     // Catch: all -> 0x0031, IOException -> 0x0035
            goto L_0x0038
        L_0x0031:
            r6 = move-exception
            r7 = r2
            goto L_0x0098
        L_0x0035:
            r6 = move-exception
            r7 = r2
            goto L_0x007f
        L_0x0038:
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: all -> 0x0031, IOException -> 0x0035
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r6, r7)     // Catch: all -> 0x0031, IOException -> 0x0035
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: all -> 0x0076, IOException -> 0x007b
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: all -> 0x0076, IOException -> 0x007b
            r7.<init>(r8)     // Catch: all -> 0x0076, IOException -> 0x007b
            r8 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r8]     // Catch: all -> 0x0058, IOException -> 0x005d
        L_0x004d:
            int r2 = r6.read(r8)     // Catch: all -> 0x0058, IOException -> 0x005d
            r3 = -1
            if (r2 == r3) goto L_0x0062
            r7.write(r8, r1, r2)     // Catch: all -> 0x0058, IOException -> 0x005d
            goto L_0x004d
        L_0x0058:
            r8 = move-exception
            r2 = r7
            r7 = r6
            r6 = r8
            goto L_0x0098
        L_0x005d:
            r8 = move-exception
            r2 = r7
            r7 = r6
            r6 = r8
            goto L_0x007f
        L_0x0062:
            r7.flush()     // Catch: all -> 0x0058, IOException -> 0x005d
            r7.close()     // Catch: IOException -> 0x0069
            goto L_0x006d
        L_0x0069:
            r7 = move-exception
            r7.printStackTrace()
        L_0x006d:
            r6.close()     // Catch: IOException -> 0x0071
            goto L_0x0075
        L_0x0071:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0075:
            return r0
        L_0x0076:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0098
        L_0x007b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x007f:
            r6.printStackTrace()     // Catch: all -> 0x0097
            if (r2 == 0) goto L_0x008c
            r2.close()     // Catch: IOException -> 0x0088
            goto L_0x008c
        L_0x0088:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008c:
            if (r7 == 0) goto L_0x0096
            r7.close()     // Catch: IOException -> 0x0092
            goto L_0x0096
        L_0x0092:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0096:
            return r1
        L_0x0097:
            r6 = move-exception
        L_0x0098:
            if (r2 == 0) goto L_0x00a2
            r2.close()     // Catch: IOException -> 0x009e
            goto L_0x00a2
        L_0x009e:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a2:
            if (r7 == 0) goto L_0x00ac
            r7.close()     // Catch: IOException -> 0x00a8
            goto L_0x00ac
        L_0x00a8:
            r7 = move-exception
            r7.printStackTrace()
        L_0x00ac:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.alinnpython.AliNNPython.copyAssertFileTo(android.content.Context, java.lang.String, java.io.File):boolean");
    }

    public static int copyPyLib(Context context, String str, String str2) {
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c9b8141", new Object[]{context, str, str2})).intValue();
        }
        if (context == null) {
            context = sContext;
        }
        if (context == null) {
            return 0;
        }
        String absolutePath = context.getFilesDir().getAbsolutePath();
        File file = null;
        try {
            File file2 = new File(absolutePath + "/lib/" + str);
            try {
                if (!file2.exists()) {
                    file2.getParentFile().mkdirs();
                    file2.createNewFile();
                }
                InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), str);
                FileOutputStream fileOutputStream = new FileOutputStream(file2.getAbsolutePath());
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        proxy_open.close();
                        bh9.e(file2, new File(absolutePath + "/lib/" + str2));
                        StringBuilder sb = new StringBuilder();
                        sb.append(absolutePath);
                        sb.append("/lib/");
                        setPath(sb.toString());
                        file2.delete();
                        return 1;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                file = file2;
                tuy.a("AliNNPython", "copyPyLibFailed", e);
                if (file != null && file.exists()) {
                    file.delete();
                }
                return 0;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private static void dispatcherPythonInitCallback(Exception exc, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("430694be", new Object[]{exc, map});
            return;
        }
        synchronized (pythonInitCallbackList) {
            try {
                for (tq0 tq0Var : pythonInitCallbackList) {
                    if (exc != null) {
                        tq0Var.onFailed(exc);
                    } else {
                        tq0Var.onSuccess(null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getInitResult(AliNNPython aliNNPython) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d53ccf9", new Object[]{aliNNPython});
        }
        if (aliNNPython == null) {
            j = 0;
        } else {
            j = aliNNPython.instance;
        }
        return nativeGetInitResult(j);
    }

    public static AliNNPythonObjectToJavaCallback getObjectConvertCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNPythonObjectToJavaCallback) ipChange.ipc$dispatch("6d7e7e5e", new Object[]{str});
        }
        return convertCallbackMap.get(str);
    }

    private static long getThreadId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a77e936", new Object[0])).longValue();
        }
        return Thread.currentThread().getId();
    }

    public static synchronized void initialize(Context context) {
        synchronized (AliNNPython.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
                return;
            }
            tuy.a("AliNNPython", "initialize thread: " + getThreadId(), new Throwable());
            if (initialized) {
                tuy.a(RPCDataItems.SWITCH_TAG_LOG, "AlinnPython  already initialize return", null);
                return;
            }
            initialized = true;
            if (!sAliNNPythonAvailable) {
                sAliNNPythonAvailable = bzn.d().c("AliNNPython").i();
                new StringBuilder("Load Python With RemoteSo - ").append(sAliNNPythonAvailable);
            }
            if (!nativeAvailable()) {
                Exception exc = new Exception("so load failed");
                initException = exc;
                dispatcherPythonInitCallback(exc, null);
                return;
            }
            sContext = context;
            long currentTimeMillis = System.currentTimeMillis();
            String absolutePath = context.getFilesDir().getAbsolutePath();
            try {
                File file = new File(absolutePath + "/lib/python27.zip");
                if (!file.exists()) {
                    file.getParentFile().mkdirs();
                    file.createNewFile();
                }
                InputStream proxy_open = AssetsDelegate.proxy_open(context.getAssets(), "python27.zip");
                FileOutputStream fileOutputStream = new FileOutputStream(file.getAbsolutePath());
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = proxy_open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                proxy_open.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            nativeInitialize(absolutePath);
            setClassRef();
            nativeRedirectStdioToLogCat();
            uq0.e("AliNNPython", "initialize", "0", true, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
            processModuleWhiteListConfig();
            dispatcherPythonInitCallback(null, null);
        }
    }

    public static boolean isNewPythonEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fc2abff", new Object[0])).booleanValue();
        }
        return true;
    }

    public static void load(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6772aef7", new Object[]{str});
        } else {
            System.load(str);
        }
    }

    public static native void nativeAddPythonPath(String str);

    private static native void nativeAddToModuleWhiteList(String str);

    public static boolean nativeAvailable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("131e7ffd", new Object[0])).booleanValue();
        }
        return sAliNNPythonAvailable;
    }

    public static native void nativeDeallocInstance(long j);

    public static native String nativeGetInitResult(long j);

    private static native int nativeGetPythonFlag();

    public static native void nativeInitialize(String str);

    public static native void nativeLoadPydaiC();

    public static native long nativeNewInstance(Object obj);

    private native Object nativeObjectAsObject(long j, long j2);

    public static native long nativeRedirectStdioToLogCat();

    public static AliNNPython newAliNNPythonInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNPython) ipChange.ipc$dispatch("ab55b8fd", new Object[0]);
        }
        AliNNPython aliNNPython = new AliNNPython();
        String initResult = getInitResult(aliNNPython);
        if (TextUtils.equals(initResult, "SUCCESS")) {
            return aliNNPython;
        }
        String str = TAG;
        tuy.a(str, "Python instance init failed: " + initResult, new Throwable());
        uq0.d(initResult);
        aliNNPython.release();
        return null;
    }

    private static void processModuleWhiteListConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f2f0d5", new Object[0]);
            return;
        }
        Map<String, String> map = mVmConifgMap;
        if (map != null) {
            String str = map.get(MODULE_WHITELIST);
            if (!TextUtils.isEmpty(str)) {
                nativeAddToModuleWhiteList(str);
            }
        }
    }

    public static boolean registerPythonInitCallback(tq0 tq0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ab5fe07", new Object[]{tq0Var})).booleanValue();
        }
        if (tq0Var == null) {
            return false;
        }
        synchronized (pythonInitCallbackList) {
            try {
                if (!pythonInitCallbackList.contains(tq0Var)) {
                    pythonInitCallbackList.add(tq0Var);
                }
            } finally {
            }
        }
        synchronized (AliNNPython.class) {
            try {
                if (initialized) {
                    Exception exc = initException;
                    if (exc != null) {
                        tq0Var.onFailed(exc);
                    } else {
                        tq0Var.onSuccess(null);
                    }
                }
            } finally {
            }
        }
        return true;
    }

    public static void registerPythonObjectConvertCallback(String str, AliNNPythonObjectToJavaCallback aliNNPythonObjectToJavaCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78bfd607", new Object[]{str, aliNNPythonObjectToJavaCallback});
        } else {
            convertCallbackMap.put(str, aliNNPythonObjectToJavaCallback);
        }
    }

    public static native void setClassRef();

    @Deprecated
    public static void setPath(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("600486f8", new Object[]{str});
            return;
        }
        AliNNPython aliNNPython = new AliNNPython();
        aliNNPython.addPath(str);
        aliNNPython.finalize();
    }

    public static void setPythonVMConfig(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dea3807", new Object[]{map});
        } else {
            mVmConifgMap = map;
        }
    }

    public static boolean unregisterPythonInitCallback(tq0 tq0Var) {
        boolean remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c60dbe0", new Object[]{tq0Var})).booleanValue();
        }
        synchronized (pythonInitCallbackList) {
            remove = pythonInitCallbackList.remove(tq0Var);
        }
        return remove;
    }

    public void DECREF(long j) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b11c6c", new Object[]{this, new Long(j)});
        } else if (nativeAvailable()) {
            nativeDECREF(this.instance, j);
        } else {
            throw new AliNNPythonException("Architecture not support!");
        }
    }

    public void XDECREF(long j) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c1f514", new Object[]{this, new Long(j)});
        } else if (nativeAvailable()) {
            nativeXDECREF(this.instance, j);
        } else {
            throw new AliNNPythonException("Architecture not support!");
        }
    }

    @Deprecated
    public void addPath(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2846277", new Object[]{this, str});
        } else if (nativeAvailable()) {
            long currentTimeMillis = System.currentTimeMillis();
            checkInstance();
            nativeAddPath(this.instance, str);
            uq0.e(this.bizName, "addPath", "0", true, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
        } else {
            throw new AliNNPythonException("Architecture not support!");
        }
    }

    public long call(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4203866d", new Object[]{this, str, str2})).longValue() : call(str, str2, null);
    }

    public long callMethodOfObject(long j, String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("576bee06", new Object[]{this, new Long(j), str})).longValue() : callMethodOfObject(j, str, null);
    }

    public long callStaticMethod(String str, String str2, String str3) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c009b46", new Object[]{this, str, str2, str3})).longValue() : callStaticMethod(str, str2, str3, null, null);
    }

    public long currentThreadId() throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25b6fad9", new Object[]{this})).longValue();
        }
        if (nativeAvailable()) {
            return nativeCurrentThreadId(this.instance);
        }
        throw new AliNNPythonException("Architecture not support!");
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            release();
        }
    }

    public void importModule(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e0338c", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && isNewPythonEngine()) {
            nativeImportModule(this.instance, str, str2);
        }
    }

    public native void nativeAddPath(long j, String str);

    public native long nativeCall(long j, String str, String str2);

    public native long nativeCall(long j, String str, String str2, Vector<HashMap<String, Object>> vector);

    public native long nativeCallMethodOfObject(long j, long j2, String str);

    public native long nativeCallMethodOfObject(long j, long j2, String str, Vector<HashMap<String, Object>> vector);

    public native long nativeCallStaticMethod(long j, String str, String str2, String str3, Vector<HashMap<String, Object>> vector, ErrorMessagePrinter errorMessagePrinter);

    public native long nativeCurrentThreadId(long j);

    public native void nativeDECREF(long j, long j2);

    public native long nativeImportModule(long j, String str, String str2);

    public native double nativeObjectAsDouble(long j, long j2);

    public native long nativeObjectAsInteger(long j, long j2);

    public native long nativeObjectAsLong(long j, long j2);

    public native HashMap nativeObjectAsMap(long j, long j2);

    public native String nativeObjectAsString(long j, long j2);

    public native long nativeReloadPackage(long j, String str);

    public native long nativeRunFile(long j, String str);

    public native long nativeRunFile(long j, String str, Vector<HashMap<String, Object>> vector);

    public native void nativeStopPythonThread(long j, long j2);

    public native void nativeTestAPI();

    public native long nativeTupleGetItem(long j, long j2, long j3);

    public native long nativeTupleSize(long j, long j2);

    public native void nativeXDECREF(long j, long j2);

    public long newObject(String str, String str2) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f13b980e", new Object[]{this, str, str2})).longValue() : call(str2, str, null);
    }

    public boolean objectAsBoolean(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9be36a6a", new Object[]{this, new Long(j)})).booleanValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j == 0) {
            throw new AliNNPythonException("objectAsBoolean: object is null");
        } else if (nativeObjectAsLong(this.instance, j) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public double objectAsDouble(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee2e3549", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeObjectAsDouble(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
    }

    public long objectAsInteger(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e991304", new Object[]{this, new Long(j)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeObjectAsInteger(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsLong: object is null");
        }
    }

    public long objectAsLong(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6551ed44", new Object[]{this, new Long(j)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeObjectAsLong(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsLong: object is null");
        }
    }

    public HashMap objectAsMap(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("91c77f15", new Object[]{this, new Long(j)});
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeObjectAsMap(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
    }

    public Object objectAsObject(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42a6a425", new Object[]{this, new Long(j)});
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeObjectAsObject(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsObject: object is null");
        }
    }

    public String objectAsString(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2f78f4e5", new Object[]{this, new Long(j)});
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeObjectAsString(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsString: object is null");
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        synchronized (AliNNPython.class) {
            try {
                if (this.instance != 0) {
                    String str = TAG;
                    tuy.a(str, "Python instance release " + getThreadId(), new Throwable());
                    if (!isNewPythonEngine() || this.currentThreadId == Thread.currentThread().getId()) {
                        nativeDeallocInstance(this.instance);
                        this.instance = 0L;
                        return;
                    }
                    tuy.a(TAG, "Python instance release be called by error thread", null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long runFile(String str) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3c4299ec", new Object[]{this, str})).longValue() : runFile(str, null);
    }

    public void setBizName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.bizName = str;
        }
    }

    public Vector<HashMap<String, Object>> simpleArguments(Vector<Object> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("b02c82ab", new Object[]{this, vector});
        }
        return simpleValueArrayToValueArray(vector);
    }

    public Vector<HashMap<String, Object>> simpleValueDictToValueDict(Map<String, Object> map) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("ffe345fb", new Object[]{this, map});
        }
        Vector<HashMap<String, Object>> vector = new Vector<>();
        for (String str : map.keySet()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            Object obj = map.get(str);
            hashMap.put("name", str);
            if (obj == null) {
                hashMap.put("type", AmnetConstant.VAL_SUPPORT_ZSTD);
                hashMap.put("value", null);
            } else if (obj.getClass() == String.class) {
                hashMap.put("type", "s");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Float.class) {
                hashMap.put("type", "f");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Double.class) {
                hashMap.put("type", "d");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Integer.class) {
                hashMap.put("type", bmv.MSGTYPE_INTERVAL);
                hashMap.put("value", obj);
            } else if (obj.getClass() == Long.class) {
                hashMap.put("type", "l");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Vector.class) {
                hashMap.put("type", "()");
                hashMap.put("value", simpleValueArrayToValueArray((Vector) obj));
            } else if (obj.getClass() == HashMap.class) {
                hashMap.put("type", "{}");
                hashMap.put("value", simpleValueDictToValueDict((Map) obj));
            } else if (obj.getClass() == Boolean.class) {
                hashMap.put("type", "d");
                hashMap.put("value", Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : vu3.b.GEO_NOT_SUPPORT));
            } else if (obj instanceof AliNNPythonJavaToPythonCallback) {
                hashMap.put("type", "tpo");
                hashMap.put("value", obj);
            } else {
                throw new AliNNPythonException("type not supported: ".concat(obj.getClass().getName()));
            }
            vector.add(hashMap);
        }
        return vector;
    }

    public void stopPythonThread(long j) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41e3cf5", new Object[]{this, new Long(j)});
        } else if (nativeAvailable()) {
            nativeStopPythonThread(this.instance, j);
        } else {
            throw new AliNNPythonException("Architecture not support!");
        }
    }

    public long tupleGetItem(long j, long j2) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6543d1c", new Object[]{this, new Long(j), new Long(j2)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeTupleGetItem(this.instance, j, j2);
        } else {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
    }

    public long tupleSize(long j) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bc754c8", new Object[]{this, new Long(j)})).longValue();
        }
        if (!nativeAvailable()) {
            throw new AliNNPythonException("Architecture not support!");
        } else if (j != 0) {
            return nativeTupleSize(this.instance, j);
        } else {
            throw new AliNNPythonException("objectAsDouble: object is null");
        }
    }

    public long call(String str, String str2, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d536d299", new Object[]{this, str, str2, vector})).longValue();
        }
        if (nativeAvailable()) {
            long currentTimeMillis = System.currentTimeMillis();
            checkInstance();
            long nativeCall = nativeCall(this.instance, str, str2, vector == null ? new Vector<>() : vector);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str3 = this.bizName;
            uq0.e(str3, str + "." + str2, "0", nativeCall != 0, (float) currentTimeMillis2, 0.0f);
            return nativeCall;
        }
        throw new AliNNPythonException("Architecture not support!");
    }

    public long callMethodOfObject(long j, String str, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8c7e5f2", new Object[]{this, new Long(j), str, vector})).longValue();
        }
        if (nativeAvailable()) {
            long currentTimeMillis = System.currentTimeMillis();
            checkInstance();
            long nativeCallMethodOfObject = nativeCallMethodOfObject(this.instance, j, str, vector == null ? new Vector<>() : vector);
            uq0.e(this.bizName, str, "0", nativeCallMethodOfObject != 0, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
            return nativeCallMethodOfObject;
        }
        throw new AliNNPythonException("Architecture not support!");
    }

    public long callStaticMethod(String str, String str2, String str3, Vector<HashMap<String, Object>> vector, ErrorMessagePrinter errorMessagePrinter) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ceed6eee", new Object[]{this, str, str2, str3, vector, errorMessagePrinter})).longValue();
        }
        if (nativeAvailable()) {
            System.currentTimeMillis();
            checkInstance();
            if (vector == null) {
                vector = new Vector<>();
            }
            long nativeCallStaticMethod = nativeCallStaticMethod(this.instance, str, str2, str3, vector, errorMessagePrinter);
            System.currentTimeMillis();
            return nativeCallStaticMethod;
        }
        throw new AliNNPythonException("Architecture not support!");
    }

    public long newObject(String str, String str2, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf141dfa", new Object[]{this, str, str2, vector})).longValue() : call(str2, str, vector);
    }

    public long runFile(String str, Vector<HashMap<String, Object>> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7da458", new Object[]{this, str, vector})).longValue();
        }
        if (nativeAvailable()) {
            long currentTimeMillis = System.currentTimeMillis();
            checkInstance();
            if (vector == null) {
                vector = new Vector<>();
            }
            long nativeRunFile = nativeRunFile(this.instance, str, vector);
            uq0.e(this.bizName, "runFile", "0", nativeRunFile != 0, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
            return nativeRunFile;
        }
        throw new AliNNPythonException("Architecture not support!");
    }

    public long reloadPackage(String str) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed587732", new Object[]{this, str})).longValue();
        }
        if (nativeAvailable()) {
            long currentTimeMillis = System.currentTimeMillis();
            checkInstance();
            long nativeReloadPackage = nativeReloadPackage(this.instance, str);
            uq0.e(this.bizName, "reloadModule", "0", nativeReloadPackage == 0, (float) (System.currentTimeMillis() - currentTimeMillis), 0.0f);
            return nativeReloadPackage;
        }
        throw new AliNNPythonException("Architecture not support!");
    }

    public Vector<HashMap<String, Object>> simpleValueArrayToValueArray(Vector<Object> vector) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("6b74a032", new Object[]{this, vector});
        }
        Vector<HashMap<String, Object>> vector2 = new Vector<>();
        for (int i = 0; i < vector.size(); i++) {
            HashMap<String, Object> hashMap = new HashMap<>();
            Object obj = vector.get(i);
            if (obj == null) {
                hashMap.put("type", AmnetConstant.VAL_SUPPORT_ZSTD);
                hashMap.put("value", null);
            } else if (obj.getClass() == String.class) {
                hashMap.put("type", "s");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Float.class) {
                hashMap.put("type", "f");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Double.class) {
                hashMap.put("type", "d");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Integer.class) {
                hashMap.put("type", bmv.MSGTYPE_INTERVAL);
                hashMap.put("value", obj);
            } else if (obj.getClass() == Long.class) {
                hashMap.put("type", "l");
                hashMap.put("value", obj);
            } else if (obj.getClass() == Vector.class) {
                hashMap.put("type", "()");
                hashMap.put("value", simpleValueArrayToValueArray((Vector) obj));
            } else if (obj.getClass() == HashMap.class) {
                hashMap.put("type", "{}");
                hashMap.put("value", simpleValueDictToValueDict((Map) obj));
            } else if (obj.getClass() == Boolean.class) {
                hashMap.put("type", "d");
                hashMap.put("value", Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : vu3.b.GEO_NOT_SUPPORT));
            } else if (obj instanceof AliNNPythonJavaToPythonCallback) {
                hashMap.put("type", "tpo");
                hashMap.put("value", obj);
            } else {
                throw new AliNNPythonException("type not supported: ".concat(obj.getClass().getName()));
            }
            vector2.add(hashMap);
        }
        return vector2;
    }

    public static void initialize(String str) throws AliNNPythonException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f2fa21", new Object[]{str});
        } else if (nativeAvailable()) {
            nativeInitialize(str);
        } else {
            throw new AliNNPythonException("Architecture not support!");
        }
    }
}
