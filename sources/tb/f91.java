package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile f91 c = null;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f19109a;
    public boolean b = false;

    static {
        t2o.a(444596286);
    }

    public static f91 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f91) ipChange.ipc$dispatch("8948b501", new Object[0]);
        }
        if (c == null) {
            synchronized (f91.class) {
                try {
                    if (c == null) {
                        c = new f91();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r5 != null) goto L_0x004a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
        if (r5 != null) goto L_0x004a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(android.content.Context r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.f91.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "6926b00d"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 != 0) goto L_0x0021
            return r1
        L_0x0021:
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: all -> 0x0052, IOException -> 0x0055
            java.lang.String r2 = "dinamic/dx_appstyle.json"
            java.io.InputStream r5 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r5, r2)     // Catch: all -> 0x0052, IOException -> 0x0055
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: all -> 0x004e, IOException -> 0x0050
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: all -> 0x004e, IOException -> 0x0050
            r3.<init>(r5)     // Catch: all -> 0x004e, IOException -> 0x0050
            r2.<init>(r3)     // Catch: all -> 0x004e, IOException -> 0x0050
        L_0x0035:
            java.lang.String r1 = r2.readLine()     // Catch: all -> 0x003f, IOException -> 0x0042
            if (r1 == 0) goto L_0x0045
            r0.append(r1)     // Catch: all -> 0x003f, IOException -> 0x0042
            goto L_0x0035
        L_0x003f:
            r0 = move-exception
            r1 = r2
            goto L_0x0058
        L_0x0042:
            r1 = r2
            goto L_0x0063
        L_0x0045:
            r2.close()     // Catch: IOException -> 0x006b
            if (r5 == 0) goto L_0x006b
        L_0x004a:
            r5.close()     // Catch: IOException -> 0x006b
            goto L_0x006b
        L_0x004e:
            r0 = move-exception
            goto L_0x0058
        L_0x0050:
            goto L_0x0063
        L_0x0052:
            r0 = move-exception
            r5 = r1
            goto L_0x0058
        L_0x0055:
            r5 = r1
            goto L_0x0063
        L_0x0058:
            if (r1 == 0) goto L_0x005d
            r1.close()     // Catch: IOException -> 0x0062
        L_0x005d:
            if (r5 == 0) goto L_0x0062
            r5.close()     // Catch: IOException -> 0x0062
        L_0x0062:
            throw r0
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch: IOException -> 0x006b
        L_0x0068:
            if (r5 == 0) goto L_0x006b
            goto L_0x004a
        L_0x006b:
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f91.b(android.content.Context):java.lang.String");
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1fc49650", new Object[]{this});
        }
        JSONObject jSONObject = this.f19109a;
        if (jSONObject != null && this.b) {
            return jSONObject;
        }
        JSONObject parseObject = JSON.parseObject(b(tl7.a()));
        this.f19109a = parseObject;
        this.b = true;
        return parseObject;
    }
}
