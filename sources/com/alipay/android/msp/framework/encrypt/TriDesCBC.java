package com.alipay.android.msp.framework.encrypt;

import android.text.TextUtils;
import android.util.Base64;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TriDesCBC {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        LogUtil.record(4, "", "TriDesCBC::decrypt_String", "startPay");
        if (TextUtils.isEmpty(str2)) {
            LogUtil.record(4, "", "TriDesCBC::decrypt_String", "content == null");
            return str2;
        }
        byte[] decrypt = decrypt(str, Base64.decode(str2, 2));
        if (decrypt != null) {
            return new String(decrypt);
        }
        return null;
    }

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        LogUtil.record(4, "", "TriDesCBC::encrypt_String", "startPay");
        if (TextUtils.isEmpty(str2)) {
            LogUtil.record(4, "", "TriDesCBC::encrypt_String", "content == null");
            return str2;
        }
        byte[] encrypt = encrypt(str, str2.getBytes());
        if (encrypt != null) {
            return Base64.encodeToString(encrypt, 2);
        }
        return null;
    }

    public static byte[] decrypt(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ec6423d8", new Object[]{str, bArr});
        }
        LogUtil.record(4, "", "TriDesCBC::decrypt_Byte", "startPay");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, ErrorCode.CRYPT_TRI_DES_CBC_DE_BYTE, "");
            return null;
        }
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("30c36e00", new Object[]{str, bArr});
        }
        LogUtil.record(4, "", "TriDesCBC::encrypt_Byte", "startPay");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.CRYPT_TRI_DES_CBC_EN_BYTE, e);
            return null;
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1f4fd854", new Object[]{bArr, bArr2, bArr3});
        }
        LogUtil.record(4, "", "TriDesCBC::decrypt_Byte", "start w iv");
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DESede");
            Cipher instance = Cipher.getInstance("DESede/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return instance.doFinal(bArr3);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, ErrorCode.CRYPT_TRI_DES_CBC_DE_BYTE, "with iv");
            return null;
        }
    }
}
