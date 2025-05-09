package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.utils.MegaTrace;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yti implements ndb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final pdb f32344a;
    public final ndb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(144703577);
        }

        public a() {
        }

        @JvmStatic
        public final ndb a(List<? extends pdb> list, ndb ndbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ndb) ipChange.ipc$dispatch("d7af9deb", new Object[]{this, list, ndbVar});
            }
            ckf.g(list, "middlewares");
            ckf.g(ndbVar, "final");
            try {
                MegaTrace.INSTANCE.b("MiddlewareChain#makeChain");
                for (pdb pdbVar : i04.q0(list)) {
                    ndbVar = new yti(pdbVar, ndbVar);
                }
                return ndbVar;
            } finally {
                MegaTrace.INSTANCE.e();
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(144703576);
        t2o.a(144703572);
    }

    public yti(pdb pdbVar, ndb ndbVar) {
        ckf.g(pdbVar, "middleware");
        ckf.g(ndbVar, "next");
        this.f32344a = pdbVar;
        this.b = ndbVar;
    }

    @Override // tb.ndb
    public ExecuteResult a(String str, String str2, kdb kdbVar, Map<String, ? extends Object> map, s2d s2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("5582c4f0", new Object[]{this, str, str2, kdbVar, map, s2dVar});
        }
        ckf.g(str, MUSMonitor.MODULE_DIM_ABILITY);
        ckf.g(str2, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(s2dVar, "callback");
        try {
            MegaTrace megaTrace = MegaTrace.INSTANCE;
            megaTrace.d("MiddlewareChain#invoke", str, str2, this.f32344a);
            ExecuteResult invoke = this.f32344a.invoke(str, str2, kdbVar, map, s2dVar, this.b);
            megaTrace.e();
            return invoke;
        } catch (Throwable th) {
            MegaTrace.INSTANCE.e();
            throw th;
        }
    }
}
