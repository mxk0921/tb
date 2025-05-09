package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class nwq<TResult> extends odt<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f25002a;
    public final Object b = new Object();
    public final gvk<? super TResult> c;

    static {
        t2o.a(677380276);
    }

    public nwq(Executor executor, gvk<? super TResult> gvkVar) {
        this.f25002a = executor;
        this.c = gvkVar;
    }

    public static Object b(nwq nwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("69060cc7", new Object[]{nwqVar});
        }
        return nwqVar.b;
    }

    public static gvk c(nwq nwqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gvk) ipChange.ipc$dispatch("c9467591", new Object[]{nwqVar});
        }
        return nwqVar.c;
    }

    public static /* synthetic */ Object ipc$super(nwq nwqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/tasks/SuccessTaskExecutor");
    }

    @Override // tb.odt
    public final void a(bdt<TResult> bdtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676784a8", new Object[]{this, bdtVar});
        } else if (bdtVar.g()) {
            synchronized (this.b) {
                try {
                    if (this.c != null) {
                        this.f25002a.execute(new mwq(this, bdtVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
