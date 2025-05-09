package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class c extends AtomicReference<Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097487);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/h/c");
    }

    public Throwable a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Throwable) ipChange.ipc$dispatch("7a107d4d", new Object[]{this}) : e.b(this);
    }

    public boolean a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb9ad891", new Object[]{this, th})).booleanValue() : e.c(this, th);
    }
}
