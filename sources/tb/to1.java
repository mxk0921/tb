package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class to1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final to1 b = new to1();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends rbo>, sbo<? extends rbo>> f28835a = new HashMap();

    static {
        t2o.a(962593057);
        t2o.a(962593058);
    }

    public static to1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (to1) ipChange.ipc$dispatch("9636d1", new Object[0]);
        }
        return b;
    }

    public final synchronized <T extends rbo> sbo<T> b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sbo) ipChange.ipc$dispatch("df1a0d0", new Object[]{this, cls});
        }
        sbo<T> sboVar = (sbo) ((HashMap) this.f28835a).get(cls);
        if (sboVar == null) {
            sboVar = new sbo<>();
            ((HashMap) this.f28835a).put(cls, sboVar);
        }
        return sboVar;
    }

    public <T extends rbo> void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c5a729", new Object[]{this, t});
        } else if (t != null) {
            b(t.getClass()).a(t);
        }
    }

    public <T extends rbo> T d(Class<T> cls, Object... objArr) {
        T b2 = b(cls).b();
        if (b2 == null) {
            try {
                b2 = cls.newInstance();
            } catch (Exception unused) {
            }
        }
        if (b2 != null) {
            b2.fill(objArr);
        }
        return b2;
    }
}
