package tb;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mobsec.sglinkfilter.SGLinkFilter;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.bootstrap.tao.InstrumentationDelegate;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.ut.share.utils.Constants;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.wrg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class imo implements wrg.f, obk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NEW_INTENT_PV = "ngNewIntentPV";
    public static final String ORANGE_NAMESPACE = "next_launch_link_filter";

    /* renamed from: a  reason: collision with root package name */
    public Context f21436a;

    public static String b(Activity activity) {
        ComponentName componentName;
        ComponentName componentName2;
        Uri referrer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43643ac3", new Object[]{activity});
        }
        if (Build.VERSION.SDK_INT >= 22) {
            referrer = activity.getReferrer();
            if (referrer != null) {
                return referrer.getAuthority();
            }
            return null;
        }
        ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        try {
            for (ActivityManager.RunningTaskInfo runningTaskInfo : activityManager.getRunningTasks(2)) {
                componentName = runningTaskInfo.baseActivity;
                if (!TextUtils.equals(componentName.getPackageName(), activity.getPackageName())) {
                    componentName2 = runningTaskInfo.baseActivity;
                    return componentName2.getPackageName();
                }
            }
        } catch (SecurityException e) {
            TLog.loge(erj.MODULE, "SGLinkFilterAction", "obtain referrer error for sdk_int < android.os.Build.VERSION_CODES.LOLLIPOP_MR1", e);
        }
        return null;
    }

    public static void e(jmo jmoVar, String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46d3a435", new Object[]{jmoVar, str, str2, str3, new Long(j)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost", (Object) Long.valueOf(j));
            jSONObject.put("url", (Object) str);
            jSONObject.put(Constants.WEIBO_REDIRECTURL_KEY, (Object) jmoVar.b);
            jSONObject.put("referrer", (Object) str3);
            jSONObject.put("isBlack", (Object) Boolean.valueOf(jmoVar.f22082a));
            jSONObject.put("pageName", (Object) str2);
            AppMonitor.Counter.commit(erj.MODULE, "SGLinkFilterAction", jSONObject.toJSONString(), 1.0d);
        } catch (Throwable th) {
            TLog.loge(erj.MODULE, "SGLinkFilterAction", "error occurred when sending dp monitor", th);
        }
    }

    public static boolean c(Activity activity, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f708fe6", new Object[]{activity, intent})).booleanValue();
        }
        String scheme = intent.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        String string = activity.getApplication().getSharedPreferences(ORANGE_NAMESPACE, 0).getString("schemes", null);
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        List asList = Arrays.asList(string.split(","));
        if (!asList.contains(scheme)) {
            TLog.loge(erj.MODULE, "SGLinkFilterAction", "scheme " + scheme + " is not in list: " + asList);
            return false;
        }
        String dataString = intent.getDataString();
        String packageName = activity.getPackageName();
        String b = b(activity);
        if (!TextUtils.equals(packageName, b)) {
            return d(activity, dataString, b, intent);
        }
        return false;
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            return;
        }
        TLog.loge(erj.MODULE, "SGLinkFilterAction", "onConfigUpdate: " + str);
        Context context = this.f21436a;
        if (context == null) {
            TLog.loge(erj.MODULE, "SGLinkFilterAction", "error occurred when onConfigUpdate, context is null");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(ORANGE_NAMESPACE, 0);
        String string = sharedPreferences.getString("__configVersion__", null);
        String str2 = map.get("configVersion");
        if (TextUtils.equals(string, str2)) {
            TLog.loge(erj.MODULE, "SGLinkFilterAction", "version is not changed, discard it. local=" + string + ", remote=" + str2);
            return;
        }
        sharedPreferences.edit().putString("__configVersion__", str2).putString("schemes", OrangeConfig.getInstance().getConfig(ORANGE_NAMESPACE, "schemes", "")).putBoolean(KEY_NEW_INTENT_PV, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(ORANGE_NAMESPACE, KEY_NEW_INTENT_PV, ""))).commit();
    }

    @Override // tb.wrg.f
    public boolean a(Application application, b8l b8lVar, sgg sggVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b580de", new Object[]{this, application, b8lVar, sggVar, str})).booleanValue();
        }
        this.f21436a = application;
        boolean e = InstrumentationDelegate.e(sggVar, application);
        TLog.loge(erj.MODULE, "SGLinkFilterAction", "optimize result: " + e);
        this.f21436a.getSharedPreferences(ORANGE_NAMESPACE, 0);
        OrangeConfig.getInstance().registerListener(new String[]{ORANGE_NAMESPACE}, this, false);
        return true;
    }

    public static boolean d(Context context, String str, String str2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6105126a", new Object[]{context, str, str2, intent})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        jmo b = SGLinkFilter.b(str, str2, context);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        boolean z = b.f22082a;
        String str3 = b.b;
        e(b, str, context.getClass().getName(), str2, currentTimeMillis2);
        if (TextUtils.isEmpty(str3)) {
            return false;
        }
        TLog.loge(erj.MODULE, "SGLinkFilterAction", "SGLinkFilter.checkBlackMarketURL, uri: '" + str + "', result: is { isBlack=" + z + ", url=" + str3 + " }");
        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str3));
        intent2.setPackage(context.getPackageName());
        ComponentName resolveActivity = intent2.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return false;
        }
        intent2.setComponent(resolveActivity);
        TLog.loge(erj.MODULE, "SGLinkFilterAction", "resolved ComponentName, uri: '" + str + "', origin component: " + intent.getComponent() + ", new component: " + resolveActivity);
        int fillIn = intent.fillIn(intent2, 2);
        StringBuilder sb = new StringBuilder("filled in with resolved intent, result is 0x");
        sb.append(Integer.toHexString(fillIn));
        TLog.loge(erj.MODULE, "SGLinkFilterAction", sb.toString());
        return true;
    }
}
