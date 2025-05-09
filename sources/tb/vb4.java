package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class vb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<Long> f29903a = new CopyOnWriteArrayList<>();
    public long b;

    static {
        t2o.a(912261366);
    }

    public vb4(long j) {
        this.b = j;
    }

    public final CopyOnWriteArrayList<Long> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("a91aa1eb", new Object[]{this});
        }
        return this.f29903a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47d93975", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79ef6f", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }
}
