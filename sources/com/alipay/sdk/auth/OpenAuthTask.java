package com.alipay.sdk.auth;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.security.realidentity.g4;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.sdk.m.e.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import tb.slo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class OpenAuthTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int Duplex = 5000;
    public static final int ERROR_RESULT_BIZ = 3001;
    public static final int ERROR_RESULT_EXC = 3002;
    public static final int NOT_INSTALLED = 4001;
    public static final int OK = 9000;
    public static final int SYS_ERR = 4000;
    public static final Map<String, Callback> e = new ConcurrentHashMap();
    public static long f = -1;
    public final Activity b;
    public Callback c;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f4509a = false;
    public final Handler d = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum BizType {
        Invoice("20000920"),
        AccountAuth("20000067"),
        Deduct("60000157");
        
        private final String appId;

        BizType(String str) {
            this.appId = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface Callback {
        void onResult(int i, String str, Bundle bundle);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4510a;

        static {
            int[] iArr = new int[BizType.values().length];
            f4510a = iArr;
            try {
                iArr[BizType.Deduct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4510a[BizType.AccountAuth.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4510a[BizType.Invoice.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f4511a;
        public final String b;
        public final Bundle c;

        public /* synthetic */ b(OpenAuthTask openAuthTask, int i, String str, Bundle bundle, a aVar) {
            this(i, str, bundle);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (OpenAuthTask.a(OpenAuthTask.this) != null) {
                OpenAuthTask.a(OpenAuthTask.this).onResult(this.f4511a, this.b, this.c);
            }
        }

        private b(int i, String str, Bundle bundle) {
            this.f4511a = i;
            this.b = str;
            this.c = bundle;
        }
    }

    public OpenAuthTask(Activity activity) {
        this.b = activity;
    }

    public static /* synthetic */ Callback a(OpenAuthTask openAuthTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Callback) ipChange.ipc$dispatch("fe18469f", new Object[]{openAuthTask});
        }
        return openAuthTask.c;
    }

    public static void returnResult(String str, int i, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bebef65", new Object[]{str, new Integer(i), str2, bundle});
            return;
        }
        Callback callback = (Callback) ((ConcurrentHashMap) e).remove(str);
        if (callback != null) {
            try {
                callback.onResult(i, str2, bundle);
            } catch (Throwable unused) {
            }
        }
    }

    public void execute(String str, BizType bizType, Map<String, String> map, Callback callback, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290856d5", new Object[]{this, str, bizType, map, callback, new Boolean(z)});
            return;
        }
        com.alipay.sdk.m.d.a aVar = new com.alipay.sdk.m.d.a();
        this.c = callback;
        d(aVar, str, bizType, map, z);
    }

    public boolean isAliPaySupportOpenAuth() {
        PackageInfo packageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21bdb78", new Object[]{this})).booleanValue();
        }
        try {
            com.alipay.sdk.m.d.a aVar = new com.alipay.sdk.m.d.a();
            com.alipay.sdk.m.e.b a2 = e.a(aVar, this.b, com.alipay.sdk.m.c.a.g);
            if (a2 != null && !a2.a(aVar) && !a2.a() && (packageInfo = a2.f4525a) != null) {
                if (packageInfo.versionCode >= 122) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final String b(long j, String str, BizType bizType, String str2) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ae7895c", new Object[]{this, new Long(j), str, bizType, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("startTime", String.valueOf(j));
        jSONObject.put(MspGlobalDefine.SESSION, str);
        jSONObject.put("package", this.b.getPackageName());
        if (bizType != null) {
            jSONObject.put("appId", bizType.appId);
        }
        jSONObject.put("sdkVersion", "h.a.3.8.100");
        jSONObject.put("mqpURL", str2);
        return Base64.encodeToString(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 2);
    }

    public final String c(BizType bizType, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f01a87f7", new Object[]{this, bizType, map});
        }
        if (bizType != null) {
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(MspGlobalDefine.ALIPAYS_SCHEME).authority("platformapi").path("startapp").appendQueryParameter("appId", bizType.appId);
            if (a.f4510a[bizType.ordinal()] == 1) {
                appendQueryParameter.appendQueryParameter("appClearTop", "false").appendQueryParameter("startMultApp", slo.VALUE_YES);
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                appendQueryParameter.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            return appendQueryParameter.build().toString();
        }
        throw new RuntimeException("missing bizType");
    }

    public final boolean d(com.alipay.sdk.m.d.a aVar, String str, BizType bizType, Map<String, String> map, boolean z) {
        PackageInfo packageInfo;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d247c560", new Object[]{this, aVar, str, bizType, map, new Boolean(z)})).booleanValue();
        }
        if (this.f4509a) {
            this.d.post(new b(this, 4000, "该 OpenAuthTask 已在执行", null, null));
            return true;
        }
        this.f4509a = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f <= 3000) {
            this.d.post(new b(this, 5000, "3s 内重复授权", null, null));
            return true;
        }
        f = elapsedRealtime;
        String a2 = e.a(32);
        HashMap hashMap = new HashMap(map);
        hashMap.put("mqpPkgName", this.b.getPackageName());
        hashMap.put("mqpScene", g4.a.f2721a);
        com.alipay.sdk.m.e.b a3 = e.a(aVar, this.b, com.alipay.sdk.m.c.a.g);
        if (a3 != null && !a3.a(aVar) && !a3.a() && (packageInfo = a3.f4525a) != null && packageInfo.versionCode >= 122) {
            try {
                String c = c(bizType, hashMap);
                ((ConcurrentHashMap) e).put(a2, this.c);
                try {
                    str2 = b(elapsedRealtime, a2, bizType, c);
                } catch (JSONException unused) {
                    str2 = null;
                }
                if (TextUtils.isEmpty(str2)) {
                    this.d.post(new b(this, 4000, "参数错误", null, null));
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW", new Uri.Builder().scheme(MspGlobalDefine.ALIPAYS_SCHEME).authority("platformapi").path("startapp").appendQueryParameter("appId", "20001129").appendQueryParameter("payload", str2).build());
                intent.addFlags(268435456);
                intent.setPackage(a3.f4525a.packageName);
                try {
                    com.alipay.sdk.m.d.b.a(aVar, a2);
                    this.b.startActivity(intent);
                } catch (Throwable unused2) {
                }
                return false;
            } catch (Throwable unused3) {
                this.d.post(new b(this, 4000, "业务参数错误", null, null));
                return true;
            }
        } else if (z) {
            hashMap.put("mqpScheme", String.valueOf(str));
            hashMap.put("mqpNotifyName", a2);
            hashMap.put("mqpScene", "landing");
            String c2 = c(bizType, hashMap);
            Intent intent2 = new Intent(this.b, H5OpenAuthActivity.class);
            String encode = Uri.encode(c2);
            intent2.putExtra("url", "https://render.alipay.com/p/s/i?scheme=" + encode);
            com.alipay.sdk.m.d.b.a(aVar, intent2);
            this.b.startActivity(intent2);
            return false;
        } else {
            this.d.post(new b(this, 4001, "支付宝未安装或签名错误", null, null));
            return true;
        }
    }
}
