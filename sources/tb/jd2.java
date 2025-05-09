package tb;

import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class jd2<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jfr<T> f21928a;
    public final zfr<T> b;

    static {
        t2o.a(803209222);
    }

    public jd2(jfr<T> jfrVar, zfr<T> zfrVar) {
        ckf.g(jfrVar, "context");
        ckf.g(zfrVar, "pageManager");
        this.f21928a = jfrVar;
        this.b = zfrVar;
    }

    public final jfr<T> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jfr) ipChange.ipc$dispatch("4e242869", new Object[]{this});
        }
        return this.f21928a;
    }

    public final zfr<T> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zfr) ipChange.ipc$dispatch("94e78ccb", new Object[]{this});
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract List<na4<?>> e(T t);

    public abstract void f(Bundle bundle);

    public abstract void g(Bundle bundle, z3o z3oVar);
}
