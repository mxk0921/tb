package tb;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j8r extends sy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nud f21833a;
    public final int b;
    public final int c;
    public final boolean d;
    public FragmentActivity e;
    public boolean f;
    public OnScreenChangedListener g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements OnScreenChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
            guk.a(this, activity, i, configuration);
        }

        @Override // com.taobao.android.autosize.OnScreenChangedListener
        public void onScreenChanged(int i, Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            } else {
                j8r.n(j8r.this).Y2(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends q9r {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(j8r j8rVar, Activity activity) {
            super(activity);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/render/impl/TBBuyFullScreenPageRender$2");
        }

        @Override // tb.q9r
        public ViewGroup j(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("1c098b1e", new Object[]{this, activity});
            }
            return (ViewGroup) activity.findViewById(R.id.purchase_skeleton);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f21835a;

        public c(j8r j8rVar, Activity activity) {
            this.f21835a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                hh.d(this.f21835a);
            }
        }
    }

    static {
        t2o.a(708837543);
    }

    public j8r(nud nudVar, int i, int i2) {
        this(nudVar, i, i2, false);
    }

    public static /* synthetic */ Object ipc$super(j8r j8rVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1412251172:
                super.k((FragmentActivity) objArr[0]);
                return null;
            case -817534521:
                super.j((FragmentActivity) objArr[0]);
                return null;
            case -395755316:
                super.f((FragmentActivity) objArr[0]);
                return null;
            case -275613301:
                super.i((FragmentActivity) objArr[0]);
                return null;
            case 1638888757:
                super.g((FragmentActivity) objArr[0], (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/render/impl/TBBuyFullScreenPageRender");
        }
    }

    public static /* synthetic */ nud n(j8r j8rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nud) ipChange.ipc$dispatch("273c3d9e", new Object[]{j8rVar});
        }
        return j8rVar.f21833a;
    }

    @Override // tb.sy
    public void a(FragmentActivity fragmentActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d8c5cd", new Object[]{this, fragmentActivity, jSONObject});
        } else {
            this.f21833a.g(jSONObject);
        }
    }

    @Override // tb.sy
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
        }
        return TBBuyPageMode.fullPageMode;
    }

    @Override // tb.sy
    public String c(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9488687b", new Object[]{this, fragmentActivity});
        }
        return "native";
    }

    @Override // tb.sy
    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            this.f21833a.q2(str, jSONObject);
        }
    }

    @Override // tb.sy
    public void e(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40acbc98", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
        } else {
            this.f21833a.N1(fragmentActivity, i, i2, intent);
        }
    }

    @Override // tb.sy
    public void f(FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86940cc", new Object[]{this, fragmentActivity});
            return;
        }
        super.f(fragmentActivity);
        if (!al.n("purchase", "onBack")) {
            if (!this.d && (fragmentActivity2 = this.e) != null && this.f) {
                fragmentActivity2.overridePendingTransition(R.anim.purchase_slide_in_from_right_anim, R.anim.purchase_slide_out_to_right_anim);
            }
            hh.d(fragmentActivity);
        }
    }

    @Override // tb.sy
    public void h(FragmentActivity fragmentActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c6ce2", new Object[]{this, fragmentActivity, view});
        } else if (view == null) {
            ck.g().f("contentView为空了", ck.b.b().l("TBBuyFullScreenPageRender").a());
            hh.d(fragmentActivity);
        } else {
            v9r.a("onCreateView");
            this.f21833a.c1(fragmentActivity, (ViewGroup) view.findViewById(this.c));
            v9r.g();
            v9r.a("buildPage");
            this.f21833a.m2();
            v9r.g();
            v9r.a("previewMainPage");
            this.f21833a.f0();
            v9r.g();
            v9r.a("lazyInit");
            this.f21833a.lazyInit();
            v9r.g();
        }
    }

    @Override // tb.sy
    public void i(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92798b", new Object[]{this, fragmentActivity});
            return;
        }
        super.i(fragmentActivity);
        this.f21833a.F(fragmentActivity);
        if (this.g != null) {
            TBAutoSizeConfig.x().h0(this.g);
        }
    }

    @Override // tb.sy
    public void j(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4569c7", new Object[]{this, fragmentActivity});
            return;
        }
        super.j(fragmentActivity);
        this.f21833a.V(fragmentActivity);
    }

    @Override // tb.sy
    public void k(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd2c1dc", new Object[]{this, fragmentActivity});
            return;
        }
        super.k(fragmentActivity);
        this.f21833a.t2(fragmentActivity);
    }

    @Override // tb.sy
    public void l(FragmentActivity fragmentActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6e001a", new Object[]{this, fragmentActivity, new Boolean(z)});
        } else {
            this.f21833a.Y2(z);
        }
    }

    @Override // tb.sy
    public void m(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6803ec", new Object[]{this, fragmentActivity});
            return;
        }
        v9r.a("setContentView");
        if (AliBuyPerfSwitcher.enablePreloadView()) {
            fragmentActivity.setContentView(ef1.i(fragmentActivity, this.b), new ViewGroup.LayoutParams(-1, -1));
        } else {
            fragmentActivity.setContentView(this.b);
        }
        v9r.g();
        new b(this, this.e).m();
        v9r.a("initTheme");
        r(fragmentActivity);
        v9r.g();
        v9r.a("festivalTheme");
        this.f21833a.P0(fragmentActivity);
        v9r.g();
        v9r.a("initEvent");
        o(fragmentActivity);
        v9r.g();
    }

    public final void o(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61fc383", new Object[]{this, activity});
            return;
        }
        View findViewById = activity.findViewById(R.id.btn_back);
        if (findViewById == null) {
            ck.g().f("找不到id为R.id.btn_back的View", ck.b.b().l("TBBuyFullScreenPageRender").a());
        } else {
            ViewProxy.setOnClickListener(findViewById, new c(this, activity));
        }
    }

    public final void p(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24c03c64", new Object[]{this, activity});
            return;
        }
        SystemBarDecorator systemBarDecorator = new SystemBarDecorator(activity);
        if (x14.c(x69.a(activity))) {
            systemBarDecorator.enableImmersiveStatusBar(true);
        } else {
            systemBarDecorator.enableImmersiveStatusBar();
        }
    }

    public final void q(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe40713c", new Object[]{this, fragmentActivity});
            return;
        }
        this.g = new a();
        TBAutoSizeConfig.x().d0(this.g);
    }

    public final void r(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c359a7", new Object[]{this, activity});
            return;
        }
        if (!this.d && this.e != null && this.f) {
            activity.overridePendingTransition(R.anim.purchase_slide_in_from_right_anim, R.anim.purchase_slide_out_to_right_anim);
        }
        p(activity);
    }

    public j8r(nud nudVar, int i, int i2, boolean z) {
        this.f = false;
        this.f21833a = nudVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // tb.sy
    public void g(FragmentActivity fragmentActivity, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61af7535", new Object[]{this, fragmentActivity, str});
            return;
        }
        super.g(fragmentActivity, str);
        this.e = fragmentActivity;
        if (!AliBuyPerfSwitcher.enableInteractionPerf() || a8r.b(fragmentActivity)) {
            z = false;
        }
        this.f = z;
        if (a8r.b(fragmentActivity)) {
            ck.g().d("当前进入大屏模式");
            q(fragmentActivity);
        }
    }
}
