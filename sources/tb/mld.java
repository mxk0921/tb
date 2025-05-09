package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class mld {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481297603);
    }

    public static void a(Context context) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e06da5", new Object[]{context});
            return;
        }
        File c = c(context);
        if (c.exists() && c.isDirectory() && (listFiles = c.listFiles()) != null) {
            for (File file : listFiles) {
                if (e(file)) {
                    agh.h("MediaUtil", "delete " + file.getAbsolutePath());
                    yf9.c(file);
                }
            }
        }
    }

    public static File b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d818eb68", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("image_search");
        sb.append(str2);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    public static File c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("a5619411", new Object[]{context});
        }
        return b(context, q5c.HISTORY);
    }

    public static String d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72f8c33e", new Object[]{new Integer(i)});
        }
        if (i >= 10) {
            return String.valueOf(i);
        }
        return "0" + i;
    }

    public static String f(Context context, String str, String str2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5aa8ce48", new Object[]{context, str, str2});
        }
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(b(context, str2), str2 + "_tmp" + System.currentTimeMillis() + ".txt");
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                bufferedWriter2.write(str);
                String absolutePath = file.getAbsolutePath();
                e2d.a(bufferedWriter2);
                return absolutePath;
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    e2d.a(bufferedWriter);
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                if (bufferedWriter != null) {
                    e2d.a(bufferedWriter);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String g(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a471789", new Object[]{context, bitmap, str});
        }
        return h(context, bitmap, "imagesearch_tmp" + System.currentTimeMillis() + ".jpg", str);
    }

    public static String h(Context context, Bitmap bitmap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a43f2bf", new Object[]{context, bitmap, str, str2});
        }
        File file = new File(b(context, str2), str);
        try {
            m(bitmap, file, Bitmap.CompressFormat.JPEG, 90);
            return file.getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String i(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c45de41", new Object[]{context, bitmap, str});
        }
        try {
            File file = new File(b(context, str), "imagesearch_tmp" + System.currentTimeMillis() + ".png");
            m(bitmap, file, Bitmap.CompressFormat.PNG, 100);
            return file.getPath();
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized String j(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, String str) {
        synchronized (mld.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15b093e5", new Object[]{context, bitmap, compressFormat, new Integer(i), str});
            } else if (context == null) {
                Log.e("MediaUtil", "saveTmp(), context is null");
                return "";
            } else {
                File file = new File(c(context), str);
                if (file.exists() || !m(bitmap, file, compressFormat, i)) {
                    return "";
                }
                return file.getPath();
            }
        }
    }

    public static synchronized String k(Context context, Bitmap bitmap, int i) {
        synchronized (mld.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a4f8e9c6", new Object[]{context, bitmap, new Integer(i)});
            }
            String j = j(context, bitmap, Bitmap.CompressFormat.JPEG, i, "imagesearch_tmp" + System.currentTimeMillis() + ".jpg");
            if (!TextUtils.isEmpty(j)) {
                tie.e().c(j);
            }
            return j;
        }
    }

    public static String l(long j) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b13bc47c", new Object[]{new Long(j)});
        }
        int i2 = (int) (j / 1000);
        int i3 = i2 / ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
        int i4 = (i2 - (i3 * ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT)) / 60;
        String str = d(i4) + ":" + d(i - (i4 * 60));
        if (i3 == 0) {
            return str;
        }
        return d(i3) + ":" + str;
    }

    public static String n(Context context, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7fc4a562", new Object[]{context, strArr, str});
        }
        byte[] bArr = new byte[1024];
        File file = new File(b(context, str), str + "_tmp" + System.currentTimeMillis() + ".zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            for (String str2 : strArr) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(str2);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry(str2.substring(str2.lastIndexOf("/") + 1)));
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } catch (IOException unused) {
                }
            }
            String absolutePath = file.getAbsolutePath();
            zipOutputStream.close();
            fileOutputStream.close();
            return absolutePath;
        } catch (IOException unused2) {
            yf9.c(file);
            return "";
        }
    }

    public static boolean e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f1bdee", new Object[]{file})).booleanValue();
        }
        String name = file.getName();
        if (!TextUtils.isEmpty(name) && name.startsWith("imagesearch_tmp")) {
            return yf9.h(file.getAbsolutePath());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r3 == null) goto L_0x0065;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        tb.e2d.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r3 == null) goto L_0x0065;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean m(android.graphics.Bitmap r6, java.io.File r7, android.graphics.Bitmap.CompressFormat r8, int r9) {
        /*
            r0 = 1
            r1 = 0
            java.lang.Class<tb.mld> r2 = tb.mld.class
            monitor-enter(r2)
            com.android.alibaba.ip.runtime.IpChange r3 = tb.mld.$ipChange     // Catch: all -> 0x002b
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x002b
            if (r4 == 0) goto L_0x002d
            java.lang.String r4 = "4731ad29"
            java.lang.Integer r5 = new java.lang.Integer     // Catch: all -> 0x002b
            r5.<init>(r9)     // Catch: all -> 0x002b
            r9 = 4
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: all -> 0x002b
            r9[r1] = r6     // Catch: all -> 0x002b
            r9[r0] = r7     // Catch: all -> 0x002b
            r6 = 2
            r9[r6] = r8     // Catch: all -> 0x002b
            r6 = 3
            r9[r6] = r5     // Catch: all -> 0x002b
            java.lang.Object r6 = r3.ipc$dispatch(r4, r9)     // Catch: all -> 0x002b
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: all -> 0x002b
            boolean r6 = r6.booleanValue()     // Catch: all -> 0x002b
            monitor-exit(r2)
            return r6
        L_0x002b:
            r6 = move-exception
            goto L_0x007e
        L_0x002d:
            if (r6 == 0) goto L_0x007c
            r3 = 0
            boolean r4 = r6.isRecycled()     // Catch: all -> 0x004f, IOException -> 0x0051, FileNotFoundException -> 0x0053
            if (r4 == 0) goto L_0x0037
            goto L_0x007c
        L_0x0037:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: all -> 0x004f, IOException -> 0x0051, FileNotFoundException -> 0x0053
            r4.<init>(r7)     // Catch: all -> 0x004f, IOException -> 0x0051, FileNotFoundException -> 0x0053
            r6.compress(r8, r9, r4)     // Catch: all -> 0x0046, IOException -> 0x0049, FileNotFoundException -> 0x004c
            r4.flush()     // Catch: all -> 0x0046, IOException -> 0x0049, FileNotFoundException -> 0x004c
            tb.e2d.a(r4)     // Catch: all -> 0x002b
            goto L_0x0074
        L_0x0046:
            r6 = move-exception
            r3 = r4
            goto L_0x0076
        L_0x0049:
            r6 = move-exception
            r3 = r4
            goto L_0x0055
        L_0x004c:
            r6 = move-exception
            r3 = r4
            goto L_0x0067
        L_0x004f:
            r6 = move-exception
            goto L_0x0076
        L_0x0051:
            r6 = move-exception
            goto L_0x0055
        L_0x0053:
            r6 = move-exception
            goto L_0x0067
        L_0x0055:
            java.lang.String r7 = "MediaUtil"
            java.lang.String r8 = "writeBitmapStreamToFile(), "
            android.util.Log.e(r7, r8, r6)     // Catch: all -> 0x004f
            r6.printStackTrace()     // Catch: all -> 0x004f
            if (r3 == 0) goto L_0x0065
        L_0x0062:
            tb.e2d.a(r3)     // Catch: all -> 0x002b
        L_0x0065:
            r0 = 0
            goto L_0x0074
        L_0x0067:
            java.lang.String r7 = "MediaUtil"
            java.lang.String r8 = "file not found "
            android.util.Log.e(r7, r8, r6)     // Catch: all -> 0x004f
            r6.printStackTrace()     // Catch: all -> 0x004f
            if (r3 == 0) goto L_0x0065
            goto L_0x0062
        L_0x0074:
            monitor-exit(r2)
            return r0
        L_0x0076:
            if (r3 == 0) goto L_0x007b
            tb.e2d.a(r3)     // Catch: all -> 0x002b
        L_0x007b:
            throw r6     // Catch: all -> 0x002b
        L_0x007c:
            monitor-exit(r2)
            return r1
        L_0x007e:
            monitor-exit(r2)     // Catch: all -> 0x002b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mld.m(android.graphics.Bitmap, java.io.File, android.graphics.Bitmap$CompressFormat, int):boolean");
    }
}
