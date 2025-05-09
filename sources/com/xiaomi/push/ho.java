package com.xiaomi.push;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ho {

    /* renamed from: a  reason: collision with root package name */
    private static ho f14933a;

    /* renamed from: a  reason: collision with other field name */
    private Map<String, Object> f1110a = new ConcurrentHashMap();
    private Map<String, Object> b = new ConcurrentHashMap();

    private ho() {
        m766a();
    }

    public static synchronized ho a() {
        ho hoVar;
        synchronized (ho.class) {
            try {
                if (f14933a == null) {
                    f14933a = new ho();
                }
                hoVar = f14933a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hoVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Object m765a(String str, String str2) {
        return this.f1110a.get(a(str, str2));
    }

    private String a(String str, String str2) {
        StringBuilder sb = new StringBuilder("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m766a() {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ho.m766a():void");
    }

    public void a(String str, String str2, Object obj) {
        if ((obj instanceof hn) || (obj instanceof Class)) {
            this.f1110a.put(a(str, str2), obj);
            return;
        }
        throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
    }

    /* renamed from: a  reason: collision with other method in class */
    private ClassLoader[] m764a() {
        ClassLoader[] classLoaderArr = {ho.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            ClassLoader classLoader = classLoaderArr[i];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }
}
