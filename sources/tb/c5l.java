package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c5l extends n4l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public final ze7 c;
    public long d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements RateFeedsFragment.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ dhn f16875a;

        public a(dhn dhnVar) {
            this.f16875a = dhnVar;
        }

        @Override // com.taobao.detail.rate.RateFeedsFragment.b
        public void onDismiss() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            } else {
                q84.f(c5l.c(c5l.this), jw3.a());
            }
        }

        @Override // com.taobao.detail.rate.RateFeedsFragment.b
        public void onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
                return;
            }
            tgh.b("OpenTaobaoRateImplementor", "openRate invokeOnShow: " + (System.currentTimeMillis() - c5l.b(c5l.this)));
            q84.f(c5l.c(c5l.this), o4l.a(this.f16875a.m(), this.f16875a.h()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b extends mlq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -490060912) {
                super.b((JSONObject) objArr[0]);
                return null;
            } else if (hashCode == -370124907) {
                super.a((JSONObject) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/alittdetail/rate/OpenTaobaoRateImplementor$2");
            }
        }

        @Override // tb.mlq, tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            } else {
                super.a(jSONObject);
            }
        }

        @Override // tb.mlq, tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
                return;
            }
            super.b(jSONObject);
            q84.f(c5l.c(c5l.this), bw3.a());
        }
    }

    static {
        t2o.a(354418763);
    }

    public c5l(Context context, ze7 ze7Var) {
        super(context, ze7Var);
        this.b = context;
        this.c = ze7Var;
    }

    public static /* synthetic */ long b(c5l c5lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d369f430", new Object[]{c5lVar})).longValue();
        }
        return c5lVar.d;
    }

    public static /* synthetic */ Context c(c5l c5lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("a637aab5", new Object[]{c5lVar});
        }
        return c5lVar.b;
    }

    public static /* synthetic */ Object ipc$super(c5l c5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/rate/OpenTaobaoRateImplementor");
    }

    public final boolean d(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d264726", new Object[]{this, runtimeAbilityParamArr})).booleanValue();
        }
        JSONObject f = ein.f(runtimeAbilityParamArr);
        if (f != null && f.getBooleanValue("enableDataModelOpt") && vbl.c0()) {
            return true;
        }
        return false;
    }

    public final void f(FragmentActivity fragmentActivity, Fragment fragment, JSONObject jSONObject, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a0e0ff", new Object[]{this, fragmentActivity, fragment, jSONObject, new Integer(i)});
            return;
        }
        float floatValue = (jSONObject == null || jSONObject.isEmpty() || jSONObject.getFloatValue("maxHeight") == 0.0f) ? 0.8f : jSONObject.getFloatValue("maxHeight");
        if (jSONObject == null || jSONObject.isEmpty() || TextUtils.isEmpty(jSONObject.getString("title"))) {
            str = "评价";
        } else {
            str = jSONObject.getString("title");
        }
        plq plqVar = new plq();
        plqVar.q(floatValue);
        plqVar.t(str);
        plqVar.r(false);
        plqVar.n(n4l.DETAIL_COMMENT_FRAGMENT_TAG);
        plqVar.m(i);
        View findViewById = fragmentActivity.findViewById(R.id.ll_tt_detail_bottom_bar);
        if (findViewById != null) {
            plqVar.p(new zfm(0.0f, 0.0f, 0.0f, mr7.j(findViewById.getHeight())));
        }
        zao u = plqVar.u(fragmentActivity, fragment, new b());
        tgh.b("OpenTaobaoRateImplementor", "showRatePopFragment result isSuccess=" + u.f32653a + ", errorCode=" + u.b + ", errorMsg=" + u.c);
    }

    @Override // tb.n4l, tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        dhn dhnVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        this.d = System.currentTimeMillis();
        if (this.c.e().o()) {
            Toast.makeText(this.b, "信息加载中,客官请稍等...", 0).show();
            return true;
        } else if (!(this.b instanceof FragmentActivity)) {
            tgh.b("OpenTaobaoRateImplementor", "showRateFeedsFragment failed because the page is not FragmentActivity");
            return false;
        } else {
            boolean d = d(runtimeAbilityParamArr);
            String str = "default";
            JSONObject jSONObject = null;
            if (d) {
                dhnVar = new dhn();
                dhnVar.r(this.d);
                if (!(irVar == null || irVar.a() == null)) {
                    jSONObject = irVar.a().getJSONObject("exParams");
                }
                if (ein.b(jSONObject)) {
                    str = "pop";
                }
                dhnVar.u(str);
                jSONObject = ein.r(this.c, dhnVar, irVar, runtimeAbilityParamArr);
            } else {
                dhnVar = ein.s(irVar, false, this.d, runtimeAbilityParamArr);
                if (ein.b(dhnVar.e())) {
                    str = "pop";
                }
                dhnVar.u(str);
            }
            e(dhnVar, d, jSONObject);
            return true;
        }
    }

    public final boolean e(dhn dhnVar, boolean z, JSONObject jSONObject) {
        egn egnVar;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d1ca339", new Object[]{this, dhnVar, new Boolean(z), jSONObject})).booleanValue();
        }
        if (!nj7.i(this.b)) {
            FragmentActivity fragmentActivity = (FragmentActivity) this.b;
            if (z) {
                egnVar = ein.n(jSONObject);
            } else {
                egnVar = ein.o(this.c, dhnVar);
            }
            Context context = this.b;
            if (context instanceof ihn) {
                ihn ihnVar = (ihn) context;
                if (ihnVar.X1()) {
                    egnVar.f(ihnVar.i2().get(0));
                }
            }
            int b2 = egnVar.b();
            if (!z || jSONObject == null) {
                jSONObject2 = dhnVar.e();
            } else {
                jSONObject2 = jSONObject.getJSONObject("exParams");
            }
            if (ein.b(jSONObject2)) {
                f(fragmentActivity, egnVar.a(), jSONObject2, b2);
                return true;
            }
            egnVar.g(new a(dhnVar));
            Fragment a2 = egnVar.a();
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.setCustomAnimations(R.anim.tt_detail_activity_open_enter, 0, 0, R.anim.tt_detail_activity_close_exit);
            beginTransaction.add(R.id.fl_tt_detail_fragment_container, a2, n4l.DETAIL_COMMENT_FRAGMENT_TAG);
            beginTransaction.addToBackStack(null);
            beginTransaction.commitAllowingStateLoss();
            try {
                supportFragmentManager.executePendingTransactions();
                tgh.b("OpenTaobaoRateImplementor", "openRate CodeTime: " + (System.currentTimeMillis() - this.d));
            } catch (Exception e) {
                tgh.c("OpenTaobaoRateImplementor", "showRateFeedsFragment executePendingTransactions exception", e);
            }
            return true;
        } else if (z) {
            return ein.t(this.b, jSONObject);
        } else {
            return ein.u(this.b, this.c, dhnVar);
        }
    }
}
