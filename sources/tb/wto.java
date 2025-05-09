package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wto extends g11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909445);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ApiContext b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ uq d;

        public b(ApiContext apiContext, Object[] objArr, uq uqVar) {
            this.b = apiContext;
            this.c = objArr;
            this.d = uqVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                wto.this.b.a(this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(839909444);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wto(f11 f11Var) {
        super(f11Var);
        ckf.g(f11Var, "apiMeta");
    }

    public static /* synthetic */ Object ipc$super(wto wtoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/ability/invoker/ScheduleMiddleware");
    }

    @Override // tb.e11
    public Object a(ApiContext apiContext, Object[] objArr, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3d69ec", new Object[]{this, apiContext, objArr, uqVar});
        }
        ckf.g(apiContext, "context");
        ckf.g(objArr, "args");
        ckf.g(uqVar, "callback");
        ThreadType threadType = (ThreadType) this.f18200a.c.getAnnotation(ThreadType.class);
        if (apiContext.g()) {
            return this.b.a(apiContext, objArr, uqVar);
        }
        ExecutorType value = threadType == null ? null : threadType.value();
        if (value == null) {
            value = ExecutorType.SYNC;
        }
        TMSLogger.a("ScheduleMiddleware", "method : [" + this.f18200a.c.getName() + "], ExecutorType is : [" + value.name() + ']');
        if (value == ExecutorType.SYNC) {
            return this.b.a(apiContext, objArr, uqVar);
        }
        ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(value).execute(new b(apiContext, objArr, uqVar));
        return null;
    }
}
