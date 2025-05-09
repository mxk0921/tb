package tb;

import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.api.LogContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ism extends m8<k8> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long AK_ABILITY_DELIVERY_PRELOAD = -438139591756313693L;
    public static final a Companion = new a(null);
    public u8 b;
    public final jfr<?> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(440401981);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements w8<jfr<?>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final jfr<?> f21552a;

        static {
            t2o.a(440401982);
            t2o.a(336592930);
        }

        public b(jfr<?> jfrVar) {
            ckf.g(jfrVar, "context");
            this.f21552a = jfrVar;
        }

        /* renamed from: a */
        public m8<?> build(jfr<?> jfrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (m8) ipChange.ipc$dispatch("a605d79a", new Object[]{this, jfrVar});
            }
            return new ism(this.f21552a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements lr {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ u8 b;

        public c(u8 u8Var) {
            this.b = u8Var;
        }

        @Override // tb.lr
        public void a(kr krVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff904256", new Object[]{this, krVar});
                return;
            }
            ckf.g(krVar, "abilityResult");
            if (krVar.a() == 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "result", (String) Boolean.TRUE);
                u8 u8Var = this.b;
                if (u8Var != null) {
                    u8Var.callback("onData", new f8(jSONObject));
                    return;
                }
                return;
            }
            ism.i(ism.this, krVar.a(), krVar.b());
        }
    }

    static {
        t2o.a(440401980);
    }

    public ism(jfr<?> jfrVar) {
        ckf.g(jfrVar, "tbiContext");
        this.c = jfrVar;
    }

    public static final /* synthetic */ b8 i(ism ismVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("99c58ac2", new Object[]{ismVar, new Integer(i), str});
        }
        return ismVar.j(i, str);
    }

    public static /* synthetic */ Object ipc$super(ism ismVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/PreloadMiniAppAKAbility");
    }

    @Override // tb.m8
    public c8<?> f(n8 n8Var, k8 k8Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        this.b = u8Var;
        if (!i55.a()) {
            wfr.INSTANCE.b("PreloadMiniAppAKAbility", "preload mini app error, orange switch is closed");
            return j(10002, "orange switch is closed");
        }
        if ((n8Var != null ? n8Var.h() : null) == null) {
            wfr.INSTANCE.b(jsm.TAG, "akBaseAbilityData or params is null");
            return j(10002, "invalid params");
        }
        wfr.INSTANCE.d("PreloadMiniAppAKAbility", "run preload ability");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) LogContext.STORAGE_APPID, n8Var.h().getString(LogContext.STORAGE_APPID));
        this.c.a().a("preloadMiniApp", jSONObject, new c(u8Var));
        return new f8();
    }

    public final b8 j(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("2ff9e9ea", new Object[]{this, new Integer(i), str});
        }
        b8 b8Var = new b8(new a8(i, str));
        u8 u8Var = this.b;
        if (u8Var != null) {
            u8Var.callback("onError", b8Var);
        }
        return b8Var;
    }
}
