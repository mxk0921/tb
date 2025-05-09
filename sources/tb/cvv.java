package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Map<String, Map<String, String>> a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4644f07a", new Object[]{this, context, str});
        }
        return b(context, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> b(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.cvv.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x001b
            java.lang.String r2 = "28f799ca"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r0 = 1
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.util.Map r6 = (java.util.Map) r6
            return r6
        L_0x001b:
            boolean r1 = tb.uy4.a(r7)
            r2 = 0
            if (r1 != 0) goto L_0x0023
            return r2
        L_0x0023:
            java.lang.String[] r0 = new java.lang.String[r0]
            if (r6 == 0) goto L_0x0043
            android.content.res.AssetManager r1 = r6.getAssets()     // Catch: all -> 0x003a, Exception -> 0x003c
            if (r1 == 0) goto L_0x0043
            android.content.res.AssetManager r1 = r6.getAssets()     // Catch: all -> 0x003a, Exception -> 0x003c
            java.io.InputStream r1 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r1, r7)     // Catch: all -> 0x003a, Exception -> 0x003c
            java.lang.String[] r0 = tb.uy4.d(r1)     // Catch: all -> 0x003a, Exception -> 0x003c
            goto L_0x0043
        L_0x003a:
            r6 = move-exception
            goto L_0x003e
        L_0x003c:
            r1 = move-exception
            goto L_0x003f
        L_0x003e:
            throw r6
        L_0x003f:
            r1.printStackTrace()
            goto L_0x0046
        L_0x0043:
            if (r0 != 0) goto L_0x0046
            return r2
        L_0x0046:
            if (r6 == 0) goto L_0x0060
            android.content.res.AssetManager r1 = r6.getAssets()     // Catch: Exception -> 0x005b, all -> 0x005f
            if (r1 == 0) goto L_0x0060
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: Exception -> 0x005b, all -> 0x005f
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r6, r7)     // Catch: Exception -> 0x005b, all -> 0x005f
            java.util.List r6 = tb.uy4.b(r6)     // Catch: Exception -> 0x005b, all -> 0x005f
            goto L_0x0061
        L_0x005b:
            r6 = move-exception
            r6.printStackTrace()     // Catch: all -> 0x005f
        L_0x005f:
            return r2
        L_0x0060:
            r6 = r2
        L_0x0061:
            if (r6 != 0) goto L_0x0064
            return r2
        L_0x0064:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x006d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0089
            java.lang.Object r1 = r6.next()
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r0.length
            int r4 = r1.length
            if (r3 == r4) goto L_0x007e
            return r2
        L_0x007e:
            java.lang.String r3 = "_key"
            r5.c(r7, r0, r1, r3)
            java.lang.String r3 = "_AndroidKey"
            r5.c(r7, r0, r1, r3)
            goto L_0x006d
        L_0x0089:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cvv.b(android.content.Context, java.lang.String):java.util.Map");
    }

    public final void c(Map<String, Map<String, String>> map, String[] strArr, String[] strArr2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5045fea4", new Object[]{this, map, strArr, strArr2, str});
            return;
        }
        HashMap hashMap = new HashMap();
        String str2 = null;
        for (int i = 0; i < strArr.length; i++) {
            if (!str.equals(strArr[i])) {
                hashMap.put(strArr[i], strArr2[i]);
            } else if (str2 == null) {
                str2 = strArr2[i];
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2.startsWith("[") && str2.endsWith("]")) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            map.put(str2, hashMap);
        }
    }
}
