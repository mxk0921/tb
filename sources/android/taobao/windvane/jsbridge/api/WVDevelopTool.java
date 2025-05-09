package android.taobao.windvane.jsbridge.api;

import android.taobao.windvane.config.WVConfigManager;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.monitor.WVLocPerformanceMonitor;
import android.taobao.windvane.webview.IWVWebView;
import android.taobao.windvane.webview.WVWebView;
import android.text.TextUtils;
import android.webkit.WebView;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import tb.ftw;
import tb.kpw;
import tb.nsw;
import tb.og8;
import tb.ssw;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.yaa;
import tb.yhs;
import tb.zrw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVDevelopTool extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVDevelopTool";
    public static Map<String, Object> sMockL2Info;
    private boolean mIsDebugOpen = false;
    private static int sUcDebugDownloadTaskId = -1;
    private static AtomicBoolean sUcRemoteDebugEnable = null;
    private static int mLastMode = 0;

    static {
        t2o.a(989856275);
    }

    public static Map<String, Object> getMockL2Info() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4201ab0", new Object[0]);
        }
        return sMockL2Info;
    }

    public static File getUCDebugDir() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("418839e8", new Object[0]);
        }
        File file = new File(yaa.n.getCacheDir(), "uc_debug");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String getUCRemoteDebugFilePath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48627faf", new Object[0]);
        }
        return readFileContent("uc_debug_path");
    }

    private static String getUCRemoteDebugStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc1b2f3d", new Object[0]);
        }
        return readFileContent("uc_debug_strategy");
    }

    public static /* synthetic */ Object ipc$super(WVDevelopTool wVDevelopTool, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/api/WVDevelopTool");
    }

    public static boolean isEnableUCRemoteDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db061b9d", new Object[0])).booleanValue();
        }
        if (sUcRemoteDebugEnable == null) {
            if (yaa.n == null) {
                sUcRemoteDebugEnable = new AtomicBoolean(false);
            } else {
                sUcRemoteDebugEnable = new AtomicBoolean(new File(getUCDebugDir(), "uc_debug_enable").exists());
            }
            if (sUcRemoteDebugEnable.get() && !RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(getUCRemoteDebugStrategy())) {
                setUCRemoteDebug(false);
            }
        }
        return sUcRemoteDebugEnable.get();
    }

    private void mockL2Info(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39b6f0c", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            HashMap hashMap = new HashMap();
            sMockL2Info = hashMap;
            hashMap.putAll(parseObject.getInnerMap());
            wVCallBackContext.onSuccess(new nsw());
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String readFileContent(java.lang.String r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.jsbridge.api.WVDevelopTool.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "ca780068"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            java.io.File r0 = new java.io.File
            java.io.File r1 = getUCDebugDir()
            r0.<init>(r1, r4)
            boolean r4 = r0.exists()
            r1 = 0
            if (r4 != 0) goto L_0x0026
            return r1
        L_0x0026:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: all -> 0x0044, IOException -> 0x0046, FileNotFoundException -> 0x0049
            java.io.FileReader r2 = new java.io.FileReader     // Catch: all -> 0x0044, IOException -> 0x0046, FileNotFoundException -> 0x0049
            r2.<init>(r0)     // Catch: all -> 0x0044, IOException -> 0x0046, FileNotFoundException -> 0x0049
            r4.<init>(r2)     // Catch: all -> 0x0044, IOException -> 0x0046, FileNotFoundException -> 0x0049
            java.lang.String r0 = r4.readLine()     // Catch: all -> 0x003d, IOException -> 0x0040, FileNotFoundException -> 0x0042
            r4.close()     // Catch: IOException -> 0x0038
            goto L_0x003c
        L_0x0038:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003c:
            return r0
        L_0x003d:
            r0 = move-exception
            r1 = r4
            goto L_0x0063
        L_0x0040:
            r0 = move-exception
            goto L_0x004c
        L_0x0042:
            r0 = move-exception
            goto L_0x005a
        L_0x0044:
            r0 = move-exception
            goto L_0x0063
        L_0x0046:
            r0 = move-exception
            r4 = r1
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            r4 = r1
            goto L_0x005a
        L_0x004c:
            r0.printStackTrace()     // Catch: all -> 0x003d
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch: IOException -> 0x0055
            goto L_0x0062
        L_0x0055:
            r4 = move-exception
            r4.printStackTrace()
            goto L_0x0062
        L_0x005a:
            r0.printStackTrace()     // Catch: all -> 0x003d
            if (r4 == 0) goto L_0x0062
            r4.close()     // Catch: IOException -> 0x0055
        L_0x0062:
            return r1
        L_0x0063:
            if (r1 == 0) goto L_0x006d
            r1.close()     // Catch: IOException -> 0x0069
            goto L_0x006d
        L_0x0069:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.jsbridge.api.WVDevelopTool.readFileContent(java.lang.String):java.lang.String");
    }

    private void readMemoryStatisitcs(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de2812fe", new Object[]{this, wVCallBackContext, str});
        } else {
            wVCallBackContext.success();
        }
    }

    private void resetConfig(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42fdb3f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        WVConfigManager.a().c();
        wVCallBackContext.success();
    }

    private void setDebugEnabled(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c0a1fe", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        try {
            wVCallBackContext.success();
        } catch (Throwable unused) {
            nswVar.b("error", "failed to setDebugEnabled");
            wVCallBackContext.error(nswVar);
        }
    }

    public static void setUCRemoteDebugFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a48a40f", new Object[]{str});
        } else {
            writeFileContent("uc_debug_path", str);
        }
    }

    public static void setUCRemoteDebugStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da5e641", new Object[]{str});
        } else {
            writeFileContent("uc_debug_strategy", str);
        }
    }

    private void timeoutTest(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be5e0e1", new Object[]{this, wVCallBackContext, str});
        }
    }

    private static void writeFileContent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ade19", new Object[]{str, str2});
            return;
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(getUCDebugDir(), str)));
            if (str2 == null) {
                str2 = "";
            }
            bufferedWriter.write(str2);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void clearWebViewFinishJs(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac2afb6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            zrw.c();
            wVCallBackContext.success();
        } catch (Throwable unused) {
            nswVar.b("error", "failed to enable clearWebViewFinishJs");
            wVCallBackContext.error(nswVar);
        }
    }

    public final void clearWindVaneCache(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0b49019", new Object[]{this, str, wVCallBackContext});
            return;
        }
        this.mWebView.clearCache();
        wVCallBackContext.success();
    }

    public void closeSpdyforDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772ee522", new Object[]{this, str, wVCallBackContext});
        } else {
            og8.g(false);
        }
    }

    public void getLocPerformanceData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f621de", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            nswVar.h(new org.json.JSONObject(WVLocPerformanceMonitor.getInstance().getMonitorData().toString()));
            wVCallBackContext.success(nswVar);
        } catch (Exception e) {
            wVCallBackContext.error(e.getMessage());
        }
    }

    public final void isUCEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989272f7", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        vpw.b();
        if (vpw.commonConfig.e) {
            nswVar.b("enabled", "false");
        } else {
            nswVar.b("enabled", "true");
        }
        wVCallBackContext.success(nswVar);
    }

    public final void setWebViewFinishJs(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbcb6341", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            zrw.d(new org.json.JSONObject(str).optString("js"));
            wVCallBackContext.success();
        } catch (JSONException unused) {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
        } catch (Throwable unused2) {
            nswVar.b("error", "failed to enable setWebViewFinishJs");
            wVCallBackContext.error(nswVar);
        }
    }

    public static void setUCRemoteDebug(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29387430", new Object[]{new Boolean(z)});
            return;
        }
        File file = new File(getUCDebugDir(), "uc_debug_enable");
        if (z) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                v7t.e(TAG, "set uc remote debug fail", e, new Object[0]);
            }
        } else if (file.exists()) {
            file.delete();
        }
    }

    private void updateConfig(WVCallBackContext wVCallBackContext, String str) {
        Map<String, String> configs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d9ef2b9", new Object[]{this, wVCallBackContext, str});
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            configs = OrangeConfig.getInstance().getConfigs("windvane_domain");
        } catch (JSONException e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
        if (!(configs == null || configs.size() == 0)) {
            for (Map.Entry<String, String> entry : configs.entrySet()) {
                String value = entry.getValue();
                if (!TextUtils.equals("aliDomain", entry.getKey()) && !TextUtils.equals("thirdPartyDomain", entry.getKey())) {
                    jSONObject.put(entry.getKey(), value);
                }
                value = yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
                jSONObject.put(entry.getKey(), value);
            }
            jSONObject.put("appVersion", yaa.f().b());
            WVConfigManager.a().d("windvane_domain", jSONObject.toString());
            v7t.i("WVConfig", "receive name=[windvane_domain]; config=[" + jSONObject.toString() + "]");
            ftw.f().w("AllowAllUrl", "{\"1\":{\"open\":\"allow\",\"api\":\"Group_All\",\"allowaccess\":\"false\"}}", "{\"Group_All\":[\"*\"]}", true);
            wVCallBackContext.success();
            return;
        }
        WVConfigManager.a().d("windvane_domain", "");
    }

    public void closeLocPerformanceMonitor(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea383820", new Object[]{this, str, wVCallBackContext});
        } else {
            WVLocPerformanceMonitor.setOpenLocPerformanceMonitor(false);
        }
    }

    public void openLocPerformanceMonitor(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7b2f58e", new Object[]{this, str, wVCallBackContext});
        } else {
            WVLocPerformanceMonitor.setOpenLocPerformanceMonitor(true);
        }
    }

    public void openSpdyforDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e75ab3f4", new Object[]{this, str, wVCallBackContext});
        } else {
            og8.g(true);
        }
    }

    public final void setWebViewDebugEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d8a573", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            boolean optBoolean = new org.json.JSONObject(str).optBoolean("enabled", false);
            IWVWebView iWVWebView = this.mWebView;
            if (iWVWebView instanceof WVWebView) {
                WVWebView wVWebView = (WVWebView) iWVWebView;
                WebView.setWebContentsDebuggingEnabled(optBoolean);
            }
            this.mIsDebugOpen = optBoolean;
            wVCallBackContext.success();
        } catch (Throwable unused) {
            nswVar.b("error", "failed to enable debugging");
            wVCallBackContext.error(nswVar);
        }
    }

    private void getURLContentType(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87cf89e8", new Object[]{this, wVCallBackContext, str});
            return;
        }
        nsw nswVar = new nsw();
        try {
            String optString = new org.json.JSONObject(str).optString("url", "");
            if (ssw.b(optString)) {
                nswVar.a("type", -1);
            } else if (ssw.j(optString)) {
                nswVar.a("type", 8);
            } else if (ssw.g(optString)) {
                nswVar.a("type", 2);
            } else {
                nswVar.a("type", 1);
            }
            wVCallBackContext.success(nswVar);
        } catch (JSONException unused) {
            wVCallBackContext.error(nsw.RET_PARAM_ERR);
        } catch (Throwable unused2) {
            nswVar.b("error", "failed to getURLContentType");
            wVCallBackContext.error(nswVar);
        }
    }

    private void reInitConfig(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46a0bd3", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String[] strArr = {"windvane_common", "windvane_domain", "WindVane_URL_config", WVConfigManager.CONFIGNAME_COOKIE, "windvane_uc_core"};
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(str2);
            if (configs == null || configs.size() == 0) {
                WVConfigManager.a().d(str2, "");
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                for (Map.Entry<String, String> entry : configs.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("appVersion", yaa.f().b());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                WVConfigManager.a().d(str2, jSONObject.toString());
            } catch (Throwable th) {
                v7t.d(TAG, "reInitConfig failed " + th);
                th.printStackTrace();
            }
        }
        wVCallBackContext.success();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("isDebugEnabled".equals(str)) {
            nsw nswVar = new nsw();
            nswVar.b("global", String.valueOf(og8.d()));
            wVCallBackContext.success(nswVar);
        } else if ("clearWindVaneCache".equals(str)) {
            clearWindVaneCache(str2, wVCallBackContext);
        } else if ("setWebViewDebugEnabled".equals(str)) {
            setWebViewDebugEnabled(str2, wVCallBackContext);
        } else if ("setWebViewFinishJs".equals(str)) {
            setWebViewFinishJs(str2, wVCallBackContext);
        } else if ("clearWebViewFinishJs".equals(str)) {
            clearWebViewFinishJs(str2, wVCallBackContext);
        } else if ("setUCEnabled".equals(str)) {
            setUCEnabled(str2, wVCallBackContext);
        } else if ("isUCEnabled".equals(str)) {
            isUCEnabled(str2, wVCallBackContext);
        } else if ("getLocPerformanceData".equals(str)) {
            getLocPerformanceData(str2, wVCallBackContext);
        } else if ("openSpdyforDebug".equals(str)) {
            openSpdyforDebug(str2, wVCallBackContext);
        } else if ("closeSpdyforDebug".equals(str)) {
            closeSpdyforDebug(str2, wVCallBackContext);
        } else if ("openLocPerformanceMonitor".equals(str)) {
            openLocPerformanceMonitor(str2, wVCallBackContext);
        } else if ("closeLocPerformanceMonitor".equals(str)) {
            closeLocPerformanceMonitor(str2, wVCallBackContext);
        } else if ("resetConfig".equals(str)) {
            resetConfig(wVCallBackContext, str2);
        } else if ("reInitConfig".equals(str)) {
            reInitConfig(wVCallBackContext, str2);
        } else if ("updateConfig".equals(str)) {
            updateConfig(wVCallBackContext, str2);
        } else if ("setDebugEnabled".equals(str)) {
            setDebugEnabled(wVCallBackContext, str2);
        } else if ("readMemoryStatisitcs".equals(str)) {
            readMemoryStatisitcs(wVCallBackContext, str2);
        } else if ("getURLContentType".equals(str)) {
            getURLContentType(wVCallBackContext, str2);
        } else if ("timeoutTest".equals(str)) {
            timeoutTest(wVCallBackContext, str2);
        } else if (!"mockL2Info".equals(str)) {
            return false;
        } else {
            mockL2Info(str2, wVCallBackContext);
        }
        return true;
    }

    public final void setUCEnabled(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485108bf", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            if (!new org.json.JSONObject(str).optBoolean("enable", false)) {
                vpw.b();
                vpw.commonConfig.e = true;
            } else {
                vpw.b();
                vpw.commonConfig.e = false;
            }
            wVCallBackContext.success();
        } catch (Exception unused) {
            wVCallBackContext.error();
        }
    }
}
