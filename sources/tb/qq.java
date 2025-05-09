package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.collections.a;
import tb.hdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qq<T extends hdb> implements idb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f26875a;
    public final int b;
    public final Map<String, i11> c;

    static {
        t2o.a(144703504);
        t2o.a(144703511);
    }

    public qq(Class<T> cls) {
        this(cls, 0, null, 6, null);
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
        return 1;
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
        return d().containsKey(str);
    }

    @Override // tb.idb
    public T build() {
        try {
            return this.f26875a.newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // tb.idb
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("52ec830e", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public Map<String, i11> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cee07510", new Object[]{this});
        }
        return this.c;
    }

    public qq(Class<T> cls, int i, Map<String, i11> map) {
        ckf.g(cls, "abilityClass");
        ckf.g(map, "apiSpecs");
        this.f26875a = cls;
        this.b = i;
        this.c = map;
    }

    public /* synthetic */ qq(Class cls, int i, Map map, int i2, a07 a07Var) {
        this(cls, (i2 & 2) != 0 ? 4 : i, (i2 & 4) != 0 ? a.h() : map);
    }
}
