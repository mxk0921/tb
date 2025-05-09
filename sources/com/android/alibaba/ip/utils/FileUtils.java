package com.android.alibaba.ip.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.alibaba.ip.server.InstantPatcher;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(493879339);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0062 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void copyInputStreamToFile(java.io.InputStream r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.android.alibaba.ip.utils.FileUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "2ea77f37"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r4 = 1
            r3[r4] = r5
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0015:
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: all -> 0x0052, IOException -> 0x0055
            r2.<init>(r5)     // Catch: all -> 0x0052, IOException -> 0x0055
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch: all -> 0x0031, IOException -> 0x0033
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: all -> 0x0031, IOException -> 0x0033
        L_0x0023:
            int r3 = r4.read(r5)     // Catch: all -> 0x0031, IOException -> 0x0033
            if (r3 <= 0) goto L_0x0037
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r5, r0, r3)     // Catch: all -> 0x0031, IOException -> 0x0033
            r1.write(r3)     // Catch: all -> 0x0031, IOException -> 0x0033
            goto L_0x0023
        L_0x0031:
            r5 = move-exception
            goto L_0x0060
        L_0x0033:
            r5 = move-exception
            r0 = r1
            r1 = r2
            goto L_0x0057
        L_0x0037:
            r4.close()     // Catch: Exception -> 0x003b
            goto L_0x003f
        L_0x003b:
            r4 = move-exception
            r4.printStackTrace()
        L_0x003f:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch: Exception -> 0x0045
            goto L_0x0049
        L_0x0045:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0049:
            r2.close()     // Catch: Exception -> 0x004d
            goto L_0x0051
        L_0x004d:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0051:
            return
        L_0x0052:
            r5 = move-exception
            r2 = r1
            goto L_0x0060
        L_0x0055:
            r5 = move-exception
            r0 = r1
        L_0x0057:
            java.io.IOException r2 = new java.io.IOException     // Catch: all -> 0x005d
            r2.<init>(r5)     // Catch: all -> 0x005d
            throw r2     // Catch: all -> 0x005d
        L_0x005d:
            r5 = move-exception
            r2 = r1
            r1 = r0
        L_0x0060:
            if (r4 == 0) goto L_0x006a
            r4.close()     // Catch: Exception -> 0x0066
            goto L_0x006a
        L_0x0066:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006a:
            if (r1 == 0) goto L_0x0074
            r1.close()     // Catch: Exception -> 0x0070
            goto L_0x0074
        L_0x0070:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0074:
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch: Exception -> 0x007a
            goto L_0x007e
        L_0x007a:
            r4 = move-exception
            r4.printStackTrace()
        L_0x007e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.alibaba.ip.utils.FileUtils.copyInputStreamToFile(java.io.InputStream, java.io.File):void");
    }

    public static byte[] getByte(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e8653ca1", new Object[]{file});
        }
        byte[] bArr = new byte[(int) file.length()];
        try {
            try {
                new FileInputStream(file).read(bArr);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bArr;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getMD5(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("404a476a", new Object[]{bArr});
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            byte[] digest = instance.digest();
            char[] cArr2 = new char[digest.length * 2];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i += 2;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final byte[] input2byte(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("78a8d0a1", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[100];
        while (true) {
            int read = inputStream.read(bArr, 0, 100);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static boolean isSameFile(File file, File file2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2a8db905", new Object[]{file, file2})).booleanValue() : getMD5(file).equals(getMD5(file2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static void writeBytesToFile(byte[] bArr, File file) {
        FileNotFoundException e;
        IOException e2;
        ZipOutputStream zipOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1dbfe88", new Object[]{bArr, file});
            return;
        }
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                try {
                    zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
                } catch (IOException e3) {
                    e3.printStackTrace();
                    return;
                }
            } catch (FileNotFoundException e4) {
                e = e4;
            } catch (IOException e5) {
                e2 = e5;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            zipOutputStream2 = 8;
            new ZipEntry(InstantPatcher.CLASSES_DEX).setMethod(8);
            zipOutputStream.putNextEntry(new ZipEntry(InstantPatcher.CLASSES_DEX));
            zipOutputStream.write(bArr, 0, bArr.length);
            zipOutputStream.closeEntry();
            zipOutputStream.close();
        } catch (FileNotFoundException e6) {
            e = e6;
            zipOutputStream2 = zipOutputStream;
            e.printStackTrace();
            if (zipOutputStream2 != null) {
                zipOutputStream2.close();
                zipOutputStream2 = zipOutputStream2;
            }
        } catch (IOException e7) {
            e2 = e7;
            zipOutputStream2 = zipOutputStream;
            e2.printStackTrace();
            if (zipOutputStream2 != null) {
                zipOutputStream2.close();
                zipOutputStream2 = zipOutputStream2;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            if (zipOutputStream2 != null) {
                try {
                    zipOutputStream2.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean isSameFile(File file, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ea2a355", new Object[]{file, bArr})).booleanValue();
        }
        try {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry entry = zipFile.getEntry(InstantPatcher.CLASSES_DEX);
            byte[] bArr2 = new byte[0];
            if (entry != null) {
                try {
                    bArr2 = input2byte(zipFile.getInputStream(entry));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return bArr2.equals(bArr);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getMD5(File file) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c149273a", new Object[]{file}) : getMD5(getByte(file));
    }
}
