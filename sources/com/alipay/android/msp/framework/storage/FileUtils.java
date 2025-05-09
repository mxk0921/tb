package com.alipay.android.msp.framework.storage;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.encrypt.TriDesCBC;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FileUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f3673a = "0123456789ABCDEF".toCharArray();

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41d65698", new Object[]{str})).booleanValue();
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.lastIndexOf("\\");
        }
        if (lastIndexOf == -1) {
            return false;
        }
        try {
            File file = new File(str.substring(0, lastIndexOf));
            if (!file.exists()) {
                return file.mkdirs();
            }
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return true;
        }
    }

    public static boolean b(String str, List<String> list) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35bddc86", new Object[]{str, list})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        if (!file.isDirectory()) {
            return false;
        }
        if (!(!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0)) {
            for (File file2 : listFiles) {
                if (list == null || !list.contains(file2.getName())) {
                    if (file2.isDirectory()) {
                        b(file2.getAbsolutePath(), null);
                    }
                    file2.delete();
                }
            }
        }
        return true;
    }

    public static String buildRandomFileInBasePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63da5887", new Object[]{str});
        }
        return str + File.separator + System.currentTimeMillis() + "_monitor";
    }

    public static void close(Object obj) {
        try {
            if (obj instanceof Closeable) {
                ((Closeable) obj).close();
            } else {
                obj.getClass().getMethod("close", new Class[0]).invoke(obj, new Object[0]);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static String decryptRead(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("386e2aff", new Object[]{file});
        }
        String read = read(file);
        Context context = GlobalHelper.getInstance().getContext();
        if (read != null) {
            return TriDesCBC.decrypt(EncryptUtil.generateLocalStorageDesKey(context), read);
        }
        return null;
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && delete(new File(str));
    }

    public static boolean encryptWrite(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3d4ac99", new Object[]{str, str2})).booleanValue();
        }
        Context context = GlobalHelper.getInstance().getContext();
        if (str2 != null) {
            str3 = TriDesCBC.encrypt(EncryptUtil.generateLocalStorageDesKey(context), str2);
        } else {
            str3 = null;
        }
        return write(str, str3);
    }

    public static boolean exists(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602541f1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public static String md5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("257656f1", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder(digest.length * 2);
        for (byte b : digest) {
            char[] cArr = f3673a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r4 == null) goto L_0x0054;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String read(java.io.File r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.android.msp.framework.storage.FileUtils.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "ed62e14c"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0015:
            r1 = 0
            if (r6 == 0) goto L_0x005b
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x001f
            goto L_0x005b
        L_0x001f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: all -> 0x004a, Exception -> 0x004c
            r4.<init>(r6)     // Catch: all -> 0x004a, Exception -> 0x004c
        L_0x002d:
            int r6 = r4.read(r3)     // Catch: all -> 0x003d, Exception -> 0x0040
            r5 = -1
            if (r6 == r5) goto L_0x0042
            java.lang.String r5 = new java.lang.String     // Catch: all -> 0x003d, Exception -> 0x0040
            r5.<init>(r3, r0, r6)     // Catch: all -> 0x003d, Exception -> 0x0040
            r2.append(r5)     // Catch: all -> 0x003d, Exception -> 0x0040
            goto L_0x002d
        L_0x003d:
            r6 = move-exception
            r1 = r4
            goto L_0x0055
        L_0x0040:
            r6 = move-exception
            goto L_0x004e
        L_0x0042:
            java.lang.String r1 = r2.toString()     // Catch: all -> 0x003d, Exception -> 0x0040
        L_0x0046:
            r4.close()     // Catch: Exception -> 0x0054
            goto L_0x0054
        L_0x004a:
            r6 = move-exception
            goto L_0x0055
        L_0x004c:
            r6 = move-exception
            r4 = r1
        L_0x004e:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r6)     // Catch: all -> 0x003d
            if (r4 == 0) goto L_0x0054
            goto L_0x0046
        L_0x0054:
            return r1
        L_0x0055:
            if (r1 == 0) goto L_0x005a
            r1.close()     // Catch: Exception -> 0x005a
        L_0x005a:
            throw r6
        L_0x005b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.storage.FileUtils.read(java.io.File):java.lang.String");
    }

    public static boolean write(String str, String str2) {
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6c0efe", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str2 == null) {
            str2 = "";
        }
        byte[] bArr = new byte[1024];
        a(str);
        BufferedOutputStream bufferedOutputStream = null;
        r4 = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            File file = new File(str);
            if (!file.exists() && !file.createNewFile()) {
                throw new Exception("cache file create error.");
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str, false));
            try {
                if (TextUtils.equals(str2, "")) {
                    bufferedOutputStream2.write(str2.getBytes());
                } else {
                    ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(str2.getBytes());
                    while (true) {
                        try {
                            int read = byteArrayInputStream3.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream2.write(bArr, 0, read);
                        } catch (Throwable th2) {
                            bufferedOutputStream = bufferedOutputStream2;
                            byteArrayInputStream = byteArrayInputStream3;
                            th = th2;
                            try {
                                LogUtil.printExceptionStackTrace(th);
                                return false;
                            } finally {
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                if (byteArrayInputStream != null) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    }
                    byteArrayInputStream2 = byteArrayInputStream3;
                }
                bufferedOutputStream2.flush();
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused3) {
                }
                if (byteArrayInputStream2 == null) {
                    return true;
                }
                try {
                    byteArrayInputStream2.close();
                    return true;
                } catch (Exception unused4) {
                    return true;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream = byteArrayInputStream2;
                bufferedOutputStream = bufferedOutputStream2;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream = null;
        }
    }

    public static boolean delete(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258726ad", new Object[]{file})).booleanValue();
        }
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            b(file.getAbsolutePath(), null);
        }
        return file.delete();
    }
}
