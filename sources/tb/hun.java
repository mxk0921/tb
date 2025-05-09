package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hun implements idb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20907a;
    public Class<?> b;
    public Constructor<?> c;
    public final String d;
    public final int e;
    public final Map<String, i11> f;
    public final String g;

    static {
        t2o.a(144703513);
        t2o.a(144703511);
    }

    public hun(String str, int i, Map<String, i11> map, String str2) {
        ckf.g(str, "implClsName");
        ckf.g(map, "apiSpecs");
        this.d = str;
        this.e = i;
        this.f = map;
        this.g = str2;
        this.f20907a = "ReflexAbilityBuilder";
    }

    @Override // tb.idb
    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e589b895", new Object[]{this, str})).intValue();
        }
        ckf.g(str, "api");
        i11 i11Var = d().get(str);
        if (i11Var != null) {
            return i11Var.d();
        }
        return 2;
    }

    @Override // tb.idb
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96108063", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "api");
        if (d().isEmpty()) {
            return true;
        }
        return d().keySet().contains(str);
    }

    @Override // tb.idb
    public hdb build() {
        hdb hdbVar;
        f();
        try {
            Class<?> cls = this.b;
            if (cls != null) {
                Object newInstance = cls.newInstance();
                if (!TextUtils.isEmpty(this.g)) {
                    Constructor<?> constructor = this.c;
                    if (constructor != null) {
                        Object newInstance2 = constructor.newInstance(newInstance);
                        if (newInstance2 != null) {
                            hdbVar = (hdb) newInstance2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.IAbility");
                        }
                    }
                } else if (newInstance != null) {
                    hdbVar = (hdb) newInstance;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.IAbility");
                }
                return hdbVar;
            }
            return null;
        } catch (Throwable th) {
            iih.INSTANCE.a(this.f20907a, "反射创建能力实现类失败，错误原因：".concat(sm8.b(th)));
            return null;
        }
    }

    @Override // tb.idb
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52ec830e", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public Map<String, i11> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cee07510", new Object[]{this});
        }
        return this.f;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28a0acfa", new Object[]{this});
        }
        return this.d;
    }

    public /* synthetic */ hun(String str, int i, Map map, String str2, int i2, a07 a07Var) {
        this(str, (i2 & 2) != 0 ? 4 : i, map, (i2 & 8) != 0 ? null : str2);
    }

    public final void f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            if (this.b == null && !TextUtils.isEmpty(this.d)) {
                mnb c = cjf.INSTANCE.c();
                this.b = c != null ? c.a(this.d) : null;
            }
            if (this.c == null && (str = this.g) != null && !TextUtils.isEmpty(str)) {
                Class<?> cls = Class.forName(this.g);
                Class<?> cls2 = this.b;
                if (cls2 != null) {
                    this.c = cls.getConstructor(cls2.getSuperclass());
                    return;
                }
                iih.INSTANCE.a(this.f20907a, "无法反射获取能力实现类，能力调用失败");
                xhv xhvVar = xhv.INSTANCE;
            }
        } catch (Throwable th) {
            iih.INSTANCE.a(this.f20907a, "反射查找能力实现类失败，错误原因：".concat(sm8.b(th)));
        }
    }
}
