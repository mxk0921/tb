package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import java.io.File;
import java.util.List;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class l8r extends sy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nud f23178a;
    public String b = TBBuyPageMode.halfPageMode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements vcb<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f23179a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Intent c;

        public a(l8r l8rVar, int i, int i2, Intent intent) {
            this.f23179a = i;
            this.b = i2;
            this.c = intent;
        }

        /* renamed from: b */
        public void a(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b09668a", new Object[]{this, fragment});
            } else {
                fragment.onActivityResult(this.f23179a, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements vcb<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f23180a;

        public b(l8r l8rVar, JSONObject jSONObject) {
            this.f23180a = jSONObject;
        }

        /* renamed from: b */
        public void a(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b09668a", new Object[]{this, fragment});
            } else if (fragment instanceof jud) {
                ((jud) fragment).g(this.f23180a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements vcb<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f23181a;

        public c(l8r l8rVar, boolean z) {
            this.f23181a = z;
        }

        /* renamed from: b */
        public void a(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b09668a", new Object[]{this, fragment});
            } else if (fragment instanceof lud) {
                ((lud) fragment).Y2(this.f23181a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements vcb<Fragment> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f23182a;

        public d(l8r l8rVar, FragmentActivity fragmentActivity) {
            this.f23182a = fragmentActivity;
        }

        /* renamed from: b */
        public void a(Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b09668a", new Object[]{this, fragment});
            } else if ((fragment instanceof kud) && !((kud) fragment).onBackPressed()) {
                hh.d(this.f23182a);
            }
        }
    }

    static {
        t2o.a(708837547);
    }

    public l8r(nud nudVar) {
        this.f23178a = nudVar;
    }

    public static /* synthetic */ Object ipc$super(l8r l8rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -395755316) {
            super.f((FragmentActivity) objArr[0]);
            return null;
        } else if (hashCode == -275613301) {
            super.i((FragmentActivity) objArr[0]);
            return null;
        } else if (hashCode == 1638888757) {
            super.g((FragmentActivity) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/purchase/aura/render/impl/TBBuyHalfScreenPageRender");
        }
    }

    @Override // tb.sy
    public void a(FragmentActivity fragmentActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d8c5cd", new Object[]{this, fragmentActivity, jSONObject});
        } else {
            o(fragmentActivity, new b(this, jSONObject));
        }
    }

    @Override // tb.sy
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a6fdb1", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.sy
    public String c(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9488687b", new Object[]{this, fragmentActivity});
        }
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        if (fragments == null) {
            return "native";
        }
        for (Fragment fragment : fragments) {
            if ((fragment instanceof lud) && "weex".equals(((lud) fragment).g1())) {
                return "weex";
            }
        }
        return "native";
    }

    @Override // tb.sy
    public void d(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
        } else {
            this.f23178a.q2(str, jSONObject);
        }
    }

    @Override // tb.sy
    public void e(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40acbc98", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
        } else {
            o(fragmentActivity, new a(this, i, i2, intent));
        }
    }

    @Override // tb.sy
    public void f(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86940cc", new Object[]{this, fragmentActivity});
            return;
        }
        super.f(fragmentActivity);
        if (!al.n("purchase", "onBack")) {
            o(fragmentActivity, new d(this, fragmentActivity));
        }
    }

    @Override // tb.sy
    public void g(FragmentActivity fragmentActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61af7535", new Object[]{this, fragmentActivity, str});
            return;
        }
        super.g(fragmentActivity, str);
        if (str != null) {
            this.b = str;
        }
        n(fragmentActivity);
        if (th.c() && new File("/data/local/tmp/.forceNativeRender").exists()) {
            fragmentActivity.getIntent().putExtra("needNativeContainer", "true");
        }
    }

    @Override // tb.sy
    public void h(FragmentActivity fragmentActivity, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c6ce2", new Object[]{this, fragmentActivity, view});
        } else if (view == null) {
            ck.g().f("contentView为空了", ck.b.b().l("TBBuyHalfScreenPageRender").a());
            hh.d(fragmentActivity);
        } else {
            u7r.b().d(fragmentActivity, this.f23178a.getPopConfig(), this.f23178a.getBizId());
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
        fragmentActivity.overridePendingTransition(0, 0);
        this.f23178a.F(fragmentActivity);
    }

    @Override // tb.sy
    public void l(FragmentActivity fragmentActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e6e001a", new Object[]{this, fragmentActivity, new Boolean(z)});
        } else {
            o(fragmentActivity, new c(this, z));
        }
    }

    @Override // tb.sy
    public void m(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6803ec", new Object[]{this, fragmentActivity});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(fragmentActivity);
        frameLayout.setBackgroundColor(0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        fragmentActivity.setContentView(frameLayout);
    }

    public final void n(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f53dc3", new Object[]{this, activity});
            return;
        }
        activity.overridePendingTransition(0, 0);
        Window window = activity.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
            window.getDecorView().setBackgroundResource(17170445);
            window.clearFlags(2);
            window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        ((ViewGroup) activity.findViewById(16908290)).setBackgroundColor(0);
    }

    public final void o(FragmentActivity fragmentActivity, vcb<Fragment> vcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2f9266", new Object[]{this, fragmentActivity, vcbVar});
            return;
        }
        List<Fragment> fragments = fragmentActivity.getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                vcbVar.a(fragment);
            }
        }
    }
}
