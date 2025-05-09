package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class aa4<TResult> extends odt<TResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Executor f15622a;
    public final Object b = new Object();
    public final ypk<TResult> c;

    static {
        t2o.a(677380270);
    }

    public aa4(Executor executor, ypk<TResult> ypkVar) {
        this.f15622a = executor;
        this.c = ypkVar;
    }

    public static Object b(aa4 aa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e3925fc0", new Object[]{aa4Var});
        }
        return aa4Var.b;
    }

    public static ypk c(aa4 aa4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ypk) ipChange.ipc$dispatch("475685a9", new Object[]{aa4Var});
        }
        return aa4Var.c;
    }

    public static /* synthetic */ Object ipc$super(aa4 aa4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/core/tasks/CompleteTaskExcutor");
    }

    @Override // tb.odt
    public final void a(bdt<TResult> bdtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676784a8", new Object[]{this, bdtVar});
        } else if (bdtVar.f()) {
            synchronized (this.b) {
                try {
                    if (this.c != null) {
                        this.f15622a.execute(new z94(this, bdtVar));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
