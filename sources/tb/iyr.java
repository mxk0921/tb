package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iyr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991548);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.iyr.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "b99b610c"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0015:
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: all -> 0x004f, Exception -> 0x0051
            android.app.Application r3 = tb.lvr.b     // Catch: all -> 0x004f, Exception -> 0x0051
            android.content.res.Resources r3 = r3.getResources()     // Catch: all -> 0x004f, Exception -> 0x0051
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: all -> 0x004f, Exception -> 0x0051
            java.io.InputStream r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_open(r3, r6)     // Catch: all -> 0x004f, Exception -> 0x0051
            r2.<init>(r6)     // Catch: all -> 0x004f, Exception -> 0x0051
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x003d, Exception -> 0x0040
            r6.<init>()     // Catch: all -> 0x003d, Exception -> 0x0040
            r3 = 2096(0x830, float:2.937E-42)
            byte[] r3 = new byte[r3]     // Catch: all -> 0x003d, Exception -> 0x0040
        L_0x0032:
            int r4 = r2.read(r3)     // Catch: all -> 0x003d, Exception -> 0x0040
            r5 = -1
            if (r4 == r5) goto L_0x0042
            r6.write(r3, r0, r4)     // Catch: all -> 0x003d, Exception -> 0x0040
            goto L_0x0032
        L_0x003d:
            r6 = move-exception
            r1 = r2
            goto L_0x0061
        L_0x0040:
            r6 = move-exception
            goto L_0x0053
        L_0x0042:
            java.lang.String r6 = r6.toString()     // Catch: all -> 0x003d, Exception -> 0x0040
            r2.close()     // Catch: IOException -> 0x004a
            goto L_0x004e
        L_0x004a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004e:
            return r6
        L_0x004f:
            r6 = move-exception
            goto L_0x0061
        L_0x0051:
            r6 = move-exception
            r2 = r1
        L_0x0053:
            r6.printStackTrace()     // Catch: all -> 0x003d
            if (r2 == 0) goto L_0x0060
            r2.close()     // Catch: IOException -> 0x005c
            goto L_0x0060
        L_0x005c:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0060:
            return r1
        L_0x0061:
            if (r1 == 0) goto L_0x006b
            r1.close()     // Catch: IOException -> 0x0067
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iyr.a(java.lang.String):java.lang.String");
    }
}
