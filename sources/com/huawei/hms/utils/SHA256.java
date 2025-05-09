package com.huawei.hms.utils;

import com.huawei.hms.support.log.HMSLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class SHA256 {
    public static byte[] digest(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            HMSLog.e("SHA256", "NoSuchAlgorithmException" + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] digest(File file) {
        Throwable th;
        MessageDigest instance;
        int i;
        BufferedInputStream bufferedInputStream = null;
        try {
            try {
                instance = MessageDigest.getInstance("SHA-256");
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (IOException | NoSuchAlgorithmException unused) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[4096];
            i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                instance.update(bArr, 0, read);
            }
        } catch (IOException | NoSuchAlgorithmException unused2) {
            bufferedInputStream = bufferedInputStream;
            HMSLog.e("SHA256", "An exception occurred while computing file 'SHA-256'.");
            IOUtils.closeQuietly((InputStream) bufferedInputStream);
            return new byte[0];
        } catch (Throwable th3) {
            th = th3;
            IOUtils.closeQuietly((InputStream) bufferedInputStream);
            throw th;
        }
        if (i > 0) {
            byte[] digest = instance.digest();
            IOUtils.closeQuietly((InputStream) bufferedInputStream);
            return digest;
        }
        IOUtils.closeQuietly((InputStream) bufferedInputStream);
        return new byte[0];
    }
}
