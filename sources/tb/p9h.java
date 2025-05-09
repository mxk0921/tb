package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p9h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final srd f25962a = new pdq();

    public static void a(InputStream inputStream, File file) {
        Throwable th;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a8f1d28", new Object[]{inputStream, file});
            return;
        }
        byte[] bArr = new byte[1024];
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005e, code lost:
        a(r2.getInputStream(r1), r8);
     */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File b(android.content.Context r6, java.lang.String r7, java.io.File r8) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.p9h.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "600f4ce0"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r6 = 1
            r2[r6] = r7
            r6 = 2
            r2[r6] = r8
            java.lang.Object r6 = r0.ipc$dispatch(r1, r2)
            java.io.File r6 = (java.io.File) r6
            return r6
        L_0x001b:
            java.io.File r0 = new java.io.File
            android.content.pm.ApplicationInfo r1 = r6.getApplicationInfo()
            java.lang.String r1 = r1.sourceDir
            r0.<init>(r1)
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch: all -> 0x0070, Exception -> 0x0072
            r2.<init>(r0)     // Catch: all -> 0x0070, Exception -> 0x0072
            java.util.Enumeration r0 = r2.entries()     // Catch: all -> 0x0066, Exception -> 0x0069
        L_0x0030:
            boolean r1 = r0.hasMoreElements()     // Catch: all -> 0x0066, Exception -> 0x0069
            if (r1 == 0) goto L_0x006c
            java.lang.Object r1 = r0.nextElement()     // Catch: all -> 0x0066, Exception -> 0x0069
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.String r3 = r1.getName()     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0066, Exception -> 0x0069
            r4.<init>()     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.String r5 = tb.mw4.b(r6)     // Catch: all -> 0x0066, Exception -> 0x0069
            r4.append(r5)     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch: all -> 0x0066, Exception -> 0x0069
            r4.append(r7)     // Catch: all -> 0x0066, Exception -> 0x0069
            java.lang.String r4 = r4.toString()     // Catch: all -> 0x0066, Exception -> 0x0069
            boolean r3 = r3.endsWith(r4)     // Catch: all -> 0x0066, Exception -> 0x0069
            if (r3 == 0) goto L_0x0030
            java.io.InputStream r6 = r2.getInputStream(r1)     // Catch: all -> 0x0066, Exception -> 0x0069
            a(r6, r8)     // Catch: all -> 0x0066, Exception -> 0x0069
            goto L_0x006c
        L_0x0066:
            r6 = move-exception
            r1 = r2
            goto L_0x007c
        L_0x0069:
            r6 = move-exception
            r1 = r2
            goto L_0x0073
        L_0x006c:
            r2.close()
            goto L_0x007b
        L_0x0070:
            r6 = move-exception
            goto L_0x007c
        L_0x0072:
            r6 = move-exception
        L_0x0073:
            r6.printStackTrace()     // Catch: all -> 0x0070
            if (r1 == 0) goto L_0x007b
            r1.close()
        L_0x007b:
            return r8
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r1.close()
        L_0x0081:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p9h.b(android.content.Context, java.lang.String, java.io.File):java.io.File");
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78241a1e", new Object[]{str});
        }
        return ((pdq) f25962a).a(str);
    }

    public static File d(Context context, String str) throws Exception {
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("7613eb42", new Object[]{context, str});
        }
        File file2 = new File(context.getApplicationInfo().nativeLibraryDir, c(str));
        if (file2.exists()) {
            return file2;
        }
        if (bcq.b()) {
            file = bcq.a().e().K(str);
        } else {
            file = new jcq(context).K(str);
        }
        return b(context, c(str), file);
    }

    public static boolean e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28f2471a", new Object[]{context, str})).booleanValue();
        }
        return ((pdq) f25962a).d(context, str);
    }

    public static boolean f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7163a936", new Object[]{context, str})).booleanValue();
        }
        pdq pdqVar = (pdq) f25962a;
        boolean h = pdqVar.h(context, str);
        boolean z = true ^ (h ? 1 : 0);
        pdqVar.g(context, str, h ? 1 : 0);
        return z;
    }
}
