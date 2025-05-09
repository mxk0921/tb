package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k2s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c538008", new Object[]{classLoader, file});
            } else {
                b(classLoader, file);
            }
        }

        public static void b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = ckp.a(classLoader, "pathList").get(classLoader);
            Field a2 = ckp.a(obj, "nativeLibraryDirectories");
            File[] fileArr = (File[]) a2.get(obj);
            for (File file2 : fileArr) {
                if (file.equals(file2)) {
                    return;
                }
            }
            ArrayList arrayList = new ArrayList(fileArr.length + 1);
            arrayList.add(file);
            for (File file3 : fileArr) {
                if (!file.equals(file3)) {
                    arrayList.add(file3);
                }
            }
            a2.set(obj, arrayList.toArray(new File[0]));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r5 == 0) goto L_0x003a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(java.lang.ClassLoader r6, java.io.File r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "installNativeLibraryPath, folder %s is illegal"
            java.lang.String r1 = "installNativeLibraryPath, v23 fail, sdk: %d, error: %s, try to fallback to V14"
            java.lang.String r2 = "installNativeLibraryPath, v25 fail, sdk: %d, error: %s, try to fallback to V23"
            java.lang.Class<tb.k2s> r3 = tb.k2s.class
            monitor-enter(r3)
            com.android.alibaba.ip.runtime.IpChange r4 = tb.k2s.$ipChange     // Catch: all -> 0x0022
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x0022
            if (r5 == 0) goto L_0x0025
            java.lang.String r0 = "ab4d536c"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: all -> 0x0022
            r2 = 0
            r1[r2] = r6     // Catch: all -> 0x0022
            r6 = 1
            r1[r6] = r7     // Catch: all -> 0x0022
            r4.ipc$dispatch(r0, r1)     // Catch: all -> 0x0022
            monitor-exit(r3)
            return
        L_0x0022:
            r6 = move-exception
            goto L_0x0098
        L_0x0025:
            if (r7 == 0) goto L_0x0087
            boolean r4 = r7.exists()     // Catch: all -> 0x0022
            if (r4 != 0) goto L_0x002e
            goto L_0x0087
        L_0x002e:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0022
            r4 = 25
            if (r0 != r4) goto L_0x003a
            int r5 = tb.wwr.a()     // Catch: all -> 0x0022
            if (r5 != 0) goto L_0x003c
        L_0x003a:
            if (r0 <= r4) goto L_0x005d
        L_0x003c:
            tb.k2s.c.a(r6, r7)     // Catch: all -> 0x0040
            goto L_0x0085
        L_0x0040:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x0022
            r1.<init>(r2)     // Catch: all -> 0x0022
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0022
            r1.append(r2)     // Catch: all -> 0x0022
            java.lang.String r0 = r0.getMessage()     // Catch: all -> 0x0022
            r1.append(r0)     // Catch: all -> 0x0022
            java.lang.String r0 = r1.toString()     // Catch: all -> 0x0022
            com.taobao.android.remoteso.log.RSoLog.d(r0)     // Catch: all -> 0x0022
            tb.k2s.b.a(r6, r7)     // Catch: all -> 0x0022
            goto L_0x0085
        L_0x005d:
            r2 = 23
            if (r0 < r2) goto L_0x0082
            tb.k2s.b.a(r6, r7)     // Catch: all -> 0x0065
            goto L_0x0085
        L_0x0065:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0022
            r2.<init>(r1)     // Catch: all -> 0x0022
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x0022
            r2.append(r1)     // Catch: all -> 0x0022
            java.lang.String r0 = r0.getMessage()     // Catch: all -> 0x0022
            r2.append(r0)     // Catch: all -> 0x0022
            java.lang.String r0 = r2.toString()     // Catch: all -> 0x0022
            com.taobao.android.remoteso.log.RSoLog.d(r0)     // Catch: all -> 0x0022
            tb.k2s.a.a(r6, r7)     // Catch: all -> 0x0022
            goto L_0x0085
        L_0x0082:
            tb.k2s.a.a(r6, r7)     // Catch: all -> 0x0022
        L_0x0085:
            monitor-exit(r3)
            return
        L_0x0087:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: all -> 0x0022
            r6.<init>(r0)     // Catch: all -> 0x0022
            r6.append(r7)     // Catch: all -> 0x0022
            java.lang.String r6 = r6.toString()     // Catch: all -> 0x0022
            com.taobao.android.remoteso.log.RSoLog.d(r6)     // Catch: all -> 0x0022
            monitor-exit(r3)
            return
        L_0x0098:
            monitor-exit(r3)     // Catch: all -> 0x0022
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.k2s.a(java.lang.ClassLoader, java.io.File):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("167aad4a", new Object[]{classLoader, file});
            } else {
                b(classLoader, file);
            }
        }

        public static void b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = ckp.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) ckp.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(0, file);
            List list2 = (List) ckp.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            ckp.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) ckp.b(obj, "makePathElements", List.class).invoke(obj, arrayList));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ void a(ClassLoader classLoader, File file) throws Throwable {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d96716a9", new Object[]{classLoader, file});
            } else {
                b(classLoader, file);
            }
        }

        public static void b(ClassLoader classLoader, File file) throws Throwable {
            Object obj = ckp.a(classLoader, "pathList").get(classLoader);
            List<File> list = (List) ckp.a(obj, "nativeLibraryDirectories").get(obj);
            if (list == null) {
                list = new ArrayList(2);
            }
            for (File file2 : list) {
                if (file.equals(file2)) {
                    return;
                }
            }
            list.add(0, file);
            List list2 = (List) ckp.a(obj, "systemNativeLibraryDirectories").get(obj);
            if (list2 == null) {
                list2 = new ArrayList(2);
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size() + 1);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            ckp.a(obj, "nativeLibraryPathElements").set(obj, (Object[]) ckp.b(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, arrayList, null, new ArrayList()));
        }
    }
}
