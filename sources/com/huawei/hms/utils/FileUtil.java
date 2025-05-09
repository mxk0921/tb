package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import tb.cg9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5506a;
    private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f5507a;
        final /* synthetic */ long b;
        final /* synthetic */ String c;

        public a(File file, long j, String str) {
            this.f5507a = file;
            this.b = j;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RandomAccessFile randomAccessFile;
            Throwable th;
            IOException e;
            File file = this.f5507a;
            if (file == null) {
                HMSLog.e(cg9.TAG, "In writeFile Failed to get local file.");
                return;
            }
            File parentFile = file.getParentFile();
            if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
                HMSLog.e(cg9.TAG, "In writeFile, Failed to create directory.");
                return;
            }
            RandomAccessFile randomAccessFile2 = null;
            try {
                try {
                    long length = this.f5507a.length();
                    if (length > this.b) {
                        String canonicalPath = this.f5507a.getCanonicalPath();
                        if (!this.f5507a.delete()) {
                            HMSLog.e(cg9.TAG, "last file delete failed.");
                        }
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.f5507a, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException e2) {
                            e = e2;
                            randomAccessFile2 = randomAccessFile;
                            HMSLog.e(cg9.TAG, "writeFile exception:", e);
                            IOUtils.closeQuietly(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile2.writeBytes(this.c + System.getProperty("line.separator"));
                } catch (Throwable th3) {
                    th = th3;
                    randomAccessFile = null;
                }
            } catch (IOException e3) {
                e = e3;
            }
            IOUtils.closeQuietly(randomAccessFile2);
        }
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        if (digest == null || !HEX.encodeHexString(digest, true).equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static void writeFile(File file, String str, long j) {
        b.execute(new a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!f5506a) {
                if (file2 != null && file2.exists() && !file2.delete()) {
                    HMSLog.e(cg9.TAG, "file delete failed.");
                }
                f5506a = true;
            }
            writeFile(file2, str + "|" + j + "|" + i, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}
