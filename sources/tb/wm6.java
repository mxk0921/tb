package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wm6<T> extends vm6<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Object c = new Object();

    static {
        t2o.a(444596585);
    }

    public wm6(int i) {
        super(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(wm6 wm6Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -493686155) {
            return super.acquire();
        }
        if (hashCode == 1793612142) {
            return new Boolean(super.release(objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/DXViewDiffCachePools$SynchronizedPool");
    }

    @Override // tb.vm6, tb.um6
    public T acquire() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e292f275", new Object[]{this});
        }
        synchronized (this.c) {
            t = (T) super.acquire();
        }
        return t;
    }

    @Override // tb.vm6, tb.um6
    public boolean release(T t) {
        boolean release;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ae8596e", new Object[]{this, t})).booleanValue();
        }
        synchronized (this.c) {
            release = super.release(t);
        }
        return release;
    }
}
