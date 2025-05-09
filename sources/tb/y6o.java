package tb;

import androidx.concurrent.futures.AbstractResolvableFuture;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class y6o<V> extends AbstractResolvableFuture<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(y6o y6oVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1497159596) {
            return new Boolean(y6oVar.r((bvg) objArr[0]));
        }
        if (hashCode == -165451895) {
            return new Boolean(super.p(objArr[0]));
        }
        if (hashCode == 1677774949) {
            return new Boolean(y6oVar.q((Throwable) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/concurrent/futures/ResolvableFuture");
    }

    public static <V> y6o<V> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y6o) ipChange.ipc$dispatch("fcb738bb", new Object[0]);
        }
        return new y6o<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean p(V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6236789", new Object[]{this, v})).booleanValue();
        }
        return super.p(v);
    }
}
