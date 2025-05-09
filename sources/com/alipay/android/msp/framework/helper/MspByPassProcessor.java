package com.alipay.android.msp.framework.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.safepaylog.api.LogItem;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.helper.FileHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRenderImpl;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspByPassProcessor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_NEW_AUTH_INVOKE = "1010408";
    public static final String EVENT_NEW_AUTH_RESULT = "1010409";
    public static final MspByPassProcessor d = new MspByPassProcessor();

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f3621a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final FileHelper.GetFilterInputStream c = new FileHelper.GetFilterInputStream() { // from class: com.alipay.android.msp.framework.helper.MspByPassProcessor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.framework.helper.FileHelper.GetFilterInputStream
        public InputStream getFilter(InputStream inputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("346a9c1", new Object[]{this, inputStream});
            }
            return new GZIPInputStream(inputStream);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class ByPassTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private LogItem.TemplateUpdateScene b;

        /* renamed from: a  reason: collision with root package name */
        private long f3622a = -1;
        private String c = "scene";
        private String d = "none";
        private StatisticInfo e = new StatisticInfo(-1);

        public ByPassTask(LogItem.TemplateUpdateScene templateUpdateScene) {
            this.b = templateUpdateScene;
        }

        private static boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[0])).booleanValue();
            }
            Object obj = StatisticCollector.GLOBAL_AGENT;
            List errorList = StatisticCollector.getErrorList(obj);
            if (errorList != null && errorList.size() > 0) {
                return false;
            }
            List windowList = StatisticCollector.getWindowList(obj);
            if (windowList == null || windowList.size() <= 0) {
                return true;
            }
            return false;
        }

        private static String c(Context context) {
            String sofaGroupName;
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
            }
            if (GlobalConstant.DEBUG) {
                try {
                    if (!TextUtils.isEmpty(PhoneCashierMspEngine.getMspWallet().getSofaGroupName(context))) {
                        return "https://gw-office.alipayobjects.com/mobiletms/" + Uri.encode(sofaGroupName) + "/digest.json";
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey(DrmKey.CONFIG_TEMPLATE_UPDATE_BYPASS_URL_PREFIX);
            if (drmValueFromKey == null || !drmValueFromKey.containsKey("prefix")) {
                str = "gw.alipayobjects.com/os/mobiletms";
            } else {
                str = drmValueFromKey.getString("prefix");
            }
            String str3 = h1p.HTTPS_PREFIX + str + "/QUICKPAY/" + PluginManager.getRender().getEngineVersion() + "/digest.json";
            StringBuilder sb = new StringBuilder("CONFIG_TEMPLATE_UPDATE_BYPASS_URL_PREFIX: ");
            if (drmValueFromKey == null) {
                str2 = "null";
            } else {
                str2 = drmValueFromKey.toJSONString();
            }
            sb.append(str2);
            sb.append(", targetUrl: ");
            sb.append(str3);
            LogUtil.d("MspByPassProcessor", "getTemplateDigestUrl", sb.toString());
            return str3;
        }

        private String d(JSONObject jSONObject) throws NoSuchAlgorithmException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3716cedf", new Object[]{this, jSONObject});
            }
            ArrayList arrayList = new ArrayList(jSONObject.keySet());
            Collections.sort(arrayList, new Comparator<String>() { // from class: com.alipay.android.msp.framework.helper.MspByPassProcessor.ByPassTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public int compare(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : str.compareTo(str2);
                }
            });
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                instance.update(JSON.parseObject(jSONObject.getString((String) it.next())).getString("tplHash").getBytes(Charset.defaultCharset()));
            }
            return "sha1_" + Base64.encodeToString(instance.digest(), 2);
        }

        private boolean b(MspRenderImpl mspRenderImpl, JSONObject jSONObject) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a42defcc", new Object[]{this, mspRenderImpl, jSONObject})).booleanValue();
            }
            if (jSONObject == null || jSONObject.size() <= 0) {
                return true;
            }
            boolean z = true;
            for (String str : jSONObject.keySet()) {
                String string = jSONObject.getString(str);
                Template notifyTplUpdate = mspRenderImpl.notifyTplUpdate(str, string, true, this.b);
                try {
                    JSONObject parseObject = JSON.parseObject(string);
                    String string2 = parseObject.getString("time");
                    String string3 = parseObject.getString("tplVersion");
                    if (z && (string3.compareTo(notifyTplUpdate.tplVersion) > 0 || (TextUtils.equals(string3, notifyTplUpdate.tplVersion) && string2.compareTo(notifyTplUpdate.time) > 0))) {
                        z = false;
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace("MspByPassProcessor", "processTplUpdate", e);
                }
            }
            return z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String str = this.c + this.b.logValue;
                this.c = str;
                EventLogUtil.logPayEvent("1010387", "scene", str);
                if (!MspByPassProcessor.access$000(MspByPassProcessor.this).compareAndSet(false, true)) {
                    return;
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            try {
                this.f3622a = SystemClock.elapsedRealtime();
                e();
                try {
                    if (!a()) {
                        this.e.onStatisticEnd();
                    }
                    EventLogUtil.logPayEvent("1010389", "scene", this.c, HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - this.f3622a), TypedValues.CycleType.S_WAVE_PHASE, this.d);
                } catch (Throwable th2) {
                    LogUtil.printExceptionStackTrace(th2);
                }
                MspByPassProcessor.access$000(MspByPassProcessor.this).set(false);
            } catch (Throwable th3) {
                try {
                    LogUtil.printExceptionStackTrace(th3);
                    String message = th3.getMessage();
                    if (TextUtils.isEmpty(message)) {
                        message = th3.getClass().getName();
                    }
                    EventLogUtil.logPayEvent("1010393", "scene", this.c, "result_reason", message);
                    try {
                        if (!a()) {
                            this.e.onStatisticEnd();
                        }
                    } catch (Throwable th4) {
                        LogUtil.printExceptionStackTrace(th4);
                    }
                    MspByPassProcessor.access$000(MspByPassProcessor.this).set(false);
                } catch (Throwable th5) {
                    try {
                        if (!a()) {
                            this.e.onStatisticEnd();
                        }
                    } catch (Throwable th6) {
                        LogUtil.printExceptionStackTrace(th6);
                    }
                    MspByPassProcessor.access$000(MspByPassProcessor.this).set(false);
                    throw th5;
                }
            }
        }

        private void e() throws Throwable {
            String str;
            JSONObject jSONObject;
            String str2;
            int i = 0;
            int i2 = 1;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bffd376", new Object[]{this});
                return;
            }
            Context context = MspContextUtil.getContext();
            if (context != null) {
                if (MspByPassProcessor.access$100(MspByPassProcessor.this) == null) {
                    MspByPassProcessor.access$102(MspByPassProcessor.this, context.getSharedPreferences("alipay_msp_bypass_tpl_update", 0));
                }
                String str3 = null;
                FileResponse httpGet = FileHelper.httpGet(new URL(c(context)), null, MspByPassProcessor.access$200(MspByPassProcessor.this));
                if (httpGet.isSuccess()) {
                    EventLogUtil.logPayEvent("1010388", "scene", this.c);
                    JSONObject parseObject = JSON.parseObject(new String(httpGet.getRespBody(), "UTF-8"));
                    String string = parseObject.getString("c");
                    String string2 = parseObject.getString("s");
                    if (EncryptUtil.rsaVerify("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmGXVAHIyf0O+kvhDKUSM4uWNP3/Gig7DVD1dwbTFWwZz7HpYcMulZRxY3iYgPrMeZ/B2AfTeq21H7MqZ/PwjZbGhq1/noRSXfG+KPo4vlnkTAwBQ+mr3PpuPqqZz9D6SRhq5lzoSynLoUUfQVvYDgnUVTnnq3EyqC/B1DpwQMuesemtvS2HYqJfmPRskyt8y/LbHhXLyX4NrdhB33SAdLSLafTSGpATfbV+v/i6HT9P9HLsGLT2ydxItjxEFu6DJfoe+U8vguBJpp/ftjxBuOzW2sWBVycfrybba1PWtd9U0ZHhMauJJ+1mp69wFr6c/DNegLdcDqa3Af9tGFN146wIDAQAB", string.getBytes("UTF-8"), string2, "SHA256withRSA")) {
                        IRender render = PluginManager.getRender();
                        if (render instanceof MspRenderImpl) {
                            JSONObject parseObject2 = JSON.parseObject(string);
                            String str4 = "null";
                            if (parseObject2.containsKey("orderList")) {
                                JSONArray jSONArray = parseObject2.getJSONArray("orderList");
                                try {
                                    String string3 = MspByPassProcessor.access$100(MspByPassProcessor.this).getString("app_version_name", "0.0.0.0");
                                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                                    if (!string3.equals(packageInfo.versionName)) {
                                        MspByPassProcessor.access$100(MspByPassProcessor.this).edit().clear().putString("app_version_name", packageInfo.versionName).commit();
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    LogUtil.printExceptionStackTrace("MspByPassProcessor", "checkBypassRecordExpired", e);
                                }
                                while (true) {
                                    if (i >= jSONArray.size()) {
                                        str = null;
                                        jSONObject = null;
                                        str2 = null;
                                        break;
                                    }
                                    str = jSONArray.getString(i);
                                    JSONObject jSONObject2 = parseObject2.getJSONObject(str);
                                    if (jSONObject2 != null && jSONObject2.size() > 0) {
                                        str2 = d(jSONObject2);
                                        String string4 = MspByPassProcessor.access$100(MspByPassProcessor.this).getString(str, str3);
                                        LogUtil.d("MspByPassProcessor", "process", "group hash check, currentHash=" + str2 + ", groupHash=" + string4 + ", groupName=" + str);
                                        if (!TextUtils.equals(str2, string4)) {
                                            jSONObject = jSONObject2;
                                            break;
                                        }
                                        i2 = 1;
                                    }
                                    i += i2;
                                    str3 = null;
                                }
                                StringBuilder sb = new StringBuilder("tplInfo: ");
                                if (jSONObject != null) {
                                    str4 = jSONObject.toJSONString();
                                }
                                sb.append(str4);
                                sb.append(", resInfo: null");
                                LogUtil.d("MspByPassProcessor", "process", sb.toString());
                                if (jSONObject != null && jSONObject.size() > 0) {
                                    if (b((MspRenderImpl) render, jSONObject)) {
                                        MspByPassProcessor.access$100(MspByPassProcessor.this).edit().putString(str, str2).commit();
                                    }
                                    this.d = str;
                                    return;
                                }
                                return;
                            }
                            JSONObject jSONObject3 = parseObject2.getJSONObject("tplInfos");
                            StringBuilder sb2 = new StringBuilder("tplInfo: ");
                            if (jSONObject3 != null) {
                                str4 = jSONObject3.toJSONString();
                            }
                            sb2.append(str4);
                            sb2.append(", resInfo: null");
                            LogUtil.d("MspByPassProcessor", "process", sb2.toString());
                            b((MspRenderImpl) render, jSONObject3);
                            return;
                        }
                        LogUtil.e("MspByPassProcessor", "process", "render is ".concat(String.valueOf(render)));
                        return;
                    }
                    EventLogUtil.logPayEvent("1010390", "scene", this.c);
                    LogUtil.record(8, "MspByPassProcessor", "content: " + string + ", sign: " + string2);
                    throw new RuntimeException("SignVerifyFailed");
                }
                LogUtil.d("MspByPassProcessor", "process", "httpNotSucc: " + httpGet.getRespCode());
                throw new RuntimeException("httpCode:" + httpGet.getRespCode());
            }
            throw new RuntimeException("ContextNull");
        }
    }

    public static /* synthetic */ AtomicBoolean access$000(MspByPassProcessor mspByPassProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("7b3129b2", new Object[]{mspByPassProcessor});
        }
        return mspByPassProcessor.b;
    }

    public static /* synthetic */ SharedPreferences access$100(MspByPassProcessor mspByPassProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("eae342c7", new Object[]{mspByPassProcessor});
        }
        return mspByPassProcessor.f3621a;
    }

    public static /* synthetic */ SharedPreferences access$102(MspByPassProcessor mspByPassProcessor, SharedPreferences sharedPreferences) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("bb3c2923", new Object[]{mspByPassProcessor, sharedPreferences});
        }
        mspByPassProcessor.f3621a = sharedPreferences;
        return sharedPreferences;
    }

    public static /* synthetic */ FileHelper.GetFilterInputStream access$200(MspByPassProcessor mspByPassProcessor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileHelper.GetFilterInputStream) ipChange.ipc$dispatch("f5bcf9c3", new Object[]{mspByPassProcessor});
        }
        return mspByPassProcessor.c;
    }

    public static final MspByPassProcessor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspByPassProcessor) ipChange.ipc$dispatch("cd458aff", new Object[0]);
        }
        return d;
    }

    public boolean isProcessing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b24779e8", new Object[]{this})).booleanValue();
        }
        return this.b.get();
    }

    public void triggerByPassProcess(LogItem.TemplateUpdateScene templateUpdateScene) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd12a485", new Object[]{this, templateUpdateScene});
        } else {
            TaskHelper.execute(new ByPassTask(templateUpdateScene));
        }
    }

    public static boolean isUpdateSceneEnabled(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c3de3dd", new Object[]{str})).booleanValue();
        }
        JSONObject jsonConfig = FastStartActivityHelper.getJsonConfig(PhoneCashierMspEngine.getMspBase().getContext(), DrmKey.CONFIG_TEMPLATE_UPDATE_BYPASS_SCENE);
        if (jsonConfig == null) {
            return false;
        }
        try {
            return Boolean.TRUE.equals(jsonConfig.getBoolean(str));
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace("MspByPassProcessor", "isUpdateSceneEnabled", e);
            return false;
        }
    }
}
