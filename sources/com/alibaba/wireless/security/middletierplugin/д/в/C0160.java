package com.alibaba.wireless.security.middletierplugin.д.в;

import android.content.Context;
import android.util.Log;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.middletierplugin.C0146;
import com.alibaba.wireless.security.middletierplugin.C0148;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.HashMap;

/* renamed from: com.alibaba.wireless.security.middletierplugin.д.в.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0160 {

    /* renamed from: а  reason: contains not printable characters */
    private static Context f315 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static volatile Object f316 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static ISecurityGuardPlugin f317 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static C0160 f318 = null;

    /* renamed from: д  reason: contains not printable characters */
    private static final String f319 = "init";

    /* renamed from: е  reason: contains not printable characters */
    private static final String f320 = "getSecurityFactors";

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f321 = "data";

    /* renamed from: з  reason: contains not printable characters */
    private static final String f322 = "appkey";

    /* renamed from: и  reason: contains not printable characters */
    private static final String f323 = "api";

    /* renamed from: й  reason: contains not printable characters */
    private static final String f324 = "env";

    /* renamed from: к  reason: contains not printable characters */
    private static final String f325 = "extendParas";

    /* renamed from: л  reason: contains not printable characters */
    private static final String f326 = "useWua";

    /* renamed from: м  reason: contains not printable characters */
    private static final String f327 = "signKey";

    /* renamed from: н  reason: contains not printable characters */
    private static final String f328 = "miniWua";

    /* renamed from: о  reason: contains not printable characters */
    private static final String f329 = "requestId";

    /* renamed from: п  reason: contains not printable characters */
    private static final String f330 = "bizId";

    /* renamed from: р  reason: contains not printable characters */
    private static final String f331 = "flag";

    /* renamed from: с  reason: contains not printable characters */
    private static boolean f332 = false;

    /* renamed from: т  reason: contains not printable characters */
    private static InvocationHandler f333 = new C0161();

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f334 = "authCode";

    /* renamed from: com.alibaba.wireless.security.middletierplugin.д.в.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0161 implements InvocationHandler {
        C0161() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            char c;
            String name = method.getName();
            int hashCode = name.hashCode();
            if (hashCode != 3237136) {
                if (hashCode == 165313390 && name.equals(C0160.f320)) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (name.equals("init")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                C0160.f318.m213((HashMap) objArr[0]);
                return null;
            } else if (c != 1) {
                return null;
            } else {
                return C0160.f318.m212((HashMap) objArr[0]);
            }
        }
    }

    private C0160(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f317 = iSecurityGuardPlugin;
    }

    /* renamed from: б  reason: contains not printable characters */
    private String m208(HashMap<String, String> hashMap) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (hashMap != null) {
            for (String str2 : hashMap.keySet()) {
                String str3 = m211(str2);
                if (!(str3 == null || str3.length() <= 0 || (str = m211(hashMap.get(str3))) == null)) {
                    if (sb.length() != 0) {
                        sb.append("&");
                    }
                    sb.append(str3);
                    sb.append("=");
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: в  reason: contains not printable characters */
    public static Long m209() {
        Long valueOf = Long.valueOf(System.currentTimeMillis() * 1000);
        Long valueOf2 = Long.valueOf(System.nanoTime());
        return Long.valueOf(valueOf.longValue() + ((valueOf2.longValue() - ((valueOf2.longValue() / 1000000) * 1000000)) / 1000));
    }

    /* renamed from: г  reason: contains not printable characters */
    public static Object m210(Class cls, ISecurityGuardPlugin iSecurityGuardPlugin, Context context) {
        if (f316 == null) {
            synchronized (C0160.class) {
                if (f316 == null) {
                    f316 = C0148.m159(cls, f333);
                    f318 = new C0160(iSecurityGuardPlugin);
                    f315 = context;
                }
            }
        }
        return f316;
    }

    /* renamed from: ё  reason: contains not printable characters */
    private String m211(String str) {
        if (str != null) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: д  reason: contains not printable characters */
    public HashMap<String, String> m212(HashMap<String, Object> hashMap) throws SecException {
        HashMap<String, String> hashMap2;
        if (hashMap == null || hashMap.isEmpty()) {
            throw new SecException(SecExceptionCode.SEC_ERROR_UNIFIED_SECURITY_INVALID_PARA);
        } else if (hashMap.isEmpty() || !hashMap.containsKey("appkey") || !hashMap.containsKey("data") || !hashMap.containsKey(f326) || hashMap.get("appkey") == null || hashMap.get("data") == null || hashMap.get(f326) == null) {
            throw new SecException(SecExceptionCode.SEC_ERROR_UNIFIED_SECURITY_INVALID_PARA);
        } else {
            C0146.m154(f320);
            String str = (String) hashMap.get("appkey");
            String str2 = (String) hashMap.get("data");
            boolean booleanValue = ((Boolean) hashMap.get(f326)).booleanValue();
            String str3 = null;
            String str4 = (!hashMap.containsKey(f334) || hashMap.get(f334) == null) ? null : (String) hashMap.get(f334);
            String str5 = (!hashMap.containsKey(f327) || hashMap.get(f327) == null) ? null : (String) hashMap.get(f327);
            int intValue = (!hashMap.containsKey("env") || hashMap.get("env") == null) ? 0 : ((Integer) hashMap.get("env")).intValue();
            String str6 = hashMap.get("api") != null ? (String) hashMap.get("api") : null;
            String str7 = (!hashMap.containsKey(f325) || hashMap.get(f325) == null) ? null : m208((HashMap) hashMap.get(f325));
            String str8 = (!hashMap.containsKey(f328) || hashMap.get(f328) == null) ? null : (String) hashMap.get(f328);
            if (hashMap.containsKey(f329) && hashMap.get(f329) != null) {
                str3 = (String) hashMap.get(f329);
            }
            int intValue2 = (!hashMap.containsKey("bizId") || hashMap.get("bizId") == null) ? 0 : ((Integer) hashMap.get("bizId")).intValue();
            int intValue3 = (!hashMap.containsKey("flag") || hashMap.get("flag") == null) ? 0 : ((Integer) hashMap.get("flag")).intValue();
            synchronized (f333) {
                f317.getRouter().doCommand(70103, Integer.valueOf(intValue2));
                hashMap2 = (HashMap) f317.getRouter().doCommand(70102, str, str2, Boolean.valueOf(booleanValue), Integer.valueOf(intValue), str6, str7, str4, str5, str8, str3, Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            }
            C0146.m153(f320);
            if (!f332) {
                Log.e("ValarMorghulis", "f");
                f332 = true;
            }
            return hashMap2;
        }
    }

    /* renamed from: е  reason: contains not printable characters */
    public void m213(HashMap<String, Object> hashMap) throws SecException {
        f317.getRouter().doCommand(70101, (hashMap == null || hashMap.isEmpty() || !hashMap.containsKey(f334)) ? "" : (String) hashMap.get(f334), Integer.valueOf(hashMap.containsKey("flag") ? ((Integer) hashMap.get("flag")).intValue() : 0));
    }
}
