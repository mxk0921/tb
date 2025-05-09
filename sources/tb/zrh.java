package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zrh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        r7 = ((com.alibaba.fastjson.JSONArray) ((com.alibaba.fastjson.JSONObject) r2).get("failRate")).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
        if (r7.hasNext() == false) goto L_0x00b7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
        r8 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
        if (r9.trim().equals((java.lang.String) ((com.alibaba.fastjson.JSONObject) r8).get("sceneName")) == false) goto L_0x0094;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
        return (com.alibaba.fastjson.JSONObject) r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.JSONObject a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.zrh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "c9e4b7d9"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r7 = 1
            r2[r7] = r8
            r7 = 2
            r2[r7] = r9
            java.lang.Object r7 = r0.ipc$dispatch(r1, r2)
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            return r7
        L_0x001b:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r1 = 0
            if (r0 != 0) goto L_0x00b7
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0030
            goto L_0x00b7
        L_0x0030:
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r2 = "umbrella_switch"
            java.lang.String r3 = ""
            java.lang.String r4 = "failRate"
            java.lang.String r0 = r0.getConfig(r2, r4, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x0046
            return r1
        L_0x0046:
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: Exception -> 0x00b7
            java.lang.String r2 = "data"
            java.lang.Object r0 = r0.get(r2)     // Catch: Exception -> 0x00b7
            com.alibaba.fastjson.JSONArray r0 = (com.alibaba.fastjson.JSONArray) r0     // Catch: Exception -> 0x00b7
            java.util.Iterator r0 = r0.iterator()     // Catch: Exception -> 0x00b7
        L_0x0056:
            boolean r2 = r0.hasNext()     // Catch: Exception -> 0x00b7
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r0.next()     // Catch: Exception -> 0x00b7
            boolean r3 = r2 instanceof com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x00b7
            if (r3 == 0) goto L_0x0056
            r3 = r2
            com.alibaba.fastjson.JSONObject r3 = (com.alibaba.fastjson.JSONObject) r3     // Catch: Exception -> 0x00b7
            java.lang.String r5 = "serviceId"
            java.lang.Object r3 = r3.get(r5)     // Catch: Exception -> 0x00b7
            java.lang.String r3 = (java.lang.String) r3     // Catch: Exception -> 0x00b7
            r5 = r2
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5     // Catch: Exception -> 0x00b7
            java.lang.String r6 = "serviceVersion"
            java.lang.Object r5 = r5.get(r6)     // Catch: Exception -> 0x00b7
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x00b7
            boolean r3 = r7.equals(r3)     // Catch: Exception -> 0x00b7
            if (r3 == 0) goto L_0x0056
            boolean r3 = r8.equals(r5)     // Catch: Exception -> 0x00b7
            if (r3 == 0) goto L_0x0056
            com.alibaba.fastjson.JSONObject r2 = (com.alibaba.fastjson.JSONObject) r2     // Catch: Exception -> 0x00b7
            java.lang.Object r7 = r2.get(r4)     // Catch: Exception -> 0x00b7
            com.alibaba.fastjson.JSONArray r7 = (com.alibaba.fastjson.JSONArray) r7     // Catch: Exception -> 0x00b7
            java.util.Iterator r7 = r7.iterator()     // Catch: Exception -> 0x00b7
        L_0x0094:
            boolean r8 = r7.hasNext()     // Catch: Exception -> 0x00b7
            if (r8 == 0) goto L_0x00b7
            java.lang.Object r8 = r7.next()     // Catch: Exception -> 0x00b7
            r0 = r8
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: Exception -> 0x00b7
            java.lang.String r2 = "sceneName"
            java.lang.Object r0 = r0.get(r2)     // Catch: Exception -> 0x00b7
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x00b7
            java.lang.String r2 = r9.trim()     // Catch: Exception -> 0x00b7
            boolean r0 = r2.equals(r0)     // Catch: Exception -> 0x00b7
            if (r0 == 0) goto L_0x0094
            com.alibaba.fastjson.JSONObject r8 = (com.alibaba.fastjson.JSONObject) r8     // Catch: Exception -> 0x00b7
            return r8
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zrh.a(java.lang.String, java.lang.String, java.lang.String):com.alibaba.fastjson.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
        r8 = ((com.alibaba.fastjson.JSONArray) ((com.alibaba.fastjson.JSONObject) r4).get("samplingData")).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r8.hasNext() == false) goto L_0x00dc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
        r9 = r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
        if (r10.trim().equals((java.lang.String) ((com.alibaba.fastjson.JSONObject) r9).get("sceneName")) == false) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
        return java.lang.Double.parseDouble((java.lang.String) ((com.alibaba.fastjson.JSONObject) r9).get("samplingRate"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double b(java.lang.String r8, java.lang.String r9, java.lang.String r10, double r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.zrh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0027
            java.lang.Double r1 = new java.lang.Double
            r1.<init>(r11)
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r12 = 0
            r11[r12] = r8
            r8 = 1
            r11[r8] = r9
            r8 = 2
            r11[r8] = r10
            r8 = 3
            r11[r8] = r1
            java.lang.String r8 = "a331e3aa"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r11)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            return r8
        L_0x0027:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x00e3
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x003b
            goto L_0x00e3
        L_0x003b:
            com.taobao.orange.OrangeConfig r0 = com.taobao.orange.OrangeConfig.getInstance()
            java.lang.String r1 = "umbrella_switch"
            java.lang.String r2 = ""
            java.lang.String r3 = "samplingRate"
            java.lang.String r0 = r0.getConfig(r1, r3, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0052
            return r11
        L_0x0052:
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: Exception -> 0x00e3
            java.lang.String r1 = "defaultSamplingRate"
            java.lang.Object r1 = r0.get(r1)     // Catch: Exception -> 0x00e3
            java.lang.String r1 = (java.lang.String) r1     // Catch: Exception -> 0x00e3
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: Exception -> 0x00e3
            java.lang.String r4 = "data"
            java.lang.Object r0 = r0.get(r4)     // Catch: Exception -> 0x00e3
            com.alibaba.fastjson.JSONArray r0 = (com.alibaba.fastjson.JSONArray) r0     // Catch: Exception -> 0x00e3
            java.util.Iterator r0 = r0.iterator()     // Catch: Exception -> 0x00e3
        L_0x006e:
            boolean r4 = r0.hasNext()     // Catch: Exception -> 0x00e3
            if (r4 == 0) goto L_0x00dc
            java.lang.Object r4 = r0.next()     // Catch: Exception -> 0x00e3
            boolean r5 = r4 instanceof com.alibaba.fastjson.JSONObject     // Catch: Exception -> 0x00e3
            if (r5 == 0) goto L_0x006e
            r5 = r4
            com.alibaba.fastjson.JSONObject r5 = (com.alibaba.fastjson.JSONObject) r5     // Catch: Exception -> 0x00e3
            java.lang.String r6 = "serviceId"
            java.lang.Object r5 = r5.get(r6)     // Catch: Exception -> 0x00e3
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x00e3
            r6 = r4
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6     // Catch: Exception -> 0x00e3
            java.lang.String r7 = "serviceVersion"
            java.lang.Object r6 = r6.get(r7)     // Catch: Exception -> 0x00e3
            java.lang.String r6 = (java.lang.String) r6     // Catch: Exception -> 0x00e3
            boolean r5 = r8.equals(r5)     // Catch: Exception -> 0x00e3
            if (r5 == 0) goto L_0x006e
            boolean r5 = r9.equals(r6)     // Catch: Exception -> 0x00e3
            if (r5 == 0) goto L_0x006e
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4     // Catch: Exception -> 0x00e3
            java.lang.String r8 = "samplingData"
            java.lang.Object r8 = r4.get(r8)     // Catch: Exception -> 0x00e3
            com.alibaba.fastjson.JSONArray r8 = (com.alibaba.fastjson.JSONArray) r8     // Catch: Exception -> 0x00e3
            java.util.Iterator r8 = r8.iterator()     // Catch: Exception -> 0x00e3
        L_0x00af:
            boolean r9 = r8.hasNext()     // Catch: Exception -> 0x00e3
            if (r9 == 0) goto L_0x00dc
            java.lang.Object r9 = r8.next()     // Catch: Exception -> 0x00e3
            r0 = r9
            com.alibaba.fastjson.JSONObject r0 = (com.alibaba.fastjson.JSONObject) r0     // Catch: Exception -> 0x00e3
            java.lang.String r4 = "sceneName"
            java.lang.Object r0 = r0.get(r4)     // Catch: Exception -> 0x00e3
            java.lang.String r0 = (java.lang.String) r0     // Catch: Exception -> 0x00e3
            java.lang.String r4 = r10.trim()     // Catch: Exception -> 0x00e3
            boolean r0 = r4.equals(r0)     // Catch: Exception -> 0x00e3
            if (r0 == 0) goto L_0x00af
            com.alibaba.fastjson.JSONObject r9 = (com.alibaba.fastjson.JSONObject) r9     // Catch: Exception -> 0x00e3
            java.lang.Object r8 = r9.get(r3)     // Catch: Exception -> 0x00e3
            java.lang.String r8 = (java.lang.String) r8     // Catch: Exception -> 0x00e3
            double r8 = java.lang.Double.parseDouble(r8)     // Catch: Exception -> 0x00e3
            return r8
        L_0x00dc:
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x00e3
            return r1
        L_0x00e3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zrh.b(java.lang.String, java.lang.String, java.lang.String, double):double");
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7f106b", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("umbrella_switch", "rehearseEnable", "false"));
    }

    public static void d(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3745820", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, map});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "null";
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = "null";
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = "null";
        }
        if (TextUtils.isEmpty(str7)) {
            str7 = "null";
        }
        if (TextUtils.isEmpty(str8)) {
            str8 = "null";
        }
        if (TextUtils.isEmpty(str9)) {
            str9 = "null";
        }
        if (TextUtils.isEmpty(str10)) {
            str10 = "null";
        }
        if (TextUtils.isEmpty(str11)) {
            str11 = "2.0";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("serviceId", (Object) str2);
        jSONObject.put("version", (Object) str3);
        jSONObject.put("samplingRate", (Object) "1.0");
        jSONObject.put("errorCode", (Object) str4);
        jSONObject.put("errorMsg", (Object) str5);
        jSONObject.put("bizName", (Object) str);
        jSONObject.put("invokeClass", (Object) str7);
        jSONObject.put("invokePage", (Object) str8);
        jSONObject.put("invokePageUrl", (Object) str9);
        jSONObject.put("sceneName", (Object) str10);
        jSONObject.put("msoaVersion", (Object) str11);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    jSONObject.put(key, (Object) value);
                }
            }
        }
        l71.a(l71.ALARM_POINT, jSONObject.toJSONString(), str4, str5);
    }

    public static void e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, String> map) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db587c4", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, map});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "null";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "null";
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "null";
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = "null";
        }
        if (TextUtils.isEmpty(str6)) {
            str6 = "null";
        }
        if (TextUtils.isEmpty(str7)) {
            str7 = "null";
        }
        if (TextUtils.isEmpty(str8)) {
            str8 = "null";
        }
        if (TextUtils.isEmpty(str9)) {
            str9 = "2.0";
        }
        double b = b(str2, str3, str8, 0.05000000074505806d);
        if (Math.random() < b) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("serviceId", (Object) str2);
            jSONObject.put("version", (Object) str3);
            jSONObject.put("samplingRate", (Object) Double.valueOf(b));
            jSONObject.put("bizName", (Object) str);
            jSONObject.put("invokeClass", (Object) str5);
            jSONObject.put("invokePage", (Object) str6);
            jSONObject.put("invokePageUrl", (Object) str7);
            jSONObject.put("sceneName", (Object) str8);
            jSONObject.put("msoaVersion", (Object) str9);
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        jSONObject.put(key, (Object) value);
                    }
                }
            }
            if (c() && (a2 = a(str2, str3, str8)) != null) {
                try {
                    String str10 = (String) a2.get("type");
                    if (Math.random() < Double.parseDouble((String) a2.get("failRate"))) {
                        if ("1".equals(str10)) {
                            jSONObject.put("errorCode", (Object) "61001");
                            jSONObject.put("errorMsg", (Object) "FAIL_SYS_REHEARSE");
                            l71.a(l71.ALARM_POINT, jSONObject.toJSONString(), "61001", "FAIL_SYS_REHEARSE");
                            return;
                        }
                        "2".equals(str10);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            l71.b(l71.ALARM_POINT, jSONObject.toJSONString());
        }
    }

    public static void f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5e7b8b", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11});
        } else {
            d(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, null);
        }
    }

    public static void g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e615bf2c", new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9});
        } else {
            e(str, str2, str3, str4, str5, str6, str7, str8, str9, null);
        }
    }
}
