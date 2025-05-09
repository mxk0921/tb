package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ali.adapt.api.AtlasServiceFinder;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.aura.render.fragment.TBBuyHalfScreenFragment;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.eo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class o9r implements nud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TBBuyRenderDelegate";
    public static int h = 540000;
    public static o9r i;

    /* renamed from: a  reason: collision with root package name */
    public long f25234a;
    public Runnable c;
    public w7r e;
    public String f;
    public WeakReference<Activity> g;
    public final Handler b = new Handler();
    public final boolean d = y8r.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements mud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(o9r o9rVar) {
        }

        @Override // tb.mud
        public String I2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
            }
            return TBBuyPageMode.fullPageMode;
        }

        @Override // tb.mud
        public Map<String, String> l1() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8e8b1035", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ck.g().e("在前台停留时间过长，刷新下单页");
            o9r.this.Y2(true);
            o9r.this.j();
        }
    }

    static {
        t2o.a(708837535);
        t2o.a(708837528);
    }

    public static o9r c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o9r) ipChange.ipc$dispatch("3da3a118", new Object[0]);
        }
        if (i == null) {
            synchronized (o9r.class) {
                try {
                    if (i == null) {
                        i = new o9r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    @Override // tb.nud
    public void F(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92798b", new Object[]{this, fragmentActivity});
            return;
        }
        s7r.a(fragmentActivity);
        b();
        a();
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.q();
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
            this.g = null;
        }
        this.e = null;
    }

    @Override // tb.nud
    public void N1(FragmentActivity fragmentActivity, int i2, int i3, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40acbc98", new Object[]{this, fragmentActivity, new Integer(i2), new Integer(i3), intent});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.p(i2, i3, intent);
        }
    }

    @Override // tb.nud
    public void P0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869d49c8", new Object[]{this, activity});
        } else {
            x69.c(activity, R.id.purchase_actionbar_layout, R.id.btn_back);
        }
    }

    @Override // tb.nud
    public void V(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4569c7", new Object[]{this, fragmentActivity});
        }
    }

    @Override // tb.lud
    public void Y2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee313163", new Object[]{this, new Boolean(z)});
        } else if (this.g != null && this.e != null) {
            if (z) {
                b();
                this.e.u();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("delta", (Object) new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hierarchy", (Object) jSONObject);
            jSONObject2.put("data", (Object) new JSONObject());
            this.e.i(jSONObject2);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe88334b", new Object[]{this});
            return;
        }
        ck.g().e("清理计时器");
        this.b.removeCallbacks(this.c);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd82c179", new Object[]{this});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.j();
        }
    }

    @Override // tb.nud
    public void c1(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd1022f", new Object[]{this, fragmentActivity, viewGroup});
            return;
        }
        this.g = new WeakReference<>(fragmentActivity);
        Object f = hh.f(fragmentActivity);
        if (f == null) {
            q8r.a("EMPTY_CONTAINER_FORM_(TBBuyRenderDelegate)", "container is empty");
        }
        if (!(f instanceof mud)) {
            q8r.a("EMPTY_CONTAINER_FORM_(TBBuyRenderDelegate)", "container not ITBBuyPageContainer");
            f = new a(this);
            if (TextUtils.isEmpty(this.f)) {
                str = TBBuyPageMode.fullPageMode;
            } else {
                str = this.f;
            }
            this.f = str;
        } else {
            this.f = ((mud) f).I2();
        }
        if (th.c()) {
            h = Integer.valueOf(y8r.g("refreshInterval", h + "")).intValue();
        }
        this.e = new w7r(fragmentActivity, (mud) f, this, viewGroup);
        this.f25234a = SystemClock.elapsedRealtime();
        this.c = new b();
        l();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
        }
        return this.f;
    }

    public final void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6bb793", new Object[]{this, activity});
        } else {
            ct0.a(activity);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2ff545", new Object[]{this});
            return;
        }
        try {
            AtlasServiceFinder.getInstance().registerService(eo.c.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.aura.utils.UToastService");
        } catch (Exception e) {
            UnifyLog.e(TAG, "initToastService failed:" + e.toString());
        }
    }

    @Override // tb.nud
    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc97457", new Object[]{this});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.t();
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.i(jSONObject);
        }
    }

    @Override // tb.lud
    public String g1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1507e0c4", new Object[]{this});
        }
        return null;
    }

    @Override // tb.nud
    public String getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return "purchase";
    }

    @Override // tb.nud
    public AbilityParams getPopConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityParams) ipChange.ipc$dispatch("78489087", new Object[]{this});
        }
        AbilityParams abilityParams = new AbilityParams();
        AbilityParams.a aVar = new AbilityParams.a();
        aVar.fragmentClass = TBBuyHalfScreenFragment.class.getName();
        aVar.droidFragmentTag = "fragment_general_purchase_container";
        abilityParams.extConfig = aVar;
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.shouldBlockClose = "true";
        bVar.droidFullScreen = "true";
        bVar.droidShouldHandleBack = "false";
        bVar.animation = nbf.STDPOP_ANIMATION_BOTTOM;
        bVar.panEnable = "false";
        bVar.contentBackColor = "#00000000";
        bVar.maxHeight = 0.75f;
        abilityParams.popConfig = bVar;
        return abilityParams;
    }

    public void i(svd svdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1938390f", new Object[]{this, svdVar});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.w(svdVar);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee6a3bb", new Object[]{this});
            return;
        }
        this.f25234a = SystemClock.elapsedRealtime();
        m();
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("871612e5", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    @Override // tb.nud
    public void lazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (!(weakReference == null || weakReference.get() == null)) {
            e(this.g.get());
        }
        f();
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d925bf9a", new Object[]{this});
            return;
        }
        a();
        l();
    }

    @Override // tb.nud
    public void m2() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dfe424", new Object[]{this});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.h();
            if (TBBuyPageMode.halfPageMode.equals(this.f)) {
                str = aar.b;
            } else {
                str = aar.c;
            }
            aar.a(str);
        }
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        w7r w7rVar = this.e;
        if (w7rVar != null) {
            w7rVar.n(str, jSONObject);
        }
    }

    @Override // tb.nud
    public void t2(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd2c1dc", new Object[]{this, fragmentActivity});
        } else if (this.d) {
            h();
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5faf95", new Object[]{this});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f25234a < h) {
            this.f25234a = elapsedRealtime;
            return;
        }
        ck.g().e("在后台停留时间过长，刷新下单页");
        Y2(true);
        j();
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ebff933", new Object[]{this});
        } else if (y8r.f("enableAutoRefresh", true)) {
            rbb g = ck.g();
            g.e("开始设置计时，时间：" + h);
            this.b.postDelayed(this.c, (long) h);
        }
    }
}
