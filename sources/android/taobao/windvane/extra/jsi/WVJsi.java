package android.taobao.windvane.extra.jsi;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.UCLog;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.weex.common.Constants;
import com.uc.webview.base.UCKnownException;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.export.extension.JSILoader;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.util.HashMap;
import tb.bhc;
import tb.hqf;
import tb.icn;
import tb.jpw;
import tb.lcn;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.wpw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVJsi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MONITOR_POINT = "WVJsi";
    private static final String TAG = "WVJsi";
    private static volatile boolean hasLoadUCJsi = false;
    private static volatile boolean hasLoadQjsJsi = false;
    private static String KEY_JSI_SO_PATH = "jsiSoPath";
    private static String KEY_JSI_ENGINE_PATH = "jsEngineSoPath";
    private static String KEY_JSI_ENGINE_TYPE = "engineType";
    private static String ENGINE_TYPE_V8 = Constants.CodeCache.SAVE_PATH;
    private static String ENGINE_TYPE_QUICK_JS = "qjs";
    private static String JSI_FILE_NAME = "libjsi.so";
    private static final Object LOAD_LOCK = new Object();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InstanceBuilder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String bizName;
        private final Context context;
        private String dataDir;
        private String flags;
        private Handler handler;
        private JsiMode jsiMode = JsiMode.V8;
        private String name;
        private int timeout;
        private String version;

        static {
            t2o.a(989855967);
        }

        public InstanceBuilder(Context context) {
            this.context = context;
        }

        private Bundle buildCommonArgs() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("2cb80381", new Object[]{this});
            }
            Bundle bundle = new Bundle();
            bundle.putString("name", this.name);
            bundle.putString("version", this.version);
            bundle.putString("datadir", this.dataDir);
            bundle.putString("flags", this.flags);
            bundle.putInt("timeout", this.timeout);
            return bundle;
        }

        private InstanceResult tryQjsInstance(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceResult) ipChange.ipc$dispatch("9ccbcbf1", new Object[]{this, context});
            }
            WVJsi.access$400(context);
            if (!hqf.isEngineReady(3)) {
                commitInstanceFail("qjs", "QJS_NOT_READY", null);
                return new InstanceResult(null, new InstanceException("qjs engine is not ready"));
            }
            Bundle buildCommonArgs = buildCommonArgs();
            buildCommonArgs.putInt("engine", 3);
            try {
                RVLLevel rVLLevel = RVLLevel.Info;
                lcn.a(rVLLevel, "WVJsi/CREATE").j("QJS_CREATE_START").a("name", this.name).f();
                InstanceResult instanceResult = new InstanceResult(JSEngine.createInstance(context, buildCommonArgs, this.handler), null);
                if (instanceResult.isSuccess()) {
                    commitInstanceSuccess("qjs");
                    lcn.a(rVLLevel, "WVJsi/CREATE").j("QJS_CREATE_SUCCESS").a("name", this.name).f();
                } else {
                    commitInstanceFail("qjs", "CREATE_FAIL", null);
                    lcn.a(RVLLevel.Error, "WVJsi/CREATE").j("QJS_CREATE_FAIL").a("name", this.name).f();
                }
                return instanceResult;
            } catch (Throwable th) {
                lcn.a(RVLLevel.Error, "WVJsi/CREATE").j("QJS_CREATE_FAIL_EXCEPTION").a("name", this.name).a("msg", Log.getStackTraceString(th)).f();
                commitInstanceFail("qjs", "CREATE_FAIL_EXCEPTION", th.getMessage());
                return new InstanceResult(null, new InstanceException("create jsi instance qjs fail", th));
            }
        }

        public InstanceBuilder bizName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("ce0b544f", new Object[]{this, str});
            }
            this.bizName = str;
            return this;
        }

        public InstanceResult build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceResult) ipChange.ipc$dispatch("2129e129", new Object[]{this});
            }
            if (vpw.commonConfig.Z2 || this.jsiMode.isV8Enable()) {
                InstanceResult tryV8Instance = tryV8Instance(this.context);
                if (tryV8Instance.isSuccess()) {
                    return tryV8Instance;
                }
            } else {
                v7t.n("WVJsi", "v8 is required to be enabled");
            }
            if (this.jsiMode.isQjsEnable()) {
                return tryQjsInstance(this.context);
            }
            return new InstanceResult(null, new InstanceException("instance create fail:" + this.jsiMode));
        }

        public InstanceBuilder dataDir(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("ffb429d4", new Object[]{this, str});
            }
            this.dataDir = str;
            return this;
        }

        public InstanceBuilder flags(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("71711cd8", new Object[]{this, str});
            }
            this.flags = str;
            return this;
        }

        public InstanceBuilder handler(Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("6bf39781", new Object[]{this, handler});
            }
            this.handler = handler;
            return this;
        }

        public InstanceBuilder mode(JsiMode jsiMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("829080a6", new Object[]{this, jsiMode});
            }
            this.jsiMode = jsiMode;
            return this;
        }

        public InstanceBuilder name(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("e2f331dc", new Object[]{this, str});
            }
            this.name = str;
            return this;
        }

        public InstanceBuilder timeout(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("ab6de49b", new Object[]{this, new Integer(i)});
            }
            this.timeout = i;
            return this;
        }

        public InstanceBuilder version(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceBuilder) ipChange.ipc$dispatch("906d6169", new Object[]{this, str});
            }
            this.version = str;
            return this;
        }

        private void commitInstanceFail(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a93cc2cf", new Object[]{this, str, str2, str3});
                return;
            }
            try {
                AppMonitor.Alarm.commitFail("WindVane", "WVJsi", str + "|" + this.name, str2, str3);
            } catch (Throwable th) {
                v7t.e("WVJsi", "commitInstanceFail fail", th, new Object[0]);
            }
        }

        private void commitInstanceSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e1632c8", new Object[]{this, str});
                return;
            }
            try {
                AppMonitor.Alarm.commitSuccess("WindVane", "WVJsi", str + "|" + this.name);
            } catch (Throwable th) {
                v7t.e("WVJsi", "commitInstanceSuccess fail", th, new Object[0]);
            }
        }

        private InstanceResult tryV8Instance(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InstanceResult) ipChange.ipc$dispatch("b8b6eecf", new Object[]{this, context});
            }
            WVJsi.access$200(context);
            if (!hqf.isEngineReady(1)) {
                commitInstanceFail(Constants.CodeCache.SAVE_PATH, "V8_NOT_READY", null);
                lcn.a(RVLLevel.Error, "WVJsi/CREATE").j("V8_NOT_READY").a("name", this.name).f();
                return new InstanceResult(null, new InstanceException("v8 engine is not ready"));
            }
            Bundle buildCommonArgs = buildCommonArgs();
            buildCommonArgs.putInt("engine", 1);
            try {
                RVLLevel rVLLevel = RVLLevel.Info;
                lcn.a(rVLLevel, "WVJsi/CREATE").j("V8_CREATE_START").a("name", this.name).f();
                InstanceResult instanceResult = new InstanceResult(JSEngine.createInstance(context, buildCommonArgs, this.handler), null);
                if (instanceResult.isSuccess()) {
                    commitInstanceSuccess(Constants.CodeCache.SAVE_PATH);
                    lcn.a(rVLLevel, "WVJsi/CREATE").j("V8_CREATE_SUCCESS").a("name", this.name).f();
                } else {
                    commitInstanceFail(Constants.CodeCache.SAVE_PATH, "CREATE_FAIL", null);
                    lcn.a(RVLLevel.Error, "WVJsi/CREATE").j("V8_CREATE_FAIL").a("name", this.name).f();
                }
                return instanceResult;
            } catch (Throwable th) {
                lcn.a(RVLLevel.Error, "WVJsi/CREATE").j("V8_CREATE_FAIL_EXCEPTION").a("name", this.name).a("msg", Log.getStackTraceString(th)).f();
                commitInstanceFail(Constants.CodeCache.SAVE_PATH, "CREATE_FAIL_EXCEPTION", th.getMessage());
                return new InstanceResult(null, new InstanceException("create jsi instance v8 fail", th));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InstanceResult {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Exception exception;
        private final JSEngine jsEngine;

        static {
            t2o.a(989855969);
        }

        public Exception getException() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Exception) ipChange.ipc$dispatch("9ad20156", new Object[]{this});
            }
            return this.exception;
        }

        public JSEngine getJsEngine() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSEngine) ipChange.ipc$dispatch("8d6c6b4c", new Object[]{this});
            }
            return this.jsEngine;
        }

        public boolean isSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
            }
            if (this.jsEngine != null) {
                return true;
            }
            return false;
        }

        private InstanceResult(JSEngine jSEngine, Exception exc) {
            this.jsEngine = jSEngine;
            this.exception = exc;
        }
    }

    public static /* synthetic */ boolean access$200(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a04487f3", new Object[]{context})).booleanValue();
        }
        return loadV8JsiIfNecessary(context);
    }

    public static /* synthetic */ boolean access$400(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0a507b1", new Object[]{context})).booleanValue();
        }
        return loadQjsJsiIfNecessary(context);
    }

    private static String getJsiSoPath(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dd834aa", new Object[]{context});
        }
        return context.getApplicationInfo().nativeLibraryDir + "/" + JSI_FILE_NAME;
    }

    public static InstanceBuilder instanceBuilder(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InstanceBuilder) ipChange.ipc$dispatch("35b4d79b", new Object[]{context});
        }
        return new InstanceBuilder(context);
    }

    public static boolean loadJsi(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59fcd9eb", new Object[]{context})).booleanValue();
        }
        boolean loadV8JsiIfNecessary = loadV8JsiIfNecessary(context);
        if (!loadV8JsiIfNecessary) {
            return loadQjsJsiIfNecessary(context);
        }
        return loadV8JsiIfNecessary;
    }

    private static boolean loadQjsJsiIfNecessary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881690bf", new Object[]{context})).booleanValue();
        }
        if (hasLoadQjsJsi) {
            return true;
        }
        synchronized (LOAD_LOCK) {
            try {
                if (hasLoadQjsJsi) {
                    return true;
                }
                return loadQjsJsi(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean loadV8JsiIfNecessary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21621ceb", new Object[]{context})).booleanValue();
        }
        if (hasLoadUCJsi) {
            return true;
        }
        synchronized (LOAD_LOCK) {
            try {
                if (hasLoadUCJsi) {
                    return true;
                }
                return loadV8Jsi(context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void tryFetchRemoteUC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e55a33a", new Object[0]);
        } else if (vpw.commonConfig.Q2) {
            WVUCRemoteFetcher.fetchUCRemote(null);
        } else if (TextUtils.isEmpty(WVUCRemoteFetcher.fetchUCRemoteLocal())) {
            WVUCRemoteFetcher.fetchUCRemote(null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class InstanceException extends RuntimeException {
        static {
            t2o.a(989855968);
        }

        private InstanceException(String str) {
            super(str);
        }

        private InstanceException(String str, Throwable th) {
            super(str, th);
        }

        public InstanceException(Throwable th) {
            super(th);
        }
    }

    private static boolean loadQjsJsi(Context context) {
        bhc bhcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a22fe3b9", new Object[]{context})).booleanValue();
        }
        if (vpw.commonConfig.n2 && (bhcVar = (bhc) jpw.c().a(bhc.class)) != null) {
            bhcVar.a(context);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_JSI_SO_PATH, getJsiSoPath(context));
        bundle.putString(KEY_JSI_ENGINE_TYPE, ENGINE_TYPE_QUICK_JS);
        try {
            if (JSEngine.loadSo(context, bundle)) {
                hasLoadQjsJsi = true;
                lcn.a(RVLLevel.Info, "WVJsi/LOAD").j("QJS_LOAD_SUCCESS").f();
            } else {
                lcn.a(RVLLevel.Error, "WVJsi/LOAD").j("QJS_LOAD_FAIL").f();
            }
            return hasLoadQjsJsi;
        } catch (Throwable th) {
            lcn.a(RVLLevel.Error, "WVJsi/LOAD").j("QJS_LOAD_FAIL").a("msg", Log.getStackTraceString(th)).f();
            return hasLoadQjsJsi;
        }
    }

    static {
        t2o.a(989855965);
        try {
            if (!UCLog.getInstance().isInited()) {
                UCLog.getInstance().init(true);
            }
        } catch (Throwable th) {
            v7t.e("WVJsi", "", th, new Object[0]);
        }
    }

    private static boolean loadV8Jsi(Context context) {
        boolean z;
        boolean z2;
        HashMap hashMap;
        String str;
        String str2;
        File dirCoreLib;
        bhc bhcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43223b0d", new Object[]{context})).booleanValue();
        }
        try {
            wpw wpwVar = vpw.commonConfig;
            if (wpwVar.n2 && (bhcVar = (bhc) jpw.c().a(bhc.class)) != null) {
                bhcVar.a(context);
            }
            String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
            if (TextUtils.isEmpty(fetchUCRemoteLocal)) {
                lcn.a(RVLLevel.Error, "WVJsi/LOAD").j("V8_LOAD_FAIL").a("msg", "kernel file, kernelPath is empty").f();
                tryFetchRemoteUC();
                return false;
            }
            File file = new File(fetchUCRemoteLocal);
            boolean isDirectory = file.isDirectory();
            HashMap hashMap2 = new HashMap();
            if (isDirectory) {
                hashMap2.put(JSILoader.EXTRA_PARAM_SPECIFIED_DIR, file.getAbsolutePath());
            }
            boolean z3 = wpwVar.h3;
            File file2 = null;
            if (z3) {
                z = hasLoadQjsJsi;
                file2 = null;
            } else {
                if (wpwVar.Y2) {
                    File extractDir = isDirectory ? file : U4Engine.getExtractDir(context, file);
                    if (!(extractDir == null || !extractDir.exists() || (dirCoreLib = PathUtils.getDirCoreLib(extractDir)) == null)) {
                        file2 = PathUtils.getFileJsiLib(dirCoreLib);
                    }
                } else {
                    file2 = new File(getJsiSoPath(context));
                }
                z = true;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            String str3 = "null";
            String str4 = "jsiSoFile";
            if (file.isFile()) {
                z2 = z3;
                hashMap = hashMap2;
                if (U4Engine.loadJsiSo(context, JSEngine.class.getClassLoader(), file2, file, z, null)) {
                    hasLoadUCJsi = true;
                    icn a2 = lcn.a(RVLLevel.Info, "WVJsi/LOAD").j("V8_LOAD_SUCCESS").a("isDir", Boolean.valueOf(isDirectory)).a("ignoreOldCore", Boolean.valueOf(z)).a("kernelPath", fetchUCRemoteLocal);
                    if (file2 != null) {
                        str3 = file2.getAbsolutePath();
                    }
                    a2.a(str4, str3).f();
                    lcn.a(RVLLevel.Info, "WVJsi/LOAD").j("V8_LOAD_COST").a("enableJSIReuseCore", Boolean.valueOf(z2)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).f();
                    return hasLoadUCJsi;
                }
                str = "V8_LOAD_SUCCESS";
                str2 = "kernelPath";
                str4 = str4;
            } else {
                z2 = z3;
                hashMap = hashMap2;
                str = "V8_LOAD_SUCCESS";
                str2 = "kernelPath";
            }
            if (!file.isDirectory() || !U4Engine.loadJsiSo(context, JSEngine.class.getClassLoader(), file2, null, false, hashMap)) {
                lcn.a(RVLLevel.Error, "WVJsi/LOAD").j("V8_LOAD_FAIL").a("isDir", Boolean.valueOf(isDirectory)).a("msg", "failed or use illegal kernelPath =" + fetchUCRemoteLocal).f();
                tryFetchRemoteUC();
            } else {
                hasLoadUCJsi = true;
                icn a3 = lcn.a(RVLLevel.Info, "WVJsi/LOAD").j(str).a("isDir", Boolean.valueOf(isDirectory)).a(str2, fetchUCRemoteLocal);
                if (file2 != null) {
                    str3 = file2.getAbsolutePath();
                }
                a3.a(str4, str3).f();
            }
            lcn.a(RVLLevel.Info, "WVJsi/LOAD").j("V8_LOAD_COST").a("enableJSIReuseCore", Boolean.valueOf(z2)).a("cost", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).f();
            return hasLoadUCJsi;
        } catch (Throwable th) {
            int errCode = th instanceof UCKnownException ? th.errCode() : -1;
            lcn.a(RVLLevel.Error, "WVJsi/LOAD").j("V8_LOAD_FAIL").a("msg", Log.getStackTraceString(th)).a("errorCode", Integer.valueOf(errCode)).f();
            v7t.e("WVJsi", "loadJsi fail:" + errCode, th, new Object[0]);
            tryFetchRemoteUC();
            return hasLoadUCJsi;
        }
    }
}
