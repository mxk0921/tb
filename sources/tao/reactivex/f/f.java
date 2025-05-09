package tao.reactivex.f;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class f extends AtomicLong implements ThreadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15453a;
    public final int b;
    public final boolean c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends Thread {
        static {
            t2o.a(628097514);
        }

        public a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    static {
        t2o.a(628097513);
    }

    public f(String str) {
        this(str, 5, false);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/f/f");
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
        }
        String str = this.f15453a + '-' + incrementAndGet();
        if (this.c) {
            thread = new a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.b);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RxThreadFactory[" + this.f15453a + "]";
    }

    public f(String str, int i) {
        this(str, i, false);
    }

    public f(String str, int i, boolean z) {
        this.f15453a = str;
        this.b = i;
        this.c = z;
    }
}
