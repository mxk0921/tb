package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class jyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final HashMap<Activity, jyf> e = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, ktk> f22286a = new HashMap<>();
    public ktk b;
    public final mmi c;
    public final mmi d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792325);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc780813", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            jyf jyfVar = (jyf) jyf.c().remove(activity);
            if (jyfVar != null) {
                jyf.a(jyfVar);
            }
        }

        public final void b(Activity activity, String str, ktk ktkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a13f4741", new Object[]{this, activity, str, ktkVar});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(str, "itemId");
            ckf.g(ktkVar, DataReceiveMonitor.CB_LISTENER);
            jyf jyfVar = (jyf) jyf.c().get(activity);
            if (jyfVar == null) {
                jyfVar = new jyf(activity);
                jyf.c().put(activity, jyfVar);
            }
            jyf.d(jyfVar).put(str, ktkVar);
        }

        public final void c(Activity activity, ktk ktkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fbcc6bd", new Object[]{this, activity, ktkVar});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(ktkVar, DataReceiveMonitor.CB_LISTENER);
            jyf jyfVar = (jyf) jyf.c().get(activity);
            if (jyfVar == null) {
                jyfVar = new jyf(activity);
                jyf.c().put(activity, jyfVar);
            }
            jyf.f(jyfVar, ktkVar);
        }

        public final void d(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89368686", new Object[]{this, activity});
                return;
            }
            ckf.g(activity, "activity");
            jyf jyfVar = (jyf) jyf.c().get(activity);
            if (jyfVar != null) {
                jyf.e(jyfVar);
            }
        }

        public final void e(Activity activity, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23c58c5f", new Object[]{this, activity, str});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(str, "itemId");
            jyf jyfVar = (jyf) jyf.c().get(activity);
            if (jyfVar != null) {
                jyf.d(jyfVar).remove(str);
            }
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements fmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.fmi
        public void b(Object obj) {
            JSONObject jSONObject;
            String string;
            JSONObject jSONObject2;
            ktk ktkVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
            } else if ((obj instanceof JSONObject) && (string = (jSONObject = (JSONObject) obj).getString("itemId")) != null && (jSONObject2 = jSONObject.getJSONObject("extDetailParams")) != null && (ktkVar = (ktk) jyf.d(jyf.this).get(string)) != null) {
                ktkVar.t(jSONObject2);
            }
        }
    }

    static {
        t2o.a(815792324);
    }

    public jyf(Activity activity) {
        ckf.g(activity, "activity");
        this.c = new mmi(activity, "coupon_poststate_jyb_pocketMoney", new b());
        this.d = new mmi(activity, "WIN", new fmi() { // from class: tb.paz
            @Override // tb.fmi
            public final void b(Object obj) {
                jyf.i(jyf.this, obj);
            }
        });
    }

    public static final /* synthetic */ void a(jyf jyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c76311", new Object[]{jyfVar});
        } else {
            jyfVar.g();
        }
    }

    public static final /* synthetic */ HashMap c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1deb69df", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ HashMap d(jyf jyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("4c0fc8b4", new Object[]{jyfVar});
        }
        return jyfVar.f22286a;
    }

    public static final /* synthetic */ void e(jyf jyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab09583e", new Object[]{jyfVar});
        } else {
            jyfVar.h();
        }
    }

    public static final /* synthetic */ void f(jyf jyfVar, ktk ktkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de83d7ce", new Object[]{jyfVar, ktkVar});
        } else {
            jyfVar.b = ktkVar;
        }
    }

    public static final void i(jyf jyfVar, Object obj) {
        ktk ktkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e8e92", new Object[]{jyfVar, obj});
            return;
        }
        ckf.g(jyfVar, "this$0");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            String string = jSONObject.getString("info");
            String string2 = jSONObject.getString("code");
            if (!TextUtils.isEmpty(string2) && (ktkVar = jyfVar.b) != null) {
                ckf.d(string2);
                ktkVar.U(string, string2);
            }
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.a();
        this.d.a();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.b = null;
        }
    }
}
