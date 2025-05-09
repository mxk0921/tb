package tao.reactivex.d.a;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.sxx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class d extends AtomicReference<sxx> implements sxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(628097390);
        t2o.a(628097368);
    }

    public d() {
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/a/d");
    }

    public boolean a(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0a041a6", new Object[]{this, sxxVar})).booleanValue();
        }
        return a.a((AtomicReference<sxx>) this, sxxVar);
    }

    @Override // tb.sxx
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : a.a(get());
    }

    @Override // tb.sxx
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else {
            a.a((AtomicReference<sxx>) this);
        }
    }

    public d(sxx sxxVar) {
        lazySet(sxxVar);
    }

    public boolean b(sxx sxxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eca1d085", new Object[]{this, sxxVar})).booleanValue() : a.c(this, sxxVar);
    }
}
