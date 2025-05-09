package com.alibaba.wireless.security.middletierplugin.open.sensor;

import android.content.Context;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.middletierplugin.C0148;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.sensor.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0144 {

    /* renamed from: а  reason: contains not printable characters */
    private static ISecurityGuardPlugin f241 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static Context f242 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static C0144 f243 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static volatile Object f244 = null;

    /* renamed from: д  reason: contains not printable characters */
    private static final String f245 = "init";

    /* renamed from: е  reason: contains not printable characters */
    private static final String f246 = "process";

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f247 = "token";

    /* renamed from: з  reason: contains not printable characters */
    private static final String f248 = "processResult";

    /* renamed from: и  reason: contains not printable characters */
    private static final String f249 = "data";

    /* renamed from: й  reason: contains not printable characters */
    private static InvocationHandler f250 = new C0145();

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f251 = "config";

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.sensor.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0145 implements InvocationHandler {
        C0145() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            char c;
            String name = method.getName();
            int hashCode = name.hashCode();
            if (hashCode != -309518737) {
                if (hashCode == 3237136 && name.equals("init")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (name.equals("process")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                C0144.f243.m150((HashMap) objArr[0]);
                return null;
            } else if (c != 1) {
                return null;
            } else {
                return C0144.f243.m151(Integer.parseInt(String.valueOf(objArr[0])));
            }
        }
    }

    private C0144(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f241 = iSecurityGuardPlugin;
    }

    /* renamed from: б  reason: contains not printable characters */
    public static Object m149(Class cls, ISecurityGuardPlugin iSecurityGuardPlugin, Context context) {
        if (f244 == null) {
            synchronized (C0144.class) {
                if (f244 == null) {
                    f244 = C0148.m159(cls, f250);
                    f243 = new C0144(iSecurityGuardPlugin);
                    f242 = context;
                }
            }
        }
        return f244;
    }

    /* renamed from: в  reason: contains not printable characters */
    public void m150(HashMap<String, Object> hashMap) throws SecException {
        if (hashMap != null) {
            f241.getRouter().doCommand(70701, (String) hashMap.get("config"), (String) hashMap.get("token"));
            return;
        }
        throw new SecException(SecExceptionCode.SEC_ERROR_SENSOR_INVALID_PARA);
    }

    /* renamed from: г  reason: contains not printable characters */
    public HashMap<String, Object> m151(int i) throws SecException {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                byte[] bArr = (byte[]) f241.getRouter().doCommand(70702, Integer.valueOf(i));
                if (bArr != null) {
                    hashMap.put("data", new String(bArr));
                }
                return hashMap;
            } else if (i != 4) {
                throw new SecException(SecExceptionCode.SEC_ERROR_SENSOR_INVALID_PARA);
            }
        }
        hashMap.put("processResult", Boolean.valueOf(((Boolean) f241.getRouter().doCommand(70702, Integer.valueOf(i))).booleanValue()));
        return hashMap;
    }
}
