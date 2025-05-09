package com.ali.user.mobile.utils;

import android.content.pm.PackageInfo;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MD5Util {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157644);
    }

    public static String getApkPublicKeyDigest(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b437aadb", new Object[]{str});
        }
        try {
            PackageInfo packageInfo = DataProviderFactory.getApplicationContext().getPackageManager().getPackageInfo(str, 64);
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            instance.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getPublicKey().toString().getBytes());
            return getHashString(instance);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static String getHashString(MessageDigest messageDigest) {
        byte[] digest;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ebf7644", new Object[]{messageDigest});
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest.digest()) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static String getMD5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a46456c7", new Object[]{str});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(Charset.forName("UTF-8")));
            return getHashString(instance);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
