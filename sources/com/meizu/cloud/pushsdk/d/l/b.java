package com.meizu.cloud.pushsdk.d.l;

import com.meizu.cloud.pushinternal.DebugLogger;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final a f5792a;
    private final Class<?>[] b;

    public b(a aVar, Class<?>... clsArr) {
        this.f5792a = aVar;
        this.b = clsArr;
    }

    public <T> d<T> a(Object... objArr) {
        d<T> dVar = new d<>();
        try {
            Constructor<?> declaredConstructor = this.f5792a.a().getDeclaredConstructor(this.b);
            declaredConstructor.setAccessible(true);
            dVar.b = (T) declaredConstructor.newInstance(objArr);
            dVar.f5794a = true;
        } catch (Exception e) {
            DebugLogger.e("ReflectConstructor", "newInstance", e);
        }
        return dVar;
    }
}
