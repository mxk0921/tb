package com.alibaba.security.realidentity;

import android.text.TextUtils;
import android.util.Base64;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 16; i++) {
                sb.append(String.format("%02x", Byte.valueOf(digest[i])));
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
        }
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(str.getBytes("utf-8"), "MD5");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8ef6f7e3", new Object[]{bArr, str});
        }
        try {
            return MessageDigest.getInstance(str).digest(bArr);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static String a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36082ea1", new Object[]{file});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[8192];
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    } else {
                        String replace = String.format("%32s", new BigInteger(1, instance.digest()).toString(16)).replace(' ', '0');
                        fileInputStream.close();
                        try {
                            fileInputStream.close();
                            return replace;
                        } catch (IOException unused) {
                            return null;
                        }
                    }
                } catch (IOException unused2) {
                    fileInputStream.close();
                    return null;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (IOException unused3) {
                        return null;
                    }
                }
            }
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused4) {
        }
    }

    public static String a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edf8ea87", new Object[]{bArr, str}) : a(b(bArr, str));
    }

    public static String a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
        }
        StringBuilder sb = new StringBuilder(128);
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
