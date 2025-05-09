package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ib2 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BINDINGXSCROLLANIMINIT = "-7119874910818693679";
    public final cjb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f21203a;

        public a(JSONObject jSONObject) {
            this.f21203a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ib2.i(ib2.this).a(this.f21203a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final cjb f21204a;

        static {
            t2o.a(713031755);
            t2o.a(336592930);
        }

        public b(cjb cjbVar) {
            this.f21204a = cjbVar;
        }

        /* renamed from: a */
        public ib2 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ib2) ipChange.ipc$dispatch("86a20d3d", new Object[]{this, obj});
            }
            return new ib2(this.f21204a);
        }
    }

    static {
        t2o.a(713031753);
    }

    public ib2(cjb cjbVar) {
        this.b = cjbVar;
    }

    public static /* synthetic */ cjb i(ib2 ib2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjb) ipChange.ipc$dispatch("3a426a67", new Object[]{ib2Var});
        }
        return ib2Var.b;
    }

    public static /* synthetic */ Object ipc$super(ib2 ib2Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/BindingXScrollAnimInitAbility");
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        if (n8Var != null) {
            JSONObject h = n8Var.h();
            if (!(this.b == null || tk6Var == null || tk6Var.o() == null)) {
                tk6Var.o().post(new a(h));
            }
        }
        return new f8();
    }
}
