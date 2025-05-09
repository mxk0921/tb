package anet.channel.security;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AmdcAesStatistic;
import anet.channel.util.ALog;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SecurityGuardImpl implements ISecurity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SSL_TICKET_FILE = "network_ssl_ticket";
    private static Map<String, Integer> algorithMap;
    private static boolean mSecurityGuardValid;
    private static SharedPreferences mSharedPreferences;
    private String authCode;
    private static String TAG = "awcn.DefaultSecurityGuard";
    private static Map<String, byte[]> mSslTicketMap = new ConcurrentHashMap();

    static {
        t2o.a(607125705);
        t2o.a(607125702);
        mSecurityGuardValid = false;
        algorithMap = null;
        try {
            IpChange ipChange = SecurityGuardManager.$ipChange;
            mSecurityGuardValid = true;
            HashMap hashMap = new HashMap();
            algorithMap = hashMap;
            hashMap.put(ISecurity.SIGN_ALGORITHM_HMAC_SHA1, 3);
            algorithMap.put(ISecurity.CIPHER_ALGORITHM_AES128, 16);
        } catch (Throwable unused) {
            mSecurityGuardValid = false;
        }
    }

    public SecurityGuardImpl(String str) {
        this.authCode = str;
        if (GlobalAppRuntimeInfo.getContext() != null) {
            mSharedPreferences = GlobalAppRuntimeInfo.getContext().getSharedPreferences(SSL_TICKET_FILE, 0);
        }
    }

    private byte[] getSslTicket(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("f9ff38aa", new Object[]{this, str});
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        byte[] bArr = mSslTicketMap.get(str);
        if (bArr == null && context != null) {
            try {
                SharedPreferences sharedPreferences = mSharedPreferences;
                if (sharedPreferences != null) {
                    byte[] bArr2 = null;
                    String string = sharedPreferences.getString(str, null);
                    if (string != null && string.length() > 0) {
                        bArr2 = string.getBytes("UTF-8");
                    }
                    bArr = dynamicDecryptByteArray(context, bArr2);
                    if (bArr != null && bArr.length > 0) {
                        mSslTicketMap.put(str, bArr);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return bArr;
    }

    public void commitStatistic(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915d4250", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        try {
            AmdcAesStatistic amdcAesStatistic = new AmdcAesStatistic();
            amdcAesStatistic.amdcAesResult = str2;
            amdcAesStatistic.amdcAesTime = j;
            amdcAesStatistic.amdcAesType = str;
            AppMonitor.getInstance().commitStat(amdcAesStatistic);
        } catch (Exception unused) {
        }
    }

    @Override // anet.channel.security.ISecurity
    public byte[] getBytes(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("73ce7e47", new Object[]{this, context, str});
        }
        if (AwcnConfig.isTicketStoreUpgrade()) {
            return getSSLMeta(context, str);
        }
        return getSafeBytes(context, str);
    }

    public byte[] getSSLMeta(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a410cd8d", new Object[]{this, context, str});
        }
        byte[] sslTicket = getSslTicket(str);
        if ((sslTicket == null || sslTicket.length == 0) && (sslTicket = getSafeBytes(context, str)) != null && sslTicket.length > 0) {
            putSSLMeta(context, str, sslTicket);
        }
        return sslTicket;
    }

    @Override // anet.channel.security.ISecurity
    public String sign(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5a1d97e", new Object[]{this, context, str, str2, str3});
        }
        if (mSecurityGuardValid && context != null && !TextUtils.isEmpty(str2) && algorithMap.containsKey(str)) {
            try {
                ISecureSignatureComponent secureSignatureComp = SecurityGuardManager.getInstance(context).getSecureSignatureComp();
                if (secureSignatureComp != null) {
                    SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                    securityGuardParamContext.appKey = str2;
                    securityGuardParamContext.paramMap.put("INPUT", str3);
                    securityGuardParamContext.requestType = algorithMap.get(str).intValue();
                    return secureSignatureComp.signRequest(securityGuardParamContext, this.authCode);
                }
            } catch (Throwable th) {
                ALog.e(TAG, "Securityguard sign request failed.", null, th, new Object[0]);
            }
        }
        return null;
    }

    private byte[] getSafeBytes(Context context, String str) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1bee77ba", new Object[]{this, context, str});
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (dynamicDataStoreComp = instance.getDynamicDataStoreComp()) == null) {
                return null;
            }
            return dynamicDataStoreComp.getByteArray(str);
        } catch (Throwable th) {
            ALog.e(TAG, "getBytes", null, th, new Object[0]);
            return null;
        }
    }

    @Override // anet.channel.security.ISecurity
    public String aesDecryptStr(String str, String str2) {
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1e42fb2", new Object[]{this, str, str2});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(GlobalAppRuntimeInfo.getContext());
            if (!(instance == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null)) {
                String staticSafeDecrypt = staticDataEncryptComp.staticSafeDecrypt(16, str, str2, "");
                commitStatistic("AES_DECRYPT", "decrypt success", System.currentTimeMillis() - currentTimeMillis);
                return staticSafeDecrypt;
            }
        } catch (SecException e) {
            commitStatistic("AES_DECRYPT", "decrypt fail", System.currentTimeMillis() - currentTimeMillis);
            ALog.e(TAG, "ASEDecryptStr error", null, e, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public String aesEncryptStr(String str, String str2) {
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4951748a", new Object[]{this, str, str2});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(GlobalAppRuntimeInfo.getContext());
            if (!(instance == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null)) {
                String staticSafeEncrypt = staticDataEncryptComp.staticSafeEncrypt(16, str, str2, "");
                commitStatistic("AES_ENCRYPT", "encrypt success", System.currentTimeMillis() - currentTimeMillis);
                return staticSafeEncrypt;
            }
        } catch (SecException e) {
            commitStatistic("AES_ENCRYPT", "encrypt fail", System.currentTimeMillis() - currentTimeMillis);
            ALog.e(TAG, "ASEEncryptStr error", null, e, new Object[0]);
        }
        return null;
    }

    @Override // anet.channel.security.ISecurity
    public byte[] decrypt(Context context, String str, String str2, byte[] bArr) {
        Integer num;
        IStaticDataEncryptComponent staticDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("dc83da2e", new Object[]{this, context, str, str2, bArr});
        }
        if (!mSecurityGuardValid || context == null || bArr == null || TextUtils.isEmpty(str2) || !algorithMap.containsKey(str) || (num = algorithMap.get(str)) == null) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (!(instance == null || (staticDataEncryptComp = instance.getStaticDataEncryptComp()) == null)) {
                return staticDataEncryptComp.staticBinarySafeDecryptNoB64(num.intValue(), str2, bArr, this.authCode);
            }
        } catch (Throwable th) {
            ALog.e(TAG, "staticBinarySafeDecryptNoB64", null, th, new Object[0]);
        }
        return null;
    }

    public byte[] dynamicDecryptByteArray(Context context, byte[] bArr) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ba74ddb8", new Object[]{this, context, bArr});
        }
        if (context == null || bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (dynamicDataEncryptComp = instance.getDynamicDataEncryptComp()) == null) {
                return null;
            }
            return dynamicDataEncryptComp.dynamicDecryptByteArray(bArr);
        } catch (Throwable th) {
            ALog.e(TAG, "dynamicEncryptByteArray", null, th, new Object[0]);
            return null;
        }
    }

    public byte[] dynamicEncryptByteArray(Context context, byte[] bArr) {
        IDynamicDataEncryptComponent dynamicDataEncryptComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("158ad7e0", new Object[]{this, context, bArr});
        }
        if (context == null || bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (dynamicDataEncryptComp = instance.getDynamicDataEncryptComp()) == null) {
                return null;
            }
            return dynamicDataEncryptComp.dynamicEncryptByteArray(bArr);
        } catch (Throwable th) {
            ALog.e(TAG, "dynamicEncryptByteArray", null, th, new Object[0]);
            return null;
        }
    }

    @Override // anet.channel.security.ISecurity
    public boolean isSecOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f04a6db3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean putSSLMeta(Context context, String str, byte[] bArr) {
        byte[] bArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4354e2d4", new Object[]{this, context, str, bArr})).booleanValue();
        }
        if (bArr == null || bArr.length <= 0) {
            bArr2 = null;
        } else {
            mSslTicketMap.put(str, bArr);
            bArr2 = dynamicEncryptByteArray(context, bArr);
        }
        if (bArr2 == null || bArr2.length == 0) {
            return false;
        }
        try {
            SharedPreferences sharedPreferences = mSharedPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, new String(bArr2, "UTF-8")).apply();
            }
        } catch (Exception e) {
            ALog.e(TAG, "putSSLMeta error", null, e, new Object[0]);
        }
        return true;
    }

    @Override // anet.channel.security.ISecurity
    public boolean saveBytes(Context context, String str, byte[] bArr) {
        IDynamicDataStoreComponent dynamicDataStoreComp;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bcb5388", new Object[]{this, context, str, bArr})).booleanValue();
        }
        if (AwcnConfig.isTicketStoreUpgrade()) {
            return putSSLMeta(context, str, bArr);
        }
        if (context == null || bArr == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(context);
            if (instance == null || (dynamicDataStoreComp = instance.getDynamicDataStoreComp()) == null) {
                return false;
            }
            if (dynamicDataStoreComp.putByteArray(str, bArr) == 0) {
                z = false;
            }
            return z;
        } catch (Throwable th) {
            ALog.e(TAG, "saveBytes", null, th, new Object[0]);
            return false;
        }
    }
}
