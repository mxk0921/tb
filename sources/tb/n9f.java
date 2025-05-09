package tb;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.avmp.IAVMPGenericComponent;
import com.alibaba.wireless.security.open.middletier.IMiddleTierGenericComponent;
import com.alibaba.wireless.security.open.middletier.IUnifiedSecurityComponent;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.biz.alipaysso.AlipayConstant;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.global.SwitchConfig;
import tb.kqd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class n9f extends o30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile IAVMPGenericComponent.IAVMPGenericInstance d;
    public SecurityGuardManager c = null;
    public IMiddleTierGenericComponent e = null;
    public IUnifiedSecurityComponent f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements IUMIDInitListenerEx {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24586a;

        public a(n9f n9fVar, String str) {
            this.f24586a = str;
        }

        @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
        public void onUMIDInitFinishedEx(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c2fc40b", new Object[]{this, str, new Integer(i)});
            } else if (i == 200) {
                inx.m(this.f24586a, "umt", str);
                TBSdkLog.i("mtopsdk.InnerSignImpl", this.f24586a + " [initUmidToken]IUMIDComponent initUMID succeed,UMID token=" + str);
            } else {
                TBSdkLog.w("mtopsdk.InnerSignImpl", this.f24586a + " [initUmidToken]IUMIDComponent initUMID error,resultCode :" + i);
            }
        }
    }

    static {
        t2o.a(589300073);
    }

    public static /* synthetic */ Object ipc$super(n9f n9fVar, String str, Object... objArr) {
        if (str.hashCode() == 1169212122) {
            super.d((MtopConfig) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/security/InnerSignImpl");
    }

    @Override // tb.o30
    public void d(MtopConfig mtopConfig) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b0c2da", new Object[]{this, mtopConfig});
            return;
        }
        super.d(mtopConfig);
        String c = c();
        try {
            pwp.c(mtopConfig.uploadStats);
            long currentTimeMillis = System.currentTimeMillis();
            this.c = SecurityGuardManager.getInstance(this.f25118a.context);
            if (StringUtils.isEmpty(mtopConfig.appKey)) {
                str = j(mtopConfig.appKeyIndex, a());
            } else {
                str = mtopConfig.appKey;
            }
            u(str, a());
            t(mtopConfig);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.InnerSignImpl", c + " [init]ISign init SecurityGuard succeed.init time=" + (System.currentTimeMillis() - currentTimeMillis));
            }
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            pwp.a("SGManager", String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [init]ISign init SecurityGuard error.errorCode=" + errorCode, e);
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [init]ISign init SecurityGuard error.", e2);
        }
    }

    public final synchronized String e(String str) {
        Context context;
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("85e83e1a", new Object[]{this, str});
            }
            byte[] bArr = new byte[4];
            String str2 = null;
            if (str == null) {
                try {
                    str = "";
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [avmpSign] input is null");
                } catch (Exception e) {
                    try {
                        i = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        pwp.a("InvokeAVMP", String.valueOf(i), "");
                    } catch (Throwable unused) {
                    }
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [avmpSign] call avmpInstance.invokeAVMP error.errorCode=" + i, e);
                }
            }
            MtopConfig mtopConfig = this.f25118a;
            if (mtopConfig != null) {
                context = mtopConfig.context;
            } else {
                context = MtopUtils.getContext();
            }
            IAVMPGenericComponent.IAVMPGenericInstance h = h(context);
            if (h == null) {
                return null;
            }
            byte[] bArr2 = (byte[]) h.invokeAVMP("sign", new byte[0].getClass(), 0, str.getBytes(), Integer.valueOf(str.getBytes().length), "", bArr, Integer.valueOf(b()));
            if (bArr2 != null) {
                str2 = new String(bArr2);
            }
            return str2;
        }
    }

    public Map<String, String> f(Map<String, String> map, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6f2ea980", new Object[]{this, map, str, new Boolean(z)});
        }
        if (map == null || map.size() < 1) {
            return null;
        }
        String str2 = map.get(HttpHeaderConstant.KEY_EXTDATA);
        String str3 = map.get(HttpHeaderConstant.X_FEATURES);
        String str4 = map.get("routerId");
        String str5 = map.get("placeId");
        String str6 = map.get("open-biz");
        String str7 = map.get("mini-appkey");
        String str8 = map.get("req-appkey");
        String str9 = map.get("accessToken");
        String str10 = map.get("open-biz-data");
        StringBuilder sb = new StringBuilder(64);
        sb.append(g8p.a(map.get("utdid")));
        sb.append("&");
        sb.append(g8p.a(map.get("uid")));
        sb.append("&");
        sb.append(g8p.a(map.get("reqbiz-ext")));
        sb.append("&");
        sb.append(str);
        sb.append("&");
        sb.append(g8p.b(map.get("data")));
        sb.append("&");
        sb.append(map.get("t"));
        sb.append("&");
        sb.append(map.get("api"));
        sb.append("&");
        sb.append(map.get("v"));
        sb.append("&");
        sb.append(g8p.a(map.get("sid")));
        sb.append("&");
        sb.append(g8p.a(map.get("ttid")));
        sb.append("&");
        sb.append(g8p.a(map.get("deviceId")));
        sb.append("&");
        sb.append(g8p.a(map.get(DispatchConstants.LATITUDE)));
        sb.append("&");
        sb.append(g8p.a(map.get(DispatchConstants.LONGTITUDE)));
        sb.append("&");
        if (z) {
            sb.append(g8p.a(str2));
            sb.append("&");
        } else if (StringUtils.isNotBlank(str2)) {
            sb.append(str2);
            sb.append("&");
        }
        sb.append(str3);
        sb.append("&");
        sb.append(g8p.a(str4));
        sb.append("&");
        sb.append(g8p.a(str5));
        sb.append("&");
        sb.append(g8p.a(str6));
        sb.append("&");
        sb.append(g8p.a(str7));
        sb.append("&");
        sb.append(g8p.a(str8));
        sb.append("&");
        sb.append(g8p.a(str9));
        sb.append("&");
        sb.append(g8p.a(str10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("INPUT", sb.toString());
        return hashMap;
    }

    public Map<String, String> g(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18097262", new Object[]{this, map, str});
        }
        if (map == null || map.size() < 1) {
            return null;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append(g8p.a(map.get("utdid")));
        sb.append("&");
        sb.append(g8p.a(map.get("uid")));
        sb.append("&&");
        sb.append(str);
        sb.append("&");
        sb.append(g8p.b(map.get("data")));
        sb.append("&");
        sb.append(map.get("t"));
        sb.append("&&&");
        sb.append(g8p.a(map.get("sid")));
        sb.append("&");
        sb.append(g8p.a(map.get("ttid")));
        sb.append("&&&&&&&&&&&&");
        HashMap hashMap = new HashMap(2);
        hashMap.put("INPUT", sb.toString());
        return hashMap;
    }

    public IAVMPGenericComponent.IAVMPGenericInstance h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAVMPGenericComponent.IAVMPGenericInstance) ipChange.ipc$dispatch("60b5634e", new Object[]{this, context});
        }
        if (this.d == null) {
            synchronized (n9f.class) {
                if (this.d == null) {
                    try {
                        this.d = ((IAVMPGenericComponent) SecurityGuardManager.getInstance(context).getInterface(IAVMPGenericComponent.class)).createAVMPInstance("mwua", "sgcipher");
                        if (this.d == null) {
                            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAVMPInstance] call createAVMPInstance return null.");
                        }
                    } catch (SecException e) {
                        int errorCode = e.getErrorCode();
                        pwp.a("AVMPInstance", String.valueOf(errorCode), "");
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAVMPInstance] call createAVMPInstance error,errorCode=" + errorCode, e);
                    } catch (Exception e2) {
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAVMPInstance] call createAVMPInstance error.", e2);
                    }
                }
            }
        }
        return this.d;
    }

    public String i(kqd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9aa76f0", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        return j(aVar.f22852a, aVar.b);
    }

    public final String j(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba7c90e1", new Object[]{this, new Integer(i), str});
        }
        String c = c();
        String str2 = null;
        try {
            str2 = this.c.getStaticDataStoreComp().getAppKeyByIndex(i, str);
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.InnerSignImpl", c + " [getAppKeyByIndex]getAppKeyByIndex  appKey=" + str2 + ",appKeyIndex=" + i + ",authCode=" + str);
            }
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            pwp.a("GetAppKey", String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getAppKeyByIndex]getAppKeyByIndex error.errorCode=" + errorCode + ",appKeyIndex=" + i + ",authCode=" + str, e);
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getAppKeyByIndex]getAppKeyByIndex error.appKeyIndex=" + i + ",authCode=" + str, e2);
        }
        return str2;
    }

    public String k(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8be53183", new Object[]{this, str, str2, new Integer(i)});
        }
        String e = e(str);
        if (!StringUtils.isBlank(e)) {
            return e;
        }
        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getAvmpSign] call avmpSign return null.degrade call getSecBodyDataEx ");
        return p("", "", str2, null, i);
    }

    public String l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18efe3b", new Object[]{this, str, str2});
        }
        String c = c();
        if (str == null || str2 == null) {
            return null;
        }
        if (this.c == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getCommonHmacSha1Sign]SecurityGuardManager is null,please call ISign init()");
            return null;
        }
        try {
            HashMap hashMap = new HashMap(1);
            hashMap.put("INPUT", str);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.appKey = str2;
            securityGuardParamContext.requestType = 3;
            securityGuardParamContext.paramMap = hashMap;
            return this.c.getSecureSignatureComp().signRequest(securityGuardParamContext, a());
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            pwp.a("SignHMACSHA1", String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getCommonHmacSha1Sign] ISecureSignatureComponent signRequest error,errorCode=" + errorCode, e);
            return null;
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getCommonHmacSha1Sign] ISecureSignatureComponent signRequest error", e2);
            return null;
        }
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ffd8891a", new Object[]{this})).intValue();
        }
        if (b() == EnvModeEnum.PREPARE.getEnvMode()) {
            return 1;
        }
        if (b() == EnvModeEnum.TEST.getEnvMode() || b() == EnvModeEnum.TEST_SANDBOX.getEnvMode()) {
            return 2;
        }
        return 0;
    }

    public String n(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        SecException e;
        String str = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87cc1023", new Object[]{this, hashMap, hashMap2});
        }
        try {
            if (this.e == null) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getMiniWua]middleTier ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
                return str;
            }
            HashMap<String, Object> hashMap3 = new HashMap<>();
            hashMap3.put("env", Integer.valueOf(m()));
            if (hashMap2 == null) {
                hashMap2 = new HashMap<>();
            }
            hashMap2.put("api_name", hashMap.get("api"));
            hashMap3.put("extend_paras", hashMap2);
            HashMap<String, String> miniWua = this.e.getMiniWua(hashMap3);
            if (miniWua != null && !miniWua.isEmpty()) {
                String remove = miniWua.remove("x-miniwua");
                try {
                    if (!StringUtils.isNotBlank(remove)) {
                        return remove;
                    }
                    hashMap.putAll(miniWua);
                    return remove;
                } catch (SecException e2) {
                    e = e2;
                    str = remove;
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getMiniWua]get miniwua failed and SecException errorCode " + e.getErrorCode() + ",appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, e);
                    return str;
                }
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getMiniWua]get miniwua failed with no output ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
            return str;
        } catch (SecException e3) {
            e = e3;
        }
    }

    public String o(HashMap<String, String> hashMap, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ca36119", new Object[]{this, hashMap, str, str2});
        }
        String c = c();
        String str3 = null;
        if (hashMap == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] params is null.appKey=" + str);
            return null;
        } else if (str == null) {
            hashMap.put("SG_ERROR_CODE", "AppKey is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] AppKey is null.");
            return null;
        } else if (this.c == null) {
            hashMap.put("SG_ERROR_CODE", "SGManager is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign]SecurityGuardManager is null,please call ISign init()");
            return null;
        } else {
            try {
                if ((SwitchConfig.getInstance().getUseSecurityAdapter() & 1) == 1) {
                    str3 = q(hashMap, str);
                }
                if (!StringUtils.isBlank(str3)) {
                    return str3;
                }
                SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
                securityGuardParamContext.appKey = str;
                securityGuardParamContext.requestType = 7;
                Map<String, String> f = f(hashMap, str, false);
                if (f != null && 2 == b()) {
                    f.put("ATLAS", "daily");
                }
                securityGuardParamContext.paramMap = f;
                return this.c.getSecureSignatureComp().signRequest(securityGuardParamContext, str2);
            } catch (SecException e) {
                int errorCode = e.getErrorCode();
                pwp.a("SignMtopRequest", String.valueOf(errorCode), "");
                hashMap.put("SG_ERROR_CODE", String.valueOf(errorCode));
                TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] ISecureSignatureComponent signRequest error,errorCode=" + errorCode, e);
                return str3;
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getMtopApiSign] ISecureSignatureComponent signRequest error", e2);
                return str3;
            }
        }
    }

    public String p(String str, String str2, String str3, HashMap<String, String> hashMap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b22495f1", new Object[]{this, str, str2, str3, hashMap, new Integer(i)});
        }
        try {
            return ((ISecurityBodyComponent) this.c.getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(str, str2, str3, hashMap, i, b());
        } catch (SecException e) {
            pwp.a("GetSecBody", String.valueOf(e.getErrorCode()), String.valueOf(i));
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSecBodyDataEx] ISecurityBodyComponent getSecurityBodyDataEx  error.errorCode=" + e.getErrorCode() + ", flag=" + i, e);
            return null;
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSecBodyDataEx] ISecurityBodyComponent getSecurityBodyDataEx  error,flag=" + i, e2);
            return null;
        }
    }

    public String q(HashMap<String, String> hashMap, String str) {
        UnsupportedEncodingException e;
        SecException e2;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("589f9b3d", new Object[]{this, hashMap, str});
        }
        String str3 = f(hashMap, str, false).get("INPUT");
        try {
            if (this.e != null && !StringUtils.isBlank(str3)) {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("data", str3.getBytes("UTF-8"));
                hashMap2.put("env", Integer.valueOf(m()));
                hashMap2.put("appkey", str);
                HashMap<String, String> sign = this.e.getSign(hashMap2);
                if (sign != null && !sign.isEmpty()) {
                    String remove = sign.remove(HttpHeaderConstant.X_SIGN);
                    try {
                        if (!StringUtils.isNotBlank(remove)) {
                            return remove;
                        }
                        hashMap.putAll(sign);
                        return remove;
                    } catch (SecException e3) {
                        e2 = e3;
                        str2 = remove;
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]get sign failed and SecException errorCode " + e2.getErrorCode() + ",appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, e2);
                        return str2;
                    } catch (UnsupportedEncodingException e4) {
                        e = e4;
                        str2 = remove;
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]your input data transfer to byte utf-8 failed ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, e);
                        return str2;
                    }
                }
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]get sign failed with no output ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
                return str2;
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getSign]middleTier null or data data ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
            return str2;
        } catch (SecException e5) {
            e2 = e5;
        } catch (UnsupportedEncodingException e6) {
            e = e6;
        }
    }

    public HashMap<String, String> r(HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str, String str2, boolean z, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7141968d", new Object[]{this, hashMap, hashMap2, str, str2, new Boolean(z), str3});
        }
        String c = c();
        if (str == null) {
            hashMap.put("SG_ERROR_CODE", "AppKey is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getUnifiedSign] AppKey is null.");
            return null;
        } else if (hashMap == null) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getUnifiedSign] params is null.appKey=" + str);
            return null;
        } else if (this.f == null) {
            hashMap.put("SG_ERROR_CODE", "unified is null");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + " [getUnifiedSign]sg unified sign is null, please call ISign init()");
            return null;
        } else {
            try {
                HashMap<String, Object> hashMap3 = new HashMap<>();
                if (TextUtils.isEmpty(hashMap.get("ssr-pv"))) {
                    str4 = f(hashMap, str, true).get("INPUT");
                } else {
                    str4 = g(hashMap, str).get("INPUT");
                }
                if (StringUtils.isBlank(str4)) {
                    TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed with sign data empty ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
                    return null;
                }
                hashMap3.put("appkey", str);
                hashMap3.put("data", str4);
                hashMap3.put("useWua", Boolean.valueOf(z));
                hashMap3.put("env", Integer.valueOf(m()));
                hashMap3.put("authCode", str2);
                hashMap3.put("extendParas", hashMap2);
                hashMap3.put("requestId", str3);
                hashMap3.put("api", hashMap.get("api"));
                hashMap3.put("mtopBusiness", hashMap.get("mtopBusiness"));
                try {
                    String str5 = hashMap.get("bizId");
                    if (!TextUtils.isEmpty(str5)) {
                        hashMap3.put("bizId", Integer.valueOf(Integer.parseInt(str5)));
                    }
                } catch (Throwable unused) {
                }
                HashMap<String, String> securityFactors = this.f.getSecurityFactors(hashMap3);
                if (securityFactors != null && !securityFactors.isEmpty()) {
                    return securityFactors;
                }
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed with no output ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
                return null;
            } catch (SecException e) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed and SecException errorCode " + e.getErrorCode() + ",appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, e);
                return null;
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getUnifiedSign]get sign failed exception ,appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, th);
                return null;
            }
        }
    }

    public String s(HashMap<String, String> hashMap, String str) {
        UnsupportedEncodingException e;
        SecException e2;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42b06e97", new Object[]{this, hashMap, str});
        }
        String str3 = hashMap.get("sign");
        try {
            if (this.e != null && !StringUtils.isBlank(str3)) {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("data", str3.getBytes("UTF-8"));
                hashMap2.put("env", Integer.valueOf(m()));
                HashMap<String, String> wua = this.e.getWua(hashMap2);
                if (wua != null && !wua.isEmpty()) {
                    String remove = wua.remove("wua");
                    try {
                        if (!StringUtils.isNotBlank(remove)) {
                            return remove;
                        }
                        hashMap.putAll(wua);
                        return remove;
                    } catch (SecException e3) {
                        e2 = e3;
                        str2 = remove;
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]get wua failed and SecException errorCode " + e2.getErrorCode() + ",appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, e2);
                        return str2;
                    } catch (UnsupportedEncodingException e4) {
                        e = e4;
                        str2 = remove;
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]your input data transfer to byte utf-8 failed ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode, e);
                        return str2;
                    }
                }
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]get wua failed with no output ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
                return str2;
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [getWua]middleTier null or data data ", "appKeyIndex=" + this.f25118a.appKeyIndex + ",authCode=" + this.f25118a.authCode);
            return str2;
        } catch (SecException e5) {
            e2 = e5;
        } catch (UnsupportedEncodingException e6) {
            e = e6;
        }
    }

    public final void t(MtopConfig mtopConfig) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2794891", new Object[]{this, mtopConfig});
        } else if (mtopConfig != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put(AlipayConstant.LOGIN_ALIPAY_AUTH_CODE_KEY, a());
                if (this.e == null) {
                    IMiddleTierGenericComponent iMiddleTierGenericComponent = (IMiddleTierGenericComponent) SecurityGuardManager.getInstance(mtopConfig.context).getInterface(IMiddleTierGenericComponent.class);
                    this.e = iMiddleTierGenericComponent;
                    if (iMiddleTierGenericComponent != null && !iMiddleTierGenericComponent.init(hashMap) && TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init middle tier failed");
                    }
                }
                HashMap<String, Object> hashMap2 = new HashMap<>();
                hashMap2.put("authCode", a());
                if (this.f == null) {
                    IUnifiedSecurityComponent iUnifiedSecurityComponent = (IUnifiedSecurityComponent) SecurityGuardManager.getInstance(mtopConfig.context).getInterface(IUnifiedSecurityComponent.class);
                    this.f = iUnifiedSecurityComponent;
                    if (iUnifiedSecurityComponent != null) {
                        iUnifiedSecurityComponent.init(hashMap2);
                    } else if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init sign failed");
                    }
                }
            } catch (SecException e) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init middleTier failed with errorCode " + e.getErrorCode() + ",appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e);
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init middleTier failed with unknown exception, appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e2);
            }
            try {
                HashMap hashMap3 = new HashMap();
                if (nyn.a(mtopConfig.mtopInstance) == null) {
                    z = false;
                }
                hashMap3.put(IFCComponent.KEY_LOGIN_MODULE, Boolean.valueOf(z));
                IFCComponent iFCComponent = (IFCComponent) SecurityGuardManager.getInstance(mtopConfig.context).getInterface(IFCComponent.class);
                if (iFCComponent != null) {
                    iFCComponent.setUp(mtopConfig.context, hashMap3);
                    mtopConfig.mtopGlobalHeaders.put("x-bx-version", iFCComponent.getFCPluginVersion());
                }
            } catch (SecException e3) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init ifcComponent failed with errorCode " + e3.getErrorCode() + ",appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e3);
            } catch (Exception e4) {
                TBSdkLog.e("mtopsdk.InnerSignImpl", c() + " [initMiddleTier]init ifcComponent failed with unknown exception, appKeyIndex=" + mtopConfig.appKeyIndex + ",authCode=" + mtopConfig.authCode, e4);
            }
            TBSdkLog.e("mtopsdk.InnerSignImpl", "[initMiddleTier] execute initMiddleTier cost time ", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public final void u(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ba2cf1", new Object[]{this, str, str2});
            return;
        }
        String c = c();
        try {
            IUMIDComponent uMIDComp = this.c.getUMIDComp();
            if (uMIDComp != null) {
                int b = b();
                if (str2 == null) {
                    str2 = "";
                }
                uMIDComp.initUMID(str, b, str2, new a(this, c));
            }
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            pwp.a("InitUMID", String.valueOf(errorCode), "");
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + "[initUmidToken]IUMIDComponent initUMID error,errorCode=" + errorCode, e);
        } catch (Exception e2) {
            TBSdkLog.e("mtopsdk.InnerSignImpl", c + "[initUmidToken]IUMIDComponent initUMID error.", e2);
        }
    }
}
