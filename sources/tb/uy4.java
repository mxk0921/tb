package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uy4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f29670a = Charset.forName("UTF-8");

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("678a6611", new Object[]{str})).booleanValue();
        }
        if (str == null || !str.matches(".*.csv")) {
            return false;
        }
        return true;
    }

    public static List<String[]> b(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b3dac7f1", new Object[]{inputStream});
        }
        return c(inputStream, f29670a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String[]> c(java.io.InputStream r4, java.nio.charset.Charset r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.uy4.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "bec6f363"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.util.List r4 = (java.util.List) r4
            return r4
        L_0x0018:
            r0 = 0
            if (r4 == 0) goto L_0x0054
            tb.vy4 r1 = new tb.vy4     // Catch: all -> 0x0041, Exception -> 0x0043
            r2 = 44
            r1.<init>(r4, r2, r5)     // Catch: all -> 0x0041, Exception -> 0x0043
            r1.j()     // Catch: all -> 0x0038, Exception -> 0x003b
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: all -> 0x0038, Exception -> 0x003b
            r4.<init>()     // Catch: all -> 0x0038, Exception -> 0x003b
        L_0x002a:
            boolean r5 = r1.k()     // Catch: all -> 0x0038, Exception -> 0x003b
            if (r5 == 0) goto L_0x003d
            java.lang.String[] r5 = r1.i()     // Catch: all -> 0x0038, Exception -> 0x003b
            r4.add(r5)     // Catch: all -> 0x0038, Exception -> 0x003b
            goto L_0x002a
        L_0x0038:
            r4 = move-exception
            r0 = r1
            goto L_0x004e
        L_0x003b:
            r4 = move-exception
            goto L_0x0045
        L_0x003d:
            r1.c()
            return r4
        L_0x0041:
            r4 = move-exception
            goto L_0x004e
        L_0x0043:
            r4 = move-exception
            r1 = r0
        L_0x0045:
            r4.printStackTrace()     // Catch: all -> 0x0038
            if (r1 == 0) goto L_0x0054
            r1.c()
            goto L_0x0054
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.c()
        L_0x0053:
            throw r4
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uy4.c(java.io.InputStream, java.nio.charset.Charset):java.util.List");
    }

    public static String[] d(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("aed95e2b", new Object[]{inputStream});
        }
        return e(inputStream, f29670a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] e(java.io.InputStream r4, java.nio.charset.Charset r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.uy4.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "aed9b9f9"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
        L_0x0018:
            r0 = 0
            if (r4 == 0) goto L_0x0045
            tb.vy4 r1 = new tb.vy4     // Catch: all -> 0x0032, Exception -> 0x0034
            r2 = 44
            r1.<init>(r4, r2, r5)     // Catch: all -> 0x0032, Exception -> 0x0034
            r1.j()     // Catch: all -> 0x002d, Exception -> 0x0030
            java.lang.String[] r4 = r1.h()     // Catch: all -> 0x002d, Exception -> 0x0030
            r1.c()
            return r4
        L_0x002d:
            r4 = move-exception
            r0 = r1
            goto L_0x003f
        L_0x0030:
            r4 = move-exception
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            goto L_0x003f
        L_0x0034:
            r4 = move-exception
            r1 = r0
        L_0x0036:
            r4.printStackTrace()     // Catch: all -> 0x002d
            if (r1 == 0) goto L_0x0045
            r1.c()
            goto L_0x0045
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.c()
        L_0x0044:
            throw r4
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uy4.e(java.io.InputStream, java.nio.charset.Charset):java.lang.String[]");
    }
}
