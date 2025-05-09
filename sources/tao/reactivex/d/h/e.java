package tao.reactivex.d.h;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;
import tb.sng;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Throwable f15447a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends Throwable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(628097490);
        }

        public a() {
            super("No further exceptions");
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in tao/reactivex/d/h/e$a");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
            }
            return this;
        }
    }

    static {
        t2o.a(628097489);
    }

    public static RuntimeException a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeException) ipChange.ipc$dispatch("6e660ded", new Object[]{th});
        }
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static <T> Throwable b(AtomicReference<Throwable> atomicReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("42370c4a", new Object[]{atomicReference});
        }
        Throwable th = atomicReference.get();
        Throwable th2 = f15447a;
        if (th != th2) {
            return atomicReference.getAndSet(th2);
        }
        return th;
    }

    public static <T> boolean c(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38462934", new Object[]{atomicReference, th})).booleanValue();
        }
        do {
            th2 = atomicReference.get();
            if (th2 == f15447a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new tao.reactivex.b.a(th2, th);
            }
        } while (!sng.a(atomicReference, th2, th3));
        return true;
    }
}
