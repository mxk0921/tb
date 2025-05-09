package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TLogNative;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b5s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_SUFFIX_DATA = ".data";
    public static final String LOG_SUFFIX_TLOG = ".tlog";

    /* renamed from: a  reason: collision with root package name */
    public static File f16194a;
    public static File b;
    public static File c;
    public static File d;
    public static File e;
    public static String f;
    public static c5s g;
    public static String[] h;
    public static final AtomicBoolean i = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16195a;
        public final long b;

        static {
            t2o.a(767557738);
        }

        public a(String str, long j) {
            this.f16195a = str;
            this.b = j;
        }
    }

    static {
        t2o.a(767557737);
    }

    public static int d(int i2, int i3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bce332d", new Object[]{new Integer(i2), new Integer(i3), map})).intValue();
        }
        Log.e("TLogFileManager", String.format("Clear log storage. expected: %d, realSize:%d", Integer.valueOf(i2), Integer.valueOf(i3)));
        if (i2 < 0) {
            return -1;
        }
        AtomicBoolean atomicBoolean = i;
        if (!atomicBoolean.compareAndSet(false, true)) {
            Log.e("TLogFileManager", "Current in clear process....");
            return -1;
        }
        try {
            int clearLogFiles = TLogNative.clearLogFiles(i2);
            TLog.loge("TLogFileManager", "", String.format("Clear log storage. expected: %d, actual:%d", Integer.valueOf(i2), Integer.valueOf(clearLogFiles)));
            atomicBoolean.set(false);
            return clearLogFiles;
        } catch (Exception unused) {
            i.set(false);
            return -1;
        } catch (Throwable th) {
            i.set(false);
            throw th;
        }
    }

    public static void e(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dcdd784", new Object[]{file});
        } else if (file != null && file.isDirectory() && file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().endsWith(LOG_SUFFIX_TLOG) && System.currentTimeMillis() - file2.lastModified() > q4s.b() * 86400000) {
                    file2.delete();
                }
            }
        }
    }

    public static List<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3fa699e6", new Object[0]);
        }
        return g(null);
    }

    public static List<String> g(FilenameFilter filenameFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("74df5872", new Object[]{filenameFilter});
        }
        ArrayList arrayList = new ArrayList();
        for (String str : h) {
            List<String> k = k(str, filenameFilter);
            if (k != null) {
                arrayList.addAll(k);
            }
        }
        return arrayList;
    }

    public static File h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("ded2951", new Object[0]);
        }
        return d;
    }

    public static File i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("71a6c12d", new Object[0]);
        }
        return b;
    }

    public static File j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("50e8dcc3", new Object[0]);
        }
        return f16194a;
    }

    public static List<String> k(String str, FilenameFilter filenameFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("452a3a49", new Object[]{str, filenameFilter});
        }
        ArrayList arrayList = new ArrayList();
        File file = new File(str);
        if (file.isDirectory() && file.exists()) {
            String[] list = file.list();
            if (list == null) {
                return null;
            }
            if (filenameFilter == null) {
                filenameFilter = new FilenameFilter() { // from class: tb.y4s
                    @Override // java.io.FilenameFilter
                    public final boolean accept(File file2, String str2) {
                        boolean u;
                        u = b5s.u(file2, str2);
                        return u;
                    }
                };
            }
            for (String str2 : list) {
                if (filenameFilter.accept(file, str2)) {
                    arrayList.add(file.getAbsolutePath() + File.separator + str2);
                }
            }
        }
        return arrayList;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d1d1f5a", new Object[0]);
        }
        return f;
    }

    public static File m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("7a45ad48", new Object[0]);
        }
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> n(tb.neh[] r10) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.b5s.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "de53b987"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r10
            java.lang.Object r10 = r2.ipc$dispatch(r3, r1)
            java.util.List r10 = (java.util.List) r10
            return r10
        L_0x0015:
            if (r10 != 0) goto L_0x0019
            r10 = 0
            return r10
        L_0x0019:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r10.length
        L_0x001f:
            if (r0 >= r3) goto L_0x0081
            r4 = r10[r0]
            long r5 = r4.c
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0036
            long r7 = r4.d
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0036
            java.util.List r5 = q(r5, r7)
            goto L_0x0044
        L_0x0036:
            java.lang.Integer r5 = r4.b
            int r5 = r5.intValue()
            java.lang.String[] r5 = tb.n6s.f(r5)
            java.util.List r5 = p(r5)
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            goto L_0x007f
        L_0x0047:
            java.lang.String r6 = r4.f24680a
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x007c
            java.util.Iterator r5 = r5.iterator()
        L_0x0053:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r4.f24680a
            r7.append(r8)
            java.lang.String r8 = "_"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0053
            r2.add(r6)
            goto L_0x0053
        L_0x007c:
            r2.addAll(r5)
        L_0x007f:
            int r0 = r0 + r1
            goto L_0x001f
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.b5s.n(tb.neh[]):java.util.List");
    }

    public static List<String> o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7267eac", new Object[]{str});
        }
        return p(new String[]{str});
    }

    public static List<String> p(final String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("97c655b9", new Object[]{strArr});
        }
        if (strArr == null) {
            return null;
        }
        return g(new FilenameFilter() { // from class: tb.a5s
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean v;
                v = b5s.v(strArr, file, str);
                return v;
            }
        });
    }

    public static List<String> q(long j, long j2) {
        a aVar;
        long j3 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faafa177", new Object[]{new Long(j3), new Long(j2)});
        }
        if (j3 < 0 || j2 < 0 || j3 > j2) {
            return null;
        }
        List<String> f2 = f();
        if (f2.isEmpty()) {
            return f2;
        }
        String e2 = n6s.e(j);
        String e3 = n6s.e(j2);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : f2) {
            File file = new File(str);
            String name = file.getName();
            long lastModified = file.lastModified();
            int i2 = (lastModified > j3 ? 1 : (lastModified == j3 ? 0 : -1));
            if (i2 < 0 || lastModified > j2) {
                int lastIndexOf = name.lastIndexOf("_");
                if (lastIndexOf != -1) {
                    String substring = name.substring(0, lastIndexOf);
                    if (i2 < 0 && name.contains(e2)) {
                        a aVar2 = (a) hashMap.get(substring);
                        if (aVar2 == null || aVar2.b < lastModified) {
                            hashMap.put(substring, new a(str, lastModified));
                        }
                    } else if (lastModified > j2 && name.contains(e3) && ((aVar = (a) hashMap2.get(substring)) == null || aVar.b > lastModified)) {
                        hashMap2.put(substring, new a(str, lastModified));
                    }
                }
            } else {
                arrayList.add(str);
            }
            j3 = j;
        }
        for (a aVar3 : hashMap2.values()) {
            arrayList.add(aVar3.f16195a);
        }
        if (arrayList.isEmpty()) {
            for (a aVar4 : hashMap.values()) {
                arrayList.add(aVar4.f16195a);
            }
        }
        return arrayList;
    }

    public static File r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d5cf5cd0", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ boolean u(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76a83376", new Object[]{file, str})).booleanValue();
        }
        if (str.contains(LOG_SUFFIX_TLOG) || str.contains(LOG_SUFFIX_DATA)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean v(String[] strArr, File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bae62123", new Object[]{strArr, file, str})).booleanValue();
        }
        for (String str2 : strArr) {
            if (!str.contains("_" + str2 + LOG_SUFFIX_TLOG)) {
                if (!str.contains("_" + str2 + LOG_SUFFIX_DATA)) {
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ void w(File file, File file2, File file3, File file4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d880259", new Object[]{file, file2, file3, file4});
            return;
        }
        if (q4s.o()) {
            e(file);
            e(file2);
        } else {
            e(file3);
            e(file4);
        }
        n6s.d(c);
    }

    public static void s(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        File file = new File(context.getFilesDir(), "tlog_config");
        d = file;
        if (!file.exists()) {
            d.mkdirs();
        }
        b = new File(context.getFilesDir(), "tlog_v" + q4s.e());
        if (q4s.o()) {
            str = "tdata_v" + q4s.e();
            f = LOG_SUFFIX_DATA;
        } else {
            str = "tlog_v" + q4s.e();
            f = LOG_SUFFIX_TLOG;
        }
        if (q4s.m()) {
            f16194a = context.getDir(str, 0);
        } else {
            try {
                f16194a = context.getExternalFilesDir(str);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (f16194a == null) {
                f16194a = context.getDir(str, 0);
            }
        }
        e = context.getDir("tmini_v", 0);
        c = new File(f16194a, "upload");
        c5s c5sVar = new c5s(f16194a.getAbsolutePath());
        g = c5sVar;
        c5sVar.startWatching();
        t(context);
        f16194a.getAbsolutePath();
        b.getAbsolutePath();
    }

    public static void t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dee8ad4", new Object[]{context});
            return;
        }
        final File externalFilesDir = context.getExternalFilesDir("tdata_v9");
        final File externalFilesDir2 = context.getExternalFilesDir("tlog_v9");
        final File dir = context.getDir("tdata_v9", 0);
        final File dir2 = context.getDir("tlog_v9", 0);
        e6s.d().c(new Runnable() { // from class: tb.z4s
            @Override // java.lang.Runnable
            public final void run() {
                b5s.w(externalFilesDir2, dir2, externalFilesDir, dir);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(dir.getAbsolutePath());
        arrayList.add(dir2.getAbsolutePath());
        if (externalFilesDir != null) {
            arrayList.add(externalFilesDir.getAbsolutePath());
        }
        if (externalFilesDir2 != null) {
            arrayList.add(externalFilesDir2.getAbsolutePath());
        }
        h = (String[]) arrayList.toArray(new String[0]);
    }
}
