package com.alipay.mobile.common.logging.util;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AESUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Cipher f3987a;
    public static Cipher b;

    public static synchronized byte[] decrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        synchronized (AESUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("1e555fdb", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
            }
            if (b == null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher instance = Cipher.getInstance("AES");
                b = instance;
                instance.init(2, secretKeySpec);
            }
            return b.doFinal(bArr2, i, i2);
        }
    }

    public static synchronized byte[] encrypt(byte[] bArr, byte[] bArr2, int i, int i2) {
        synchronized (AESUtil.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("b8e01003", new Object[]{bArr, bArr2, new Integer(i), new Integer(i2)});
            }
            if (f3987a == null) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher instance = Cipher.getInstance("AES");
                f3987a = instance;
                instance.init(1, secretKeySpec);
            }
            return f3987a.doFinal(bArr2, i, i2);
        }
    }

    public static byte[] getRawKey(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("90b0662", new Object[]{bArr});
        }
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            SecureRandom instance2 = SecureRandom.getInstance("SHA1PRNG", "Crypto");
            instance2.setSeed(bArr);
            instance.init(128, instance2);
            return instance.generateKey().getEncoded();
        } catch (Throwable unused) {
            return null;
        }
    }
}
