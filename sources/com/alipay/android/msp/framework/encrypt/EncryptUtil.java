package com.alipay.android.msp.framework.encrypt;

import android.content.Context;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import javax.crypto.NoSuchPaddingException;
import tb.man;
import tb.rle;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class EncryptUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f3607a;

    public static String generateNetworkDesKey(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a86dd8a", new Object[]{new Integer(i)});
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static boolean rsaVerify(String str, byte[] bArr, String str2, String str3) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, SignatureException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75076389", new Object[]{str, bArr, str2, str3})).booleanValue();
        }
        PublicKey generatePublic = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
        Signature instance = Signature.getInstance(str3);
        instance.initVerify(generatePublic);
        instance.update(bArr);
        return instance.verify(Base64.decode(str2, 2));
    }

    public static String generateLocalStorageDesKey(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7a3f211", new Object[]{context});
        }
        if (TextUtils.isEmpty(f3607a)) {
            String str = "";
            try {
                str = context.getApplicationContext().getPackageName();
                str = Base64.encodeToString(str.getBytes(), 10);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            if (TextUtils.isEmpty(str)) {
                str = "unknow";
            }
            f3607a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return f3607a;
    }

    public static Map<String, Object> decCashierObfs(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8b1b0467", new Object[]{str});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("payload");
            String string2 = parseObject.getString("ks");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                String[] split = string2.split(":");
                if (split.length <= 0) {
                    LogUtil.record(8, "EncryptUtil:decCashierObfs", "missing type: " + Arrays.toString(split));
                    return null;
                }
                String str2 = split[0];
                if (!"0".equalsIgnoreCase(str2)) {
                    LogUtil.record(8, "EncryptUtil:decCashierObfs", "unknown type: ".concat(String.valueOf(str2)));
                    return null;
                } else if (split.length >= 3) {
                    return JSON.parseObject(new String(TriDesCBC.decrypt(Base64.decode(split[1], 0), Base64.decode(split[2], 0), Base64.decode(string, 0)), "UTF-8"));
                } else {
                    LogUtil.record(8, "EncryptUtil:decCashierObfs", "missing slices: " + Arrays.toString(split));
                    return null;
                }
            }
            LogUtil.record(8, "EncryptUtil:decCashierObfs", "missing opt: " + string + ", " + string2);
            return null;
        } catch (Exception e) {
            LogUtil.record(8, "EncryptUtil:decCashierObfs", "failed to dec: ".concat(String.valueOf(e)));
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("405d4c26", new Object[]{str, str2, str3})).booleanValue();
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            LogUtil.record(1, "Utils.doCheck", "content= " + str + " sign=" + str2);
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                PublicKey generatePublic = KeyFactory.getInstance(man.KEY_ALGORITHM).generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
                Signature instance = Signature.getInstance("SHA1withRSA");
                instance.initVerify(generatePublic);
                instance.update(str.getBytes("UTF-8"));
                boolean verify = instance.verify(Base64.decode(str2, 2));
                LogUtil.record(1, "Utils.doCheck", "res = ".concat(String.valueOf(verify)));
                LogUtil.record(1, "Utils.doCheck", "timeSpan = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                return verify;
            }
            return false;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return false;
        }
    }

    public static boolean verifyTplData(JSONObject jSONObject, Context context, int i) {
        String str;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90688ba7", new Object[]{jSONObject, context, new Integer(i)})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (jSONObject == null) {
            LogUtil.record(4, "EncryptUtil:verifyTplData", "return false: requestJson null");
            return false;
        }
        String string = jSONObject.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
        if (TextUtils.equals(string, MspFlybirdDefine.FLYBIRD_RESULT_TPL) || TextUtils.equals(string, MspFlybirdDefine.DEFAULT_RESULT_TPL_ID) || TextUtils.equals(string, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("data");
            if (jSONObject5 == null) {
                LogUtil.record(4, "EncryptUtil:verifyTplData", "return false : data null");
                return false;
            }
            String string2 = jSONObject5.getString("cacheId");
            JSONObject jSONObject6 = jSONObject5.getJSONObject(rle.MODULES);
            if (jSONObject6 == null || (jSONObject3 = jSONObject6.getJSONObject("Summary")) == null || (jSONObject4 = jSONObject3.getJSONObject("data")) == null) {
                str = "";
            } else {
                str = jSONObject4.getString(SubstituteConstants.KEY_SUBSTITUTE_PAY_AMOUNT);
            }
            String str2 = "cashier-result@" + string2 + str;
            String string3 = jSONObject.getString("sign");
            GlobalConstant.loadProperties(context);
            try {
                if (a(str2, string3, GlobalConstant.RSA_PUBLIC)) {
                    LogUtil.record(1, "EncryptUtil:verifyTplData", "checkTime = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                    return true;
                }
                LogUtil.record(4, "EncryptUtil:verifyTplData", "first check false");
                new JSONObject().put("userId", (Object) PhoneCashierMspEngine.getMspWallet().getUserId());
                JSONObject executeRpc = PhoneCashierMspEngine.getMspUtils().executeRpc(false, "alipay.mobilebc.activity.query.publickey", "[" + jSONObject2.toJSONString() + "]", i, null);
                if (executeRpc == null || !executeRpc.containsKey("publicKey")) {
                    LogUtil.record(4, "EncryptUtil:verifyTplData", "public key update fail");
                    return false;
                }
                GlobalConstant.RSA_PUBLIC = executeRpc.getString("publicKey");
                PreferenceManager.getDefaultSharedPreferences(context).edit().putString(GlobalConstant.KEY_RSA, GlobalConstant.RSA_PUBLIC).apply();
                boolean a2 = a(str2, string3, GlobalConstant.RSA_PUBLIC);
                LogUtil.record(1, "EncryptUtil:verifyTplData", "checkTime = " + (SystemClock.elapsedRealtime() - elapsedRealtime));
                return a2;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                return false;
            }
        } else {
            LogUtil.record(4, "EncryptUtil:verifyTplData", "return true : degrade or not result  tplId = ".concat(String.valueOf(string)));
            return true;
        }
    }
}
