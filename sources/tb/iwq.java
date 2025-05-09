package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class iwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21619a;
    public final rl8 b;
    public final WeakReference<rl8> c;
    public final ek8 d;
    public volatile boolean e = true;

    static {
        t2o.a(723517466);
    }

    public iwq(int i, rl8 rl8Var, ek8 ek8Var, boolean z) {
        this.f21619a = i;
        this.d = ek8Var;
        if (z) {
            this.b = null;
            this.c = new WeakReference<>(rl8Var);
            return;
        }
        this.b = rl8Var;
        this.c = null;
    }

    public ek8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ek8) ipChange.ipc$dispatch("8fc590d1", new Object[]{this});
        }
        return this.d;
    }

    public rl8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rl8) ipChange.ipc$dispatch("a8677af1", new Object[]{this});
        }
        rl8 rl8Var = this.b;
        if (rl8Var != null) {
            return rl8Var;
        }
        WeakReference<rl8> weakReference = this.c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (!(obj instanceof iwq)) {
            return false;
        }
        iwq iwqVar = (iwq) obj;
        if (this.b == iwqVar.b && this.f21619a == iwqVar.f21619a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.b.hashCode();
    }
}
