package com.alibaba.wireless.security.securitybody;

import com.alibaba.wireless.security.open.maldetection.IMalDetect;
import com.alibaba.wireless.security.open.securitybody.ISecurityBodyComponent;
import com.alibaba.wireless.security.open.simulatordetect.ISimulatorDetectComponent;
import com.alibaba.wireless.security.open.umid.IUMIDComponent;
import com.alibaba.wireless.security.open.umid.UMIDComponent;
import com.alibaba.wireless.security.securitybody.open.C0177;
import com.alibaba.wireless.security.securitybody.open.C0179;
import com.alibaba.wireless.security.securitybody.open.C0180;
import com.alibaba.wireless.security.securitybody.open.C0182;
import com.alibaba.wireless.security.securitybody.open.MalDetect;
import com.taobao.wireless.security.sdk.rootdetect.IRootDetectComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import а.б.а.а.а.ё.C1141;
import а.б.а.а.а.ё.C1142;
import а.б.а.а.а.ё.C1143;

/* renamed from: com.alibaba.wireless.security.securitybody.д  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0190 {
    /* renamed from: а  reason: contains not printable characters */
    public static Object m301(Class cls, InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
    }

    /* renamed from: б  reason: contains not printable characters */
    public void m302(ConcurrentHashMap<Class, Object> concurrentHashMap, SecurityGuardSecurityBodyPlugin securityGuardSecurityBodyPlugin) {
        concurrentHashMap.put(IUMIDComponent.class, new UMIDComponent(securityGuardSecurityBodyPlugin));
        concurrentHashMap.put(ISimulatorDetectComponent.class, new C0182(securityGuardSecurityBodyPlugin));
        concurrentHashMap.put(IMalDetect.class, new MalDetect(securityGuardSecurityBodyPlugin));
        concurrentHashMap.put(ISecurityBodyComponent.class, new C0179(securityGuardSecurityBodyPlugin));
        concurrentHashMap.put(com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent.class, new C1142(securityGuardSecurityBodyPlugin));
        concurrentHashMap.put(IRootDetectComponent.class, new C1141(securityGuardSecurityBodyPlugin));
        concurrentHashMap.put(com.taobao.wireless.security.sdk.simulatordetect.ISimulatorDetectComponent.class, new C1143(securityGuardSecurityBodyPlugin));
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.open.securitybodysdk.ISecurityBodyPageTrack");
            if (cls != null) {
                concurrentHashMap.put(cls, C0180.m260(cls, securityGuardSecurityBodyPlugin));
            }
            Class<?> cls2 = Class.forName("com.alibaba.wireless.security.open.lbsrisk.ILBSRiskComponent");
            if (cls2 != null) {
                concurrentHashMap.put(cls2, C0177.m252(cls2, securityGuardSecurityBodyPlugin));
            }
        } catch (Exception unused) {
        }
    }
}
