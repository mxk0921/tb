package com.taobao.cameralink.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.ut.device.UTDevice;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONObject;
import tb.bbi;
import tb.ozd;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Context application;
    private static Handler mainHandler = new Handler(Looper.getMainLooper());

    static {
        t2o.a(394264588);
    }

    private static boolean checkZipWholeness(ZipFile zipFile, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5125ee4", new Object[]{zipFile, str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && zipFile != null) {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    if (!new File(str, ((ZipEntry) entries.nextElement()).getName()).exists()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> boolean compareMap(java.util.Map<K, V> r6, java.util.Map<K, V> r7) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.cameralink.manager.Utils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "fc664022"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            if (r6 == 0) goto L_0x0027
            int r2 = r6.size()
            if (r2 > 0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            r3 = 0
            goto L_0x0029
        L_0x0027:
            r2 = 0
        L_0x0028:
            r3 = 1
        L_0x0029:
            if (r7 == 0) goto L_0x0034
            int r4 = r7.size()
            if (r4 > 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            r5 = 0
            goto L_0x0036
        L_0x0034:
            r4 = 0
        L_0x0035:
            r5 = 1
        L_0x0036:
            if (r3 == 0) goto L_0x0039
            return r5
        L_0x0039:
            if (r3 != 0) goto L_0x003e
            if (r5 == 0) goto L_0x003e
            return r1
        L_0x003e:
            if (r2 == r4) goto L_0x0041
            return r1
        L_0x0041:
            java.util.Set r2 = r6.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0049:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r2.next()
            boolean r4 = r7.containsKey(r3)
            if (r4 != 0) goto L_0x005a
            return r1
        L_0x005a:
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r3 = r7.get(r3)
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0049
            return r1
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.cameralink.manager.Utils.compareMap(java.util.Map, java.util.Map):boolean");
    }

    private static void createDir(File file) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deec556f", new Object[]{file});
        } else if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Can not create dir " + file);
        }
    }

    private static int degreesToExif(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de5faa5d", new Object[]{new Integer(i)})).intValue();
        }
        if (i == 90) {
            return 6;
        }
        if (i == 180) {
            return 3;
        }
        if (i != 270) {
            return 0;
        }
        return 8;
    }

    public static boolean deleteDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d8c8424", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (list == null || list.length <= 0) {
                file.delete();
                return true;
            }
            for (String str : list) {
                if (!deleteDir(new File(file, str))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static synchronized Context getApplication() {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("d3bbff99", new Object[0]);
            }
            return application;
        }
    }

    public static String getDefaultUploadFileName() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19a086a6", new Object[0]);
        }
        try {
            String userId = Login.getUserId();
            if (TextUtils.isEmpty(userId)) {
                userId = UTDevice.getUtdid(getApplication());
            }
            str = bbi.c(userId);
        } catch (Throwable th) {
            th.printStackTrace();
            str = "Unknown";
        }
        try {
            str2 = UUID.randomUUID().toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            str2 = "";
        }
        return str + "_" + str2;
    }

    public static String getOssKey(ozd ozdVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c10e28f", new Object[]{ozdVar});
        }
        try {
            return new JSONObject(ozdVar.b()).getString("ossObjectKey");
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getUrlWithEXIFAutoRotation(ozd ozdVar) throws Throwable {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a55f5265", new Object[]{ozdVar});
        }
        try {
            if (ozdVar.a().contains("x-oss-process=style/auto-ori")) {
                return ozdVar.a();
            }
            String a2 = ozdVar.a();
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            if (a2.contains("?")) {
                str = "&x-oss-process=style/auto-ori";
            } else {
                str = "?x-oss-process=style/auto-ori";
            }
            sb.append(str);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void runInMainThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3b02d8", new Object[]{runnable});
        } else if (runnable != null) {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                mainHandler.post(runnable);
            }
        }
    }

    public static synchronized void setApplication(Context context) {
        synchronized (Utils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4043053", new Object[]{context});
            } else {
                application = context.getApplicationContext();
            }
        }
    }

    public static void traceLog(String str, String str2, String[] strArr, String[] strArr2, boolean[] zArr) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bf2a959", new Object[]{str, str2, strArr, strArr2, zArr});
        } else if (strArr != null && strArr2 != null && zArr != null) {
            DimensionSet create = DimensionSet.create();
            MeasureSet create2 = MeasureSet.create();
            for (int i = 0; i < strArr.length; i++) {
                if (!zArr[i]) {
                    create2.addMeasure(strArr[i]);
                } else {
                    create.addDimension(new Dimension(strArr[i], ""));
                }
            }
            AppMonitor.register(str, str2, create2, create);
            DimensionValueSet create3 = DimensionValueSet.create();
            MeasureValueSet create4 = MeasureValueSet.create();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (!zArr[i2]) {
                    try {
                        d = Double.parseDouble(strArr2[i2]);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        d = -1.0d;
                    }
                    create4.setValue(strArr[i2], d);
                } else {
                    create3.setValue(strArr[i2], strArr2[i2]);
                }
            }
            AppMonitor.Stat.commit(str, str2, create3, create4);
        }
    }

    private static void unzipEntry(ZipFile zipFile, ZipEntry zipEntry, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccbb581b", new Object[]{zipFile, zipEntry, str});
            return;
        }
        String name = zipEntry.getName();
        if (!TextUtils.isEmpty(name) && name.contains("../")) {
            throw new IOException("the name of zip entry contain \"../\", it has potential safety hazards...");
        } else if (zipEntry.isDirectory()) {
            createDir(new File(str, name));
        } else {
            File file = new File(str, name);
            if (!file.getParentFile().exists()) {
                createDir(file.getParentFile());
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            byte[] bArr = new byte[4096];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    return;
                }
            }
        }
    }

    public static boolean unzipToFolder(String str, String str2) throws Throwable {
        boolean z;
        ZipFile zipFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6e6fdf0", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            File file2 = new File(str2);
            try {
                z = !checkZipWholeness(new ZipFile(file), file2.getAbsolutePath());
            } catch (Throwable unused) {
                z = true;
            }
            if (!z) {
                return true;
            }
            deleteDir(file2);
            String concat = str2.concat("_tmp");
            File file3 = new File(concat);
            ZipFile zipFile2 = null;
            try {
                zipFile = new ZipFile(file);
            } catch (Throwable unused2) {
            }
            try {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    unzipEntry(zipFile, (ZipEntry) entries.nextElement(), concat);
                }
                boolean checkZipWholeness = checkZipWholeness(zipFile, concat);
                if (checkZipWholeness) {
                    file3.renameTo(file2);
                } else {
                    try {
                        file.delete();
                    } catch (Throwable unused3) {
                    }
                }
                try {
                    if (file3.exists()) {
                        file3.delete();
                    }
                } catch (Throwable unused4) {
                }
                if (!checkZipWholeness) {
                    try {
                        if (file2.exists()) {
                            deleteDir(file2);
                        }
                    } catch (Throwable unused5) {
                    }
                }
                try {
                    zipFile.close();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return checkZipWholeness;
            } catch (Throwable unused6) {
                zipFile2 = zipFile;
                try {
                    if (file3.exists()) {
                        file3.delete();
                    }
                } catch (Throwable unused7) {
                }
                try {
                    if (file2.exists()) {
                        deleteDir(file2);
                    }
                } catch (Throwable unused8) {
                }
                try {
                    zipFile2.close();
                    return false;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    return false;
                }
            }
        } else {
            throw new Throwable("需要被解压的文件不存在");
        }
    }
}
