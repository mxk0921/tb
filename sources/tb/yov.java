package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.muniontaobaosdk.util.TaoLog;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118873);
    }

    public static JSONObject a(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("68790ff3", new Object[]{str});
        }
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(str)) {
            return jSONObject;
        }
        for (String str2 : str.split("&")) {
            if (!TextUtils.isEmpty(str2)) {
                String[] split2 = str2.split("=", 2);
                if (split2.length > 1) {
                    try {
                        jSONObject.put(split2[0], split2[1]);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return jSONObject;
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f439edb", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Uri.parse(URLDecoder.decode(str, "UTF-8")).getQueryParameter(str2);
        } catch (Exception e) {
            TaoLog.Loge("CpmClickCommitter", "getSceneIdFromEurl fail, and error: " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String c(java.lang.String r5, java.lang.String r6) {
        /*
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.yov.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "8a731f60"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r3[r0] = r6
            java.lang.Object r5 = r1.ipc$dispatch(r2, r3)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0018:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.String r1 = "?"
            int r1 = r5.indexOf(r1)
            if (r1 <= 0) goto L_0x0037
            java.lang.String r1 = "\\?"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            if (r1 <= r0) goto L_0x0037
            r5 = r5[r0]
            if (r5 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            if (r5 == 0) goto L_0x0057
            org.json.JSONObject r5 = a(r5)
            if (r5 == 0) goto L_0x0057
            boolean r0 = r5.isNull(r6)
            if (r0 != 0) goto L_0x0057
            java.lang.Object r5 = r5.get(r6)     // Catch: JSONException -> 0x0053
            java.lang.String r5 = r5.toString()     // Catch: JSONException -> 0x0053
            java.lang.String r5 = r5.trim()     // Catch: JSONException -> 0x0053
            return r5
        L_0x0053:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yov.c(java.lang.String, java.lang.String):java.lang.String");
    }
}
