package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.types.PatchType;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gxm implements Comparable<gxm>, zct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f20295a;
    private PatchType b;
    private boolean c;
    private String d;
    private wtl e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f20296a = new AtomicInteger();
        public final PatchType b;

        static {
            t2o.a(950009868);
        }

        public a(PatchType patchType) {
            this.b = patchType;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, this.b.getKey() + "-thread-" + this.f20296a.incrementAndGet());
        }
    }

    static {
        t2o.a(950009867);
        t2o.a(950009869);
    }

    public gxm(PatchType patchType, wtl wtlVar, String str, boolean z) {
        this.e = wtlVar;
        this.b = patchType;
        this.d = str;
        this.c = z;
        this.f20295a = new a(patchType);
    }

    @Override // tb.zct
    public void asyncRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4c81376", new Object[]{this});
        } else {
            this.f20295a.newThread(this.e).start();
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gxm) && this.b == ((gxm) obj).b) {
            return true;
        }
        return false;
    }

    public String from() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad658f", new Object[]{this});
        }
        return this.d;
    }

    public PatchType getPatchType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PatchType) ipChange.ipc$dispatch("9b40726b", new Object[]{this});
        }
        return this.b;
    }

    public wtl getRunnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wtl) ipChange.ipc$dispatch("785d475d", new Object[]{this});
        }
        return this.e;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        PatchType patchType = this.b;
        if (patchType != null) {
            return patchType.hashCode();
        }
        return 0;
    }

    public boolean isBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.zct
    public void syncRun() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa786a77", new Object[]{this});
            return;
        }
        Thread newThread = this.f20295a.newThread(this.e);
        newThread.start();
        try {
            newThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PriorityTask{patchType=" + this.b + '}';
    }

    public int compareTo(gxm gxmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1330f4ad", new Object[]{this, gxmVar})).intValue() : this.b.getPriority() - gxmVar.b.getPriority();
    }
}
