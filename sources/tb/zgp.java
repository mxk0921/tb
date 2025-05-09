package tb;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Vibrator;
import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.shake.ShakeControl;
import com.taobao.android.shake.api.c;
import com.taobao.tao.Globals;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zgp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile ShakeControl f32758a;
    public final Activity b;
    public final kmb c;
    public final wgp e = new a();
    public final c.b d = new b(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements wgp {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.wgp
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93da1d6e", new Object[]{this});
                return;
            }
            String f = zgp.this.f();
            if (!TextUtils.isEmpty(f)) {
                juv.d(zgp.a(zgp.this), "Page_ShoppingCart_Shake", "count=" + zgp.this.d(), "interval=" + zgp.this.e(), "url=" + zgp.this.f());
                xq0.c().a(zgp.b(zgp.this)).c(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<zgp> f32760a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ zgp f32761a;

            public a(zgp zgpVar) {
                this.f32761a = zgpVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c.c().b();
                zgp.c(this.f32761a).a();
            }
        }

        static {
            t2o.a(478150860);
            t2o.a(763363336);
        }

        public b(zgp zgpVar) {
            this.f32760a = new WeakReference<>(zgpVar);
        }

        @Override // com.taobao.android.shake.api.c.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93da1d6e", new Object[]{this});
                return;
            }
            zgp zgpVar = this.f32760a.get();
            if (zgpVar != null && zgp.b(zgpVar) != null) {
                Activity b = zgp.b(zgpVar);
                if (b.getWindow() != null && b.getWindow().getDecorView() != null && zgp.a(zgpVar).R().isResumed() && zgpVar.i()) {
                    Vibrator vibrator = (Vibrator) Globals.getApplication().getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(500L);
                    }
                    b.getWindow().getDecorView().post(new a(zgpVar));
                }
            }
        }
    }

    static {
        t2o.a(478150858);
    }

    public zgp(kmb kmbVar) {
        this.c = kmbVar;
        this.b = kmbVar.getContext();
    }

    public static /* synthetic */ kmb a(zgp zgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("7ebb622a", new Object[]{zgpVar});
        }
        return zgpVar.c;
    }

    public static /* synthetic */ Activity b(zgp zgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("38e58da8", new Object[]{zgpVar});
        }
        return zgpVar.b;
    }

    public static /* synthetic */ wgp c(zgp zgpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wgp) ipChange.ipc$dispatch("ded6930e", new Object[]{zgpVar});
        }
        return zgpVar.e;
    }

    @Deprecated
    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b283daa", new Object[0])).booleanValue();
        }
        return v9v.i("cart_switch", "cart_shake_enable", false);
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.f32758a == null) {
            return 0;
        }
        return this.f32758a.getCount();
    }

    public float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e1132", new Object[]{this})).floatValue();
        }
        if (this.f32758a == null) {
            return 0.0f;
        }
        return this.f32758a.getInterval();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        if (this.f32758a == null) {
            return null;
        }
        return this.f32758a.getUrl();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b05419f1", new Object[]{this})).booleanValue();
        }
        if (!j() || this.f32758a == null || !this.f32758a.isEnable() || TextUtils.isEmpty(this.f32758a.getUrl()) || !g()) {
            return false;
        }
        return true;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a76113f", new Object[]{this})).booleanValue();
        }
        return h();
    }

    public void k(Activity activity) {
        int i;
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7e774fc", new Object[]{this, activity});
        } else if (activity != null) {
            c c = c.c();
            c.a aVar = new c.a();
            if (this.f32758a != null) {
                i2 = Math.max(this.f32758a.getCount(), 2);
                i = (int) (this.f32758a.getInterval() * 1000.0f);
            } else {
                i = 1000;
            }
            aVar.d = i;
            aVar.f9373a = i2;
            c.a(activity, this.d, aVar);
            c.b();
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606a6fb1", new Object[]{this});
        } else {
            c.c().d();
        }
    }

    public void m(zxb zxbVar) {
        CartGlobal w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94cbc0b7", new Object[]{this, zxbVar});
        } else if (zxbVar != null && j() && (w = zxbVar.w()) != null) {
            CartGlobal.ControlParas controlParas = w.getControlParas();
            if (controlParas == null || controlParas.getShake() == null) {
                this.f32758a = null;
            } else {
                this.f32758a = (ShakeControl) JSON.toJavaObject(controlParas.getShake(), ShakeControl.class);
            }
        }
    }

    public final boolean g() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("125faed5", new Object[]{this})).booleanValue();
        }
        if (this.b.getApplication() == null) {
            context = this.b;
        } else {
            context = this.b.getApplication();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("json_sharedpreferences", 0);
        if (sharedPreferences == null) {
            return false;
        }
        return "true".equals(sharedPreferences.getString(pgj.CART_SWITCH_NAME, "true"));
    }
}
