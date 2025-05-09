package com.taobao.android.rtqpixelstreamingandroid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.util.Base64;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.common.Constants;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.b79;
import tb.bzn;
import tb.fqw;
import tb.fsw;
import tb.jq0;
import tb.kpw;
import tb.l6h;
import tb.nsw;
import tb.obk;
import tb.t2o;
import tb.u5h;
import tb.vu3;
import tb.y69;
import tb.yaa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RTQPixelStreaming extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RTQPixelStreaming";
    private static boolean isRegisterRun = false;
    private static boolean isLibraryLoaded = false;
    private static boolean isLoadingLibrary = false;
    public static String xquicLibraryPath = "";
    public static boolean isLibraryLocal = false;
    private static boolean writeToTLog = false;
    private static boolean canUseMoq = false;
    private static boolean isWindvaneRegisterd = false;
    private static int fetchXQuicLibraryMaxFailedCount = 4;
    public static boolean showMoqDebugTip = false;
    private static boolean notUseOrange = false;
    public static boolean disableRememberControlMessage = false;
    public static boolean disableAckNewConfig = false;
    public static boolean enableSendFecStats = false;
    private static Application.ActivityLifecycleCallbacks activityLifeCycleMonitorObject = null;
    private static FragmentManager.FragmentLifecycleCallbacks fragmentLifecycleMonitorObject = null;
    private static boolean isActivityLifeCycleMonitorRegistered = false;
    private static boolean isFirstLoadActivity = true;
    private static boolean isMoqGameCanPreload = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                RTQPixelStreaming.access$000();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements y69 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements u5h {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // tb.u5h
            public void onLoadFinished(l6h l6hVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                    return;
                }
                if (l6hVar.i()) {
                    RTQPixelStreaming.info("RTQPixelStreaming  load rtqpixelstreamingandroid so success");
                    RTQPixelStreaming.access$102(true);
                } else {
                    RTQPixelStreaming.info("RTQPixelStreaming  load rtqpixelstreamingandroid so failed");
                    RTQPixelStreaming.access$210();
                }
                RTQPixelStreaming.access$302(false);
            }
        }

        @Override // tb.y69
        public void onFetchFinished(b79 b79Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4302726d", new Object[]{this, b79Var});
            } else if (b79Var.d() != null) {
                RTQPixelStreaming.xquicLibraryPath = b79Var.d();
                RTQPixelStreaming.info("RTQPixelStreaming  fetch xquic so success " + RTQPixelStreaming.xquicLibraryPath);
                bzn.d().a("rtqpixelstreamingandroid", new a(this));
            } else {
                RTQPixelStreaming.info("RTQPixelStreaming  fetch xquic so failed ");
                RTQPixelStreaming.access$210();
                RTQPixelStreaming.access$302(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            RTQPixelStreaming.info("RTQPixelStreaming onActivityCreated " + activity.getLocalClassName() + " urlstring: " + activity.getIntent().getDataString());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            if (activity.getLocalClassName().equals("com.tmall.wireless.mirrorlife.base.MirrorBaseActivity")) {
                PixelStreamingPreLoadService.j.e();
                RTQPixelStreaming.destroyActivityLifeCycleMonitor();
            }
            RTQPixelStreaming.info("RTQPixelStreaming onActivityDestroyed " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            if (activity instanceof FragmentActivity) {
                if (activity.getLocalClassName().equals("com.tmall.wireless.mirrorlife.webview.single.MirrorSingleWebViewActivity")) {
                    ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(RTQPixelStreaming.access$600(), true);
                } else if (activity.getLocalClassName().equals("com.tmall.wireless.mirrorlife.base.MirrorBaseActivity")) {
                    ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(RTQPixelStreaming.access$600(), true);
                }
            }
            RTQPixelStreaming.info("RTQPixelStreaming onActivityStarted " + activity.getLocalClassName());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Map f9318a;

            public a(Map map) {
                this.f9318a = map;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    RTQPixelStreaming.access$700(this.f9318a);
                }
            }
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("moq_pixel_streaming");
            if (configs != null && !configs.isEmpty()) {
                RTQPixelStreaming.info("RTQPixelStreaming on orange config update " + str + ": " + configs.toString());
                AsyncTask.execute(new a(configs));
            }
        }
    }

    static {
        t2o.a(316669966);
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            initializeWindvaneAndLibrary();
        }
    }

    public static /* synthetic */ boolean access$102(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
        }
        isLibraryLoaded = z;
        return z;
    }

    public static /* synthetic */ int access$210() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2857568b", new Object[0])).intValue();
        }
        int i = fetchXQuicLibraryMaxFailedCount;
        fetchXQuicLibraryMaxFailedCount = i - 1;
        return i;
    }

    public static /* synthetic */ boolean access$302(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        isLoadingLibrary = z;
        return z;
    }

    public static /* synthetic */ boolean access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("906ef47f", new Object[0])).booleanValue();
        }
        return isMoqSupported();
    }

    public static /* synthetic */ boolean access$500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5552fc0", new Object[0])).booleanValue();
        }
        return isMoqGameCanPreload;
    }

    public static /* synthetic */ FragmentManager.FragmentLifecycleCallbacks access$600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager.FragmentLifecycleCallbacks) ipChange.ipc$dispatch("8e2918c6", new Object[0]);
        }
        return fragmentLifecycleMonitorObject;
    }

    public static /* synthetic */ void access$700(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa433187", new Object[]{map});
        } else {
            onOrangeConfigChange(map);
        }
    }

    private static boolean checkDeviceBlackList(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920ddab4", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check black list: " + str);
            String deviceModel = getDeviceModel();
            String systemVersion = getSystemVersion();
            for (String str2 : str.split("#")) {
                String[] split2 = str2.split("@");
                if (split2.length == 2) {
                    String str3 = split2[0];
                    String str4 = split2[1];
                    if ((str3.equals("*") || deviceModel.matches(str3)) && (str4.equals("*") || systemVersion.matches(str4))) {
                        info("RTQPixelStreaming match black rule: " + str2);
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            warn("RTQPixelStreaming black list check exception: " + e.toString());
            return false;
        }
    }

    private static boolean checkIsDisableACKNewCondfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("420a838a", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check disable ack new config: " + str);
            if (Integer.parseInt(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkIsDisableRememberMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce73c739", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check disable remember message: " + str);
            if (Integer.parseInt(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkIsLibraryLocal(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("862b41f7", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check is library local: " + str);
            if (Integer.parseInt(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkIsMoqGameCanPreload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa89c8fd", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check moq can preload message: " + str);
            if (Integer.parseInt(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkMoqEnableRate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de55285f", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check moq enable rate: " + str);
            double parseDouble = Double.parseDouble(str);
            if (parseDouble <= vu3.b.GEO_NOT_SUPPORT) {
                return false;
            }
            if (parseDouble >= 1.0d) {
                return true;
            }
            if (Math.random() <= parseDouble) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean checkShowMoqDebugTip(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25435927", new Object[]{str})).booleanValue();
        }
        try {
            info("RTQPixelStreaming start check moq debug tip: " + str);
            if (Integer.parseInt(str) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void closeHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076ef00", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtq_session_id", "");
            if (optString.isEmpty() || !isLibraryLoaded) {
                wVCallBackContext.error("rtq_session_id parameter error");
            } else {
                PixelStreamingNativeLib.destroyStreaming(optString);
                nsw nswVar = new nsw();
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
            }
        } catch (JSONException e) {
            wVCallBackContext.error(e.toString());
        }
    }

    public static void destroyActivityLifeCycleMonitor() {
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f828600", new Object[0]);
            return;
        }
        Application application = yaa.n;
        if (application != null && (activityLifecycleCallbacks = activityLifeCycleMonitorObject) != null) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            isActivityLifeCycleMonitorRegistered = false;
        }
    }

    private static String getDeviceModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd868ddc", new Object[0]);
        }
        return Build.MODEL;
    }

    private void getStatsHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7042ca2f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtq_session_id", "");
            if (!isLibraryLoaded || optString.isEmpty()) {
                wVCallBackContext.error("rtq_session_id parameter error");
            } else {
                String stats = PixelStreamingNativeLib.getStats(optString);
                if (stats != null) {
                    JSONObject jSONObject2 = new JSONObject(stats);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject2);
                    jSONObject.put("stats", jSONArray);
                    nsw nswVar = new nsw();
                    nswVar.h(jSONObject);
                    wVCallBackContext.success(nswVar);
                } else {
                    wVCallBackContext.error("get null json result");
                }
            }
        } catch (JSONException e) {
            wVCallBackContext.error(e.toString());
        }
    }

    private static String getSystemVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2d238e6", new Object[0]);
        }
        return Build.VERSION.RELEASE;
    }

    public static void info(String str) {
        AliLogInterface c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9dfc8bf", new Object[]{str});
        } else if (writeToTLog && (c2 = jq0.c()) != null) {
            c2.logi(TAG, str);
        }
    }

    private static void initializeWindvaneAndLibrary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("143ad565", new Object[0]);
            return;
        }
        if (isMoqGameCanPreload) {
            setupActivityLifeCycleMonitor();
        }
        if (!isWindvaneRegisterd) {
            isWindvaneRegisterd = true;
            info("RTQPixelStreaming init windvane plugin");
            fsw.h(TAG, RTQPixelStreaming.class);
            fqw.g(TAG, RTQPixelStreamingEmbededView.class, false);
        }
        if (isLibraryLocal) {
            info("RTQPixelStreaming isLibraryLocal");
            xquicLibraryPath = "libxquic.so";
            if (!isLibraryLoaded) {
                System.loadLibrary("rtqpixelstreamingandroid");
            }
            isLibraryLoaded = true;
        } else if (isLibraryLoaded) {
            info("RTQPixelStreaming isLibraryLoaded");
        } else if (isLoadingLibrary) {
            info("RTQPixelStreaming isLoadingLibrary");
        } else if (fetchXQuicLibraryMaxFailedCount <= 0) {
            warn("RTQPixelStreaming fetchXQuicLibraryMaxFailedCount smaller than 0, so don't fetch xquic so");
        } else {
            isLoadingLibrary = true;
            info("RTQPixelStreaming begin fetch xquic so");
            bzn.b().b("xquic", new b());
        }
    }

    public static /* synthetic */ Object ipc$super(RTQPixelStreaming rTQPixelStreaming, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/rtqpixelstreamingandroid/RTQPixelStreaming");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isMoqSupported() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("711dc8b4", new Object[0])).booleanValue();
        }
        boolean z = canUseMoq;
        boolean z2 = z;
        if (z) {
            boolean z3 = isLibraryLoaded;
            z2 = z3;
            if (z3) {
                int supportHardwardDecode = PixelStreamingNativeLib.supportHardwardDecode();
                z2 = supportHardwardDecode;
                if (supportHardwardDecode != 0) {
                    z2 = supportHardwardDecode;
                    if (!WVCore.getInstance().isUCSupport()) {
                        z2 = false;
                    }
                }
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    private void isSupportedHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769803d4", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.a("supported", Boolean.valueOf(isMoqSupported()));
        wVCallBackContext.success(nswVar);
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else if (notUseOrange) {
            writeToTLog = false;
            canUseMoq = true;
            isLibraryLocal = true;
            xquicLibraryPath = "libxquic.so";
            isLibraryLoaded = true;
            showMoqDebugTip = true;
            fsw.h(TAG, RTQPixelStreaming.class);
            fqw.g(TAG, RTQPixelStreamingEmbededView.class, false);
        } else if (!isRegisterRun) {
            isRegisterRun = true;
            writeToTLog = true;
            String deviceModel = getDeviceModel();
            String systemVersion = getSystemVersion();
            info("RTQPixelStreaming register model: " + deviceModel + ", system version: " + systemVersion);
            info("RTQPixelStreaming register moq_pixel_streaming orange config");
            OrangeConfig.getInstance().registerListener(new String[]{"moq_pixel_streaming"}, new d(), true);
        } else if (canUseMoq) {
            initializeWindvaneAndLibrary();
        }
    }

    public static void registerWindvaneForLocalDev() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef1fd26d", new Object[0]);
            return;
        }
        writeToTLog = false;
        canUseMoq = true;
        isLibraryLocal = true;
        xquicLibraryPath = "libxquic.so";
        isLibraryLoaded = true;
        showMoqDebugTip = true;
        fsw.h(TAG, RTQPixelStreaming.class);
        fqw.g(TAG, RTQPixelStreamingEmbededView.class, false);
    }

    private void requestKeyFrameHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920c499b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtq_session_id", "");
            if (!isLibraryLoaded || optString.isEmpty()) {
                wVCallBackContext.error("rtq_session_id parameter error");
            } else {
                PixelStreamingNativeLib.requestVideoKeyframe(optString);
                nsw nswVar = new nsw();
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
            }
        } catch (JSONException e) {
            wVCallBackContext.error(e.toString());
        }
    }

    public static void setupActivityLifeCycleMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848a0e03", new Object[0]);
            return;
        }
        info("RTQPixelStreaming setupActivityLifeCycleMonitor");
        if (activityLifeCycleMonitorObject == null) {
            fragmentLifecycleMonitorObject = new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.taobao.android.rtqpixelstreamingandroid.RTQPixelStreaming.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r5, String str, Object... objArr) {
                    switch (str.hashCode()) {
                        case -2028521039:
                            super.onFragmentCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                            return null;
                        case -1819213449:
                            super.onFragmentViewDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -1791925260:
                            super.onFragmentResumed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -1704408514:
                            super.onFragmentStopped((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -938247425:
                            super.onFragmentPaused((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -701661701:
                            super.onFragmentDetached((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -588941558:
                            super.onFragmentViewCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (View) objArr[2], (Bundle) objArr[3]);
                            return null;
                        case -378518774:
                            super.onFragmentStarted((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case -228225358:
                            super.onFragmentDestroyed((FragmentManager) objArr[0], (Fragment) objArr[1]);
                            return null;
                        case 734979916:
                            super.onFragmentPreCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                            return null;
                        case 1276074722:
                            super.onFragmentActivityCreated((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                            return null;
                        case 1295531464:
                            super.onFragmentSaveInstanceState((FragmentManager) objArr[0], (Fragment) objArr[1], (Bundle) objArr[2]);
                            return null;
                        case 1773789023:
                            super.onFragmentAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                            return null;
                        case 1774959972:
                            super.onFragmentPreAttached((FragmentManager) objArr[0], (Fragment) objArr[1], (Context) objArr[2]);
                            return null;
                        default:
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/rtqpixelstreamingandroid/RTQPixelStreaming$3");
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c0f5ae2", new Object[]{this, fragmentManager, fragment, bundle});
                        return;
                    }
                    super.onFragmentActivityCreated(fragmentManager, fragment, bundle);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentActivityCreated ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69b9df5f", new Object[]{this, fragmentManager, fragment, context});
                        return;
                    }
                    super.onFragmentAttached(fragmentManager, fragment, context);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentAttached ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
                        return;
                    }
                    super.onFragmentCreated(fragmentManager, fragment, bundle);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentCreated ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentDestroyed(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentDestroyed ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d62d7dfb", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentDetached(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentDetached ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentPaused(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentPaused ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
                        return;
                    }
                    super.onFragmentPreAttached(fragmentManager, fragment, context);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentPreAttached ".concat(fragment.getClass().getName()));
                    if (fragment.getClass().getName().equals("com.tmall.wireless.mirrorlife.webview.MirrorSingleWebViewFragment") && RTQPixelStreaming.access$400() && RTQPixelStreaming.access$500()) {
                        String string = fragment.getArguments().getString("targetEncodeUrl");
                        RTQPixelStreaming.info("RTQPixelStreaming url: " + string);
                        PixelStreamingPreLoadService pixelStreamingPreLoadService = PixelStreamingPreLoadService.j;
                        pixelStreamingPreLoadService.l();
                        if (string != null && string.contains("DressUp")) {
                            pixelStreamingPreLoadService.i("dh_dressup");
                        } else if (string != null && string.contains("Mine")) {
                            pixelStreamingPreLoadService.i("dh_center");
                        }
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2bcee74c", new Object[]{this, fragmentManager, fragment, bundle});
                        return;
                    }
                    super.onFragmentPreCreated(fragmentManager, fragment, bundle);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentPreCreated ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentResumed(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentResumed ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4d383dc8", new Object[]{this, fragmentManager, fragment, bundle});
                    } else {
                        super.onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
                    }
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentStarted(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentStarted ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentStopped(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentStopped ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
                        return;
                    }
                    super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentViewCreated ".concat(fragment.getClass().getName()));
                }

                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
                        return;
                    }
                    super.onFragmentViewDestroyed(fragmentManager, fragment);
                    RTQPixelStreaming.info("RTQPixelStreaming onFragmentViewDestroyed ".concat(fragment.getClass().getName()));
                }
            };
            activityLifeCycleMonitorObject = new c();
        }
        Application application = yaa.n;
        if (application != null && !isActivityLifeCycleMonitorRegistered) {
            application.registerActivityLifecycleCallbacks(activityLifeCycleMonitorObject);
            isActivityLifeCycleMonitorRegistered = true;
        }
    }

    private void startStatsHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56f30e3b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtq_session_id", "");
            double optDouble = jSONObject.optDouble(Constants.Name.INTERVAL, 1000.0d);
            if (optDouble <= 1000.0d) {
                optDouble = 1000.0d;
            }
            if (!isLibraryLoaded || optString.isEmpty()) {
                wVCallBackContext.error("rtq_session_id parameter error");
            } else if (PixelStreamingNativeLib.startMetrics(optString, optDouble / 1000.0d)) {
                nsw nswVar = new nsw();
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
            } else {
                wVCallBackContext.error("start stats error, please check parameters");
            }
        } catch (JSONException e) {
            wVCallBackContext.error(e.toString());
        }
    }

    public static void warn(String str) {
        AliLogInterface c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32f8497", new Object[]{str});
        } else if (writeToTLog && (c2 = jq0.c()) != null) {
            c2.logw(TAG, str);
        }
    }

    private void startHandler(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ee0b9d6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtq_session_id", str2);
            String optString2 = jSONObject.optString("rtq_conn_str", str2);
            JSONObject optJSONObject = jSONObject.optJSONObject("rtq_conn_ext_params");
            boolean optBoolean = jSONObject.optBoolean("rtq_disable_audio_receive", false);
            if (optString.isEmpty() || optString2.isEmpty() || !isLibraryLoaded) {
                wVCallBackContext.error("rtq_session_id or rtq_conn_str parameter error");
                return;
            }
            if (optJSONObject != null) {
                str2 = optJSONObject.toString();
            }
            if (PixelStreamingNativeLib.startTransport(optString, optString2, str2, optBoolean, disableRememberControlMessage, enableSendFecStats, disableAckNewConfig)) {
                nsw nswVar = new nsw();
                nswVar.h(jSONObject);
                wVCallBackContext.success(nswVar);
                return;
            }
            wVCallBackContext.error("start transport error, please check parameters");
        } catch (JSONException e) {
            wVCallBackContext.error(e.toString());
        }
    }

    private static void onOrangeConfigChange(Map<String, String> map) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c8e9f", new Object[]{map});
            return;
        }
        String str = map.get("moq_enable_rate");
        String str2 = "false";
        if (str != null) {
            z = checkMoqEnableRate(str);
            info("RTQPixelStreaming checkMoqEnableRate result ".concat(z ? "true" : str2));
        } else {
            warn("RTQPixelStreaming moq_enable_rate config is null");
            z = false;
        }
        if (z) {
            String str3 = map.get("black_device_list");
            if (str3 != null) {
                boolean checkDeviceBlackList = checkDeviceBlackList(str3);
                z = true ^ checkDeviceBlackList;
                info("RTQPixelStreaming checkDeviceBlackList result ".concat(!checkDeviceBlackList ? "true" : str2));
            } else {
                info("RTQPixelStreaming black_list_str is null");
            }
        }
        canUseMoq = z;
        if (z) {
            str2 = "true";
        }
        info("RTQPixelStreaming canUseMoq ".concat(str2));
        if (canUseMoq) {
            showMoqDebugTip = checkShowMoqDebugTip(map.get("moq_enable_debug_tip"));
            isLibraryLocal = checkIsLibraryLocal(map.get("moq_is_library_local"));
            disableRememberControlMessage = checkIsDisableRememberMessage(map.get("moq_disable_remember_control_message"));
            disableAckNewConfig = checkIsDisableACKNewCondfig(map.get("moq_disable_ack_new_config"));
            String str4 = map.get("moq_preload_rate");
            if (str4 != null) {
                isMoqGameCanPreload = checkMoqEnableRate(str4);
            } else {
                isMoqGameCanPreload = false;
            }
            String str5 = map.get("moq_fec_stats_rate");
            if (str5 != null) {
                enableSendFecStats = checkMoqEnableRate(str5);
            } else {
                enableSendFecStats = false;
            }
            if (isMoqGameCanPreload) {
                info("RTQPixelStreaming isMoqGameCanPreload is true");
            } else {
                info("RTQPixelStreaming isMoqGameCanPreload is false");
            }
            new Handler(Looper.getMainLooper()).post(new a());
        }
    }

    private void sendHandler(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67acf70", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("rtq_session_id", "");
            String optString2 = jSONObject.optString("data", "");
            int optInt = jSONObject.optInt("message_type", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("json");
            if (!isLibraryLoaded || optString.isEmpty() || !optString2.startsWith("data:base64-")) {
                if (!isLibraryLoaded || optString.isEmpty() || optInt <= 0 || optJSONObject == null) {
                    wVCallBackContext.error("rtq_session_id or data parameter error");
                } else {
                    byte[] bytes = optJSONObject.toString().getBytes();
                    byte[] bArr = new byte[bytes.length + 1];
                    bArr[0] = (byte) optInt;
                    System.arraycopy(bytes, 0, bArr, 1, bytes.length);
                    if (PixelStreamingNativeLib.sendTransportData(optString, bArr)) {
                        nsw nswVar = new nsw();
                        nswVar.b("rtq_session_id", optString);
                        wVCallBackContext.success(nswVar);
                    } else {
                        wVCallBackContext.error("send data error, please check parameters");
                    }
                }
            } else if (PixelStreamingNativeLib.sendTransportData(optString, Base64.decode(optString2.substring(12), 0))) {
                nsw nswVar2 = new nsw();
                nswVar2.b("rtq_session_id", optString);
                wVCallBackContext.success(nswVar2);
            } else {
                wVCallBackContext.error("send data error, please check parameters");
            }
        } catch (JSONException e) {
            wVCallBackContext.error(e.toString());
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("RTQPixelStreaming execute: ");
        sb.append(str);
        sb.append(", params: ");
        sb.append(str2);
        if ("isSupported".equals(str)) {
            isSupportedHandler(str2, wVCallBackContext);
            return true;
        } else if ("start".equals(str)) {
            startHandler(str2, wVCallBackContext);
            return true;
        } else if ("close".equals(str)) {
            closeHandler(str2, wVCallBackContext);
            return true;
        } else if ("send".equals(str)) {
            sendHandler(str2, wVCallBackContext);
            return true;
        } else if ("start_stats".equals(str)) {
            startStatsHandler(str2, wVCallBackContext);
            return true;
        } else if ("getStats".equals(str)) {
            getStatsHandler(str2, wVCallBackContext);
            return true;
        } else if (!"requestKeyFrame".equals(str)) {
            return false;
        } else {
            requestKeyFrameHandler(str2, wVCallBackContext);
            return true;
        }
    }
}
