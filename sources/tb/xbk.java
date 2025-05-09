package tb;

import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class xbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final a f31269a = c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f31270a;

        public String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6a58234d", new Object[]{this, str});
            }
            return xbk.b(str);
        }
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a34444e9", new Object[0]);
        }
        return f31269a;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r6) {
        /*
            java.lang.String r0 = "Unable to read prop "
            java.lang.String r1 = "getprop "
            com.android.alibaba.ip.runtime.IpChange r2 = tb.xbk.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.String r0 = "a117df07"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r0, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x001a:
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: all -> 0x004f, IOException -> 0x0051
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x004f, IOException -> 0x0051
            r4.<init>(r1)     // Catch: all -> 0x004f, IOException -> 0x0051
            r4.append(r6)     // Catch: all -> 0x004f, IOException -> 0x0051
            java.lang.String r1 = r4.toString()     // Catch: all -> 0x004f, IOException -> 0x0051
            java.lang.Process r1 = r3.exec(r1)     // Catch: all -> 0x004f, IOException -> 0x0051
            if (r1 == 0) goto L_0x0054
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: all -> 0x004f, IOException -> 0x0051
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: all -> 0x004f, IOException -> 0x0051
            java.io.InputStream r1 = r1.getInputStream()     // Catch: all -> 0x004f, IOException -> 0x0051
            r4.<init>(r1)     // Catch: all -> 0x004f, IOException -> 0x0051
            r1 = 1024(0x400, float:1.435E-42)
            r3.<init>(r4, r1)     // Catch: all -> 0x004f, IOException -> 0x0051
            java.lang.String r1 = r3.readLine()     // Catch: all -> 0x004a, IOException -> 0x004d
            r3.close()     // Catch: all -> 0x004a, IOException -> 0x004d
            r2 = r3
            goto L_0x0055
        L_0x004a:
            r6 = move-exception
            r2 = r3
            goto L_0x007c
        L_0x004d:
            r1 = move-exception
            goto L_0x0060
        L_0x004f:
            r6 = move-exception
            goto L_0x007c
        L_0x0051:
            r1 = move-exception
            r3 = r2
            goto L_0x0060
        L_0x0054:
            r1 = r2
        L_0x0055:
            if (r2 == 0) goto L_0x005f
            r2.close()     // Catch: IOException -> 0x005b
            goto L_0x005f
        L_0x005b:
            r6 = move-exception
            r6.printStackTrace()
        L_0x005f:
            return r1
        L_0x0060:
            java.lang.String r4 = "AndroidOSUtils"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x004a
            r5.<init>(r0)     // Catch: all -> 0x004a
            r5.append(r6)     // Catch: all -> 0x004a
            java.lang.String r6 = r5.toString()     // Catch: all -> 0x004a
            android.util.Log.e(r4, r6, r1)     // Catch: all -> 0x004a
            if (r3 == 0) goto L_0x007b
            r3.close()     // Catch: IOException -> 0x0077
            goto L_0x007b
        L_0x0077:
            r6 = move-exception
            r6.printStackTrace()
        L_0x007b:
            return r2
        L_0x007c:
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch: IOException -> 0x0082
            goto L_0x0086
        L_0x0082:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0086:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xbk.b(java.lang.String):java.lang.String");
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1b4686bd", new Object[0]);
        }
        return d();
    }

    public static a d() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("52abd673", new Object[0]);
        }
        a aVar = new a();
        String str2 = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str2)) {
            str = "unknown";
        } else {
            str = str2.toLowerCase();
        }
        aVar.f31270a = str;
        return aVar;
    }
}
