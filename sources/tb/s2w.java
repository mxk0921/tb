package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s2w implements ifj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f27769a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final Set<p2w> f = new CopyOnWriteArraySet();

    public s2w(String str, long j, long j2, long j3, long j4) {
        this.f27769a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    @Override // tb.tij
    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46ccbd16", new Object[]{this})).longValue();
        }
        return this.e;
    }

    @Override // tb.ifj
    public boolean b(p2w p2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85ffee69", new Object[]{this, p2wVar})).booleanValue();
        }
        return ((CopyOnWriteArraySet) this.f).add(p2wVar);
    }

    @Override // tb.tij
    public long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6756fb47", new Object[]{this})).longValue();
        }
        return this.c;
    }

    @Override // tb.ifj
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            ((CopyOnWriteArraySet) this.f).clear();
        }
    }

    @Override // tb.ifj
    public void d(r2w r2wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694a49d8", new Object[]{this, r2wVar});
            return;
        }
        for (p2w p2wVar : r2wVar) {
            if (!b(p2wVar)) {
                kva.d("VariationSetImpl", "error, exp " + c() + " addVariation " + p2wVar + " failed because it is already in the set");
            }
        }
    }

    @Override // tb.tij
    public long getExperimentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce6309e9", new Object[]{this})).longValue();
        }
        return this.b;
    }

    @Override // tb.tij
    public long getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5069a3f", new Object[]{this})).longValue();
        }
        return this.d;
    }

    @Override // tb.tij
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f27769a;
    }

    @Override // tb.r2w
    public Iterator<p2w> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        return ((CopyOnWriteArraySet) this.f).iterator();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VariationSetImpl{name='" + this.f27769a + '}';
    }
}
