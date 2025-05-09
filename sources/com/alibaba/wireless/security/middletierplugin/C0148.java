package com.alibaba.wireless.security.middletierplugin;

import android.content.Context;
import com.alibaba.wireless.security.middletierplugin.open.es.SGWindowManager;
import com.alibaba.wireless.security.middletierplugin.open.fc.FCComponent;
import com.alibaba.wireless.security.middletierplugin.open.sensor.C0144;
import com.alibaba.wireless.security.middletierplugin.д.б.C0158;
import com.alibaba.wireless.security.middletierplugin.д.в.C0160;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.alibaba.wireless.security.middletierplugin.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0148 {
    /* renamed from: а  reason: contains not printable characters */
    public static Object m159(Class cls, InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
    }

    /* renamed from: б  reason: contains not printable characters */
    public void m160(ConcurrentHashMap<Class, Object> concurrentHashMap, SecurityGuardMiddleTierPlugin securityGuardMiddleTierPlugin, Context context) {
        Object proxyInstance;
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.open.middletier.IMiddleTierGenericComponent");
            if (cls != null) {
                concurrentHashMap.put(cls, C0158.m200(cls, securityGuardMiddleTierPlugin, context));
            }
        } catch (Exception unused) {
        }
        try {
            Class<?> cls2 = Class.forName("com.alibaba.wireless.security.open.middletier.fc.IFCComponent");
            if (!(cls2 == null || (proxyInstance = FCComponent.getProxyInstance(cls2, securityGuardMiddleTierPlugin)) == null)) {
                concurrentHashMap.put(cls2, proxyInstance);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Class<?> cls3 = Class.forName("com.alibaba.wireless.security.open.middletier.IUnifiedSecurityComponent");
            if (cls3 != null) {
                concurrentHashMap.put(cls3, C0160.m210(cls3, securityGuardMiddleTierPlugin, context));
            }
        } catch (Exception unused2) {
        }
        try {
            Class<?> cls4 = Class.forName("com.alibaba.wireless.security.open.middletier.ISensorComponent");
            if (cls4 != null) {
                concurrentHashMap.put(cls4, C0144.m149(cls4, securityGuardMiddleTierPlugin, context));
            }
        } catch (Exception unused3) {
        }
        SGWindowManager.init(securityGuardMiddleTierPlugin);
    }
}
