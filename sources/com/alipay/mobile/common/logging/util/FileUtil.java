package com.alipay.mobile.common.logging.util;

import android.content.Context;
import android.content.res.Resources;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void copyFile(File file, File file2) {
        Throwable th;
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileChannel fileChannel2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13188d46", new Object[]{file, file2});
            return;
        }
        FileInputStream fileInputStream = null;
        FileChannel fileChannel3 = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileChannel = fileInputStream2.getChannel();
                try {
                    fileOutputStream = new FileOutputStream(file2);
                    try {
                        fileChannel3 = fileOutputStream.getChannel();
                        fileChannel.transferTo(0L, fileChannel.size(), fileChannel3);
                        if (file2.exists()) {
                            try {
                                fileInputStream2.close();
                            } catch (Throwable unused) {
                            }
                            try {
                                fileChannel.close();
                            } catch (Throwable unused2) {
                            }
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused3) {
                            }
                            if (fileChannel3 != null) {
                                try {
                                    fileChannel3.close();
                                } catch (Throwable unused4) {
                                }
                            }
                        } else {
                            throw new RuntimeException("copy file fail");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel2 = fileChannel3;
                        fileInputStream = fileInputStream2;
                        try {
                            throw new IOException(th);
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused5) {
                                }
                            }
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (Throwable unused6) {
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable unused7) {
                                }
                            }
                            if (fileChannel2 != null) {
                                try {
                                    fileChannel2.close();
                                } catch (Throwable unused8) {
                                }
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileOutputStream = null;
                    fileInputStream = fileInputStream2;
                    fileChannel2 = fileOutputStream;
                    throw new IOException(th);
                }
            } catch (Throwable th5) {
                th = th5;
                fileChannel = null;
                fileOutputStream = null;
            }
        } catch (Throwable th6) {
            th = th6;
            fileChannel = null;
            fileChannel2 = null;
            fileOutputStream = null;
        }
    }

    public static void deleteFileByPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25587414", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            deleteFileNotDir(new File(str));
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
            } catch (Throwable unused) {
                file.getAbsolutePath();
            }
        }
    }

    public static long getFolderSize(File file) {
        long folderSize;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7045ff7", new Object[]{file})).longValue();
        }
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    long j = 0;
                    for (File file2 : listFiles) {
                        if (file2 != null && file2.exists()) {
                            if (file2.isFile()) {
                                folderSize = file2.length();
                            } else {
                                folderSize = getFolderSize(file2);
                            }
                            j += folderSize;
                        }
                    }
                    return j;
                }
                return 0L;
            } catch (Throwable unused) {
                file.getAbsolutePath();
            }
        }
        return 0L;
    }

    public static String getSDPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b7fb18d", new Object[0]);
        }
        if (!isCanUseSdCard()) {
            return null;
        }
        try {
            return Environment.getExternalStorageDirectory().getPath();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getTraceFile() {
        Object obj = null;
        try {
            obj = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "dalvik.vm.stack-trace-file");
        } catch (Throwable unused) {
        }
        if (obj == null) {
            return "/data/anr/traces.txt";
        }
        return obj.toString();
    }

    public static boolean isAppAvailableSpace(long j) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f64a536d", new Object[]{new Long(j)})).booleanValue();
        }
        File dataDirectory = Environment.getDataDirectory();
        if (dataDirectory == null) {
            return false;
        }
        try {
            statFs = new StatFs(dataDirectory.getPath());
        } catch (Throwable unused) {
        }
        if (j < statFs.getAvailableBlocks() * statFs.getBlockSize()) {
            return true;
        }
        return false;
    }

    public static boolean isCanUseSdCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("851fcd4d", new Object[0])).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable th) {
            th.toString();
            return false;
        }
    }

    public static boolean isSDcardAvailableSpace(long j) {
        StatFs statFs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27d378f9", new Object[]{new Long(j)})).booleanValue();
        }
        String sDPath = getSDPath();
        if (sDPath == null) {
            return false;
        }
        try {
            statFs = new StatFs(sDPath);
        } catch (Throwable unused) {
        }
        if (j < (statFs.getAvailableBlocks() - 4) * statFs.getBlockSize()) {
            return true;
        }
        return false;
    }

    public static void moveFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39171ba2", new Object[]{file, file2});
            return;
        }
        try {
            if (!file.renameTo(file2)) {
                copyFile(file, file2);
                file.delete();
            }
            if (file.exists() || !file2.exists()) {
                throw new Exception("move file fail");
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static String readAssetFile(Context context, String str) {
        InputStream inputStream;
        BufferedInputStream bufferedInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb49faeb", new Object[]{context, str});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            try {
                Resources resources = context.getResources();
                if (resources == null) {
                    return null;
                }
                inputStream = resources.getAssets().open(str);
                try {
                    bufferedInputStream = new BufferedInputStream(inputStream);
                } catch (Throwable unused) {
                }
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read));
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused2) {
                    }
                    return sb2;
                } catch (Throwable unused3) {
                    inputStream = bufferedInputStream;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    return null;
                }
            } catch (Throwable unused5) {
                inputStream = null;
            }
        }
        return null;
    }

    public static String readFile(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("856bcd30", new Object[]{file});
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            String str = new String(bArr, "UTF-8");
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            try {
                throw new IOException(th);
            } catch (Throwable th4) {
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th4;
            }
        }
    }

    public static byte[] readFileByteFully(File file) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9b52654f", new Object[]{file});
        }
        FileInputStream fileInputStream = null;
        if (file != null) {
            try {
                if (!file.isDirectory() && file.isFile() && file.exists()) {
                    if (file.length() == 0) {
                        return new byte[0];
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream2.available()];
                        int i = 0;
                        while (true) {
                            int read = fileInputStream2.read(bArr, i, bArr.length - i);
                            if (read > 0) {
                                i += read;
                                int available = fileInputStream2.available();
                                if (available > bArr.length - i) {
                                    byte[] bArr2 = new byte[available + i];
                                    System.arraycopy(bArr, 0, bArr2, 0, i);
                                    bArr = bArr2;
                                }
                            } else {
                                try {
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        fileInputStream2.close();
                        return bArr;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        try {
                            throw new IOException(th);
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return null;
    }

    public static String readFileStringFully(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a735aa9b", new Object[]{file});
        }
        byte[] readFileByteFully = readFileByteFully(file);
        if (readFileByteFully == null) {
            return null;
        }
        try {
            return new String(readFileByteFully);
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    public static byte[] toByteArray(File file) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9624d129", new Object[]{file});
        }
        if (file == null || !file.exists()) {
            throw new IOException();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = bufferedInputStream2.read(bArr, 0, 1024);
                    if (-1 == read) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    bufferedInputStream2.close();
                } catch (Throwable unused) {
                }
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused2) {
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static void writeFile(File file, byte[] bArr, boolean z) {
        Throwable th;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d576154", new Object[]{file, bArr, new Boolean(z)});
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            fileOutputStream = new FileOutputStream(file, z);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            try {
                throw new IOException(th);
            } catch (Throwable th4) {
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th4;
            }
        }
    }

    public static void writeFile(File file, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a839eb1", new Object[]{file, str, new Boolean(z)});
            return;
        }
        try {
            writeFile(file, str.getBytes("UTF-8"), z);
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
