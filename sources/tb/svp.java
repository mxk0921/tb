package tb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.RateFeedsFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class svp extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long SHOWRATESKUPOP = -5031338029650904963L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements w8<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public svp build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (svp) ipChange.ipc$dispatch("25d25075", new Object[]{this, obj});
            }
            return new svp();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
        void a(Object obj);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class d implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u8 f28303a;

        public d(n8 n8Var, tk6 tk6Var, u8 u8Var) {
            this.f28303a = u8Var;
        }

        @Override // tb.svp.c
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("471ebe1e", new Object[]{this, obj});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "selectSku", (String) obj);
            if (obj instanceof JSONObject) {
                String string = ((JSONObject) obj).getString("name");
                jSONObject.put((JSONObject) "selectSkuName", string != null ? tsq.E(string, "#", ";", false, 4, null) : null);
            }
            this.f28303a.callback("onSubmit", new f8(jSONObject));
        }
    }

    public static /* synthetic */ Object ipc$super(svp svpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/detail/rate/vivid/ability/ShowRateSKUPopAbility");
    }

    /* renamed from: i */
    public f8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8) ipChange.ipc$dispatch("8128a597", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        ckf.g(n8Var, "jsonData");
        ckf.g(tk6Var, "akAbilityRuntimeContext");
        ckf.g(u8Var, "akiAbilityCallback");
        Context d2 = tk6Var.d();
        if (!(d2 instanceof FragmentActivity)) {
            d2 = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) d2;
        if (fragmentActivity != null) {
            JSONObject g = n8Var.g("selectSku");
            JSONArray f = n8Var.f("defaultSkuData");
            JSONArray jSONArray = n8Var.g("skuFilterData").getJSONArray("skuInfo");
            JSONObject g2 = n8Var.g("itemInfo");
            RateFeedsFragment d3 = i6v.INSTANCE.d(fragmentActivity, tk6Var.a());
            if (d3 == null) {
                return null;
            }
            new phn().k(d3, jSONArray, g, f, g2, new d(n8Var, tk6Var, u8Var));
        }
        return new f8();
    }
}
