package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ky8<TResult> extends odt<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f23001a;
    public final Object b = new Object();
    public final rqk c;

    static {
        t2o.a(677380273);
    }

    public ky8(Executor executor, rqk rqkVar) {
        this.f23001a = executor;
        this.c = rqkVar;
    }

    public static rqk b(ky8 ky8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqk) ipChange.ipc$dispatch("c0958c0d", new Object[]{ky8Var});
        }
        return ky8Var.c;
    }

    public static Object c(ky8 ky8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5bf1898b", new Object[]{ky8Var});
        }
        return ky8Var.b;
    }

    public static /* synthetic */ Object ipc$super(ky8 ky8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/tasks/FailureTaskExcutor");
    }

    @Override // tb.odt
    public final void a(bdt<TResult> bdtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676784a8", new Object[]{this, bdtVar});
        } else if (!bdtVar.g() && bdtVar.f()) {
            synchronized (this.b) {
                try {
                    if (this.c != null) {
                        this.f23001a.execute(new iy8(this, bdtVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
