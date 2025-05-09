package com.taobao.orange.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.cg9;
import tb.dq3;
import tb.eal;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_DIR = "orange_config";

    /* renamed from: a  reason: collision with root package name */
    public static final File f11408a = e();
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final AtomicLong d = new AtomicLong(0);
    public static final AtomicLong e = new AtomicLong(0);
    public static final AtomicLong f = new AtomicLong(0);

    static {
        t2o.a(613417112);
    }

    public static void a(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f348242", new Object[]{file});
        } else if (file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file2.isDirectory()) {
                    a(file2);
                }
            }
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b59ac58", new Object[0]);
            return;
        }
        OLog.i(cg9.TAG, "clearCacheFile", new Object[0]);
        a(f11408a);
    }

    public static File d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d1771d9f", new Object[0]);
        }
        return f11408a;
    }

    public static File e() {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b69cda20", new Object[0]);
        }
        File file = null;
        try {
            File file2 = new File(new File(com.taobao.orange.a.g.getFilesDir(), ORANGE_DIR), com.taobao.orange.a.C.getDes());
            try {
                if (file2.exists() && file2.isFile() && !file2.delete()) {
                    OLog.w(cg9.TAG, "getTargetDir target dir delete fail", new Object[0]);
                }
                if (!file2.exists() && !file2.mkdirs()) {
                    OLog.w(cg9.TAG, "getTargetDir mkdirs fail", new Object[0]);
                    eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, "getTargetDir", "103", "getTargetDir mkdirs fail");
                }
                OLog.d(cg9.TAG, "getTargetDir", file2.getAbsolutePath());
                return file2;
            } catch (Throwable th2) {
                th = th2;
                file = file2;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                th.printStackTrace(new PrintStream(byteArrayOutputStream));
                eal.l(OConstant.MONITOR_MODULE, OConstant.POINT_EXCEPTION, "0", "103", byteArrayOutputStream.toString());
                return file;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void f(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1192e0", new Object[]{obj, str});
        } else {
            g(obj, str);
        }
    }

    public static <T extends dq3> T i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((dq3) ipChange.ipc$dispatch("cd5d2f30", new Object[]{str}));
        }
        return (T) j(str);
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6e79ba", new Object[]{str});
            return;
        }
        File file = new File(f11408a, str);
        if (file.exists()) {
            boolean delete = file.delete();
            if (OLog.isPrintLog(1)) {
                OLog.d(cg9.TAG, "deleteConfigFile", UploadConstants.FILE_NAME, str, "result", Boolean.valueOf(delete));
            }
        }
    }

    public static <T> T h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("92ffdcc4", new Object[]{str});
        }
        try {
            File file = new File(f11408a, str);
            if (!file.exists()) {
                if (OLog.isPrintLog(3)) {
                    OLog.w(cg9.TAG, "restoreAnyObject not exists", UploadConstants.FILE_NAME, str);
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream(fileInputStream, 131072));
            try {
                T t = (T) objectInputStream.readObject();
                objectInputStream.close();
                fileInputStream.close();
                return t;
            } finally {
                try {
                    throw th;
                } catch (Throwable th) {
                }
            }
        } catch (Exception e2) {
            OLog.e(cg9.TAG, "restoreAnyObject", e2, new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x00e0: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:39:0x00e0 */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T extends tb.dq3> T j(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.util.a.j(java.lang.String):tb.dq3");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.orange.util.a.g(java.lang.Object, java.lang.String):void");
    }
}
