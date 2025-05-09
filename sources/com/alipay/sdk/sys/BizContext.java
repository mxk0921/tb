package com.alipay.sdk.sys;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.sdk.app.statistic.StatisticManager;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.alipay.sdk.cons.GlobalConstants;
import com.alipay.sdk.util.LogUtils;
import com.alipay.sdk.util.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BizContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHARSET_UTF8 = "UTF-8";
    public static final String KEY_ACT_INFO = "act_info";
    public static final String KEY_AND_LITE = "ty";
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_AP_LINK_TOKEN = "ap_link_token";
    public static final String KEY_EXT_INFO = "extInfo";
    public static final String KEY_PACKAGE_NAME = "an";
    public static final String KEY_PACKAGE_VERSION = "av";
    public static final String KEY_SDK_VERSION = "sv";
    public static final String KEY_SETTING_FILTER = "setting";
    public static final String KEY_START_TIME = "sdk_start_time";
    public static final String PAIR_AND = "&";
    public static final String PAIR_BIZCONTEXT = "bizcontext=\"";
    public static final String PAIR_BIZCONTEXT_ENCODED = "bizcontext=";
    public static final String PAIR_CONNECTION = "\"&";
    public static final String PAIR_QUOTATION_MARK = "\"";

    /* renamed from: a  reason: collision with root package name */
    public final String f4536a;
    public final long apInvokeTimestamp;
    public final String apLinkToken;
    public final String b;
    public final Context c;
    public boolean d;
    public boolean e;
    public final ActivityInfo f;
    public final StatisticInfo g;
    public boolean h;
    public final String invokeTag;
    public final int processUid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class HolderForAct {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<UUID, BizContext> f4537a = new HashMap<>();
        public static final HashMap<String, BizContext> b = new HashMap<>();

        public static BizContext getFromIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BizContext) ipChange.ipc$dispatch("40c80607", new Object[]{intent});
            }
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra("i_uuid_b_c");
            if (serializableExtra instanceof UUID) {
                return f4537a.remove((UUID) serializableExtra);
            }
            return null;
        }

        public static BizContext getWithStringToken(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BizContext) ipChange.ipc$dispatch("e81b2444", new Object[]{str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return b.remove(str);
        }

        public static void putToIntent(BizContext bizContext, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c68dbe27", new Object[]{bizContext, intent});
            } else if (bizContext != null && intent != null) {
                UUID randomUUID = UUID.randomUUID();
                f4537a.put(randomUUID, bizContext);
                intent.putExtra("i_uuid_b_c", randomUUID);
            }
        }

        public static void putWithStringToken(BizContext bizContext, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6f98647", new Object[]{bizContext, str});
            } else if (bizContext != null && !TextUtils.isEmpty(str)) {
                b.put(str, bizContext);
            }
        }
    }

    public BizContext(Context context, String str, String str2) {
        this(context, str, str2, null);
    }

    public static String d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87942679", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(str2);
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && split[i].startsWith(str3)) {
                return split[i];
            }
        }
        return null;
    }

    public static String g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83e90094", new Object[]{str, str2});
        }
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            String md5Hash = Utils.md5Hash(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
            long currentTimeMillis = System.currentTimeMillis();
            return "EP1" + md5Hash + "_" + currentTimeMillis;
        } catch (Throwable unused) {
            return "-";
        }
    }

    public static HashMap<String, String> generateApInfo(BizContext bizContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2853ca1", new Object[]{bizContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (bizContext != null) {
            hashMap.put("sdk_ver", GlobalConstants.MSP_VERSION);
            hashMap.put("app_name", bizContext.b);
            hashMap.put("token", bizContext.apLinkToken);
            hashMap.put("call_type", bizContext.invokeTag);
            hashMap.put("ts_api_invoke", String.valueOf(bizContext.apInvokeTimestamp));
        }
        return hashMap;
    }

    public static BizContext getNull() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizContext) ipChange.ipc$dispatch("d6e07aeb", new Object[0]);
        }
        return null;
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df24bdc6", new Object[]{this, str});
        }
        try {
            String d = d(str, "&", "bizcontext=");
            if (TextUtils.isEmpty(d)) {
                str = str + "&" + f("bizcontext=", "");
            } else {
                int indexOf = str.indexOf(d);
                str = str.substring(0, indexOf) + e(d, "bizcontext=", "") + str.substring(indexOf + d.length());
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public final String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3642aea5", new Object[]{this, str});
        }
        try {
            String d = d(str, "\"&", "bizcontext=\"");
            if (TextUtils.isEmpty(d)) {
                return str + "&" + f("bizcontext=\"", "\"");
            }
            if (!d.endsWith("\"")) {
                d = d.concat("\"");
            }
            int indexOf = str.indexOf(d);
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + d.length());
            return substring + e(d, "bizcontext=\"", "\"") + substring2;
        } catch (Throwable unused) {
            return str;
        }
    }

    public final JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a722abf9", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ap_link_token", this.apLinkToken);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String f(String str, String str2) throws JSONException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3478cf9", new Object[]{this, str, str2});
        }
        String buildSimpleBizContext = buildSimpleBizContext("", "");
        return str + buildSimpleBizContext + str2;
    }

    public String format(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("706b5194", new Object[]{this, str, new Boolean(z)});
        }
        if (TextUtils.isEmpty(str) || str.startsWith("new_external_info==")) {
            return str;
        }
        this.h = z;
        if (!str.contains("\"&")) {
            return a(str);
        }
        return b(str);
    }

    public Context getAppContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7e19c4c3", new Object[]{this});
        }
        return this.c;
    }

    public StatisticInfo getStatisticInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticInfo) ipChange.ipc$dispatch("a01255e5", new Object[]{this});
        }
        return this.g;
    }

    public boolean isAPayEnActivityCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a073952a", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean isNeedPayFallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de2a35", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void setAPayEnActivityCreated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72f05ba6", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void setNeedPayFallback(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db1b1fb", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public BizContext(Context context, String str, String str2, StatisticInfo statisticInfo) {
        String str3;
        this.f4536a = "";
        this.b = "";
        this.c = null;
        this.d = false;
        this.e = false;
        boolean isEmpty = TextUtils.isEmpty(str2);
        this.g = statisticInfo;
        String g = g(str, "");
        this.apLinkToken = g;
        this.apInvokeTimestamp = SystemClock.elapsedRealtime();
        this.processUid = Utils.getProcessUid();
        ActivityInfo activityInfoForCtx = Utils.activityInfoForCtx(context);
        this.f = activityInfoForCtx;
        this.invokeTag = str2;
        if (!isEmpty) {
            StatisticManager.putAction(this, "biz", "eptyp", str2 + "|" + g);
            if (activityInfoForCtx != null) {
                str3 = activityInfoForCtx.name + "|" + activityInfoForCtx.launchMode;
            } else {
                str3 = "null";
            }
            StatisticManager.putAction(this, "biz", "actInfo", str3);
        }
        try {
            this.c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f4536a = packageInfo.versionName;
            this.b = packageInfo.packageName;
        } catch (Exception e) {
            LogUtils.printExceptionStackTrace(e);
        }
        if (!isEmpty) {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            StatisticManager.putAction(this, "biz", StatisticRecord.EC_PROGRESS_API_INVOKE, sb.toString());
        }
    }

    public String buildSimpleBizContext(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9d74469", new Object[]{this, str, str2});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.h) {
                jSONObject.put("useStandardSdk", true);
                jSONObject.put("logincheck", "need_login");
            }
            jSONObject.put("appkey", "2014052600006128");
            jSONObject.put("ty", "and_lite");
            jSONObject.put(KEY_SDK_VERSION, GlobalConstants.SDK_VERSION);
            if (!this.b.contains(KEY_SETTING_FILTER) || !Utils.isAlipayVersionBefore991(this.c)) {
                jSONObject.put("an", this.b);
            }
            jSONObject.put("av", this.f4536a);
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
            jSONObject.put("extInfo", c());
            if (this.f != null) {
                str3 = this.f.name + "|" + this.f.launchMode;
            } else {
                str3 = "null";
            }
            jSONObject.put(KEY_ACT_INFO, str3);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put(str, str2);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            LogUtils.printExceptionStackTrace(th);
            return "";
        }
    }

    public final String e(String str, String str2, String str3) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{this, str, str2, str3});
        }
        String substring = str.substring(str2.length());
        String substring2 = substring.substring(0, substring.length() - str3.length());
        if (substring2.length() < 2 || !substring2.startsWith("\"") || !substring2.endsWith("\"")) {
            jSONObject = new JSONObject(substring2);
        } else {
            jSONObject = new JSONObject(substring2.substring(1, substring2.length() - 1));
            z = true;
        }
        if (this.h) {
            jSONObject.put("useStandardSdk", true);
            jSONObject.put("logincheck", "need_login");
        }
        if (!jSONObject.has("appkey")) {
            jSONObject.put("appkey", "2014052600006128");
        }
        if (!jSONObject.has("ty")) {
            jSONObject.put("ty", "and_lite");
        }
        if (!jSONObject.has(KEY_SDK_VERSION)) {
            jSONObject.put(KEY_SDK_VERSION, GlobalConstants.SDK_VERSION);
        }
        if (!jSONObject.has("an") && (!this.b.contains(KEY_SETTING_FILTER) || !Utils.isAlipayVersionBefore991(this.c))) {
            jSONObject.put("an", this.b);
        }
        if (!jSONObject.has("av")) {
            jSONObject.put("av", this.f4536a);
        }
        if (!jSONObject.has("sdk_start_time")) {
            jSONObject.put("sdk_start_time", System.currentTimeMillis());
        }
        if (!jSONObject.has("extInfo")) {
            jSONObject.put("extInfo", c());
        }
        String jSONObject2 = jSONObject.toString();
        if (z) {
            jSONObject2 = "\"" + jSONObject2 + "\"";
        }
        return str2 + jSONObject2 + str3;
    }
}
