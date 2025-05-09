package com.alipay.mobile.common.logging.util;

import android.text.TextUtils;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import tb.wh6;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZipUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ZipFileHandler {
        String handleFileNameInZip(File file);
    }

    public static String a(File file, File file2, ZipFileHandler zipFileHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb527df8", new Object[]{file, file2, zipFileHandler});
        }
        String str = null;
        if (file2 == null) {
            return null;
        }
        if (file == null) {
            file = file2.getParentFile();
        }
        if (zipFileHandler != null) {
            try {
                str = zipFileHandler.handleFileNameInZip(file2);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = file2.getName();
        }
        while (true) {
            file2 = file2.getParentFile();
            if (file2 == null || file2.equals(file)) {
                break;
            }
            String name = file2.getName();
            if (TextUtils.isEmpty(name)) {
                break;
            }
            str = name + wh6.DIR + str;
        }
        return str;
    }

    public static byte[] unCompressGzip(InputStream inputStream) {
        GZIPInputStream gZIPInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("dd1ccac6", new Object[]{inputStream});
        }
        GZIPInputStream gZIPInputStream2 = null;
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                gZIPInputStream = new GZIPInputStream(inputStream);
            } catch (Throwable unused) {
                return byteArrayOutputStream.toByteArray();
            }
            try {
                byte[] bArr = new byte[256];
                while (true) {
                    int read = gZIPInputStream.read(bArr);
                    if (read >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        try {
                            break;
                        } catch (Throwable unused2) {
                        }
                    }
                }
                byteArrayOutputStream.close();
                gZIPInputStream.close();
            } catch (Throwable unused3) {
                gZIPInputStream2 = gZIPInputStream;
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable unused4) {
                }
                if (gZIPInputStream2 != null) {
                    gZIPInputStream2.close();
                }
                return byteArrayOutputStream.toByteArray();
            }
        } catch (Throwable unused5) {
        }
    }

    public static void zipFile(List<File> list, String str, File file, ZipFileHandler zipFileHandler) {
        Throwable th;
        ZipOutputStream zipOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a74dd88", new Object[]{list, str, file, zipFileHandler});
        } else if (list == null || list.isEmpty()) {
            throw new Exception("willZipList is empty");
        } else if (str == null || str.length() == 0) {
            throw new Exception("zipFilePath is none");
        } else {
            File file2 = new File(str);
            if (!file2.isDirectory()) {
                try {
                    File parentFile = file2.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                } catch (Throwable unused) {
                }
                BufferedInputStream bufferedInputStream = null;
                try {
                    zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
                    try {
                        byte[] bArr = new byte[8192];
                        for (int i = 0; i < list.size(); i++) {
                            File file3 = list.get(i);
                            if (file3 != null && file3.exists() && file3.isFile() && file3.length() != 0) {
                                ZipEntry zipEntry = new ZipEntry(a(file, file3, zipFileHandler));
                                zipEntry.setSize(file3.length());
                                zipEntry.setTime(file3.lastModified());
                                zipOutputStream.putNextEntry(zipEntry);
                                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file3));
                                while (true) {
                                    try {
                                        int read = bufferedInputStream2.read(bArr);
                                        if (read != -1) {
                                            zipOutputStream.write(bArr, 0, read);
                                        } else {
                                            try {
                                                break;
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        bufferedInputStream = bufferedInputStream2;
                                        try {
                                            throw new Exception(th);
                                        } catch (Throwable th3) {
                                            if (bufferedInputStream != null) {
                                                try {
                                                    bufferedInputStream.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            if (zipOutputStream != null) {
                                                try {
                                                    zipOutputStream.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                }
                                bufferedInputStream2.close();
                                try {
                                    zipOutputStream.flush();
                                } catch (Throwable unused5) {
                                }
                                try {
                                    zipOutputStream.closeEntry();
                                } catch (Throwable unused6) {
                                }
                                bufferedInputStream = bufferedInputStream2;
                            }
                        }
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable unused7) {
                            }
                        }
                        try {
                            zipOutputStream.close();
                        } catch (Throwable unused8) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    zipOutputStream = null;
                }
            } else {
                throw new Exception("zipFilePath is directory: ".concat(str));
            }
        }
    }
}
