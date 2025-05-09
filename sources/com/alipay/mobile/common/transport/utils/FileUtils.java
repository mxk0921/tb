package com.alipay.mobile.common.transport.utils;

import android.graphics.BitmapFactory;
import com.alibaba.security.realidentity.f;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a979fdf", new Object[]{file});
            return;
        }
        try {
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d72d401b", new Object[]{options, new Integer(i)})).intValue();
        }
        int i2 = options.outWidth;
        if (i2 > i) {
            return Math.round(i2 / i);
        }
        return 1;
    }

    public static boolean checkDataAvailableSpace(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af588f3b", new Object[]{file, new Long(j)})).booleanValue();
        }
        if (isInDataDir(file)) {
            return SDcardUtils.isDataDirAvailableSpace(j);
        }
        return true;
    }

    public static boolean checkDataOrSdcardAvailableSpace(File file, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37b448f7", new Object[]{file, new Long(j)})).booleanValue();
        }
        if (file == null) {
            LogCatUtil.warn(f.f2692a, "checkFileAvailableSpace. nima! file is null, Are you kidding？");
            return false;
        } else if (isInDataDir(file)) {
            return SDcardUtils.isDataDirAvailableSpace(j);
        } else {
            return SDcardUtils.isSDcardAvailableSpace(j);
        }
    }

    public static boolean checkFileAvailableSpace(File file, long j) {
        File file2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("365b0ba9", new Object[]{file, new Long(j)})).booleanValue();
        }
        try {
            if (!checkFileDirWRPermissions(file)) {
                return false;
            }
            if (file.isDirectory()) {
                file2 = file;
            } else {
                file2 = file.getParentFile();
            }
            if (file2 != null) {
                file = file2;
            }
            return SDcardUtils.isAppAvailableSpace(j, file);
        } catch (Throwable th) {
            LogCatUtil.warn(f.f2692a, "checkFileAvailableSpace fail.", th);
            return true;
        }
    }

    public static boolean checkFileDirWRPermissions(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c2befc2", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            LogCatUtil.warn(f.f2692a, "checkFileDirWritePermissions. nima! file is null, Are you kidding？");
            return false;
        }
        if (!file.exists()) {
            file = file.getParentFile();
            if (!file.exists() && !file.mkdirs()) {
                return false;
            }
        } else if (!file.isDirectory()) {
            file = file.getParentFile();
        }
        if (!file.canWrite()) {
            return false;
        }
        return true;
    }

    public static boolean copyFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13188d4a", new Object[]{file, file2})).booleanValue();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            if (copyToFile(fileInputStream, file2)) {
                if (file.length() == file2.length()) {
                    fileInputStream.close();
                    return true;
                }
                LogCatUtil.warn(f.f2692a, "[copyFile] Copy finished, but length mismatch.");
            }
            try {
                if (file2.exists()) {
                    file2.delete();
                }
            } catch (Throwable th) {
                LogCatUtil.warn(f.f2692a, "[copyFile] delete dest file exception = " + th.toString());
            }
            fileInputStream.close();
            return false;
        } catch (IOException e) {
            LogCatUtil.warn(f.f2692a, e);
            return false;
        }
    }

    public static boolean copyFileEnhanced(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b568be0", new Object[]{file, file2})).booleanValue();
        }
        if (copyFile(file, file2)) {
            return true;
        }
        LogCatUtil.info(f.f2692a, "[copyFileEnhanced] Use copyFile fail, Continue to use streamCopyFile retry.");
        if (file2.exists()) {
            file2.delete();
        }
        return streamCopyFile(file, file2);
    }

    public static boolean copyToFile(FileInputStream fileInputStream, File file) {
        Throwable th;
        Exception e;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bb8ef97", new Object[]{fileInputStream, file})).booleanValue();
        }
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            FileChannel channel = fileOutputStream.getChannel();
            FileChannel channel2 = fileInputStream.getChannel();
            channel2.transferTo(0L, channel2.size(), channel);
            if (channel != null) {
                channel.close();
            }
            channel2.close();
            try {
                fileOutputStream.close();
            } catch (Exception e3) {
                LogCatUtil.warn(f.f2692a, "outputStream.close exception. " + e3.toString());
            }
            return true;
        } catch (Exception e4) {
            e = e4;
            fileOutputStream2 = fileOutputStream;
            LogCatUtil.error(f.f2692a, "copy file error!", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e5) {
                    LogCatUtil.warn(f.f2692a, "outputStream.close exception. " + e5.toString());
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (Exception e6) {
                    LogCatUtil.warn(f.f2692a, "outputStream.close exception. " + e6.toString());
                }
            }
            throw th;
        }
    }

    public static void deleteFileNotDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951dc8df", new Object[]{file});
        } else if (file != null) {
            try {
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            } catch (Throwable th) {
                LogCatUtil.error(f.f2692a, "deleteFileNotDir:" + file.getAbsolutePath(), th);
            }
        }
    }

    public static BitmapFactory.Options getFileOption(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapFactory.Options) ipChange.ipc$dispatch("3adbe04f", new Object[]{file});
        }
        if (file == null || !file.exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return options;
    }

    public static boolean isInDataDir(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a58656", new Object[]{file})).booleanValue();
        }
        return file.getAbsolutePath().startsWith("/data");
    }

    public static final byte[] readFile(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f594f96d", new Object[]{file});
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            FileChannel channel = randomAccessFile.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = channel.read(allocate);
                if (read == -1) {
                    break;
                }
                allocate.flip();
                byteArrayOutputStream.write(allocate.array(), 0, read);
                allocate.clear();
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                channel.close();
            } catch (Exception e) {
                LogCatUtil.warn(f.f2692a, "channel.close() exception. " + e.toString());
            }
            try {
                randomAccessFile.close();
            } catch (Exception e2) {
                LogCatUtil.warn(f.f2692a, "randomAccessFile.close() exception. " + e2.toString());
            }
            return byteArray;
        } catch (Throwable th) {
            LogCatUtil.error(f.f2692a, "readFile exception", th);
            return null;
        }
    }

    public static synchronized boolean saveByte2File(File file, byte[] bArr) {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        boolean z = true;
        synchronized (FileUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("94c49452", new Object[]{file, bArr})).booleanValue();
            } else if (file == null || bArr == null) {
                return false;
            } else {
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    return false;
                }
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.flush();
                            try {
                                bufferedOutputStream.close();
                                fileOutputStream2.close();
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            LogCatUtil.error(f.f2692a, "saveByte2File:" + th.toString());
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable unused2) {
                                    z = false;
                                    return z;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            z = false;
                            return z;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedOutputStream = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                }
                return z;
            }
        }
    }

    public static boolean streamCopyFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e8a40ea", new Object[]{file, file2})).booleanValue();
        }
        try {
            if (file2.exists()) {
                file2.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
            if (file.length() == file2.length()) {
                return true;
            }
            if (file2.exists()) {
                file2.delete();
            }
            LogCatUtil.warn(f.f2692a, "srcFile length=" + file.length() + ", destFile length=" + file2.length());
            return false;
        } catch (IOException e) {
            a(file2);
            LogCatUtil.warn(f.f2692a, e);
            return false;
        }
    }

    @Deprecated
    public static boolean copyToFile(InputStream inputStream, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9238fb", new Object[]{inputStream, file})).booleanValue();
        }
        try {
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            LogCatUtil.warn(f.f2692a, e);
            return false;
        }
    }
}
