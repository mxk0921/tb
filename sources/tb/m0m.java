package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.appdevtools.core.storage.DevToolsStorage;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.io.Serializable;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class m0m<T extends Serializable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23697a;
    public final Class<T> b;
    public final g1a<T, xhv> c;
    public T d;

    static {
        t2o.a(998244377);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0m(String str, Class<T> cls, g1a<? super T, xhv> g1aVar) {
        ckf.g(str, "key");
        ckf.g(cls, "clazz");
        ckf.g(g1aVar, "onChanged");
        this.f23697a = str;
        this.b = cls;
        this.c = g1aVar;
    }

    public final T a() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((Serializable) ipChange.ipc$dispatch("b60ec72d", new Object[]{this}));
        }
        if (this.d == null) {
            String read = DevToolsStorage.b().read(this.f23697a);
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                this.d = (T) ((Serializable) rrf.c(read, this.b));
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                icn a2 = lcn.a(RVLLevel.Error, sgh.a("PersistentWrapper"));
                a2.a("error", "get " + this.f23697a + " error: " + th2).f();
            }
            lcn.a(RVLLevel.Info, sgh.a("PersistentWrapper")).j("get").a("key", this.f23697a).a("time", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis)).f();
        }
        return this.d;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        lcn.a(RVLLevel.Info, sgh.a("PersistentWrapper")).j(DMComponent.RESET).a("key", this.f23697a).f();
        this.d = null;
        DevToolsStorage.b().remove(this.f23697a);
    }

    public final void c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8131f33d", new Object[]{this, t});
            return;
        }
        ckf.g(t, "value");
        lcn.a(RVLLevel.Info, sgh.a("PersistentWrapper")).j("set").a("key", this.f23697a).f();
        this.c.invoke(t);
        this.d = t;
        DevToolsStorage.b().write(this.f23697a, rrf.b(t));
    }
}
