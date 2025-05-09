package tao.reactivex.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class g extends a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097515);
    }

    public g(Runnable runnable) {
        super(runnable);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/g");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.b = Thread.currentThread();
        try {
            this.f15452a.run();
        } finally {
            try {
            } finally {
            }
        }
    }
}
