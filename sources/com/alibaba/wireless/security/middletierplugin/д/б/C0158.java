package com.alibaba.wireless.security.middletierplugin.д.б;

import android.content.Context;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.middletierplugin.C0148;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.avmp.IAVMPGenericComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.alibaba.wireless.security.middletierplugin.д.б.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0158 {

    /* renamed from: б  reason: contains not printable characters */
    private static Context f293 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static volatile Object f294 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static C0158 f295 = null;

    /* renamed from: д  reason: contains not printable characters */
    private static ISecurityGuardPlugin f296 = null;

    /* renamed from: е  reason: contains not printable characters */
    private static final String f297 = "init";

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f298 = "getMiniWua";

    /* renamed from: з  reason: contains not printable characters */
    private static final String f299 = "getWua";

    /* renamed from: и  reason: contains not printable characters */
    private static String f300 = "";

    /* renamed from: й  reason: contains not printable characters */
    private static String f301 = "mwua";

    /* renamed from: к  reason: contains not printable characters */
    private static String f302 = "sgcipher2";

    /* renamed from: л  reason: contains not printable characters */
    private static final String f303 = "auth_code";

    /* renamed from: м  reason: contains not printable characters */
    private static final String f304 = "data";

    /* renamed from: н  reason: contains not printable characters */
    private static final String f305 = "env";

    /* renamed from: о  reason: contains not printable characters */
    private static final String f306 = "appkey";

    /* renamed from: п  reason: contains not printable characters */
    private static final String f307 = "extend_paras";

    /* renamed from: р  reason: contains not printable characters */
    private static final String f308 = "_mwua";

    /* renamed from: с  reason: contains not printable characters */
    private static final String f309 = "x-sign";

    /* renamed from: т  reason: contains not printable characters */
    private static final String f310 = "x-miniwua";

    /* renamed from: у  reason: contains not printable characters */
    private static final String f311 = "wua";

    /* renamed from: ф  reason: contains not printable characters */
    private static InvocationHandler f312 = new C0159();

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f313 = "getSign";

    /* renamed from: а  reason: contains not printable characters */
    private volatile IAVMPGenericComponent.IAVMPGenericInstance f314 = null;

    /* renamed from: com.alibaba.wireless.security.middletierplugin.д.б.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0159 implements InvocationHandler {
        C0159() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            char c;
            String name = method.getName();
            switch (name.hashCode()) {
                case -1249346035:
                    if (name.equals(C0158.f299)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -75151821:
                    if (name.equals(C0158.f313)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3237136:
                    if (name.equals("init")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2101377334:
                    if (name.equals(C0158.f298)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return Boolean.valueOf(C0158.f295.m206((HashMap) objArr[0]));
            }
            if (c == 1) {
                return C0158.f295.m204((HashMap) objArr[0]);
            }
            if (c == 2) {
                return C0158.f295.m203((HashMap) objArr[0]);
            }
            if (c != 3) {
                return null;
            }
            return C0158.f295.m205((HashMap) objArr[0]);
        }
    }

    private C0158(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f296 = iSecurityGuardPlugin;
    }

    /* renamed from: б  reason: contains not printable characters */
    private String m199(byte[] bArr, int i, HashMap<String, Object> hashMap) throws SecException {
        try {
            String str = new String(bArr, "UTF-8");
            String str2 = (String) hashMap.get("appkey");
            if (str2 == null || str2.length() <= 0) {
                throw new SecException(SecExceptionCode.SEC_ERROR_MIDDLE_TIER_NO_APPKEY);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("INPUT", str);
            if (i == 2) {
                hashMap2.put("ATLAS", "daily");
            }
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.appKey = str2;
            securityGuardParamContext.requestType = 7;
            securityGuardParamContext.paramMap = hashMap2;
            return SecurityGuardManager.getInstance(f293).getSecureSignatureComp().signRequest(securityGuardParamContext, f300);
        } catch (UnsupportedEncodingException unused) {
            throw new SecException(2304);
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public static Object m200(Class cls, ISecurityGuardPlugin iSecurityGuardPlugin, Context context) {
        if (f294 == null) {
            synchronized (C0158.class) {
                if (f294 == null) {
                    f294 = C0148.m159(cls, f312);
                    f295 = new C0158(iSecurityGuardPlugin);
                    f293 = context;
                }
            }
        }
        return f294;
    }

    /* renamed from: ж  reason: contains not printable characters */
    private boolean m201() throws SecException {
        return false;
    }

    /* renamed from: з  reason: contains not printable characters */
    private String m202(byte[] bArr, int i) throws SecException {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: в  reason: contains not printable characters */
    public HashMap<String, String> m203(HashMap<String, Object> hashMap) throws SecException {
        int i;
        HashMap hashMap2;
        int i2 = 0;
        if (hashMap == null || !hashMap.isEmpty()) {
            hashMap2 = null;
            i = 0;
        } else {
            if (hashMap.containsKey("env")) {
                i2 = ((Integer) hashMap.get("env")).intValue();
            }
            if (hashMap.containsKey(f307)) {
                hashMap2 = (HashMap) hashMap.get(f307);
                i = i2;
            } else {
                hashMap2 = null;
                i = i2;
            }
        }
        if (i != 0 && i != 1 && i != 2) {
            throw new SecException(2301);
        } else if (m206(hashMap)) {
            String securityBodyDataEx = ((ISecurityBodyComponent) SecurityGuardManager.getInstance(f293).getInterface(ISecurityBodyComponent.class)).getSecurityBodyDataEx(null, null, null, hashMap2, 8, i);
            if (securityBodyDataEx == null) {
                return null;
            }
            HashMap<String, String> hashMap3 = new HashMap<>();
            hashMap3.put(f310, securityBodyDataEx);
            return hashMap3;
        } else {
            throw new SecException(SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED);
        }
    }

    /* renamed from: д  reason: contains not printable characters */
    public HashMap<String, String> m204(HashMap<String, Object> hashMap) throws SecException {
        if (hashMap == null || hashMap.isEmpty()) {
            throw new SecException(2301);
        }
        byte[] bArr = (byte[]) hashMap.get("data");
        int i = 0;
        if (hashMap.containsKey("env")) {
            i = ((Integer) hashMap.get("env")).intValue();
        }
        if (bArr == null || bArr.length <= 0 || !(i == 0 || i == 1 || i == 2)) {
            throw new SecException(2301);
        } else if (m206(hashMap)) {
            String str = m199(bArr, i, hashMap);
            if (str == null) {
                return null;
            }
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put("x-sign", str);
            return hashMap2;
        } else {
            throw new SecException(SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED);
        }
    }

    /* renamed from: е  reason: contains not printable characters */
    public HashMap<String, String> m205(HashMap<String, Object> hashMap) throws SecException {
        return null;
    }

    /* renamed from: ё  reason: contains not printable characters */
    public boolean m206(HashMap<String, Object> hashMap) throws SecException {
        String str;
        if (this.f314 != null) {
            return true;
        }
        synchronized (C0158.class) {
            if (hashMap != null) {
                if (!hashMap.isEmpty() && hashMap.containsKey("auth_code") && (str = (String) hashMap.get("auth_code")) != null && str.length() > 0) {
                    f300 = str;
                    f301 = str + f308;
                }
            }
        }
        return true;
    }
}
