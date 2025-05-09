package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class duo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<buo> f18076a;

    public duo() {
        this(50);
    }

    public buo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (buo) ipChange.ipc$dispatch("7a9c454e", new Object[]{this});
        }
        if (eko.e()) {
            return (buo) ((ConcurrentLinkedQueue) this.f18076a).poll();
        }
        return null;
    }

    public boolean b(buo buoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aef4a925", new Object[]{this, buoVar})).booleanValue();
        }
        if (buoVar != null) {
            buoVar.q();
        }
        if (!eko.e() || ((ConcurrentLinkedQueue) this.f18076a).size() >= 50 || !((ConcurrentLinkedQueue) this.f18076a).offer(buoVar)) {
            return false;
        }
        return true;
    }

    public duo(int i) {
        this.f18076a = new ConcurrentLinkedQueue();
    }
}
