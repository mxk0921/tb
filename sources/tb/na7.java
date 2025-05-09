package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import tb.swn;
import tb.w3o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class na7<OUT, NEXT_OUT extends swn, CONTEXT extends w3o> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<kh3<OUT, NEXT_OUT, CONTEXT>> f24605a;
    public final int b;

    public na7() {
        this(15);
    }

    public kh3<OUT, NEXT_OUT, CONTEXT> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kh3) ipChange.ipc$dispatch("26ec4b34", new Object[]{this});
        }
        if (eko.e()) {
            return (kh3) ((ConcurrentLinkedQueue) this.f24605a).poll();
        }
        return null;
    }

    public boolean b(kh3<OUT, NEXT_OUT, CONTEXT> kh3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40ab2d3f", new Object[]{this, kh3Var})).booleanValue();
        }
        if (kh3Var != null) {
            kh3Var.g();
        }
        if (!eko.e() || ((ConcurrentLinkedQueue) this.f24605a).size() >= this.b || !((ConcurrentLinkedQueue) this.f24605a).offer(kh3Var)) {
            return false;
        }
        return true;
    }

    public na7(int i) {
        this.b = i;
        this.f24605a = new ConcurrentLinkedQueue();
    }
}
