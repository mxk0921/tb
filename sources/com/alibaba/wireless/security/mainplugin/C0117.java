package com.alibaba.wireless.security.mainplugin;

import com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent;
import com.alibaba.wireless.security.open.compat.ICompatComponent;
import com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent;
import com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent;
import com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import а.а.а.а.а.а.C1120;
import а.а.а.а.а.в.C1123;
import а.а.а.а.а.г.C1124;
import а.а.а.а.а.д.C1125;
import а.а.а.а.а.е.C1126;
import а.а.а.а.а.ж.C1127;
import а.а.а.а.а.з.C1128;
import а.а.а.а.а.и.C1129;
import а.а.а.а.а.й.C1130;
import а.а.а.а.а.к.C1131;
import а.а.а.а.а.ё.C1132;
import а.б.а.а.а.а.C1133;
import а.б.а.а.а.б.C1134;
import а.б.а.а.а.в.C1135;
import а.б.а.а.а.г.C1136;
import а.б.а.а.а.д.C1137;
import а.б.а.а.а.е.C1138;
import а.б.а.а.а.ж.C1139;
import а.б.а.а.а.з.C1140;

/* renamed from: com.alibaba.wireless.security.mainplugin.е  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0117 {
    /* renamed from: а  reason: contains not printable characters */
    public static Object m68(Class cls, InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: б  reason: contains not printable characters */
    public void m69(ConcurrentHashMap<Class, Object> concurrentHashMap, String str, SecurityGuardMainPlugin securityGuardMainPlugin) {
        char c;
        Class cls;
        Object obj;
        switch (str.hashCode()) {
            case -2107806319:
                if (str.equals("com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1726912853:
                if (str.equals("com.alibaba.wireless.security.open.dynamicdatastore.IDynamicDataStoreComponent")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1508190505:
                if (str.equals("com.alibaba.wireless.security.open.compat.ICompatComponent")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1062752269:
                if (str.equals("com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -759346967:
                if (str.equals("com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -680196717:
                if (str.equals("com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -319873839:
                if (str.equals("com.alibaba.wireless.security.open.safetoken.ISafeTokenComponent")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -308669071:
                if (str.equals("com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -202074525:
                if (str.equals("com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 541243213:
                if (str.equals("com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 656374963:
                if (str.equals("com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 1093102771:
                if (str.equals("com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1282550417:
                if (str.equals("com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1441811571:
                if (str.equals("com.alibaba.wireless.security.open.statickeyencrypt.IStaticKeyEncryptComponent")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1464630417:
                if (str.equals("com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1852512071:
                if (str.equals("com.alibaba.wireless.security.open.atlasencrypt.IAtlasEncryptComponent")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1886348549:
                if (str.equals("com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2012272205:
                if (str.equals("com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2038834859:
                if (str.equals("com.alibaba.wireless.security.open.datacollection.IDataCollectionComponent")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                cls = IAtlasEncryptComponent.class;
                obj = new C1120(securityGuardMainPlugin);
                break;
            case 1:
                cls = IDataCollectionComponent.class;
                obj = new C1124(securityGuardMainPlugin);
                break;
            case 2:
                cls = IDynamicDataEncryptComponent.class;
                obj = new C1125(securityGuardMainPlugin);
                break;
            case 3:
                cls = IDynamicDataStoreComponent.class;
                obj = new C1126(securityGuardMainPlugin);
                break;
            case 4:
                cls = IOpenSDKComponent.class;
                obj = new C1132(securityGuardMainPlugin);
                break;
            case 5:
                cls = ISecureSignatureComponent.class;
                obj = new C1128(securityGuardMainPlugin);
                break;
            case 6:
                cls = IStaticDataEncryptComponent.class;
                obj = new C1129(securityGuardMainPlugin);
                break;
            case 7:
                cls = IStaticDataStoreComponent.class;
                obj = new C1130(securityGuardMainPlugin);
                break;
            case '\b':
                cls = IStaticKeyEncryptComponent.class;
                obj = new C1131(securityGuardMainPlugin);
                break;
            case '\t':
                cls = ISafeTokenComponent.class;
                obj = new C1127(securityGuardMainPlugin);
                break;
            case '\n':
                cls = ICompatComponent.class;
                obj = new C1123(securityGuardMainPlugin);
                break;
            case 11:
                cls = com.taobao.wireless.security.sdk.atlasencrypt.IAtlasEncryptComponent.class;
                obj = new C1133(securityGuardMainPlugin);
                break;
            case '\f':
                cls = com.taobao.wireless.security.sdk.datacollection.IDataCollectionComponent.class;
                obj = new C1134(securityGuardMainPlugin);
                break;
            case '\r':
                cls = com.taobao.wireless.security.sdk.dynamicdataencrypt.IDynamicDataEncryptComponent.class;
                obj = new C1135(securityGuardMainPlugin);
                break;
            case 14:
                cls = com.taobao.wireless.security.sdk.dynamicdatastore.IDynamicDataStoreComponent.class;
                obj = new C1136(securityGuardMainPlugin);
                break;
            case 15:
                cls = com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent.class;
                obj = new C1138(securityGuardMainPlugin);
                break;
            case 16:
                cls = com.taobao.wireless.security.sdk.staticdataencrypt.IStaticDataEncryptComponent.class;
                obj = new C1139(securityGuardMainPlugin);
                break;
            case 17:
                cls = com.taobao.wireless.security.sdk.staticdatastore.IStaticDataStoreComponent.class;
                obj = new C1140(securityGuardMainPlugin);
                break;
            case 18:
                cls = com.taobao.wireless.security.sdk.safetoken.ISafeTokenComponent.class;
                obj = new C1137(securityGuardMainPlugin);
                break;
            default:
                return;
        }
        concurrentHashMap.put(cls, obj);
    }

    /* renamed from: в  reason: contains not printable characters */
    public void m70(ConcurrentHashMap<Class, Object> concurrentHashMap, SecurityGuardMainPlugin securityGuardMainPlugin) {
        concurrentHashMap.put(IDataCollectionComponent.class, new C1124(securityGuardMainPlugin));
    }
}
