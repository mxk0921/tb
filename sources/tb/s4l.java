package tb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment;
import java.util.List;
import tb.dt4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openShopPromotion";

    /* renamed from: a  reason: collision with root package name */
    public final FragmentActivity f27792a;
    public final ze7 b;
    public List<Resource.h> c = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements dt4.a<Resource.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(s4l s4lVar) {
        }

        /* renamed from: b */
        public Resource.h a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Resource.h) ipChange.ipc$dispatch("e8328378", new Object[]{this, obj});
            }
            return new Resource.h((JSONObject) obj);
        }
    }

    static {
        t2o.a(912261909);
        t2o.a(912261826);
    }

    public s4l(Context context, ze7 ze7Var) {
        if (context instanceof FragmentActivity) {
            this.f27792a = (FragmentActivity) context;
        }
        this.b = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        if (a2.containsKey("open_sale_promotion")) {
            this.c = dt4.a(a2.getJSONArray("open_sale_promotion"), new a(this));
        }
        ze7 ze7Var = this.b;
        if (ze7Var == null) {
            return false;
        }
        ShopPromotionFragment.Q2(this.f27792a, "店铺优惠", this.c, ze7Var);
        return true;
    }
}
