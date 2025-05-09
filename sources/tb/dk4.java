package tb;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.function.Supplier;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dk4 implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor f17878a;
    public final Class b;
    public final boolean c;
    public final int d;

    public dk4(Constructor constructor) {
        boolean z = true;
        constructor.setAccessible(true);
        this.f17878a = constructor;
        Class declaringClass = constructor.getDeclaringClass();
        this.b = declaringClass;
        int length = constructor.getParameterTypes().length;
        this.d = length;
        this.c = (length != 0 || !Modifier.isPublic(constructor.getModifiers()) || !Modifier.isPublic(declaringClass.getModifiers())) ? false : z;
    }

    @Override // com.alibaba.fastjson2.function.Supplier
    public Object get() {
        try {
            if (this.c) {
                return this.b.newInstance();
            }
            int i = this.d;
            Constructor constructor = this.f17878a;
            if (i == 1) {
                return constructor.newInstance(new Object[1]);
            }
            return constructor.newInstance(new Object[0]);
        } catch (Throwable th) {
            throw new JSONException("create instance error", th);
        }
    }
}
