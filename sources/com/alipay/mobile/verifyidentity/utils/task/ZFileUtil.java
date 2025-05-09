package com.alipay.mobile.verifyidentity.utils.task;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZFileUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean clearDir(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97da9195", new Object[]{str})).booleanValue() : clearDir(str, null);
    }

    public static boolean delete(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return delete(new File(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r4 == null) goto L_0x0058;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String read(java.io.File r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.verifyidentity.utils.task.ZFileUtil.$ipChange
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
            if (r6 == 0) goto L_0x0058
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x001f
            goto L_0x0058
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
            goto L_0x004e
        L_0x0040:
            goto L_0x0055
        L_0x0042:
            java.lang.String r1 = r2.toString()     // Catch: all -> 0x003d, Exception -> 0x0040
        L_0x0046:
            r4.close()     // Catch: Exception -> 0x0058
            goto L_0x0058
        L_0x004a:
            r6 = move-exception
            goto L_0x004e
        L_0x004c:
            goto L_0x0054
        L_0x004e:
            if (r1 == 0) goto L_0x0053
            r1.close()     // Catch: Exception -> 0x0053
        L_0x0053:
            throw r6
        L_0x0054:
            r4 = r1
        L_0x0055:
            if (r4 == 0) goto L_0x0058
            goto L_0x0046
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.utils.task.ZFileUtil.read(java.io.File):java.lang.String");
    }

    public static boolean write(String str, String str2, String str3, boolean z, Context context) {
        ByteArrayInputStream byteArrayInputStream;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7ab10bc", new Object[]{str, str2, str3, new Boolean(z), context})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str3 == null) {
            str3 = "";
        }
        byte[] bArr = new byte[1024];
        BufferedOutputStream bufferedOutputStream = null;
        r4 = null;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            if (z) {
                file = new File(context.getCacheDir(), str);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getFilesDir());
                String str4 = File.separator;
                sb.append(str4);
                sb.append(str2);
                sb.append(str4);
                sb.append(str);
                file = new File(sb.toString());
            }
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
            try {
                if (TextUtils.equals(str3, "")) {
                    bufferedOutputStream2.write(str3.getBytes());
                } else {
                    byteArrayInputStream = new ByteArrayInputStream(str3.getBytes());
                    while (true) {
                        try {
                            int read = byteArrayInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            bufferedOutputStream2.write(bArr, 0, read);
                        } catch (Throwable unused) {
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Exception unused2) {
                                }
                            }
                            if (byteArrayInputStream != null) {
                                try {
                                    byteArrayInputStream.close();
                                } catch (Exception unused3) {
                                }
                            }
                            return false;
                        }
                    }
                    byteArrayInputStream2 = byteArrayInputStream;
                }
                bufferedOutputStream2.flush();
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused4) {
                }
                if (byteArrayInputStream2 == null) {
                    return true;
                }
                try {
                    byteArrayInputStream2.close();
                    return true;
                } catch (Exception unused5) {
                    return true;
                }
            } catch (Throwable unused6) {
                byteArrayInputStream = byteArrayInputStream2;
            }
        } catch (Throwable unused7) {
            byteArrayInputStream = null;
        }
    }

    public static boolean clearDir(String str, List<String> list) {
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
                        clearDir(file2.getAbsolutePath(), null);
                    }
                    file2.delete();
                }
            }
        }
        return true;
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
            clearDir(file.getAbsolutePath());
        }
        return file.delete();
    }
}
