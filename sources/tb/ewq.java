package tb;

import de.greenrobot.event.ThreadMode;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ewq {

    /* renamed from: a  reason: collision with root package name */
    public final Method f18854a;
    public final ThreadMode b;
    public final Class<?> c;
    public String d;

    public ewq(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f18854a = method;
        this.b = threadMode;
        this.c = cls;
    }

    public final synchronized void a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f18854a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f18854a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ewq)) {
            return false;
        }
        a();
        ewq ewqVar = (ewq) obj;
        ewqVar.a();
        return this.d.equals(ewqVar.d);
    }

    public int hashCode() {
        return this.f18854a.hashCode();
    }
}
