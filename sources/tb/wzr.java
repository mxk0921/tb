package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import com.taobao.android.waitpay.TBWaitPayPresenter;
import com.taobao.android.waitpay.render.fragment.TBWaitPayHalfScreenFragment;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wzr implements nud {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static wzr b;

    /* renamed from: a  reason: collision with root package name */
    public TBWaitPayPresenter f31045a;

    static {
        t2o.a(725614637);
        t2o.a(708837528);
    }

    public static wzr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wzr) ipChange.ipc$dispatch("68335b2d", new Object[0]);
        }
        if (b == null) {
            synchronized (wzr.class) {
                try {
                    if (b == null) {
                        b = new wzr();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Override // tb.nud
    public void F(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef92798b", new Object[]{this, fragmentActivity});
            return;
        }
        TBWaitPayPresenter tBWaitPayPresenter = this.f31045a;
        if (tBWaitPayPresenter != null) {
            tBWaitPayPresenter.m();
        }
        this.f31045a = null;
    }

    @Override // tb.nud
    public void N1(FragmentActivity fragmentActivity, int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40acbc98", new Object[]{this, fragmentActivity, new Integer(i), new Integer(i2), intent});
            return;
        }
        TBWaitPayPresenter tBWaitPayPresenter = this.f31045a;
        if (tBWaitPayPresenter != null) {
            tBWaitPayPresenter.l(i, i2, intent);
        }
    }

    @Override // tb.nud
    public void P0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869d49c8", new Object[]{this, activity});
        } else {
            x69.c(activity, R.id.tb_wait_pay_actionbar, -1);
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
            return;
        }
        TBWaitPayPresenter tBWaitPayPresenter = this.f31045a;
        if (tBWaitPayPresenter != null) {
            if (z) {
                tBWaitPayPresenter.n();
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("delta", (Object) new JSONArray());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("hierarchy", (Object) jSONObject);
            jSONObject2.put("data", (Object) new JSONObject());
            this.f31045a.g(jSONObject2);
        }
    }

    @Override // tb.nud
    public void c1(FragmentActivity fragmentActivity, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd1022f", new Object[]{this, fragmentActivity, viewGroup});
        } else if (fragmentActivity instanceof mud) {
            this.f31045a = new TBWaitPayPresenter(fragmentActivity, viewGroup);
        } else {
            throw new IllegalStateException("Activity必须实现接口：".concat(mud.class.getName()));
        }
    }

    @Override // tb.nud
    public void f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc97457", new Object[]{this});
        }
    }

    @Override // tb.jud
    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe7b3616", new Object[]{this, jSONObject});
            return;
        }
        TBWaitPayPresenter tBWaitPayPresenter = this.f31045a;
        if (tBWaitPayPresenter != null) {
            tBWaitPayPresenter.g(jSONObject);
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
        return "Page_WaitpayDetail";
    }

    @Override // tb.nud
    public AbilityParams getPopConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityParams) ipChange.ipc$dispatch("78489087", new Object[]{this});
        }
        AbilityParams abilityParams = new AbilityParams();
        AbilityParams.a aVar = new AbilityParams.a();
        aVar.fragmentClass = TBWaitPayHalfScreenFragment.class.getName();
        aVar.droidFragmentTag = "fragment_wait_pay_container";
        abilityParams.extConfig = aVar;
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.droidFullScreen = "true";
        bVar.droidShouldHandleBack = "false";
        bVar.animation = nbf.STDPOP_ANIMATION_BOTTOM;
        bVar.panEnable = "false";
        bVar.contentBackColor = "#00000000";
        bVar.maxHeight = 0.75f;
        abilityParams.popConfig = bVar;
        return abilityParams;
    }

    @Override // tb.nud
    public void lazyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
        }
    }

    @Override // tb.nud
    public void m2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dfe424", new Object[]{this});
            return;
        }
        TBWaitPayPresenter tBWaitPayPresenter = this.f31045a;
        if (tBWaitPayPresenter != null) {
            tBWaitPayPresenter.c();
        }
    }

    @Override // tb.lud
    public void q2(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76d933d", new Object[]{this, str, jSONObject});
            return;
        }
        TBWaitPayPresenter tBWaitPayPresenter = this.f31045a;
        if (tBWaitPayPresenter != null) {
            tBWaitPayPresenter.k(str, jSONObject);
        }
    }

    @Override // tb.nud
    public void t2(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd2c1dc", new Object[]{this, fragmentActivity});
        }
    }
}
