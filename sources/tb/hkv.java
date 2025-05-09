package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hkv implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_sku";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f20714a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261971);
        t2o.a(912261826);
    }

    public hkv(Context context, ze7 ze7Var, a aVar) {
        this.f20714a = ze7Var;
        this.b = aVar;
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
        String string = a2.getString(q2q.KEY_SKU_ID);
        String string2 = a2.getString("pvPath");
        if (!TextUtils.isEmpty(string)) {
            this.f20714a.i().f("lastPageSetSkuId", string);
            ((TTDetailPageManager.g) this.b).a(string);
        } else if (!TextUtils.isEmpty(string2)) {
            this.f20714a.i().f("propPath", r3q.o((String) this.f20714a.i().c("propPath"), string2));
        }
        return true;
    }
}
