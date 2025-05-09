package com.meizu.cloud.pushsdk.d.l;

import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, Class<?>> f5791a = new HashMap<>();
    private Class<?> b;
    private String c;
    private Object d;

    private a(Object obj) {
        this.d = obj;
    }

    public static a a(Object obj) {
        return new a(obj);
    }

    private a(String str) {
        this.c = str;
    }

    public static a a(String str) {
        return new a(str);
    }

    public b a(Class<?>... clsArr) {
        return new b(this, clsArr);
    }

    public c a(String str, Class<?>... clsArr) {
        return new c(this, str, clsArr);
    }

    public Class<?> a() throws ClassNotFoundException {
        Class<?> cls = this.b;
        if (cls != null) {
            return cls;
        }
        Object obj = this.d;
        if (obj != null) {
            return obj.getClass();
        }
        HashMap<String, Class<?>> hashMap = f5791a;
        Class<?> cls2 = hashMap.get(this.c);
        if (cls2 == null) {
            cls2 = Class.forName(this.c);
            hashMap.put(this.c, cls2);
        }
        return cls2;
    }
}
