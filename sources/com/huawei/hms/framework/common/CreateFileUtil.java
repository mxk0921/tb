package com.huawei.hms.framework.common;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.libcore.io.ExternalStorageFile;
import com.huawei.libcore.io.ExternalStorageFileInputStream;
import com.huawei.libcore.io.ExternalStorageFileOutputStream;
import com.huawei.libcore.io.ExternalStorageRandomAccessFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import tb.ohh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CreateFileUtil {
    private static final String EXTERNAL_FILE_NAME = "com.huawei.libcore.io.ExternalStorageFile";
    private static final String EXTERNAL_INPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileInputStream";
    private static final String EXTERNAL_OUTPUTSTREAM_NAME = "com.huawei.libcore.io.ExternalStorageFileOutputStream";
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F'};
    private static final String RANDOM_ACCESS_FILE_NAME = "com.huawei.libcore.io.ExternalStorageRandomAccessFile";
    private static final String TAG = "CreateFileUtil";

    public static String byteArrayToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static void deleteSecure(File file) {
        if (file != null && file.exists() && !file.delete()) {
            Logger.w(TAG, "deleteSecure exception");
        }
    }

    public static String getCacheDirPath(Context context) {
        if (context == null) {
            return "";
        }
        return ContextCompat.getProtectedStorageContext(context).getCacheDir().getPath();
    }

    public static String getCanonicalPath(String str) {
        try {
            return newFile(str).getCanonicalPath();
        } catch (IOException e) {
            Logger.w(TAG, "the canonicalPath has IOException", e);
            return str;
        } catch (SecurityException e2) {
            Logger.w(TAG, "the canonicalPath has securityException", e2);
            return str;
        } catch (Exception e3) {
            Logger.w(TAG, "the canonicalPath has other Exception", e3);
            return str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x007a, code lost:
        if (r10 == null) goto L_0x007d;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getFileHashData(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Close FileInputStream failed!"
            java.lang.String r1 = "CreateFileUtil"
            r2 = 0
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)     // Catch: all -> 0x0044, IndexOutOfBoundsException -> 0x0046, IllegalArgumentException -> 0x0049, IOException -> 0x004c, FileNotFoundException -> 0x004f, NoSuchAlgorithmException -> 0x0052
            java.io.FileInputStream r10 = newSafeFileInputStream(r10)     // Catch: all -> 0x0044, IndexOutOfBoundsException -> 0x0046, IllegalArgumentException -> 0x0049, IOException -> 0x004c, FileNotFoundException -> 0x004f, NoSuchAlgorithmException -> 0x0052
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: all -> 0x0022, IndexOutOfBoundsException -> 0x0026, IllegalArgumentException -> 0x0028, IOException -> 0x002a, FileNotFoundException -> 0x002c, NoSuchAlgorithmException -> 0x002e
            r4 = 0
            r6 = r4
        L_0x0014:
            int r8 = r10.read(r3)     // Catch: all -> 0x0022, IndexOutOfBoundsException -> 0x0026, IllegalArgumentException -> 0x0028, IOException -> 0x002a, FileNotFoundException -> 0x002c, NoSuchAlgorithmException -> 0x002e
            r9 = -1
            if (r8 == r9) goto L_0x0030
            r9 = 0
            r11.update(r3, r9, r8)     // Catch: all -> 0x0022, IndexOutOfBoundsException -> 0x0026, IllegalArgumentException -> 0x0028, IOException -> 0x002a, FileNotFoundException -> 0x002c, NoSuchAlgorithmException -> 0x002e
            long r8 = (long) r8     // Catch: all -> 0x0022, IndexOutOfBoundsException -> 0x0026, IllegalArgumentException -> 0x0028, IOException -> 0x002a, FileNotFoundException -> 0x002c, NoSuchAlgorithmException -> 0x002e
            long r6 = r6 + r8
            goto L_0x0014
        L_0x0022:
            r11 = move-exception
            r2 = r10
            goto L_0x007e
        L_0x0026:
            r11 = move-exception
            goto L_0x0055
        L_0x0028:
            r11 = move-exception
            goto L_0x005d
        L_0x002a:
            r11 = move-exception
            goto L_0x0065
        L_0x002c:
            r11 = move-exception
            goto L_0x006d
        L_0x002e:
            r11 = move-exception
            goto L_0x0075
        L_0x0030:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x003c
            byte[] r11 = r11.digest()     // Catch: all -> 0x0022, IndexOutOfBoundsException -> 0x0026, IllegalArgumentException -> 0x0028, IOException -> 0x002a, FileNotFoundException -> 0x002c, NoSuchAlgorithmException -> 0x002e
            java.lang.String r2 = byteArrayToHex(r11)     // Catch: all -> 0x0022, IndexOutOfBoundsException -> 0x0026, IllegalArgumentException -> 0x0028, IOException -> 0x002a, FileNotFoundException -> 0x002c, NoSuchAlgorithmException -> 0x002e
        L_0x003c:
            r10.close()     // Catch: IOException -> 0x0040
            goto L_0x007d
        L_0x0040:
            com.huawei.hms.framework.common.Logger.e(r1, r0)
            goto L_0x007d
        L_0x0044:
            r11 = move-exception
            goto L_0x007e
        L_0x0046:
            r11 = move-exception
            r10 = r2
            goto L_0x0055
        L_0x0049:
            r11 = move-exception
            r10 = r2
            goto L_0x005d
        L_0x004c:
            r11 = move-exception
            r10 = r2
            goto L_0x0065
        L_0x004f:
            r11 = move-exception
            r10 = r2
            goto L_0x006d
        L_0x0052:
            r11 = move-exception
            r10 = r2
            goto L_0x0075
        L_0x0055:
            java.lang.String r3 = "getFileHashData IndexOutOfBoundsException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: all -> 0x0022
            if (r10 == 0) goto L_0x007d
            goto L_0x003c
        L_0x005d:
            java.lang.String r3 = "getFileHashData IllegalArgumentException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: all -> 0x0022
            if (r10 == 0) goto L_0x007d
            goto L_0x003c
        L_0x0065:
            java.lang.String r3 = "getFileHashData IOException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: all -> 0x0022
            if (r10 == 0) goto L_0x007d
            goto L_0x003c
        L_0x006d:
            java.lang.String r3 = "getFileHashData FileNotFoundException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: all -> 0x0022
            if (r10 == 0) goto L_0x007d
            goto L_0x003c
        L_0x0075:
            java.lang.String r3 = "getFileHashData NoSuchAlgorithmException"
            com.huawei.hms.framework.common.Logger.e(r1, r3, r11)     // Catch: all -> 0x0022
            if (r10 == 0) goto L_0x007d
            goto L_0x003c
        L_0x007d:
            return r2
        L_0x007e:
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch: IOException -> 0x0084
            goto L_0x0087
        L_0x0084:
            com.huawei.hms.framework.common.Logger.e(r1, r0)
        L_0x0087:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.common.CreateFileUtil.getFileHashData(java.lang.String, java.lang.String):java.lang.String");
    }

    @Deprecated
    public static boolean isPVersion() {
        return EmuiUtil.isUpPVersion();
    }

    public static File newFile(String str) {
        if (str == null) {
            return null;
        }
        if (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(EXTERNAL_FILE_NAME)) {
            return new File(str);
        }
        return new ExternalStorageFile(str);
    }

    public static FileInputStream newFileInputStream(String str) throws FileNotFoundException {
        if (str == null) {
            Logger.w(TAG, "newFileInputStream  file is null");
            throw new FileNotFoundException("file is null");
        } else if (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(EXTERNAL_INPUTSTREAM_NAME)) {
            return new FileInputStream(str);
        } else {
            return new ExternalStorageFileInputStream(str);
        }
    }

    public static FileOutputStream newFileOutputStream(File file) throws FileNotFoundException {
        if (file == null) {
            Logger.e(TAG, "newFileOutputStream  file is null");
            throw new FileNotFoundException("file is null");
        } else if (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(EXTERNAL_OUTPUTSTREAM_NAME)) {
            return new FileOutputStream(file);
        } else {
            return new ExternalStorageFileOutputStream(file);
        }
    }

    public static RandomAccessFile newRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str == null) {
            Logger.w(TAG, "newFileOutputStream  file is null");
            throw new FileNotFoundException("file is null");
        } else if (!EmuiUtil.isUpPVersion() || !ReflectionUtils.checkCompatible(RANDOM_ACCESS_FILE_NAME)) {
            return new RandomAccessFile(str, str2);
        } else {
            return new ExternalStorageRandomAccessFile(str, str2);
        }
    }

    public static File newSafeFile(String str) {
        if (str == null) {
            return null;
        }
        try {
            File newFile = newFile(str);
            if (!newFile.exists()) {
                return new File(str);
            }
            return newFile;
        } catch (RuntimeException unused) {
            Logger.w(TAG, "newFile is runtimeException");
            return new File(str);
        } catch (Throwable unused2) {
            Logger.w(TAG, "newFile is Throwable");
            return new File(str);
        }
    }

    public static FileInputStream newSafeFileInputStream(String str) throws FileNotFoundException {
        try {
            return newFileInputStream(str);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newFileInputStream is fileNotFoundException");
            return new FileInputStream(str);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newFileInputStream is runtimeException");
            return new FileInputStream(str);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newFileInputStream is Throwable");
            return new FileInputStream(str);
        }
    }

    public static FileOutputStream newSafeFileOutputStream(File file) throws FileNotFoundException {
        try {
            return newFileOutputStream(file);
        } catch (FileNotFoundException unused) {
            Logger.w(TAG, "newFileOutputStream is fileNotFoundException");
            return new FileOutputStream(file);
        } catch (RuntimeException unused2) {
            Logger.w(TAG, "newFileOutputStream is runtimeException");
            return new FileOutputStream(file);
        } catch (Throwable unused3) {
            Logger.w(TAG, "newFileOutputStream is Throwable");
            return new FileOutputStream(file);
        }
    }

    public static RandomAccessFile newSafeRandomAccessFile(String str, String str2) throws FileNotFoundException {
        if (str != null) {
            try {
                return newRandomAccessFile(str, str2);
            } catch (FileNotFoundException unused) {
                Logger.w(TAG, "newRandomAccessFile is fileNotFoundException");
                return new RandomAccessFile(str, str2);
            } catch (RuntimeException unused2) {
                Logger.w(TAG, "newRandomAccessFile is runtimeException");
                return new RandomAccessFile(str, str2);
            } catch (Throwable unused3) {
                Logger.w(TAG, "newRandomAccessFile is Throwable");
                return new RandomAccessFile(str, str2);
            }
        } else {
            Logger.w(TAG, "newRandomAccessFile  file is null");
            throw new FileNotFoundException("file is null");
        }
    }

    public static void deleteSecure(String str) {
        if (!TextUtils.isEmpty(str)) {
            deleteSecure(newFile(str));
        }
    }
}
