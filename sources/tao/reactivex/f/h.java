package tao.reactivex.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Callable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class h extends a implements Callable<Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097516);
    }

    public h(Runnable runnable) {
        super(runnable);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/h");
    }

    public Void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Void) ipChange.ipc$dispatch("9986b453", new Object[]{this});
        }
        this.b = Thread.currentThread();
        try {
            this.f15452a.run();
            return null;
        } finally {
            lazySet(a.c);
            this.b = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Void, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public /* synthetic */ Void call() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        return c();
    }
}
