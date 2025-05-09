package com.taobao.android.testutils;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.BXBRBridge;
import com.taobao.android.behavix.bhxbridge.BHXCXXInnerBridge;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.dn1;
import tb.g3v;
import tb.ke4;
import tb.kpw;
import tb.me4;
import tb.qv6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class JsBridgeBehaviXConfig extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "JsBridgeBehaviXConfig";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9636a = null;
    private static Boolean b = null;
    private static Boolean c;
    private static Map<String, String> d;
    private static Map<String, String> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d extends TypeReference<Map<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements ke4 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f9637a;
        public final /* synthetic */ WVCallBackContext b;
        public final /* synthetic */ String c;

        public e(JsBridgeBehaviXConfig jsBridgeBehaviXConfig, JSONObject jSONObject, WVCallBackContext wVCallBackContext, String str) {
            this.f9637a = jSONObject;
            this.b = wVCallBackContext;
            this.c = str;
        }

        @Override // tb.ke4
        public void a(String str, String str2, String str3, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f84e7f62", new Object[]{this, str, str2, str3, jSONObject});
            } else {
                this.b.error();
            }
        }

        @Override // tb.ke4
        public void b(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c939cdb", new Object[]{this, str, jSONObject});
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scriptExecuteResult", (Object) jSONObject);
            jSONObject2.put("params", (Object) this.f9637a);
            jSONObject2.put("timeStamp", (Object) Long.valueOf(System.currentTimeMillis()));
            this.b.success();
            qv6.a("BehaviX", "tableTest", this.c, jSONObject2.toJSONString(), JsBridgeBehaviXConfig.a());
        }
    }

    static {
        t2o.a(404750693);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[0]) : d;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (b == null) {
            try {
                if (System.currentTimeMillis() - dn1.c().d("mtopDebugCacheTime", 0L) < TimeUnit.DAYS.toMillis(1L)) {
                    b(dn1.c().e("mtopDebugCacheParam"));
                }
            } catch (Exception unused) {
            }
            b = Boolean.valueOf(Boolean.TRUE.equals(b));
        }
        Boolean bool = f9636a;
        return bool != null && bool.booleanValue();
    }

    public static String getBXLogMtopDebugKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da7257ed", new Object[0]);
        }
        Map<String, String> map = e;
        if (map != null) {
            return map.get("debugKey");
        }
        return null;
    }

    public static String getScriptValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f45699ff", new Object[]{str});
        }
        Map<String, String> map = d;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return d.get(str);
    }

    public static void initPersistScriptConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feb98b8", new Object[0]);
        } else if (c == null) {
            long d2 = dn1.c().d("scriptConfigCacheTime", 0L);
            if (d2 != 0) {
                c = Boolean.TRUE;
            } else {
                c = Boolean.FALSE;
            }
            if (System.currentTimeMillis() - d2 < TimeUnit.HOURS.toMillis(4L) && c.booleanValue()) {
                d = (Map) JSON.parseObject(dn1.c().e("scriptConfigCacheParam"), new a(), new Feature[0]);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(JsBridgeBehaviXConfig jsBridgeBehaviXConfig, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/testutils/JsBridgeBehaviXConfig");
    }

    public static boolean isEnableRealTimeMTopDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d78c37e", new Object[0])).booleanValue();
        }
        if (b()) {
            return true;
        }
        BHXCXXInnerBridge.updateCXXCttpUploadState(false, null);
        return false;
    }

    public static boolean isEnableRealTimeUtDebug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb924a67", new Object[0])).booleanValue();
        }
        if (f9636a == null) {
            try {
                if (System.currentTimeMillis() - dn1.c().d("utDebugCacheTime", 0L) < TimeUnit.DAYS.toMillis(1L)) {
                    b(dn1.c().e("utDebugCacheParam"));
                }
            } catch (Exception unused) {
            }
            f9636a = Boolean.valueOf(Boolean.TRUE.equals(f9636a));
        }
        return f9636a.booleanValue();
    }

    public static void uPPConfigContentLogUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2839c3ea", new Object[0]);
        } else {
            BXBRBridge.b(BXBRBridge.ExtAction.UPLOAD_UPP_CONFIG, new Object[0]);
        }
    }

    private static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f9636a = Boolean.valueOf(z);
        }
    }

    private static void a(boolean z, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f2e4c4a", new Object[]{new Boolean(z), str, str2, str3});
            return;
        }
        dn1.c().g(str, z ? System.currentTimeMillis() : 0L);
        dn1.c().h(str2, str3);
    }

    private boolean c(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (TextUtils.equals(parseObject.getString("uploadSource"), "BXLog")) {
                parseObject.put("debug_api_url", (Object) "http://service-usertrack.alibaba-inc.com/upload_records_from_client");
                parseObject.put("debug_sampling_option", (Object) "true");
                parseObject.put("debug_store", (Object) parseObject.getString("debugKey"));
            }
            b(parseObject.toJSONString());
            a(true, "utDebugCacheTime", "utDebugCacheParam", parseObject.toJSONString());
            wVCallBackContext.success();
            BXBRBridge.b(BXBRBridge.ExtAction.UPLOAD_UPP_PLAN, new Object[0]);
            TLog.loge("BehaviX", NAME, "turnOnRealTimeDebug ok");
            return true;
        } catch (Throwable th) {
            wVCallBackContext.error();
            TLog.loge("BehaviX", NAME, "turnOnRealTimeDebug e:" + th.getMessage());
            return false;
        }
    }

    private boolean d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c8deb6", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            a(false);
            wVCallBackContext.success();
            TLog.loge("BehaviX", NAME, "turnOffRealTimeDebug ok");
            return true;
        } catch (Throwable th) {
            wVCallBackContext.error(th.getMessage());
            TLog.loge("BehaviX", NAME, "turnOffRealTimeDebug e:" + th.getMessage());
            return false;
        }
    }

    private boolean e(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d770977", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            ArrayList arrayList = (ArrayList) JSON.parseObject(JSON.parseObject(str).getString("groups"), ArrayList.class);
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    LogUtils.g("mobileIntelligentUtils", NAME, JSON.toJSONString(OrangeConfig.getInstance().getConfigs((String) it.next())));
                }
                uPPConfigContentLogUpload();
                wVCallBackContext.success();
                return true;
            }
            wVCallBackContext.error("params is empty, " + str);
            return true;
        } catch (Throwable th) {
            wVCallBackContext.error(th.getMessage());
            return false;
        }
    }

    private boolean f(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1253438", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        } else if (JSON.parseObject(str) == null) {
            wVCallBackContext.error("params-parse failed.");
            return false;
        } else {
            BHXCXXInnerBridge.execMockInterface(str);
            wVCallBackContext.success();
            return true;
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            Map<String, String> map = (Map) JSON.parseObject(str, new b(), new Feature[0]);
            d = map;
            a(Boolean.valueOf(map.get("isPersist")).booleanValue(), "scriptConfigCacheTime", "scriptConfigCacheParam", str);
            d.put("debugKey", (String) ((Map) JSON.parseObject(dn1.c().e("mtopDebugCacheParam"), new c(), new Feature[0])).get("debugKey"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r9.equals("performBXTestTools") == false) goto L_0x004a;
     */
    @Override // tb.kpw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r9, java.lang.String r10, android.taobao.windvane.jsbridge.WVCallBackContext r11) {
        /*
            r8 = this;
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 4
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.testutils.JsBridgeBehaviXConfig.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0022
            java.lang.String r6 = "bcd41fd1"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r8
            r3[r2] = r9
            r3[r1] = r10
            r3[r0] = r11
            java.lang.Object r9 = r5.ipc$dispatch(r6, r3)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0022:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "action : "
            r5.<init>(r6)
            r5.append(r9)
            java.lang.String r6 = " params : "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "BehaviX"
            java.lang.String r7 = "JsBridgeBehaviXConfig"
            com.taobao.tao.log.TLog.loge(r6, r7, r5)
            if (r9 != 0) goto L_0x0042
            return r4
        L_0x0042:
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -1399846204: goto L_0x0086;
                case 62904519: goto L_0x007a;
                case 183915661: goto L_0x006e;
                case 202513074: goto L_0x0064;
                case 660498156: goto L_0x0058;
                case 720943669: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            r0 = -1
            goto L_0x0091
        L_0x004c:
            java.lang.String r0 = "utTurnOffRealTimeDebug"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x004a
        L_0x0056:
            r0 = 5
            goto L_0x0091
        L_0x0058:
            java.lang.String r0 = "walleUploadOrangeConfig"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0062
            goto L_0x004a
        L_0x0062:
            r0 = 4
            goto L_0x0091
        L_0x0064:
            java.lang.String r1 = "performBXTestTools"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0091
            goto L_0x004a
        L_0x006e:
            java.lang.String r0 = "utTurnOnRealTimeDebug"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0078
            goto L_0x004a
        L_0x0078:
            r0 = 2
            goto L_0x0091
        L_0x007a:
            java.lang.String r0 = "pythonScript"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0084
            goto L_0x004a
        L_0x0084:
            r0 = 1
            goto L_0x0091
        L_0x0086:
            java.lang.String r0 = "mtopTurnOnRealTimeDebug"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0090:
            r0 = 0
        L_0x0091:
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a2;
                case 4: goto L_0x009d;
                case 5: goto L_0x0098;
                default: goto L_0x0094;
            }
        L_0x0094:
            com.taobao.android.ucp.bridge.NativeBroadcast.cxxJSBridge(r7, r9, r10, r11)
            return r4
        L_0x0098:
            boolean r9 = r8.d(r10, r11)
            return r9
        L_0x009d:
            boolean r9 = r8.e(r10, r11)
            return r9
        L_0x00a2:
            boolean r9 = r8.f(r10, r11)
            return r9
        L_0x00a7:
            boolean r9 = r8.c(r10, r11)
            return r9
        L_0x00ac:
            boolean r9 = r8.a(r10, r11)
            return r9
        L_0x00b1:
            boolean r9 = r8.b(r10, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.testutils.JsBridgeBehaviXConfig.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        g3v.getInstance().turnOffRealTimeDebug();
        e = (Map) JSON.parseObject(str, new d(), new Feature[0]);
        g3v.getInstance().turnOnRealTimeDebug(e);
        a(true);
    }

    private boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(str);
        String string = parseObject.getString("pageName");
        String string2 = parseObject.getString("scriptName");
        String string3 = parseObject.getString("operatorName");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            wVCallBackContext.error();
            return true;
        }
        a(str);
        me4.b(string, string2, null, new e(this, parseObject, wVCallBackContext, string3));
        return true;
    }

    private boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params is empty");
            return false;
        }
        try {
            String string = JSON.parseObject(str).getString("debugKey");
            if (TextUtils.isEmpty(string)) {
                wVCallBackContext.error("debugKey is null");
                return false;
            }
            b(str);
            a(true);
            a(true, "mtopDebugCacheTime", "mtopDebugCacheParam", str);
            wVCallBackContext.success();
            BHXCXXInnerBridge.updateCXXCttpUploadState(true, string);
            return true;
        } catch (Exception e2) {
            BHXCXXInnerBridge.updateCXXCttpUploadState(false, null);
            LogUtils.f(NAME, "", e2.getMessage());
            return false;
        }
    }
}
