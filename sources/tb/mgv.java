package tb;

import android.app.Activity;
import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.login4android.api.Login;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class mgv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UnderageModeHelper";
    public static final mgv INSTANCE = new mgv();

    /* renamed from: a  reason: collision with root package name */
    public static final a f24032a = new a();

    static {
        t2o.a(468713554);
    }

    public final boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dee1caf7", new Object[]{this, context})).booleanValue();
        }
        ckf.g(context, "context");
        String e = ono.e(context, e());
        ir9.b("UnderageModeHelper", "isTimeLockClosed closeTime:" + e);
        if (e == null || wsq.a0(e) || ssq.o(e) == null) {
            return false;
        }
        boolean b = uut.b(Long.parseLong(e), System.currentTimeMillis());
        ir9.b("UnderageModeHelper", "isTimeLockClosed isSameDay:" + b);
        return b;
    }

    public final void b(FluidContext fluidContext, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af13c76", new Object[]{this, fluidContext, activity});
            return;
        }
        ckf.g(fluidContext, "fluidContext");
        ckf.g(activity, "activity");
        d();
        a aVar = f24032a;
        aVar.a(fluidContext, activity);
        lqw.d().b(aVar);
        ir9.b("UnderageModeHelper", "registTimeLockResult");
    }

    public final void c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e26702a", new Object[]{this, context, new Boolean(z)});
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        ir9.b("UnderageModeHelper", "setTimeLockState currentTime:" + valueOf + " ; isClosed=" + z + ", context=" + context);
        if (z) {
            ono.j(context, e(), valueOf.toString());
        } else {
            ono.j(context, e(), "");
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39b578b", new Object[]{this});
            return;
        }
        ir9.b("UnderageModeHelper", "unregistTimeLockResult");
        lqw.d().h(f24032a);
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72e982f9", new Object[]{this});
        }
        return "UnderageTimeLock" + dbi.a(Login.getUserId());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<Activity> f24033a;
        public WeakReference<FluidContext> b;

        public final void a(FluidContext fluidContext, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("997e49f1", new Object[]{this, fluidContext, activity});
                return;
            }
            ckf.g(fluidContext, "fluidContext");
            ckf.g(activity, "activity");
            this.b = new WeakReference<>(fluidContext);
            this.f24033a = new WeakReference<>(activity);
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            ckf.g(iqwVar, "context");
            ckf.g(objArr, IconCompat.EXTRA_OBJ);
            if (i == 3005) {
                Object obj = objArr[0];
                if (obj instanceof String) {
                    if (obj != null) {
                        String str = (String) obj;
                        ir9.b("UnderageModeHelper", "registTimeLockResult paramsString:".concat(str));
                        JSONObject parseObject = JSON.parseObject(str);
                        if (ckf.b(parseObject != null ? parseObject.getString("event") : null, "ITAO_YOUNG_CLOSE_LOCK_SUCCESS")) {
                            JSONObject jSONObject = parseObject.getJSONObject("param");
                            if (ckf.b(jSONObject != null ? jSONObject.getString("bizCode") : null, "tab2")) {
                                mgv.INSTANCE.c(null, true);
                                WeakReference<Activity> weakReference = this.f24033a;
                                if ((weakReference != null ? weakReference.get() : null) != null) {
                                    kgv kgvVar = kgv.INSTANCE;
                                    WeakReference<FluidContext> weakReference2 = this.b;
                                    ckf.d(weakReference2);
                                    FluidContext fluidContext = weakReference2.get();
                                    ckf.d(fluidContext);
                                    WeakReference<Activity> weakReference3 = this.f24033a;
                                    ckf.d(weakReference3);
                                    Activity activity = weakReference3.get();
                                    ckf.d(activity);
                                    kgvVar.c(fluidContext, activity);
                                }
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
            }
            return null;
        }
    }
}
