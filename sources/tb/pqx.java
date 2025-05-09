package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pqx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f26246a = new HashMap();

    static {
        t2o.a(775946339);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r11) {
        /*
            java.lang.String r0 = "File too short to be a zip file: "
            com.android.alibaba.ip.runtime.IpChange r1 = tb.pqx.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0017
            java.lang.String r0 = "e31837e6"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            java.lang.Object r11 = r1.ipc$dispatch(r0, r2)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L_0x0017:
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: all -> 0x00a9, Exception -> 0x00ab
            java.lang.String r3 = "r"
            r2.<init>(r11, r3)     // Catch: all -> 0x00a9, Exception -> 0x00ab
            long r3 = r2.length()     // Catch: all -> 0x0075, Exception -> 0x0078
            r5 = 22
            long r5 = r3 - r5
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x0093
            r9 = 65558(0x10016, double:3.239E-319)
            long r3 = r3 - r9
            int r11 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r7 = r3
        L_0x0038:
            r2.seek(r5)     // Catch: all -> 0x0075, Exception -> 0x0078
            int r11 = r2.readInt()     // Catch: all -> 0x0075, Exception -> 0x0078
            int r11 = java.lang.Integer.reverseBytes(r11)     // Catch: all -> 0x0075, Exception -> 0x0078
            r0 = 101010256(0x6054b50, float:2.506985E-35)
            if (r11 != r0) goto L_0x0083
            r11 = 18
            byte[] r11 = new byte[r11]     // Catch: all -> 0x0075, Exception -> 0x0078
            r2.readFully(r11)     // Catch: all -> 0x0075, Exception -> 0x0078
            r0 = 16
            r0 = r11[r0]     // Catch: all -> 0x0075, Exception -> 0x0078
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 17
            r11 = r11[r3]     // Catch: all -> 0x0075, Exception -> 0x0078
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r11 = r11 | r0
            if (r11 <= 0) goto L_0x007a
            byte[] r11 = new byte[r11]     // Catch: all -> 0x0075, Exception -> 0x0078
            r2.readFully(r11)     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r0 = new java.lang.String     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r3 = "UTF-8"
            r0.<init>(r11, r3)     // Catch: all -> 0x0075, Exception -> 0x0078
            r2.close()     // Catch: IOException -> 0x0070
            goto L_0x0074
        L_0x0070:
            r11 = move-exception
            r11.printStackTrace()
        L_0x0074:
            return r0
        L_0x0075:
            r11 = move-exception
            r1 = r2
            goto L_0x00b6
        L_0x0078:
            r11 = move-exception
            goto L_0x00ad
        L_0x007a:
            r2.close()     // Catch: IOException -> 0x007e
            goto L_0x00b5
        L_0x007e:
            r11 = move-exception
            r11.printStackTrace()
            goto L_0x00b5
        L_0x0083:
            r3 = 1
            long r5 = r5 - r3
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x008b
            goto L_0x0038
        L_0x008b:
            java.util.zip.ZipException r11 = new java.util.zip.ZipException     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r0 = "EOCD not found; not a zip file?"
            r11.<init>(r0)     // Catch: all -> 0x0075, Exception -> 0x0078
            throw r11     // Catch: all -> 0x0075, Exception -> 0x0078
        L_0x0093:
            java.util.zip.ZipException r11 = new java.util.zip.ZipException     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0075, Exception -> 0x0078
            r3.<init>(r0)     // Catch: all -> 0x0075, Exception -> 0x0078
            long r4 = r2.length()     // Catch: all -> 0x0075, Exception -> 0x0078
            r3.append(r4)     // Catch: all -> 0x0075, Exception -> 0x0078
            java.lang.String r0 = r3.toString()     // Catch: all -> 0x0075, Exception -> 0x0078
            r11.<init>(r0)     // Catch: all -> 0x0075, Exception -> 0x0078
            throw r11     // Catch: all -> 0x0075, Exception -> 0x0078
        L_0x00a9:
            r11 = move-exception
            goto L_0x00b6
        L_0x00ab:
            r11 = move-exception
            r2 = r1
        L_0x00ad:
            r11.printStackTrace()     // Catch: all -> 0x0075
            if (r2 == 0) goto L_0x00b5
            r2.close()     // Catch: IOException -> 0x007e
        L_0x00b5:
            return r1
        L_0x00b6:
            if (r1 == 0) goto L_0x00c0
            r1.close()     // Catch: IOException -> 0x00bc
            goto L_0x00c0
        L_0x00bc:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00c0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.pqx.a(java.lang.String):java.lang.String");
    }

    public static final JSONObject b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("88010f40", new Object[]{context});
        }
        String packageName = context.getPackageName();
        Map<String, JSONObject> map = f26246a;
        JSONObject jSONObject = (JSONObject) ((HashMap) map).get(packageName);
        if (jSONObject == null) {
            synchronized (map) {
                jSONObject = (JSONObject) ((HashMap) map).get(packageName);
                if (jSONObject == null) {
                    try {
                        String a2 = a(context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.sourceDir);
                        if (!TextUtils.isEmpty(a2)) {
                            jSONObject = new JSONObject(a2);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    ((HashMap) f26246a).put(packageName, jSONObject);
                }
            }
        }
        return jSONObject;
    }
}
