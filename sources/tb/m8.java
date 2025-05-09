package tb;

import android.os.SystemClock;
import com.alibaba.ability.MegaUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.k8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class m8<T extends k8> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CALLBACK_FAILURE = "failure";
    public static final String CALLBACK_SUCCESS = "success";

    /* renamed from: a  reason: collision with root package name */
    public sy8 f23833a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements u8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f23834a;
        public final /* synthetic */ k8 b;
        public final /* synthetic */ n8 c;

        public a(m8 m8Var, u8 u8Var, k8 k8Var, n8 n8Var) {
            this.f23834a = u8Var;
            this.b = k8Var;
            this.c = n8Var;
        }

        @Override // tb.u8
        public void callback(String str, c8 c8Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc026703", new Object[]{this, str, c8Var});
                return;
            }
            u8 u8Var = this.f23834a;
            if (u8Var != null) {
                u8Var.callback(str, c8Var);
            }
            if (c8Var instanceof b8) {
                z71.d(this.b, this.c, (b8) c8Var);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n8 f23835a;
        public final /* synthetic */ k8 b;
        public final /* synthetic */ u8 c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ c8 f23836a;

            public a(c8 c8Var) {
                this.f23836a = c8Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    b.this.c.callback("_onResult", this.f23836a);
                }
            }
        }

        public b(n8 n8Var, k8 k8Var, u8 u8Var) {
            this.f23835a = n8Var;
            this.b = k8Var;
            this.c = u8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            c8 f = m8.this.f(this.f23835a, this.b, this.c);
            if (f != null && !(f instanceof d8)) {
                MegaUtils.z(new a(f), 0L);
            }
        }
    }

    static {
        t2o.a(336592917);
    }

    public b8 a(int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8) ipChange.ipc$dispatch("1a6d1799", new Object[]{this, new Integer(i), str, new Boolean(z)});
        }
        return new b8(new a8(i, str), z);
    }

    public c8 b(JSONObject jSONObject, T t, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("fa5397fe", new Object[]{this, jSONObject, t, u8Var});
        }
        if (jSONObject != null) {
            return c(new n8(jSONObject), t, u8Var);
        }
        b8 b8Var = new b8(new a8(10002, "NULL"), true);
        z71.d(t, null, b8Var);
        return b8Var;
    }

    public c8 c(n8 n8Var, T t, u8 u8Var) {
        JSONObject jSONObject;
        c8 c8Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("5976b6e6", new Object[]{this, n8Var, t, u8Var});
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        a aVar = new a(this, u8Var, t, n8Var);
        if (n8Var != null) {
            jSONObject = n8Var.d();
        } else {
            jSONObject = null;
        }
        if (!vwf.b(jSONObject, "isMainThread", true) || !e()) {
            MegaUtils.C(new b(n8Var, t, aVar));
            c8Var = new d8();
        } else {
            c8Var = f(n8Var, t, aVar);
            if (c8Var instanceof b8) {
                z71.d(t, n8Var, (b8) c8Var);
            }
        }
        z71.a(t, n8Var, SystemClock.elapsedRealtime() - elapsedRealtime);
        return c8Var;
    }

    public sy8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sy8) ipChange.ipc$dispatch("11114cad", new Object[]{this});
        }
        return this.f23833a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public abstract c8 f(n8 n8Var, T t, u8 u8Var);

    public void g(sy8 sy8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23fc575f", new Object[]{this, sy8Var});
        } else {
            this.f23833a = sy8Var;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8750119", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
