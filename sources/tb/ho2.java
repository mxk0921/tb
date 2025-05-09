package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TBSkuWrapper;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ho2 implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "buyNow_touchdown";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f20776a;
    public final TBSkuWrapper b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ctd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ir f20777a;

        public a(ir irVar) {
            this.f20777a = irVar;
        }

        @Override // tb.ctd
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("BuyNowTouchDownImplementor", "streamDataListener onFailure retCode=" + str + ", retMsg=" + str2);
        }

        @Override // tb.ctd
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
            } else {
                ho2.b(ho2.this, this.f20777a, jSONObject);
            }
        }
    }

    static {
        t2o.a(912261850);
        t2o.a(912261826);
    }

    public ho2(Context context, ze7 ze7Var, TBSkuWrapper tBSkuWrapper) {
        this.f20776a = ze7Var;
        this.b = tBSkuWrapper;
    }

    public static /* synthetic */ void b(ho2 ho2Var, ir irVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2b6f89", new Object[]{ho2Var, irVar, jSONObject});
        } else {
            ho2Var.c(irVar, jSONObject);
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        if (!hjh.c()) {
            return true;
        }
        this.f20776a.e().i(new a(irVar));
        return true;
    }

    public final void c(ir irVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1f02803", new Object[]{this, irVar, jSONObject});
        } else if (jSONObject != null) {
            this.b.K(jSONObject);
            this.b.C();
            tgh.b("BuyNowTouchDownImplementor", "TouchDown preShowSku");
            this.b.G("BUYNOW");
        }
    }
}
