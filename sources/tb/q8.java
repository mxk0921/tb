package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.m8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class q8<T extends m8<?>> implements w8<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f26571a;

    static {
        t2o.a(336592922);
        t2o.a(336592930);
    }

    public q8(Class<T> cls) {
        ckf.g(cls, "abilityClass");
        this.f26571a = cls;
    }

    /* renamed from: a */
    public m8<?> build(T t) {
        try {
            return this.f26571a.newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
