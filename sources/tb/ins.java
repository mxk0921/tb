package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.AbilityCenter;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ins {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TTDetailContainer";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f21469a;
    public final Context b;
    public bq6 c;
    public viq d;
    public xig e;
    public AbilityCenter f;
    public oc4 g;
    public eo7 h;
    public final boolean i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ze7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/TTDetailContainer$1");
        }

        @Override // tb.ze7
        public AbilityCenter b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AbilityCenter) ipChange.ipc$dispatch("8fc7a3ae", new Object[]{this});
            }
            return ins.c(ins.this);
        }

        @Override // tb.ze7
        public Context c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("cdf24ab5", new Object[]{this});
            }
            return ins.this.b;
        }

        @Override // tb.ze7
        public oc4 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oc4) ipChange.ipc$dispatch("54671349", new Object[]{this});
            }
            return ins.d(ins.this);
        }

        @Override // tb.ze7
        public bq6 e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bq6) ipChange.ipc$dispatch("4f0adde", new Object[]{this});
            }
            return ins.a(ins.this);
        }

        @Override // tb.ze7
        public eo7 g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eo7) ipChange.ipc$dispatch("2e883fbf", new Object[]{this});
            }
            return ins.f(ins.this);
        }

        @Override // tb.ze7
        public xig h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xig) ipChange.ipc$dispatch("41f04b1e", new Object[]{this});
            }
            return ins.b(ins.this);
        }

        @Override // tb.ze7
        public viq i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (viq) ipChange.ipc$dispatch("a8d50179", new Object[]{this});
            }
            return ins.e(ins.this);
        }
    }

    static {
        t2o.a(912261147);
    }

    public ins(Context context) {
        this(context, null, null);
    }

    public static /* synthetic */ bq6 a(ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bq6) ipChange.ipc$dispatch("e469363e", new Object[]{insVar});
        }
        return insVar.c;
    }

    public static /* synthetic */ xig b(ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xig) ipChange.ipc$dispatch("fb0ecbdd", new Object[]{insVar});
        }
        return insVar.e;
    }

    public static /* synthetic */ AbilityCenter c(ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityCenter) ipChange.ipc$dispatch("b4b853d3", new Object[]{insVar});
        }
        return insVar.f;
    }

    public static /* synthetic */ oc4 d(ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oc4) ipChange.ipc$dispatch("51000148", new Object[]{insVar});
        }
        return insVar.g;
    }

    public static /* synthetic */ viq e(ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (viq) ipChange.ipc$dispatch("8f020323", new Object[]{insVar});
        }
        return insVar.d;
    }

    public static /* synthetic */ eo7 f(ins insVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eo7) ipChange.ipc$dispatch("fff12059", new Object[]{insVar});
        }
        return insVar.h;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.i) {
            q84.c(this.b);
            this.f21469a.a();
        }
    }

    public ze7 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("ee649aeb", new Object[]{this});
        }
        return this.f21469a;
    }

    public final void i(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be7aec99", new Object[]{this, context, str, new Boolean(z)});
        } else if (z) {
            this.d = this.f21469a.i();
            this.f = this.f21469a.b();
            this.c = this.f21469a.e();
            this.g = this.f21469a.d();
            this.e = this.f21469a.h();
            this.h = this.f21469a.g();
        } else {
            this.d = new viq(context, this.f21469a, str);
            this.f = new AbilityCenter(context, this.f21469a);
            this.c = new bq6(context, this.f21469a);
            this.g = new oc4(context, this.f21469a);
            this.e = new xig(context, this.f21469a);
            this.h = new eo7.q(context, this.f21469a, eo7.DINAMIC_BIZ_NAME).j(15).k("detail").i();
        }
    }

    public ins(Context context, String str, ze7 ze7Var) {
        this.f21469a = new a();
        if (b5m.S()) {
            boolean z = ze7Var != null;
            this.i = z;
            if (z) {
                this.f21469a = ze7Var;
            }
            this.b = context;
            q84.a(context);
            i(context, str, z);
            return;
        }
        throw new IllegalStateException("must initialize PlatformEvn first with new PlatformEvn.Initializer().withXXX().initialize()");
    }
}
