package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xrl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ECHO = "echo";
    public static final String END = "end";
    public static final String G_BIZFILTER = "g_bizFilter";
    public static final String G_CHANNELSRP = "g_channelSrp";
    public static final String PLACEHOLDER = "placeholder";

    public static czc a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czc) ipChange.ipc$dispatch("b6374031", new Object[]{cfcVar});
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService == null) {
            return null;
        }
        return iHostService.getInvokeCallback().i();
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("625a397a", new Object[]{str, str2});
        }
        try {
            String[] split = str.split(str2);
            if (split.length > 0) {
                return split[0];
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static <T> T c(String str, Class<T> cls, wy1 wy1Var) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("8afde5f3", new Object[]{str, cls, wy1Var});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null && !TextUtils.isEmpty(parseObject.toJSONString())) {
                JSONObject parseObject2 = JSON.parseObject(parseObject.toJSONString());
                if (parseObject2.getString(ECHO) == null) {
                    str2 = "";
                } else {
                    str2 = parseObject2.getString(ECHO);
                }
                wy1Var.g(str2);
                if (parseObject2.getBoolean("end") == null || !parseObject2.getBoolean("end").booleanValue()) {
                    z = false;
                }
                wy1Var.h(z);
                return (T) JSON.parseObject(parseObject.toJSONString(), cls);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:6:0x0022, B:8:0x0038, B:11:0x0042, B:13:0x004a, B:18:0x0056, B:22:0x0065, B:24:0x006b, B:28:0x0077, B:30:0x007d, B:32:0x0083, B:33:0x0088, B:34:0x008c), top: B:37:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:6:0x0022, B:8:0x0038, B:11:0x0042, B:13:0x004a, B:18:0x0056, B:22:0x0065, B:24:0x006b, B:28:0x0077, B:30:0x007d, B:32:0x0083, B:33:0x0088, B:34:0x008c), top: B:37:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(java.lang.String r10, com.alibaba.fastjson.JSONObject r11) {
        /*
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "targetUrl"
            java.lang.String r2 = "&placeholder="
            java.lang.String r3 = "&g_bizFilter="
            java.lang.String r4 = "g_channelSrp="
            java.lang.String r5 = "?"
            com.android.alibaba.ip.runtime.IpChange r6 = tb.xrl.$ipChange
            boolean r7 = r6 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r7 == 0) goto L_0x0022
            java.lang.String r0 = "c9c47051"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r10 = 1
            r1[r10] = r11
            r6.ipc$dispatch(r0, r1)
            return
        L_0x0022:
            java.lang.String r6 = "smartContent"
            com.alibaba.fastjson.JSONObject r6 = r11.getJSONObject(r6)     // Catch: all -> 0x0054
            java.lang.String r7 = "displayText"
            r6.put(r7, r10)     // Catch: all -> 0x0054
            java.lang.String r6 = r11.getString(r1)     // Catch: all -> 0x0054
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0054
            if (r7 != 0) goto L_0x00c6
            java.lang.String r7 = "g_channelSrp"
            boolean r7 = r6.contains(r7)     // Catch: all -> 0x0054
            java.lang.String r8 = "&"
            if (r7 != 0) goto L_0x0056
            java.lang.String r7 = "g_bizFilter"
            boolean r7 = r6.contains(r7)     // Catch: all -> 0x0054
            if (r7 != 0) goto L_0x0056
            java.lang.String r7 = "placeholder"
            boolean r7 = r6.contains(r7)     // Catch: all -> 0x0054
            if (r7 == 0) goto L_0x0077
            goto L_0x0056
        L_0x0054:
            r10 = move-exception
            goto L_0x00c3
        L_0x0056:
            java.lang.String r7 = "\\?"
            java.lang.String r7 = b(r6, r7)     // Catch: all -> 0x0054
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: all -> 0x0054
            if (r9 != 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            java.lang.String r7 = ""
        L_0x0065:
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch: all -> 0x0054
            if (r9 == 0) goto L_0x0076
            java.lang.String r6 = b(r6, r8)     // Catch: all -> 0x0054
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0054
            if (r9 != 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r6 = r7
        L_0x0077:
            boolean r7 = r6.contains(r5)     // Catch: all -> 0x0054
            if (r7 == 0) goto L_0x0088
            boolean r5 = r6.endsWith(r5)     // Catch: all -> 0x0054
            if (r5 != 0) goto L_0x008c
            java.lang.String r6 = r6.concat(r8)     // Catch: all -> 0x0054
            goto L_0x008c
        L_0x0088:
            java.lang.String r6 = r6.concat(r5)     // Catch: all -> 0x0054
        L_0x008c:
            java.lang.String r5 = new java.lang.String     // Catch: all -> 0x0054
            byte[] r10 = r10.getBytes()     // Catch: all -> 0x0054
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: all -> 0x0054
            r5.<init>(r10, r7)     // Catch: all -> 0x0054
            java.lang.String r10 = java.net.URLEncoder.encode(r5, r0)     // Catch: all -> 0x0054
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x0054
            r0.<init>()     // Catch: all -> 0x0054
            r0.append(r6)     // Catch: all -> 0x0054
            r0.append(r4)     // Catch: all -> 0x0054
            java.lang.String r4 = tb.tca.e     // Catch: all -> 0x0054
            r0.append(r4)     // Catch: all -> 0x0054
            r0.append(r3)     // Catch: all -> 0x0054
            java.lang.String r3 = tb.tca.e     // Catch: all -> 0x0054
            r0.append(r3)     // Catch: all -> 0x0054
            r0.append(r2)     // Catch: all -> 0x0054
            r0.append(r10)     // Catch: all -> 0x0054
            java.lang.String r10 = r0.toString()     // Catch: all -> 0x0054
            r11.put(r1, r10)     // Catch: all -> 0x0054
            goto L_0x00c6
        L_0x00c3:
            r10.printStackTrace()
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xrl.d(java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }
}
