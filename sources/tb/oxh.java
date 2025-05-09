package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oxh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vsa[] f25723a;
    public final AtomicInteger[] b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final oxh f25724a = new oxh();

        static {
            t2o.a(982516216);
        }

        public static /* synthetic */ oxh a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oxh) ipChange.ipc$dispatch("5e20d16f", new Object[0]);
            }
            return f25724a;
        }
    }

    static {
        t2o.a(982516215);
    }

    public oxh() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        availableProcessors = availableProcessors > 4 ? 4 : availableProcessors;
        availableProcessors = Build.VERSION.SDK_INT <= 23 ? (availableProcessors + 1) / 2 : availableProcessors;
        availableProcessors = availableProcessors < 1 ? 1 : availableProcessors;
        this.f25723a = new vsa[availableProcessors];
        this.b = new AtomicInteger[availableProcessors];
        for (int i = 0; i < availableProcessors; i++) {
            this.b[i] = new AtomicInteger();
        }
    }

    public static oxh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oxh) ipChange.ipc$dispatch("426db5b4", new Object[0]);
        }
        return a.a();
    }

    public vsa a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vsa) ipChange.ipc$dispatch("22499fca", new Object[]{this});
        }
        this.b[0].incrementAndGet();
        return c(0);
    }

    public vsa b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vsa) ipChange.ipc$dispatch("e839e1df", new Object[]{this});
        }
        int i2 = this.b[0].get();
        int length = this.b.length;
        for (int i3 = 1; i3 < length; i3++) {
            int i4 = this.b[i3].get();
            if (i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        this.b[i].incrementAndGet();
        return c(i);
    }

    public vsa c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vsa) ipChange.ipc$dispatch("c30c8a8c", new Object[]{this, new Integer(i)});
        }
        AtomicInteger[] atomicIntegerArr = this.b;
        if (i >= atomicIntegerArr.length) {
            i %= atomicIntegerArr.length;
        }
        synchronized (atomicIntegerArr[i]) {
            try {
                vsa vsaVar = this.f25723a[i];
                if (vsaVar != null) {
                    return vsaVar;
                }
                vsa vsaVar2 = new vsa("Weex_" + i);
                vsaVar2.i(i);
                this.f25723a[i] = vsaVar2;
                return vsaVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fe5044", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.f25723a.length; i++) {
            c(i);
        }
    }

    public void f(vsa vsaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c5723b0", new Object[]{this, vsaVar});
            return;
        }
        int threadId = vsaVar.getThreadId();
        if (threadId >= 0) {
            AtomicInteger[] atomicIntegerArr = this.b;
            if (threadId < atomicIntegerArr.length) {
                atomicIntegerArr[threadId].decrementAndGet();
            }
        }
    }
}
