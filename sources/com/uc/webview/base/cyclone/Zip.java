package com.uc.webview.base.cyclone;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class Zip {
    private static void a(String str, String str2) {
        ZipFile zipFile = new ZipFile(str);
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                File file = new File(str2 + File.separator + zipEntry.getName());
                if (zipEntry.isDirectory()) {
                    file.mkdirs();
                } else {
                    try {
                        new File(file.getParent()).mkdirs();
                    } catch (Throwable unused) {
                    }
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.close();
                    inputStream.close();
                }
            }
            zipFile.close();
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean unzip(String str, String str2) {
        try {
            a(str, str2);
            return true;
        } catch (Throwable th) {
            Log.e("ucbs.cyclone", "unzip " + str + " failed", th);
            return false;
        }
    }
}
