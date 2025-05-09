package com.loc;

import android.content.Context;
import android.net.Proxy;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class v {
    private static String a() {
        String str;
        try {
            str = Proxy.getDefaultHost();
        } catch (Throwable th) {
            av.b(th, "pu", "gdh");
            str = null;
        }
        return str == null ? "null" : str;
    }

    private static int b() {
        try {
            return Proxy.getDefaultPort();
        } catch (Throwable th) {
            av.b(th, "pu", "gdp");
            return -1;
        }
    }

    private static boolean c(Context context) {
        if (o.j(context) == 0) {
            return true;
        }
        return false;
    }

    private static String a(String str) {
        return x.c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r12 == (-1)) goto L_0x00b8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
        if (r12 == (-1)) goto L_0x00b8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b8, code lost:
        r18 = 80;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bb, code lost:
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00e4, blocks: (B:63:0x00df, B:94:0x0149), top: B:114:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe A[Catch: all -> 0x00ea, TryCatch #10 {all -> 0x00ea, blocks: (B:61:0x00d5, B:70:0x00f3, B:72:0x00fe, B:74:0x0112, B:76:0x0118, B:80:0x0123, B:83:0x012a, B:85:0x0130, B:87:0x0136, B:91:0x0141), top: B:118:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0149 A[Catch: all -> 0x00e4, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00e4, blocks: (B:63:0x00df, B:94:0x0149), top: B:114:0x002d }] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r10v52 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.content.ContentResolver, android.database.Cursor] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.Proxy b(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.v.b(android.content.Context):java.net.Proxy");
    }

    public static java.net.Proxy a(Context context) {
        try {
            return a(context, new URI("http://restsdk.amap.com"));
        } catch (Throwable th) {
            av.b(th, "pu", "gp");
            return null;
        }
    }

    private static java.net.Proxy a(Context context, URI uri) {
        java.net.Proxy proxy;
        if (c(context)) {
            try {
                List<java.net.Proxy> select = ProxySelector.getDefault().select(uri);
                if (select == null || select.isEmpty() || (proxy = select.get(0)) == null) {
                    return null;
                }
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                return proxy;
            } catch (Throwable th) {
                av.b(th, "pu", "gpsc");
            }
        }
        return null;
    }
}
