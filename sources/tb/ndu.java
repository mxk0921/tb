package tb;

import com.android.alibaba.ip.runtime.IpChange;
import io.reactivex.internal.functions.ObjectHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ndu implements Comparable<ndu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f24667a;
    public final long b;
    public final int c;
    public volatile boolean d;

    static {
        t2o.a(973078547);
    }

    public ndu(Runnable runnable, Long l, int i) {
        this.f24667a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    /* renamed from: a */
    public int compareTo(ndu nduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bf5285e", new Object[]{this, nduVar})).intValue();
        }
        int compare = ObjectHelper.compare(this.b, nduVar.b);
        if (compare == 0) {
            return ObjectHelper.compare(this.c, nduVar.c);
        }
        return compare;
    }
}
