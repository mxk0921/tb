package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.Priority;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ljf implements Runnable, Comparable<ljf> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f23367a;
    private final Priority b;
    private final int c;

    static {
        t2o.a(377487428);
    }

    public ljf(Runnable runnable, Priority priority, int i) {
        this.f23367a = runnable;
        this.b = priority;
        this.c = i;
    }

    /* renamed from: a */
    public int compareTo(ljf ljfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8c114f0", new Object[]{this, ljfVar})).intValue();
        }
        Priority priority = this.b;
        Priority priority2 = ljfVar.b;
        if (priority == priority2) {
            return this.c - ljfVar.c;
        }
        return priority2.ordinal() - this.b.ordinal();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            this.f23367a.run();
        }
    }
}
