package com.alibaba.wireless.security.open.edgecomputing;

import android.os.Handler;
import android.util.Base64;
import com.alibaba.wireless.security.open.SecException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import tb.pg1;

/* loaded from: classes.dex */
public class ProxyUtil {

    /* renamed from: а  reason: contains not printable characters */
    private static volatile Handler f347;

    /* renamed from: com.alibaba.wireless.security.open.edgecomputing.ProxyUtil$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class C0163 implements InvocationHandler {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ Object f348;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ int f349;

        C0163(Object obj, int i) {
            this.f348 = obj;
            this.f349 = i;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Object obj2 = this.f348;
            try {
                ProxyUtil.m217(this.f349, obj, name, objArr, obj2 != null ? obj2.getClass().getCanonicalName() : null);
            } catch (SecException unused) {
            }
            Object obj3 = this.f348;
            if (obj3 != null) {
                return method.invoke(obj3, objArr);
            }
            String name2 = method.getReturnType().getName();
            char c = 65535;
            switch (name2.hashCode()) {
                case -1808118735:
                    if (name2.equals(pg1.ATOM_String)) {
                        c = 2;
                        break;
                    }
                    break;
                case -672261858:
                    if (name2.equals("Integer")) {
                        c = 3;
                        break;
                    }
                    break;
                case 104431:
                    if (name2.equals("int")) {
                        c = 1;
                        break;
                    }
                    break;
                case 64711720:
                    if (name2.equals("boolean")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1729365000:
                    if (name2.equals(pg1.ATOM_Boolean)) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c == 2) {
                        return "";
                    }
                    if (c != 3) {
                        if (c != 4) {
                            return null;
                        }
                    }
                }
                return 0;
            }
            return Boolean.FALSE;
        }
    }

    public static Handler getHandler() {
        return f347;
    }

    public static Object getProxyInstance(String str, Object obj, int i) {
        try {
            Class<?> cls = Class.forName(new String(Base64.decode(str, 0)));
            if (cls == null) {
                return null;
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0163(obj, i));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void init(Handler handler) {
        f347 = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: б  reason: contains not printable characters */
    public static void m217(int i, Object obj, String str, Object[] objArr, String str2) throws SecException {
        C0165.m221().doCommand(i, obj, str, objArr, str2);
    }
}
