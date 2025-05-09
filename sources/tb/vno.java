package tb;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;
import com.taobao.detail.rate.vivid.presenter.PreRequestPresenter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vno extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ANIM_TIME = n9l.INSTANCE.x();
    public static final String CALLBACK_FAILURE = "failure";
    public static final String CALLBACK_SUCCESS = "success";
    public static final long SRKPREREQUEST = 8528389213370060301L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements PreRequestPresenter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RateFeedsFragment f30130a;
        public final /* synthetic */ u8 b;

        public a(RateFeedsFragment rateFeedsFragment, u8 u8Var) {
            this.f30130a = rateFeedsFragment;
            this.b = u8Var;
        }

        @Override // com.taobao.detail.rate.vivid.presenter.PreRequestPresenter.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                vno.j(vno.this, this.f30130a, this.b, "failure", new f8(new JSONObject()));
            }
        }

        @Override // com.taobao.detail.rate.vivid.presenter.PreRequestPresenter.a
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                vno.j(vno.this, this.f30130a, this.b, "success", new f8(vno.i(vno.this, jSONObject)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public vno build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vno) ipChange.ipc$dispatch("38ca5656", new Object[]{this, obj});
            }
            return new vno();
        }
    }

    public static /* synthetic */ JSONObject i(vno vnoVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5ff479d2", new Object[]{vnoVar, jSONObject});
        }
        return vnoVar.k(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(vno vnoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/SRKPreRequestAbility");
    }

    public static /* synthetic */ void j(vno vnoVar, RateFeedsFragment rateFeedsFragment, u8 u8Var, String str, c8 c8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c136db1", new Object[]{vnoVar, rateFeedsFragment, u8Var, str, c8Var});
        } else {
            vnoVar.l(rateFeedsFragment, u8Var, str, c8Var);
        }
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        RateFeedsFragment d;
        PreRequestPresenter K2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (!(k8Var.d() instanceof FragmentActivity) || (d = i6v.INSTANCE.d((FragmentActivity) k8Var.d(), k8Var.a())) == null || (K2 = d.K2()) == null) {
            u8Var.callback("failure", new f8(new JSONObject()));
            return new f8();
        }
        if (!K2.k()) {
            K2.q(new a(d, u8Var));
        } else if (K2.j() != null) {
            l(d, u8Var, "success", new f8(k(K2.j())));
        } else {
            l(d, u8Var, "failure", new f8(new JSONObject()));
        }
        return new f8();
    }

    public final JSONObject k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b966522", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", (Object) jSONObject);
        return jSONObject2;
    }

    public final void l(RateFeedsFragment rateFeedsFragment, u8 u8Var, String str, c8 c8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad57bbb", new Object[]{this, rateFeedsFragment, u8Var, str, c8Var});
        } else {
            u8Var.callback(str, c8Var);
        }
    }
}
