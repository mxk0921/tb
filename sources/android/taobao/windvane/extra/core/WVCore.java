package android.taobao.windvane.extra.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.taobao.windvane.extra.uc.UCCoreStartup;
import android.taobao.windvane.extra.uc.WVCoreSettings;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.remotefetch.WVUCRemoteFetcher;
import android.taobao.windvane.file.NotEnoughSpace;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.U4Engine;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.sb9;
import tb.t2o;
import tb.v7t;
import tb.vc9;
import tb.vpw;
import tb.wpw;
import tb.x74;
import tb.yaa;
import tb.yt4;
import tb.zt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WVCore";
    private static WVCore instance;
    private int usedWebMulti = 0;
    private int usedGpuMulti = 0;
    private final AtomicBoolean isUcStartInit = new AtomicBoolean(false);
    private boolean isUCSDKSupport = false;

    static {
        t2o.a(989855934);
    }

    private boolean checkRemoteIsolateOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71c2a52", new Object[]{this})).booleanValue();
        }
        wpw wpwVar = vpw.commonConfig;
        List asList = Arrays.asList(wpwVar.v);
        List asList2 = Arrays.asList(wpwVar.w);
        List asList3 = Arrays.asList(wpwVar.u);
        if (asList.contains(Build.BRAND) || asList2.contains(Build.MODEL) || asList3.contains(Build.VERSION.RELEASE)) {
            return false;
        }
        return true;
    }

    public static WVCore getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCore) ipChange.ipc$dispatch("66f31fd8", new Object[0]);
        }
        if (instance == null) {
            synchronized (WVCore.class) {
                try {
                    if (instance == null) {
                        instance = new WVCore();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public boolean extractWebCoreLibrary(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("761e46bc", new Object[]{this, context})).booleanValue();
        }
        try {
            if (!x74.l(context)) {
                return false;
            }
            U4Engine.createExtractor().setContext(context.getApplicationContext()).setCompressedFile(new File(UCCoreStartup.ucCore7ZFilePath(context))).setASync(false).start();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public int getUsedGpuMulti() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("801599ba", new Object[]{this})).intValue();
        }
        return this.usedGpuMulti;
    }

    public int getUsedWebMulti() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73e8dc12", new Object[]{this})).intValue();
        }
        return this.usedWebMulti;
    }

    public void initUCCore(Context context, zt4 zt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e9b91b7", new Object[]{this, context, zt4Var});
        } else {
            initUCCore(context, null, null, zt4Var);
        }
    }

    public void initUCCore2(Context context, yt4 yt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad91342f", new Object[]{this, context, yt4Var});
            return;
        }
        if (context instanceof Application) {
            yaa.n = (Application) context;
        } else {
            yaa.n = (Application) context.getApplicationContext();
        }
        if (!getInstance().isUCSupport()) {
            WVCoreSettings.getInstance().setCoreEventCallback2(yt4Var);
            WVUCWebView.initUCCore(yt4Var);
        } else if (yt4Var != null) {
            yt4Var.onUCCorePrepared();
        }
    }

    public boolean isUCStartInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4397dc5", new Object[]{this})).booleanValue();
        }
        return this.isUcStartInit.get();
    }

    public boolean isUCSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b9ec482", new Object[]{this})).booleanValue();
        }
        if (!this.isUCSDKSupport || WebView.getCoreType() != 3) {
            return false;
        }
        return true;
    }

    public void setUCStartInit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84e32c6b", new Object[]{this, new Boolean(z)});
        } else {
            this.isUcStartInit.set(z);
        }
    }

    public void setUCSupport(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d2b4e", new Object[]{this, new Boolean(z)});
        } else {
            this.isUCSDKSupport = z;
        }
    }

    public WVCore setUsedGpuMulti(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCore) ipChange.ipc$dispatch("f2ed27d6", new Object[]{this, new Integer(i)});
        }
        this.usedGpuMulti = i;
        return this;
    }

    public WVCore setUsedWebMulti(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCore) ipChange.ipc$dispatch("eda8de7e", new Object[]{this, new Integer(i)});
        }
        this.usedWebMulti = i;
        return this;
    }

    public void updateIsolatePolicy(Context context, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8d4247", new Object[]{this, context, new Boolean(z)});
            return;
        }
        File e = vc9.e(context, "UCPolicy");
        try {
            String str2 = e.getPath() + File.separator + "isolate";
            if (z) {
                str = "";
            } else {
                str = "false," + System.currentTimeMillis();
            }
            sb9.h(str2, ByteBuffer.wrap(str.getBytes()));
        } catch (NotEnoughSpace e2) {
            e2.printStackTrace();
        }
    }

    public String getV8SoPath() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1259f560", new Object[]{this});
        }
        Application application = yaa.n;
        File runningDir = U4Engine.getRunningDir(application, false);
        if (runningDir != null) {
            str = MiscUtils.KEY_RUNNING;
        } else if (innerSo(application)) {
            String ucCore7ZFilePath = UCCoreStartup.ucCore7ZFilePath(application);
            if (!TextUtils.isEmpty(ucCore7ZFilePath)) {
                runningDir = U4Engine.getExtractDir(application, new File(ucCore7ZFilePath));
            }
            str = "inner";
        } else if (!TextUtils.isEmpty(WVUCRemoteFetcher.fetchUCRemoteLocal())) {
            String fetchUCRemoteLocal = WVUCRemoteFetcher.fetchUCRemoteLocal();
            if (!TextUtils.isEmpty(fetchUCRemoteLocal)) {
                runningDir = U4Engine.getExtractDir(application, new File(fetchUCRemoteLocal));
            }
            str = "remoteso";
        } else {
            runningDir = U4Engine.getExtractDirByUrl(application, WVUCWebView.UC_CORE_URL);
            str = "download";
        }
        if (runningDir != null) {
            str2 = getUcSoPath(runningDir.getAbsolutePath());
        } else {
            str2 = "";
        }
        v7t.i(TAG, "get v8 path by " + str + ", path=[" + str2 + "]");
        return str2;
    }

    public void initUCCore(Context context, String[] strArr, String str, zt4 zt4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79928836", new Object[]{this, context, strArr, str, zt4Var});
            return;
        }
        if (context instanceof Application) {
            yaa.n = (Application) context;
        } else {
            yaa.n = (Application) context.getApplicationContext();
        }
        if (zt4Var != null) {
            WVCoreSettings.getInstance().setCoreEventCallback(zt4Var);
        }
        if (strArr != null) {
            yaa.f().q(strArr);
        }
        WVUCWebView.initUCCore();
    }

    private String getUcSoPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33ec4c4a", new Object[]{this, str});
        }
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return "";
        }
        for (File file : listFiles) {
            if (file.isDirectory()) {
                String ucSoPath = getUcSoPath(file.getPath());
                if (ucSoPath.endsWith("libwebviewuc.so")) {
                    return ucSoPath;
                }
            } else if (file.getName().endsWith("libwebviewuc.so")) {
                return file.getPath();
            }
        }
        return "";
    }

    public boolean innerSo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd581b13", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        return vpw.commonConfig.r == 0 && new File(UCCoreStartup.ucCore7ZFilePath(context)).exists();
    }

    public boolean isUCInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff9ac189", new Object[]{this})).booleanValue();
        }
        return vpw.commonConfig.r == 0;
    }

    public boolean checkIsolateIfOpen(Context context) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b5da3fb", new Object[]{this, context})).booleanValue();
        }
        boolean checkRemoteIsolateOpen = checkRemoteIsolateOpen();
        File e = vc9.e(context, "UCPolicy");
        byte[] f = sb9.f(e.getPath() + File.separator + "isolate");
        if (f != null) {
            try {
                str = new String(f, "utf-8");
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                if (split.length == 2) {
                    if (System.currentTimeMillis() - Long.valueOf(split[1]).longValue() > vpw.commonConfig.x) {
                        updateIsolatePolicy(context, true);
                    }
                    z = false;
                    v7t.d(TAG, "isolate policy: remote=[" + checkRemoteIsolateOpen + "], local=[" + z + "]");
                    return !checkRemoteIsolateOpen && z;
                }
            }
        }
        z = true;
        v7t.d(TAG, "isolate policy: remote=[" + checkRemoteIsolateOpen + "], local=[" + z + "]");
        if (!checkRemoteIsolateOpen) {
        }
    }
}
