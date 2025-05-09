package com.uc.webview.internal.setup.component;

import com.uc.webview.internal.setup.component.k;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class l implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private final j f14429a;

    public l(j jVar) {
        this.f14429a = jVar;
    }

    private static int a(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        char c;
        try {
            String name = method.getName();
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1353036278:
                    if (name.equals("onBegin")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1349867671:
                    if (name.equals("onError")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1295482945:
                    if (name.equals("equals")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1123967826:
                    if (name.equals("onFinish")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1768875308:
                    if (name.equals("onProgress")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1935774887:
                    if (name.equals("onGetBundleInfo")) {
                        c = 3;
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
                    return Boolean.valueOf(obj == objArr[0]);
                case 1:
                    return Integer.valueOf(hashCode());
                case 2:
                    return "U4Pars.ParsPkgCB" + hashCode();
                case 3:
                    Object obj2 = objArr[0];
                    this.f14429a.a(obj2 != null ? new k.e(obj2) : null);
                    return Void.TYPE;
                case 4:
                    this.f14429a.a();
                    break;
                case 5:
                    this.f14429a.a(a(objArr[1]));
                    break;
                case 6:
                    boolean z = objArr[1] instanceof String;
                    break;
                case 7:
                    this.f14429a.c(a(objArr[1]));
                    break;
            }
        } catch (Throwable unused) {
            method.getName();
            if (objArr.length > 0) {
                Object obj3 = objArr[0];
            }
            if (objArr.length >= 2) {
                new StringBuilder(", ").append(objArr[1]);
            }
        }
        return Void.TYPE;
    }
}
