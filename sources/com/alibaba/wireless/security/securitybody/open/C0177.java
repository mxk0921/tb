package com.alibaba.wireless.security.securitybody.open;

import android.location.Location;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.securitybody.C0190;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.alibaba.wireless.security.securitybody.open.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0177 {

    /* renamed from: а  reason: contains not printable characters */
    private static volatile Object f429 = null;

    /* renamed from: б  reason: contains not printable characters */
    private static C0177 f430 = null;

    /* renamed from: в  reason: contains not printable characters */
    private static ISecurityGuardPlugin f431 = null;

    /* renamed from: г  reason: contains not printable characters */
    private static final String f432 = "initLBSManager";

    /* renamed from: д  reason: contains not printable characters */
    private static final String f433 = "putLocationData";

    /* renamed from: е  reason: contains not printable characters */
    private static final String f434 = "getLocationData";

    /* renamed from: ж  reason: contains not printable characters */
    private static final String f435 = "toString";

    /* renamed from: з  reason: contains not printable characters */
    private static InvocationHandler f436 = new C0178();

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f437 = "clearLocationData";

    /* renamed from: com.alibaba.wireless.security.securitybody.open.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0178 implements InvocationHandler {
        C0178() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            char c;
            String name = method.getName();
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1602740244:
                    if (name.equals(C0177.f437)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1543173714:
                    if (name.equals(C0177.f433)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1036535712:
                    if (name.equals(C0177.f432)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1567732597:
                    if (name.equals(C0177.f434)) {
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
                return Boolean.valueOf(C0177.f430.m255((HashMap) objArr[0]));
            }
            if (c == 1) {
                return Boolean.valueOf(C0177.f430.m256((Location) objArr[0]));
            }
            if (c == 2) {
                return C0177.f430.m254(((Integer) objArr[0]).intValue());
            }
            if (c == 3) {
                return Boolean.valueOf(C0177.f430.m253());
            }
            if (c != 4) {
                return null;
            }
            return obj.getClass().getName() + "&ID=" + hashCode();
        }
    }

    private C0177(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f431 = iSecurityGuardPlugin;
    }

    /* renamed from: г  reason: contains not printable characters */
    public static Object m252(Class cls, ISecurityGuardPlugin iSecurityGuardPlugin) {
        if (f429 == null) {
            synchronized (C0177.class) {
                if (f429 == null) {
                    f429 = C0190.m301(cls, f436);
                    f430 = new C0177(iSecurityGuardPlugin);
                }
            }
        }
        return f429;
    }

    /* renamed from: б  reason: contains not printable characters */
    public boolean m253() throws SecException {
        return true;
    }

    /* renamed from: в  reason: contains not printable characters */
    public String m254(int i) throws SecException {
        return "Abandoned";
    }

    /* renamed from: д  reason: contains not printable characters */
    public boolean m255(HashMap<String, Object> hashMap) throws SecException {
        return true;
    }

    /* renamed from: е  reason: contains not printable characters */
    public boolean m256(Location location) throws SecException {
        return true;
    }
}
