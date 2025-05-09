package tb;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class hzy implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "batchBuyNow";

    /* renamed from: a  reason: collision with root package name */
    public final Context f20997a;

    static {
        t2o.a(912261848);
        t2o.a(912261826);
    }

    public hzy(Context context, ze7 ze7Var) {
        this.f20997a = context;
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
        JSONObject a2 = irVar.a();
        if (a2 == null) {
            Toast.makeText(this.f20997a, "小二很忙，系统很累，请稍后重试!p", 0).show();
            return false;
        }
        String string = a2.getString("url");
        if (TextUtils.isEmpty(string)) {
            string = toj.NAV_URL_PURCHASE;
        }
        String b = jov.b(string, a2.getJSONObject("params"), true);
        tgh.b("BatchBuyNowImplementor", "batchBuyNow targetUrl: " + b);
        jov.k(this.f20997a, b);
        return true;
    }
}
