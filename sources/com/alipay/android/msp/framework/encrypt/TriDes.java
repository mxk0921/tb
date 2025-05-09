package com.alipay.android.msp.framework.encrypt;

import android.util.Base64;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TriDes {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String decrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24104ef8", new Object[]{str, str2});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher instance = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            instance.init(2, secretKeySpec);
            return new String(instance.doFinal(Base64.decode(str2, 2)));
        } catch (Exception e) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.CRYPT_TRIDES_DECRYPT_EXCEPTION, e);
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public static String encrypt(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("327cf920", new Object[]{str, str2});
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            Cipher instance = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            instance.init(1, secretKeySpec);
            return Base64.encodeToString(instance.doFinal(str2.getBytes()), 2);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }
}
