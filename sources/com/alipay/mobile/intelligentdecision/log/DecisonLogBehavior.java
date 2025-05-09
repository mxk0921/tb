package com.alipay.mobile.intelligentdecision.log;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.intelligentdecision.IDeviceInfoUtil;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.manager.LogReportManager;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.f7l;
import tb.h7r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecisonLogBehavior {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f4236a = "DecisonLogBehavior";
    public static volatile DecisonLogBehavior f;
    public static final Map<String, StringBuffer> g = new HashMap();
    public final BlockingQueue<a> c = new ArrayBlockingQueue(100);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(true);
    public AtomicBoolean b = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f4242a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public Map<String, String> g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
            this.f4242a = str;
            this.b = str2;
            this.c = str4;
            this.d = str5;
            this.e = str6;
            this.f = str3;
            this.g = map;
        }
    }

    public static /* synthetic */ String a(DecisonLogBehavior decisonLogBehavior, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ad8fa39", new Object[]{decisonLogBehavior, str, str2, str3, bundle}) : decisonLogBehavior.b(str, str2, str3, bundle);
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f4236a;
    }

    public static /* synthetic */ AtomicBoolean c(DecisonLogBehavior decisonLogBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c9f6e151", new Object[]{decisonLogBehavior}) : decisonLogBehavior.e;
    }

    public static String d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "-";
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            if (i == arrayList.size() - 1 && !TextUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append("=");
                sb.append(j(str2));
            } else if (!TextUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append("=");
                sb.append(j(str2));
                sb.append("&");
            }
        }
        if (sb.toString().endsWith("&")) {
            return sb.toString().substring(0, sb.toString().length() - 1);
        }
        return sb.toString();
    }

    public static String j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.replace("&", "＆").replace("=", "＝").replace("[", "［").replace("]", "］").replace(";", "；").replace(",", "，").replace(f7l.BRACKET_START_STR, "（").replace(f7l.BRACKET_END_STR, "）").replace("\r", " ").replace("\n", " ");
        }
        return "-";
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        return new SimpleDateFormat("HH:mm:ss:SSS").format(new Date());
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "-";
        }
        return str;
    }

    public final synchronized void e(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        Map<String, StringBuffer> map = g;
        if (map != null) {
            StringBuffer stringBuffer = (StringBuffer) ((HashMap) map).get(str);
            if (!(stringBuffer == null || (indexOf = stringBuffer.indexOf("DEFAULT_VERSION")) == -1)) {
                stringBuffer.replace(indexOf, indexOf + 15, str2);
            }
        }
    }

    public final synchronized void f(String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cda1c", new Object[]{this, str, stringBuffer});
            return;
        }
        if (str != null) {
            ((HashMap) g).put(str, stringBuffer);
        }
    }

    public final synchronized StringBuffer g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("346189ad", new Object[]{this, str});
        } else if (str != null) {
            StringBuffer stringBuffer = (StringBuffer) ((HashMap) g).get(str);
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer("");
                f(str, stringBuffer);
            }
            return stringBuffer;
        } else {
            return new StringBuffer("");
        }
    }

    public final synchronized void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            g(str).append(str2);
        }
    }

    public static /* synthetic */ StringBuffer a(DecisonLogBehavior decisonLogBehavior, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuffer) ipChange.ipc$dispatch("2e75be87", new Object[]{decisonLogBehavior, str}) : decisonLogBehavior.g(str);
    }

    public static /* synthetic */ AtomicBoolean b(DecisonLogBehavior decisonLogBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("e8eaa6d0", new Object[]{decisonLogBehavior}) : decisonLogBehavior.b;
    }

    public static String c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d869137", new Object[]{str, str2, map});
        }
        return j(str) + ";" + j(str2) + ";" + d(map);
    }

    public static void h(String str, long j, JSONObject jSONObject, String str2, SharedPreferences sharedPreferences, String str3, String str4, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88707835", new Object[]{str, new Long(j), jSONObject, str2, sharedPreferences, str3, str4, new Long(j2)});
            return;
        }
        try {
            jSONObject.put(MspEventTypes.ACTION_STRING_VERIFYID, (Object) str2);
            jSONObject.put("exception", (Object) str);
            jSONObject.put("config_version", (Object) Integer.valueOf(sharedPreferences.getInt("extractConfig_version_" + FrameworkUtils.getUserId(), 0)));
            jSONObject.put("idp", (Object) ("a;" + DecisionEngine.a()));
            jSONObject.put("timing", (Object) str3);
            jSONObject.put("extract_scene", (Object) str4);
            jSONObject.put("current_time", (Object) Long.valueOf(j2));
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, (Object) Long.valueOf(j));
            jSONObject.put("app_name", (Object) IDeviceInfoUtil.e());
            jSONObject.put("app_version", (Object) IDeviceInfoUtil.f());
            jSONObject.put(h7r.DEVICE_MODEL, (Object) IDeviceInfoUtil.b());
        } catch (Throwable th) {
            String str5 = f4236a;
            DecisionLogcat.b(str5, "buildErrorMsg error:" + th.getMessage());
        }
    }

    public final synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.d.getAndSet(true)) {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    while (true) {
                        try {
                            a aVar = (a) DecisonLogBehavior.a(DecisonLogBehavior.this).take();
                            if (aVar.f4242a.equalsIgnoreCase("behavior")) {
                                if (aVar.b.equalsIgnoreCase("190916-1")) {
                                    String a2 = DecisonLogBehavior.a("", aVar.b, aVar.f, aVar.c, aVar.d, aVar.e, aVar.g);
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append(a2);
                                    DecisonLogBehavior decisonLogBehavior = DecisonLogBehavior.this;
                                    DecisonLogBehavior.a(decisonLogBehavior, aVar.f + "_" + aVar.c, stringBuffer);
                                    String b = DecisonLogBehavior.b();
                                    DecisionLogcat.b(b, "190916-1 key:" + aVar.f + "_" + aVar.c);
                                } else if (aVar.b.equalsIgnoreCase("190916-2")) {
                                    DecisonLogBehavior decisonLogBehavior2 = DecisonLogBehavior.this;
                                    DecisonLogBehavior.a(decisonLogBehavior2, aVar.f + "_" + aVar.c, DecisonLogBehavior.a("endSymbol", aVar.b, aVar.d, aVar.e, aVar.g));
                                    DecisonLogBehavior decisonLogBehavior3 = DecisonLogBehavior.this;
                                    String stringBuffer2 = DecisonLogBehavior.a(decisonLogBehavior3, aVar.f + "_" + aVar.c).toString();
                                    String b2 = DecisonLogBehavior.b();
                                    StringBuilder sb = new StringBuilder("result behavior:");
                                    sb.append(stringBuffer2);
                                    DecisionLogcat.b(b2, sb.toString());
                                    String str = "";
                                    Map<String, String> map = aVar.g;
                                    if (map != null) {
                                        str = map.get("needReport");
                                    }
                                    if (TextUtils.isEmpty(str) || !"N".equalsIgnoreCase(str)) {
                                        LogReportManager.a().a(stringBuffer2);
                                    }
                                    DecisonLogBehavior a3 = DecisonLogBehavior.a();
                                    a3.a(aVar.f + "_" + aVar.c);
                                } else if (aVar.b.equalsIgnoreCase("191121-4")) {
                                    Map<String, String> map2 = aVar.g;
                                    if (map2 != null) {
                                        String str2 = map2.get("strategy_version");
                                        if (!TextUtils.isEmpty(str2)) {
                                            DecisonLogBehavior decisonLogBehavior4 = DecisonLogBehavior.this;
                                            DecisonLogBehavior.b(decisonLogBehavior4, aVar.f + "_" + aVar.c, str2);
                                        }
                                    }
                                } else {
                                    String a4 = DecisonLogBehavior.a((String) null, aVar.b, aVar.d, aVar.e, aVar.g);
                                    String b3 = DecisonLogBehavior.b();
                                    DecisionLogcat.b(b3, aVar.b + " key:" + aVar.f + "_" + aVar.c + ",log:" + a4);
                                    DecisonLogBehavior decisonLogBehavior5 = DecisonLogBehavior.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(aVar.f);
                                    sb2.append("_");
                                    sb2.append(aVar.c);
                                    DecisonLogBehavior.a(decisonLogBehavior5, sb2.toString(), a4);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "logBehavior");
        }
    }

    public static /* synthetic */ BlockingQueue a(DecisonLogBehavior decisonLogBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("fa1cb32", new Object[]{decisonLogBehavior}) : decisonLogBehavior.c;
    }

    public static /* synthetic */ void b(DecisonLogBehavior decisonLogBehavior, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377ed2a4", new Object[]{decisonLogBehavior, str, str2});
        } else {
            decisonLogBehavior.e(str, str2);
        }
    }

    public static /* synthetic */ void a(DecisonLogBehavior decisonLogBehavior, JSONObject jSONObject, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b87c55", new Object[]{decisonLogBehavior, jSONObject, str, str2, str3, bundle});
        } else {
            decisonLogBehavior.a(jSONObject, str, str2, str3, bundle);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(3:29|8|(12:13|(1:16)|17|33|18|19|31|20|21|22|27|28))|14|(0)|17|33|18|19|31|20|21|22|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x018d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x018f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0190, code lost:
        r19 = r12;
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0194, code lost:
        r1 = com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.f4236a;
        com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, "runCompute error:" + r0.getMessage());
        r4 = java.lang.System.currentTimeMillis() - r19;
        h("runCompute error:" + r0.getMessage(), r4, r18, r22, r15, r24, r23, r19);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(final java.lang.String r22, final java.lang.String r23, final java.lang.String r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.b(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):java.lang.String");
    }

    public static /* synthetic */ void a(DecisonLogBehavior decisonLogBehavior, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4186363", new Object[]{decisonLogBehavior, str, str2});
        } else {
            decisonLogBehavior.i(str, str2);
        }
    }

    public static /* synthetic */ void a(DecisonLogBehavior decisonLogBehavior, String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f966c3", new Object[]{decisonLogBehavior, str, stringBuffer});
        } else {
            decisonLogBehavior.f(str, stringBuffer);
        }
    }

    public static /* synthetic */ void a(String str, long j, JSONObject jSONObject, String str2, SharedPreferences sharedPreferences, String str3, String str4, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee32674", new Object[]{str, new Long(j), jSONObject, str2, sharedPreferences, str3, str4, new Long(j2)});
        } else {
            h(str, j, jSONObject, str2, sharedPreferences, str3, str4, j2);
        }
    }

    public static DecisonLogBehavior a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisonLogBehavior) ipChange.ipc$dispatch("e2cbf595", new Object[0]);
        }
        if (f == null) {
            synchronized (DecisonLogBehavior.class) {
                try {
                    if (f == null) {
                        f = new DecisonLogBehavior();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            k();
            ((ArrayBlockingQueue) this.c).offer(new a("behavior", str, str2, str3, str4, str5, map));
        } catch (Throwable th) {
            String str6 = f4236a;
            DecisionLogcat.b(str6, "logCommon error:" + th.getMessage());
        }
    }

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str != null) {
            ((HashMap) g).remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.alibaba.fastjson.JSONObject r10, final java.lang.String r11, java.lang.String r12, final java.lang.String r13, final android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.a(com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public static /* synthetic */ String a(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e117455f", new Object[]{str, str2, str3, str4, str5, str6, map});
        }
        String str7 = str.equalsIgnoreCase("behavior") ? ")]" : f7l.BRACKET_END_STR;
        StringBuilder sb = new StringBuilder();
        String str8 = TextUtils.isEmpty(str6) ? "DEFAULT_VERSION" : str6;
        sb.append("[(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()) + ";" + DecisionEngine.a() + ";" + IDeviceInfoUtil.a() + ";" + IDeviceInfoUtil.b() + ";" + IDeviceInfoUtil.c() + ";" + IDeviceInfoUtil.d() + ";" + m(FrameworkUtils.getUserId()) + ";" + m(str3) + ";" + m(IDeviceInfoUtil.e()) + ";" + m(IDeviceInfoUtil.f()) + ";" + m(str8) + ";" + str4 + f7l.BRACKET_END_STR);
        sb.append(",(");
        sb.append(str2);
        sb.append(";");
        sb.append(l());
        sb.append(";");
        sb.append(c(str5, str6, map));
        sb.append(str7);
        return sb.toString();
    }

    public static /* synthetic */ String a(String str, String str2, String str3, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b0684b", new Object[]{str, str2, str3, str4, map});
        }
        String str5 = "endSymbol".equalsIgnoreCase(str) ? ")]" : f7l.BRACKET_END_STR;
        return ",(" + str2 + ";" + l() + ";" + c(str3, str4, map) + str5;
    }
}
